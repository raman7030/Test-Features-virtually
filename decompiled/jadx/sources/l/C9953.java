package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۤ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9953 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C2609 f30042;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C9953 f30043;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30044;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC9372 f30045;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f30046;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f30048;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C14169 f30049;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f30052;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2609 f30054;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f30055 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f30056 = -1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f30047 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f30057 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f30051 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f30053 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f30050 = Integer.MIN_VALUE;

    static {
        C2609 c2609M8239 = C2609.m8239();
        f30042 = c2609M8239;
        f30043 = new C9953(EnumC9372.UNKNOWN, -1, Integer.MIN_VALUE, null, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609M8239);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        EnumC9372 enumC9372 = this.f30045;
        sb.append(enumC9372);
        int i = C2897.f9235[enumC9372.ordinal()];
        int i2 = this.f30048;
        int i3 = this.f30046;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append(", offset = ");
                sb.append(this.f30056);
                break;
            case 5:
            case 6:
                if (this.f30047 == null) {
                    sb.append(", lvarOffset is null!");
                } else {
                    sb.append(", {");
                    for (int i4 = 0; i4 < this.f30047.length; i4++) {
                        if (i4 != 0) {
                            sb.append("; ");
                        }
                        sb.append("start_pc = ");
                        sb.append(this.f30047[i4]);
                        sb.append(", length = ");
                        sb.append(this.f30057[i4]);
                        sb.append(", index = ");
                        sb.append(this.f30051[i4]);
                    }
                    sb.append(l.d);
                }
                break;
            case 7:
            case 21:
            case 22:
                break;
            case 8:
            case 9:
                sb.append(", param_index = ");
                sb.append(i2);
                break;
            case 10:
            case 11:
                sb.append(", param_index = ");
                sb.append(i2);
                sb.append(", bound_index = ");
                sb.append(this.f30044);
                break;
            case 12:
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 13:
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 14:
                sb.append(", exception_index = ");
                sb.append(this.f30053);
                break;
            case 15:
                sb.append(", param_index = ");
                sb.append(i2);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                sb.append(", offset = ");
                sb.append(this.f30056);
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 23:
                sb.append(", position UNKNOWN!");
                break;
            default:
                C12171.m29640("Unknown target type: " + enumC9372);
                throw null;
        }
        if (!this.f30054.isEmpty()) {
            sb.append(", location = (");
            sb.append(this.f30054);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        sb.append(", pos = ");
        sb.append(this.f30052);
        C14169 c14169 = this.f30049;
        if (c14169 != null) {
            sb.append(", onLambda hash = ");
            sb.append(c14169.hashCode());
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25102(int i) {
        C12171.m29641("exception_index already set", !(this.f30053 >= 0));
        C12171.m29641("Expected a valid index into exception table", i >= 0);
        this.f30053 = i;
        this.f30055 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25103(int i, int i2) {
        C12171.m29641("exception_index is already set", !(this.f30053 >= 0));
        C12171.m29641("Expected a valid catch type", i >= 0);
        C12171.m29641("Expected a valid start position", i2 >= 0);
        this.f30053 = -(i + 1);
        this.f30050 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m25104() {
        C12171.m29641("exception_index is not set", this.f30053 >= 0);
        return this.f30053;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25106() {
        int i = this.f30053;
        return i < 0 && i != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m25101() {
        C12171.m29641("exception_index does not contain valid catch info", m25106());
        return (-this.f30053) - 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m25105() {
        C12171.m29641("exceptionStartPos does not contain valid start position", this.f30050 >= 0);
        return this.f30050;
    }

    public C9953(EnumC9372 enumC9372, int i, int i2, C14169 c14169, int i3, int i4, C2609 c2609) {
        C12171.m29637(c2609);
        this.f30045 = enumC9372;
        this.f30052 = i;
        this.f30048 = i2;
        this.f30049 = c14169;
        this.f30046 = i3;
        this.f30044 = i4;
        this.f30054 = c2609;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C9953 m25082(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.METHOD_RETURN, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C9953 m25089(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.METHOD_RECEIVER, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9953 m25094(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.METHOD_FORMAL_PARAMETER, i2, i, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C9953 m25099(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.METHOD_REFERENCE, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9953 m25079(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.CONSTRUCTOR_REFERENCE, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9953 m25091(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.FIELD, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9953 m25093(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.LOCAL_VARIABLE, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9953 m25086(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.EXCEPTION_PARAMETER, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C9953 m25084(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.RESOURCE_VARIABLE, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9953 m25097(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.NEW, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9953 m25080(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.CLASS_EXTENDS, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9953 m25095(C2609 c2609, C14169 c14169, int i) {
        return new C9953(EnumC9372.INSTANCEOF, i, Integer.MIN_VALUE, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9953 m25098(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.CAST, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C9953 m25096(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.METHOD_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9953 m25087(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C9953 m25085(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.CLASS_TYPE_PARAMETER, i2, i, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C9953 m25083(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.METHOD_TYPE_PARAMETER, i2, i, c14169, Integer.MIN_VALUE, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C9953 m25100(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.THROWS, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C9953 m25090(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.METHOD_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9953 m25092(C2609 c2609, C14169 c14169, int i, int i2) {
        return new C9953(EnumC9372.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c14169, i, Integer.MIN_VALUE, c2609);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C9953 m25088(C2609 c2609, C14169 c14169, int i, int i2, int i3) {
        return new C9953(EnumC9372.CLASS_TYPE_PARAMETER_BOUND, i3, i, c14169, Integer.MIN_VALUE, i2, c2609);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9953 m25081(C2609 c2609, C14169 c14169, int i, int i2, int i3) {
        return new C9953(EnumC9372.METHOD_TYPE_PARAMETER_BOUND, i3, i, c14169, Integer.MIN_VALUE, i2, c2609);
    }
}
