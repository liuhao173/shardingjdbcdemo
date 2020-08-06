package com.liuhao.shardingjdbcdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuhao.shardingjdbcdemo.entity.Codes;
import com.liuhao.shardingjdbcdemo.mapper.CodesMapper;
import com.liuhao.shardingjdbcdemo.service.ICodesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodesServiceImpl extends ServiceImpl<CodesMapper, Codes> implements ICodesService {

}
