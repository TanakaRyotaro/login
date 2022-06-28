package quiz;

import bean.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/quiz/attribute"})
public class Attribute extends HttpServlet {
    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {

        User u = new User();
        u.setUserid(1);
        u.setName("佐藤　歩");

        request.setAttribute("user", u);//ﾘｸｴｽﾄ属性にBeanを設定
                                           //属性名は、｢Product｣

        request.getRequestDispatcher("attribute.jsp")//ﾌｫﾜｰﾄﾞする
            .forward(request,response);
    }
} 