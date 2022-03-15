package com.hoannh.tranning01.dto.req;

import com.sun.istack.NotNull;
import lombok.Getter;

@Getter
public class UserCreateDTO {
    private String name;
    private int age;
    private long groupId;
    private String identityNumber;
}
