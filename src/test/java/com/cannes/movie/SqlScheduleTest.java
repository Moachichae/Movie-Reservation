package com.cannes.movie;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cannes.movie.domain.TicketVO;
import com.cannes.movie.persistance.ScheduleDAOImple;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" }
)
// spring 하위에 있는 xml 설정파일을 모두 포함
public class SqlScheduleTest {
	private static final Logger logger = LoggerFactory.getLogger(SqlScheduleTest.class);
	// board-mapper의 namespace와 아래의 NAMESPACE가 같아야함
	private static final String NAMESPACE = "com.cannes.movie.TicketMapper";

	@Autowired
	private SqlSession sqlSession;

	@Autowired
	private ScheduleDAOImple dao;
	@Test
	public void paySelectTest() {
//		String date1 = "200519";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		
//		Date date = null;
//		try {
//			date = sdf.parse(date1);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(date);
		TicketVO vo = new TicketVO(0 ,4, 3, "212", 4000, "성인 2,청소년 2");
		logger.info("이전 : " + vo.getTicketNo());
		Integer result = sqlSession.insert(NAMESPACE + ".ticketInsert", vo);
//		List<Integer> list = sqlSession.selectList(NAMESPACE + ".ticketInsert", vo);
		logger.info("결과 : " + result);
		
		logger.info("결과 : " + vo.getTicketNo());
		/*
		 * for(int i : list) { System.out.println(i); }
		 */
		
		
		
		
//		Date date11 = new Date();
//		SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
//		String currentTime = sdfTime.format(date11); // 현재 시간 구하기
		
		
//		SeatVO vo = sqlSession.selectOne(NAMESPACE + ".scheduleSelectNo", vo1);
//		logger.info(vo.toString());
		
//		int result = sqlSession.update(NAMESPACE + ".theaterUpdate", vo);
//		logger.info("결과 : " + result);
	
//		int result = sqlSession.delete(NAMESPACE + ".ticketDelete", 2);
//		logger.info("결과 : " + result);
//	
	} // end paySelectTest()


	
} // end SqlSessionTest
