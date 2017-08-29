/*
 * (C) Sony Network Communications Inc. All Rights reserved.
 */
package com.sightseekerstudio.javaee.standard.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Kohei.Saito
 */
@Entity
@Data
public class Book implements Serializable {

    @Id
    private Integer id;

    private String name;
    private Integer price;

}
