package p067l;

/* JADX INFO: renamed from: l.ۢۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T3FM */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11275 {
    CLASS_TYPE_PARAMETER(0),
    METHOD_TYPE_PARAMETER(1),
    CLASS_EXTENDS(16),
    CLASS_TYPE_PARAMETER_BOUND(17),
    METHOD_TYPE_PARAMETER_BOUND(18),
    FIELD(19),
    METHOD_RETURN(20),
    METHOD_RECEIVER(21),
    METHOD_FORMAL_PARAMETER(22),
    THROWS(23),
    LOCAL_VARIABLE(64, true),
    RESOURCE_VARIABLE(65, true),
    EXCEPTION_PARAMETER(66, true),
    INSTANCEOF(67, true),
    NEW(68, true),
    CONSTRUCTOR_REFERENCE(69, true),
    METHOD_REFERENCE(70, true),
    CAST(71, true),
    CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT(72, true),
    METHOD_INVOCATION_TYPE_ARGUMENT(73, true),
    CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT(74, true),
    METHOD_REFERENCE_TYPE_ARGUMENT(75, true),
    UNKNOWN(255);


    /* JADX INFO: renamed from: ۧ֫ */
    public static final int f31410 = 75;

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final EnumC11275[] f31420 = new EnumC11275[76];

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f31425;

    /* JADX INFO: renamed from: ᩹ */
    public final int f31426;

    static {
        for (EnumC11275 enumC11275 : values()) {
            int i = enumC11275.f31426;
            if (i != UNKNOWN.f31426) {
                f31420[i] = enumC11275;
            }
        }
        for (int i2 = 0; i2 <= 75; i2++) {
            EnumC11275[] enumC11275Arr = f31420;
            if (enumC11275Arr[i2] == null) {
                enumC11275Arr[i2] = UNKNOWN;
            }
        }
    }

    EnumC11275(int i) {
        this(i, false);
    }

    EnumC11275(int i, boolean z) {
        if (i < 0 || i > 255) {
            C1446.m31702("Attribute type value needs to be an unsigned byte: ".concat(String.format("0x%02X", Integer.valueOf(i))));
            throw null;
        }
        this.f31426 = i;
        this.f31425 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m26202() {
        return this.f31425;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m26203() {
        return this.f31426;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m26200(int i) {
        if (i == UNKNOWN.f31426) {
            return true;
        }
        return i >= 0 && i < f31420.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC11275 m26199(int i) {
        EnumC11275 enumC11275 = UNKNOWN;
        if (i == enumC11275.f31426) {
            return enumC11275;
        }
        if (i >= 0) {
            EnumC11275[] enumC11275Arr = f31420;
            if (i < enumC11275Arr.length) {
                return enumC11275Arr[i];
            }
        }
        C1446.m31702("Unknown TargetType: " + i);
        throw null;
    }
}
