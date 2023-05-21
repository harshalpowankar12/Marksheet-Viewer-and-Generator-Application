package evaluatorlogin;


import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet  extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			PrintWriter pWriter=res.getWriter();
			HttpSession httpSession=req.getSession(false);
			
			
			if(httpSession==null)
			{
				
				pWriter.print("<script>alert('Sorry Session Expired....!');</script>");
				RequestDispatcher rDispatcher=req.getRequestDispatcher("home.html");
				rDispatcher.include(req, res);
			}
			else {
				httpSession.removeAttribute("user");
				httpSession.invalidate();
				pWriter.print("<script>alert('Logout successfully...!');</script>");
				RequestDispatcher rDispatcher=req.getRequestDispatcher("home.html");
				rDispatcher.include(req, res);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

