package by.dm13y.examples.manytomany.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityBranchId implements Serializable {
    @Column(name = "city_id")
    private Integer cityId;

    @Column(name = "branch_id")
    private Integer branchId;
}
