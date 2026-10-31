package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۖۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC2461 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC18550 f7859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC2461 f7857 = new C9517(EnumC18550.f57556);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC2461 f7856 = new C8811(EnumC18550.f57519);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC2461 f7855 = new C15865(EnumC18550.f57493);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC2461[] f7858 = m7932();

    public /* synthetic */ EnumC2461(String str, int i, int i2, EnumC18550 enumC18550) {
        this(str, i, enumC18550);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract AbstractC5144 mo7933(AbstractC5144 abstractC5144);

    public static EnumC2461 valueOf(String str) {
        return (EnumC2461) Enum.valueOf(EnumC2461.class, str);
    }

    public static EnumC2461[] values() {
        return (EnumC2461[]) f7858.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC2461[] m7932() {
        return new EnumC2461[]{f7857, f7856, f7855};
    }

    public EnumC2461(String str, int i, EnumC18550 enumC18550) {
        super(str, i);
        this.f7859 = enumC18550;
    }
}
