package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/SpringDB");
		dataSource.setUsername("root");
		dataSource.setPassword("W7301@jqir#");
		return dataSource;
		
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		return jdbcTemplate;
		
	}

}
