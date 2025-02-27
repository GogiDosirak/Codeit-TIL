package org.example.chapter03.pr4;

import java.util.Objects;

public class CustomKey {
    private String strValue1;
    private int intValue1;
    private double doubleValue1;

    public CustomKey(String strValue1, int intValue1, double doubleValue1) {
        this.strValue1 = strValue1;
        this.intValue1 = intValue1;
        this.doubleValue1 = doubleValue1;
    }

    @Override
    public boolean equals(Object o) { // 서로 같은 두 객체인지 확인
        if (!(o instanceof CustomKey customKey)) return false;
        return intValue1 == customKey.intValue1 && Double.compare(doubleValue1, customKey.doubleValue1) == 0 && Objects.equals(strValue1, customKey.strValue1);
    }

    @Override
    public int hashCode() { // 서로 같은 해시테이블의 인덱스에 위치하는지 확인
        return Objects.hash(strValue1, intValue1, doubleValue1);
    }

    public void setStrValue1(String strValue1) {
        this.strValue1 = strValue1;
    }

    public void setIntValue1(int intValue1) {
        this.intValue1 = intValue1;
    }

    public void setDoubleValue1(double doubleValue1) {
        this.doubleValue1 = doubleValue1;
    }
}
