package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.domain.ReplyVO;
import com.board.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	// ��� ��ȸ
	@Override
	public List<ReplyVO> readReply(int bno) throws Exception {
		return dao.readReply(bno);
	}

	// ��� �ۼ�
	@Override
	public void writeReply(ReplyVO vo) throws Exception {
		dao.writeReply(vo);		
	} 

	// Ư�� ��� ��ȸ
	@Override
	public ReplyVO readReplySelect(int rno) throws Exception {
		return dao.readReplySelect(rno);
	}
	
	// ��� ����
	@Override
	public void replyUpdate(ReplyVO vo) throws Exception {
		dao.replyUpdate(vo);
	}

	// ��� ����
	@Override
	public void replyDelete(ReplyVO vo) throws Exception {
		dao.replyDelete(vo);
	}

 
} 