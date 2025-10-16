package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Insert operation
    public int insertEmployee(int id, String name, String department) {
        String sql = "INSERT INTO employee (id, name, department) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, id, name, department);
    }

    // Update operation
    public int updateEmployee(int id, String name) {
        String sql = "UPDATE employee SET name = ? WHERE id = ?";
        return jdbcTemplate.update(sql, name, id);
    }

    // Delete operation
    public int deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
