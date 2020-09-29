package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor.
   */
  public UserServlet() {
    // TODO Auto-generated constructor stub
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");

    User u = new User(username, password, email);
    UserManager.add(u);

    PrintWriter out = response.getWriter();

    out.write("<table>");

    for (User user : UserManager.getUserList()) {
      out.write("<tr>");
      
      out.write("<td>");
      out.write(user.getUsername());
      out.write("</td>");

      out.write("<td>");
      out.write(user.getPassword());
      out.write("</td>");

      out.write("<td>");
      out.write(user.getEmail());
      out.write("</td>");

      out.write("</tr>");
    }
    out.write("</table>");
    
    out.write("<a href='user.html'>Add</a>");
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }

}
