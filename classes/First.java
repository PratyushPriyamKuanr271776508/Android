import java.io.*;
import javax.servlet.*;
public class First implements Servlet
{
public First()
{
System.out.println("servlet object created");
}
public void init(ServletConfig sc) throws ServletException
{
System.out.println("servlet object initiallised");
}
public void destroy()
{
System.out.println("servlet object flushed");
}
public String getServletInfo()
{
return "Java Technocrat";
}
public ServletConfig getServletConfig()
{
return this.getServletConfig();
}

        public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
                {
                res.setContentType("text/html");
                PrintWriter out=res.getWriter();
                out.println("<html><body bgcolor='cyan'><font color='red' size='5'><center>");
                String name=req.getParameter("t1");
                out.println("<b>Welcome Mr."+name+" to our site.</b>");
                out.println("</center></font></body></html>");
                }
        }

