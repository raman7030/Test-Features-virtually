package p067l;

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
public class EnumC8045 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC8045 f21171;

    /* JADX INFO: renamed from: ۙ */
    public static final /* synthetic */ EnumC8045[] f21172;

    /* JADX INFO: renamed from: ۛ */
    public static final C6468 f21173;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC8045 f21174;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC8045 f21175;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC8045 f21176;

    /* JADX INFO: renamed from: ᩶ */
    public final int f21177;

    /* JADX INFO: renamed from: ᩸ */
    public final String f21178;

    /* JADX INFO: renamed from: ᩹ */
    public final Set f21179;

    public /* synthetic */ EnumC8045(String str, int i, int i2) {
        this(str, i);
    }

    public static EnumC8045 valueOf(String str) {
        return (EnumC8045) Enum.valueOf(EnumC8045.class, str);
    }

    public static EnumC8045[] values() {
        return (EnumC8045[]) f21172.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC8045[] m18668() {
        return new EnumC8045[]{f21171, f21176, f21175, f21174};
    }

    static {
        EnumC12720 enumC12720 = EnumC12720.JDK1_8;
        f21171 = new EnumC8045("COMPACT1", 0, "compact1", 1, enumC12720, new EnumC12720[0]);
        f21176 = new EnumC8045("COMPACT2", 1, "compact2", 2, enumC12720, new EnumC12720[0]);
        f21175 = new EnumC8045("COMPACT3", 2, "compact3", 3, enumC12720, new EnumC12720[0]);
        f21174 = new C12069();
        f21172 = m18668();
        f21173 = new C6468();
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8045 m18667(C5127 c5127) {
        C6468 c6468 = f21173;
        EnumC8045 enumC8045M18666 = (EnumC8045) c5127.m10905(c6468);
        if (enumC8045M18666 == null) {
            String strM30873 = C13565.m30871(c5127).m30873(EnumC2483.f3909);
            if (strM30873 != null) {
                enumC8045M18666 = m18666(strM30873);
            }
            if (enumC8045M18666 == null) {
                enumC8045M18666 = f21174;
            }
            c5127.m10908(c6468, enumC8045M18666);
        }
        return enumC8045M18666;
    }

    public EnumC8045(String str, int i) {
        super(str, i);
        this.f21178 = null;
        this.f21177 = Integer.MAX_VALUE;
        this.f21179 = null;
    }

    public EnumC8045(String str, int i, String str2, int i2, EnumC12720 enumC12720, EnumC12720... enumC12720Arr) {
        super(str, i);
        this.f21178 = str2;
        this.f21177 = i2;
        this.f21179 = EnumSet.of(enumC12720, enumC12720Arr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8045 m18666(String str) {
        for (EnumC8045 enumC8045 : values()) {
            if (str.equals(enumC8045.f21178)) {
                return enumC8045;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC8045 m18665(int i) {
        for (EnumC8045 enumC8045 : values()) {
            if (i == enumC8045.f21177) {
                return enumC8045;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo18669(EnumC12720 enumC12720) {
        return this.f21179.contains(enumC12720);
    }
}
