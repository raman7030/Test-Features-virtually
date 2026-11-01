package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7103 extends AbstractC5289 {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f18525;

    /* JADX INFO: renamed from: ۛ */
    public final HashMap f18526;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayList f18527;

    /* JADX INFO: renamed from: ۨ */
    public C12920 f18528;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f18529;

    /* JADX INFO: renamed from: ۬ */
    public byte[] f18530;

    /* JADX INFO: renamed from: ܰ */
    public final ArrayList f18531;

    /* JADX INFO: renamed from: ᩺ */
    public final C14260 f18532;

    public C7103(C14260 c14260) {
        super(1, -1);
        if (c14260 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f18532 = c14260;
        this.f18527 = new ArrayList(20);
        this.f18526 = new HashMap(40);
        this.f18529 = new ArrayList(20);
        this.f18525 = new ArrayList(20);
        this.f18531 = new ArrayList(20);
        this.f18528 = null;
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final EnumC5960 mo5191() {
        return EnumC5960.TYPE_CLASS_DATA_ITEM;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۢ */
    public final String mo5193() {
        return toString();
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m16370() {
        return this.f18527.isEmpty() && this.f18529.isEmpty() && this.f18525.isEmpty() && this.f18531.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16366(C18029 c18029, AbstractC15405 abstractC15405) {
        if (this.f18528 != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f18527.add(c18029);
        this.f18526.put(c18029, abstractC15405);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16365(C18029 c18029) {
        this.f18529.add(c18029);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16367(C18700 c18700) {
        this.f18525.add(c18700);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m16369(C18700 c18700) {
        this.f18531.add(c18700);
    }

    @Override // p067l.AbstractC4619
    /* JADX INFO: renamed from: ֫ */
    public final void mo5192(C3948 c3948) {
        ArrayList arrayList = this.f18527;
        if (!arrayList.isEmpty()) {
            m16368();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C18029) it.next()).m41071(c3948);
            }
        }
        ArrayList arrayList2 = this.f18529;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C18029) it2.next()).m41071(c3948);
            }
        }
        ArrayList arrayList3 = this.f18525;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C18700) it3.next()).m42669(c3948);
            }
        }
        ArrayList arrayList4 = this.f18531;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C18700) it4.next()).m42669(c3948);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final C12920 m16368() {
        HashMap map;
        C12920 c12920;
        if (this.f18528 == null) {
            ArrayList arrayList = this.f18527;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f18526;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC15405 abstractC15405 = (AbstractC15405) map.get((C18029) arrayList.get(size - 1));
                    if (abstractC15405 instanceof AbstractC3531) {
                        if (((AbstractC3531) abstractC15405).mo4594() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC15405 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c12920 = null;
                } else {
                    C4202 c4202 = new C4202(size);
                    for (int i = 0; i < size; i++) {
                        C18029 c18029 = (C18029) arrayList.get(i);
                        AbstractC15405 abstractC15405M30916 = (AbstractC15405) map.get(c18029);
                        if (abstractC15405M30916 == null) {
                            abstractC15405M30916 = C13590.m30916(c18029.m41072().getType());
                        }
                        c4202.mo14144(i, abstractC15405M30916);
                    }
                    c4202.mo22326();
                    c12920 = new C12920(c4202);
                }
                this.f18528 = c12920;
            }
        }
        return this.f18528;
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5195(C6630 c6630, int i) {
        C19705 c19705 = new C19705();
        m16364(c6630.m18447(), c19705);
        byte[] bArrM44779 = c19705.m44779();
        this.f18530 = bArrM44779;
        m11431(bArrM44779.length);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m16364(C3948 c3948, C19705 c19705) {
        boolean zM44765 = c19705.m44765();
        if (zM44765) {
            c19705.m44760(0, m11433() + " class data for " + this.f18532.mo4819());
        }
        ArrayList arrayList = this.f18527;
        m16363(c19705, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f18529;
        m16363(c19705, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f18525;
        m16363(c19705, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f18531;
        m16363(c19705, "virtual_methods", arrayList4.size());
        m16362(c3948, c19705, "static_fields", arrayList);
        m16362(c3948, c19705, "instance_fields", arrayList2);
        m16362(c3948, c19705, "direct_methods", arrayList3);
        m16362(c3948, c19705, "virtual_methods", arrayList4);
        if (zM44765) {
            c19705.m44767();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16363(C19705 c19705, String str, int i) {
        if (c19705.m44765()) {
            c19705.m44762(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c19705.m44766(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16362(C3948 c3948, C19705 c19705, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c19705.m44765()) {
            c19705.m44760(0, EnumC2483.f3919 + str + ":");
        }
        int iMo41070 = 0;
        for (int i = 0; i < size; i++) {
            iMo41070 = ((AbstractC19371) arrayList.get(i)).mo41070(c3948, c19705, iMo41070, i);
        }
    }

    @Override // p067l.AbstractC5289
    /* JADX INFO: renamed from: ۧ */
    public final void mo5194(C3948 c3948, C19705 c19705) {
        if (c19705.m44765()) {
            m16364(c3948, c19705);
        } else {
            c19705.m44764(this.f18530);
        }
    }
}
