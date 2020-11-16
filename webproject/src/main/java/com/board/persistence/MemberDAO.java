package com.board.persistence;

import com.board.domain.MemberVO;

public interface MemberDAO {

	// ȸ�� ����
		public void register(MemberVO vo) throws Exception;
		
		// �α���
		public MemberVO login(MemberVO vo) throws Exception;

		// ȸ������ ����
		public void modify(MemberVO vo) throws Exception;
		
		// ȸ�� Ż��
		public void withdrawal(MemberVO vo) throws Exception;
	
}
