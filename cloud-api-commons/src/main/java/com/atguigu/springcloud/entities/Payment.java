package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description TODO
 * @Author Rwenjie
 * @Date 2021/1/6 18:21
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private  Long id;
    private String serial;
}
