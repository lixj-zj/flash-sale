package com.example.demo.exception;

import com.example.demo.result.CodeMsg;

/**
 * @Description: 设置全局异常
 * --------------------------------------
 * @ClassName: DruidConfig.java
 * @Date: 2021/3/20 22:59
 * @SoftWare: IntelliJ IDEA
 * --------------------------------------
 * @Author: lixj
 * @Contact: lixj_zj@163.com
 **/
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg codeMsg;

    public GlobalException(CodeMsg codeMsg) {
        super(codeMsg.toString());
        this.codeMsg = codeMsg;
    }

    public CodeMsg getCodeMsg() {
        return codeMsg;
    }

}
