package com.poly.lab7;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bai1")
public class Bai1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Thiết lập định dạng trả về là JSON và encoding UTF-8
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        // 2. Chuẩn bị chuỗi JSON theo đề bài
        // Lưu ý: Trong thực tế nên dùng thư viện Gson hoặc Jackson.
        // Ở đây thầy viết thủ công để em hiểu bản chất chuỗi JSON.
        String jsonResponse = "{"
                + "\"manv\": \"TeoNV\","
                + "\"hoTen\": \"Nguyễn Văn Tèo\","
                + "\"gioiTinh\": true,"
                + "\"luong\": 950.5"
                + "}";

        // 3. Gửi về client
        response.getWriter().print(jsonResponse);
    }
}