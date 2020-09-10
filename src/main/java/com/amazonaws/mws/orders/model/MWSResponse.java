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
 * Library Version: 2020-05-11
 * Generated: Fri May 08 09:10:34 GMT 2020
 */
package com.amazonaws.mws.orders.model;

import com.amazonservices.mws.client.MwsObject;

/**
 * Interface implemented by responses.
 *
 * @author mayerj
 * @version $Id: $Id
 */
public interface MWSResponse extends MwsObject {

    /**
     * Set the response header metadata.
     *
     * @param rhmd a {@link com.amazonaws.mws.orders.model.ResponseHeaderMetadata} object.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata rhmd);

    /**
     * Get the response header metadata.
     *
     * @return The response header metadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata();

}
