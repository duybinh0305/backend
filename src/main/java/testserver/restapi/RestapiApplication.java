package testserver.restapi;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import testserver.restapi.mapper.categoriesMapper;
import testserver.restapi.model.categories;
import testserver.restapi.model.categoriesExample;
import testserver.restapi.module.category;

@SpringBootApplication
public class RestapiApplication    {

//	@Autowired
//	private JdbcTemplate jdbsTemplate;
//	
//	@Autowired
//	categoriesMapper cateMapper;
	
	public static void main(String[] args){
		SpringApplication.run(RestapiApplication.class, args);
		
	}

	
//	public void run(String... args) throws Exception {
//		
//		
//		
//		categoriesExample example= new categoriesExample();
//		List<categories> list= cateMapper.selectByExample(example);
////		
//		
////		String sql="select * from categories";
////		List<category> Category= jdbsTemplate.query(sql, BeanPropertyRowMapper.newInstance(category.class));
////		System.out.println(list.size());
//		for(categories value:list) {
//			System.out.println(value.getName());
//		}
//	}

}
