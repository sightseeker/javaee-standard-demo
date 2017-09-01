package com.sightseekerstudio.javaee.standard.demo.book;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Kohei.Saito
 */
@Path("book")
@RequestScoped
public class BookResource {

    @Inject
    private BookRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

    @POST
    public void postBook(Book book) {
        repository.registerBook(book);
    }
}
