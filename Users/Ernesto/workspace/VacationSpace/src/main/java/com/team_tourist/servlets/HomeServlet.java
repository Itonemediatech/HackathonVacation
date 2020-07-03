package com.team_tourist.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/home")
public class HomeServlet extends HttpServlet {
	
	 protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		 
		 req.getRequestDispatcher("/WEB-INF/home.jsp").forward(req, res);
	
		 
	 }//doGet
	
	

}//HomeServlet
