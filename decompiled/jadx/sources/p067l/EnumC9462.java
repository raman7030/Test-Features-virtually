package p067l;

import com.umeng.analytics.pro.C0655am;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۟۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7EK */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9462 {
    AE_BYTE("B", ClassTransform.BYTE),
    AE_CHAR("C", ClassTransform.CHARACTER),
    AE_SHORT("S", ClassTransform.SHORT),
    AE_INT("I", ClassTransform.INTEGER),
    AE_LONG("J", ClassTransform.LONG),
    AE_FLOAT("F", ClassTransform.FLOAT),
    AE_DOUBLE("D", ClassTransform.DOUBLE),
    AE_BOOLEAN("Z", ClassTransform.BOOLEAN),
    AE_STRING(C0655am.f2274aB, "string"),
    AE_ENUM("e", "enum"),
    AE_CLASS(C0655am.f2278aF, Name.LABEL),
    AE_ANNOTATION("@", "annotation"),
    AE_ARRAY("[", "array"),
    AE_UNKNOWN("U", "unknown"),
    AE_NOT_APPLICABLE("N", "not applicable");


    /* JADX INFO: renamed from: ᩸ */
    public final String f25897;

    /* JADX INFO: renamed from: ᩹ */
    public final String f25898;

    EnumC9462(String str, String str2) {
        this.f25898 = str;
        this.f25897 = str2;
    }

    /* JADX INFO: renamed from: ܿ */
    public String m21975() {
        return this.f25898;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m21973() {
        return this.f25897;
    }

    /* JADX INFO: renamed from: ۧ */
    public char m21974() {
        return this.f25898.charAt(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21970(char c) {
        return (AE_NOT_APPLICABLE.m21974() == c || AE_UNKNOWN.m21974() == c) ? false : true;
    }
}
