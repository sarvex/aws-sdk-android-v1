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
 * Projection
 */
public class Projection  implements Serializable  {

    private String projectionType;

    private java.util.List<String> nonKeyAttributes;

    /**
     * Returns the value of the ProjectionType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @return The value of the ProjectionType property for this object.
     *
     * @see ProjectionType
     */
    public String getProjectionType() {
        return projectionType;
    }
    
    /**
     * Sets the value of the ProjectionType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType The new value for the ProjectionType property for this object.
     *
     * @see ProjectionType
     */
    public void setProjectionType(String projectionType) {
        this.projectionType = projectionType;
    }
    
    /**
     * Sets the value of the ProjectionType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType The new value for the ProjectionType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ProjectionType
     */
    public Projection withProjectionType(String projectionType) {
        this.projectionType = projectionType;
        return this;
    }
    
    
    /**
     * Sets the value of the ProjectionType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType The new value for the ProjectionType property for this object.
     *
     * @see ProjectionType
     */
    public void setProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
    }
    
    /**
     * Sets the value of the ProjectionType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, KEYS_ONLY, INCLUDE
     *
     * @param projectionType The new value for the ProjectionType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ProjectionType
     */
    public Projection withProjectionType(ProjectionType projectionType) {
        this.projectionType = projectionType.toString();
        return this;
    }
    
    /**
     * Returns the value of the NonKeyAttributes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @return The value of the NonKeyAttributes property for this object.
     */
    public java.util.List<String> getNonKeyAttributes() {
        
        return nonKeyAttributes;
    }
    
    /**
     * Sets the value of the NonKeyAttributes property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes The new value for the NonKeyAttributes property for this object.
     */
    public void setNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
            return;
        }

        java.util.List<String> nonKeyAttributesCopy = new java.util.ArrayList<String>(nonKeyAttributes.size());
        nonKeyAttributesCopy.addAll(nonKeyAttributes);
        this.nonKeyAttributes = nonKeyAttributesCopy;
    }
    
    /**
     * Sets the value of the NonKeyAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes The new value for the NonKeyAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Projection withNonKeyAttributes(String... nonKeyAttributes) {
        if (getNonKeyAttributes() == null) setNonKeyAttributes(new java.util.ArrayList<String>(nonKeyAttributes.length));
        for (String value : nonKeyAttributes) {
            getNonKeyAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the NonKeyAttributes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     *
     * @param nonKeyAttributes The new value for the NonKeyAttributes property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Projection withNonKeyAttributes(java.util.Collection<String> nonKeyAttributes) {
        if (nonKeyAttributes == null) {
            this.nonKeyAttributes = null;
        } else {
            java.util.List<String> nonKeyAttributesCopy = new java.util.ArrayList<String>(nonKeyAttributes.size());
            nonKeyAttributesCopy.addAll(nonKeyAttributes);
            this.nonKeyAttributes = nonKeyAttributesCopy;
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
        if (getProjectionType() != null) sb.append("ProjectionType: " + getProjectionType() + ",");    	
        if (getNonKeyAttributes() != null) sb.append("NonKeyAttributes: " + getNonKeyAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getProjectionType() == null) ? 0 : getProjectionType().hashCode()); 
        hashCode = prime * hashCode + ((getNonKeyAttributes() == null) ? 0 : getNonKeyAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Projection == false) return false;
        Projection other = (Projection)obj;
        
        if (other.getProjectionType() == null ^ this.getProjectionType() == null) return false;
        if (other.getProjectionType() != null && other.getProjectionType().equals(this.getProjectionType()) == false) return false; 
        if (other.getNonKeyAttributes() == null ^ this.getNonKeyAttributes() == null) return false;
        if (other.getNonKeyAttributes() != null && other.getNonKeyAttributes().equals(this.getNonKeyAttributes()) == false) return false; 
        return true;
    }
    
}
    