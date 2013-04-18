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
 * Batch Get Item Result
 */
public class BatchGetItemResult  implements Serializable  {

    private java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses;

    private java.util.Map<String,KeysAndAttributes> unprocessedKeys;

    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * Returns the value of the Responses property for this object.
     *
     * @return The value of the Responses property for this object.
     */
    public java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> getResponses() {
        
        return responses;

    }
    
    /**
     * Sets the value of the Responses property for this object.
     *
     * @param responses The new value for the Responses property for this object.
     */
    public void setResponses(java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses) {
        this.responses = responses;
    }
    
    /**
     * Sets the value of the Responses property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responses The new value for the Responses property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withResponses(java.util.Map<String,java.util.List<java.util.Map<String,AttributeValue>>> responses) {
        setResponses(responses);
        return this;
    }
    
    /**
     * Returns the value of the UnprocessedKeys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The value of the UnprocessedKeys property for this object.
     */
    public java.util.Map<String,KeysAndAttributes> getUnprocessedKeys() {
        
        return unprocessedKeys;

    }
    
    /**
     * Sets the value of the UnprocessedKeys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys The new value for the UnprocessedKeys property for this object.
     */
    public void setUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        this.unprocessedKeys = unprocessedKeys;
    }
    
    /**
     * Sets the value of the UnprocessedKeys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param unprocessedKeys The new value for the UnprocessedKeys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemResult withUnprocessedKeys(java.util.Map<String,KeysAndAttributes> unprocessedKeys) {
        setUnprocessedKeys(unprocessedKeys);
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
    public BatchGetItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
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
    public BatchGetItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
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
        if (getResponses() != null) sb.append("Responses: " + getResponses() + ",");    	
        if (getUnprocessedKeys() != null) sb.append("UnprocessedKeys: " + getUnprocessedKeys() + ",");    	
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode()); 
        hashCode = prime * hashCode + ((getUnprocessedKeys() == null) ? 0 : getUnprocessedKeys().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetItemResult == false) return false;
        BatchGetItemResult other = (BatchGetItemResult)obj;
        
        if (other.getResponses() == null ^ this.getResponses() == null) return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false) return false; 
        if (other.getUnprocessedKeys() == null ^ this.getUnprocessedKeys() == null) return false;
        if (other.getUnprocessedKeys() != null && other.getUnprocessedKeys().equals(this.getUnprocessedKeys()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    