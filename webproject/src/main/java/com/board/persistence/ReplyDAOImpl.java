package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	// ���̹�Ƽ�� 
		@Inject
		private SqlSession sql;
		
		// ���� 
		private static String namespace = "com.kuzuro.mappers.replyMapper";
		
		// ��� ��ȸ
		@Override
		public List<ReplyVO> readReply(int bno) throws Exception {
			return sql.selectList(namespace + ".readReply", bno);
		}

		// ��� �ۼ�
		@Override
		public void writeReply(ReplyVO vo) throws Exception {
			sql.insert(namespace + ".writeReply", vo);		
		}


		// Ư�� ��� ��ȸ
		@Override
		public ReplyVO readReplySelect(int rno) throws Exception {
			return sql.selectOne(namespace + ".readReplySelect", rno);
		}
		
		// ��� ����
		@Override
		public void replyUpdate(ReplyVO vo) throws Exception {
			sql.update(namespace + ".updateReply", vo);
		}

		// ��� ����
		@Override
		public void replyDelete(ReplyVO vo) throws Exception {
			sql.delete(namespace + ".deleteReply", vo);
		}
		
	}