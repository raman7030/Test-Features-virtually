package p067l;

import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.֫ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4040 {
    T_INT(10, ClassTransform.INTEGER),
    T_LONG(11, ClassTransform.LONG),
    T_FLOAT(6, ClassTransform.FLOAT),
    T_DOUBLE(7, ClassTransform.DOUBLE),
    T_CLASS(2, Name.LABEL),
    T_BOOLEAN(4, ClassTransform.BOOLEAN),
    T_CHAR(5, ClassTransform.CHARACTER),
    T_BYTE(8, ClassTransform.BYTE),
    T_SHORT(9, ClassTransform.SHORT);


    /* JADX INFO: renamed from: ᩸ */
    public final String f8883;

    /* JADX INFO: renamed from: ᩹ */
    public final Integer f8884;

    EnumC4040(Integer num, String str) {
        this.f8884 = num;
        this.f8883 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m8093() {
        return this.f8883;
    }
}
