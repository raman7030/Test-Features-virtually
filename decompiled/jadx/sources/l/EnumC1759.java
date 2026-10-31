package l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1759 {
    T_INT(10, ClassTransform.INTEGER),
    T_LONG(11, ClassTransform.LONG),
    T_FLOAT(6, ClassTransform.FLOAT),
    T_DOUBLE(7, ClassTransform.DOUBLE),
    T_CLASS(2, Name.LABEL),
    T_BOOLEAN(4, ClassTransform.BOOLEAN),
    T_CHAR(5, ClassTransform.CHARACTER),
    T_BYTE(8, ClassTransform.BYTE),
    T_SHORT(9, ClassTransform.SHORT);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f6107;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Integer f6108;

    EnumC1759(Integer num, String str) {
        this.f6108 = num;
        this.f6107 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m5883() {
        return this.f6107;
    }
}
