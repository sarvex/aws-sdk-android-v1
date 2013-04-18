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
 * Delete Item Result
 */
public class DeleteItemResult  implements Serializable  {

    private java.util.Map<String,AttributeValue> attributes;

    private ConsumedCapacity consumedCapacity;

    private ItemCollectionMetrics itemCollectionMetrics;

    /**
     * Returns the value of the Attributes property for this object.
     *
     * @return The value of the Attributes property for this object.
     */
    public java.util.Map<String,AttributeValue> getAttributes() {
        
        return attributes;

    }
    
    /**
     * Sets the value of the Attributes property for this object.
     *
     * @param attributes The new value for the Attributes property for this object.
     */
    public void setAttributes(java.util.Map<String,AttributeValue> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Sets the value of the Attributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes The new value for the Attributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemResult withAttributes(java.util.Map<String,AttributeValue> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * Returns the value of the ConsumedCapacity property for this object.
     *
     * @return The value of the ConsumedCapacity property for this object.
     */
    public ConsumedCapacity getConsumedCapacity() {
        return consumedCapacity;
    }
    
    /**
     * Sets the value of the ConsumedCapacity property for this object.
     *
     * @param consumedCapacity The new value for the ConsumedCapacity property for this object.
     */
    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }
    
    /**
     * Sets the value of the ConsumedCapacity property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The new value for the ConsumedCapacity property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }
    
    
    /**
     * Returns the value of the ItemCollectionMetrics property for this
     * object.
     *
     * @return The value of the ItemCollectionMetrics property for this object.
     */
    public ItemCollectionMetrics getItemCollectionMetrics() {
        return itemCollectionMetrics;
    }
    
    /**
     * Sets the value of the ItemCollectionMetrics property for this object.
     *
     * @param itemCollectionMetrics The new value for the ItemCollectionMetrics property for this object.
     */
    public void setItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }
    
    /**
     * Sets the value of the ItemCollectionMetrics property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCollectionMetrics The new value for the ItemCollectionMetrics property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemResult withItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
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
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() + ",");    	
        if (getItemCollectionMetrics() != null) sb.append("ItemCollectionMetrics: " + getItemCollectionMetrics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getItemCollectionMetrics() == null) ? 0 : getItemCollectionMetrics().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteItemResult == false) return false;
        DeleteItemResult other = (DeleteItemResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null) return false;
        if (other.getItemCollectionMetrics() != null && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false) return false; 
        return true;
    }
    
}
    