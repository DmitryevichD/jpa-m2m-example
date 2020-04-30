package by.dm13y.examples.jpa.entity2table.entity;

import lombok.Data;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
abstract class BaseCity {
    @Id
    private Integer id;
    private String name;
}
