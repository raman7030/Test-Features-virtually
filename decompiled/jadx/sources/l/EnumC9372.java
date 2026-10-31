package l;

/* JADX INFO: renamed from: l.ۢۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T3FM */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9372 {
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


    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final int f28461 = 75;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC9372[] f28471 = new EnumC9372[76];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f28476;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f28477;

    static {
        for (EnumC9372 enumC9372 : values()) {
            int i = enumC9372.f28477;
            if (i != UNKNOWN.f28477) {
                f28471[i] = enumC9372;
            }
        }
        for (int i2 = 0; i2 <= 75; i2++) {
            EnumC9372[] enumC9372Arr = f28471;
            if (enumC9372Arr[i2] == null) {
                enumC9372Arr[i2] = UNKNOWN;
            }
        }
    }

    EnumC9372(int i) {
        this(i, false);
    }

    EnumC9372(int i, boolean z) {
        if (i < 0 || i > 255) {
            C12171.m29640("Attribute type value needs to be an unsigned byte: ".concat(String.format("0x%02X", Integer.valueOf(i))));
            throw null;
        }
        this.f28477 = i;
        this.f28476 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m24192() {
        return this.f28476;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m24193() {
        return this.f28477;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24190(int i) {
        if (i == UNKNOWN.f28477) {
            return true;
        }
        return i >= 0 && i < f28471.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9372 m24189(int i) {
        EnumC9372 enumC9372 = UNKNOWN;
        if (i == enumC9372.f28477) {
            return enumC9372;
        }
        if (i >= 0) {
            EnumC9372[] enumC9372Arr = f28471;
            if (i < enumC9372Arr.length) {
                return enumC9372Arr[i];
            }
        }
        C12171.m29640("Unknown TargetType: " + i);
        throw null;
    }
}
