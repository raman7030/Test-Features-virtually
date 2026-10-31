package l;

import com.umeng.analytics.pro.am;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7464 {
    AE_BYTE("B", ClassTransform.BYTE),
    AE_CHAR("C", ClassTransform.CHARACTER),
    AE_SHORT("S", ClassTransform.SHORT),
    AE_INT("I", ClassTransform.INTEGER),
    AE_LONG("J", ClassTransform.LONG),
    AE_FLOAT("F", ClassTransform.FLOAT),
    AE_DOUBLE("D", ClassTransform.DOUBLE),
    AE_BOOLEAN("Z", ClassTransform.BOOLEAN),
    AE_STRING(am.aB, "string"),
    AE_ENUM("e", "enum"),
    AE_CLASS(am.aF, Name.LABEL),
    AE_ANNOTATION("@", "annotation"),
    AE_ARRAY("[", "array"),
    AE_UNKNOWN("U", "unknown"),
    AE_NOT_APPLICABLE("N", "not applicable");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f22984;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f22985;

    EnumC7464(String str, String str2) {
        this.f22985 = str;
        this.f22984 = str2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String m20000() {
        return this.f22985;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m19998() {
        return this.f22984;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char m19999() {
        return this.f22985.charAt(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19995(char c) {
        return (AE_NOT_APPLICABLE.m19999() == c || AE_UNKNOWN.m19999() == c) ? false : true;
    }
}
