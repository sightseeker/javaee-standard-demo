/*
 * (C) Sony Network Communications Inc. All Rights reserved.
 */
package com.sightseekerstudio.javaee.standard.demo;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author Kohei.Saito
 */
@ApplicationScoped
public class BookRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Book> getAllBooks() {
        TypedQuery<Book> query = em.createQuery("SELECT e FROM Book e", Book.class);
        return query.getResultList();
    }

    @Transactional
    public void registerBook(Book book) {
        em.persist(book);
    }
}
