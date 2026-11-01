package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۧۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC12793 {

    /* JADX INFO: renamed from: ۤ */
    public static final EnumC12793 f36002;

    /* JADX INFO: renamed from: ۫ */
    public static final EnumC12793 f36003;

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC12793 f36004;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC12793 f36005;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC12793[] f36006;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC20544 f36007;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC12793 f36001 = new C13976(EnumC20544.f63507);

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC12793 f36000 = new C11965(EnumC20544.f63505);

    public /* synthetic */ EnumC12793(String str, int i, EnumC20544 enumC20544, int i2) {
        this(str, i, enumC20544);
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract AbstractC6462 mo8180(C3108 c3108, C2733 c2733);

    public static EnumC12793 valueOf(String str) {
        return (EnumC12793) Enum.valueOf(EnumC12793.class, str);
    }

    public static EnumC12793[] values() {
        return (EnumC12793[]) f36006.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC12793[] m29343() {
        return new EnumC12793[]{f36001, f36000, f36004, f36003, f36002, f36005};
    }

    static {
        EnumC20544 enumC20544 = EnumC20544.f63504;
        f36004 = new C24034(enumC20544);
        f36003 = new C15316(enumC20544);
        f36002 = new C9282(enumC20544);
        f36005 = new C4075(enumC20544);
        f36006 = m29343();
    }

    public EnumC12793(String str, int i, EnumC20544 enumC20544) {
        super(str, i);
        this.f36007 = enumC20544;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo8179(C3108 c3108, C2733 c2733) {
        return m29344(c3108, c2733).m10293() && !c3108.m5298();
    }

    /* JADX INFO: renamed from: ۧ */
    public C4848 m29344(C3108 c3108, C2733 c2733) {
        return AbstractC6462.m14766(c3108.m5292(this.f36007), new C19341(c2733));
    }
}
