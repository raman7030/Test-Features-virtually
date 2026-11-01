package p067l;

import java.util.EnumSet;

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
/* JADX INFO: renamed from: l.ᩴۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20012 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC20012 f60838;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC20012 f60839;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC20012 f60840;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC20012[] f60841;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumSet f60842;

    public static EnumC20012 valueOf(String str) {
        return (EnumC20012) Enum.valueOf(EnumC20012.class, str);
    }

    public static EnumC20012[] values() {
        return (EnumC20012[]) f60841.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC20012[] m45382() {
        return new EnumC20012[]{f60840, f60839, f60838};
    }

    static {
        EnumC12793 enumC12793 = EnumC12793.f36001;
        f60840 = new EnumC20012("EQ", 0, EnumSet.of(enumC12793));
        EnumC12793 enumC12794 = EnumC12793.f36000;
        f60839 = new EnumC20012("EQ_LOWER", 1, EnumSet.of(enumC12793, enumC12794));
        f60838 = new EnumC20012("EQ_LOWER_THROWS_UPPER_CAPTURED", 2, EnumSet.of(enumC12793, enumC12794, EnumC12793.f36003, EnumC12793.f36004, EnumC12793.f36005));
        f60841 = m45382();
    }

    public EnumC20012(String str, int i, EnumSet enumSet) {
        super(str, i);
        this.f60842 = enumSet;
    }
}
