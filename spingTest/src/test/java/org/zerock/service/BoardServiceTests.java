package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired })
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("새로");
		board.setContent("새로작성하는  내용");
		board.setWriter("newbie2");
		
		service.register(board);
		
		log.info("생성된 계시물의 번호 "+board.getBno());
	}
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
	}
	
	@Test
	public void testGet() {
		log.info(service.get(19));
	}
	
	@Test
	public void testDelete() {
		//게시물번호 존재 여부를 확인하고 테스트
		log.info("REMOVE RESULT : " + service.remove(1));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = service.get(19);
		
		if(board ==null) {
			return;
		}
		
		board.setTitle("제목 수정");
		log.info("MODIFY RESULT : "+service.modify(board));
	}
}
