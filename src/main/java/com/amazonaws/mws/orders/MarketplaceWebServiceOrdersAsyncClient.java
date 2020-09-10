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
 * Marketplace Web Service Orders
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders;

import com.amazonaws.mws.orders.model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * <p>MarketplaceWebServiceOrdersAsyncClient class.</p>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class MarketplaceWebServiceOrdersAsyncClient extends MarketplaceWebServiceOrdersClient implements MarketplaceWebServiceOrdersAsync {

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.orders.MarketplaceWebServiceOrdersConfig} object.
     * @param executor a {@link java.util.concurrent.ExecutorService} object.
     */
    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceOrdersConfig config,
            ExecutorService executor) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
        connection.setExecutorService(executor);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.orders.MarketplaceWebServiceOrdersConfig} object.
     */
    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion,
            MarketplaceWebServiceOrdersConfig config) {
        super(accessKey, secretKey, applicationName, applicationVersion, config);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param config a {@link com.amazonaws.mws.orders.MarketplaceWebServiceOrdersConfig} object.
     */
    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            MarketplaceWebServiceOrdersConfig config) {
        super(accessKey, secretKey, config);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersAsyncClient.</p>
     *
     * @param accessKey a {@link java.lang.String} object.
     * @param secretKey a {@link java.lang.String} object.
     * @param applicationName a {@link java.lang.String} object.
     * @param applicationVersion a {@link java.lang.String} object.
     */
    public MarketplaceWebServiceOrdersAsyncClient(
            String accessKey,
            String secretKey,
            String applicationName,
            String applicationVersion) {
        super(accessKey, secretKey, applicationName, applicationVersion);
    }

    /** {@inheritDoc} */
    public Future<GetOrderResponse> getOrderAsync(
        GetOrderRequest request) {
        return connection.callAsync(
            new RequestType("GetOrder", GetOrderResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<GetServiceStatusResponse> getServiceStatusAsync(
        GetServiceStatusRequest request) {
        return connection.callAsync(
            new RequestType("GetServiceStatus", GetServiceStatusResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListOrderItemsResponse> listOrderItemsAsync(
        ListOrderItemsRequest request) {
        return connection.callAsync(
            new RequestType("ListOrderItems", ListOrderItemsResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListOrderItemsByNextTokenResponse> listOrderItemsByNextTokenAsync(
        ListOrderItemsByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListOrderItemsByNextToken", ListOrderItemsByNextTokenResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListOrdersResponse> listOrdersAsync(
        ListOrdersRequest request) {
        return connection.callAsync(
            new RequestType("ListOrders", ListOrdersResponse.class, servicePath),
            request);
    }

    /** {@inheritDoc} */
    public Future<ListOrdersByNextTokenResponse> listOrdersByNextTokenAsync(
        ListOrdersByNextTokenRequest request) {
        return connection.callAsync(
            new RequestType("ListOrdersByNextToken", ListOrdersByNextTokenResponse.class, servicePath),
            request);
    }


}
