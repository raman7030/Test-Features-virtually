package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۟' uses external variables
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
/* JADX INFO: renamed from: l.۟ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VJ */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9396 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final EnumC9396 f25670;

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC9396 f25671;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC9396 f25672;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC9396 f25673;

    /* JADX INFO: renamed from: ۟ */
    public static final EnumC9396 f25674;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC9396 f25675;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final EnumC9396 f25676;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC9396 f25677;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC9396 f25678;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC9396 f25679;

    /* JADX INFO: renamed from: ܰ */
    public static final EnumC9396 f25680;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ EnumC9396[] f25681;

    /* JADX INFO: renamed from: ᩺ */
    public static final EnumC9396 f25682;

    /* JADX INFO: renamed from: ᩸ */
    public final String f25683;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC15430 f25684;

    public static EnumC9396 valueOf(String str) {
        return (EnumC9396) Enum.valueOf(EnumC9396.class, str);
    }

    public static EnumC9396[] values() {
        return (EnumC9396[]) f25681.clone();
    }

    /* JADX INFO: renamed from: ֡ */
    public static /* synthetic */ EnumC9396[] m21883() {
        return new EnumC9396[]{f25674, f25670, f25676, f25671, f25679, f25672, f25675, f25673, f25677, f25678, f25680, f25682};
    }

    static {
        EnumC15430 enumC15430 = EnumC15430.probing;
        f25674 = new EnumC9396("PROBING_1", 0, "probing 1", enumC15430);
        f25670 = new EnumC9396("PROBING_2", 1, "probing 2", enumC15430);
        f25676 = new EnumC9396("PROBING_3", 2, "probing 3", enumC15430);
        EnumC15430 enumC15431 = EnumC15430.announcing;
        f25671 = new EnumC9396("ANNOUNCING_1", 3, "announcing 1", enumC15431);
        f25679 = new EnumC9396("ANNOUNCING_2", 4, "announcing 2", enumC15431);
        f25672 = new EnumC9396("ANNOUNCED", 5, "announced", EnumC15430.announced);
        EnumC15430 enumC15432 = EnumC15430.canceling;
        f25675 = new EnumC9396("CANCELING_1", 6, "canceling 1", enumC15432);
        f25673 = new EnumC9396("CANCELING_2", 7, "canceling 2", enumC15432);
        f25677 = new EnumC9396("CANCELING_3", 8, "canceling 3", enumC15432);
        f25678 = new EnumC9396("CANCELED", 9, "canceled", EnumC15430.canceled);
        f25680 = new EnumC9396("CLOSING", 10, "closing", EnumC15430.closing);
        f25682 = new EnumC9396("CLOSED", 11, "closed", EnumC15430.closed);
        f25681 = m21883();
    }

    public EnumC9396(String str, int i, String str2, EnumC15430 enumC15430) {
        super(str, i);
        this.f25683 = str2;
        this.f25684 = enumC15430;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f25683;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC9396 m21884() {
        switch (ordinal()) {
            case 0:
                return f25670;
            case 1:
                return f25676;
            case 2:
                return f25671;
            case 3:
                return f25679;
            case 4:
                return f25672;
            case 5:
                return f25672;
            case 6:
                return f25673;
            case 7:
                return f25677;
            case 8:
                return f25678;
            case 9:
                return f25678;
            case 10:
                return f25682;
            case 11:
                return f25682;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final EnumC9396 m21890() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return f25674;
            case 6:
            case 7:
            case 8:
                return f25675;
            case 9:
                return f25678;
            case 10:
                return f25680;
            case 11:
                return f25682;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m21888() {
        return this.f25684 == EnumC15430.probing;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m21889() {
        return this.f25684 == EnumC15430.announcing;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m21887() {
        return this.f25684 == EnumC15430.announced;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m21891() {
        return this.f25684 == EnumC15430.canceling;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m21892() {
        return this.f25684 == EnumC15430.canceled;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m21885() {
        return this.f25684 == EnumC15430.closing;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m21886() {
        return this.f25684 == EnumC15430.closed;
    }
}
