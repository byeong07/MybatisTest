package com.boardPrograms.web.board.service;

import com.boardPrograms.web.board.dao.AccessDAO;
import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import com.sun.istack.internal.logging.Logger;

import sun.util.logging.resources.logging;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import javax.servlet.jsp.PageContext;

@Service
public class AccessServiceImpl implements AccessService {

	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	AccessDAO accessDAO;
	AccessVO accessVO;
	private SqlSession sqlSession;
	
	public AccessServiceImpl(AccessDAO accessDAO, SqlSession sqlSession) {
		this.accessDAO = accessDAO;
		this.sqlSession = sqlSession;
	}
		
	public List<AccessVO> getAccessList(final Params params) {
		final AccessDAO accessDAO = sqlSession.getMapper(AccessDAO.class);
		System.out.println(params.toString());
		accessDAO.getAccessList(params);
		return params.getRefResult();
	}
	
	public AccessDAO getAccessDAO() {
		return accessDAO;
	}
	
	public void setAccessDAO(AccessDAO accessDAO) {
		this.accessDAO = accessDAO;
	}
	
	
	/*
	@Override
	public Map<String, Object> getAccessList(Params params) {
		// TODO Auto-generated method stub
		Map<String, Object> list = accessDAO.getAccessList(params);
		
		return null;
	}
	*/
	
	/*
	@Override
	public List<AccessVO> listAccessList() {
		return sqlSession.selectList(namespace+".listAccessList");
	}
	*/
	
	/*
	public AccessServiceImpl(AccessDAO accessDAO, SqlSession sqlSession) {
		this.accessDAO = accessDAO;
		//this.sqlSession = sqlSession;
	}
	*/
	
	/*
	@Override
	public List<AccessVO> listAccessList() {
		return sqlSession.selectList(namespace+".listAccessList");
	}
	*/
	
	/*
	@Override
	public List<AccessVO> getAccessList(final Params params) {
		return accessDAO.getAccessList(params);
	}
	*/
	
}
