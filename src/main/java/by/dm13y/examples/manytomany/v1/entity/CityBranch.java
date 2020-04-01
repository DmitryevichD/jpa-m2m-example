package by.dm13y.examples.manytomany.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.io.Serializable;

@Entity
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
