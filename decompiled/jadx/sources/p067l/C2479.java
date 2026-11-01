package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C2479 extends AbstractC3150 implements Comparable, InterfaceC19954 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C5833 f3880 = new C5833();

    /* JADX INFO: renamed from: ܽ֫ */
    public static final EnumC9146[] f3881 = EnumC9146.values();

    /* JADX INFO: renamed from: ֫֫ */
    public EnumC20586 f3882;

    /* JADX INFO: renamed from: ۗ */
    public Object f3883;

    /* JADX INFO: renamed from: ۙ */
    public C19244 f3884;

    /* JADX INFO: renamed from: ۛ */
    public final String f3885;

    /* JADX INFO: renamed from: ۟ */
    public C22104 f3886;

    /* JADX INFO: renamed from: ۤ */
    public final C7174 f3887;

    /* JADX INFO: renamed from: ۨ */
    public final int f3888;

    /* JADX INFO: renamed from: ۫ */
    public final C19244 f3889;

    /* JADX INFO: renamed from: ۬ */
    public C11198 f3890;

    /* JADX INFO: renamed from: ܰ */
    public C19244 f3891;

    /* JADX INFO: renamed from: ᩶ */
    public C16561 f3892;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f3893;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2479 c2479 = (C2479) obj;
        if (c2479.f3884 == this.f3884) {
            return this.f3886.m49795() - c2479.f3886.m49795();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    static {
        if (EnumC20586.f63630.length != EnumC8692.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m3531() {
        return this.f3888;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC24548 mo3533() {
        return this.f3886;
    }

    @Override // p067l.AbstractC3150
    public final String getName() {
        return this.f3886.getName();
    }

    @Override // p067l.InterfaceC19954
    public final int getNumber() {
        return this.f3886.m49795();
    }

    public final String toString() {
        return this.f3885;
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ܿ */
    public final String mo3542() {
        return this.f3885;
    }

    /* JADX INFO: renamed from: ܶ */
    public final EnumC19915 m3539() {
        return getType().m46544();
    }

    @Override // p067l.InterfaceC19954
    /* JADX INFO: renamed from: ܽܽ */
    public final EnumC3978 mo3541() {
        return mo3543().m21089();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۧ */
    public final C7174 mo3535() {
        return this.f3887;
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m3536() {
        if (this.f3887.m16489().isEmpty()) {
            return getType() == EnumC20586.f63636 && this.f3890.m5383().m18651() == EnumC3347.CLOSED;
        }
        if (getType() == EnumC20586.f63636) {
            return ((C16362) m5383().m31641((AbstractC13210) C25080.f80008)).m37180() || this.f3890.m5383().m18651() == EnumC3347.CLOSED;
        }
        return false;
    }

    public final EnumC20586 getType() {
        C19244 c19244;
        C19244 c19245;
        if (this.f3882 == EnumC20586.f63631 && (((c19244 = this.f3891) == null || !c19244.mo3533().m49088().m41610()) && (((c19245 = this.f3884) == null || !c19245.mo3533().m49088().m41610()) && this.f5766 != null && m5383().m18648() == EnumC6700.DELIMITED))) {
            return EnumC20586.f63634;
        }
        return this.f3882;
    }

    @Override // p067l.InterfaceC19954
    /* JADX INFO: renamed from: ᩳۧ */
    public final EnumC9146 mo3543() {
        return f3881[getType().ordinal()];
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m3550() {
        if (getType() != EnumC20586.f63640) {
            return false;
        }
        if (this.f3884.mo3533().m49088().m41610() || ((C16362) m5383().m31641((AbstractC13210) C25080.f80008)).m37183().equals(EnumC19045.VERIFY)) {
            return true;
        }
        return m5383().m18655().equals(EnumC12065.VERIFY);
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m3538() {
        return getType() == EnumC20586.f63631 && mo3530() && m3548().mo3533().m49088().m41610();
    }

    /* JADX INFO: renamed from: ۛ */
    public final boolean m3529() {
        return m5383().m18653() == EnumC16757.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m3537() {
        return this.f3886.m49792() == EnumC16067.LABEL_OPTIONAL && m5383().m18653() != EnumC16757.LEGACY_REQUIRED;
    }

    @Override // p067l.InterfaceC19954
    /* JADX INFO: renamed from: ۟֫ */
    public final boolean mo3530() {
        return this.f3886.m49792() == EnumC16067.LABEL_REPEATED;
    }

    @Override // p067l.InterfaceC19954
    /* JADX INFO: renamed from: ᩳܽ */
    public final boolean mo3544() {
        if (m3534()) {
            return m5383().m18654().equals(EnumC14746.PACKED);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m3534() {
        return mo3530() && mo3543().mo18076();
    }

    /* JADX INFO: renamed from: ֡ */
    public final Object m3523() {
        if (m3539() == EnumC19915.MESSAGE) {
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }
        return this.f3883;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C19244 m3524() {
        if (this.f3886.m49789()) {
            return this.f3889;
        }
        throw new UnsupportedOperationException(C6988.m16053("This field is not an extension. (", this.f3885, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۙ */
    public final boolean m3527() {
        return this.f3886.m49789();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C19244 m3545() {
        return this.f3884;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C16561 m3540() {
        return this.f3892;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final C16561 m3549() {
        C16561 c16561 = this.f3892;
        if (c16561 == null || c16561.m37540()) {
            return null;
        }
        return c16561;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m3546() {
        if (mo3530()) {
            return false;
        }
        return this.f3893 || getType() == EnumC20586.f63631 || getType() == EnumC20586.f63634 || this.f3886.m49789() || this.f3892 != null || m5383().m18653() != EnumC16757.IMPLICIT;
    }

    /* JADX INFO: renamed from: ۗ */
    public final boolean m3526() {
        if (getType() != EnumC20586.f63634) {
            return false;
        }
        String lowerCase = m3548().getName().toLowerCase();
        C22104 c22104 = this.f3886;
        if (!lowerCase.equals(c22104.getName()) || m3548().mo3535() != this.f3887) {
            return false;
        }
        if (c22104.m49789()) {
            return m3548().m43841() == m3524();
        }
        return m3548().m43841() == this.f3884;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C19244 m3548() {
        if (m3539() == EnumC19915.MESSAGE) {
            return this.f3891;
        }
        throw new UnsupportedOperationException(C6988.m16053("This field is not of message type. (", this.f3885, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۚ */
    public final C11198 m3528() {
        if (m3539() == EnumC19915.ENUM) {
            return this.f3890;
        }
        throw new UnsupportedOperationException(C6988.m16053("This field is not of enum type. (", this.f3885, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2479(C22104 c22104, C7174 c7174, C19244 c19244, int i, boolean z) throws C8515 {
        int i2 = 0;
        super(i2);
        this.f5767 = c19244;
        this.f3888 = i;
        this.f3886 = c22104;
        this.f3885 = C23268.m51807(c7174, c19244, c22104.getName());
        this.f3887 = c7174;
        if (c22104.hasType()) {
            this.f3882 = EnumC20586.m46542(c22104.getType());
        }
        this.f3893 = c22104.m49796();
        if (c22104.m49795() > 0) {
            if (z) {
                if (!c22104.m49789()) {
                    throw new C8515(this, "FieldDescriptorProto.extendee not set for extension field.", i2);
                }
                this.f3884 = null;
                if (c19244 != null) {
                    this.f3889 = c19244;
                } else {
                    this.f3889 = null;
                    this.f5767 = c7174;
                }
                if (c22104.m49800()) {
                    throw new C8515(this, "FieldDescriptorProto.oneof_index set for extension field.", i2);
                }
                this.f3892 = null;
            } else {
                if (c22104.m49789()) {
                    throw new C8515(this, "FieldDescriptorProto.extendee set for non-extension field.", i2);
                }
                this.f3884 = c19244;
                if (c22104.m49800()) {
                    if (c22104.m49786() < 0 || c22104.m49786() >= c19244.mo3533().m49079()) {
                        throw new C8515(this, "FieldDescriptorProto.oneof_index is out of range for type ".concat(c19244.getName()), i2);
                    }
                    C16561 c16561 = (C16561) c19244.m43834().get(c22104.m49786());
                    this.f3892 = c16561;
                    C16561.m37537(c16561);
                    this.f5767 = c16561;
                } else {
                    this.f3892 = null;
                }
                this.f3889 = null;
            }
            c7174.f18731.m54247(this);
            return;
        }
        throw new C8515(this, "Field numbers must be positive integers.", i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3519(C2479 c2479) {
        c2479.m5384(c2479.f3886.m49787().m11591());
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ᩷ */
    public final C8041 mo3547() {
        C2676 c2676NewBuilder = C8041.newBuilder();
        C7174 c7174 = this.f3887;
        if (c7174.m16490().getNumber() >= EnumC5674.EDITION_2023.getNumber()) {
            return c2676NewBuilder.build();
        }
        C22104 c22104 = this.f3886;
        if (c22104.m49792() == EnumC16067.LABEL_REQUIRED) {
            c2676NewBuilder.m4134(EnumC16757.LEGACY_REQUIRED);
        }
        if (c22104.getType() == EnumC8692.TYPE_GROUP) {
            c2676NewBuilder.m4131(EnumC6700.DELIMITED);
        }
        if (c7174.m16490() == EnumC5674.EDITION_PROTO2 && c22104.m49787().m11581()) {
            c2676NewBuilder.m4133(EnumC14746.PACKED);
        }
        if (c7174.m16490() == EnumC5674.EDITION_PROTO3 && c22104.m49787().m11585() && !c22104.m49787().m11581()) {
            c2676NewBuilder.m4133(EnumC14746.EXPANDED);
        }
        return c2676NewBuilder.build();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3551() {
        C7174 c7174 = this.f3887;
        if (c7174.m16490().getNumber() >= EnumC5674.EDITION_2023.getNumber()) {
            return false;
        }
        C22104 c22104 = this.f3886;
        if (c22104.m49792() == EnumC16067.LABEL_REQUIRED || c22104.getType() == EnumC8692.TYPE_GROUP || c22104.m49787().m11581()) {
            return true;
        }
        return c7174.m16490() == EnumC5674.EDITION_PROTO3 && c22104.m49787().m11585() && !c22104.m49787().m11581();
    }

    @Override // p067l.AbstractC3150
    /* JADX INFO: renamed from: ۡ */
    public final void mo3532() throws C8515 {
        C19244 c19244 = this.f3884;
        if (c19244 != null && c19244.mo3533().m49088().m41616() && this.f3886.m49789()) {
            if (!m3537() || getType() != EnumC20586.f63631) {
                throw new C8515(this, "Extensions of MessageSets must be optional messages.", 0);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m3520(C2479 c2479) throws C8515 {
        C7174 c7174 = c2479.f3887;
        C22104 c22104 = c2479.f3886;
        int i = 0;
        if (c22104.m49789()) {
            AbstractC3150 abstractC3150M54245 = c7174.f18731.m54245(c22104.m49799(), c2479, EnumC15890.TYPES_ONLY);
            if (!(abstractC3150M54245 instanceof C19244)) {
                throw new C8515(c2479, "\"" + c22104.m49799() + "\" is not a message type.", i);
            }
            C19244 c19244 = (C19244) abstractC3150M54245;
            c2479.f3884 = c19244;
            if (!c19244.m43839(c22104.m49795())) {
                throw new C8515(c2479, "\"" + c2479.f3884.mo3542() + "\" does not declare " + c22104.m49795() + " as an extension number.", i);
            }
        }
        if (c22104.m49788()) {
            AbstractC3150 abstractC3150M54246 = c7174.f18731.m54245(c22104.m49797(), c2479, EnumC15890.TYPES_ONLY);
            if (!c22104.hasType()) {
                if (abstractC3150M54246 instanceof C19244) {
                    c2479.f3882 = EnumC20586.f63631;
                } else if (abstractC3150M54246 instanceof C11198) {
                    c2479.f3882 = EnumC20586.f63636;
                } else {
                    throw new C8515(c2479, "\"" + c22104.m49797() + "\" is not a type.", i);
                }
            }
            if (c2479.f3882.m46544() == EnumC19915.MESSAGE) {
                if (!(abstractC3150M54246 instanceof C19244)) {
                    throw new C8515(c2479, "\"" + c22104.m49797() + "\" is not a message type.", i);
                }
                c2479.f3891 = (C19244) abstractC3150M54246;
                if (c22104.m49784()) {
                    throw new C8515(c2479, "Messages can't have default values.", i);
                }
            } else if (c2479.f3882.m46544() == EnumC19915.ENUM) {
                if (!(abstractC3150M54246 instanceof C11198)) {
                    throw new C8515(c2479, "\"" + c22104.m49797() + "\" is not an enum type.", i);
                }
                c2479.f3890 = (C11198) abstractC3150M54246;
            } else {
                throw new C8515(c2479, "Field with primitive type has type_name.", i);
            }
        } else if (c2479.f3882.m46544() == EnumC19915.MESSAGE || c2479.f3882.m46544() == EnumC19915.ENUM) {
            throw new C8515(c2479, "Field with message or enum type missing type_name.", i);
        }
        if (c22104.m49787().m11581() && !c2479.m3534()) {
            throw new C8515(c2479, "[packed = true] can only be specified for repeated primitive fields.", i);
        }
        if (c22104.m49784()) {
            if (c2479.mo3530()) {
                throw new C8515(c2479, "Repeated fields cannot have default values.", i);
            }
            try {
                switch (C17902.f53489[c2479.f3882.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c2479.f3883 = Integer.valueOf(C13288.m30353(c22104.m49790()));
                        return;
                    case 4:
                    case 5:
                        c2479.f3883 = Integer.valueOf(C13288.m30358(c22104.m49790()));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        c2479.f3883 = Long.valueOf(C13288.m30356(c22104.m49790()));
                        return;
                    case 9:
                    case 10:
                        c2479.f3883 = Long.valueOf(C13288.m30360(c22104.m49790()));
                        return;
                    case 11:
                        if (c22104.m49790().equals("inf")) {
                            c2479.f3883 = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (c22104.m49790().equals("-inf")) {
                            c2479.f3883 = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (c22104.m49790().equals("nan")) {
                            c2479.f3883 = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            c2479.f3883 = Float.valueOf(c22104.m49790());
                            return;
                        }
                    case 12:
                        if (c22104.m49790().equals("inf")) {
                            c2479.f3883 = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (c22104.m49790().equals("-inf")) {
                            c2479.f3883 = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (c22104.m49790().equals("nan")) {
                            c2479.f3883 = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            c2479.f3883 = Double.valueOf(c22104.m49790());
                            return;
                        }
                    case 13:
                        c2479.f3883 = Boolean.valueOf(c22104.m49790());
                        return;
                    case 14:
                        c2479.f3883 = c22104.m49790();
                        return;
                    case 15:
                        try {
                            c2479.f3883 = C13288.m30359(c22104.m49790());
                            return;
                        } catch (C5241 e) {
                            throw new C8515(c2479, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 16:
                        C4492 c4492M25861 = c2479.f3890.m25861(c22104.m49790());
                        c2479.f3883 = c4492M25861;
                        if (c4492M25861 != null) {
                            return;
                        }
                        throw new C8515(c2479, "Unknown enum default value: \"" + c22104.m49790() + '\"', i);
                    case 17:
                    case 18:
                        throw new C8515(c2479, "Message type had default value.", i);
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new C8515(c2479, "Could not parse default value: \"" + c22104.m49790() + '\"', e2);
            }
            throw new C8515(c2479, "Could not parse default value: \"" + c22104.m49790() + '\"', e2);
        }
        if (c2479.mo3530()) {
            c2479.f3883 = Collections.EMPTY_LIST;
            return;
        }
        int i2 = C17902.f53488[c2479.f3882.m46544().ordinal()];
        if (i2 == 1) {
            c2479.f3883 = c2479.f3890.m25863().get(0);
        } else if (i2 != 2) {
            c2479.f3883 = c2479.f3882.m46544().f60472;
        } else {
            c2479.f3883 = null;
        }
    }

    @Override // p067l.InterfaceC19954
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11138 mo3525(InterfaceC11138 interfaceC11138, InterfaceC10467 interfaceC10467) {
        return ((InterfaceC15830) interfaceC11138).mergeFrom((InterfaceC24548) interfaceC10467);
    }
}
