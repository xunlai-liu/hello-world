package com.demo.springboot.atomikos.repository.db2;

import com.demo.springboot.atomikos.entity.XunlaiTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author xunlailiu
 * @date 2020/08/20
 */
public interface XunTestRepository extends JpaRepository<XunlaiTest, Integer>, JpaSpecificationExecutor<XunlaiTest> {
}
