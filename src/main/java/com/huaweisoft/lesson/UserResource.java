package com.huaweisoft.lesson;

public class UserResource {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUserNameById(int id) {
		return userService.getUserName(id);
	}
	
	public String getAddressById(int id) {
	    return userService.getAddress(id);
	}
}
