package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Date contractDate;
    private Double contractValue;

    List<Fee> fees = new ArrayList<>();

    public Contract(){

    }

    public Contract(Date contractDate, Double contractValue) {
        this.contractDate = contractDate;
        this.contractValue = contractValue;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Double getContractValue() {
        return contractValue;
    }

    public void setContractValue(Double contractValue) {
        this.contractValue = contractValue;
    }

    public List<Fee> getFees() {
        return fees;
    }

}
