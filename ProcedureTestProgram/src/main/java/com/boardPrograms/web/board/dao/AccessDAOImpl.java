package com.boardPrograms.web.board.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;

@Repository
public class AccessDAOImpl implements AccessDAO {
	
	@Inject
	SqlSession sqlSession;
	
	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	public AccessDAOImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
		
	@Override
	public List<AccessVO> getAccessList(Params params) {
		return sqlSession.selectOne(namespace + ".getAccessList", params);
		//return sqlSession.selectList(namespace + ".getAccessList", params);
		//return sqlSession.selectList("com.boardPrograms.web.board.boarsMapper.getAccessList", params);
	}
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	/*
	@Override
	public Map<String, Object> getAccessList(Params params) {
		// TODO Auto-generated method stub
		System.out.println(params.getCampID());
		
		List<Params> list = new ArrayList<Params>();
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("CampID", params.getCampID());
		
		sqlSession.selectOne("getAccessList", map);
		
		
		return null;
	}
	*/
	
}
