package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩵֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC20544 {

    /* JADX INFO: renamed from: ᩶ */
    public static final EnumC20544 f63505 = new C4450();

    /* JADX INFO: renamed from: ᩹ */
    public static final EnumC20544 f63507 = new C5791();

    /* JADX INFO: renamed from: ۙ */
    public static final EnumC20544 f63504 = new C19873();

    /* JADX INFO: renamed from: ᩸ */
    public static final /* synthetic */ EnumC20544[] f63506 = m46448();

    public /* synthetic */ EnumC20544(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract EnumC20544 mo9305();

    public EnumC20544(String str, int i) {
        super(str, i);
    }

    public static EnumC20544 valueOf(String str) {
        return (EnumC20544) Enum.valueOf(EnumC20544.class, str);
    }

    public static EnumC20544[] values() {
        return (EnumC20544[]) f63506.clone();
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ EnumC20544[] m46448() {
        return new EnumC20544[]{f63505, f63507, f63504};
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m46449(EnumC20544 enumC20544) {
        int iOrdinal;
        if (enumC20544 != this && (iOrdinal = enumC20544.ordinal()) != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return true;
                }
                C1446.m31702("Cannot get here!");
                throw null;
            }
            if (this != f63504) {
                return true;
            }
        }
        return false;
    }
}
