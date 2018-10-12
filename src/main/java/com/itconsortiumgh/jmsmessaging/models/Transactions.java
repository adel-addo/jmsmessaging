package com.itconsortiumgh.jmsmessaging.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private BigDecimal amount;
    private String sendto;
    private String sendfrom;

    public String getSendfrom() {
        return sendfrom;
    }

    public void setSendfrom(String sendfrom) {
        this.sendfrom = sendfrom;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


}
