package p067l;

import java.util.HashMap;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15515 {
    ITEM_UNKNOWN(-1, "??? Unknown verification type", "UNKNOWN"),
    ITEM_Bogus(0, "bogus", "B"),
    ITEM_Integer(1, ClassTransform.INTEGER, "I"),
    ITEM_Float(2, ClassTransform.FLOAT, "F"),
    ITEM_Double(3, ClassTransform.DOUBLE, "D"),
    ITEM_Long(4, ClassTransform.LONG, "L"),
    ITEM_Null(5, "null", "N"),
    ITEM_InitObject(6, "this", "IO"),
    ITEM_Object(7, "CP", "O"),
    ITEM_NewObject(8, "at", "NO");


    /* JADX INFO: renamed from: ۧ֫ */
    public static HashMap f44341;

    /* JADX INFO: renamed from: ܽ֫ */
    public static HashMap f44346;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static HashMap f44347;

    /* JADX INFO: renamed from: ᩶ */
    public Integer f44349;

    /* JADX INFO: renamed from: ᩸ */
    public final String f44350;

    /* JADX INFO: renamed from: ᩹ */
    public final String f44351;

    EnumC15515(Integer num, String str, String str2) {
        this.f44349 = num;
        this.f44351 = str;
        this.f44350 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m35306(int i) {
        return i >= ITEM_Bogus.f44349.intValue() && i <= ITEM_NewObject.f44349.intValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public static EnumC15515 m35307(String str) {
        if (f44346 == null) {
            f44346 = (HashMap) C23573.stream(values()).collect(C24205.toMap(new C9982(7), C22038.identity()));
        }
        return (EnumC15515) f44346.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC15515 m35305(String str) {
        if (f44341 == null) {
            f44341 = (HashMap) C23573.stream(values()).collect(C24205.toMap(new C9668(7), C22038.identity()));
        }
        EnumC15515 enumC15515 = (EnumC15515) f44341.get(str);
        return enumC15515 == null ? ITEM_UNKNOWN : enumC15515;
    }

    public static EnumC15515 get(int i) {
        if (f44347 == null) {
            f44347 = (HashMap) C23573.stream(values()).collect(C24205.toMap(new C6705(9), C22038.identity()));
        }
        return (EnumC15515) f44347.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public String m35309() {
        return this.f44350;
    }

    /* JADX INFO: renamed from: ۧ */
    public String m35310() {
        return this.f44351;
    }

    /* JADX INFO: renamed from: ܿ */
    public Integer m35311() {
        return this.f44349;
    }
}
