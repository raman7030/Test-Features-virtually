package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩺' uses external variables
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
/* JADX INFO: renamed from: l.ۚ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC7112 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC7112 f18549;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC7112 f18550;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC7112 f18551;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC7112 f18552;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC7112 f18553;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC7112 f18554;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC7112 f18555;

    /* JADX INFO: renamed from: ܰ */
    public static final int f18556;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ EnumC7112[] f18557;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC7112 f18558;

    /* JADX INFO: renamed from: ᩸ */
    public final int f18559;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC19998 f18560;

    public static EnumC7112 valueOf(String str) {
        return (EnumC7112) Enum.valueOf(EnumC7112.class, str);
    }

    public static EnumC7112[] values() {
        return (EnumC7112[]) f18557.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC7112[] m16381() {
        return new EnumC7112[]{f18558, f18549, f18550, f18553, f18551, f18552, f18554, f18555};
    }

    static {
        EnumC19998 enumC19998 = EnumC19998.f60719;
        f18558 = new EnumC7112("UNKNOWN", 0, -1, enumC19998);
        f18549 = new EnumC7112("DEREF", 1, 0, enumC19998);
        f18550 = new EnumC7112("ASSIGN", 2, 2, EnumC19998.f60746);
        f18553 = new EnumC7112("PREINC", 3, 4, EnumC19998.f60760);
        f18551 = new EnumC7112("PREDEC", 4, 6, EnumC19998.f60716);
        f18552 = new EnumC7112("POSTINC", 5, 8, EnumC19998.f60723);
        f18554 = new EnumC7112("POSTDEC", 6, 10, EnumC19998.f60791);
        EnumC7112 enumC7112 = new EnumC7112("FIRSTASGOP", 7, 12, enumC19998);
        f18555 = enumC7112;
        f18557 = m16381();
        f18556 = enumC7112.f18559 + 86;
    }

    public EnumC7112(String str, int i, int i2, EnumC19998 enumC19998) {
        super(str, i);
        this.f18559 = i2;
        this.f18560 = enumC19998;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC7112 m16380(int i) {
        for (EnumC7112 enumC7112 : values()) {
            if (enumC7112.f18559 == i) {
                return enumC7112;
            }
        }
        return f18558;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16379(EnumC19998 enumC19998, int i) {
        int i2;
        int i3;
        int i4 = C19182.f57344[enumC19998.ordinal()];
        if (i4 == 1) {
            return f18553.f18559;
        }
        if (i4 == 2) {
            return f18551.f18559;
        }
        if (i4 == 3) {
            return f18552.f18559;
        }
        if (i4 == 4) {
            return f18554.f18559;
        }
        if (96 <= i && i <= 131) {
            i2 = (i - 96) * 2;
            i3 = f18555.f18559;
        } else {
            if (i == 256) {
                return f18555.f18559 + 72;
            }
            if (270 > i || i > 275) {
                return -1;
            }
            i2 = (i - 233) * 2;
            i3 = f18555.f18559;
        }
        return i2 + i3;
    }
}
