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
package org.acme.services;

import java.util.ArrayList;


import org.acme.beans.Order;
import org.acme.beans.OrderItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    public Order getOrder() {
        logger.info("Get order");
        Order o1 = new Order();
        java.util.List<OrderItem> itemList = new ArrayList<>();
        o1.setOrderNumber("1234");
        o1.setShipped(false);
        o1.setTotal(100d);
        OrderItem item1 = new OrderItem();
        item1.setCode("i1");
        item1.setEligible(true);
        item1.setProductCode("p1");

        itemList.add(item1);
        OrderItem item2 = new OrderItem();
        item2.setCode("i2");
        item2.setEligible(false);
        item2.setProductCode("p2");
        itemList.add(item2);
        o1.setOrderItem(itemList);
        return o1;
    }

    public boolean storeOrder(Order order) {
        logger.info("Order {} is being stored", order.getOrderNumber());
        order.setEligible(java.lang.Boolean.TRUE);

        return false;
    }

    public Order updateOrder(Order order) {

        logger.info("Order {} is being processed", order.toString());
        //order.setOrderItems(new ArrayList<>());
        return order;
    }

    /**
     * @param order
     * @return
     */
    public Order updateProcessOrder(Order order) {
        java.util.Iterator itr = order.getOrderItem().iterator();
        while (itr.hasNext()) {
            OrderItem item = (OrderItem) itr.next();
            if (!item.getEligible()) {
                itr.remove();
            }
        }
        return order;
    }
}
