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
 * Keys And Attributes
 */
public class KeysAndAttributes  implements Serializable  {

    private java.util.List<java.util.Map<String,AttributeValue>> keys;

    private java.util.List<String> attributesToGet;

    private Boolean consistentRead;

    /**
     * Returns the value of the Keys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The value of the Keys property for this object.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getKeys() {
        
        return keys;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     */
    public void setKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        java.util.List<java.util.Map<String,AttributeValue>> keysCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(keys.size());
        keysCopy.addAll(keys);
        this.keys = keysCopy;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeysAndAttributes withKeys(java.util.Map<String,AttributeValue>... keys) {
        if (getKeys() == null) setKeys(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(keys.length));
        for (java.util.Map<String,AttributeValue> value : keys) {
            getKeys().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Keys property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param keys The new value for the Keys property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeysAndAttributes withKeys(java.util.Collection<java.util.Map<String,AttributeValue>> keys) {
        if (keys == null) {
            this.keys = null;
        } else {
            java.util.List<java.util.Map<String,AttributeValue>> keysCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(keys.size());
            keysCopy.addAll(keys);
            this.keys = keysCopy;
        }

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
    public KeysAndAttributes withAttributesToGet(String... attributesToGet) {
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
    public KeysAndAttributes withAttributesToGet(java.util.Collection<String> attributesToGet) {
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
     * Returns the value of the ConsistentRead property for this object.
     *
     * @return The value of the ConsistentRead property for this object.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * Sets the value of the ConsistentRead property for this object.
     *
     * @param consistentRead The new value for the ConsistentRead property for this object.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * Sets the value of the ConsistentRead property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead The new value for the ConsistentRead property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public KeysAndAttributes withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * Returns the value of the ConsistentRead property for this object.
     *
     * @return The value of the ConsistentRead property for this object.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
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
        if (getKeys() != null) sb.append("Keys: " + getKeys() + ",");    	
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");    	
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeysAndAttributes == false) return false;
        KeysAndAttributes other = (KeysAndAttributes)obj;
        
        if (other.getKeys() == null ^ this.getKeys() == null) return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        return true;
    }
    
}
    