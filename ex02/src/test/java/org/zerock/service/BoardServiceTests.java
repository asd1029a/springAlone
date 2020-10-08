package org.zerock.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_= {@Autowired})
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}
//	
//	@Test
//	public void testRegister() {
//		BoardVO bvo = new BoardVO();
//		bvo.setTitle("새로 작성하는글");
//		bvo.setContent("새로 작성하는 내용");
//		bvo.setWriter("newbie");
//		
//		service.register(bvo);
//		log.info("생성된 게시물의 번호 :"+bvo.getBno());
//	}
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
//	}
//	@Test
//	public void testGet() {
//		log.info(service.get(5L));
//	}
//	@Test
//	public  void testUpdate() {
//		BoardVO bvo = service.get(5L);
//		if(bvo == null) {
//			return;
//		}
//		bvo.setTitle("제목수정마지막함");
//		log.info("MODIFY Result :"+service.modify(bvo));
//	}
	
}
