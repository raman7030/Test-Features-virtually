package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAYY */
/* JADX INFO: loaded from: classes2.dex */
public final class C8975 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f24308 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public String f24309;

    /* JADX INFO: renamed from: ֫ */
    public final int m20734(C18362 c18362) {
        C13045.m29867(c18362, "item");
        ArrayList arrayList = this.f24308;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == c18362) {
                return i;
            }
        }
        return -1;
    }

    public C8975(String str) {
        this.f24309 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList m20749() {
        return this.f24308;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m20746() {
        return this.f24309;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m20751() {
        return this.f24309 == null;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m20741() {
        return C13045.m29864((Object) this.f24309, (Object) "\rH\rI\rS\r");
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m20750() {
        Iterator it = this.f24308.iterator();
        while (it.hasNext()) {
            ((C18362) it.next()).m41822(false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18362 m20743(int i) {
        Object obj = this.f24308.get(i);
        C13045.m29865(obj, "get(...)");
        return (C18362) obj;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m20747() {
        return this.f24308.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20744(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f24308.addAll(0, list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20739(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f24308.addAll(list);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m20748() {
        String str = this.f24309;
        if (str == null) {
            return C7050.m16224(R.string.MT_Protector);
        }
        return str.equals("\rH\rI\rS\r") ? C7050.m16224(R.string.MT_Protector) : str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20738(String str) {
        if (!m20751()) {
            m20741();
        }
        this.f24309 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20737(int i, int i2) {
        m20741();
        C8123.m18819(i, i2, this.f24308);
        C10987.m25372();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20736(int i) {
        this.f24308.remove(i);
        C10987.m25372();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18362 m20742() {
        Object next;
        Iterator it = this.f24308.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((C18362) next).m41823()) {
                return (C18362) next;
            }
        }
        next = null;
        return (C18362) next;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20735() {
        C4187.m8478(this.f24308, new C16350());
        C10987.f30437.mo4062(C10027.f27775);
        C10987.f30433.m25340();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20740(C8975 c8975) {
        if (!m20741()) {
            c8975.m20741();
        }
        ArrayList<C18362> arrayList = this.f24308;
        for (C18362 c18362 : arrayList) {
            if (c18362.m41823()) {
                new C18362(c18362.m41828(), c18362.m41824()).m41818(c18362.m41826());
            }
        }
        ArrayList arrayList2 = c8975.f24308;
        ArrayList<C18362> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C18362) obj).m41823()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C4187.m8472((Iterable) arrayList3));
        for (C18362 c18363 : arrayList3) {
            C18362 c18364 = new C18362(c18363.m41828(), c18363.m41824());
            c18364.m41818(c18363.m41826());
            arrayList4.add(c18364);
        }
        arrayList2.addAll(arrayList4);
        C10987.f30437.mo4062(C10027.f27775);
        C10987.f30433.m25340();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m20745(C8975 c8975) {
        if (!m20741()) {
            c8975.m20741();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f24308;
        for (Object obj : arrayList2) {
            if (((C18362) obj).m41823()) {
                arrayList.add(obj);
            }
        }
        C4187.m8478(arrayList2, new C25068());
        c8975.f24308.addAll(arrayList);
        C10987.f30437.mo4062(C10027.f27775);
        C10987.f30433.m25340();
    }
}
