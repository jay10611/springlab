package co.grandcircus.springlab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import co.grandcircus.springlab.Grade;

@SpringBootApplication
public class gradeAppDao {

	@Autowired
	private JdbcTemplate jdbc;

	public List<Grade> findAll() {
		String sql = "SELECT * FROM grades";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(Grade.class));
	}

	public Grade findById(Long id) {

		String sql = "SELECT * FROM grades WHERE id = ?";
		return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Grade.class), id);
	}

	public void create(Grade grade) {
		String sql = "INSERT INTO grades (name, type, score, total) VALUES (?, ?, ?, ?, ?)";
		jdbc.update(sql, grade.getName(), grade.getType(), grade.getScore(), grade.getTotal());
	}

	public void update(Grade grade) {
		String sql = "UPDATE grades SET name = ?, type = ?, score = ?, total = ?  WHERE id = ?";
		jdbc.update(sql, grade.getName(), grade.getType(), grade.getScore(), grade.getTotal(), grade.getId());
	}

	public void delete(Long id) {
		String sql = "DELETE FROM room WHERE id = ?";
		jdbc.update(sql, id);
	}

}
