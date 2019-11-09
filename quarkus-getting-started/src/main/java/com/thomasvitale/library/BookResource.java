package com.thomasvitale.library;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    @Inject
    BookService bookService;

    @GET
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GET
    @Path("{id}")
    public Book getBookById(@PathParam("id") Long id) {
        return bookService.getBookById(id);
    }
}