package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
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
/* JADX INFO: renamed from: l.֨᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC1412 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC1412 f5080;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC1412 f5081;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC1412[] f5082 = m4901();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC1412 f5083;

    /* JADX INFO: renamed from: ֫ */
    public abstract InterfaceC3529 mo2793(C4235 c4235, InterfaceC23927 interfaceC23927, Object obj, int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC11081 mo2794();

    public EnumC1412(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC1412(String str, int i, C5625 c5625) {
        this(str, i);
    }

    public static EnumC1412 valueOf(String str) {
        return (EnumC1412) Enum.valueOf(EnumC1412.class, str);
    }

    public static EnumC1412[] values() {
        return (EnumC1412[]) f5082.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC1412[] m4901() {
        return new EnumC1412[]{f5081, f5083, f5080};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        f5081 = new EnumC1412(str, i) { // from class: l.᩵᩹ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC3529 mo2793(C4235 c4235, InterfaceC23927 interfaceC23927, Object obj, int i2) {
                if (i2 == 1) {
                    return new C22579(obj);
                }
                return new C7762(i2, obj);
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫ */
            public AbstractC11081 mo2794() {
                return AbstractC11081.m27493();
            }
        };
        final String str2 = "SOFT";
        final int i2 = 1;
        f5083 = new EnumC1412(str2, i2) { // from class: l.֡᩹ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public InterfaceC3529 mo2793(C4235 c4235, InterfaceC23927 interfaceC23927, Object obj, int i3) {
                if (i3 == 1) {
                    return new C19052(c4235.f13735, obj, interfaceC23927);
                }
                return new C14111(i3, interfaceC23927, obj, c4235.f13735);
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public AbstractC11081 mo2794() {
                return AbstractC11081.m27494();
            }
        };
        final String str3 = "WEAK";
        final int i3 = 2;
        f5080 = new EnumC1412(str3, i3) { // from class: l.ۚ᩹ܺ
            {
                C5625 c5625 = null;
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫ */
            public InterfaceC3529 mo2793(C4235 c4235, InterfaceC23927 interfaceC23927, Object obj, int i4) {
                if (i4 == 1) {
                    return new C11996(c4235.f13735, obj, interfaceC23927);
                }
                return new C2055(i4, interfaceC23927, obj, c4235.f13735);
            }

            @Override // l.EnumC1412
            /* JADX INFO: renamed from: ֫ */
            public AbstractC11081 mo2794() {
                return AbstractC11081.m27494();
            }
        };
    }
}
