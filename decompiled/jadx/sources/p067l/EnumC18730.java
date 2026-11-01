package p067l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ܿ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC18730 {

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC18730 f56002;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC18730 f56003;

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC18730[] f56004;

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC18730 f56005;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo29213(AbstractC9303 abstractC9303);

    public EnumC18730(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC18730(String str, int i, C11829 c11829) {
        this(str, i);
    }

    public static EnumC18730 valueOf(String str) {
        return (EnumC18730) Enum.valueOf(EnumC18730.class, str);
    }

    public static EnumC18730[] values() {
        return (EnumC18730[]) f56004.clone();
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        EnumC18730 enumC18730 = new EnumC18730(str, i) { // from class: l.ۧ۠ۖ
            {
                C11829 c11829 = null;
            }

            @Override // p067l.EnumC18730
            /* JADX INFO: renamed from: ֫ */
            public Object mo29213(AbstractC9303 abstractC9303) {
                return abstractC9303.mo21519();
            }
        };
        f56003 = enumC18730;
        final String str2 = "STRICT";
        final int i2 = 1;
        EnumC18730 enumC18731 = new EnumC18730(str2, i2) { // from class: l.ܽ۠ۖ
            {
                C11829 c11829 = null;
            }

            @Override // p067l.EnumC18730
            /* JADX INFO: renamed from: ֫ */
            public Object mo29213(AbstractC9303 abstractC9303) {
                return abstractC9303.mo21529();
            }
        };
        f56002 = enumC18731;
        final String str3 = "LAZY";
        final int i3 = 2;
        EnumC18730 enumC18732 = new EnumC18730(str3, i3) { // from class: l.ᩳ۠ۖ
            {
                C11829 c11829 = null;
            }

            @Override // p067l.EnumC18730
            /* JADX INFO: renamed from: ֫ */
            public Object mo29213(AbstractC9303 abstractC9303) {
                return abstractC9303.mo21534();
            }
        };
        f56005 = enumC18732;
        f56004 = new EnumC18730[]{enumC18730, enumC18731, enumC18732};
    }
}
