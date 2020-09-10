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
 * List Order Items By Next Token Result
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import java.util.List;
import java.util.ArrayList;

import com.amazonservices.mws.client.*;

/**
 * ListOrderItemsByNextTokenResult complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListOrderItemsByNextTokenResult"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="NextToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="AmazonOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="OrderItems" type="{https://mws.amazonservices.com/Orders/2013-09-01}OrderItem" maxOccurs="unbounded"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class ListOrderItemsByNextTokenResult extends AbstractMwsObject {

    private String nextToken;

    private String amazonOrderId;

    private List<OrderItem> orderItems;

    /**
     * Get the value of NextToken.
     *
     * @return The value of NextToken.
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * Set the value of NextToken.
     *
     * @param nextToken
     *            The new value to set.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Check to see if NextToken is set.
     *
     * @return true if NextToken is set.
     */
    public boolean isSetNextToken() {
        return nextToken != null;
    }

    /**
     * Set the value of NextToken, return this.
     *
     * @param nextToken
     *             The new value to set.
     * @return This instance.
     */
    public ListOrderItemsByNextTokenResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Get the value of AmazonOrderId.
     *
     * @return The value of AmazonOrderId.
     */
    public String getAmazonOrderId() {
        return amazonOrderId;
    }

    /**
     * Set the value of AmazonOrderId.
     *
     * @param amazonOrderId
     *            The new value to set.
     */
    public void setAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }

    /**
     * Check to see if AmazonOrderId is set.
     *
     * @return true if AmazonOrderId is set.
     */
    public boolean isSetAmazonOrderId() {
        return amazonOrderId != null;
    }

    /**
     * Set the value of AmazonOrderId, return this.
     *
     * @param amazonOrderId
     *             The new value to set.
     * @return This instance.
     */
    public ListOrderItemsByNextTokenResult withAmazonOrderId(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
        return this;
    }

    /**
     * Get the value of OrderItems.
     *
     * @return The value of OrderItems.
     */
    public List<OrderItem> getOrderItems() {
        if (orderItems==null) {
            orderItems = new ArrayList<OrderItem>();
        }
        return orderItems;
    }

    /**
     * Set the value of OrderItems.
     *
     * @param orderItems
     *            The new value to set.
     */
    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    /**
     * Clear OrderItems.
     */
    public void unsetOrderItems() {
        this.orderItems = null;
    }

    /**
     * Check to see if OrderItems is set.
     *
     * @return true if OrderItems is set.
     */
    public boolean isSetOrderItems() {
        return orderItems != null && !orderItems.isEmpty();
    }

    /**
     * Add values for OrderItems, return this.
     *
     * @return This instance.
     * @param values a {@link com.amazonaws.mws.orders.model.OrderItem} object.
     */
    public ListOrderItemsByNextTokenResult withOrderItems(OrderItem... values) {
        List<OrderItem> list = getOrderItems();
        for (OrderItem value : values) {
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
        nextToken = r.read("NextToken", String.class);
        amazonOrderId = r.read("AmazonOrderId", String.class);
        orderItems = r.readList("OrderItems", "OrderItem", OrderItem.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("NextToken", nextToken);
        w.write("AmazonOrderId", amazonOrderId);
        w.writeList("OrderItems", "OrderItem", orderItems);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "ListOrderItemsByNextTokenResult",this);
    }

    /**
     * Value constructor.
     *
     * @param amazonOrderId a {@link java.lang.String} object.
     */
    public ListOrderItemsByNextTokenResult(String amazonOrderId) {
        this.amazonOrderId = amazonOrderId;
    }    

    /**
     * Default constructor.
     */
    public ListOrderItemsByNextTokenResult() {
        super();
    }

}
