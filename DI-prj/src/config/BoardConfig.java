package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.di.log.BoardDAO;
import spring.di.log.Log;
import spring.di.log.NormalLog;
import spring.di.log.TimeStempLog;

@Configuration
public class BoardConfig {
	
	@Bean
	public BoardDAO dao() {
		//setter방식
		BoardDAO dao= new BoardDAO();
		dao.setLog(log());
		return dao;
		
		//생성자 방식
//		return new BoardDAO(log());
	}
	
	@Bean
	public Log log() {
//		return new NormalLog();
		return new TimeStempLog();
	}
	
}
