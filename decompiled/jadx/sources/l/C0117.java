package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Collections;

/* JADX INFO: renamed from: l.֡ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C0117 extends AbstractC0823 implements Comparable, InterfaceC18504 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C3646 f1104 = new C3646();

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132[] f1105 = EnumC7132.values();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public EnumC19169 f1106;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f1107;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17757 f1108;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f1109;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C20766 f1110;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5057 f1111;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f1112;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17757 f1113;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9291 f1114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17757 f1115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14934 f1116;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f1117;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0117 c0117 = (C0117) obj;
        if (c0117.f1108 == this.f1108) {
            return this.f1110.m47467() - c0117.f1110.m47467();
        }
        throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    static {
        if (EnumC19169.f60399.length != EnumC6654.values().length) {
            throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m1130() {
        return this.f1112;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23338 mo1132() {
        return this.f1110;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f1110.getName();
    }

    @Override // l.InterfaceC18504
    public final int getNumber() {
        return this.f1110.m47467();
    }

    public final String toString() {
        return this.f1109;
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String mo1141() {
        return this.f1109;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final EnumC18463 m1138() {
        return getType().m44249();
    }

    @Override // l.InterfaceC18504
    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public final EnumC1694 mo1140() {
        return mo1142().m19146();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5057 mo1134() {
        return this.f1111;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m1135() {
        if (this.f1111.m14582().isEmpty()) {
            return getType() == EnumC19169.f60405 && this.f1114.m3069().m16725() == EnumC1030.CLOSED;
        }
        if (getType() == EnumC19169.f60405) {
            return ((C14724) m3069().m29576((AbstractC11408) C23897.f77257)).m35033() || this.f1114.m3069().m16725() == EnumC1030.CLOSED;
        }
        return false;
    }

    public final EnumC19169 getType() {
        C17757 c17757;
        C17757 c17758;
        if (this.f1106 == EnumC19169.f60400 && (((c17757 = this.f1115) == null || !c17757.mo1132().m46765().m39374()) && (((c17758 = this.f1108) == null || !c17758.mo1132().m46765().m39374()) && this.f2992 != null && m3069().m16722() == EnumC4558.DELIMITED))) {
            return EnumC19169.f60403;
        }
        return this.f1106;
    }

    @Override // l.InterfaceC18504
    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final EnumC7132 mo1142() {
        return f1105[getType().ordinal()];
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m1149() {
        if (getType() != EnumC19169.f60409) {
            return false;
        }
        if (this.f1108.mo1132().m46765().m39374() || ((C14724) m3069().m29576((AbstractC11408) C23897.f77257)).m35036().equals(EnumC17547.VERIFY)) {
            return true;
        }
        return m3069().m16729().equals(EnumC10203.VERIFY);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m1137() {
        return getType() == EnumC19169.f60400 && mo1129() && m1147().mo1132().m46765().m39374();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m1128() {
        return m3069().m16727() == EnumC15140.LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m1136() {
        return this.f1110.m47464() == EnumC14414.LABEL_OPTIONAL && m3069().m16727() != EnumC15140.LEGACY_REQUIRED;
    }

    @Override // l.InterfaceC18504
    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1129() {
        return this.f1110.m47464() == EnumC14414.LABEL_REPEATED;
    }

    @Override // l.InterfaceC18504
    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo1143() {
        if (m1133()) {
            return m3069().m16728().equals(EnumC13024.PACKED);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m1133() {
        return mo1129() && mo1142().mo16157();
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Object m1122() {
        if (m1138() == EnumC18463.MESSAGE) {
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }
        return this.f1107;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C17757 m1123() {
        if (this.f1110.m47461()) {
            return this.f1113;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not an extension. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1126() {
        return this.f1110.m47461();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C17757 m1144() {
        return this.f1108;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14934 m1139() {
        return this.f1116;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14934 m1148() {
        C14934 c14934 = this.f1116;
        if (c14934 == null || c14934.m35388()) {
            return null;
        }
        return c14934;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m1145() {
        if (mo1129()) {
            return false;
        }
        return this.f1117 || getType() == EnumC19169.f60400 || getType() == EnumC19169.f60403 || this.f1110.m47461() || this.f1116 != null || m3069().m16727() != EnumC15140.IMPLICIT;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m1125() {
        if (getType() != EnumC19169.f60403) {
            return false;
        }
        String lowerCase = m1147().getName().toLowerCase();
        C20766 c20766 = this.f1110;
        if (!lowerCase.equals(c20766.getName()) || m1147().mo1134() != this.f1111) {
            return false;
        }
        if (c20766.m47461()) {
            return m1147().m41596() == m1123();
        }
        return m1147().m41596() == this.f1108;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17757 m1147() {
        if (m1138() == EnumC18463.MESSAGE) {
            return this.f1115;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not of message type. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9291 m1127() {
        if (m1138() == EnumC18463.ENUM) {
            return this.f1114;
        }
        throw new UnsupportedOperationException(C4860.m14172("This field is not of enum type. (", this.f1109, MotionUtils.EASING_TYPE_FORMAT_END));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0117(C20766 c20766, C5057 c5057, C17757 c17757, int i, boolean z) throws C6468 {
        int i2 = 0;
        super(i2);
        this.f2993 = c17757;
        this.f1112 = i;
        this.f1110 = c20766;
        this.f1109 = C21991.m49472(c5057, c17757, c20766.getName());
        this.f1111 = c5057;
        if (c20766.hasType()) {
            this.f1106 = EnumC19169.m44247(c20766.getType());
        }
        this.f1117 = c20766.m47468();
        if (c20766.m47467() > 0) {
            if (z) {
                if (!c20766.m47461()) {
                    throw new C6468(this, "FieldDescriptorProto.extendee not set for extension field.", i2);
                }
                this.f1108 = null;
                if (c17757 != null) {
                    this.f1113 = c17757;
                } else {
                    this.f1113 = null;
                    this.f2993 = c5057;
                }
                if (c20766.m47472()) {
                    throw new C6468(this, "FieldDescriptorProto.oneof_index set for extension field.", i2);
                }
                this.f1116 = null;
            } else {
                if (c20766.m47461()) {
                    throw new C6468(this, "FieldDescriptorProto.extendee set for non-extension field.", i2);
                }
                this.f1108 = c17757;
                if (c20766.m47472()) {
                    if (c20766.m47458() < 0 || c20766.m47458() >= c17757.mo1132().m46756()) {
                        throw new C6468(this, "FieldDescriptorProto.oneof_index is out of range for type ".concat(c17757.getName()), i2);
                    }
                    C14934 c14934 = (C14934) c17757.m41589().get(c20766.m47458());
                    this.f1116 = c14934;
                    C14934.m35385(c14934);
                    this.f2993 = c14934;
                } else {
                    this.f1116 = null;
                }
                this.f1113 = null;
            }
            c5057.f15895.m51849(this);
            return;
        }
        throw new C6468(this, "Field numbers must be positive integers.", i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1118(C0117 c0117) {
        c0117.m3070(c0117.f1110.m47459().m9548());
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5969 mo1146() {
        C0324 c0324NewBuilder = C5969.newBuilder();
        C5057 c5057 = this.f1111;
        if (c5057.m14583().getNumber() >= EnumC3478.EDITION_2023.getNumber()) {
            return c0324NewBuilder.build();
        }
        C20766 c20766 = this.f1110;
        if (c20766.m47464() == EnumC14414.LABEL_REQUIRED) {
            c0324NewBuilder.m1736(EnumC15140.LEGACY_REQUIRED);
        }
        if (c20766.getType() == EnumC6654.TYPE_GROUP) {
            c0324NewBuilder.m1733(EnumC4558.DELIMITED);
        }
        if (c5057.m14583() == EnumC3478.EDITION_PROTO2 && c20766.m47459().m9538()) {
            c0324NewBuilder.m1735(EnumC13024.PACKED);
        }
        if (c5057.m14583() == EnumC3478.EDITION_PROTO3 && c20766.m47459().m9542() && !c20766.m47459().m9538()) {
            c0324NewBuilder.m1735(EnumC13024.EXPANDED);
        }
        return c0324NewBuilder.build();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo1150() {
        C5057 c5057 = this.f1111;
        if (c5057.m14583().getNumber() >= EnumC3478.EDITION_2023.getNumber()) {
            return false;
        }
        C20766 c20766 = this.f1110;
        if (c20766.m47464() == EnumC14414.LABEL_REQUIRED || c20766.getType() == EnumC6654.TYPE_GROUP || c20766.m47459().m9538()) {
            return true;
        }
        return c5057.m14583() == EnumC3478.EDITION_PROTO3 && c20766.m47459().m9542() && !c20766.m47459().m9538();
    }

    @Override // l.AbstractC0823
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo1131() throws C6468 {
        C17757 c17757 = this.f1108;
        if (c17757 != null && c17757.mo1132().m46765().m39380() && this.f1110.m47461()) {
            if (!m1136() || getType() != EnumC19169.f60400) {
                throw new C6468(this, "Extensions of MessageSets must be optional messages.", 0);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1119(C0117 c0117) throws C6468 {
        C5057 c5057 = c0117.f1111;
        C20766 c20766 = c0117.f1110;
        int i = 0;
        if (c20766.m47461()) {
            AbstractC0823 abstractC0823M51847 = c5057.f15895.m51847(c20766.m47471(), c0117, EnumC14228.TYPES_ONLY);
            if (!(abstractC0823M51847 instanceof C17757)) {
                throw new C6468(c0117, "\"" + c20766.m47471() + "\" is not a message type.", i);
            }
            C17757 c17757 = (C17757) abstractC0823M51847;
            c0117.f1108 = c17757;
            if (!c17757.m41594(c20766.m47467())) {
                throw new C6468(c0117, "\"" + c0117.f1108.mo1141() + "\" does not declare " + c20766.m47467() + " as an extension number.", i);
            }
        }
        if (c20766.m47460()) {
            AbstractC0823 abstractC0823M51848 = c5057.f15895.m51847(c20766.m47469(), c0117, EnumC14228.TYPES_ONLY);
            if (!c20766.hasType()) {
                if (abstractC0823M51848 instanceof C17757) {
                    c0117.f1106 = EnumC19169.f60400;
                } else if (abstractC0823M51848 instanceof C9291) {
                    c0117.f1106 = EnumC19169.f60405;
                } else {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not a type.", i);
                }
            }
            if (c0117.f1106.m44249() == EnumC18463.MESSAGE) {
                if (!(abstractC0823M51848 instanceof C17757)) {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not a message type.", i);
                }
                c0117.f1115 = (C17757) abstractC0823M51848;
                if (c20766.m47456()) {
                    throw new C6468(c0117, "Messages can't have default values.", i);
                }
            } else if (c0117.f1106.m44249() == EnumC18463.ENUM) {
                if (!(abstractC0823M51848 instanceof C9291)) {
                    throw new C6468(c0117, "\"" + c20766.m47469() + "\" is not an enum type.", i);
                }
                c0117.f1114 = (C9291) abstractC0823M51848;
            } else {
                throw new C6468(c0117, "Field with primitive type has type_name.", i);
            }
        } else if (c0117.f1106.m44249() == EnumC18463.MESSAGE || c0117.f1106.m44249() == EnumC18463.ENUM) {
            throw new C6468(c0117, "Field with message or enum type missing type_name.", i);
        }
        if (c20766.m47459().m9538() && !c0117.m1133()) {
            throw new C6468(c0117, "[packed = true] can only be specified for repeated primitive fields.", i);
        }
        if (c20766.m47456()) {
            if (c0117.mo1129()) {
                throw new C6468(c0117, "Repeated fields cannot have default values.", i);
            }
            try {
                switch (C16345.f50316[c0117.f1106.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        c0117.f1107 = Integer.valueOf(C11490.m28309(c20766.m47462()));
                        return;
                    case 4:
                    case 5:
                        c0117.f1107 = Integer.valueOf(C11490.m28314(c20766.m47462()));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        c0117.f1107 = Long.valueOf(C11490.m28312(c20766.m47462()));
                        return;
                    case 9:
                    case 10:
                        c0117.f1107 = Long.valueOf(C11490.m28316(c20766.m47462()));
                        return;
                    case 11:
                        if (c20766.m47462().equals("inf")) {
                            c0117.f1107 = Float.valueOf(Float.POSITIVE_INFINITY);
                            return;
                        }
                        if (c20766.m47462().equals("-inf")) {
                            c0117.f1107 = Float.valueOf(Float.NEGATIVE_INFINITY);
                            return;
                        } else if (c20766.m47462().equals("nan")) {
                            c0117.f1107 = Float.valueOf(Float.NaN);
                            return;
                        } else {
                            c0117.f1107 = Float.valueOf(c20766.m47462());
                            return;
                        }
                    case 12:
                        if (c20766.m47462().equals("inf")) {
                            c0117.f1107 = Double.valueOf(Double.POSITIVE_INFINITY);
                            return;
                        }
                        if (c20766.m47462().equals("-inf")) {
                            c0117.f1107 = Double.valueOf(Double.NEGATIVE_INFINITY);
                            return;
                        } else if (c20766.m47462().equals("nan")) {
                            c0117.f1107 = Double.valueOf(Double.NaN);
                            return;
                        } else {
                            c0117.f1107 = Double.valueOf(c20766.m47462());
                            return;
                        }
                    case 13:
                        c0117.f1107 = Boolean.valueOf(c20766.m47462());
                        return;
                    case 14:
                        c0117.f1107 = c20766.m47462();
                        return;
                    case 15:
                        try {
                            c0117.f1107 = C11490.m28315(c20766.m47462());
                            return;
                        } catch (C3023 e) {
                            throw new C6468(c0117, "Couldn't parse default value: " + e.getMessage(), e);
                        }
                    case 16:
                        C2235 c2235M23852 = c0117.f1114.m23852(c20766.m47462());
                        c0117.f1107 = c2235M23852;
                        if (c2235M23852 != null) {
                            return;
                        }
                        throw new C6468(c0117, "Unknown enum default value: \"" + c20766.m47462() + '\"', i);
                    case 17:
                    case 18:
                        throw new C6468(c0117, "Message type had default value.", i);
                    default:
                        return;
                }
            } catch (NumberFormatException e2) {
                throw new C6468(c0117, "Could not parse default value: \"" + c20766.m47462() + '\"', e2);
            }
            throw new C6468(c0117, "Could not parse default value: \"" + c20766.m47462() + '\"', e2);
        }
        if (c0117.mo1129()) {
            c0117.f1107 = Collections.EMPTY_LIST;
            return;
        }
        int i2 = C16345.f50315[c0117.f1106.m44249().ordinal()];
        if (i2 == 1) {
            c0117.f1107 = c0117.f1114.m23854().get(0);
        } else if (i2 != 2) {
            c0117.f1107 = c0117.f1106.m44249().f57252;
        } else {
            c0117.f1107 = null;
        }
    }

    @Override // l.InterfaceC18504
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9228 mo1124(InterfaceC9228 interfaceC9228, InterfaceC8522 interfaceC8522) {
        return ((InterfaceC14165) interfaceC9228).mergeFrom((InterfaceC23338) interfaceC8522);
    }
}
