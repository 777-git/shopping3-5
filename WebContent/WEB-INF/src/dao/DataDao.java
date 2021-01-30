package dao;

import java.util.List;

import logic.Data;

	public interface DataDao {

		 List<Data> getData(String userId);

}
