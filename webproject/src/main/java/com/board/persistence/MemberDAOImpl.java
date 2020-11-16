package com.board.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.board.domain.MemberVO;

@Service
public class MemberDAOImpl implements MemberDAO {

	// ���̹�Ƽ�� 
		@Inject
		private SqlSession sql;
		
		// ���� 
		private static String namespace = "com.kuzuro.mappers.memberMapper";
		
		// ȸ�� ����
		@Override
		public void register(MemberVO vo) throws Exception {
			sql.insert(namespace + ".register", vo);
		}

		// �α���
		@Override
		public MemberVO login(MemberVO vo) throws Exception {
			return sql.selectOne(namespace + ".login", vo);
		}

		// ȸ������ ����
		@Override
		public void modify(MemberVO vo) throws Exception {
			sql.update(namespace + ".modify",  vo);
		}

		// ȸ�� Ż��
		@Override
		public void withdrawal(MemberVO vo) throws Exception {
			sql.delete(namespace + ".withdrawal", vo);
		}
	}