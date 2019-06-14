package com.neuedu.pojo;

import lombok.Data;

@Data
public class MyPage {
    private Integer pageNo=1;
    private Integer pageSize=10;
    /*
    *   是否需要分页  1 是  0 否
    *
    * */
    private Integer withPage=1;
}
