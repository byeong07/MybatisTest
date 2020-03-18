package com.boardPrograms.web;

import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import com.boardPrograms.web.board.service.AccessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/root-context.xml", "classpath:spring/dataSource-context.xml", "classpath:spring/appServlet/servlet-context.xml"})
public class AccessServiceTest {
	
	private static final Logger logger = LoggerFactory.getLogger(AccessServiceTest.class);
	private static final String namespace = "com.boardPrograms.web.board.boarsMapper";

	@Autowired
	private AccessService accessService;
	
	@Test
	public void testGetEmpList() {
		Params params = new Params();
		params.setCampID("a");
		params.setiSequence(1);
		
		params.setsFieldName("6001");
		params.setCampStatID("a");
		params.setsCallListName("a");
		params.setsFilterSect("a");
		params.setsPreNext("a");
		params.setsText("dad");
		params.setsAccount("ada");
		
		List<AccessVO> empList = accessService.getAccessList(params);
		System.out.println("list" + empList);
		int i = 0;
		AccessVO empVO = null;
		Iterator<AccessVO> iterator = empList.iterator();
		iterator = empList.iterator();
		
		while( iterator.hasNext() ) {
			empVO = iterator.next();
			System.out.println( "[mirinae.maru] EmpVO["+i+"] : " + empVO.getsFieldName() +"\t");
			logger.info(params.getsCallListName() + params.getsFieldName() + params.getsAccount());
		}
	} 
}
			