package LightningProtection.pojo;

import java.util.Date;

public class ta_project {
    private Long id;
    private String pro_name;
    private String pro_header;
    private String hea_mobile;
    private String pro_budget;
    private Date create_time;


    public String getPro_name() {
        return pro_name;
    }
    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPro_header() {
        return pro_header;
    }

    public void setPro_header(String pro_header) {
        this.pro_header = pro_header == null ? null : pro_header.trim();
    }

    public String getHea_mobile() {
        return hea_mobile;
    }

    public void setHea_mobile(String hea_mobile) {
        this.hea_mobile = hea_mobile == null ? null : hea_mobile.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getPro_budget() {
        return pro_budget;
    }

    public void setPro_budget(String pro_budget) {
        this.pro_budget = pro_budget = pro_budget == null? null : pro_budget.trim();
    }
}
