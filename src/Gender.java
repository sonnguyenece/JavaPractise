public enum Gender {
    MALE("M", "male"), FEMALE("F", "female");
    private String code;
    private String text;

    Gender(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public static Gender getGenderByCode(String code) {
        for (Gender gender : Gender.values()) {
            if (code.equals(gender.code)) {
                return gender;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setText(String text) {
        this.text = text;
    }
}
