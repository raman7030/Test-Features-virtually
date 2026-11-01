package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes4.dex */
public final class C10291 extends AbstractC10969 {

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f28469 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC11799 f28470;

    public C10291(InterfaceC11799 interfaceC11799, ArrayList arrayList) throws C5276 {
        this.f28470 = interfaceC11799;
        HashSet hashSet = new HashSet();
        for (InterfaceC6434 c7609 : interfaceC11799.mo23906()) {
            ArrayList arrayList2 = new ArrayList();
            if (hashSet.add(Integer.valueOf(c7609.mo14722()))) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C6268 c6268 = (C6268) it.next();
                    if (c6268.m14234() && (c6268.f15855 >>> 24) == c7609.mo14722()) {
                        arrayList2.add(c6268);
                    }
                }
            }
            ArrayList arrayList3 = this.f28469;
            if (!arrayList2.isEmpty()) {
                c7609 = new C7609(this, c7609, arrayList2);
            }
            arrayList3.add(c7609);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C6268 c6269 = (C6268) it2.next();
            if (c6269.m14234() && !hashSet.contains(Integer.valueOf(c6269.f15855 >>> 24))) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch package is missing.");
            }
        }
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩻ۧ */
    public final InterfaceC14480 mo16869() {
        return this.f28470.mo16869();
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۚ */
    public final int mo16866() {
        return this.f28469.size();
    }

    @Override // p067l.InterfaceC11799
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC6434 mo16867(int i) {
        return (InterfaceC6434) this.f28469.get(i);
    }

    @Override // p067l.AbstractC10969, p067l.InterfaceC11799
    /* JADX INFO: renamed from: ᩺ */
    public final Iterable mo23906() {
        return this.f28469;
    }
}
