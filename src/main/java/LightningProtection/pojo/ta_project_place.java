package LightningProtection.pojo;

public class ta_project_place {
    private int id;
    private String pro_name;
    private String pro_place;
    private String contact_way;
    private String superior_dept;
    private String dept_leader;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    public String getPro_place() {
        return pro_place;
    }

    public void setPro_place(String pro_place) {
        this.pro_place = pro_place == null ? null : pro_place.trim();
    }

    public String getContact_way() {
        return contact_way;
    }

    public void setContact_way(String contact_way) {
        this.contact_way = contact_way == null ? null : contact_way.trim();
    }

    public String getSuperior_dept() {
        return superior_dept;
    }

    public void setSuperior_dept(String superior_dept) {
        this.superior_dept = superior_dept == null ? null : superior_dept.trim();
    }

    public String getDept_leader() {
        return dept_leader;
    }

    public void setDept_leader(String dept_leader) {
        this.dept_leader = dept_leader == null ? null : dept_leader.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}
