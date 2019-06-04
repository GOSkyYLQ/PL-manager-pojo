package LightningProtection.pojo;

import java.math.BigInteger;

public class ta_assets {
    private int id;
    private String assets_name;
    private String Used_dept;
    private String Used_user;
    private BigInteger purchase_price;
    private String purchase_date;
    private String purchase_user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssets_name() {
        return assets_name;
    }

    public void setAssets_name(String assets_name) {
        this.assets_name = assets_name == null ? null : assets_name.trim();
    }

    public String getUsed_dept() {
        return Used_dept;
    }

    public void setUsed_dept(String used_dept) {
        Used_dept = used_dept == null ? null : used_dept.trim();
    }

    public String getUsed_user() {
        return Used_user;
    }

    public void setUsed_user(String used_user) {
        Used_user = used_user == null ? null : used_user.trim();
    }

    public BigInteger getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(BigInteger purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getPurchase_user() {
        return purchase_user;
    }

    public void setPurchase_user(String purchase_user) {
        this.purchase_user = purchase_user == null ? null : purchase_user.trim();
    }
}
