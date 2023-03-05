package mul.cam.a.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.cam.a.dao.MemberDao;
import mul.cam.a.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	SqlSession session;		// member.xml 에연결
	
	String ns = "Member.";
	
	@Override
	public List<MemberDto> allMember(){
		return session.selectList(ns + "allMember");
	}
	
}
