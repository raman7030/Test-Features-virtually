package l;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: l.֫۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4RE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1838 extends AbstractC7195 {
    @Override // l.InterfaceC0179
    /* JADX INFO: renamed from: ֫ */
    public final Object mo1319(Object obj, Object obj2, AbstractC1591 abstractC1591, AbstractC1591 abstractC1592) {
        C11011[] c11011Arr = (C11011[]) obj;
        C11011[] c11011Arr2 = (C11011[]) obj2;
        int i = 0;
        if (c11011Arr2 == null) {
            C11011[] c11011Arr3 = new C11011[this.f22038];
            while (i < c11011Arr.length) {
                C11011 c11011 = c11011Arr[i];
                if (c11011 != null) {
                    C11011 c11012 = new C11011();
                    this.f22035.add(c11012);
                    c11012.f33121 = c11011;
                    c11011Arr3[i] = c11012;
                }
                i++;
            }
            return c11011Arr3;
        }
        while (i < c11011Arr.length) {
            C11011 c11013 = c11011Arr[i];
            C11011 c11014 = c11011Arr2[i];
            if (c11013 != null && c11014 != null) {
                ArrayList arrayList = c11014.f33120;
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                    c11014.f33120 = arrayList;
                }
                arrayList.add(c11013);
            }
            i++;
        }
        return c11011Arr2;
    }

    @Override // l.AbstractC7195
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6106(InterfaceC13544 interfaceC13544) {
        ((C11011) interfaceC13544).f33122 = true;
    }

    @Override // l.AbstractC7195
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6109() {
        HashSet hashSet = new HashSet(this.f22035.size() / 2);
        C5784 c5784 = new C5784();
        for (C11011 c11011 : this.f22035) {
            if (c11011.f33122) {
                c5784.add(c11011);
                while (!c5784.isEmpty()) {
                    C11011 c11012 = (C11011) c5784.poll();
                    if (c11012.f33122 && !hashSet.contains(c11012)) {
                        hashSet.add(c11012);
                        C11011 c11013 = c11012.f33121;
                        if (c11013 != null && !c11013.f33122) {
                            c11013.f33122 = true;
                            c5784.add(c11013);
                        }
                        ArrayList<C11011> arrayList = c11012.f33120;
                        if (arrayList != null) {
                            for (C11011 c11014 : arrayList) {
                                if (!c11014.f33122) {
                                    c11014.f33122 = true;
                                    c5784.add(c11014);
                                }
                            }
                            c11012.f33120 = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6108() {
        return this.f22038;
    }

    @Override // l.AbstractC7195
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544[] mo6107(int i) {
        return new C11011[i];
    }

    @Override // l.AbstractC7195
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 mo6105(C18274 c18274, AbstractC8396 abstractC8396) {
        C11011 c11011 = new C11011();
        c11011.f33122 = true;
        return c11011;
    }

    @Override // l.AbstractC7195
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13544 mo6110() {
        return new C11011();
    }
}
