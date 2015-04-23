package com.nchapa.bits2learn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

/**
 * Hello world!
 *
 */
public class App extends HttpServlet
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        
        showHome(req, resp);
        
    }
    
    private void showHome(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        
        resp.getWriter().print("Hello World!");
    }
}
