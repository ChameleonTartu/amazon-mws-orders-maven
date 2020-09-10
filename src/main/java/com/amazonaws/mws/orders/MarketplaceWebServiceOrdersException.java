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

import com.amazonaws.mws.orders.model.ResponseHeaderMetadata;
import com.amazonservices.mws.client.MwsException;
import com.amazonservices.mws.client.MwsResponseHeaderMetadata;

/**
 * Exceptions thrown by MarketplaceWebServiceOrders operations.
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class MarketplaceWebServiceOrdersException extends MwsException {

    /** For serialization. */
    private static final long serialVersionUID = 1L;

    /** {@inheritDoc} */
    @Override
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        MwsResponseHeaderMetadata baseRHMD = super.getResponseHeaderMetadata();
        if(baseRHMD != null) {
            return new ResponseHeaderMetadata(baseRHMD);
        } else {
            return null;
        }
    }

    /**
     * <p>setResponseHeaderMetadata.</p>
     *
     * @param rhmd a {@link com.amazonaws.mws.orders.model.ResponseHeaderMetadata} object.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd) {
        super.setResponseHeaderMetadata(rhmd);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public MarketplaceWebServiceOrdersException(String message) {
        super(0, message, null);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     */
    public MarketplaceWebServiceOrdersException(String message, int statusCode) {
        super(statusCode, message, null);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param t a {@link java.lang.Throwable} object.
     */
    public MarketplaceWebServiceOrdersException(Throwable t) {
        super(0, null, t);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param t a {@link java.lang.Throwable} object.
     */
    public MarketplaceWebServiceOrdersException(String message, Throwable t) {
        super(0, message, t);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     * @param errorCode a {@link java.lang.String} object.
     * @param errorType a {@link java.lang.String} object.
     * @param requestId a {@link java.lang.String} object.
     * @param xml a {@link java.lang.String} object.
     * @param rhmd a {@link com.amazonaws.mws.orders.model.ResponseHeaderMetadata} object.
     */
    public MarketplaceWebServiceOrdersException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml, ResponseHeaderMetadata rhmd) {
        super(statusCode, message, errorCode, errorType, xml, rhmd);
    }

    /**
     * <p>Constructor for MarketplaceWebServiceOrdersException.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param statusCode a int.
     * @param errorCode a {@link java.lang.String} object.
     * @param errorType a {@link java.lang.String} object.
     * @param requestId a {@link java.lang.String} object.
     * @param xml a {@link java.lang.String} object.
     */
    public MarketplaceWebServiceOrdersException(String message, int statusCode, 
         String errorCode, String errorType, String requestId,
         String xml) {
        super(statusCode, message, errorCode, errorType, xml, null);
    }

}

