package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۤ' uses external variables
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
/* JADX INFO: renamed from: l.᩷֡۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC21871 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC21871 f68795;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC21871 f68796;

    /* JADX INFO: renamed from: ۛ */
    public static final EnumC21871 f68797;

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC21871 f68798;

    /* JADX INFO: renamed from: ۨ */
    public static final EnumC21871 f68799;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC21871 f68800;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC21871 f68801;

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ EnumC21871[] f68802;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC12909 f68803;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f68804;

    public static EnumC21871 valueOf(String str) {
        return (EnumC21871) Enum.valueOf(EnumC21871.class, str);
    }

    public static EnumC21871[] values() {
        return (EnumC21871[]) f68802.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC21871[] m49331() {
        return new EnumC21871[]{f68798, f68799, f68800, f68795, f68801, f68797, f68796};
    }

    static {
        EnumC12909 enumC12909 = EnumC12909.INVOKE;
        f68798 = new EnumC21871("SUPER", 0, enumC12909, false);
        f68799 = new EnumC21871("UNBOUND", 1, enumC12909, true);
        f68800 = new EnumC21871("STATIC", 2, enumC12909, false);
        f68795 = new EnumC21871("BOUND", 3, enumC12909, false);
        EnumC12909 enumC129010 = EnumC12909.NEW;
        f68801 = new EnumC21871("IMPLICIT_INNER", 4, enumC129010, false);
        f68797 = new EnumC21871("TOPLEVEL", 5, enumC129010, false);
        f68796 = new EnumC21871("ARRAY_CTOR", 6, enumC129010, false);
        f68802 = m49331();
    }

    public EnumC21871(String str, int i, EnumC12909 enumC12909, boolean z) {
        super(str, i);
        this.f68803 = enumC12909;
        this.f68804 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m49332() {
        return this.f68804;
    }
}
