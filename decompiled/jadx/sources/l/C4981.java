package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C4981 extends AbstractC3073 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15691;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashMap f15692;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15693;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11102 f15694;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f15695;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f15696;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15697;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C12512 f15698;

    public C4981(C12512 c12512) {
        super(1, -1);
        if (c12512 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f15698 = c12512;
        this.f15693 = new ArrayList(20);
        this.f15692 = new HashMap(40);
        this.f15695 = new ArrayList(20);
        this.f15691 = new ArrayList(20);
        this.f15697 = new ArrayList(20);
        this.f15694 = null;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CLASS_DATA_ITEM;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۢ */
    public final String mo2864() {
        return toString();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m14466() {
        return this.f15693.isEmpty() && this.f15695.isEmpty() && this.f15691.isEmpty() && this.f15697.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14462(C16478 c16478, AbstractC13717 abstractC13717) {
        if (this.f15694 != null) {
            throw new UnsupportedOperationException("static fields already sorted");
        }
        this.f15693.add(c16478);
        this.f15692.put(c16478, abstractC13717);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14461(C16478 c16478) {
        this.f15695.add(c16478);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14463(C17184 c17184) {
        this.f15691.add(c17184);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14465(C17184 c17184) {
        this.f15697.add(c17184);
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        ArrayList arrayList = this.f15693;
        if (!arrayList.isEmpty()) {
            m14464();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C16478) it.next()).m38845(c1662);
            }
        }
        ArrayList arrayList2 = this.f15695;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C16478) it2.next()).m38845(c1662);
            }
        }
        ArrayList arrayList3 = this.f15691;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C17184) it3.next()).m40424(c1662);
            }
        }
        ArrayList arrayList4 = this.f15697;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C17184) it4.next()).m40424(c1662);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11102 m14464() {
        HashMap map;
        C11102 c11102;
        if (this.f15694 == null) {
            ArrayList arrayList = this.f15693;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f15692;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC13717 abstractC13717 = (AbstractC13717) map.get((C16478) arrayList.get(size - 1));
                    if (abstractC13717 instanceof AbstractC1223) {
                        if (((AbstractC1223) abstractC13717).mo2227() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC13717 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c11102 = null;
                } else {
                    C1929 c1929 = new C1929(size);
                    for (int i = 0; i < size; i++) {
                        C16478 c16478 = (C16478) arrayList.get(i);
                        AbstractC13717 abstractC13717M28867 = (AbstractC13717) map.get(c16478);
                        if (abstractC13717M28867 == null) {
                            abstractC13717M28867 = C11807.m28867(c16478.m38846().getType());
                        }
                        c1929.mo12223(i, abstractC13717M28867);
                    }
                    c1929.mo20349();
                    c11102 = new C11102(c1929);
                }
                this.f15694 = c11102;
            }
        }
        return this.f15694;
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        C18241 c18241 = new C18241();
        m14460(c4484.m16521(), c18241);
        byte[] bArrM42520 = c18241.m42520();
        this.f15696 = bArrM42520;
        m9389(bArrM42520.length);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m14460(C1662 c1662, C18241 c18241) {
        boolean zM42506 = c18241.m42506();
        if (zM42506) {
            c18241.m42501(0, m9391() + " class data for " + this.f15698.mo2463());
        }
        ArrayList arrayList = this.f15693;
        m14459(c18241, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f15695;
        m14459(c18241, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f15691;
        m14459(c18241, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f15697;
        m14459(c18241, "virtual_methods", arrayList4.size());
        m14458(c1662, c18241, "static_fields", arrayList);
        m14458(c1662, c18241, "instance_fields", arrayList2);
        m14458(c1662, c18241, "direct_methods", arrayList3);
        m14458(c1662, c18241, "virtual_methods", arrayList4);
        if (zM42506) {
            c18241.m42508();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14459(C18241 c18241, String str, int i) {
        if (c18241.m42506()) {
            c18241.m42503(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c18241.m42507(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14458(C1662 c1662, C18241 c18241, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c18241.m42506()) {
            c18241.m42501(0, EnumC0121.f1143 + str + ":");
        }
        int iMo38844 = 0;
        for (int i = 0; i < size; i++) {
            iMo38844 = ((AbstractC17890) arrayList.get(i)).mo38844(c1662, c18241, iMo38844, i);
        }
    }

    @Override // l.AbstractC3073
    /* JADX INFO: renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        if (c18241.m42506()) {
            m14460(c1662, c18241);
        } else {
            c18241.m42505(this.f15696);
        }
    }
}
