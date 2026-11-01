package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.֨᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3642 {
    ADD(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, 16),
    AND(C0233a.f1084p, 16),
    ARRAY(16),
    CAST(16),
    CHECK_CAST(8),
    CONSTANT(0),
    DCMPG(16),
    DCMPL(16),
    IDIV("/", 8),
    LDIV("/", 8),
    FDIV("/", 16),
    DDIV("/", 16),
    EQ("==", 16),
    EXCEPTION_REF(0),
    FCMPG(16),
    FCMPL(16),
    FIELD(8),
    FILLED_ARRAY(8),
    GE(">=", 16),
    GT(">", 16),
    INSTANCE_OF(8),
    INVOKE_INTERFACE(8),
    INVOKE_NEW(8),
    INVOKE_SPECIAL(8),
    INVOKE_STATIC(8),
    INVOKE_VIRTUAL(8),
    INVOKE_CUSTOM(8),
    INVOKE_POLYMORPHIC(8),
    LCMP(16),
    LE("<=", 16),
    LENGTH(8),
    LOCAL(0),
    LT("<", 16),
    MUL("*", 16),
    NE("!=", 16),
    NEG(16),
    NEW(8),
    NEW_ARRAY(8),
    NEW_MUTI_ARRAY(8),
    NOT(16),
    OR("|", 16),
    PARAMETER_REF(0),
    PHI(0),
    REM("%", 16),
    SHL("<<", 16),
    SHR(">>", 16),
    STATIC_FIELD(8),
    SUB("-", 16),
    THIS_REF(16),
    USHR(">>>", 16),
    XOR("^", 16);


    /* JADX INFO: renamed from: ᩸ */
    public int f7641;

    /* JADX INFO: renamed from: ᩹ */
    public String f7642;

    EnumC3642(int i) {
        this(null, i);
    }

    EnumC3642(String str, int i) {
        this.f7642 = str;
        this.f7641 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = this.f7642;
        return str == null ? super.toString() : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m6907() {
        return 8 == this.f7641;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean m6908() {
        return 16 == this.f7641;
    }
}
