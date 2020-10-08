package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {

	public void register(BoardVO bvo);
	public BoardVO get(Long bno);
	public boolean modify(BoardVO bvo);
	public boolean remove(Long bno);
	public List<BoardVO> getList();
}
