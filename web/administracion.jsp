<%-- 
    Document   : administracion
    Created on : 26-dic-2016, 19:34:34
    Author     : JOAQ
--%>

<%@page import="pe.web.app.controllador.ControladorAtracciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css" media="all" />
        
        
        
    </head>
    <body>
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <h1>Panel de Atracciones</h1>
        <% ControladorAtracciones cp=new ControladorAtracciones(); %>
        <%=cp.getPanelView() %>
    </body>
</html>
