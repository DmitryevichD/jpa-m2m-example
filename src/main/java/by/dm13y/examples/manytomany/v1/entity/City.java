package by.dm13y.examples.manytomany.v1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Attention!!! Use annotation @Data is bad idea - toString and toHash methods have recursion because ManyToMany
@Entity
@Getter
@Setter
@Table(name = "city")
public class City  implements Serializable {
    @Id
    private Integer id;

    @OneToMany(
            mappedBy = "city",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<CityBranch> branches = new ArrayList<>();
}
