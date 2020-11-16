package com.board.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.BoardVO;
import com.board.domain.Criteria;
import com.board.domain.ReplyVO;
import com.board.domain.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	// ���̹�Ƽ�� 
		@Inject
		private SqlSession sql;
		
		// ���� 
		private static String namespace = "com.kuzuro.mappers.boardMapper";
			
		// �ۼ�
		@Override
		public void write(BoardVO vo) throws Exception {
			sql.insert(namespace + ".write", vo);
		}

		// ��ȸ
		@Override
		public BoardVO read(int bno) throws Exception {
			return sql.selectOne(namespace + ".read", bno);
		} 
		
		// ����
		@Override
		public void update(BoardVO vo) throws Exception {
			sql.update(namespace + ".update", vo);
		}

		// ����
		@Override
		public void delete(int bno) throws Exception {
			sql.delete(namespace + ".delete", bno);
		}

		// ���
		@Override
		public List<BoardVO> list() throws Exception {
			return sql.selectList(namespace + ".list");
		}

		// ��� + ����¡
		@Override
		public List<BoardVO> listPage(Criteria cri) throws Exception {
			return sql.selectList(namespace + ".listPage", cri);
		}

		// �Խù� �� ����
		@Override
		public int listCount() throws Exception {
			return sql.selectOne(namespace + ".listCount");
		}

		// ��� + ����¡ + �˻�
		@Override
		public List<BoardVO> listSearch(SearchCriteria scri) throws Exception {
			return sql.selectList(namespace + ".listSearch", scri);
		}

		// �˻� ��� ����
		@Override
		public int countSearch(SearchCriteria scri) throws Exception {
			return sql.selectOne(namespace + ".countSearch", scri);
		}

		// ��� ��ȸ
		@Override
		public List<ReplyVO> readReply(int bno) throws Exception {
			return sql.selectList(namespace + ".readRpley", bno);
		}

	}