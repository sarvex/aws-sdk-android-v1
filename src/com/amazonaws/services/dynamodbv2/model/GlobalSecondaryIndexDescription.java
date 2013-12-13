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
 * Global Secondary Index Description
 */
public class GlobalSecondaryIndexDescription implements Serializable {

    private String indexName;

    private com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchema;

    /**
     * Represents attributes that are copied (projected) from the table into
     * the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     */
    private Projection projection;

    private String indexStatus;

    /**
     * Describes the provisioned throughput settings for the table,
     * consisting of read and write capacity units, along with data about
     * increases and decreases.
     */
    private ProvisionedThroughputDescription provisionedThroughput;

    private Long indexSizeBytes;

    private Long itemCount;

    /**
     * Returns the value of the IndexName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The value of the IndexName property for this object.
     */
    public String getIndexName() {
        return indexName;
    }
    
    /**
     * Sets the value of the IndexName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The new value for the IndexName property for this object.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }
    
    /**
     * Sets the value of the IndexName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param indexName The new value for the IndexName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * Returns the value of the KeySchema property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The value of the KeySchema property for this object.
     */
    public java.util.List<KeySchemaElement> getKeySchema() {
        return keySchema;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     */
    public void setKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
        keySchemaCopy.addAll(keySchema);
        this.keySchema = keySchemaCopy;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withKeySchema(KeySchemaElement... keySchema) {
        if (getKeySchema() == null) setKeySchema(new java.util.ArrayList<KeySchemaElement>(keySchema.length));
        for (KeySchemaElement value : keySchema) {
            getKeySchema().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the KeySchema property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param keySchema The new value for the KeySchema property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement> keySchemaCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }

    /**
     * Represents attributes that are copied (projected) from the table into
     * the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @return Represents attributes that are copied (projected) from the table into
     *         the index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public Projection getProjection() {
        return projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         the index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     */
    public void setProjection(Projection projection) {
        this.projection = projection;
    }
    
    /**
     * Represents attributes that are copied (projected) from the table into
     * the index. These are in addition to the primary key attributes and
     * index key attributes, which are automatically projected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projection Represents attributes that are copied (projected) from the table into
     *         the index. These are in addition to the primary key attributes and
     *         index key attributes, which are automatically projected.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withProjection(Projection projection) {
        this.projection = projection;
        return this;
    }

    /**
     * Returns the value of the IndexStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @return The value of the IndexStatus property for this object.
     *
     * @see IndexStatus
     */
    public String getIndexStatus() {
        return indexStatus;
    }
    
    /**
     * Sets the value of the IndexStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus The new value for the IndexStatus property for this object.
     *
     * @see IndexStatus
     */
    public void setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
    }
    
    /**
     * Sets the value of the IndexStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus The new value for the IndexStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IndexStatus
     */
    public GlobalSecondaryIndexDescription withIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }

    /**
     * Sets the value of the IndexStatus property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus The new value for the IndexStatus property for this object.
     *
     * @see IndexStatus
     */
    public void setIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
    }
    
    /**
     * Sets the value of the IndexStatus property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, UPDATING, DELETING, ACTIVE
     *
     * @param indexStatus The new value for the IndexStatus property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see IndexStatus
     */
    public GlobalSecondaryIndexDescription withIndexStatus(IndexStatus indexStatus) {
        this.indexStatus = indexStatus.toString();
        return this;
    }

    /**
     * Describes the provisioned throughput settings for the table,
     * consisting of read and write capacity units, along with data about
     * increases and decreases.
     *
     * @return Describes the provisioned throughput settings for the table,
     *         consisting of read and write capacity units, along with data about
     *         increases and decreases.
     */
    public ProvisionedThroughputDescription getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Describes the provisioned throughput settings for the table,
     * consisting of read and write capacity units, along with data about
     * increases and decreases.
     *
     * @param provisionedThroughput Describes the provisioned throughput settings for the table,
     *         consisting of read and write capacity units, along with data about
     *         increases and decreases.
     */
    public void setProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Describes the provisioned throughput settings for the table,
     * consisting of read and write capacity units, along with data about
     * increases and decreases.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput Describes the provisioned throughput settings for the table,
     *         consisting of read and write capacity units, along with data about
     *         increases and decreases.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withProvisionedThroughput(ProvisionedThroughputDescription provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    /**
     * Returns the value of the IndexSizeBytes property for this object.
     *
     * @return The value of the IndexSizeBytes property for this object.
     */
    public Long getIndexSizeBytes() {
        return indexSizeBytes;
    }
    
    /**
     * Sets the value of the IndexSizeBytes property for this object.
     *
     * @param indexSizeBytes The new value for the IndexSizeBytes property for this object.
     */
    public void setIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
    }
    
    /**
     * Sets the value of the IndexSizeBytes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param indexSizeBytes The new value for the IndexSizeBytes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withIndexSizeBytes(Long indexSizeBytes) {
        this.indexSizeBytes = indexSizeBytes;
        return this;
    }

    /**
     * Returns the value of the ItemCount property for this object.
     *
     * @return The value of the ItemCount property for this object.
     */
    public Long getItemCount() {
        return itemCount;
    }
    
    /**
     * Sets the value of the ItemCount property for this object.
     *
     * @param itemCount The new value for the ItemCount property for this object.
     */
    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }
    
    /**
     * Sets the value of the ItemCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCount The new value for the ItemCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GlobalSecondaryIndexDescription withItemCount(Long itemCount) {
        this.itemCount = itemCount;
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
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");
        if (getProjection() != null) sb.append("Projection: " + getProjection() + ",");
        if (getIndexStatus() != null) sb.append("IndexStatus: " + getIndexStatus() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() + ",");
        if (getIndexSizeBytes() != null) sb.append("IndexSizeBytes: " + getIndexSizeBytes() + ",");
        if (getItemCount() != null) sb.append("ItemCount: " + getItemCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getProjection() == null) ? 0 : getProjection().hashCode()); 
        hashCode = prime * hashCode + ((getIndexStatus() == null) ? 0 : getIndexStatus().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        hashCode = prime * hashCode + ((getIndexSizeBytes() == null) ? 0 : getIndexSizeBytes().hashCode()); 
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GlobalSecondaryIndexDescription == false) return false;
        GlobalSecondaryIndexDescription other = (GlobalSecondaryIndexDescription)obj;
        
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getProjection() == null ^ this.getProjection() == null) return false;
        if (other.getProjection() != null && other.getProjection().equals(this.getProjection()) == false) return false; 
        if (other.getIndexStatus() == null ^ this.getIndexStatus() == null) return false;
        if (other.getIndexStatus() != null && other.getIndexStatus().equals(this.getIndexStatus()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        if (other.getIndexSizeBytes() == null ^ this.getIndexSizeBytes() == null) return false;
        if (other.getIndexSizeBytes() != null && other.getIndexSizeBytes().equals(this.getIndexSizeBytes()) == false) return false; 
        if (other.getItemCount() == null ^ this.getItemCount() == null) return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false) return false; 
        return true;
    }
    
}
    