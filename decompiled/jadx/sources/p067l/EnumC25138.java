package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩻᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC25138 {

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC25138 f80469 = new C19103();

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC25138 f80467 = new C16420();

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC25138[] f80468 = m55189();

    public /* synthetic */ EnumC25138(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo37319(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C8374 c8374);

    public EnumC25138(String str, int i) {
        super(str, i);
    }

    public static EnumC25138 valueOf(String str) {
        return (EnumC25138) Enum.valueOf(EnumC25138.class, str);
    }

    public static EnumC25138[] values() {
        return (EnumC25138[]) f80468.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC25138[] m55189() {
        return new EnumC25138[]{f80469, f80467};
    }
}
