package p067l;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۬ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14550 extends AbstractC22045 {

    /* JADX INFO: renamed from: ۙ */
    public C11158 f41504;

    /* JADX INFO: renamed from: ᩶ */
    public final C19244 f41505;

    /* JADX INFO: renamed from: ᩸ */
    public C5872 f41506;

    /* JADX INFO: renamed from: ᩹ */
    public final C2479[] f41507;

    public /* synthetic */ C14550(C19244 c19244, int i) {
        this(c19244);
    }

    @Override // p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ InterfaceC15830 mergeUnknownFields(C11158 c11158) {
        m56485mergeUnknownFields(c11158);
        return this;
    }

    @Override // p067l.AbstractC22045
    public final /* bridge */ /* synthetic */ AbstractC22045 mergeUnknownFields(C11158 c11158) {
        m56485mergeUnknownFields(c11158);
        return this;
    }

    public C14550(C19244 c19244) {
        this.f41505 = c19244;
        int i = C20625.f63707;
        this.f41506 = new C5872(0);
        this.f41504 = C11158.m25741();
        this.f41507 = new C2479[c19244.mo3533().m49079()];
    }

    @Override // p067l.AbstractC22045
    public final InterfaceC11138 clear() {
        int i = C20625.f63707;
        this.f41506 = new C5872(0);
        this.f41504 = C11158.m25741();
        return this;
    }

    @Override // p067l.AbstractC22045
    public final InterfaceC15830 clear() {
        int i = C20625.f63707;
        this.f41506 = new C5872(0);
        this.f41504 = C11158.m25741();
        return this;
    }

    @Override // p067l.AbstractC22045
    public final AbstractC22045 clear() {
        int i = C20625.f63707;
        this.f41506 = new C5872(0);
        this.f41504 = C11158.m25741();
        return this;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final C14550 mergeFrom(InterfaceC24548 interfaceC24548) {
        if (interfaceC24548 instanceof C13880) {
            C13880 c13880 = (C13880) interfaceC24548;
            if (c13880.f39199 == this.f41505) {
                this.f41506.m13186(c13880.f39201);
                m56485mergeUnknownFields(c13880.f39198);
                int i = 0;
                while (true) {
                    C2479[] c2479Arr = this.f41507;
                    if (i >= c2479Arr.length) {
                        return this;
                    }
                    if (c2479Arr[i] == null) {
                        c2479Arr[i] = c13880.f39200[i];
                    } else if (c13880.f39200[i] != null && c2479Arr[i] != c13880.f39200[i]) {
                        this.f41506.m13183(c2479Arr[i]);
                        c2479Arr[i] = c13880.f39200[i];
                    }
                    i++;
                }
            } else {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
        } else {
            return (C14550) super.mergeFrom(interfaceC24548);
        }
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C13880 build() {
        if (!isInitialized()) {
            C20625 c20625M13182 = this.f41506.m13182();
            C2479[] c2479Arr = this.f41507;
            throw AbstractC22045.m49645((InterfaceC24548) new C13880(this.f41505, c20625M13182, (C2479[]) Arrays.copyOf(c2479Arr, c2479Arr.length), this.f41504));
        }
        return buildPartial();
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC11138, p067l.InterfaceC15830
    public final C13880 buildPartial() {
        C19244 c19244 = this.f41505;
        if (c19244.m43838().m41610()) {
            for (C2479 c2479 : c19244.getFields()) {
                if (c2479.m3537() && !this.f41506.m13191(c2479)) {
                    if (c2479.m3539() == EnumC19915.MESSAGE) {
                        this.f41506.m13189(c2479, C13880.m31582(c2479.m3548()));
                    } else {
                        this.f41506.m13189(c2479, c2479.m3523());
                    }
                }
            }
        }
        C20625 c20625M13188 = this.f41506.m13188();
        C2479[] c2479Arr = this.f41507;
        return new C13880(c19244, c20625M13188, (C2479[]) Arrays.copyOf(c2479Arr, c2479Arr.length), this.f41504);
    }

    @Override // p067l.AbstractC22045, p067l.AbstractC4610
    /* JADX INFO: renamed from: clone */
    public final C14550 mo56039clone() {
        C14550 c14550 = new C14550(this.f41505);
        c14550.f41506.m13186(this.f41506.m13182());
        c14550.m56485mergeUnknownFields(this.f41504);
        C2479[] c2479Arr = c14550.f41507;
        C2479[] c2479Arr2 = this.f41507;
        System.arraycopy(c2479Arr2, 0, c2479Arr, 0, c2479Arr2.length);
        return c14550;
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        for (C2479 c2479 : this.f41505.getFields()) {
            if (c2479.m3529() && !this.f41506.m13191(c2479)) {
                return false;
            }
        }
        return this.f41506.m13192();
    }

    @Override // p067l.InterfaceC15830, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final C19244 getDescriptorForType() {
        return this.f41505;
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return C13880.m31582(this.f41505);
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC24548 getDefaultInstanceForType() {
        return C13880.m31582(this.f41505);
    }

    @Override // p067l.InterfaceC5773
    public final Map getAllFields() {
        return this.f41506.m13190();
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 newBuilderForField(C2479 c2479) {
        m33224(c2479);
        if (c2479.m3539() != EnumC19915.MESSAGE) {
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }
        return new C14550(c2479.m3548());
    }

    @Override // p067l.InterfaceC5773
    public final boolean hasField(C2479 c2479) {
        m33224(c2479);
        return this.f41506.m13191(c2479);
    }

    @Override // p067l.InterfaceC5773
    public final Object getField(C2479 c2479) {
        m33224(c2479);
        Object objM13187 = this.f41506.m13187(c2479);
        if (objM13187 != null) {
            return objM13187;
        }
        if (c2479.mo3530()) {
            return Collections.EMPTY_LIST;
        }
        if (c2479.m3539() == EnumC19915.MESSAGE) {
            return C13880.m31582(c2479.m3548());
        }
        return c2479.m3523();
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 setField(C2479 c2479, Object obj) {
        m33224(c2479);
        if (c2479.mo3530()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m33225(c2479, it.next());
            }
        } else {
            m33225(c2479, obj);
        }
        C16561 c16561M3540 = c2479.m3540();
        if (c16561M3540 != null) {
            int iM37539 = c16561M3540.m37539();
            C2479[] c2479Arr = this.f41507;
            C2479 c24710 = c2479Arr[iM37539];
            if (c24710 != null && c24710 != c2479) {
                this.f41506.m13183(c24710);
            }
            c2479Arr[iM37539] = c2479;
        } else if (!c2479.m3546() && !c2479.mo3530() && obj.equals(c2479.m3523())) {
            this.f41506.m13183(c2479);
            return this;
        }
        this.f41506.m13189(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 clearField(C2479 c2479) {
        m33224(c2479);
        C16561 c16561M3540 = c2479.m3540();
        if (c16561M3540 != null) {
            int iM37539 = c16561M3540.m37539();
            C2479[] c2479Arr = this.f41507;
            if (c2479Arr[iM37539] == c2479) {
                c2479Arr[iM37539] = null;
            }
        }
        this.f41506.m13183(c2479);
        return this;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 addRepeatedField(C2479 c2479, Object obj) {
        m33224(c2479);
        m33225(c2479, obj);
        this.f41506.m13185(c2479, obj);
        return this;
    }

    @Override // p067l.InterfaceC5773
    public final C11158 getUnknownFields() {
        return this.f41504;
    }

    @Override // p067l.InterfaceC15830
    public final InterfaceC15830 setUnknownFields(C11158 c11158) {
        this.f41504 = c11158;
        return this;
    }

    /* JADX INFO: renamed from: mergeUnknownFields, reason: collision with other method in class */
    public final void m56485mergeUnknownFields(C11158 c11158) {
        C11158 c11159 = this.f41504;
        int i = C11158.f30970;
        C15850 c15850M35968 = C15850.m35968();
        c15850M35968.m35974(c11159);
        c15850M35968.m35974(c11158);
        this.f41504 = c15850M35968.build();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33224(C2479 c2479) {
        if (c2479.m3545() != this.f41505) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
    }

    @Override // p067l.AbstractC22045
    public final InterfaceC15830 clearOneof(C16561 c16561) {
        if (c16561.m37541() == this.f41505) {
            int iM37539 = c16561.m37539();
            C2479[] c2479Arr = this.f41507;
            C2479 c2479 = c2479Arr[iM37539];
            if (c2479 != null) {
                m33224(c2479);
                C16561 c16561M3540 = c2479.m3540();
                if (c16561M3540 != null) {
                    int iM375310 = c16561M3540.m37539();
                    if (c2479Arr[iM375310] == c2479) {
                        c2479Arr[iM375310] = null;
                    }
                }
                this.f41506.m13183(c2479);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // p067l.AbstractC22045
    public final AbstractC22045 clearOneof(C16561 c16561) {
        if (c16561.m37541() == this.f41505) {
            int iM37539 = c16561.m37539();
            C2479[] c2479Arr = this.f41507;
            C2479 c2479 = c2479Arr[iM37539];
            if (c2479 != null) {
                m33224(c2479);
                C16561 c16561M3540 = c2479.m3540();
                if (c16561M3540 != null) {
                    int iM375310 = c16561M3540.m37539();
                    if (c2479Arr[iM375310] == c2479) {
                        c2479Arr[iM375310] = null;
                    }
                }
                this.f41506.m13183(c2479);
            }
            return this;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // p067l.AbstractC22045
    public final C2479 getOneofFieldDescriptor(C16561 c16561) {
        if (c16561.m37541() == this.f41505) {
            return this.f41507[c16561.m37539()];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // p067l.AbstractC22045
    public final boolean hasOneof(C16561 c16561) {
        if (c16561.m37541() == this.f41505) {
            return this.f41507[c16561.m37539()] != null;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33225(C2479 c2479, Object obj) {
        int i = C5163.f12143[c2479.getType().ordinal()];
        if (i == 1) {
            obj.getClass();
            if (!(obj instanceof C4492)) {
                throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
            }
        } else if (i == 2 && (obj instanceof InterfaceC15830)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(c2479.getNumber()), c2479.mo3543().m21089(), obj.getClass().getName()));
        }
    }

    @Override // p067l.AbstractC22045, p067l.InterfaceC15830
    public final InterfaceC15830 getFieldBuilder(C2479 c2479) {
        InterfaceC15830 interfaceC15830M33223;
        m33224(c2479);
        if (c2479.m3538()) {
            throw new UnsupportedOperationException("Nested builder not supported for map fields.");
        }
        if (c2479.m3539() != EnumC19915.MESSAGE) {
            throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
        }
        Object objM13180 = this.f41506.m13180((InterfaceC19954) c2479);
        if (objM13180 == null) {
            interfaceC15830M33223 = new C14550(c2479.m3548());
        } else {
            interfaceC15830M33223 = m33223(objM13180);
        }
        this.f41506.m13189(c2479, interfaceC15830M33223);
        return interfaceC15830M33223;
    }

    @Override // p067l.AbstractC22045
    public final InterfaceC15830 getRepeatedFieldBuilder(C2479 c2479, int i) {
        m33224(c2479);
        if (c2479.m3538()) {
            throw new UnsupportedOperationException("Map fields cannot be repeated");
        }
        if (c2479.m3539() != EnumC19915.MESSAGE) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
        }
        InterfaceC15830 interfaceC15830M33223 = m33223(this.f41506.m13181((InterfaceC19954) c2479, i));
        this.f41506.m13184(c2479, i, interfaceC15830M33223);
        return interfaceC15830M33223;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC15830 m33223(Object obj) {
        if (obj instanceof InterfaceC15830) {
            return (InterfaceC15830) obj;
        }
        if (obj instanceof C10999) {
            obj = ((C10999) obj).m25389();
        }
        if (obj instanceof InterfaceC24548) {
            return ((InterfaceC24548) obj).toBuilder();
        }
        throw new IllegalArgumentException(C22934.m51253(obj.getClass(), "Cannot convert ", " to Message.Builder"));
    }
}
