package com.uca.capas.servelts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnotacionServlet
 */
@WebServlet("/AnotacionServlet")
public class AnotacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AnotacionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		String user = "Dalcoleas";
		String pass = "alcoleas";
		
		String userParam = request.getParameter("usuario");
		String passParam = request.getParameter("clave");
		
		if(user.equals(userParam) && pass.equals(passParam)) { //user == userParam && pass == passParam
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style=\"color:blue;\"> Usuario Autorizado </h3>");
			//out.println(user + " + " + userParam);
			//out.println(pass + " + " + passParam);
			out.println("</body>");
			out.println("</html>");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<body");
			out.println("<h3 style=\"color:red;\"> Usuario NO Autorizado </h3>");
			//out.println(user + " + " + userParam);
			//out.println(pass + " + " + passParam);
			out.println("</body>");
			out.println("</html>");
		}
	}

}
