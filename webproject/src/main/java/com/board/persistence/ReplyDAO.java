package com.board.persistence;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyDAO {
	
	// ´ñ±Û Á¶È¸
		public List<ReplyVO> readReply(int bno) throws Exception;

		// ´ñ±Û ÀÛ¼º
		public void writeReply(ReplyVO vo) throws Exception;

		// Æ¯Á¤ ´ñ±Û Á¶È¸
		public ReplyVO readReplySelect(int rno) throws Exception;
		
		// ´ñ±Û ¼öÁ¤
		public void replyUpdate(ReplyVO vo) throws Exception;
			
		// ´ñ±Û »èÁ¦
		public void replyDelete(ReplyVO vo) throws Exception;
			
	}