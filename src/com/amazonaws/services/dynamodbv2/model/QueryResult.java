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
 * Query Result
 */
public class QueryResult  implements Serializable  {

    private java.util.List<java.util.Map<String,AttributeValue>> items;

    private Integer count;

    private java.util.Map<String,AttributeValue> lastEvaluatedKey;

    private ConsumedCapacity consumedCapacity;

    /**
     * Returns the value of the Items property for this object.
     *
     * @return The value of the Items property for this object.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getItems() {
        
        return items;
    }
    
    /**
     * Sets the value of the Items property for this object.
     *
     * @param items The new value for the Items property for this object.
     */
    public void setItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * Sets the value of the Items property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items The new value for the Items property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withItems(java.util.Map<String,AttributeValue>... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.length));
        for (java.util.Map<String,AttributeValue> value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Items property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items The new value for the Items property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
        } else {
            java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Count property for this object.
     *
     * @return The value of the Count property for this object.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     *
     * @param count The new value for the Count property for this object.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Sets the value of the Count property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count The new value for the Count property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withCount(Integer count) {
        this.count = count;
        return this;
    }
    
    
    /**
     * Returns the value of the LastEvaluatedKey property for this object.
     *
     * @return The value of the LastEvaluatedKey property for this object.
     */
    public java.util.Map<String,AttributeValue> getLastEvaluatedKey() {
        
        return lastEvaluatedKey;

    }
    
    /**
     * Sets the value of the LastEvaluatedKey property for this object.
     *
     * @param lastEvaluatedKey The new value for the LastEvaluatedKey property for this object.
     */
    public void setLastEvaluatedKey(java.util.Map<String,AttributeValue> lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }
    
    /**
     * Sets the value of the LastEvaluatedKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastEvaluatedKey The new value for the LastEvaluatedKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withLastEvaluatedKey(java.util.Map<String,AttributeValue> lastEvaluatedKey) {
        setLastEvaluatedKey(lastEvaluatedKey);
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
    public QueryResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
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
        if (getItems() != null) sb.append("Items: " + getItems() + ",");    	
        if (getCount() != null) sb.append("Count: " + getCount() + ",");    	
        if (getLastEvaluatedKey() != null) sb.append("LastEvaluatedKey: " + getLastEvaluatedKey() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof QueryResult == false) return false;
        QueryResult other = (QueryResult)obj;
        
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null) return false;
        if (other.getLastEvaluatedKey() != null && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    