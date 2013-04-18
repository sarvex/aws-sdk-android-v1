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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest) BatchGetItem operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest)
 */
public class BatchGetItemRequest extends AmazonWebServiceRequest  implements Serializable  {

    private java.util.Map<String,KeysAndAttributes> requestItems;

    private String returnConsumedCapacity;

    /**
     * Returns the value of the RequestItems property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The value of the RequestItems property for this object.
     */
    public java.util.Map<String,KeysAndAttributes> getRequestItems() {
        
        return requestItems;

    }
    
    /**
     * Sets the value of the RequestItems property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems The new value for the RequestItems property for this object.
     */
    public void setRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * Sets the value of the RequestItems property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems The new value for the RequestItems property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemRequest withRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
        return this;
    }
    
    /**
     * Returns the value of the ReturnConsumedCapacity property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return The value of the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public BatchGetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }
    
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * Sets the value of the ReturnConsumedCapacity property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity The new value for the ReturnConsumedCapacity property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public BatchGetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
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
        if (getRequestItems() != null) sb.append("RequestItems: " + getRequestItems() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchGetItemRequest == false) return false;
        BatchGetItemRequest other = (BatchGetItemRequest)obj;
        
        if (other.getRequestItems() == null ^ this.getRequestItems() == null) return false;
        if (other.getRequestItems() != null && other.getRequestItems().equals(this.getRequestItems()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    