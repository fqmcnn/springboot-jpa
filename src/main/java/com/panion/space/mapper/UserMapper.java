package com.panion.space.mapper;

import com.panion.space.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot-jpa
 * @desciption: 用户mapper接口
 * @author: QiMing
 * @create: 2019-03-30 16:38
 */
public interface UserMapper extends JpaRepository<User,Integer> {
}
