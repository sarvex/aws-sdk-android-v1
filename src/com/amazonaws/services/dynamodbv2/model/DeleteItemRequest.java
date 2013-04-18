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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest) DeleteItem operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest)
 */
public class DeleteItemRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String tableName;

    private java.util.Map<String,AttributeValue> key;

    private java.util.Map<String,ExpectedAttributeValue> expected;

    private String returnValues;

    private String returnConsumedCapacity;

    private String returnItemCollectionMetrics;

    /**
     * Default constructor for a new DeleteItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteItemRequest() {}
    
    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     * @param key
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key) {
        this.tableName = tableName;
        this.key = key;
    }

    
    
    /**
     * Returns the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the TableName property for this object.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * Sets the value of the TableName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The new value for the TableName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * Returns the value of the Key property for this object.
     *
     * @return The value of the Key property for this object.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;

    }
    
    /**
     * Sets the value of the Key property for this object.
     *
     * @param key The new value for the Key property for this object.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * Sets the value of the Key property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key The new value for the Key property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }
    
    /**
     * Returns the value of the Expected property for this object.
     *
     * @return The value of the Expected property for this object.
     */
    public java.util.Map<String,ExpectedAttributeValue> getExpected() {
        
        return expected;

    }
    
    /**
     * Sets the value of the Expected property for this object.
     *
     * @param expected The new value for the Expected property for this object.
     */
    public void setExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        this.expected = expected;
    }
    
    /**
     * Sets the value of the Expected property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected The new value for the Expected property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DeleteItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }
    
    /**
     * Returns the value of the ReturnValues property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return The value of the ReturnValues property for this object.
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Sets the value of the ReturnValues property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues The new value for the ReturnValues property for this object.
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Sets the value of the ReturnValues property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues The new value for the ReturnValues property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }
    
    
    /**
     * Sets the value of the ReturnValues property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues The new value for the ReturnValues property for this object.
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Sets the value of the ReturnValues property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues The new value for the ReturnValues property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
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
    public DeleteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public DeleteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }
    
    /**
     * Returns the value of the ReturnItemCollectionMetrics property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return The value of the ReturnItemCollectionMetrics property for this object.
     *
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }
    
    /**
     * Sets the value of the ReturnItemCollectionMetrics property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics The new value for the ReturnItemCollectionMetrics property for this
     *         object.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }
    
    /**
     * Sets the value of the ReturnItemCollectionMetrics property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics The new value for the ReturnItemCollectionMetrics property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }
    
    
    /**
     * Sets the value of the ReturnItemCollectionMetrics property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics The new value for the ReturnItemCollectionMetrics property for this
     *         object.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }
    
    /**
     * Sets the value of the ReturnItemCollectionMetrics property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics The new value for the ReturnItemCollectionMetrics property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");    	
        if (getKey() != null) sb.append("Key: " + getKey() + ",");    	
        if (getExpected() != null) sb.append("Expected: " + getExpected() + ",");    	
        if (getReturnValues() != null) sb.append("ReturnValues: " + getReturnValues() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");    	
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode()); 
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteItemRequest == false) return false;
        DeleteItemRequest other = (DeleteItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null) return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false) return false; 
        return true;
    }
    
}
    