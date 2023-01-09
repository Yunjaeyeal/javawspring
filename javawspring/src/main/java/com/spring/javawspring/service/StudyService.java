package com.spring.javawspring.service;

import java.util.ArrayList;

import com.spring.javawspring.vo.GuestVO;

public interface StudyService {

	public String[] getCityStringArr(String dodo);

	public ArrayList<String> getCityArrayListArr(String dodo);

	public GuestVO getGuestName(String name);

	public ArrayList<GuestVO> getGuestNames(String name);

}
