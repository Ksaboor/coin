package com.zipcoin.model;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
<<<<<<< HEAD
    private Long transactionId;

    private String sender;
    private String reciepient;
=======
    private String transactionId;
    private PublicKey sender;
    private PublicKey recipient;
>>>>>>> posttransaction
    private float amount;

    //@OneToMany
  /*  private List<Integer> coins;*/



    //public Signature signature;
    public Transaction()
    {

    }

    public Transaction(String from, String to, float amount/*List<Integer> coins*/) {
        this.sender = from;
        this.recipient = to;
        this.amount = amount;
        //this.coins=coins;

    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

<<<<<<< HEAD
    public String getReciepient() {
        return reciepient;
    }

    public void setReciepient(String reciepient) {
        this.reciepient = reciepient;
=======
    public PublicKey getReciepient() {
        return recipient;
    }

    public void setReciepient(PublicKey reciepient) {
        this.recipient = reciepient;
>>>>>>> posttransaction
    }

    public float getAmount() { return amount; }

    public void setAmount(float amount) { this.amount = amount; }

    /*public List<Integer> getCoins() { return coins; }

    public void setCoins(List<Integer> coins) { this.coins = coins; }*/

    private String calulateHash() {

        return DigestUtils.sha256Hex(
<<<<<<< HEAD
                sender +
                        (reciepient) +
=======
                StringUtil.getStringFromKey(sender) +
                        StringUtil.getStringFromKey(recipient) +
>>>>>>> posttransaction
                        Float.toString(amount)
        );
    }
//    public void generateSignature(PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
//        String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient) + Float.toString(value)    ;
//        signature = StringUtil.applyECDSASig(privateKey,data);
//        System.out.println(signature);
//    }
    //Verifies the data we signed hasnt been tampered with
    //public boolean verifiySignature() {
    // String data = StringUtil.getStringFromKey(sender) + StringUtil.getStringFromKey(reciepient) + Float.toString(value)    ;
    // return StringUtil.verifyECDSASig(sender, data, this.signature);
    //}
}