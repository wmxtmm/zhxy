package com.tmm.zhxy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tmm.zhxy.pojo.Clazz;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tmm.zhxy.pojo.LoginForm;

import java.util.List;

/**
* @author TMM
* @description 针对表【tb_clazz】的数据库操作Service
* @createDate 2022-06-09 16:15:26
*/
public interface ClazzService extends IService<Clazz> {

    List<Clazz> getAllClazz();

    int deleteClazzByIds(List<Integer> ids);

    boolean insertOrUpdateClazz(Clazz clazz);

    IPage<Clazz> getPageByClazz(Integer pageNo, Integer pageSize, Clazz clazz);

}
