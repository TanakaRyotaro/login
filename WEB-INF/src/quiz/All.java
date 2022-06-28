package quiz;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;

@WebServlet(urlPatterns={"/quiz/all"})
public class All extends HttpServlet {
    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Page.header(out);
        try {
            InitialContext ic=new InitialContext();
            //ｺﾝｽﾄﾗｸﾀを使ってInitialContextｵﾌﾞｼﾞｪｸﾄを取得する
            DataSource ds=(DataSource)ic.lookup(
                "java:/comp/env/jdbc/book");
            //ﾃﾞｰﾀﾍﾞｰｽへ接続するためのDataSourceｵﾌﾞｼﾞｪｸﾄを取得
            //lookupﾒｿｯﾄﾞの戻り値はObject型なのでDataSource型に変換
            Connection con=ds.getConnection();
            java.sql.PreparedStatement st=con.prepareStatement(
                "select * from user");
            //SQL文を実行するためのPreparedStatementｵﾌﾞｼﾞｪｸﾄを取得
            ResultSet rs=st.executeQuery();
            //作成したSQL文は、executeQueryﾒｿｯﾄﾞで実行
            //結果をResultSetｵﾌﾞｼﾞｪｸﾄとして取得
            while (rs.next()) {
                out.println(rs.getInt("userid"));
                out.println(":");
                out.println(rs.getString("name"));
                out.println(":");
                out.println(rs.getString("password"));
                out.println("<br>");
            }
            //ResuleSetｵﾌﾞｼﾞｪｸﾄから、While文で行を1つ1つ取り出して
            //列毎にﾃﾞｰﾀを取り出してﾚｽﾎﾟﾝｽに出力。ｶｰｿﾙ機能を使用。
            //ｶｰｿﾙ~現在処理中の行を特定する。nextﾒｿｯﾄﾞ~ｶｰｿﾙを移動
            st.close();//ﾃﾞｰﾀﾍﾞｰｽを切断。
            con.close();
        } catch (Exception e) {
            e.printStackTrace(out);
        } //例外処理が必要
        Page.footer(out);
    }
}