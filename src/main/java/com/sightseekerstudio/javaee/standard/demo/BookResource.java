/*
 * (C) Sony Network Communications Inc. All Rights reserved.
 */
package com.sightseekerstudio.javaee.standard.demo;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author Kohei.Saito
 */
@Path("book")
public class BookResource {

    @Inject
    private BookRepository repository;

    @GET
    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }
}
