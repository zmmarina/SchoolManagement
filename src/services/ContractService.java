package services;

import entities.Contract;
import entities.Fee;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private Discount discount;

    public ContractService(Discount discount) {
        this.discount = discount;
    }

    public void generateSlips(Contract contract, Fee fee){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(contract.getContractDate());
        int contractMonth = 2 + calendar.get(Calendar.MONTH);
        int monthsQuantity = 12 - contractMonth;

        for ( int i = 1; i <= monthsQuantity; i++){
            double updatedFee = fee.getAmount() - discount.loyaltyDiscount(fee.getAmount(), monthsQuantity);
            Date dueDate = addMonths(i);
            contract.getFees().add(new Fee(dueDate, updatedFee));
        }
    }

    public Date addMonths(int N){
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, N);

        return calendar.getTime();
    }


}
