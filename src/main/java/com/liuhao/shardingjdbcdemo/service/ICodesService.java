package com.liuhao.shardingjdbcdemo.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuhao.shardingjdbcdemo.entity.Codes;
import com.liuhao.shardingjdbcdemo.mapper.CodesMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICodesService extends IService<Codes> {

}
