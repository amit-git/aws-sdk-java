/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetThingShadowRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String thingName;

    /**
     * Sets the value of the ThingName property for this object.
     * 
     * @param thingName
     *        The new value for the ThingName property for this object.
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * Returns the value of the ThingName property for this object.
     * 
     * @return The value of the ThingName property for this object.
     */
    public String getThingName() {
        return this.thingName;
    }

    /**
     * Sets the value of the ThingName property for this object.
     * 
     * @param thingName
     *        The new value for the ThingName property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetThingShadowRequest withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getThingName() != null)
            sb.append("ThingName: " + getThingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetThingShadowRequest == false)
            return false;
        GetThingShadowRequest other = (GetThingShadowRequest) obj;
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThingName() == null) ? 0 : getThingName().hashCode());
        return hashCode;
    }

    @Override
    public GetThingShadowRequest clone() {
        return (GetThingShadowRequest) super.clone();
    }
}