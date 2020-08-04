//package com.codeup.springblog.models;
//
//import javax.persistence.*;
//
//@Table(
//        uniqueConstraints=
//        @UniqueConstraint(columnNames={"name", "reside_state"})
//)
//@Entity
//public class Dogs {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "int(11) UNSIGNED NOT NULL")
//    private long id;
//
//    @Column(columnDefinition = "tinyint(3) UNSIGNED NOT NULL", unique = true)
//    private int age;
//
//    @Column(length = 200, nullable = false)
//    private String name;
//
//    @Column(columnDefinition = "char(2) DEFAULT 'XX'")
//    private String reside_state;
//
//
//}
