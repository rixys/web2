package controller;

import db.PaardDB;
import model.Paard;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    PaardDB huidig = new PaardDB();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String ruiter = request.getParameter("ruiter");
        String leeftijd = request.getParameter("leeftijd");
        int intLeeftijd = Integer.parseInt(leeftijd);
        Paard newpaard = new model.Paard(intLeeftijd,naam, ruiter);
        huidig.addPaard(newpaard);
        request.setAttribute("db", huidig);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(huidig.getPaarden());
        PaardDB huidig = new PaardDB();
        request.setAttribute("db", huidig);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }
}
