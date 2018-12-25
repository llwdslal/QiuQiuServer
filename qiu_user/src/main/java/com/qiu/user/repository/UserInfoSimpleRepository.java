package com.qiu.user.repository;

import com.qiu.user.model.UserInfoSimple;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Rock Lee
 * @Date 2018/12/25 0025 17:29
 */
public interface UserInfoSimpleRepository extends JpaRepository<UserInfoSimple,String> {
}
