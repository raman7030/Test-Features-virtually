package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۗ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۛۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D26X */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC5973 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC5973 f18318;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC5973[] f18319;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C4314 f18320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC5973 f18321;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC5973 f18322;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC5973 f18323;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f18325;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Set f18326;

    public /* synthetic */ EnumC5973(String str, int i, int i2) {
        this(str, i);
    }

    public static EnumC5973 valueOf(String str) {
        return (EnumC5973) Enum.valueOf(EnumC5973.class, str);
    }

    public static EnumC5973[] values() {
        return (EnumC5973[]) f18319.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC5973[] m16742() {
        return new EnumC5973[]{f18318, f18323, f18322, f18321};
    }

    static {
        EnumC10892 enumC10892 = EnumC10892.JDK1_8;
        f18318 = new EnumC5973("COMPACT1", 0, "compact1", 1, enumC10892, new EnumC10892[0]);
        f18323 = new EnumC5973("COMPACT2", 1, "compact2", 2, enumC10892, new EnumC10892[0]);
        f18322 = new EnumC5973("COMPACT3", 2, "compact3", 3, enumC10892, new EnumC10892[0]);
        f18321 = new C10207();
        f18319 = m16742();
        f18320 = new C4314();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5973 m16741(C2903 c2903) {
        C4314 c4314 = f18320;
        EnumC5973 enumC5973M16740 = (EnumC5973) c2903.m8838(c4314);
        if (enumC5973M16740 == null) {
            String strM28825 = C11781.m28823(c2903).m28825(EnumC0121.f1133);
            if (strM28825 != null) {
                enumC5973M16740 = m16740(strM28825);
            }
            if (enumC5973M16740 == null) {
                enumC5973M16740 = f18321;
            }
            c2903.m8841(c4314, enumC5973M16740);
        }
        return enumC5973M16740;
    }

    public EnumC5973(String str, int i) {
        super(str, i);
        this.f18325 = null;
        this.f18324 = Integer.MAX_VALUE;
        this.f18326 = null;
    }

    public EnumC5973(String str, int i, String str2, int i2, EnumC10892 enumC10892, EnumC10892... enumC10892Arr) {
        super(str, i);
        this.f18325 = str2;
        this.f18324 = i2;
        this.f18326 = EnumSet.of(enumC10892, enumC10892Arr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5973 m16740(String str) {
        for (EnumC5973 enumC5973 : values()) {
            if (str.equals(enumC5973.f18325)) {
                return enumC5973;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5973 m16739(int i) {
        for (EnumC5973 enumC5973 : values()) {
            if (i == enumC5973.f18324) {
                return enumC5973;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo16743(EnumC10892 enumC10892) {
        return this.f18326.contains(enumC10892);
    }
}
