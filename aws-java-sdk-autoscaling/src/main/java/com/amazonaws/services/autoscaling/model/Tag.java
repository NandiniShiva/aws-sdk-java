/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a tag applied to an Auto Scaling group.
 * </p>
 */
public class Tag implements Serializable {

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String resourceId;

    /**
     * The kind of resource to which the tag is applied. Currently, Auto
     * Scaling supports the <code>auto-scaling-group</code> resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String resourceType;

    /**
     * The tag key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String key;

    /**
     * The tag value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String value;

    /**
     * Specifies whether the tag is applied to instances launched after the
     * tag is created. The same behavior applies to updates: If you change a
     * tag, it is applied to all instances launched after you made the
     * change.
     */
    private Boolean propagateAtLaunch;

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param resourceId The name of the group.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param resourceId The name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * The kind of resource to which the tag is applied. Currently, Auto
     * Scaling supports the <code>auto-scaling-group</code> resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The kind of resource to which the tag is applied. Currently, Auto
     *         Scaling supports the <code>auto-scaling-group</code> resource type.
     */
    public String getResourceType() {
        return resourceType;
    }
    
    /**
     * The kind of resource to which the tag is applied. Currently, Auto
     * Scaling supports the <code>auto-scaling-group</code> resource type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param resourceType The kind of resource to which the tag is applied. Currently, Auto
     *         Scaling supports the <code>auto-scaling-group</code> resource type.
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
    
    /**
     * The kind of resource to which the tag is applied. Currently, Auto
     * Scaling supports the <code>auto-scaling-group</code> resource type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param resourceType The kind of resource to which the tag is applied. Currently, Auto
     *         Scaling supports the <code>auto-scaling-group</code> resource type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * The tag key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The tag key.
     */
    public String getKey() {
        return key;
    }
    
    /**
     * The tag key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param key The tag key.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * The tag key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param key The tag key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * The tag value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The tag value.
     */
    public String getValue() {
        return value;
    }
    
    /**
     * The tag value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param value The tag value.
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * The tag value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param value The tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Specifies whether the tag is applied to instances launched after the
     * tag is created. The same behavior applies to updates: If you change a
     * tag, it is applied to all instances launched after you made the
     * change.
     *
     * @return Specifies whether the tag is applied to instances launched after the
     *         tag is created. The same behavior applies to updates: If you change a
     *         tag, it is applied to all instances launched after you made the
     *         change.
     */
    public Boolean isPropagateAtLaunch() {
        return propagateAtLaunch;
    }
    
    /**
     * Specifies whether the tag is applied to instances launched after the
     * tag is created. The same behavior applies to updates: If you change a
     * tag, it is applied to all instances launched after you made the
     * change.
     *
     * @param propagateAtLaunch Specifies whether the tag is applied to instances launched after the
     *         tag is created. The same behavior applies to updates: If you change a
     *         tag, it is applied to all instances launched after you made the
     *         change.
     */
    public void setPropagateAtLaunch(Boolean propagateAtLaunch) {
        this.propagateAtLaunch = propagateAtLaunch;
    }
    
    /**
     * Specifies whether the tag is applied to instances launched after the
     * tag is created. The same behavior applies to updates: If you change a
     * tag, it is applied to all instances launched after you made the
     * change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param propagateAtLaunch Specifies whether the tag is applied to instances launched after the
     *         tag is created. The same behavior applies to updates: If you change a
     *         tag, it is applied to all instances launched after you made the
     *         change.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Tag withPropagateAtLaunch(Boolean propagateAtLaunch) {
        this.propagateAtLaunch = propagateAtLaunch;
        return this;
    }

    /**
     * Specifies whether the tag is applied to instances launched after the
     * tag is created. The same behavior applies to updates: If you change a
     * tag, it is applied to all instances launched after you made the
     * change.
     *
     * @return Specifies whether the tag is applied to instances launched after the
     *         tag is created. The same behavior applies to updates: If you change a
     *         tag, it is applied to all instances launched after you made the
     *         change.
     */
    public Boolean getPropagateAtLaunch() {
        return propagateAtLaunch;
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
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getResourceType() != null) sb.append("ResourceType: " + getResourceType() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getValue() != null) sb.append("Value: " + getValue() + ",");
        if (isPropagateAtLaunch() != null) sb.append("PropagateAtLaunch: " + isPropagateAtLaunch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode()); 
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode()); 
        hashCode = prime * hashCode + ((isPropagateAtLaunch() == null) ? 0 : isPropagateAtLaunch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Tag == false) return false;
        Tag other = (Tag)obj;
        
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getResourceType() == null ^ this.getResourceType() == null) return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getValue() == null ^ this.getValue() == null) return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false) return false; 
        if (other.isPropagateAtLaunch() == null ^ this.isPropagateAtLaunch() == null) return false;
        if (other.isPropagateAtLaunch() != null && other.isPropagateAtLaunch().equals(this.isPropagateAtLaunch()) == false) return false; 
        return true;
    }
    
}
    