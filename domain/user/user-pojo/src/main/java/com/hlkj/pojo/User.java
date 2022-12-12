package com.hlkj.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Lixiangping
 * @createTime 2022年12月12日 17:37
 * @decription:
 */
@Data
@Builder
public class User implements Serializable {

    private String username;
    private String password;

}
