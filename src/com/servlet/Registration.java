package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.User;
import com.util.HibernateUtil;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session sess=sf.openSession();
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		Transaction tx=sess.beginTransaction();
		try {
			User u=new User();	
			 boolean isAvailable[]= {true};
			  
			
			List<User> ulist=sess.createQuery("from User ").list();
			ulist.forEach(user->{
				if(user.getName().equalsIgnoreCase(name)) {
						isAvailable[0]=	false;
						
					
				}
				
			});
			
			
			System.out.println(u);
			
			
			if(isAvailable[0]) {
				u=new User(name,password);
				sess.save(u);
				tx.commit();
				
				request.getRequestDispatcher("Registration.jsp").include(request,response);
				out.println("<h4>Congratulations you have successfully registered.</h4>");
				System.out.println("User added");
				
			}else {
				
				request.getRequestDispatcher("Registration.jsp").include(request,response);
				out.println("<h4 style='color:red'>This username already exists</h4>");
				
			}
		}
			
			
			
		catch(Exception e){
			e.printStackTrace();
		}finally {
			sess.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
