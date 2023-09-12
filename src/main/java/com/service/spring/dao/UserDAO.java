package com.service.spring.dao;

import java.util.HashMap;

import com.service.spring.vo.User;
import com.service.spring.vo.UserInfo;
import com.service.spring.vo.Writer;

public interface UserDAO {

	int register(UserInfo userInfo); 
	int register(User user);
	int register(Writer writer); 
	
	String isExist(String email); //회원정보 불러오기
	int showIdentity(int infoId); //권한 확인
	
	UserInfo login(UserInfo userInfo);
	User showUser(int infoId);
	Writer showWriter(int infoId);
	
//	int updateUser(User user);
	int updateUserInfo(UserInfo userInfo);
	int updateUserNickname(UserInfo userInfo);
	int registerCharacter(HashMap<String, Object> map);
	
	int addAccount(HashMap<String, Object> map);
	int updateAccount(HashMap<String, Object> map); 
	int deleteAccount(int infoId);
	
	int getUserInfoSeq();
	int getUsersSeq();
	int getWriterSeq();
	
	int getUserId(int infoId);
	int getWriterId(int infoId);
}
