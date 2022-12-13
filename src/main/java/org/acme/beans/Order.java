/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.beans;

import java.util.ArrayList;

public class Order implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String orderNumber;
    private java.lang.Boolean shipped;
    private java.lang.Boolean eligible;
    private java.lang.Double total;
    private java.util.List<OrderItem> orderItem = new ArrayList<>();

    public java.lang.Boolean getEligible() {
        return eligible;
    }

    public void setEligible(java.lang.Boolean eligible) {
        this.eligible = eligible;
    }

    public java.lang.Boolean getShipped() {
        return shipped;
    }

    public java.util.List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(java.util.List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }

    public Order() {
    }

    public java.lang.String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public java.lang.Boolean isShipped() {
        return this.shipped;
    }

    public void setShipped(java.lang.Boolean shipped) {
        this.shipped = shipped;
    }

    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(java.lang.Double total) {
        this.total = total;
    }

    public Order(java.lang.String orderNumber, java.lang.Boolean shipped,
            java.lang.Double total, java.util.List<OrderItem> orderItems) {
        this.orderNumber = orderNumber;
        this.shipped = shipped;
        this.total = total;
        this.orderItem = orderItems;
    }

    public String toString() {
        return "Order[" + this.orderItem + "]";
    }

}