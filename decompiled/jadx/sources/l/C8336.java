package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C8336 extends AbstractC9049 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f25555 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 f25556;

    public C8336(InterfaceC9922 interfaceC9922, ArrayList arrayList) throws C3059 {
        this.f25556 = interfaceC9922;
        HashSet hashSet = new HashSet();
        for (InterfaceC4277 c5514 : interfaceC9922.mo21936()) {
            ArrayList arrayList2 = new ArrayList();
            if (hashSet.add(Integer.valueOf(c5514.mo12858()))) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C4103 c4103 = (C4103) it.next();
                    if (c4103.m12329() && (c4103.f13041 >>> 24) == c5514.mo12858()) {
                        arrayList2.add(c4103);
                    }
                }
            }
            ArrayList arrayList3 = this.f25555;
            if (!arrayList2.isEmpty()) {
                c5514 = new C5514(this, c5514, arrayList2);
            }
            arrayList3.add(c5514);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C4103 c4104 = (C4103) it2.next();
            if (c4104.m12329() && !hashSet.contains(Integer.valueOf(c4104.f13041 >>> 24))) {
                throw C3059.m9368("RESOURCE_PATCH_CORRUPT", "Resource patch package is missing.");
            }
        }
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC12743 mo14959() {
        return this.f25556.mo14959();
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۚ */
    public final int mo14956() {
        return this.f25555.size();
    }

    @Override // l.InterfaceC9922
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC4277 mo14957(int i) {
        return (InterfaceC4277) this.f25555.get(i);
    }

    @Override // l.AbstractC9049, l.InterfaceC9922
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Iterable mo21936() {
        return this.f25555;
    }
}
