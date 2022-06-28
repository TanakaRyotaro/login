package quiz;

import bean.User;
import dao.UserDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/quiz/insert"})
public class Insert extends HttpServlet {
    public void doPost (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Page.header(out);
        try {
            String name=request.getParameter("name");
            String password=request.getParameter("password");

            User u=new User();
            u.setName(name);
            u.setPassword(password);
//ﾃﾞｰﾀﾍﾞｰｽに追加するﾃﾞｰﾀを保持するUserｵﾌﾞｼﾞｪｸﾄを作成｡ﾘｸｴｽﾄﾊﾟﾗﾒｰﾀから取得した名前とﾊﾟｽﾜｰﾄﾞをｾｯﾀを使って書き込む｡

            UserDAO dao=new UserDAO();
            int line=dao.insert(u);
//ﾃﾞｰﾀﾍﾞｰｽへの追加を実行｡UserDAOのｵﾌﾞｼﾞｪｸﾄを生成後､Userｵﾌﾞｼﾞｪｸﾄを引数にしてinsertﾒｿｯﾄﾞを実行
           
            if (line>0) {
                out.println("ユーザー登録に成功しました。");
            } 
        } catch (Exception e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
}