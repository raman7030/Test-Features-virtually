package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۖۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4707 {

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC19998 f10647;

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC4707 f10645 = new C11413(EnumC19998.f60780);

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC4707 f10644 = new C10742(EnumC19998.f60743);

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC4707 f10643 = new C17446(EnumC19998.f60717);

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ EnumC4707[] f10646 = m9980();

    public /* synthetic */ EnumC4707(String str, int i, int i2, EnumC19998 enumC19998) {
        this(str, i, enumC19998);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC7257 mo9981(AbstractC7257 abstractC7257);

    public static EnumC4707 valueOf(String str) {
        return (EnumC4707) Enum.valueOf(EnumC4707.class, str);
    }

    public static EnumC4707[] values() {
        return (EnumC4707[]) f10646.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ EnumC4707[] m9980() {
        return new EnumC4707[]{f10645, f10644, f10643};
    }

    public EnumC4707(String str, int i, EnumC19998 enumC19998) {
        super(str, i);
        this.f10647 = enumC19998;
    }
}
