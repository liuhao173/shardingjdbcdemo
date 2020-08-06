package com.liuhao.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuhao.shardingjdbcdemo.entity.Codes;
import com.liuhao.shardingjdbcdemo.entity.WCodes;
import com.liuhao.shardingjdbcdemo.mapper.CodesMapper;
import com.liuhao.shardingjdbcdemo.mapper.WCodesMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcdemoApplicationTests {

    @Autowired
    private CodesMapper codesMapper;

    @Autowired
    private WCodesMapper wcodesMapper;

    @Test
    public void add() {
        Codes codes = new Codes();
        codes.setCODE("88361234");
        codes.setPARENTCODE("");
        codes.setPACKAGELEVEL(2L);
        codesMapper.insert(codes);
    }

    @Test
    public void select() {
        QueryWrapper<Codes>  wrapper = new QueryWrapper<>();
        wrapper.eq("CODE","88001234");
        System.err.println(new Date());
        Codes codes = codesMapper.selectOne(wrapper);
        System.err.println(new Date());
        System.err.println(codes.toString());
    }

    @Test
    public void selectAll() {
        System.err.println(new Date());
        List<Codes> codes = codesMapper.selectList(null);
        System.err.println(new Date());
        for(Codes code : codes){
            System.err.println(code.toString());
        }
    }

    @Test
    public void add_w() {
        WCodes codes = new WCodes();
        codes.setCODE("88121234");
        codes.setPARENTCODE("");
        codes.setPACKAGELEVEL(2L);
        codes.setDJBH("20200901");
        wcodesMapper.insert(codes);
    }

    @Test
    public void selectAll_w() {
        List<WCodes> codes = wcodesMapper.selectList(null);
        for(WCodes code : codes){
            System.err.println(code.toString());
        }
    }
}