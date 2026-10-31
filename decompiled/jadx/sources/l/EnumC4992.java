package l;

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
public final class EnumC4992 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15716;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15717;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15718;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15719;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15720;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15721;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15722;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f15723;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4992[] f15724;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC4992 f15725;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f15726;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC18550 f15727;

    public static EnumC4992 valueOf(String str) {
        return (EnumC4992) Enum.valueOf(EnumC4992.class, str);
    }

    public static EnumC4992[] values() {
        return (EnumC4992[]) f15724.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4992[] m14477() {
        return new EnumC4992[]{f15725, f15716, f15717, f15720, f15718, f15719, f15721, f15722};
    }

    static {
        EnumC18550 enumC18550 = EnumC18550.f57495;
        f15725 = new EnumC4992("UNKNOWN", 0, -1, enumC18550);
        f15716 = new EnumC4992("DEREF", 1, 0, enumC18550);
        f15717 = new EnumC4992("ASSIGN", 2, 2, EnumC18550.f57522);
        f15720 = new EnumC4992("PREINC", 3, 4, EnumC18550.f57536);
        f15718 = new EnumC4992("PREDEC", 4, 6, EnumC18550.f57492);
        f15719 = new EnumC4992("POSTINC", 5, 8, EnumC18550.f57499);
        f15721 = new EnumC4992("POSTDEC", 6, 10, EnumC18550.f57567);
        EnumC4992 enumC4992 = new EnumC4992("FIRSTASGOP", 7, 12, enumC18550);
        f15722 = enumC4992;
        f15724 = m14477();
        f15723 = enumC4992.f15726 + 86;
    }

    public EnumC4992(String str, int i, int i2, EnumC18550 enumC18550) {
        super(str, i);
        this.f15726 = i2;
        this.f15727 = enumC18550;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4992 m14476(int i) {
        for (EnumC4992 enumC4992 : values()) {
            if (enumC4992.f15726 == i) {
                return enumC4992;
            }
        }
        return f15725;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14475(EnumC18550 enumC18550, int i) {
        int i2;
        int i3;
        int i4 = C17692.f54152[enumC18550.ordinal()];
        if (i4 == 1) {
            return f15720.f15726;
        }
        if (i4 == 2) {
            return f15718.f15726;
        }
        if (i4 == 3) {
            return f15719.f15726;
        }
        if (i4 == 4) {
            return f15721.f15726;
        }
        if (96 <= i && i <= 131) {
            i2 = (i - 96) * 2;
            i3 = f15722.f15726;
        } else {
            if (i == 256) {
                return f15722.f15726 + 72;
            }
            if (270 > i || i > 275) {
                return -1;
            }
            i2 = (i - 233) * 2;
            i3 = f15722.f15726;
        }
        return i2 + i3;
    }
}
