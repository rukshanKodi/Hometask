package org.wecancodeit.hometask.Models;

import jakarta.persistence.*;

/*
 * This model will be an extension of Rewards model
 * to be able to input a reward Type
 */

@Entity
public class RewardListForm extends Reward {
    
    @Id
    @GeneratedValue
    private long id;

    private String rewardType;

     public long getId() {
        return id;
    }
    
    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((rewardType == null) ? 0 : rewardType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        RewardListForm other = (RewardListForm) obj;
        if (rewardType == null) {
            if (other.rewardType != null)
                return false;
        } else if (!rewardType.equals(other.rewardType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RewardListForm [rewardType=" + rewardType + "]";
    }

   

}
