package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۤ֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11827 {

    /* JADX INFO: renamed from: ᩴ */
    public static final C4848 f32999;

    /* JADX INFO: renamed from: ᩵ */
    public static final C11827 f33000;

    /* JADX INFO: renamed from: ֫ */
    public final int f33001;

    /* JADX INFO: renamed from: ۖ */
    public final EnumC11275 f33002;

    /* JADX INFO: renamed from: ۘ */
    public final int f33003;

    /* JADX INFO: renamed from: ۡ */
    public int f33005;

    /* JADX INFO: renamed from: ۢ */
    public final C15834 f33006;

    /* JADX INFO: renamed from: ܺ */
    public final int f33009;

    /* JADX INFO: renamed from: ܿ */
    public C4848 f33011;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f33012 = false;

    /* JADX INFO: renamed from: ᩷ */
    public int f33013 = -1;

    /* JADX INFO: renamed from: ۜ */
    public int[] f33004 = null;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f33014 = null;

    /* JADX INFO: renamed from: ܳ */
    public int[] f33008 = null;

    /* JADX INFO: renamed from: ܽ */
    public int f33010 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۧ */
    public int f33007 = Integer.MIN_VALUE;

    static {
        C4848 c4848M10283 = C4848.m10283();
        f32999 = c4848M10283;
        f33000 = new C11827(EnumC11275.UNKNOWN, -1, Integer.MIN_VALUE, null, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848M10283);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        EnumC11275 enumC11275 = this.f33002;
        sb.append(enumC11275);
        int i = C5121.f12033[enumC11275.ordinal()];
        int i2 = this.f33005;
        int i3 = this.f33003;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                sb.append(", offset = ");
                sb.append(this.f33013);
                break;
            case 5:
            case 6:
                if (this.f33004 == null) {
                    sb.append(", lvarOffset is null!");
                } else {
                    sb.append(", {");
                    for (int i4 = 0; i4 < this.f33004.length; i4++) {
                        if (i4 != 0) {
                            sb.append("; ");
                        }
                        sb.append("start_pc = ");
                        sb.append(this.f33004[i4]);
                        sb.append(", length = ");
                        sb.append(this.f33014[i4]);
                        sb.append(", index = ");
                        sb.append(this.f33008[i4]);
                    }
                    sb.append(C0249l.f1198d);
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
                sb.append(this.f33001);
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
                sb.append(this.f33010);
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
                sb.append(this.f33013);
                sb.append(", type_index = ");
                sb.append(i3);
                break;
            case 23:
                sb.append(", position UNKNOWN!");
                break;
            default:
                C1446.m31702("Unknown target type: " + enumC11275);
                throw null;
        }
        if (!this.f33011.isEmpty()) {
            sb.append(", location = (");
            sb.append(this.f33011);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        sb.append(", pos = ");
        sb.append(this.f33009);
        C15834 c15834 = this.f33006;
        if (c15834 != null) {
            sb.append(", onLambda hash = ");
            sb.append(c15834.hashCode());
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27119(int i) {
        C1446.m31703("exception_index already set", !(this.f33010 >= 0));
        C1446.m31703("Expected a valid index into exception table", i >= 0);
        this.f33010 = i;
        this.f33012 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27120(int i, int i2) {
        C1446.m31703("exception_index is already set", !(this.f33010 >= 0));
        C1446.m31703("Expected a valid catch type", i >= 0);
        C1446.m31703("Expected a valid start position", i2 >= 0);
        this.f33010 = -(i + 1);
        this.f33007 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m27121() {
        C1446.m31703("exception_index is not set", this.f33010 >= 0);
        return this.f33010;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m27123() {
        int i = this.f33010;
        return i < 0 && i != Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27118() {
        C1446.m31703("exception_index does not contain valid catch info", m27123());
        return (-this.f33010) - 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m27122() {
        C1446.m31703("exceptionStartPos does not contain valid start position", this.f33007 >= 0);
        return this.f33007;
    }

    public C11827(EnumC11275 enumC11275, int i, int i2, C15834 c15834, int i3, int i4, C4848 c4848) {
        C1446.m31699(c4848);
        this.f33002 = enumC11275;
        this.f33009 = i;
        this.f33005 = i2;
        this.f33006 = c15834;
        this.f33003 = i3;
        this.f33001 = i4;
        this.f33011 = c4848;
    }

    /* JADX INFO: renamed from: ۜ */
    public static C11827 m27099(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.METHOD_RETURN, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܳ */
    public static C11827 m27106(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.METHOD_RECEIVER, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C11827 m27111(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.METHOD_FORMAL_PARAMETER, i2, i, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C11827 m27116(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.METHOD_REFERENCE, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11827 m27096(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.CONSTRUCTOR_REFERENCE, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11827 m27108(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.FIELD, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C11827 m27110(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.LOCAL_VARIABLE, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11827 m27103(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.EXCEPTION_PARAMETER, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۢ */
    public static C11827 m27101(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.RESOURCE_VARIABLE, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C11827 m27114(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.NEW, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11827 m27097(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.CLASS_EXTENDS, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C11827 m27112(C4848 c4848, C15834 c15834, int i) {
        return new C11827(EnumC11275.INSTANCEOF, i, Integer.MIN_VALUE, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C11827 m27115(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.CAST, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C11827 m27113(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.METHOD_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11827 m27104(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۢ */
    public static C11827 m27102(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.CLASS_TYPE_PARAMETER, i2, i, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۜ */
    public static C11827 m27100(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.METHOD_TYPE_PARAMETER, i2, i, c15834, Integer.MIN_VALUE, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C11827 m27117(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.THROWS, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܳ */
    public static C11827 m27107(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.METHOD_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11827 m27109(C4848 c4848, C15834 c15834, int i, int i2) {
        return new C11827(EnumC11275.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, i2, Integer.MIN_VALUE, c15834, i, Integer.MIN_VALUE, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C11827 m27105(C4848 c4848, C15834 c15834, int i, int i2, int i3) {
        return new C11827(EnumC11275.CLASS_TYPE_PARAMETER_BOUND, i3, i, c15834, Integer.MIN_VALUE, i2, c4848);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11827 m27098(C4848 c4848, C15834 c15834, int i, int i2, int i3) {
        return new C11827(EnumC11275.METHOD_TYPE_PARAMETER_BOUND, i3, i, c15834, Integer.MIN_VALUE, i2, c4848);
    }
}
