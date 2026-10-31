package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3687 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2318 f11635;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f11636;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f11637;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f11638;

    public C3687(int i) {
        int i2 = C21368.f68833;
        this.f11635 = new C2318(16);
        this.f11638 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19210 m11236() {
        return m11228(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19210 m11242() {
        return m11228(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19210 m11228(boolean z) {
        if (this.f11635.isEmpty()) {
            return C19210.m44302();
        }
        this.f11638 = false;
        C2318 c2318M44292 = this.f11635;
        if (this.f11637) {
            c2318M44292 = C19210.m44292((C21368) c2318M44292, false, false);
            m11230(c2318M44292, z);
        }
        C19210 c19210 = new C19210(c2318M44292, 0);
        c19210.f60478 = this.f11636;
        return c19210;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11230(C2318 c2318, boolean z) {
        for (int i = 0; i < c2318.m48427(); i++) {
            Map.Entry entryM48428 = c2318.m48428(i);
            entryM48428.setValue(m11227((InterfaceC18504) entryM48428.getKey(), entryM48428.getValue(), z));
        }
        for (Map.Entry entry : c2318.m48429()) {
            entry.setValue(m11227((InterfaceC18504) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m11227(InterfaceC18504 interfaceC18504, Object obj, boolean z) {
        if (obj == null || interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            return obj;
        }
        if (interfaceC18504.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objM11226 = m11226(obj2, z);
                if (objM11226 != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objM11226);
                }
            }
            return arrayList;
        }
        return m11226(obj, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m11226(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC9228)) {
            return obj;
        }
        InterfaceC9228 interfaceC9228 = (InterfaceC9228) obj;
        if (z) {
            return interfaceC9228.buildPartial();
        }
        return interfaceC9228.build();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map m11244() {
        if (!this.f11636) {
            return this.f11635.m48430() ? this.f11635 : C20195.unmodifiableMap(this.f11635);
        }
        C2318 c2318M44292 = C19210.m44292((C21368) this.f11635, false, true);
        if (this.f11635.m48430()) {
            c2318M44292.mo7575();
            return c2318M44292;
        }
        m11230(c2318M44292, true);
        return c2318M44292;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11245(C0117 c0117) {
        if (c0117.mo1129()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f11635.get(c0117) != null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m11241(C0117 c0117) {
        return m11227((InterfaceC18504) c0117, m11234((InterfaceC18504) c0117), true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11234(InterfaceC18504 interfaceC18504) {
        Object obj = this.f11635.get(interfaceC18504);
        return obj instanceof C9081 ? ((C9081) obj).m23442() : obj;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m11232() {
        if (this.f11638) {
            return;
        }
        this.f11635 = C19210.m44292((C21368) this.f11635, true, false);
        this.f11638 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11243(C0117 c0117, Object obj) {
        m11232();
        if (c0117.mo1129()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            for (Object obj2 : arrayList) {
                m11231((InterfaceC18504) c0117, obj2);
                this.f11637 = this.f11637 || (obj2 instanceof InterfaceC9228);
            }
            obj = arrayList;
        } else {
            m11231((InterfaceC18504) c0117, obj);
        }
        if (obj instanceof C9081) {
            this.f11636 = true;
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        this.f11635.m48425(c0117, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11237(C0117 c0117) {
        m11232();
        this.f11635.remove(c0117);
        if (this.f11635.isEmpty()) {
            this.f11636 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11233(C0117 c0117, int i) {
        if (this.f11637) {
            m11232();
        }
        return m11226(m11235((InterfaceC18504) c0117, i), true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m11235(InterfaceC18504 interfaceC18504, int i) {
        if (!interfaceC18504.mo1129()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM11234 = m11234(interfaceC18504);
        if (objM11234 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) objM11234).get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11238(C0117 c0117, int i, Object obj) {
        m11232();
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        Object objM11234 = m11234((InterfaceC18504) c0117);
        if (objM11234 == null) {
            throw new IndexOutOfBoundsException();
        }
        m11231((InterfaceC18504) c0117, obj);
        ((List) objM11234).set(i, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11239(C0117 c0117, Object obj) {
        List arrayList;
        m11232();
        if (!c0117.mo1129()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f11637 = this.f11637 || (obj instanceof InterfaceC9228);
        m11231((InterfaceC18504) c0117, obj);
        Object objM11234 = m11234((InterfaceC18504) c0117);
        if (objM11234 == null) {
            arrayList = new ArrayList();
            this.f11635.m48425(c0117, arrayList);
        } else {
            arrayList = (List) objM11234;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11231(InterfaceC18504 interfaceC18504, Object obj) {
        if (C19210.m44310(interfaceC18504.mo1142(), obj)) {
            return;
        }
        if (interfaceC18504.mo1142().m19146() != EnumC1694.MESSAGE || !(obj instanceof InterfaceC9228)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC18504.getNumber()), interfaceC18504.mo1142().m19146(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m11246() {
        for (int i = 0; i < this.f11635.m48427(); i++) {
            if (!C19210.m44309(this.f11635.m48428(i))) {
                return false;
            }
        }
        Iterator it = this.f11635.m48429().iterator();
        while (it.hasNext()) {
            if (!C19210.m44309((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11240(C19210 c19210) {
        m11232();
        for (int i = 0; i < c19210.f60477.m48427(); i++) {
            m11229(c19210.f60477.m48428(i));
        }
        Iterator it = c19210.f60477.m48429().iterator();
        while (it.hasNext()) {
            m11229((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11229(Map.Entry entry) {
        InterfaceC18504 interfaceC18504 = (InterfaceC18504) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C9081;
        if (interfaceC18504.mo1129()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List arrayList = (List) m11234(interfaceC18504);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f11635.m48425(interfaceC18504, arrayList);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(C19210.m44306(it.next()));
            }
            return;
        }
        if (interfaceC18504.mo1140() != EnumC1694.MESSAGE) {
            if (!z) {
                this.f11635.m48425(interfaceC18504, C19210.m44306(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object objM11234 = m11234(interfaceC18504);
        if (objM11234 == null) {
            this.f11635.m48425(interfaceC18504, C19210.m44306(value));
            if (z) {
                this.f11636 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C9081) value).m23442();
        }
        if (objM11234 instanceof InterfaceC9228) {
            interfaceC18504.mo1124((InterfaceC9228) objM11234, (InterfaceC8522) value);
        } else {
            this.f11635.m48425(interfaceC18504, interfaceC18504.mo1124(((InterfaceC8522) objM11234).toBuilder(), (InterfaceC8522) value).build());
        }
    }
}
