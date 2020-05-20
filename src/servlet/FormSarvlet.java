package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSarvlet
 */
@WebServlet("/form")
public class FormSarvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSarvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String mail=request.getParameter("mail");
		String body=request.getParameter("body");
		String ken=request.getParameter("ken");
		String gamen=request.getParameter("gamen");

		String errorMsg="";
		if(name==null||name.length()==0) {
			errorMsg+="名前が入力されていません<br>";
		}
		if(gender==null||gender.length()==0) {
			errorMsg+="性別が選択されていません";
		}

		String mailMsg="";
		if(mail !=null) {
			mailMsg+="する";
		}

		else {
			mailMsg+="しない";
		}



		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>フォーム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>GETのフォーム</h1>");
		out.println("<p>"+errorMsg+"</p>");
		out.println("<p>"+name+"</p>");
		out.println("<p>"+gender+"</p>");
		out.println("<p>"+mailMsg+"</p>");
		out.println("<p>"+ken+"</p>");
		out.println("<p>"+gamen+"</p>");
		out.println("<pre>"+body+"</pre>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");



		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>フォーム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>POSTのフォーム</h1>");
		out.println("<p>"+name+"</p>");
		out.println("<p>"+gender+"</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
