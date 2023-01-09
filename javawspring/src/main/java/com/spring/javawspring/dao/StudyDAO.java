package com.spring.javawspring.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.spring.javawspring.vo.GuestVO;

public interface StudyDAO {

	public GuestVO getGuestName(@Param("name") String name);

	public ArrayList<GuestVO> getGuestNames(@Param("name") String name);

}
