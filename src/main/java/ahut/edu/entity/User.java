package ahut.edu.entity;

public class User {
    private String userName;
    private String userCname;
    private String userPwd;
    private String mobile;
    private String email;
    private String roleCode;
    private String gh;
    private String xm;
    private String szdwh;
    private String szdw;
    private String isValid;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCname() {
        return userCname;
    }

    public void setUserCname(String userCname) {
        this.userCname = userCname == null ? null : userCname.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh == null ? null : gh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getSzdwh() {
        return szdwh;
    }

    public void setSzdwh(String szdwh) {
        this.szdwh = szdwh == null ? null : szdwh.trim();
    }

    public String getSzdw() {
        return szdw;
    }

    public void setSzdw(String szdw) {
        this.szdw = szdw == null ? null : szdw.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }
}