package com.gmall.service;

import java.util.List;

import com.gmall.bean.UserAddress;

public interface UserService {
	//根据userId查询收货地址
	public List<UserAddress> getUserAddressList(String userId);
}
