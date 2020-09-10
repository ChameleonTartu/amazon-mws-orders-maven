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
 * List Orders By Next Token Response
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import com.amazonservices.mws.client.*;

/**
 * ListOrdersByNextTokenResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ListOrdersByNextTokenResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ListOrdersByNextTokenResult" type="{https://mws.amazonservices.com/Orders/2013-09-01}ListOrdersByNextTokenResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{https://mws.amazonservices.com/Orders/2013-09-01}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class ListOrdersByNextTokenResponse extends AbstractMwsObject implements MWSResponse {

    private ListOrdersByNextTokenResult listOrdersByNextTokenResult;

    private ResponseMetadata responseMetadata;

    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ListOrdersByNextTokenResult.
     *
     * @return The value of ListOrdersByNextTokenResult.
     */
    public ListOrdersByNextTokenResult getListOrdersByNextTokenResult() {
        return listOrdersByNextTokenResult;
    }

    /**
     * Set the value of ListOrdersByNextTokenResult.
     *
     * @param listOrdersByNextTokenResult
     *            The new value to set.
     */
    public void setListOrdersByNextTokenResult(ListOrdersByNextTokenResult listOrdersByNextTokenResult) {
        this.listOrdersByNextTokenResult = listOrdersByNextTokenResult;
    }

    /**
     * Check to see if ListOrdersByNextTokenResult is set.
     *
     * @return true if ListOrdersByNextTokenResult is set.
     */
    public boolean isSetListOrdersByNextTokenResult() {
        return listOrdersByNextTokenResult != null;
    }

    /**
     * Set the value of ListOrdersByNextTokenResult, return this.
     *
     * @param listOrdersByNextTokenResult
     *             The new value to set.
     * @return This instance.
     */
    public ListOrdersByNextTokenResponse withListOrdersByNextTokenResult(ListOrdersByNextTokenResult listOrdersByNextTokenResult) {
        this.listOrdersByNextTokenResult = listOrdersByNextTokenResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ListOrdersByNextTokenResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * {@inheritDoc}
     *
     * Set the value of ResponseHeaderMetadata.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     * @return This instance.
     */
    public ListOrdersByNextTokenResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        listOrdersByNextTokenResult = r.read("ListOrdersByNextTokenResult", ListOrdersByNextTokenResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ListOrdersByNextTokenResult", listOrdersByNextTokenResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "ListOrdersByNextTokenResponse",this);
    }


    /**
     * Default constructor.
     */
    public ListOrdersByNextTokenResponse() {
        super();
    }

}