package com.vaadin.starter.bakery.backend.data;

import java.util.LinkedHashMap;
import java.util.List;

import com.vaadin.starter.bakery.backend.data.entity.Product;

/**
 * Controls the data shown in the dashboard (gets and sets)
 */
public class DashboardData {

	private DeliveryStats deliveryStats;
	private List<Number> deliveriesThisMonth;
	private List<Number> deliveriesThisYear;
	private Number[][] salesPerMonth;
	private LinkedHashMap<Product, Integer> productDeliveries;

    /**
     *
     * @return
     */
	public DeliveryStats getDeliveryStats() {
		return deliveryStats;
	}

    /**
     *
     * @param deliveryStats
     */
	public void setDeliveryStats(DeliveryStats deliveryStats) {
		this.deliveryStats = deliveryStats;
	}

    /**
     *
     * @return
     */
	public List<Number> getDeliveriesThisMonth() {
		return deliveriesThisMonth;
	}

    /**
     *
     * @param deliveriesThisMonth
     */
	public void setDeliveriesThisMonth(List<Number> deliveriesThisMonth) {
		this.deliveriesThisMonth = deliveriesThisMonth;
	}

    /**
     *
     * @return
     */
	public List<Number> getDeliveriesThisYear() {
		return deliveriesThisYear;
	}

    /**
     *
     * @param deliveriesThisYear
     */
	public void setDeliveriesThisYear(List<Number> deliveriesThisYear) {
		this.deliveriesThisYear = deliveriesThisYear;
	}

    /**
     *
     * @param salesPerMonth
     */
	public void setSalesPerMonth(Number[][] salesPerMonth) {
		this.salesPerMonth = salesPerMonth;
	}

    /**
     *
     * @param i
     * @return
     */
	public Number[] getSalesPerMonth(int i) {
		return salesPerMonth[i];
	}

    /**
     *
     * @return
     */
	public LinkedHashMap<Product, Integer> getProductDeliveries() {
		return productDeliveries;
	}

    /**
     *
     * @param productDeliveries
     */
	public void setProductDeliveries(LinkedHashMap<Product, Integer> productDeliveries) {
		this.productDeliveries = productDeliveries;
	}

}
