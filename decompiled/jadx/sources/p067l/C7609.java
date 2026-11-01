package p067l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LU */
/* JADX INFO: loaded from: classes3.dex */
public final class C7609 extends AbstractC10298 {

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC6434 f19911;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f19912;

    /* JADX INFO: renamed from: ۬ */
    public final ArrayList f19913;

    public C7609(InterfaceC11799 interfaceC11799, InterfaceC6434 interfaceC6434, ArrayList arrayList) throws C5276 {
        super((AbstractC10969) interfaceC11799);
        this.f19912 = new ArrayList();
        this.f28482 = interfaceC6434.mo14712();
        this.f19911 = interfaceC6434;
        this.f28480 = interfaceC6434.mo14722();
        this.f28479 = interfaceC6434.getPackageName();
        this.f19913 = new ArrayList(interfaceC6434.mo14717());
        HashSet hashSet = new HashSet();
        for (InterfaceC3080 c3585 : interfaceC6434.mo14714()) {
            ArrayList arrayListM17560 = m17560(arrayList, c3585.mo5199());
            ArrayList arrayList2 = this.f19912;
            if (hashSet.add(Integer.valueOf(c3585.mo5199())) && !arrayListM17560.isEmpty()) {
                c3585 = new C3585(this, c3585, c3585.mo5199(), arrayListM17560);
            }
            arrayList2.add(c3585);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6268 c6268 = (C6268) it.next();
            int i = (c6268.f15855 >>> 16) & 255;
            if (i == 0) {
                throw C5276.m11410("RESOURCE_PATCH_CORRUPT", "Resource patch type ID is invalid.");
            }
            if (hashSet.add(Integer.valueOf(i))) {
                while (this.f19913.size() < i) {
                    this.f19913.add("?" + (this.f19913.size() + 1));
                }
                this.f19913.set(i - 1, c6268.f15859);
                this.f19912.add(new C3585(this, null, i, m17560(arrayList, i)));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m17560(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6268 c6268 = (C6268) it.next();
            if (((c6268.f15855 >>> 16) & 255) == i) {
                arrayList2.add(c6268);
            }
        }
        return arrayList2;
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۗ */
    public final int mo14715() {
        return this.f19912.size();
    }

    @Override // p067l.InterfaceC6434
    public final InterfaceC3080 getType(int i) {
        return (InterfaceC3080) this.f19912.get(i);
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜۧ */
    public final List mo14717() {
        return this.f19913;
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۖۧ */
    public final Iterable mo14714() {
        return this.f19912;
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۠֫ */
    public final int mo14718() {
        return this.f19911.mo14718();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC11128 mo14713(int i) {
        return this.f19911.mo14713(i);
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۠ۧ */
    public final Iterable mo14719() {
        return this.f19911.mo14719();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֡ */
    public final int mo14708() {
        return this.f19911.mo14708();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC17832 mo14720(int i) {
        return this.f19911.mo14720(i);
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֡֫ */
    public final Iterable mo14709() {
        return this.f19911.mo14709();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ֨֫ */
    public final int mo14710() {
        return this.f19911.mo14710();
    }

    @Override // p067l.InterfaceC6434
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20516 mo14716(int i) {
        return this.f19911.mo14716(i);
    }

    @Override // p067l.AbstractC10298, p067l.InterfaceC6434
    /* JADX INFO: renamed from: ᩹ */
    public final Iterable mo14721() {
        return this.f19911.mo14721();
    }
}
