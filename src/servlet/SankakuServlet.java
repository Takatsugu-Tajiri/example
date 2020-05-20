package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Sankaku;

/**
 * Servlet implementation class SankakuServlet
 */
@WebServlet("/sankaku")
public class SankakuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SankakuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teihenStr=request.getParameter("teihen");
		String takasaStr=request.getParameter("takasa");
		int teihen =Integer.parseInt(teihenStr);
		int takasa =Integer.parseInt(takasaStr);

		Sankaku s= new Sankaku(teihen,takasa);

		request.setAttribute("sankaku", s);



		RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/jsp/sankaku.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
