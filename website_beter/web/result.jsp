<%@ page import="db.PaardDB" %>
<%@ page import="model.Paard" %><%--
  Created by IntelliJ IDEA.
  User: Robin
  Date: 3/03/2020
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%!
    PaardDB db = new PaardDB();

%>--%>
<html>
<head>
    <title>Overzicht</title>
</head>
<body>
<header>
    <nav>
        <ul>
            <li> <a href="index.html"> Home</a> </li>
            <li> <a href="paarden_toevoeging.html"> Paardenlijst</a> </li>
            <li> <a href="contact.html"> Contact</a> </li>
            <li> <a href="result.jsp"> result</a> </li>
        </ul>
    </nav>
    <h1>index</h1>
    <span>
        <img id="logo_img" src="images/logo.png" alt="logo">
    </span>
</header>
<main>
    <table>
        <thead>
            <tr>
                <th>naam</th>
                <th>ruiter</th>
                <th>leeftijd</th>
            </tr>
        </thead>
        <tbody>
            <%
                for (Paard paard : ((PaardDB) request.getAttribute("db")).getPaarden()) {
            %>
                <tr>
                    <td><%=paard.getNaam()%></td>
                    <td><%=paard.getNaamRuiter()%></td>
                    <td><%=paard.getLeeftijd()%></td>
                </tr>
            <%
                }
            %>
        </tbody>
    </table>
<%--<%!
    <p>"het oudste paard =<%= ((PaardDB) request.getAttribute("db")).getLargestLeeftijd()%></p>
%>--%>
</main>
<footer>
<address>
    <p>Robin Vanderborght <a href="mailto: robinvanderborght@hotmail.com"> robinvanderborght@hotmail.Com</a> </p>
    <p>Neerijsebaan2 nr2 Sint-Joris-Weert België</p>
</address>
<p>Zangersheide™</p>
</footer>
</body>
</html>
