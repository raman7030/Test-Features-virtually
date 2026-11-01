package p067l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4RE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4115 extends AbstractC9206 {
    @Override // p067l.InterfaceC2538
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3727(Object obj, Object obj2, AbstractC3880 abstractC3880, AbstractC3880 abstractC3881) {
        C12833[] c12833Arr = (C12833[]) obj;
        C12833[] c12833Arr2 = (C12833[]) obj2;
        int i = 0;
        if (c12833Arr2 == null) {
            C12833[] c12833Arr3 = new C12833[this.f24916];
            while (i < c12833Arr.length) {
                C12833 c12833 = c12833Arr[i];
                if (c12833 != null) {
                    C12833 c12834 = new C12833();
                    this.f24913.add(c12834);
                    c12834.f36115 = c12833;
                    c12833Arr3[i] = c12834;
                }
                i++;
            }
            return c12833Arr3;
        }
        while (i < c12833Arr.length) {
            C12833 c12835 = c12833Arr[i];
            C12833 c12836 = c12833Arr2[i];
            if (c12835 != null && c12836 != null) {
                ArrayList arrayList = c12836.f36114;
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                    c12836.f36114 = arrayList;
                }
                arrayList.add(c12835);
            }
            i++;
        }
        return c12833Arr2;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final void mo8304(InterfaceC15240 interfaceC15240) {
        ((C12833) interfaceC15240).f36116 = true;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ܽ */
    public final void mo8307() {
        HashSet hashSet = new HashSet(this.f24913.size() / 2);
        C7865 c7865 = new C7865();
        for (C12833 c12833 : this.f24913) {
            if (c12833.f36116) {
                c7865.add(c12833);
                while (!c7865.isEmpty()) {
                    C12833 c12834 = (C12833) c7865.poll();
                    if (c12834.f36116 && !hashSet.contains(c12834)) {
                        hashSet.add(c12834);
                        C12833 c12835 = c12834.f36115;
                        if (c12835 != null && !c12835.f36116) {
                            c12835.f36116 = true;
                            c7865.add(c12835);
                        }
                        ArrayList<C12833> arrayList = c12834.f36114;
                        if (arrayList != null) {
                            for (C12833 c12836 : arrayList) {
                                if (!c12836.f36116) {
                                    c12836.f36116 = true;
                                    c7865.add(c12836);
                                }
                            }
                            c12834.f36114 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m8306() {
        return this.f24916;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15240[] mo8305(int i) {
        return new C12833[i];
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15240 mo8303(C19736 c19736, AbstractC10348 abstractC10348) {
        C12833 c12833 = new C12833();
        c12833.f36116 = true;
        return c12833;
    }

    @Override // p067l.AbstractC9206
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC15240 mo8308() {
        return new C12833();
    }
}
