package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۢ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07Q0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9454 {
    BYTE(1, q.h, true),
    CHAR(2, 122, true),
    SHORT(4, 124, true),
    LONG(16, UMErrorCode.E_UM_BE_DEFLATE_FAILED, true),
    FLOAT(32, 96, true),
    INT(8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, true),
    DOUBLE(64, 64, true),
    BOOLEAN(0, 0, true),
    VOID,
    CLASS,
    ARRAY,
    METHOD,
    PACKAGE,
    MODULE,
    TYPEVAR,
    WILDCARD,
    FORALL,
    DEFERRED,
    BOT,
    NONE,
    ERROR,
    UNKNOWN,
    UNDETVAR,
    UNINITIALIZED_THIS,
    UNINITIALIZED_OBJECT;


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f28693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f28694;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f28695;

    EnumC9454() {
        this(0, 0, false);
    }

    EnumC9454(int i, int i2, boolean z) {
        this.f28693 = i2;
        this.f28695 = i;
        this.f28694 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m24297(EnumC9454 enumC9454) {
        return ((this.f28693 & enumC9454.f28695) == 0 || this == enumC9454) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m24299(EnumC9454 enumC9454) {
        return (enumC9454.f28695 & this.f28693) != 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m24294() {
        return UNDETVAR.ordinal() + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC3329 m24295() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return EnumC3329.CHAR_LITERAL;
        }
        if (iOrdinal == 9) {
            return EnumC3329.STRING_LITERAL;
        }
        if (iOrdinal == 18) {
            return EnumC3329.NULL_LITERAL;
        }
        if (iOrdinal == 3) {
            return EnumC3329.LONG_LITERAL;
        }
        if (iOrdinal == 4) {
            return EnumC3329.FLOAT_LITERAL;
        }
        if (iOrdinal == 5) {
            return EnumC3329.INT_LITERAL;
        }
        if (iOrdinal == 6) {
            return EnumC3329.DOUBLE_LITERAL;
        }
        if (iOrdinal == 7) {
            return EnumC3329.BOOLEAN_LITERAL;
        }
        throw new AssertionError("unknown literal kind " + this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC0701 m24298() {
        switch (this) {
            case BYTE:
                return EnumC0701.BYTE;
            case CHAR:
                return EnumC0701.CHAR;
            case SHORT:
                return EnumC0701.SHORT;
            case LONG:
                return EnumC0701.LONG;
            case FLOAT:
                return EnumC0701.FLOAT;
            case INT:
                return EnumC0701.INT;
            case DOUBLE:
                return EnumC0701.DOUBLE;
            case BOOLEAN:
                return EnumC0701.BOOLEAN;
            case VOID:
                return EnumC0701.VOID;
            default:
                throw new AssertionError("unknown primitive type " + this);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m24296(int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return -128 <= i && i <= 127;
        }
        if (iOrdinal == 1) {
            return i >= 0 && i <= 65535;
        }
        if (iOrdinal == 2) {
            return -32768 <= i && i <= 32767;
        }
        if (iOrdinal == 5) {
            return true;
        }
        if (iOrdinal == 7) {
            return i >= 0 && i <= 1;
        }
        throw new AssertionError();
    }
}
