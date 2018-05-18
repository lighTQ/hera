package com.dfire.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeraUser {

	private int id;

	private String email;

	private Date gmtCreate;

	private Date gmtModified;

    private String name;

    private String phone;

    private String uid;

    private String wangwang;

    private String password;

	private int user_type;

	private int is_effective;

	private String description;


}