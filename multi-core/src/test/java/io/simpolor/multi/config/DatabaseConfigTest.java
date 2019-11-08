package io.simpolor.multi.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DatabaseConfig.class})
public class DatabaseConfigTest {

    @Test
    public void testConnection() throws SQLException {

        DatabaseConfig databaseConfig = new DatabaseConfig();

        System.out.println("getClientInfo : "+databaseConfig.dataSource().getConnection().getClientInfo());

    }
}
