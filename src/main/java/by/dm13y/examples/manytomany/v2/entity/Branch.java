package by.dm13y.examples.manytomany.v2.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Attention!!! Use annotation @Data is bad idea - toString and toHash methods have recursion because ManyToMany
@Entity(name = "branch2")
@Getter
@Setter
@Table(name = "branch")
public class Branch implements Serializable {
    @Id
    private Integer id;

    @ManyToMany
    @JoinTable(
        name = "city_branch",
        joinColumns = @JoinColumn(name = "branch_id"),
        inverseJoinColumns = @JoinColumn(name = "city_id")
    )
    @WhereJoinTable(clause = "enabled = 'true'")
    private List<City> cities = new ArrayList<>();

}
