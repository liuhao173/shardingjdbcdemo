package com.liuhao.shardingjdbcdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liuhao.shardingjdbcdemo.entity.Codes;
import com.liuhao.shardingjdbcdemo.entity.WCodes;
import com.liuhao.shardingjdbcdemo.mapper.CodesMapper;
import com.liuhao.shardingjdbcdemo.mapper.WCodesMapper;
import com.liuhao.shardingjdbcdemo.service.ICodesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShardingjdbcdemoApplicationTests {

    @Autowired
    private CodesMapper codesMapper;

    @Autowired
    private WCodesMapper wcodesMapper;

    @Autowired
    private ICodesService codesService;

    @Test
    public void addBatch() {
        for (int multiply = 0; multiply < 10; multiply++) {
            List<Codes> entityList = new ArrayList<>(100000);
            for (int count = multiply * 100000, t = 0; count < (multiply + 1) * 100000; count++, t++) {
                if(t>9) t = 0;
                Codes codes = new Codes();
                codes.setCODE("88" + multiply + "" + t + "" + count);
                entityList.add(codes);
            }
            long start = System.currentTimeMillis();
            boolean b = codesService.saveBatch(entityList);
            long over = System.currentTimeMillis();
            System.out.println(multiply + " business used " + (over - start)/1000 + " s");
        }
    }

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
        wrapper.eq("CODE","8899930939");
        long start = System.currentTimeMillis();
        Codes codes = codesMapper.selectOne(wrapper);
        long over = System.currentTimeMillis();
        System.out.println(" business used " + (over - start)/1000 + " s");
        System.err.println(codes.toString());
    }

    @Test
    public void selectAll() {
        long start = System.currentTimeMillis();
        List<Codes> codes = codesMapper.selectList(null);
        long over = System.currentTimeMillis();
        System.out.println(" business used " + (over - start)/1000 + " s");
        System.err.println(codes.size());
//        for(Codes code : codes){
//            System.err.println(code.toString());
//        }
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
