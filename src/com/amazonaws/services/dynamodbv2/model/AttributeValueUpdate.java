/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;
import java.io.Serializable;

/**
 * Attribute Value Update
 */
public class AttributeValueUpdate  implements Serializable  {

    private AttributeValue value;

    private String action;

    /**
     * Default constructor for a new AttributeValueUpdate object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AttributeValueUpdate() {}
    
    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value
     * @param action
     */
    public AttributeValueUpdate(AttributeValue value, String action) {
        this.value = value;
        this.action = action;
    }

    
    
    /**
     * Constructs a new AttributeValueUpdate object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param value
     * @param action
     */
    public AttributeValueUpdate(AttributeValue value, AttributeAction action) {
        this.value = value;
        this.action = action.toString();
    }
    
    /**
     * Returns the value of the Value property for this object.
     *
     * @return The value of the Value property for this object.
     */
    public AttributeValue getValue() {
        return value;
    }
    
    /**
     * Sets the value of the Value property for this object.
     *
     * @param value The new value for the Value property for this object.
     */
    public void setValue(AttributeValue value) {
        this.value = value;
    }
    
    /**
     * Sets the value of the Value property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param value The new value for the Value property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttributeValueUpdate withValue(AttributeValue value) {
        this.value = value;
        return this;
    }
    
    
    /**
     * Returns the value of the Action property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @return The value of the Action property for this object.
     *
     * @see AttributeAction
     */
    public String getAction() {
        return action;
    }
    
    /**
     * Sets the value of the Action property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The new value for the Action property for this object.
     *
     * @see AttributeAction
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * Sets the value of the Action property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The new value for the Action property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(String action) {
        this.action = action;
        return this;
    }
    
    
    /**
     * Sets the value of the Action property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The new value for the Action property for this object.
     *
     * @see AttributeAction
     */
    public void setAction(AttributeAction action) {
        this.action = action.toString();
    }
    
    /**
     * Sets the value of the Action property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADD, PUT, DELETE
     *
     * @param action The new value for the Action property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see AttributeAction
     */
    public AttributeValueUpdate withAction(AttributeAction action) {
        this.action = action.toString();
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
        if (getValue() != null) sb.append("Value: " + getValue() + ",");    	
        if (getAction() != null) sb.append("Action: " + getAction() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttributeValueUpdate == false) return false;
        AttributeValueUpdate other = (AttributeValueUpdate)obj;
        
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        return true;
    }
    
}
    