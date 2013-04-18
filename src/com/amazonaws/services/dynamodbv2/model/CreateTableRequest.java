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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#createTable(CreateTableRequest) CreateTable operation}.
 * 
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#createTable(CreateTableRequest)
 */
public class CreateTableRequest extends AmazonWebServiceRequest  implements Serializable  {

    private java.util.List<AttributeDefinition> attributeDefinitions;

    private String tableName;

    private java.util.List<KeySchemaElement> keySchema;

    private java.util.List<LocalSecondaryIndex> localSecondaryIndexes;

    private ProvisionedThroughput provisionedThroughput;

    /**
     * Default constructor for a new CreateTableRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateTableRequest() {}
    
    /**
     * Constructs a new CreateTableRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName
     * @param keySchema
     */
    public CreateTableRequest(String tableName, java.util.List<KeySchemaElement> keySchema) {
        this.tableName = tableName;
        this.keySchema = keySchema;
    }

    
    
    /**
     * Returns the value of the AttributeDefinitions property for this
     * object.
     *
     * @return The value of the AttributeDefinitions property for this object.
     */
    public java.util.List<AttributeDefinition> getAttributeDefinitions() {
        
        return attributeDefinitions;
    }
    
    /**
     * Sets the value of the AttributeDefinitions property for this object.
     *
     * @param attributeDefinitions The new value for the AttributeDefinitions property for this object.
     */
    public void setAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
            return;
        }

        java.util.List<AttributeDefinition> attributeDefinitionsCopy = new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.size());
        attributeDefinitionsCopy.addAll(attributeDefinitions);
        this.attributeDefinitions = attributeDefinitionsCopy;
    }
    
    /**
     * Sets the value of the AttributeDefinitions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeDefinitions The new value for the AttributeDefinitions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTableRequest withAttributeDefinitions(AttributeDefinition... attributeDefinitions) {
        if (getAttributeDefinitions() == null) setAttributeDefinitions(new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.length));
        for (AttributeDefinition value : attributeDefinitions) {
            getAttributeDefinitions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the AttributeDefinitions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeDefinitions The new value for the AttributeDefinitions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTableRequest withAttributeDefinitions(java.util.Collection<AttributeDefinition> attributeDefinitions) {
        if (attributeDefinitions == null) {
            this.attributeDefinitions = null;
        } else {
            java.util.List<AttributeDefinition> attributeDefinitionsCopy = new java.util.ArrayList<AttributeDefinition>(attributeDefinitions.size());
            attributeDefinitionsCopy.addAll(attributeDefinitions);
            this.attributeDefinitions = attributeDefinitionsCopy;
        }

        return this;
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
    public CreateTableRequest withTableName(String tableName) {
        this.tableName = tableName;
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

        java.util.List<KeySchemaElement> keySchemaCopy = new java.util.ArrayList<KeySchemaElement>(keySchema.size());
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
    public CreateTableRequest withKeySchema(KeySchemaElement... keySchema) {
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
    public CreateTableRequest withKeySchema(java.util.Collection<KeySchemaElement> keySchema) {
        if (keySchema == null) {
            this.keySchema = null;
        } else {
            java.util.List<KeySchemaElement> keySchemaCopy = new java.util.ArrayList<KeySchemaElement>(keySchema.size());
            keySchemaCopy.addAll(keySchema);
            this.keySchema = keySchemaCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the LocalSecondaryIndexes property for this
     * object.
     *
     * @return The value of the LocalSecondaryIndexes property for this object.
     */
    public java.util.List<LocalSecondaryIndex> getLocalSecondaryIndexes() {
        
        return localSecondaryIndexes;
    }
    
    /**
     * Sets the value of the LocalSecondaryIndexes property for this object.
     *
     * @param localSecondaryIndexes The new value for the LocalSecondaryIndexes property for this object.
     */
    public void setLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
            return;
        }

        java.util.List<LocalSecondaryIndex> localSecondaryIndexesCopy = new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.size());
        localSecondaryIndexesCopy.addAll(localSecondaryIndexes);
        this.localSecondaryIndexes = localSecondaryIndexesCopy;
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
    public CreateTableRequest withLocalSecondaryIndexes(LocalSecondaryIndex... localSecondaryIndexes) {
        if (getLocalSecondaryIndexes() == null) setLocalSecondaryIndexes(new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.length));
        for (LocalSecondaryIndex value : localSecondaryIndexes) {
            getLocalSecondaryIndexes().add(value);
        }
        return this;
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
    public CreateTableRequest withLocalSecondaryIndexes(java.util.Collection<LocalSecondaryIndex> localSecondaryIndexes) {
        if (localSecondaryIndexes == null) {
            this.localSecondaryIndexes = null;
        } else {
            java.util.List<LocalSecondaryIndex> localSecondaryIndexesCopy = new java.util.ArrayList<LocalSecondaryIndex>(localSecondaryIndexes.size());
            localSecondaryIndexesCopy.addAll(localSecondaryIndexes);
            this.localSecondaryIndexes = localSecondaryIndexesCopy;
        }

        return this;
    }
    
    /**
     * Returns the value of the ProvisionedThroughput property for this
     * object.
     *
     * @return The value of the ProvisionedThroughput property for this object.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     *
     * @param provisionedThroughput The new value for the ProvisionedThroughput property for this object.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * Sets the value of the ProvisionedThroughput property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput The new value for the ProvisionedThroughput property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateTableRequest withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
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
        if (getAttributeDefinitions() != null) sb.append("AttributeDefinitions: " + getAttributeDefinitions() + ",");    	
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");    	
        if (getKeySchema() != null) sb.append("KeySchema: " + getKeySchema() + ",");    	
        if (getLocalSecondaryIndexes() != null) sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");    	
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributeDefinitions() == null) ? 0 : getAttributeDefinitions().hashCode()); 
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKeySchema() == null) ? 0 : getKeySchema().hashCode()); 
        hashCode = prime * hashCode + ((getLocalSecondaryIndexes() == null) ? 0 : getLocalSecondaryIndexes().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTableRequest == false) return false;
        CreateTableRequest other = (CreateTableRequest)obj;
        
        if (other.getAttributeDefinitions() == null ^ this.getAttributeDefinitions() == null) return false;
        if (other.getAttributeDefinitions() != null && other.getAttributeDefinitions().equals(this.getAttributeDefinitions()) == false) return false; 
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKeySchema() == null ^ this.getKeySchema() == null) return false;
        if (other.getKeySchema() != null && other.getKeySchema().equals(this.getKeySchema()) == false) return false; 
        if (other.getLocalSecondaryIndexes() == null ^ this.getLocalSecondaryIndexes() == null) return false;
        if (other.getLocalSecondaryIndexes() != null && other.getLocalSecondaryIndexes().equals(this.getLocalSecondaryIndexes()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    