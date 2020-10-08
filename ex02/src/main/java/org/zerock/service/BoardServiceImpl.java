package org.zerock.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.controller.HomeController;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{

	private static final Logger log = LoggerFactory.getLogger(BoardServiceImpl.class);
	
	@Setter(onMethod_= @Autowired)
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO bvo) {
		log.info("register......."+bvo);
		mapper.insertSelectKey(bvo);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("get............."+bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO bvo) {
		log.info("modify...........");
		return mapper.update(bvo) ==1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove.........");
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getlist.............");
		return mapper.getList();
	}

}
