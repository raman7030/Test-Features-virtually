package l;

import java.util.HashMap;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77EG */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13833 {
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


    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static HashMap f41262;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static HashMap f41267;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static HashMap f41268;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Integer f41270;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f41271;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f41272;

    EnumC13833(Integer num, String str, String str2) {
        this.f41270 = num;
        this.f41272 = str;
        this.f41271 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33188(int i) {
        return i >= ITEM_Bogus.f41270.intValue() && i <= ITEM_NewObject.f41270.intValue();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC13833 m33189(String str) {
        if (f41267 == null) {
            f41267 = (HashMap) C22311.stream(values()).collect(C22976.toMap(new C8011(7), C20696.identity()));
        }
        return (EnumC13833) f41267.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC13833 m33187(String str) {
        if (f41262 == null) {
            f41262 = (HashMap) C22311.stream(values()).collect(C22976.toMap(new C7680(7), C20696.identity()));
        }
        EnumC13833 enumC13833 = (EnumC13833) f41262.get(str);
        return enumC13833 == null ? ITEM_UNKNOWN : enumC13833;
    }

    public static EnumC13833 get(int i) {
        if (f41268 == null) {
            f41268 = (HashMap) C22311.stream(values()).collect(C22976.toMap(new C4563(9), C20696.identity()));
        }
        return (EnumC13833) f41268.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m33191() {
        return this.f41271;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String m33192() {
        return this.f41272;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Integer m33193() {
        return this.f41270;
    }
}
