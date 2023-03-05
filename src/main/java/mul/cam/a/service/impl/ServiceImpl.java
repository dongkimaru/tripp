package mul.cam.a.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mul.cam.a.dao.MemberDao;
import mul.cam.a.dto.MemberDto;
import mul.cam.a.service.MemberService;

@Service
public class ServiceImpl implements MemberService{
	
	@Autowired
	MemberDao dao;
	
	public List<MemberDto> allMember(){
		return dao.allMember();
	}
	
}
