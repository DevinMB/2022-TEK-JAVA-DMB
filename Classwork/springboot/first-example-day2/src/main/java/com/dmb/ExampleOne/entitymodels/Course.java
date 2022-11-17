package com.dmb.ExampleOne.entitymodels;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Course")
public class Course {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "instructor")
    private String instructorName;

    @Override
    public String toString() {
        return String.format("%5s%32s%32s", id, name, instructorName);
    }


    //  To Allow For BiDirectional
//    @ManyToMany(mappedBy = "sCourses",fetch = FetchType.EAGER)
//    private List<Student> students;


}
