package com.cannes.movie;

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

import com.cannes.movie.domain.MemberVO;
import com.cannes.movie.domain.NoticeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
// spring 하위에 있는 xml 설정파일을 모두 포함
public class Sql_Member_Notice_Test {
	private static final Logger logger = LoggerFactory.getLogger(Sql_Member_Notice_Test.class);
	// board-mapper의 namespace와 아래의 NAMESPACE가 같아야함
	private static final String NAMESPACE = "com.cannes.movie.NoticeMapper";

	@Autowired
	private SqlSession sqlSession;

	@Test
	public void paySelectTest() {
		/* Member 테스트 */
//		List<MemberVO> list = sqlSession.selectList(NAMESPACE + ".memberSelectAll", null);
//		
//		for(MemberVO vo : list) {
//			logger.info(vo.toString() + "\n");
//		}

//		MemberVO vo = new MemberVO(0, "test1", "1234", null, null, null, null, null);
//		vo = sqlSession.selectOne(NAMESPACE + ".memberSelectById_Pw", vo);
//		logger.info(vo + "");

		/* insert(Date Format) */
//		try {
//			String birth = "871019";
//			SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//			Date date = sdf.parse(birth);
//			MemberVO vo = new MemberVO(0, "test2", "0000", "또치", date, "010-5555-5555", "ddochi@test.com", "");
//			
//			int result = sqlSession.insert(NAMESPACE + ".memberInsert", vo);
//			logger.info(result + "");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

//		MemberVO vo = new MemberVO(0, "test1", "1234", null, null, null, null, null);
//		int result = sqlSession.delete(NAMESPACE + ".memberDelete", vo);
//		logger.info(result + "");

//		String keyword = "es";
//		keyword = "%" + keyword + "%";
//		logger.info(keyword);
//		
//		List<MemberVO> list = sqlSession.selectList(NAMESPACE + ".memberSelectByNo_Id", keyword);
//		for(MemberVO one : list) {
//			logger.info(one + "\n");
//		}

		/* Notice 테스트 */
//		List<NoticeVO> list = sqlSession.selectList(NAMESPACE + ".noticeSelectAll", null);
//		for(NoticeVO one : list) {
//			logger.info(one + "\n");
//		}

//		String keyword = "1번";
//		keyword = "%" + keyword + "%";
//		List<NoticeVO> list = sqlSession.selectList(NAMESPACE + ".noticeSelectByTitle", keyword);
//		for(NoticeVO one : list) {
//			logger.info(one + "\n");
//		}

//		int num = 3;
//		NoticeVO vo = sqlSession.selectOne(NAMESPACE + ".noticeSelectDetail", num);
//		logger.info(vo + "");

//		NoticeVO vo = new NoticeVO(0, "상영 일정 안내", "오늘의 상영작은 에일리언입니다.", null);
//		int result = sqlSession.insert(NAMESPACE + ".noticeInsert", vo);
//		logger.info(result + "");

//		NoticeVO vo = new NoticeVO(3, "오늘의 포켓몬", "안녕! 오박사입니다! 포포포켓몬!", null);
//		int result = sqlSession.update(NAMESPACE + ".noticeUpdate", vo);
//		logger.info(result + "");

//		int num = 2;
//		int result = sqlSession.delete(NAMESPACE + ".noticeDelete", num);
//		logger.info(result + "");

	} // end paySelectTest()

} // end SqlSessionTest
