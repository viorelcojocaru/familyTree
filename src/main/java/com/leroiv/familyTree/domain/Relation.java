package com.leroiv.familyTree.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/*@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@AllArgsConstructor("a")
@Entity(name = "familyTree")
@Table(name = "relation")*/
public class Relation {//extends Base
   /* @OneToMany(targetEntity = AppAccount.class)
    @JoinColumn(name = "from_AppAccount_Id", referencedColumnName = "id")
    private AppAccount fromAppAccountId;
    @OneToMany(targetEntity = AppAccount.class)
    @JoinColumn(name = "to_AppAccount_Id", referencedColumnName = "id")
    private AppAccount toAppAccountId;
    @Column(name = "START_DATE")
    private Date startDate;
    @Column(name = "END_DATE")
    private Date endDate;
    private String location;*/

}
