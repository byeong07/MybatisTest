package com.boardPrograms.web.board.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.eclipse.jdt.internal.compiler.flow.FinallyFlowContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.boardPrograms.web.board.dao.AccessDAO;
import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;

@Service
public class AccessServiceImpl implements AccessService {
	
	@Inject
	AccessDAO accessDAO;
	private SqlSession sqlSession;
	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	@Override
	public List<AccessVO> listAccessList() {
		return sqlSession.selectList(namespace+".listAccessList");
	}
	
	@Override
	public List<AccessVO> getAccessList(final Params params) {
		
		return accessDAO.getAccessList(params);
		/*
		final AccessDAO empDAO = sqlSession.getMapper(AccessDAO.class);
		empDAO.getAccessList(params);
		empDAO.getAccessList(params).forEach(System.out::println);
		
		return params.getAccessList();
		*/
	}
}
