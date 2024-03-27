package vn.edu.iuh.fit.utils;

public enum StudentStatus {
    ACTIVE(1),
    INACTIVE(2),
    STOPPED(3),
    GRADUATED(4);

    private final int value;

    private StudentStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
