import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-persist-mybatis.xml", 
		    						"classpath:spring-persist-tx.xml" })
public class TestMybatis {

	@Autowired
	private DataSource dataSource;

	@Test
	public void testConnection() throws SQLException {
		Connection connection = dataSource.getConnection();

		System.out.println(connection);
	}

}
