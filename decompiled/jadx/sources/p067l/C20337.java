package p067l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ᩴܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4SS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20337 extends AbstractC22369 {

    /* JADX INFO: renamed from: ۛ */
    public static final Field f62810;

    /* JADX INFO: renamed from: ۨ */
    public static final Comparator f62811 = C10162.comparingInt(new C6255());

    /* JADX INFO: renamed from: ۗ */
    public boolean f62812;

    /* JADX INFO: renamed from: ۙ */
    public boolean f62813;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f62814;

    /* JADX INFO: renamed from: ۫ */
    public boolean f62815;

    /* JADX INFO: renamed from: ۬ */
    public boolean f62816;

    static {
        Field declaredField = null;
        try {
            declaredField = ArrayList.class.getDeclaredField("elementData");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        f62810 = declaredField;
    }

    public C20337(C4914 c4914, int i) {
        super(c4914, i);
        this.f62812 = false;
        this.f62816 = false;
        this.f62815 = false;
        this.f62813 = false;
        this.f62814 = new ArrayList();
    }

    @Override // p067l.InterfaceC22528
    public final C6925 getValue() {
        return (C6925) this.f62814.get(0);
    }

    @Override // p067l.InterfaceC22528
    public final C6925 getValue(int i) {
        return (C6925) this.f62814.get(i);
    }

    /* JADX INFO: renamed from: ۬ */
    public final void m45914() {
        C6925 c6925 = new C6925(this, 0, 0, -1);
        ArrayList arrayList = this.f62814;
        if (arrayList.isEmpty()) {
            arrayList.add(c6925);
        } else {
            arrayList.set(0, c6925);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45910(C6925 c6925) {
        if (c6925.getEntry() != this) {
            throw new IllegalArgumentException("value.getEntry() != this");
        }
        this.f62814.add(c6925);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6925 m45905(int i, int i2, int i3) {
        C6925 c6925 = new C6925(this, i, i2, i3);
        this.f62814.add(c6925);
        return c6925;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6925 m45906(String str, C23198[] c23198Arr, int i) {
        C6925 c6925 = new C6925(this, str, c23198Arr, i);
        this.f62814.add(c6925);
        return c6925;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m45917(int i) {
        this.f62814.remove(i);
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo31471() {
        return this.f62814.size();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo31474() {
        return this.f62812;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo31467() {
        return this.f62816;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo31473() {
        return this.f62815;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45909(InterfaceC6631 interfaceC6631, C14301 c14301) {
        if (this.f62813 && c14301.m32865(this) > 65535) {
            this.f62813 = false;
        }
        int i = this.f62816 ? 2 : 0;
        if (this.f62815) {
            i |= 4;
        }
        boolean z = this.f62813;
        if (z) {
            i |= 8;
        }
        if (z) {
            C6925 value = getValue(0);
            interfaceC6631.mo15113(c14301.m32865(this));
            interfaceC6631.mo15113(((value.mo7247() & 255) << 8) | i);
            interfaceC6631.writeInt(value.getValue());
            return;
        }
        if (this.f62812) {
            interfaceC6631.mo15113(16);
            interfaceC6631.mo15113(i | 1);
            interfaceC6631.writeInt(c14301.m32865(this));
            interfaceC6631.writeInt(getParent());
            interfaceC6631.writeInt(this.f62814.size());
            for (C6925 c6925 : m50215()) {
                interfaceC6631.writeInt(c6925.mo7249());
                interfaceC6631.mo15111((short) 8);
                interfaceC6631.writeByte(0);
                interfaceC6631.writeByte(c6925.mo7247());
                interfaceC6631.writeInt(c6925.getValue());
            }
            return;
        }
        interfaceC6631.mo15113(8);
        interfaceC6631.mo15113(i);
        interfaceC6631.writeInt(c14301.m32865(this));
        C6925 value2 = getValue(0);
        value2.getClass();
        interfaceC6631.mo15111((short) 8);
        interfaceC6631.writeByte(0);
        interfaceC6631.writeByte(value2.mo7247());
        interfaceC6631.writeInt(value2.getValue());
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo31470() {
        return this.f62813;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45913(boolean z) {
        if (this.f62812 != z) {
            this.f62812 = z;
            ArrayList arrayList = this.f62814;
            if (z) {
                this.f62813 = false;
                if (arrayList.isEmpty()) {
                    return;
                }
                getValue().m15877(33554432);
                return;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new C6925(this, 0, 16, -1));
                return;
            }
            while (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                getValue().m15877(-1);
            }
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m45904(int i) {
        this.f70587 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m45915(boolean z) {
        this.f62816 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m45916(boolean z) {
        this.f62815 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45912(boolean z) {
        this.f62813 = z && !this.f62812;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45908(Comparator comparator) {
        Collections.sort(this.f62814, comparator);
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo31466() {
        return (C10949) super.mo31466();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo31469() {
        return (C10278) super.mo31469();
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C10278 m45918() {
        return (C10278) super.mo31469();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    public final InterfaceC3080 getType() {
        return (C21678) super.getType();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    public final C21678 getType() {
        return (C21678) super.getType();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45907(String str) {
        ((C21678) super.getType()).m48933(mo50213(), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45911(InterfaceC22528 interfaceC22528) {
        C23198[] c23198ArrMo12358;
        C21678 c21678 = (C21678) super.getType();
        int iMo50213 = mo50213();
        InterfaceC3080 type = interfaceC22528.getType();
        int iMo50214 = interfaceC22528.mo50213();
        c21678.m48942(iMo50213, c21678.mo5204(iMo50213) || type.mo5204(iMo50214));
        c21678.m48941(iMo50213, type.mo5208(iMo50214) | c21678.mo5208(iMo50213));
        m45913(interfaceC22528.mo31474());
        this.f62816 = interfaceC22528.mo31467();
        this.f62815 = interfaceC22528.mo31473();
        m45912(interfaceC22528.mo31470());
        this.f70587 = interfaceC22528.getParent();
        ArrayList arrayList = this.f62814;
        if (arrayList.isEmpty()) {
            try {
                f62810.set(arrayList, new Object[interfaceC22528.mo31471()]);
            } catch (Exception unused) {
                arrayList.ensureCapacity(interfaceC22528.mo31471());
            }
        } else {
            arrayList.ensureCapacity(interfaceC22528.mo31471());
        }
        for (InterfaceC3751 interfaceC3751 : interfaceC22528.values()) {
            if (interfaceC3751.mo7252()) {
                InterfaceC5763 interfaceC5763Mo7251 = interfaceC3751.mo7251();
                if (!interfaceC5763Mo7251.mo12361()) {
                    m45906(interfaceC5763Mo7251.getValue(), (C23198[]) null, interfaceC3751.mo7249());
                } else {
                    if (interfaceC5763Mo7251 instanceof C5584) {
                        c23198ArrMo12358 = interfaceC5763Mo7251.mo12360();
                    } else {
                        c23198ArrMo12358 = interfaceC5763Mo7251.mo12358();
                    }
                    m45906(interfaceC5763Mo7251.getValue(), c23198ArrMo12358, interfaceC3751.mo7249());
                }
            } else {
                m45905(interfaceC3751.getValue(), interfaceC3751.mo7247(), interfaceC3751.mo7249());
            }
        }
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo31468() {
        String strM48945 = ((C21678) super.getType()).m48945(mo50213());
        return strM48945 == null ? "" : strM48945;
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܿ */
    public final C4914 mo31472() {
        return (C4914) super.mo31472();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo31472() {
        return (C4914) super.mo31472();
    }
}
