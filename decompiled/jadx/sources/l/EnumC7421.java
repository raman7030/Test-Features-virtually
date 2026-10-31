package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC7421 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f22809;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC7421 f22806 = new C10244();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7421 f22805 = new C6010();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7421 f22804 = new C11655();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC7421 f22803 = new C22943();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC7421 f22807 = new C13770();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7421[] f22808 = m19946();

    public /* synthetic */ EnumC7421(String str, int i, int i2, boolean z) {
        this(str, i, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC7421 mo16823(EnumC12360 enumC12360);

    public static EnumC7421 valueOf(String str) {
        return (EnumC7421) Enum.valueOf(EnumC7421.class, str);
    }

    public static EnumC7421[] values() {
        return (EnumC7421[]) f22808.clone();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7421[] m19946() {
        return new EnumC7421[]{f22806, f22805, f22804, f22803, f22807};
    }

    public EnumC7421(String str, int i, boolean z) {
        super(str, i);
        this.f22809 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m19947() {
        return this.f22809;
    }
}
