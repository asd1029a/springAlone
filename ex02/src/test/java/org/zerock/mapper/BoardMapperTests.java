package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board->log.info(board));
//	}
//	@Test
//	public void testInsert() {
//		BoardVO bvo = new BoardVO();
//		bvo.setContent("새로 작성글이닫 select key");
//		bvo.setTitle("새로 작성한 타 select key");
//		bvo.setWriter("기무죵");
//		mapper.insertSelectKey(bvo);
//		log.info(bvo);
//	}
//	@Test
//	public void testRead() {
//		BoardVO bvo = mapper.read(5L);
//		log.info(bvo);
//	}
//	@Test
//	public void testdelete() {
//		log.info("Delete Count :"+mapper.delete(3L));
////	}
//	@Test
//	public void testUpdate() {
//		BoardVO bvo = new BoardVO();
//		bvo.setBno(5L);
//		bvo.setTitle("방금수정한제목");
//		bvo.setContent("방금수정한내용");
//		bvo.setWriter("기무죵");
//		
//		int count = mapper.update(bvo);
//		log.info("Update Count :"+count);
//		
//	}
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board));
	}
}
