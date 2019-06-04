package LightningProtection.pojo;

import java.util.Date;

public class ta_project_kance {
    private Long id;
    private String pro_name;
    private String pro_header;
    private String pro_passw;
    private String group_member;
    private String kance_time;
    private String paper_handle;
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
        this.pro_header = pro_header == null? null : pro_header.trim();
    }

    public String getPro_passw() {
        return pro_passw;
    }

    public void setPro_passw(String pro_passw) {
        this.pro_passw = pro_passw == null ? null : pro_passw.trim();
    }

    public String getGroup_member() {
        return group_member;
    }

    public void setGroup_member(String group_member) {
        this.group_member = group_member == null ? null : group_member.trim();
    }

    public String getKance_time() {
        return kance_time;
    }

    public void setKance_time(String kance_time) {
        this.kance_time = kance_time;
    }

    public String getPaper_handle() {
        return paper_handle;
    }

    public void setPaper_handle(String paper_handle) {
        this.paper_handle = paper_handle == null ? null : paper_handle.trim();
    }
}
