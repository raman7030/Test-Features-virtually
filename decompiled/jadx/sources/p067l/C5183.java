package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5183 extends AbstractC9206 {

    /* JADX INFO: renamed from: ᩻ */
    public static Comparator f12207 = new C6524();

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final void mo8304(InterfaceC15240 interfaceC15240) {
        ((C14570) interfaceC15240).f41624 = true;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ܽ */
    public final void mo8307() {
        HashSet hashSet = new HashSet(this.f24913.size() / 2);
        C7865 c7865 = new C7865();
        c7865.addAll(this.f24913);
        while (!c7865.isEmpty()) {
            C14570 c14570 = (C14570) c7865.poll();
            if (c14570.f41624 && !hashSet.contains(c14570)) {
                hashSet.add(c14570);
                C14570 c14571 = c14570.f41627;
                if (c14571 != null && !c14571.f41624) {
                    c14571.f41624 = true;
                    c7865.add(c14571);
                }
                ArrayList<C14570> arrayList = c14570.f41625;
                if (arrayList != null && arrayList.size() > 0) {
                    for (C14570 c14572 : arrayList) {
                        if (c14572 != null && !c14572.f41624) {
                            c14572.f41624 = true;
                            c7865.add(c14572);
                        }
                    }
                    c14570.f41625 = null;
                }
            }
        }
        Iterator it = this.f24913.iterator();
        while (it.hasNext()) {
            ((C14570) it.next()).f41627 = null;
        }
        this.f24913 = null;
    }

    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final C14570[] mo3727(C14570[] c14570Arr, C14570[] c14570Arr2, AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        boolean z;
        C14570 c14570;
        C14570 c14571;
        ArrayList<C23089> arrayList;
        HashMap map = new HashMap();
        if (abstractC3881.f8417 == EnumC9677.LABEL && (arrayList = ((C15041) abstractC3881).f42963) != null) {
            for (C23089 c23089 : arrayList) {
                map.put(Integer.valueOf(((C19736) c23089.f45527).f60034), c23089);
            }
        }
        if (c14570Arr2 == null) {
            c14570Arr2 = (C14570[]) m21225();
            for (int i = 0; i < c14570Arr2.length; i++) {
                if (!map.containsKey(Integer.valueOf(i)) && (c14571 = c14570Arr[i]) != null) {
                    C14570 c14572 = new C14570(0);
                    this.f24913.add(c14572);
                    c14572.f41627 = c14571;
                    c14572.f41622 = c14571.f41622 + 1;
                    c14572.f41623 = c14571.f41623;
                    c14570Arr2[i] = c14572;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (int i2 = 0; i2 < c14570Arr2.length; i2++) {
                if (!map.containsKey(Integer.valueOf(i2))) {
                    C14570 c14573 = c14570Arr[i2];
                    C14570 c14574 = c14570Arr2[i2];
                    if (c14573 != null && c14574 != null) {
                        if (c14574.f41625 == null) {
                            c14574.f41625 = new ArrayList(5);
                        }
                        c14574.f41625.add(c14573);
                    }
                }
            }
        }
        for (C23089 c230810 : map.values()) {
            C19736 c19736 = (C19736) c230810.f45527;
            if (z) {
                c14570 = new C14570(0);
                c14570.f41623 = c19736;
                c14570.f41626 = new HashMap();
                c14570Arr2[c19736.f60034] = c14570;
            } else {
                c14570 = c14570Arr2[c19736.f60034];
            }
            ArrayList arrayList2 = new ArrayList();
            C14570 c14575 = c14570Arr[c19736.f60034];
            if (c14575 != null) {
                arrayList2.add(c14575);
            }
            for (AbstractC10348 abstractC10348 : c230810.f45528.mo17753()) {
                C14570 c14576 = c14570Arr[((C19736) abstractC10348).f60034];
                if (c14576 != null) {
                    arrayList2.add(c14576);
                }
            }
            Collections.sort(arrayList2, f12207);
            C14570 c14577 = (C14570) arrayList2.get(0);
            c14577.f41624 = true;
            c14570.f41626.put(abstractC3880, c14577.f41623);
        }
        return c14570Arr2;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15240[] mo8305(int i) {
        return new C14570[i];
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC15240 mo8308() {
        return new C14570(0);
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15240 mo8303(C19736 c19736, AbstractC10348 abstractC10348) {
        C14570 c14570 = (C14570) super.mo8303(c19736, abstractC10348);
        c14570.f41623 = c19736;
        c14570.f41624 = true;
        return c14570;
    }
}
