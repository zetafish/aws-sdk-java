/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Represents summary information about the health of an instance. For more information, see <a
 * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html">Health Colors and
 * Statuses</a>.
 * </p>
 */
public class InstanceHealthSummary implements Serializable, Cloneable {

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
     * </p>
     */
    private Integer noData;
    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an
     * instance.
     * </p>
     */
    private Integer unknown;
    /**
     * <p>
     * <b>Grey.</b> An operation is in progress on an instance within the command timeout.
     * </p>
     */
    private Integer pending;
    /**
     * <p>
     * <b>Green.</b> An instance is passing health checks and the health agent is not reporting any problems.
     * </p>
     */
    private Integer ok;
    /**
     * <p>
     * <b>Green.</b> An operation is in progress on an instance.
     * </p>
     */
    private Integer info;
    /**
     * <p>
     * <b>Yellow.</b> The health agent is reporting a moderate number of request failures or other issues for an
     * instance or environment.
     * </p>
     */
    private Integer warning;
    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a high number of request failures or other issues for an instance or
     * environment.
     * </p>
     */
    private Integer degraded;
    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a very high number of request failures or other issues for an instance
     * or environment.
     * </p>
     */
    private Integer severe;

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
     * </p>
     * 
     * @param noData
     *        Grey.
     */

    public void setNoData(Integer noData) {
        this.noData = noData;
    }

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
     * </p>
     * 
     * @return Grey.
     */

    public Integer getNoData() {
        return this.noData;
    }

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
     * </p>
     * 
     * @param noData
     *        Grey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withNoData(Integer noData) {
        setNoData(noData);
        return this;
    }

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an
     * instance.
     * </p>
     * 
     * @param unknown
     *        Grey.
     */

    public void setUnknown(Integer unknown) {
        this.unknown = unknown;
    }

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an
     * instance.
     * </p>
     * 
     * @return Grey.
     */

    public Integer getUnknown() {
        return this.unknown;
    }

    /**
     * <p>
     * <b>Grey.</b> AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an
     * instance.
     * </p>
     * 
     * @param unknown
     *        Grey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withUnknown(Integer unknown) {
        setUnknown(unknown);
        return this;
    }

    /**
     * <p>
     * <b>Grey.</b> An operation is in progress on an instance within the command timeout.
     * </p>
     * 
     * @param pending
     *        Grey.
     */

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * <b>Grey.</b> An operation is in progress on an instance within the command timeout.
     * </p>
     * 
     * @return Grey.
     */

    public Integer getPending() {
        return this.pending;
    }

    /**
     * <p>
     * <b>Grey.</b> An operation is in progress on an instance within the command timeout.
     * </p>
     * 
     * @param pending
     *        Grey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withPending(Integer pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * <b>Green.</b> An instance is passing health checks and the health agent is not reporting any problems.
     * </p>
     * 
     * @param ok
     *        Green.
     */

    public void setOk(Integer ok) {
        this.ok = ok;
    }

    /**
     * <p>
     * <b>Green.</b> An instance is passing health checks and the health agent is not reporting any problems.
     * </p>
     * 
     * @return Green.
     */

    public Integer getOk() {
        return this.ok;
    }

    /**
     * <p>
     * <b>Green.</b> An instance is passing health checks and the health agent is not reporting any problems.
     * </p>
     * 
     * @param ok
     *        Green.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withOk(Integer ok) {
        setOk(ok);
        return this;
    }

    /**
     * <p>
     * <b>Green.</b> An operation is in progress on an instance.
     * </p>
     * 
     * @param info
     *        Green.
     */

    public void setInfo(Integer info) {
        this.info = info;
    }

    /**
     * <p>
     * <b>Green.</b> An operation is in progress on an instance.
     * </p>
     * 
     * @return Green.
     */

    public Integer getInfo() {
        return this.info;
    }

    /**
     * <p>
     * <b>Green.</b> An operation is in progress on an instance.
     * </p>
     * 
     * @param info
     *        Green.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withInfo(Integer info) {
        setInfo(info);
        return this;
    }

    /**
     * <p>
     * <b>Yellow.</b> The health agent is reporting a moderate number of request failures or other issues for an
     * instance or environment.
     * </p>
     * 
     * @param warning
     *        Yellow.
     */

    public void setWarning(Integer warning) {
        this.warning = warning;
    }

    /**
     * <p>
     * <b>Yellow.</b> The health agent is reporting a moderate number of request failures or other issues for an
     * instance or environment.
     * </p>
     * 
     * @return Yellow.
     */

    public Integer getWarning() {
        return this.warning;
    }

    /**
     * <p>
     * <b>Yellow.</b> The health agent is reporting a moderate number of request failures or other issues for an
     * instance or environment.
     * </p>
     * 
     * @param warning
     *        Yellow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withWarning(Integer warning) {
        setWarning(warning);
        return this;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a high number of request failures or other issues for an instance or
     * environment.
     * </p>
     * 
     * @param degraded
     *        Red.
     */

    public void setDegraded(Integer degraded) {
        this.degraded = degraded;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a high number of request failures or other issues for an instance or
     * environment.
     * </p>
     * 
     * @return Red.
     */

    public Integer getDegraded() {
        return this.degraded;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a high number of request failures or other issues for an instance or
     * environment.
     * </p>
     * 
     * @param degraded
     *        Red.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withDegraded(Integer degraded) {
        setDegraded(degraded);
        return this;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a very high number of request failures or other issues for an instance
     * or environment.
     * </p>
     * 
     * @param severe
     *        Red.
     */

    public void setSevere(Integer severe) {
        this.severe = severe;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a very high number of request failures or other issues for an instance
     * or environment.
     * </p>
     * 
     * @return Red.
     */

    public Integer getSevere() {
        return this.severe;
    }

    /**
     * <p>
     * <b>Red.</b> The health agent is reporting a very high number of request failures or other issues for an instance
     * or environment.
     * </p>
     * 
     * @param severe
     *        Red.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceHealthSummary withSevere(Integer severe) {
        setSevere(severe);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNoData() != null)
            sb.append("NoData: " + getNoData() + ",");
        if (getUnknown() != null)
            sb.append("Unknown: " + getUnknown() + ",");
        if (getPending() != null)
            sb.append("Pending: " + getPending() + ",");
        if (getOk() != null)
            sb.append("Ok: " + getOk() + ",");
        if (getInfo() != null)
            sb.append("Info: " + getInfo() + ",");
        if (getWarning() != null)
            sb.append("Warning: " + getWarning() + ",");
        if (getDegraded() != null)
            sb.append("Degraded: " + getDegraded() + ",");
        if (getSevere() != null)
            sb.append("Severe: " + getSevere());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceHealthSummary == false)
            return false;
        InstanceHealthSummary other = (InstanceHealthSummary) obj;
        if (other.getNoData() == null ^ this.getNoData() == null)
            return false;
        if (other.getNoData() != null && other.getNoData().equals(this.getNoData()) == false)
            return false;
        if (other.getUnknown() == null ^ this.getUnknown() == null)
            return false;
        if (other.getUnknown() != null && other.getUnknown().equals(this.getUnknown()) == false)
            return false;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getOk() == null ^ this.getOk() == null)
            return false;
        if (other.getOk() != null && other.getOk().equals(this.getOk()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        if (other.getDegraded() == null ^ this.getDegraded() == null)
            return false;
        if (other.getDegraded() != null && other.getDegraded().equals(this.getDegraded()) == false)
            return false;
        if (other.getSevere() == null ^ this.getSevere() == null)
            return false;
        if (other.getSevere() != null && other.getSevere().equals(this.getSevere()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNoData() == null) ? 0 : getNoData().hashCode());
        hashCode = prime * hashCode + ((getUnknown() == null) ? 0 : getUnknown().hashCode());
        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getOk() == null) ? 0 : getOk().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode());
        hashCode = prime * hashCode + ((getDegraded() == null) ? 0 : getDegraded().hashCode());
        hashCode = prime * hashCode + ((getSevere() == null) ? 0 : getSevere().hashCode());
        return hashCode;
    }

    @Override
    public InstanceHealthSummary clone() {
        try {
            return (InstanceHealthSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
