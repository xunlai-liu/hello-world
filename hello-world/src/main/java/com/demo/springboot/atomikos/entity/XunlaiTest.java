package com.demo.springboot.atomikos.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author xunlailiu
 * @date 2020/08/20
 */
@Data
@Entity
@Table(name = "xunlai_test")
public class XunlaiTest {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;

    String haha;
}
