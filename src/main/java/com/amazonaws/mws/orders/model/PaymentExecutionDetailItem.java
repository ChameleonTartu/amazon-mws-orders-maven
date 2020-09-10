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
 * Payment Execution Detail Item
 * API Version: 2013-09-01
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import com.amazonservices.mws.client.*;

/**
 * PaymentExecutionDetailItem complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="PaymentExecutionDetailItem"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="Payment" type="{https://mws.amazonservices.com/Orders/2013-09-01}Money"/&gt;
 *             &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * @author dmytro
 * @version $Id: $Id
 */
public class PaymentExecutionDetailItem extends AbstractMwsObject {

    private Money payment;

    private String paymentMethod;

    /**
     * Get the value of Payment.
     *
     * @return The value of Payment.
     */
    public Money getPayment() {
        return payment;
    }

    /**
     * Set the value of Payment.
     *
     * @param payment
     *            The new value to set.
     */
    public void setPayment(Money payment) {
        this.payment = payment;
    }

    /**
     * Check to see if Payment is set.
     *
     * @return true if Payment is set.
     */
    public boolean isSetPayment() {
        return payment != null;
    }

    /**
     * Set the value of Payment, return this.
     *
     * @param payment
     *             The new value to set.
     * @return This instance.
     */
    public PaymentExecutionDetailItem withPayment(Money payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Get the value of PaymentMethod.
     *
     * @return The value of PaymentMethod.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Set the value of PaymentMethod.
     *
     * @param paymentMethod
     *            The new value to set.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Check to see if PaymentMethod is set.
     *
     * @return true if PaymentMethod is set.
     */
    public boolean isSetPaymentMethod() {
        return paymentMethod != null;
    }

    /**
     * Set the value of PaymentMethod, return this.
     *
     * @param paymentMethod
     *             The new value to set.
     * @return This instance.
     */
    public PaymentExecutionDetailItem withPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * Read members from a MwsReader.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        payment = r.read("Payment", Money.class);
        paymentMethod = r.read("PaymentMethod", String.class);
    }

    /**
     * {@inheritDoc}
     *
     * Write members to a MwsWriter.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("Payment", payment);
        w.write("PaymentMethod", paymentMethod);
    }

    /**
     * {@inheritDoc}
     *
     * Write tag, xmlns and members to a MwsWriter.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("https://mws.amazonservices.com/Orders/2013-09-01", "PaymentExecutionDetailItem",this);
    }

    /**
     * Value constructor.
     *
     * @param payment a {@link com.amazonaws.mws.orders.model.Money} object.
     * @param paymentMethod a {@link java.lang.String} object.
     */
    public PaymentExecutionDetailItem(Money payment,String paymentMethod) {
        this.payment = payment;
        this.paymentMethod = paymentMethod;
    }    

    /**
     * Default constructor.
     */
    public PaymentExecutionDetailItem() {
        super();
    }

}