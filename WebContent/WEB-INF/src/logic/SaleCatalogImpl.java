package logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DataDao;
import dao.SaleDao;
import dao.SaleLineDao;

@Service
public class SaleCatalogImpl implements SaleCatalog {

	@Autowired
	private SaleDao saleDao;

	@Autowired
	private SaleLineDao saleLineDao;

	@Autowired
	private DataDao dataDao;


	public void entrySale(Sale sale) {

		this.saleDao.create(sale);

		List<SaleLine> saleLineList = sale.getSaleLineList();
		for (SaleLine saleLine : saleLineList) {
			this.saleLineDao.create(saleLine);
		}
	}

	public Integer getNewSaleId() {
		int newSaleId = this.saleDao.findMaxSaleId().intValue() + 1;
		return new Integer(newSaleId);
	}

	public List<Data> getData(String userId) {
		 List<Data> dataList = this.dataDao.getData(userId);





		return dataList;
	}

 }