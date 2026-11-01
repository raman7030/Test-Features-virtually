package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܽܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public class EnumC18298 {

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f54639;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f54640;

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC18298 f54636 = new EnumC18298("BASIC", 0, false, false);

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC18298 f54635 = new EnumC18298("BOX", 1, true, false);

    /* JADX INFO: renamed from: ۬ */
    public static final EnumC18298 f54637 = new C12935();

    /* JADX INFO: renamed from: ᩶ */
    public static final /* synthetic */ EnumC18298[] f54638 = m41670();

    public /* synthetic */ EnumC18298(String str, int i, boolean z, boolean z2, int i2) {
        this(str, i, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo29609(AbstractC7783 abstractC7783, AbstractC7783 abstractC7784) {
        return abstractC7784;
    }

    public static EnumC18298 valueOf(String str) {
        return (EnumC18298) Enum.valueOf(EnumC18298.class, str);
    }

    public static EnumC18298[] values() {
        return (EnumC18298[]) f54638.clone();
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ EnumC18298[] m41670() {
        return new EnumC18298[]{f54636, f54635, f54637};
    }

    public EnumC18298(String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.f54639 = z;
        this.f54640 = z2;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m41671() {
        return this.f54639;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m41672() {
        return this.f54640;
    }
}
