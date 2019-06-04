package LightningProtection.pojo;

import java.math.BigInteger;

public class ta_contract {
    private int id;
    private String contract_name;
    private String sign_date;
    private BigInteger contract_amount;
    private BigInteger received_amount;
    private BigInteger receivable_amount;
    private String payment_method;
    private String invoice_provide;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name == null ? null : contract_name.trim();
    }

    public String getSign_date() {
        return sign_date;
    }

    public void setSign_date(String sign_date) {
        this.sign_date = sign_date;
    }

    public BigInteger getContract_amount() {
        return contract_amount;
    }

    public void setContract_amount(BigInteger contract_amount) {
        this.contract_amount = contract_amount;
    }

    public BigInteger getReceived_amount() {
        return received_amount;
    }

    public void setReceived_amount(BigInteger received_amount) {
        this.received_amount = received_amount;
    }

    public BigInteger getReceivable_amount() {
        return receivable_amount;
    }

    public void setReceivable_amount(BigInteger receivable_amount) {
        this.receivable_amount = receivable_amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method == null ? null : payment_method.trim();
    }

    public String getInvoice_provide() {
        return invoice_provide;
    }

    public void setInvoice_provide(String invoice_provide) {
        this.invoice_provide = invoice_provide == null ? null : invoice_provide.trim();
    }
}
