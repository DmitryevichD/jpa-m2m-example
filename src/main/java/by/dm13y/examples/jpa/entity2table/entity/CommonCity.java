package by.dm13y.examples.jpa.entity2table.entity;

import org.hibernate.annotations.Where;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "common_table")
@Where(clause = "is_common = true")
public class CommonCity extends BaseCity {
}
