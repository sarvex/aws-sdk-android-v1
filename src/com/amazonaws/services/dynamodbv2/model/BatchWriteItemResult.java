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
 * Batch Write Item Result
 */
public class BatchWriteItemResult  implements Serializable  {

    private java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems;

    private java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics;

    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * Returns the value of the UnprocessedItems property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return The value of the UnprocessedItems property for this object.
     */
    public java.util.Map<String,java.util.List<WriteRequest>> getUnprocessedItems() {
        
        return unprocessedItems;

    }
    
    /**
     * Sets the value of the UnprocessedItems property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems The new value for the UnprocessedItems property for this object.
     */
    public void setUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        this.unprocessedItems = unprocessedItems;
    }
    
    /**
     * Sets the value of the UnprocessedItems property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems The new value for the UnprocessedItems property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchWriteItemResult withUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        setUnprocessedItems(unprocessedItems);
        return this;
    }
    
    /**
     * Returns the value of the ItemCollectionMetrics property for this
     * object.
     *
     * @return The value of the ItemCollectionMetrics property for this object.
     */
    public java.util.Map<String,java.util.List<ItemCollectionMetrics>> getItemCollectionMetrics() {
        
        return itemCollectionMetrics;

    }
    
    /**
     * Sets the value of the ItemCollectionMetrics property for this object.
     *
     * @param itemCollectionMetrics The new value for the ItemCollectionMetrics property for this object.
     */
    public void setItemCollectionMetrics(java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
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
    public BatchWriteItemResult withItemCollectionMetrics(java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        setItemCollectionMetrics(itemCollectionMetrics);
        return this;
    }
    
    /**
     * Returns the value of the ConsumedCapacity property for this object.
     *
     * @return The value of the ConsumedCapacity property for this object.
     */
    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        
        return consumedCapacity;
    }
    
    /**
     * Sets the value of the ConsumedCapacity property for this object.
     *
     * @param consumedCapacity The new value for the ConsumedCapacity property for this object.
     */
    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        java.util.List<ConsumedCapacity> consumedCapacityCopy = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.size());
        consumedCapacityCopy.addAll(consumedCapacity);
        this.consumedCapacity = consumedCapacityCopy;
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
    public BatchWriteItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (getConsumedCapacity() == null) setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        for (ConsumedCapacity value : consumedCapacity) {
            getConsumedCapacity().add(value);
        }
        return this;
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
    public BatchWriteItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
        } else {
            java.util.List<ConsumedCapacity> consumedCapacityCopy = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.size());
            consumedCapacityCopy.addAll(consumedCapacity);
            this.consumedCapacity = consumedCapacityCopy;
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
        if (getUnprocessedItems() != null) sb.append("UnprocessedItems: " + getUnprocessedItems() + ",");    	
        if (getItemCollectionMetrics() != null) sb.append("ItemCollectionMetrics: " + getItemCollectionMetrics() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUnprocessedItems() == null) ? 0 : getUnprocessedItems().hashCode()); 
        hashCode = prime * hashCode + ((getItemCollectionMetrics() == null) ? 0 : getItemCollectionMetrics().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchWriteItemResult == false) return false;
        BatchWriteItemResult other = (BatchWriteItemResult)obj;
        
        if (other.getUnprocessedItems() == null ^ this.getUnprocessedItems() == null) return false;
        if (other.getUnprocessedItems() != null && other.getUnprocessedItems().equals(this.getUnprocessedItems()) == false) return false; 
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null) return false;
        if (other.getItemCollectionMetrics() != null && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    