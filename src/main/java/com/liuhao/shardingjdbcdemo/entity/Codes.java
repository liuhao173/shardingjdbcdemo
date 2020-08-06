package com.liuhao.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "CUR_CODE")
public class Codes {

    @TableField(value = "CODE")
    private String CODE;

    @TableField(value = "PARENT_CODE")
    private String PARENTCODE;

    @TableField(value = "PACKAGE_LEVEL")
    private Long PACKAGELEVEL;

    @TableField(value = "PACKAGE_RATIO")
    private String PACKAGERATIO;

    @TableField(value = "PACKAGE_SPEC")
    private String PACKAGESPEC;

    @TableField(value = "SPEC")
    private String SPEC;

    @TableField(value = "BATCH_NO")
    private String BATCHNO;

    @TableField(value = "MADE_DATE")
    private String MADEDATE;

    @TableField(value = "VALIDATE_DATE")
    private String VALIDATEDATE;
}
