package by.dm13y.examples.jpa.entity2table.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "common_table")
public class ExtCity extends BaseCity {
    private String extInfo;
}
