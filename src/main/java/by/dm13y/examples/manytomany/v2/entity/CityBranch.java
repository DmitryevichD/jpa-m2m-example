package by.dm13y.examples.manytomany.v2.entity;

import by.dm13y.examples.manytomany.v1.entity.CityBranchId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "citybranch2")
@Table(name = "city_branch")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CityBranch implements Serializable {
    @EmbeddedId
    private CityBranchId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("branchId")
    private Branch branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("cityId")
    private City city;

    private Boolean enabled;

    public CityBranch(City city, Branch branch, boolean isEnabled) {
        this.branch = branch;
        this.city = city;
        this.enabled = isEnabled;
        this.id = new CityBranchId(city.getId(), branch.getId());
    }
}
