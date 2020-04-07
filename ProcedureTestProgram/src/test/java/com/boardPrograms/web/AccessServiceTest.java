package com.boardPrograms.web;

import com.boardPrograms.web.board.dao.AccessDAO;
import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import com.boardPrograms.web.board.service.AccessService;

import org.apache.ibatis.cursor.Cursor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/root-context.xml", "classpath:spring/dataSource-context.xml", "classpath:spring/appServlet/servlet-context.xml"})
public class AccessServiceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(AccessServiceTest.class);
	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";
	
	@Autowired
	private AccessService accessService;
	
	@Autowired
	private DataSourceTransactionManager transactionManager;
	
	@Test
	@Transactional(isolation = Isolation.READ_UNCOMMITTED, propagation=Propagation.REQUIRED, rollbackFor=SQLException.class)
	public void testGetEmpList() {
		
		Params params = new Params();
		
		params.setCampID("C");
		params.setsWorkSect("중지");
		params.setsCallListName("NO");
		params.setsPreNext("테스트-통합테스트용");
		params.setiSequence(3069);
		params.setsFieldName("6001");
		params.setsAccount("가입자아웃바운드");
		params.setsText("GH_TEST");
		params.setsFilterSect("U00120090904CL");
		
		List<AccessVO> ref_result = accessService.getAccessList(params);
		
		//Cursor<AccessVO> accessList = (Cursor<AccessVO>) accessService.getAccessList(params); 
		
		System.out.println("list" + ref_result.toString());
		logger.info("list" + ref_result);
		int i = 0;
		AccessVO empVO = null;
		Iterator<AccessVO> iterator = ref_result.iterator();
		
		while( iterator.hasNext() ) {
			empVO = iterator.next();
			System.out.println( "[mirinae.maru] EmpVO["+i+"] : " + empVO.getsFieldName() +"\t" + empVO.getsWorkSect()
			+ "\t" + empVO.getiSequence() + "\t" + empVO.getsAccount() + "\t"
			+ empVO.getsCallListName() + "\t" + empVO.getsFilterSect() + "\t" + empVO.getsPreNext() + "\t" +
			empVO.getsText());
			
			logger.info(empVO.getsCallListName() + empVO.getsFieldName() + empVO.getsAccount());
			i++;
		}
	} 	
}
			