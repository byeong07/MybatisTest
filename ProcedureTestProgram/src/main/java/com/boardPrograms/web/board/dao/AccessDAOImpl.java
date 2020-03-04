package com.boardPrograms.web.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;

@Repository
public class AccessDAOImpl implements AccessDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<AccessVO> getAccessList(Params params) {
		return sqlSession.selectList("com.boardPrograms.web.board.boarsMapper.getAccessList", params);
	}
	
}
