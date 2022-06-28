package dao;

import bean.Item2;
import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class InsertDAO extends DAO {
    public boolean insert (
        List<Item2> user, int userid, String name, String password
        )
        throws Exception {

        Connection con=getConnection();
        con.setAutoCommit(false);

        for (Item2 item2 : user) {
            PreparedStatement st;
            st=con.prepareStatement(
                "insert into user values(?,?,?);");
            User u=item2.getUser();
            st.setInt(1, u.getUserid());
            st.setString(2, u.getName());
            st.setString(3, u.getPassword());
            int line=st.executeUpdate();
            st.close();

            if(line!=1) {
                con.rollback();
                con.setAutoCommit(true);
                con.close();
                return false;
            }
        }
        con.commit();
        con.setAutoCommit(true);
        con.close();
        return true;
        }
}