package com.jacaranda.Serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jacaranda.Control.CRUDSession;

/**
 * Servlet implementation class ServletRegister
 */
@WebServlet("/ServletRegister")
public class ServletRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegister() {
        super();
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
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		CRUDSession crs = new CRUDSession();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password_con = request.getParameter("password_con");
		LocalDate fechaNacimiento = LocalDate.parse(request.getParameter("fechaNacimiento"));
		String gender = request.getParameter("gender");
		
		if(username != null && (password != null && password_con != null
				&& password.equals(password_con)) && fechaNacimiento != null
				&& gender != null){
			
		}else {
			response.sendRedirect("Error.html");
		}
		
	}

}