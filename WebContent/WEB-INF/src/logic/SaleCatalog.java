package logic;

import java.util.List;

public interface SaleCatalog {

	void entrySale(Sale sale);

	Integer getNewSaleId();
	List<Data> getData(String userId);
}