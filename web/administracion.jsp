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
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" media="all" />
        
    </head>
    <body>
        <h1>Panel de Atracciones</h1>
        <% ControladorAtracciones cp=new ControladorAtracciones(); %>
        <%=cp.getPanelView() %>
    </body>
</html>
