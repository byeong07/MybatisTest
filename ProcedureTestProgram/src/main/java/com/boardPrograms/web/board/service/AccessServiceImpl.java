package com.boardPrograms.web.board.service;

import com.boardPrograms.web.board.dao.AccessDAO;
import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AccessServiceImpl implements AccessService {

	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	AccessDAO accessDAO;
	private SqlSession sqlSession;
	
	public AccessServiceImpl(AccessDAO accessDAO, SqlSession sqlSession) {
		this.accessDAO = accessDAO;
		this.sqlSession = sqlSession;
	}
	
	public AccessServiceImpl(AccessDAO accessDAO) {
		this.accessDAO = accessDAO;
	}

	public AccessServiceImpl() {
		this.accessDAO = accessDAO;
	}
	
	public AccessServiceImpl(AccessVO accessVO) {
		this.accessDAO = accessDAO;
	}
	
	public List<AccessVO> AccessServiceImpl(Params params) {
		this.accessDAO = accessDAO;
		return accessDAO.getAccessList(params);
	}
	
	public List<AccessVO> getAccessList(final Params params) {
		return accessDAO.getAccessList(params);
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
