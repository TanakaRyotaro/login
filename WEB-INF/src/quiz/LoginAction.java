package quiz;

import bean.User;
import dao.QuizDAO;
import tool.Action;
import javax.servlet.http.*;

public class LoginAction extends Action {
    public String execute(
        HttpServletRequest request,HttpServletResponse response
    ) throws Exception {

        HttpSession session=request.getSession();

        String name=request.getParameter("name");
        String password=request.getParameter("password");
        QuizDAO dao=new QuizDAO();
        User user=dao.search(name, password);

        if (user!=null) {
            session.setAttribute("user",user);
            return "login-out.jsp";
        }

        return "login-error.jsp";
    }
}