package com.errorcode;

public enum LuoErrorCode {
	
	NULL_OBJ("SZN001","����Ϊ��"),
	ERROR_ADD_USER("SZN002,"����û�ʧ��"),
	LOGIN_VERIFY_FAILURE("SZN003","��¼��֤ʧ�ܣ������û��������Ƿ���ȷ"),
	UNKNOWN_ERROR("SZN999","ϵͳ��æ�����Ժ�����....");
	
	
    private String value;
    private String desc;

    private LuoErrorCode(String value, String desc) {
        this.setValue(value);
        this.setDesc(desc);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    @Override
    public String toString() {
    	return "[" + this.value + "]" + this.desc;
    }
}
