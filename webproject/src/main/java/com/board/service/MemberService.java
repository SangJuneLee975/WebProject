package com.board.service;

import com.board.domain.MemberVO;

public interface MemberService {

	// ȸ�� ����
		public void register(MemberVO vo) throws Exception;

		// �α���
		public MemberVO login(MemberVO vo) throws Exception;

		// ȸ������ ����
		public void modify(MemberVO vo) throws Exception;
		
		// ȸ�� Ż��
		public void withdrawal(MemberVO vo) throws Exception;
	}
