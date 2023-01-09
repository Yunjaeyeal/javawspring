package com.spring.javawspring.service;

import java.util.ArrayList;

import com.spring.javawspring.vo.MemberVO;

public interface MemberService {

	public MemberVO getMemberIdCheck(String mid);

	public MemberVO getMemberNickNameCheck(String nickName);

	public int setMemberJoinOk(MemberVO vo);

	public void setMemberVisitProcess(MemberVO vo);

	public int totRecCnt();

	public ArrayList<MemberVO> getMemberList(int startIndexNo, int pageSize,String mid);

	public MemberVO memberInfor(String mid);

	public int totTermRecCnt(String mid);



	

	

}
