package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6J0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11850 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f35370;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8322 f35371;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f35372;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f35373;

    public C11850(C8322 c8322) {
        ArrayList arrayList = new ArrayList();
        this.f35370 = arrayList;
        this.f35372 = new HashMap();
        this.f35373 = new HashMap();
        this.f35371 = c8322;
        arrayList.add(new C6205());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c8322.mo12850().iterator();
        while (it.hasNext()) {
            arrayList2.add((C20317) it.next());
        }
        Collections.sort(arrayList2, new C10439(0));
        HashMap map = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C20317 c20317 = (C20317) it2.next();
            String typeName = c20317.getTypeName();
            Integer num = (Integer) map.get(typeName);
            int iIntValue = num != null ? num.intValue() : 0;
            map.put(typeName, Integer.valueOf(iIntValue + 1));
            if (iIntValue == this.f35370.size()) {
                this.f35370.add(new C6205());
            }
            C6205 c6205 = (C6205) this.f35370.get(iIntValue);
            c6205.f19033.add(c20317);
            this.f35372.put(Integer.valueOf(c20317.mo2870()), c6205);
            this.f35373.put(Integer.valueOf(c20317.mo2870()), c20317);
        }
        ArrayList<C6205> arrayList3 = this.f35370;
        for (C0560 c0560 : this.f35371.mo12845()) {
            HashMap map2 = new HashMap();
            if (c0560.mo2311() == 0) {
                ((C6205) arrayList3.get(0)).f19032.add(c0560);
            } else {
                for (C5500 c5500 : c0560.mo12337()) {
                    HashMap map3 = new HashMap();
                    if (((C15859) c5500.mo8775()).isEmpty()) {
                        map3.put((C6205) arrayList3.get(0), new C15859());
                    }
                    for (int i = 0; i < ((C15859) c5500.mo8775()).size(); i++) {
                        int i2 = ((C15859) c5500.mo8775()).getInt(i);
                        C6205 c6205M28962 = m28962(i2);
                        C15859 c15859 = (C15859) map3.get(c6205M28962);
                        if (c15859 == null) {
                            c15859 = new C15859();
                            map3.put(c6205M28962, c15859);
                        }
                        c15859.add(i2);
                    }
                    for (C6205 c6206 : arrayList3) {
                        C15859 c158510 = (C15859) map3.get(c6206);
                        if (c158510 != null) {
                            C0560 c0561 = (C0560) map2.get(c6206);
                            if (c0561 == null) {
                                c0561 = new C0560(c0560.getName(), c0560.mo12339());
                                map2.put(c6206, c0561);
                                c6206.f19032.add(c0561);
                            }
                            c0561.m2308(c5500.mo8776(), c158510);
                        }
                    }
                }
            }
        }
        for (C15376 c15376 : this.f35371.mo12857()) {
            if (c15376.mo36414() == 0) {
                ((C6205) this.f35370.get(0)).f19031.add(c15376);
            } else {
                HashMap map4 = new HashMap();
                for (C21728 c21728 : c15376.mo43981()) {
                    C6205 c6205M28963 = m28962(c21728.mo45542());
                    C15376 c15377 = (C15376) map4.get(c6205M28963);
                    if (c15377 == null) {
                        c15377 = new C15376();
                        map4.put(c6205M28963, c15377);
                        c6205M28963.f19031.add(c15377);
                    }
                    c15377.m36411(c21728.mo45543(), c21728.mo45542());
                }
            }
        }
        ArrayList arrayList4 = this.f35370;
        Collections.reverse(arrayList4.subList(1, arrayList4.size()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6205 m28962(int i) {
        int i2 = (i >>> 16) & 255;
        C20317 c20317 = (C20317) this.f35373.get(Integer.valueOf(i2));
        int i3 = 65535 & i;
        if ((i >>> 24) == this.f35371.mo12858() && c20317 != null && i3 < c20317.f65617.size() && c20317.m46622(i3) != null) {
            return (C6205) this.f35372.get(Integer.valueOf(i2));
        }
        return (C6205) this.f35370.get(0);
    }
}
