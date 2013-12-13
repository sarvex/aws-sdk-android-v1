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
 * <p>
 * The table name that consumed provisioned throughput, and the number of capacity units consumed by it. <i>ConsumedCapacity</i> is only returned if it
 * was asked for in the request. For more information, see <a
 * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"> Provisioned Throughput </a> in the Amazon
 * DynamoDB Developer Guide.
 * </p>
 */
public class ConsumedCapacity implements Serializable {

    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * The total number of capacity units consumed.
     */
    private Double capacityUnits;

    private Capacity table;

    private java.util.Map<String,Capacity> localSecondaryIndexes;

    private java.util.Map<String,Capacity> globalSecondaryIndexes;

    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The table that consumed the provisioned throughput.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The table that consumed the provisioned throughput.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The table that consumed the provisioned throughput.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The table that consumed the provisioned throughput.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * The total number of capacity units consumed.
     *
     * @return The total number of capacity units consumed.
     */
    public Double getCapacityUnits() {
        return capacityUnits;
    }
    
    /**
     * The total number of capacity units consumed.
     *
     * @param capacityUnits The total number of capacity units consumed.
     */
    public void setCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
    }
    
    /**
     * The total number of capacity units consumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param capacityUnits The total number of capacity units consumed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withCapacityUnits(Double capacityUnits) {
        this.capacityUnits = capacityUnits;
        return this;
    }

    /**
     * Returns the value of the Table property for this object.
     *
     * @return The value of the Table property for this object.
     */
    public Capacity getTable() {
        return table;
    }
    
    /**
     * Sets the value of the Table property for this object.
     *
     * @param table The new value for the Table property for this object.
     */
    public void setTable(Capacity table) {
        this.table = table;
    }
    
    /**
     * Sets the value of the Table property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param table The new value for the Table property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withTable(Capacity table) {
        this.table = table;
        return this;
    }

    /**
     * Returns the value of the LocalSecondaryIndexes property for this
     * object.
     *
     * @return The value of the LocalSecondaryIndexes property for this object.
     */
    public java.util.Map<String,Capacity> getLocalSecondaryIndexes() {
        
        return localSecondaryIndexes;
    }
    
    /**
     * Sets the value of the LocalSecondaryIndexes property for this object.
     *
     * @param localSecondaryIndexes The new value for the LocalSecondaryIndexes property for this object.
     */
    public void setLocalSecondaryIndexes(java.util.Map<String,Capacity> localSecondaryIndexes) {
        this.localSecondaryIndexes = localSecondaryIndexes;
    }
    
    /**
     * Sets the value of the LocalSecondaryIndexes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param localSecondaryIndexes The new value for the LocalSecondaryIndexes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withLocalSecondaryIndexes(java.util.Map<String,Capacity> localSecondaryIndexes) {
        setLocalSecondaryIndexes(localSecondaryIndexes);
        return this;
    }

    /**
     * Sets the value of the LocalSecondaryIndexes property for this object.
     * <p>
     * The method adds a new key-value pair into LocalSecondaryIndexes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into LocalSecondaryIndexes.
     * @param value The corresponding value of the entry to be added into LocalSecondaryIndexes.
     */
	public ConsumedCapacity addLocalSecondaryIndexesEntry(String key, Capacity value) {
		if (null == this.localSecondaryIndexes) {
			this.localSecondaryIndexes = new java.util.HashMap<String,Capacity>();
		}
		if (this.localSecondaryIndexes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.localSecondaryIndexes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into LocalSecondaryIndexes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public ConsumedCapacity clearLocalSecondaryIndexesEntries() {
		this.localSecondaryIndexes = null;
		return this;
	}
	
    /**
     * Returns the value of the GlobalSecondaryIndexes property for this
     * object.
     *
     * @return The value of the GlobalSecondaryIndexes property for this object.
     */
    public java.util.Map<String,Capacity> getGlobalSecondaryIndexes() {
        
        return globalSecondaryIndexes;
    }
    
    /**
     * Sets the value of the GlobalSecondaryIndexes property for this object.
     *
     * @param globalSecondaryIndexes The new value for the GlobalSecondaryIndexes property for this object.
     */
    public void setGlobalSecondaryIndexes(java.util.Map<String,Capacity> globalSecondaryIndexes) {
        this.globalSecondaryIndexes = globalSecondaryIndexes;
    }
    
    /**
     * Sets the value of the GlobalSecondaryIndexes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param globalSecondaryIndexes The new value for the GlobalSecondaryIndexes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConsumedCapacity withGlobalSecondaryIndexes(java.util.Map<String,Capacity> globalSecondaryIndexes) {
        setGlobalSecondaryIndexes(globalSecondaryIndexes);
        return this;
    }

    /**
     * Sets the value of the GlobalSecondaryIndexes property for this object.
     * <p>
     * The method adds a new key-value pair into GlobalSecondaryIndexes
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into GlobalSecondaryIndexes.
     * @param value The corresponding value of the entry to be added into GlobalSecondaryIndexes.
     */
	public ConsumedCapacity addGlobalSecondaryIndexesEntry(String key, Capacity value) {
		if (null == this.globalSecondaryIndexes) {
			this.globalSecondaryIndexes = new java.util.HashMap<String,Capacity>();
		}
		if (this.globalSecondaryIndexes.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.globalSecondaryIndexes.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into GlobalSecondaryIndexes.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public ConsumedCapacity clearGlobalSecondaryIndexesEntries() {
		this.globalSecondaryIndexes = null;
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
        if (getCapacityUnits() != null) sb.append("CapacityUnits: " + getCapacityUnits() + ",");
        if (getTable() != null) sb.append("Table: " + getTable() + ",");
        if (getLocalSecondaryIndexes() != null) sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        if (getGlobalSecondaryIndexes() != null) sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getCapacityUnits() == null) ? 0 : getCapacityUnits().hashCode()); 
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode()); 
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode()); 
        hashCode = prime * hashCode + ((getGlobalSecondaryIndexes() == null) ? 0 : getGlobalSecondaryIndexes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConsumedCapacity == false) return false;
        ConsumedCapacity other = (ConsumedCapacity)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getCapacityUnits() == null ^ this.getCapacityUnits() == null) return false;
        if (other.getCapacityUnits() != null && other.getCapacityUnits().equals(this.getCapacityUnits()) == false) return false; 
        if (other.getTable() == null ^ this.getTable() == null) return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false) return false; 
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null) return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false) return false; 
        if (other.getGlobalSecondaryIndexes() == null ^ this.getGlobalSecondaryIndexes() == null) return false;
        if (other.getGlobalSecondaryIndexes() != null && other.getGlobalSecondaryIndexes().equals(this.getGlobalSecondaryIndexes()) == false) return false; 
        return true;
    }
    
}
    