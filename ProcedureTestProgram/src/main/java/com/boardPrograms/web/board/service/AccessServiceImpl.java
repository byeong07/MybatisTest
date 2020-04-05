package com.boardPrograms.web.board.service;

import com.boardPrograms.web.board.dao.AccessDAO;
import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import com.sun.istack.internal.logging.Logger;

import sun.util.logging.resources.logging;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.jsp.PageContext;

@Service
public class AccessServiceImpl implements AccessService {

	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	@Inject
	AccessDAO accessDAO;
	AccessVO accessVO;
	private SqlSessionTemplate sqlSession;
	
	public AccessServiceImpl(AccessDAO accessDAO, SqlSessionTemplate sqlSession) {
		this.accessDAO = accessDAO;
		this.sqlSession = sqlSession;
	}
		
	public List<AccessVO> getAccessList(final Params params) {
		try {
			//sqlSession.getConnection().setAutoCommit(false);
			accessDAO.setAutoCommit(false);
			final AccessDAO accessDAO = sqlSession.getMapper(AccessDAO.class);
			System.out.println(params.toString());
			accessDAO.getAccessList(params);
			
		} catch (Exception e) {
			accessDAO.rollback();
		} finally {
			accessDAO.setAutoCommit(true);
		}
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
