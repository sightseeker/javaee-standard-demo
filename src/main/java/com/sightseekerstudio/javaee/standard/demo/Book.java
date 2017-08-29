/*
 * (C) Sony Network Communications Inc. All Rights reserved.
 */
package com.sightseekerstudio.javaee.standard.demo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Kohei.Saito
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private Integer price;

}
