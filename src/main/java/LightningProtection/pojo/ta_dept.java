package LightningProtection.pojo;

import java.util.Date;

public class ta_dept {

    private int dept_id;
    private String dept_name;
    private Integer level;
    private int parent_no;
    private Date create_time;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name == null ? null : dept_name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public int getParent_no() {
        return parent_no;
    }

    public void setParent_no(int parent_no) {
        this.parent_no = parent_no;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }


}
