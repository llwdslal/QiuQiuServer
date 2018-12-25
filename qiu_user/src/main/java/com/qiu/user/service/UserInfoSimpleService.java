package com.qiu.user.service;

import com.qiu.user.model.UserInfoSimple;
import com.qiu.user.repository.UserInfoSimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Author Rock Lee
 * @Date 2018/12/25 0025 17:31
 */
@Service
public class UserInfoSimpleService {
    @Autowired
    private UserInfoSimpleRepository simpleRepository;

    public UserInfoSimple findById(String id){
        return simpleRepository.findById(id).get();
    }

    public boolean saveOrUpdate(UserInfoSimple userInfoSimple){
        if (StringUtils.isEmpty(userInfoSimple.getId())){
            throw  new IllegalArgumentException("没有id不能进行保存或更新操作");
        }
        return simpleRepository.save(userInfoSimple) != null;
    }



}
