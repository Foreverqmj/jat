package com.gzu;

import java.io.IOException;

    public class MyServlet extends HttpServlet {
        @Override
        public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.getWriter().write("Hello world!");
        }
    }
