package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۢ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 07Q0 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11353 {
    BYTE(1, C0254q.f1218h, true),
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


    /* JADX INFO: renamed from: ᩶ */
    public final int f31642;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f31643;

    /* JADX INFO: renamed from: ᩹ */
    public final int f31644;

    EnumC11353() {
        this(0, 0, false);
    }

    EnumC11353(int i, int i2, boolean z) {
        this.f31642 = i2;
        this.f31644 = i;
        this.f31643 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m26307(EnumC11353 enumC11353) {
        return ((this.f31642 & enumC11353.f31644) == 0 || this == enumC11353) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m26309(EnumC11353 enumC11353) {
        return (enumC11353.f31644 & this.f31642) != 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static int m26304() {
        return UNDETVAR.ordinal() + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC5532 m26305() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return EnumC5532.CHAR_LITERAL;
        }
        if (iOrdinal == 9) {
            return EnumC5532.STRING_LITERAL;
        }
        if (iOrdinal == 18) {
            return EnumC5532.NULL_LITERAL;
        }
        if (iOrdinal == 3) {
            return EnumC5532.LONG_LITERAL;
        }
        if (iOrdinal == 4) {
            return EnumC5532.FLOAT_LITERAL;
        }
        if (iOrdinal == 5) {
            return EnumC5532.INT_LITERAL;
        }
        if (iOrdinal == 6) {
            return EnumC5532.DOUBLE_LITERAL;
        }
        if (iOrdinal == 7) {
            return EnumC5532.BOOLEAN_LITERAL;
        }
        throw new AssertionError("unknown literal kind " + this);
    }

    /* JADX INFO: renamed from: ۧ */
    public EnumC3035 m26308() {
        switch (this) {
            case BYTE:
                return EnumC3035.BYTE;
            case CHAR:
                return EnumC3035.CHAR;
            case SHORT:
                return EnumC3035.SHORT;
            case LONG:
                return EnumC3035.LONG;
            case FLOAT:
                return EnumC3035.FLOAT;
            case INT:
                return EnumC3035.INT;
            case DOUBLE:
                return EnumC3035.DOUBLE;
            case BOOLEAN:
                return EnumC3035.BOOLEAN;
            case VOID:
                return EnumC3035.VOID;
            default:
                throw new AssertionError("unknown primitive type " + this);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m26306(int i) {
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
