package l;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12818 extends AbstractC20704 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9249 f38461;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C17757 f38462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3687 f38463;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0117[] f38464;

    public /* synthetic */ C12818(C17757 c17757, int i) {
        this(c17757);
    }

    @Override // l.AbstractC20704
    public final /* bridge */ /* synthetic */ InterfaceC14165 mergeUnknownFields(C9249 c9249) {
        m31139mergeUnknownFields(c9249);
        return this;
    }

    @Override // l.AbstractC20704
    public final /* bridge */ /* synthetic */ AbstractC20704 mergeUnknownFields(C9249 c9249) {
        m31139mergeUnknownFields(c9249);
        return this;
    }

    public C12818(C17757 c17757) {
        this.f38462 = c17757;
        int i = C19210.f60476;
        this.f38463 = new C3687(0);
        this.f38461 = C9249.m23740();
        this.f38464 = new C0117[c17757.mo1132().m46756()];
    }

    @Override // l.AbstractC20704
    public final InterfaceC9228 clear() {
        int i = C19210.f60476;
        this.f38463 = new C3687(0);
        this.f38461 = C9249.m23740();
        return this;
    }

    @Override // l.AbstractC20704
    public final InterfaceC14165 clear() {
        int i = C19210.f60476;
        this.f38463 = new C3687(0);
        this.f38461 = C9249.m23740();
        return this;
    }

    @Override // l.AbstractC20704
    public final AbstractC20704 clear() {
        int i = C19210.f60476;
        this.f38463 = new C3687(0);
        this.f38461 = C9249.m23740();
        return this;
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final C12818 mergeFrom(InterfaceC23338 interfaceC23338) {
        if (interfaceC23338 instanceof C12113) {
            C12113 c12113 = (C12113) interfaceC23338;
            if (c12113.f36187 == this.f38462) {
                this.f38463.m11240(c12113.f36189);
                m31139mergeUnknownFields(c12113.f36186);
                int i = 0;
                while (true) {
                    C0117[] c0117Arr = this.f38464;
                    if (i >= c0117Arr.length) {
                        return this;
                    }
                    if (c0117Arr[i] == null) {
                        c0117Arr[i] = c12113.f36188[i];
                    } else if (c12113.f36188[i] != null && c0117Arr[i] != c12113.f36188[i]) {
                        this.f38463.m11237(c0117Arr[i]);
                        c0117Arr[i] = c12113.f36188[i];
                    }
                    i++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            return (C12818) super.mergeFrom(interfaceC23338);
        }
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C12113 build() {
        if (!isInitialized()) {
            C19210 c19210M11236 = this.f38463.m11236();
            C0117[] c0117Arr = this.f38464;
            throw AbstractC20704.m47318((InterfaceC23338) new C12113(this.f38462, c19210M11236, (C0117[]) Arrays.copyOf(c0117Arr, c0117Arr.length), this.f38461));
        }
        return buildPartial();
    }

    @Override // l.AbstractC20704, l.InterfaceC9228, l.InterfaceC14165
    public final C12113 buildPartial() {
        C17757 c17757 = this.f38462;
        if (c17757.m41593().m39374()) {
            for (C0117 c0117 : c17757.getFields()) {
                if (c0117.m1136() && !this.f38463.m11245(c0117)) {
                    if (c0117.m1138() == EnumC18463.MESSAGE) {
                        this.f38463.m11243(c0117, C12113.m29517(c0117.m1147()));
                    } else {
                        this.f38463.m11243(c0117, c0117.m1122());
                    }
                }
            }
        }
        C19210 c19210M11242 = this.f38463.m11242();
        C0117[] c0117Arr = this.f38464;
        return new C12113(c17757, c19210M11242, (C0117[]) Arrays.copyOf(c0117Arr, c0117Arr.length), this.f38461);
    }

    @Override // l.AbstractC20704, l.AbstractC2359
    /* JADX INFO: renamed from: clone */
    public final C12818 mo7670clone() {
        C12818 c12818 = new C12818(this.f38462);
        c12818.f38463.m11240(this.f38463.m11236());
        c12818.m31139mergeUnknownFields(this.f38461);
        C0117[] c0117Arr = c12818.f38464;
        C0117[] c0117Arr2 = this.f38464;
        System.arraycopy(c0117Arr2, 0, c0117Arr, 0, c0117Arr2.length);
        return c12818;
    }

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        for (C0117 c0117 : this.f38462.getFields()) {
            if (c0117.m1128() && !this.f38463.m11245(c0117)) {
                return false;
            }
        }
        return this.f38463.m11246();
    }

    @Override // l.InterfaceC14165, l.InterfaceC3583, l.InterfaceC8060
    public final C17757 getDescriptorForType() {
        return this.f38462;
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return C12113.m29517(this.f38462);
    }

    @Override // l.AbstractC20704, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return C12113.m29517(this.f38462);
    }

    @Override // l.InterfaceC3583
    public final Map getAllFields() {
        return this.f38463.m11244();
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 newBuilderForField(C0117 c0117) {
        m31135(c0117);
        if (c0117.m1138() != EnumC18463.MESSAGE) {
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }
        return new C12818(c0117.m1147());
    }

    @Override // l.InterfaceC3583
    public final boolean hasField(C0117 c0117) {
        m31135(c0117);
        return this.f38463.m11245(c0117);
    }

    @Override // l.InterfaceC3583
    public final Object getField(C0117 c0117) {
        m31135(c0117);
        Object objM11241 = this.f38463.m11241(c0117);
        if (objM11241 != null) {
            return objM11241;
        }
        if (c0117.mo1129()) {
            return Collections.EMPTY_LIST;
        }
        if (c0117.m1138() == EnumC18463.MESSAGE) {
            return C12113.m29517(c0117.m1147());
        }
        return c0117.m1122();
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 setField(C0117 c0117, Object obj) {
        m31135(c0117);
        if (c0117.mo1129()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m31136(c0117, it.next());
            }
        } else {
            m31136(c0117, obj);
        }
        C14934 c14934M1139 = c0117.m1139();
        if (c14934M1139 != null) {
            int iM35387 = c14934M1139.m35387();
            C0117[] c0117Arr = this.f38464;
            C0117 c0118 = c0117Arr[iM35387];
            if (c0118 != null && c0118 != c0117) {
                this.f38463.m11237(c0118);
            }
            c0117Arr[iM35387] = c0117;
        } else if (!c0117.m1145() && !c0117.mo1129() && obj.equals(c0117.m1122())) {
            this.f38463.m11237(c0117);
            return this;
        }
        this.f38463.m11243(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 clearField(C0117 c0117) {
        m31135(c0117);
        C14934 c14934M1139 = c0117.m1139();
        if (c14934M1139 != null) {
            int iM35387 = c14934M1139.m35387();
            C0117[] c0117Arr = this.f38464;
            if (c0117Arr[iM35387] == c0117) {
                c0117Arr[iM35387] = null;
            }
        }
        this.f38463.m11237(c0117);
        return this;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 addRepeatedField(C0117 c0117, Object obj) {
        m31135(c0117);
        m31136(c0117, obj);
        this.f38463.m11239(c0117, obj);
        return this;
    }

    @Override // l.InterfaceC3583
    public final C9249 getUnknownFields() {
        return this.f38461;
    }

    @Override // l.InterfaceC14165
    public final InterfaceC14165 setUnknownFields(C9249 c9249) {
        this.f38461 = c9249;
        return this;
    }

    /* JADX INFO: renamed from: mergeUnknownFields, reason: collision with other method in class */
    public final void m31139mergeUnknownFields(C9249 c9249) {
        C9249 c92410 = this.f38461;
        int i = C9249.f28024;
        C14186 c14186M33836 = C14186.m33836();
        c14186M33836.m33842(c92410);
        c14186M33836.m33842(c9249);
        this.f38461 = c14186M33836.build();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31135(C0117 c0117) {
        if (c0117.m1144() != this.f38462) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // l.AbstractC20704
    public final InterfaceC14165 clearOneof(C14934 c14934) {
        if (c14934.m35389() == this.f38462) {
            int iM35387 = c14934.m35387();
            C0117[] c0117Arr = this.f38464;
            C0117 c0117 = c0117Arr[iM35387];
            if (c0117 != null) {
                m31135(c0117);
                C14934 c14934M1139 = c0117.m1139();
                if (c14934M1139 != null) {
                    int iM35388 = c14934M1139.m35387();
                    if (c0117Arr[iM35388] == c0117) {
                        c0117Arr[iM35388] = null;
                    }
                }
                this.f38463.m11237(c0117);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC20704
    public final AbstractC20704 clearOneof(C14934 c14934) {
        if (c14934.m35389() == this.f38462) {
            int iM35387 = c14934.m35387();
            C0117[] c0117Arr = this.f38464;
            C0117 c0117 = c0117Arr[iM35387];
            if (c0117 != null) {
                m31135(c0117);
                C14934 c14934M1139 = c0117.m1139();
                if (c14934M1139 != null) {
                    int iM35388 = c14934M1139.m35387();
                    if (c0117Arr[iM35388] == c0117) {
                        c0117Arr[iM35388] = null;
                    }
                }
                this.f38463.m11237(c0117);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC20704
    public final C0117 getOneofFieldDescriptor(C14934 c14934) {
        if (c14934.m35389() == this.f38462) {
            return this.f38464[c14934.m35387()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // l.AbstractC20704
    public final boolean hasOneof(C14934 c14934) {
        if (c14934.m35389() == this.f38462) {
            return this.f38464[c14934.m35387()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31136(C0117 c0117, Object obj) {
        int i = C2941.f9343[c0117.getType().ordinal()];
        if (i == 1) {
            obj.getClass();
            if (!(obj instanceof C2235)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        } else if (i == 2 && (obj instanceof InterfaceC14165)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c0117.getNumber()), c0117.mo1142().m19146(), obj.getClass().getName()));
        }
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public final InterfaceC14165 getFieldBuilder(C0117 c0117) {
        InterfaceC14165 interfaceC14165M31134;
        m31135(c0117);
        if (c0117.m1137()) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
        }
        if (c0117.m1138() != EnumC18463.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        Object objM11234 = this.f38463.m11234((InterfaceC18504) c0117);
        if (objM11234 == null) {
            interfaceC14165M31134 = new C12818(c0117.m1147());
        } else {
            interfaceC14165M31134 = m31134(objM11234);
        }
        this.f38463.m11243(c0117, interfaceC14165M31134);
        return interfaceC14165M31134;
    }

    @Override // l.AbstractC20704
    public final InterfaceC14165 getRepeatedFieldBuilder(C0117 c0117, int i) {
        m31135(c0117);
        if (c0117.m1137()) {
            throw new UnsupportedOperationException("Map fields cannot be repeated");
        }
        if (c0117.m1138() != EnumC18463.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        InterfaceC14165 interfaceC14165M31134 = m31134(this.f38463.m11235((InterfaceC18504) c0117, i));
        this.f38463.m11238(c0117, i, interfaceC14165M31134);
        return interfaceC14165M31134;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14165 m31134(Object obj) {
        if (obj instanceof InterfaceC14165) {
            return (InterfaceC14165) obj;
        }
        if (obj instanceof C9081) {
            obj = ((C9081) obj).m23442();
        }
        if (obj instanceof InterfaceC23338) {
            return ((InterfaceC23338) obj).toBuilder();
        }
        throw new IllegalArgumentException(C21639.m48905(obj.getClass(), "Cannot convert ", " to Message.Builder"));
    }
}
