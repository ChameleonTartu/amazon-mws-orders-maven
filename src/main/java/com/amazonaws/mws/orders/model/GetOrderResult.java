/*******************************************************************************
 * Copyright 2009-2020 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Get Order Result
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * GetOrderResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="GetOrderResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Orders" type="{https://mws.amazonservices.com/Orders/2013-09-01}Order" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class GetOrderResult extends AbstractMwsObject {

    private List<Order> orders;

    /**
     * Get the value of Orders.
     *
     * @return The value of Orders.
     */
    public List<Order> getOrders() {
        if (orders==null) {
            orders = new ArrayList<Order>();
        }
        return orders;
    }

    /**
     * Set the value of Orders.
     *
     * @param orders
     *            The new value to set.
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Clear Orders.
     */
    public void unsetOrders() {
        this.orders = null;
    }

    /**
     * Check to see if Orders is set.
     *
     * @return true if Orders is set.
     */
    public boolean isSetOrders() {
        return orders != null && !orders.isEmpty();
    }

    /**
     * Add values for Orders, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.orders.model.Order} object.
     */
    public GetOrderResult withOrders(Order... values) {
        List<Order> list = getOrders();
        for (Order value : values) {
            list.add(value);
        }
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        orders = r.readList("Orders", "Order", Order.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.writeList("Orders", "Order", orders);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "GetOrderResult",this);
    }

    /**
     * Value constructor.
     *
     * @param orders a {@link java.util.List} object.
     */
    public GetOrderResult(List<Order> orders) {
        this.orders = orders;
    }    

    /**
     * Default constructor.
     */
    public GetOrderResult() {
        super();
    }

}
