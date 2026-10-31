package l;

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
public final class EnumC7394 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22758;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22759;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22760;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22761;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22762;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22763;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22765;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22766;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22767;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22768;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7394[] f22769;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC7394 f22770;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f22771;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC13743 f22772;

    public static EnumC7394 valueOf(String str) {
        return (EnumC7394) Enum.valueOf(EnumC7394.class, str);
    }

    public static EnumC7394[] values() {
        return (EnumC7394[]) f22769.clone();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7394[] m19910() {
        return new EnumC7394[]{f22762, f22758, f22764, f22759, f22767, f22760, f22763, f22761, f22765, f22766, f22768, f22770};
    }

    static {
        EnumC13743 enumC13743 = EnumC13743.probing;
        f22762 = new EnumC7394("PROBING_1", 0, "probing 1", enumC13743);
        f22758 = new EnumC7394("PROBING_2", 1, "probing 2", enumC13743);
        f22764 = new EnumC7394("PROBING_3", 2, "probing 3", enumC13743);
        EnumC13743 enumC13744 = EnumC13743.announcing;
        f22759 = new EnumC7394("ANNOUNCING_1", 3, "announcing 1", enumC13744);
        f22767 = new EnumC7394("ANNOUNCING_2", 4, "announcing 2", enumC13744);
        f22760 = new EnumC7394("ANNOUNCED", 5, "announced", EnumC13743.announced);
        EnumC13743 enumC13745 = EnumC13743.canceling;
        f22763 = new EnumC7394("CANCELING_1", 6, "canceling 1", enumC13745);
        f22761 = new EnumC7394("CANCELING_2", 7, "canceling 2", enumC13745);
        f22765 = new EnumC7394("CANCELING_3", 8, "canceling 3", enumC13745);
        f22766 = new EnumC7394("CANCELED", 9, "canceled", EnumC13743.canceled);
        f22768 = new EnumC7394("CLOSING", 10, "closing", EnumC13743.closing);
        f22770 = new EnumC7394("CLOSED", 11, "closed", EnumC13743.closed);
        f22769 = m19910();
    }

    public EnumC7394(String str, int i, String str2, EnumC13743 enumC13743) {
        super(str, i);
        this.f22771 = str2;
        this.f22772 = enumC13743;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22771;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC7394 m19911() {
        switch (ordinal()) {
            case 0:
                return f22758;
            case 1:
                return f22764;
            case 2:
                return f22759;
            case 3:
                return f22767;
            case 4:
                return f22760;
            case 5:
                return f22760;
            case 6:
                return f22761;
            case 7:
                return f22765;
            case 8:
                return f22766;
            case 9:
                return f22766;
            case 10:
                return f22770;
            case 11:
                return f22770;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC7394 m19917() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return f22762;
            case 6:
            case 7:
            case 8:
                return f22763;
            case 9:
                return f22766;
            case 10:
                return f22768;
            case 11:
                return f22770;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m19915() {
        return this.f22772 == EnumC13743.probing;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m19916() {
        return this.f22772 == EnumC13743.announcing;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19914() {
        return this.f22772 == EnumC13743.announced;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m19918() {
        return this.f22772 == EnumC13743.canceling;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m19919() {
        return this.f22772 == EnumC13743.canceled;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m19912() {
        return this.f22772 == EnumC13743.closing;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m19913() {
        return this.f22772 == EnumC13743.closed;
    }
}
