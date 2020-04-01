package com.boardPrograms.web;

import com.boardPrograms.web.board.model.AccessVO;
import com.boardPrograms.web.board.model.Params;
import com.boardPrograms.web.board.service.AccessService;

import org.apache.ibatis.cursor.Cursor;
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
		params.setsWorkSect("A");
		params.setSequence(1);
		params.setCampStatID("없음");
		params.setCallListName("NO");
		params.setAccount("가입자아웃바운드");
		params.setFieldName("6001");
		params.setFilterSect("U00120090904CL");
		params.setPreNext("테스트-통합테스트용");
		params.setText("GH_TEST");
		
		List<AccessVO> accessList = accessService.getAccessList(params);
		//Cursor<AccessVO> accessList = (Cursor<AccessVO>) accessService.getAccessList(params); 
		
		System.out.println("list" + accessList);
		logger.info("list" + accessList);
		int i = 0;
		AccessVO empVO = null;
		Iterator<AccessVO> iterator = accessList.iterator();
		
		while( iterator.hasNext() ) {
			empVO = iterator.next();
			System.out.println( "[mirinae.maru] EmpVO["+i+"] : " + empVO.getsFieldName() +"\t" + empVO.getsWorkSect()
			+ "\t" + empVO.getsGRPVDN() + "\t" + empVO.getiSequence() + "\t" + empVO.getsAccount() + "\t"
			+ empVO.getsCallListName() + "\t" + empVO.getsFilterSect() + "\t" + empVO.getsPreNext() + "\t" +
			empVO.getsText());
			
			logger.info(empVO.getsCallListName() + empVO.getsFieldName() + empVO.getsAccount());
			i++;
		}
	} 	
}
			