package by.dm13y.examples.manytomany.v2.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;
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

@Entity(name = "city2")
@Getter
@Setter
@Table(name = "city")
public class City  implements Serializable {
    @Id
    private Integer id;

    @ManyToMany(mappedBy = "cities")
    @WhereJoinTable(clause = "enabled = 'true'")
    private List<Branch> branches = new ArrayList<>();
}
