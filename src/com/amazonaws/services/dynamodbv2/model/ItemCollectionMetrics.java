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
 * Item Collection Metrics
 */
public class ItemCollectionMetrics  implements Serializable  {

    private java.util.Map<String,AttributeValue> itemCollectionKey;

    private java.util.List<Double> sizeEstimateRangeGB;

    /**
     * Returns the value of the ItemCollectionKey property for this object.
     *
     * @return The value of the ItemCollectionKey property for this object.
     */
    public java.util.Map<String,AttributeValue> getItemCollectionKey() {
        
        return itemCollectionKey;

    }
    
    /**
     * Sets the value of the ItemCollectionKey property for this object.
     *
     * @param itemCollectionKey The new value for the ItemCollectionKey property for this object.
     */
    public void setItemCollectionKey(java.util.Map<String,AttributeValue> itemCollectionKey) {
        this.itemCollectionKey = itemCollectionKey;
    }
    
    /**
     * Sets the value of the ItemCollectionKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCollectionKey The new value for the ItemCollectionKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ItemCollectionMetrics withItemCollectionKey(java.util.Map<String,AttributeValue> itemCollectionKey) {
        setItemCollectionKey(itemCollectionKey);
        return this;
    }
    
    /**
     * Returns the value of the SizeEstimateRangeGB property for this object.
     *
     * @return The value of the SizeEstimateRangeGB property for this object.
     */
    public java.util.List<Double> getSizeEstimateRangeGB() {
        
        return sizeEstimateRangeGB;
    }
    
    /**
     * Sets the value of the SizeEstimateRangeGB property for this object.
     *
     * @param sizeEstimateRangeGB The new value for the SizeEstimateRangeGB property for this object.
     */
    public void setSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        if (sizeEstimateRangeGB == null) {
            this.sizeEstimateRangeGB = null;
            return;
        }

        java.util.List<Double> sizeEstimateRangeGBCopy = new java.util.ArrayList<Double>(sizeEstimateRangeGB.size());
        sizeEstimateRangeGBCopy.addAll(sizeEstimateRangeGB);
        this.sizeEstimateRangeGB = sizeEstimateRangeGBCopy;
    }
    
    /**
     * Sets the value of the SizeEstimateRangeGB property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeEstimateRangeGB The new value for the SizeEstimateRangeGB property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ItemCollectionMetrics withSizeEstimateRangeGB(Double... sizeEstimateRangeGB) {
        if (getSizeEstimateRangeGB() == null) setSizeEstimateRangeGB(new java.util.ArrayList<Double>(sizeEstimateRangeGB.length));
        for (Double value : sizeEstimateRangeGB) {
            getSizeEstimateRangeGB().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the SizeEstimateRangeGB property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeEstimateRangeGB The new value for the SizeEstimateRangeGB property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ItemCollectionMetrics withSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        if (sizeEstimateRangeGB == null) {
            this.sizeEstimateRangeGB = null;
        } else {
            java.util.List<Double> sizeEstimateRangeGBCopy = new java.util.ArrayList<Double>(sizeEstimateRangeGB.size());
            sizeEstimateRangeGBCopy.addAll(sizeEstimateRangeGB);
            this.sizeEstimateRangeGB = sizeEstimateRangeGBCopy;
        }

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
        if (getItemCollectionKey() != null) sb.append("ItemCollectionKey: " + getItemCollectionKey() + ",");    	
        if (getSizeEstimateRangeGB() != null) sb.append("SizeEstimateRangeGB: " + getSizeEstimateRangeGB() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItemCollectionKey() == null) ? 0 : getItemCollectionKey().hashCode()); 
        hashCode = prime * hashCode + ((getSizeEstimateRangeGB() == null) ? 0 : getSizeEstimateRangeGB().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ItemCollectionMetrics == false) return false;
        ItemCollectionMetrics other = (ItemCollectionMetrics)obj;
        
        if (other.getItemCollectionKey() == null ^ this.getItemCollectionKey() == null) return false;
        if (other.getItemCollectionKey() != null && other.getItemCollectionKey().equals(this.getItemCollectionKey()) == false) return false; 
        if (other.getSizeEstimateRangeGB() == null ^ this.getSizeEstimateRangeGB() == null) return false;
        if (other.getSizeEstimateRangeGB() != null && other.getSizeEstimateRangeGB().equals(this.getSizeEstimateRangeGB()) == false) return false; 
        return true;
    }
    
}
    