package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܽܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public class EnumC16761 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f51457;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f51458;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC16761 f51454 = new EnumC16761("BASIC", 0, false, false);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC16761 f51453 = new EnumC16761("BOX", 1, true, false);

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC16761 f51455 = new C11118();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC16761[] f51456 = m39434();

    public /* synthetic */ EnumC16761(String str, int i, boolean z, boolean z2, int i2) {
        this(str, i, z, z2);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC5698 mo27547(AbstractC5698 abstractC5698, AbstractC5698 abstractC5699) {
        return abstractC5699;
    }

    public static EnumC16761 valueOf(String str) {
        return (EnumC16761) Enum.valueOf(EnumC16761.class, str);
    }

    public static EnumC16761[] values() {
        return (EnumC16761[]) f51456.clone();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC16761[] m39434() {
        return new EnumC16761[]{f51454, f51453, f51455};
    }

    public EnumC16761(String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.f51457 = z;
        this.f51458 = z2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m39435() {
        return this.f51457;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m39436() {
        return this.f51458;
    }
}
