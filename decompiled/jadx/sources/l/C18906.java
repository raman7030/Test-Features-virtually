package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4SS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18906 extends AbstractC21044 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Field f59580;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Comparator f59581 = C8200.comparingInt(new C4089());

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f59582;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59583;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59584;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f59585;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f59586;

    static {
        Field declaredField = null;
        try {
            declaredField = ArrayList.class.getDeclaredField("elementData");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        f59580 = declaredField;
    }

    public C18906(C2678 c2678, int i) {
        super(c2678, i);
        this.f59582 = false;
        this.f59586 = false;
        this.f59585 = false;
        this.f59583 = false;
        this.f59584 = new ArrayList();
    }

    @Override // l.InterfaceC21211
    public final C4794 getValue() {
        return (C4794) this.f59584.get(0);
    }

    @Override // l.InterfaceC21211
    public final C4794 getValue(int i) {
        return (C4794) this.f59584.get(i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m43648() {
        C4794 c4794 = new C4794(this, 0, 0, -1);
        ArrayList arrayList = this.f59584;
        if (arrayList.isEmpty()) {
            arrayList.add(c4794);
        } else {
            arrayList.set(0, c4794);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43644(C4794 c4794) {
        if (c4794.getEntry() != this) {
            throw new IllegalArgumentException("value.getEntry() != this");
        }
        this.f59584.add(c4794);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4794 m43639(int i, int i2, int i3) {
        C4794 c4794 = new C4794(this, i, i2, i3);
        this.f59584.add(c4794);
        return c4794;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4794 m43640(String str, C21916[] c21916Arr, int i) {
        C4794 c4794 = new C4794(this, str, c21916Arr, i);
        this.f59584.add(c4794);
        return c4794;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m43651(int i) {
        this.f59584.remove(i);
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo29409() {
        return this.f59584.size();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo29412() {
        return this.f59582;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo29405() {
        return this.f59586;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo29411() {
        return this.f59585;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43643(InterfaceC4485 interfaceC4485, C12555 c12555) {
        if (this.f59583 && c12555.m30791(this) > 65535) {
            this.f59583 = false;
        }
        int i = this.f59586 ? 2 : 0;
        if (this.f59585) {
            i |= 4;
        }
        boolean z = this.f59583;
        if (z) {
            i |= 8;
        }
        if (z) {
            C4794 value = getValue(0);
            interfaceC4485.mo13231(c12555.m30791(this));
            interfaceC4485.mo13231(((value.mo5004() & 255) << 8) | i);
            interfaceC4485.writeInt(value.getValue());
            return;
        }
        if (this.f59582) {
            interfaceC4485.mo13231(16);
            interfaceC4485.mo13231(i | 1);
            interfaceC4485.writeInt(c12555.m30791(this));
            interfaceC4485.writeInt(getParent());
            interfaceC4485.writeInt(this.f59584.size());
            for (C4794 c4794 : m47885()) {
                interfaceC4485.writeInt(c4794.mo5006());
                interfaceC4485.mo13229((short) 8);
                interfaceC4485.writeByte(0);
                interfaceC4485.writeByte(c4794.mo5004());
                interfaceC4485.writeInt(c4794.getValue());
            }
            return;
        }
        interfaceC4485.mo13231(8);
        interfaceC4485.mo13231(i);
        interfaceC4485.writeInt(c12555.m30791(this));
        C4794 value2 = getValue(0);
        value2.getClass();
        interfaceC4485.mo13229((short) 8);
        interfaceC4485.writeByte(0);
        interfaceC4485.writeByte(value2.mo5004());
        interfaceC4485.writeInt(value2.getValue());
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo29408() {
        return this.f59583;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43647(boolean z) {
        if (this.f59582 != z) {
            this.f59582 = z;
            ArrayList arrayList = this.f59584;
            if (z) {
                this.f59583 = false;
                if (arrayList.isEmpty()) {
                    return;
                }
                getValue().m13997(33554432);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C4794(this, 0, 16, -1));
                return;
            }
            while (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                getValue().m13997(-1);
            }
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m43638(int i) {
        this.f67902 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43649(boolean z) {
        this.f59586 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43650(boolean z) {
        this.f59585 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43646(boolean z) {
        this.f59583 = z && !this.f59582;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43642(Comparator comparator) {
        Collections.sort(this.f59584, comparator);
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo29404() {
        return (C9028) super.mo29404();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo29407() {
        return (C8322) super.mo29407();
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8322 m43652() {
        return (C8322) super.mo29407();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final InterfaceC0748 getType() {
        return (C20317) super.getType();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final C20317 getType() {
        return (C20317) super.getType();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43641(String str) {
        ((C20317) super.getType()).m46610(mo47883(), str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43645(InterfaceC21211 interfaceC21211) {
        C21916[] c21916ArrMo10320;
        C20317 c20317 = (C20317) super.getType();
        int iMo47883 = mo47883();
        InterfaceC0748 type = interfaceC21211.getType();
        int iMo47884 = interfaceC21211.mo47883();
        c20317.m46619(iMo47883, c20317.mo2875(iMo47883) || type.mo2875(iMo47884));
        c20317.m46618(iMo47883, type.mo2879(iMo47884) | c20317.mo2879(iMo47883));
        m43647(interfaceC21211.mo29412());
        this.f59586 = interfaceC21211.mo29405();
        this.f59585 = interfaceC21211.mo29411();
        m43646(interfaceC21211.mo29408());
        this.f67902 = interfaceC21211.getParent();
        ArrayList arrayList = this.f59584;
        if (arrayList.isEmpty()) {
            try {
                f59580.set(arrayList, new Object[interfaceC21211.mo29409()]);
            } catch (Exception unused) {
                arrayList.ensureCapacity(interfaceC21211.mo29409());
            }
        } else {
            arrayList.ensureCapacity(interfaceC21211.mo29409());
        }
        for (InterfaceC1454 interfaceC1454 : interfaceC21211.values()) {
            if (interfaceC1454.mo5009()) {
                InterfaceC3571 interfaceC3571Mo5008 = interfaceC1454.mo5008();
                if (!interfaceC3571Mo5008.mo10323()) {
                    m43640(interfaceC3571Mo5008.getValue(), (C21916[]) null, interfaceC1454.mo5006());
                } else {
                    if (interfaceC3571Mo5008 instanceof C3383) {
                        c21916ArrMo10320 = interfaceC3571Mo5008.mo10322();
                    } else {
                        c21916ArrMo10320 = interfaceC3571Mo5008.mo10320();
                    }
                    m43640(interfaceC3571Mo5008.getValue(), c21916ArrMo10320, interfaceC1454.mo5006());
                }
            } else {
                m43639(interfaceC1454.getValue(), interfaceC1454.mo5004(), interfaceC1454.mo5006());
            }
        }
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo29406() {
        String strM46622 = ((C20317) super.getType()).m46622(mo47883());
        return strM46622 == null ? "" : strM46622;
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ܿ */
    public final C2678 mo29410() {
        return (C2678) super.mo29410();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7099 mo29410() {
        return (C2678) super.mo29410();
    }
}
