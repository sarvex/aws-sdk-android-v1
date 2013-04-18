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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#scan(ScanRequest) Scan operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#scan(ScanRequest)
 */
public class ScanRequest extends AmazonWebServiceRequest  implements Serializable  {

    private String tableName;

    private java.util.List<String> attributesToGet;

    private Integer limit;

    private String select;

    private java.util.Map<String,Condition> scanFilter;

    private java.util.Map<String,AttributeValue> exclusiveStartKey;

    private String returnConsumedCapacity;

    /**
     * Default constructor for a new ScanRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ScanRequest() {}
    
    /**
     * Constructs a new ScanRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     */
    public ScanRequest(String tableName) {
        this.tableName = tableName;
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
    public ScanRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * Returns the value of the AttributesToGet property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return The value of the AttributesToGet property for this object.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributesToGet property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet The new value for the AttributesToGet property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The value of the Limit property for this object.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * Sets the value of the Limit property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The new value for the Limit property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    
    /**
     * Returns the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @return The value of the Select property for this object.
     *
     * @see Select
     */
    public String getSelect() {
        return select;
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @see Select
     */
    public void setSelect(String select) {
        this.select = select;
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Select
     */
    public ScanRequest withSelect(String select) {
        this.select = select;
        return this;
    }
    
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @see Select
     */
    public void setSelect(Select select) {
        this.select = select.toString();
    }
    
    /**
     * Sets the value of the Select property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_ATTRIBUTES, ALL_PROJECTED_ATTRIBUTES, SPECIFIC_ATTRIBUTES, COUNT
     *
     * @param select The new value for the Select property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see Select
     */
    public ScanRequest withSelect(Select select) {
        this.select = select.toString();
        return this;
    }
    
    /**
     * Returns the value of the ScanFilter property for this object.
     *
     * @return The value of the ScanFilter property for this object.
     */
    public java.util.Map<String,Condition> getScanFilter() {
        
        return scanFilter;

    }
    
    /**
     * Sets the value of the ScanFilter property for this object.
     *
     * @param scanFilter The new value for the ScanFilter property for this object.
     */
    public void setScanFilter(java.util.Map<String,Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }
    
    /**
     * Sets the value of the ScanFilter property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanFilter The new value for the ScanFilter property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withScanFilter(java.util.Map<String,Condition> scanFilter) {
        setScanFilter(scanFilter);
        return this;
    }
    
    /**
     * Returns the value of the ExclusiveStartKey property for this object.
     *
     * @return The value of the ExclusiveStartKey property for this object.
     */
    public java.util.Map<String,AttributeValue> getExclusiveStartKey() {
        
        return exclusiveStartKey;

    }
    
    /**
     * Sets the value of the ExclusiveStartKey property for this object.
     *
     * @param exclusiveStartKey The new value for the ExclusiveStartKey property for this object.
     */
    public void setExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * Sets the value of the ExclusiveStartKey property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey The new value for the ExclusiveStartKey property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ScanRequest withExclusiveStartKey(java.util.Map<String,AttributeValue> exclusiveStartKey) {
        setExclusiveStartKey(exclusiveStartKey);
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
    public ScanRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public ScanRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");    	
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");    	
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");    	
        if (getSelect() != null) sb.append("Select: " + getSelect() + ",");    	
        if (getScanFilter() != null) sb.append("ScanFilter: " + getScanFilter() + ",");    	
        if (getExclusiveStartKey() != null) sb.append("ExclusiveStartKey: " + getExclusiveStartKey() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((getSelect() == null) ? 0 : getSelect().hashCode()); 
        hashCode = prime * hashCode + ((getScanFilter() == null) ? 0 : getScanFilter().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScanRequest == false) return false;
        ScanRequest other = (ScanRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.getSelect() == null ^ this.getSelect() == null) return false;
        if (other.getSelect() != null && other.getSelect().equals(this.getSelect()) == false) return false; 
        if (other.getScanFilter() == null ^ this.getScanFilter() == null) return false;
        if (other.getScanFilter() != null && other.getScanFilter().equals(this.getScanFilter()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    