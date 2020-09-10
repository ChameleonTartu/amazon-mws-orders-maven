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
 * Buyer Customized Info Detail
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import com.amazonservices.mws.client.*;

/**
 * BuyerCustomizedInfoDetail complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="BuyerCustomizedInfoDetail"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="CustomizedURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class BuyerCustomizedInfoDetail extends AbstractMwsObject {

    private String customizedURL;

    /**
     * Get the value of CustomizedURL.
     *
     * @return The value of CustomizedURL.
     */
    public String getCustomizedURL() {
        return customizedURL;
    }

    /**
     * Set the value of CustomizedURL.
     *
     * @param customizedURL
     *            The new value to set.
     */
    public void setCustomizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
    }

    /**
     * Check to see if CustomizedURL is set.
     *
     * @return true if CustomizedURL is set.
     */
    public boolean isSetCustomizedURL() {
        return customizedURL != null;
    }

    /**
     * Set the value of CustomizedURL, return this.
     *
     * @param customizedURL
     *             The new value to set.
     * @return This instance.
     */
    public BuyerCustomizedInfoDetail withCustomizedURL(String customizedURL) {
        this.customizedURL = customizedURL;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        customizedURL = r.read("CustomizedURL", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("CustomizedURL", customizedURL);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "BuyerCustomizedInfoDetail",this);
    }


    /**
     * Default constructor.
     */
    public BuyerCustomizedInfoDetail() {
        super();
    }

}
