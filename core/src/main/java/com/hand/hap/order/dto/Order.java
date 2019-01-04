package com.hand.hap.order.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/12/29
 */
public class Order {
/*    private Long companyId;
   private Companys companys;
   private Customers customers;
   private OrderHeaders orderHeaders;
   private OrderLines orderLines;
   private InventoryItems inventoryItems;
   private Long total;
   */
    /*company*/
    private Long companyId;
    private String companyName;
    /*customer*/
    private Long customerId;
    private String customerName;
    /*inventoryItemId*/
    private Long inventoryItemId;
    /*orderHeader*/
    private Long headerId; //订单头ID
    private String orderNumber;
    private Date creationDate;
    private String orderStatus;
    private Long total;
    private String formateCreationDate;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setFormateCreationDate(String formateCreationDate) {
        this.formateCreationDate = formateCreationDate;
    }

    public String getFormateCreationDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(creationDate!=null){
            formateCreationDate = simpleDateFormat.format(getCreationDate());
        }
        return formateCreationDate;
    }



    public Long getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Long headerId) {
        this.headerId = headerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", inventoryItemId=" + inventoryItemId +
                ", orderNumber='" + orderNumber + '\'' +
                ", creationDate=" + creationDate +
                ", orderStatus='" + orderStatus + '\'' +
                ", total=" + total +
                ", formateCreationDate='" + formateCreationDate + '\'' +
                '}';
    }
}