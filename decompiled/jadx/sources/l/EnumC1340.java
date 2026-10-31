package l;

import com.alipay.sdk.m.w.a;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: renamed from: l.֨᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1340 {
    ADD(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, 16),
    AND(a.p, 16),
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


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4871;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f4872;

    EnumC1340(int i) {
        this(null, i);
    }

    EnumC1340(String str, int i) {
        this.f4872 = str;
        this.f4871 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        String str = this.f4872;
        return str == null ? super.toString() : str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m4675() {
        return 8 == this.f4871;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m4676() {
        return 16 == this.f4871;
    }
}
