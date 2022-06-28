package dao;//ﾃﾞｰﾀﾍﾞｰｽへの行の追加を行うinsertﾒｿｯﾄﾞを定義している

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO extends DAO {
    public int insert(User user) throws Exception {
        Connection con=getConnection();
//追加を行うinsertﾒｿｯﾄﾞ。引数に商品のBean(Productｵﾌﾞｼﾞｪｸﾄ)を指定。
//Beanに保存された情報を取得し、ﾃﾞｰﾀﾍﾞｰｽに1行を追加。戻り値はﾃﾞｰﾀﾍﾞｰｽ上で変更した行数
        PreparedStatement st=con.prepareStatement(
        "insert into user values(null, ?, ?)");
        
        st.setString(1, user.getName());
        st.setString(2, user.getPassword());
        int line=st.executeUpdate();

        st.close();
        con.close();
        return line;//戻り値
    }
}