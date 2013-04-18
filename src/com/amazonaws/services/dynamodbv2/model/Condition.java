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
 * Condition
 */
public class Condition  implements Serializable  {

    private java.util.List<AttributeValue> attributeValueList;

    private String comparisonOperator;

    /**
     * Default constructor for a new Condition object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Condition() {}
    
    /**
     * Returns the value of the AttributeValueList property for this object.
     *
     * @return The value of the AttributeValueList property for this object.
     */
    public java.util.List<AttributeValue> getAttributeValueList() {
        
        return attributeValueList;
    }
    
    /**
     * Sets the value of the AttributeValueList property for this object.
     *
     * @param attributeValueList The new value for the AttributeValueList property for this object.
     */
    public void setAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
            return;
        }

        java.util.List<AttributeValue> attributeValueListCopy = new java.util.ArrayList<AttributeValue>(attributeValueList.size());
        attributeValueListCopy.addAll(attributeValueList);
        this.attributeValueList = attributeValueListCopy;
    }
    
    /**
     * Sets the value of the AttributeValueList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList The new value for the AttributeValueList property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Condition withAttributeValueList(AttributeValue... attributeValueList) {
        if (getAttributeValueList() == null) setAttributeValueList(new java.util.ArrayList<AttributeValue>(attributeValueList.length));
        for (AttributeValue value : attributeValueList) {
            getAttributeValueList().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributeValueList property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValueList The new value for the AttributeValueList property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Condition withAttributeValueList(java.util.Collection<AttributeValue> attributeValueList) {
        if (attributeValueList == null) {
            this.attributeValueList = null;
        } else {
            java.util.List<AttributeValue> attributeValueListCopy = new java.util.ArrayList<AttributeValue>(attributeValueList.size());
            attributeValueListCopy.addAll(attributeValueList);
            this.attributeValueList = attributeValueListCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the ComparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @return The value of the ComparisonOperator property for this object.
     *
     * @see ComparisonOperator
     */
    public String getComparisonOperator() {
        return comparisonOperator;
    }
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @see ComparisonOperator
     */
    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }
    
    /**
     * Sets the value of the ComparisonOperator property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EQ, NE, IN, LE, LT, GE, GT, BETWEEN, NOT_NULL, NULL, CONTAINS, NOT_CONTAINS, BEGINS_WITH
     *
     * @param comparisonOperator The new value for the ComparisonOperator property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ComparisonOperator
     */
    public Condition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
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
        if (getAttributeValueList() != null) sb.append("AttributeValueList: " + getAttributeValueList() + ",");    	
        if (getComparisonOperator() != null) sb.append("ComparisonOperator: " + getComparisonOperator() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeValueList() == null) ? 0 : getAttributeValueList().hashCode()); 
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Condition == false) return false;
        Condition other = (Condition)obj;
        
        if (other.getAttributeValueList() == null ^ this.getAttributeValueList() == null) return false;
        if (other.getAttributeValueList() != null && other.getAttributeValueList().equals(this.getAttributeValueList()) == false) return false; 
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null) return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false) return false; 
        return true;
    }
    
}
    