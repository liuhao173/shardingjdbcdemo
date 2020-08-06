package com.liuhao.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "CUR_CODE")
public class WCodes {

    @TableField(value = "CODE")
    private String CODE;

    @TableField(value = "PARENT_CODE")
    private String PARENTCODE;

    @TableField(value = "PACKAGE_LEVEL")
    private Long PACKAGELEVEL;

    @TableField(value = "DJBH")
    private String DJBH;

}
