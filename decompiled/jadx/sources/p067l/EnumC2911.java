package p067l;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֡ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q86R */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC2911 implements InterfaceC7606 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC2911 f5025;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC2911 f5026;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC2911 f5027 = new C4924("DOUBLE", 0);

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC2911[] f5028 = m4710();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC2911 f5029;

    @Override // p067l.InterfaceC7606
    /* JADX INFO: renamed from: ֫ */
    public abstract /* synthetic */ Number mo4711(C18691 c18691);

    public EnumC2911(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC2911(String str, int i, C4924 c4924) {
        this(str, i);
    }

    public static EnumC2911 valueOf(String str) {
        return (EnumC2911) Enum.valueOf(EnumC2911.class, str);
    }

    public static EnumC2911[] values() {
        return (EnumC2911[]) f5028.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC2911[] m4710() {
        return new EnumC2911[]{f5027, f5026, f5025, f5029};
    }

    static {
        final String str = "LAZILY_PARSED_NUMBER";
        final int i = 1;
        f5026 = new EnumC2911(str, i) { // from class: l.ۘᩳۖ
            {
                C4924 c4924 = null;
            }

            @Override // p067l.EnumC2911, p067l.InterfaceC7606
            /* JADX INFO: renamed from: ֫ */
            public Number mo4711(C18691 c18691) {
                return new C15651(c18691.m42644());
            }
        };
        final String str2 = "LONG_OR_DOUBLE";
        final int i2 = 2;
        f5025 = new EnumC2911(str2, i2) { // from class: l.ᩴᩳۖ
            {
                C4924 c4924 = null;
            }

            @Override // p067l.EnumC2911, p067l.InterfaceC7606
            /* JADX INFO: renamed from: ֫ */
            public Number mo4711(C18691 c18691) throws IOException {
                String strM42644 = c18691.m42644();
                if (strM42644.indexOf(46) >= 0) {
                    return m45926(strM42644, c18691);
                }
                try {
                    return Long.valueOf(Long.parseLong(strM42644));
                } catch (NumberFormatException unused) {
                    return m45926(strM42644, c18691);
                }
            }

            /* JADX INFO: renamed from: ֫ */
            private Number m45926(String str3, C18691 c18691) throws C8633 {
                try {
                    Double dValueOf = Double.valueOf(str3);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || c18691.m42650()) {
                        return dValueOf;
                    }
                    throw new C8633("JSON forbids NaN and infinities: " + dValueOf + "; at path " + c18691.m42638());
                } catch (NumberFormatException e) {
                    StringBuilder sbM11879 = C5410.m11879("Cannot parse ", str3, "; at path ");
                    sbM11879.append(c18691.m42638());
                    throw new C12971(sbM11879.toString(), e);
                }
            }
        };
        final String str3 = "BIG_DECIMAL";
        final int i3 = 3;
        f5029 = new EnumC2911(str3, i3) { // from class: l.᩵ᩳۖ
            {
                C4924 c4924 = null;
            }

            @Override // p067l.EnumC2911, p067l.InterfaceC7606
            /* JADX INFO: renamed from: ֫ */
            public BigDecimal mo4711(C18691 c18691) throws IOException {
                String strM42644 = c18691.m42644();
                try {
                    return C8927.m20635(strM42644);
                } catch (NumberFormatException e) {
                    StringBuilder sbM11879 = C5410.m11879("Cannot parse ", strM42644, "; at path ");
                    sbM11879.append(c18691.m42638());
                    throw new C12971(sbM11879.toString(), e);
                }
            }
        };
    }
}
