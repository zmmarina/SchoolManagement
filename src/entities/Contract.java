package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Date contractDate;

    List<Fee> fees = new ArrayList<>();

    public Contract(){
    }

    public Contract(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public List<Fee> getFees() {
        return fees;
    }

}
