package com.board.service;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyService {

	// ��� ��ȸ
		public List<ReplyVO> readReply(int bno) throws Exception;

		// ��� �ۼ�
		public void writeReply(ReplyVO vo) throws Exception;
		
		// Ư�� ��� ��ȸ
		public ReplyVO readReplySelect(int rno) throws Exception;
		
		// ��� ����
		public void replyUpdate(ReplyVO vo) throws Exception;
			
		// ��� ����
		public void replyDelete(ReplyVO vo) throws Exception;
	}
