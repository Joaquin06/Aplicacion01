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
        
        <title>Primera Muestra</title>     
    </head>
    <body>
        
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        
        <br>
        
        <section class="container">
            <div class="row">
                <div class="col-md-12"> 
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Panel de Atracciones</h3>
                        </div>

                            <div class="table-responsive">

                                <% ControladorAtracciones cp=new ControladorAtracciones(); %>
                                <%=cp.getPanelView() %>
                            </div>
                    </div>        
                </div>        
            </div>        
        </section>
        
    </body>
</html>
