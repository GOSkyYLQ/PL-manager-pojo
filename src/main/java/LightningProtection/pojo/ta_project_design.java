package LightningProtection.pojo;

public class ta_project_design {
    private Long id;
    private String pro_name;
    private String pro_header;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    public String getPro_header() {
        return pro_header;
    }

    public void setPro_header(String pro_header) {
        this.pro_header = pro_header == null ? null : pro_header.trim();
    }
}
