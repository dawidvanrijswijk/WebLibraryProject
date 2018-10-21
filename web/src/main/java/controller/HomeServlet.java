package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<BookDto> books = bookService.findAll();

        return books.stream()
                .map(b -> {
                    String borrowerName = findCurrentBorrower(b);
                    Long borrowId = findCurrentBorrowId(b);
                    return new BookDto(b.getId(), b.getTitle(), b.getRelaseDate()
                });
    }
}
