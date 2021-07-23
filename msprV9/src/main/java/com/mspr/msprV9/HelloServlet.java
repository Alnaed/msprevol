package com.mspr.msprV9;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.ws.rs.*;
import java.sql.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");


    }

    public void destroy() {
    }

    @Path("/database")
    @GET
    public String returnDatabaseStatus() throws Exception {

        PreparedStatement query = null;
        String[] myResult =new String[4];
        String returnString = null;
        Connection conn = null;

        try {

            conn = DataBase.DbConn().getConnection();

            query = conn.prepareStatement("Select *");
            ResultSet rs = query.executeQuery();
            myResult[1] = rs.getString("id");
            returnString = myResult[1] + myResult[1] + myResult[1] + myResult[1] ;
            query.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return returnString;
    }


}