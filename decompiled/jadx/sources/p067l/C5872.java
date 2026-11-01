package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۘۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29QV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5872 {

    /* JADX INFO: renamed from: ֫ */
    public C4571 f14438;

    /* JADX INFO: renamed from: ۧ */
    public boolean f14439;

    /* JADX INFO: renamed from: ܽ */
    public boolean f14440;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f14441;

    public C5872(int i) {
        int i2 = C22676.f71529;
        this.f14438 = new C4571(16);
        this.f14441 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20625 m13182() {
        return m13174(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20625 m13188() {
        return m13174(true);
    }

    /* JADX INFO: renamed from: ֫ */
    private C20625 m13174(boolean z) {
        if (this.f14438.isEmpty()) {
            return C20625.m46597();
        }
        this.f14441 = false;
        C4571 c4571M46587 = this.f14438;
        if (this.f14440) {
            c4571M46587 = C20625.m46587((C22676) c4571M46587, false, false);
            m13176(c4571M46587, z);
        }
        C20625 c20625 = new C20625(c4571M46587, 0);
        c20625.f63709 = this.f14439;
        return c20625;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13176(C4571 c4571, boolean z) {
        for (int i = 0; i < c4571.m50763(); i++) {
            Map.Entry entryM50764 = c4571.m50764(i);
            entryM50764.setValue(m13173((InterfaceC19954) entryM50764.getKey(), entryM50764.getValue(), z));
        }
        for (Map.Entry entry : c4571.m50765()) {
            entry.setValue(m13173((InterfaceC19954) entry.getKey(), entry.getValue(), z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m13173(InterfaceC19954 interfaceC19954, Object obj, boolean z) {
        if (obj == null || interfaceC19954.mo3541() != EnumC3978.MESSAGE) {
            return obj;
        }
        if (interfaceC19954.mo3530()) {
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List arrayList = (List) obj;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj2 = arrayList.get(i);
                Object objM13172 = m13172(obj2, z);
                if (objM13172 != obj2) {
                    if (arrayList == obj) {
                        arrayList = new ArrayList(arrayList);
                    }
                    arrayList.set(i, objM13172);
                }
            }
            return arrayList;
        }
        return m13172(obj, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m13172(Object obj, boolean z) {
        if (!(obj instanceof InterfaceC11138)) {
            return obj;
        }
        InterfaceC11138 interfaceC11138 = (InterfaceC11138) obj;
        if (z) {
            return interfaceC11138.buildPartial();
        }
        return interfaceC11138.build();
    }

    /* JADX INFO: renamed from: ܽ */
    public final Map m13190() {
        if (!this.f14439) {
            return this.f14438.m50766() ? this.f14438 : C21562.unmodifiableMap(this.f14438);
        }
        C4571 c4571M46587 = C20625.m46587((C22676) this.f14438, false, true);
        if (this.f14438.m50766()) {
            c4571M46587.mo9645();
            return c4571M46587;
        }
        m13176(c4571M46587, true);
        return c4571M46587;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13191(C2479 c2479) {
        if (c2479.mo3530()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f14438.get(c2479) != null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m13187(C2479 c2479) {
        return m13173((InterfaceC19954) c2479, m13180((InterfaceC19954) c2479), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m13180(InterfaceC19954 interfaceC19954) {
        Object obj = this.f14438.get(interfaceC19954);
        return obj instanceof C10999 ? ((C10999) obj).m25389() : obj;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m13178() {
        if (this.f14441) {
            return;
        }
        this.f14438 = C20625.m46587((C22676) this.f14438, true, false);
        this.f14441 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13189(C2479 c2479, Object obj) {
        m13178();
        if (c2479.mo3530()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            for (Object obj2 : arrayList) {
                m13177((InterfaceC19954) c2479, obj2);
                this.f14440 = this.f14440 || (obj2 instanceof InterfaceC11138);
            }
            obj = arrayList;
        } else {
            m13177((InterfaceC19954) c2479, obj);
        }
        if (obj instanceof C10999) {
            this.f14439 = true;
        }
        this.f14440 = this.f14440 || (obj instanceof InterfaceC11138);
        this.f14438.m50761(c2479, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13183(C2479 c2479) {
        m13178();
        this.f14438.remove(c2479);
        if (this.f14438.isEmpty()) {
            this.f14439 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m13179(C2479 c2479, int i) {
        if (this.f14440) {
            m13178();
        }
        return m13172(m13181((InterfaceC19954) c2479, i), true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m13181(InterfaceC19954 interfaceC19954, int i) {
        if (!interfaceC19954.mo3530()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objM13180 = m13180(interfaceC19954);
        if (objM13180 == null) {
            throw new IndexOutOfBoundsException();
        }
        return ((List) objM13180).get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13184(C2479 c2479, int i, Object obj) {
        m13178();
        if (!c2479.mo3530()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f14440 = this.f14440 || (obj instanceof InterfaceC11138);
        Object objM13180 = m13180((InterfaceC19954) c2479);
        if (objM13180 == null) {
            throw new IndexOutOfBoundsException();
        }
        m13177((InterfaceC19954) c2479, obj);
        ((List) objM13180).set(i, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13185(C2479 c2479, Object obj) {
        List arrayList;
        m13178();
        if (!c2479.mo3530()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f14440 = this.f14440 || (obj instanceof InterfaceC11138);
        m13177((InterfaceC19954) c2479, obj);
        Object objM13180 = m13180((InterfaceC19954) c2479);
        if (objM13180 == null) {
            arrayList = new ArrayList();
            this.f14438.m50761(c2479, arrayList);
        } else {
            arrayList = (List) objM13180;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13177(InterfaceC19954 interfaceC19954, Object obj) {
        if (C20625.m46605(interfaceC19954.mo3543(), obj)) {
            return;
        }
        if (interfaceC19954.mo3543().m21089() != EnumC3978.MESSAGE || !(obj instanceof InterfaceC11138)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(interfaceC19954.getNumber()), interfaceC19954.mo3543().m21089(), obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m13192() {
        for (int i = 0; i < this.f14438.m50763(); i++) {
            if (!C20625.m46604(this.f14438.m50764(i))) {
                return false;
            }
        }
        Iterator it = this.f14438.m50765().iterator();
        while (it.hasNext()) {
            if (!C20625.m46604((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13186(C20625 c20625) {
        m13178();
        for (int i = 0; i < c20625.f63708.m50763(); i++) {
            m13175(c20625.f63708.m50764(i));
        }
        Iterator it = c20625.f63708.m50765().iterator();
        while (it.hasNext()) {
            m13175((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m13175(Map.Entry entry) {
        InterfaceC19954 interfaceC19954 = (InterfaceC19954) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof C10999;
        if (interfaceC19954.mo3530()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List arrayList = (List) m13180(interfaceC19954);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f14438.m50761(interfaceC19954, arrayList);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                arrayList.add(C20625.m46601(it.next()));
            }
            return;
        }
        if (interfaceC19954.mo3541() != EnumC3978.MESSAGE) {
            if (!z) {
                this.f14438.m50761(interfaceC19954, C20625.m46601(value));
                return;
            }
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
        Object objM13180 = m13180(interfaceC19954);
        if (objM13180 == null) {
            this.f14438.m50761(interfaceC19954, C20625.m46601(value));
            if (z) {
                this.f14439 = true;
                return;
            }
            return;
        }
        if (z) {
            value = ((C10999) value).m25389();
        }
        if (objM13180 instanceof InterfaceC11138) {
            interfaceC19954.mo3525((InterfaceC11138) objM13180, (InterfaceC10467) value);
        } else {
            this.f14438.m50761(interfaceC19954, interfaceC19954.mo3525(((InterfaceC10467) objM13180).toBuilder(), (InterfaceC10467) value).build());
        }
    }
}
