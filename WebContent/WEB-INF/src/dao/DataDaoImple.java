package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import logic.Data;


	@Repository
	public class DataDaoImple implements DataDao {

		private static final String SELECT_ALL = "SELECT SAL.sale_Id, SAL.sale_line_id, SAL.item_id, SAL.quantity, SAL.update_time, IT.item_Name, IT.price"
				+" From sale_line SAL INNER JOIN item IT ON SAL.item_id = IT.item_id WHERE SAL.sale_Id IN (SELECT sale_Id FROM sale WHERE user_Id = ?) order by update_time desc,item_id asc";

		private SimpleJdbcTemplate template;

		@Autowired
		public void setDataSource(DataSource dataSource) {
			this.template = new SimpleJdbcTemplate(dataSource);
		}

		public List<Data> getData(String userId) {
			RowMapper<Data> mapper = new BeanPropertyRowMapper<Data>(Data.class);
			return this.template.query(DataDaoImple.SELECT_ALL, mapper,userId);

        }
	}


