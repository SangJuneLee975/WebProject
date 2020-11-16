package com.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.MemberVO;
import com.board.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAO dao;

	// ȸ�� ����
	@Override
	public void register(MemberVO vo) throws Exception {
		dao.register(vo);		
	}

	// �α���
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
				
		return dao.login(vo);
	}

	// ȸ������ ����
	@Override
	public void modify(MemberVO vo) throws Exception {
		
		dao.modify(vo);
	}

	// ȸ�� Żȸ
	@Override
	public void withdrawal(MemberVO vo) throws Exception {
		dao.withdrawal(vo);
	}
} 
