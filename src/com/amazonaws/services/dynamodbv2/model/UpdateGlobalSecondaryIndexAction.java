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
 * Update Global Secondary Index Action
 */
public class UpdateGlobalSecondaryIndexAction implements Serializable {

    private String indexName;

    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     */
    private ProvisionedThroughput provisionedThroughput;

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
    public UpdateGlobalSecondaryIndexAction withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @return The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public ProvisionedThroughput getProvisionedThroughput() {
        return provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     */
    public void setProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }
    
    /**
     * The provisioned throughput settings for the specified table. The
     * settings can be modified using the <i>UpdateTable</i> operation.
     * <p>For current minimum and maximum provisioned throughput values, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     * in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param provisionedThroughput The provisioned throughput settings for the specified table. The
     *         settings can be modified using the <i>UpdateTable</i> operation.
     *         <p>For current minimum and maximum provisioned throughput values, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Limits</a>
     *         in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateGlobalSecondaryIndexAction withProvisionedThroughput(ProvisionedThroughput provisionedThroughput) {
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
        if (getIndexName() != null) sb.append("IndexName: " + getIndexName() + ",");
        if (getProvisionedThroughput() != null) sb.append("ProvisionedThroughput: " + getProvisionedThroughput() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode()); 
        hashCode = prime * hashCode + ((getProvisionedThroughput() == null) ? 0 : getProvisionedThroughput().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateGlobalSecondaryIndexAction == false) return false;
        UpdateGlobalSecondaryIndexAction other = (UpdateGlobalSecondaryIndexAction)obj;
        
        if (other.getIndexName() == null ^ this.getIndexName() == null) return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false) return false; 
        if (other.getProvisionedThroughput() == null ^ this.getProvisionedThroughput() == null) return false;
        if (other.getProvisionedThroughput() != null && other.getProvisionedThroughput().equals(this.getProvisionedThroughput()) == false) return false; 
        return true;
    }
    
}
    