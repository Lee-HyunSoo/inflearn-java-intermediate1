package lang.enumeration.test;

public enum AutoGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AutoGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return this.level;
    }

    public String getDescription() {
        return this.description;
    }
}
