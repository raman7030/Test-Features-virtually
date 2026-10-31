package l;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۢ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9836 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f29720 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24902(C21125 c21125) {
        long[] jArr = c21125.f68133;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f29720;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c21125.f68133[0]), c21125);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21125 m24901() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C21125 c21125 : this.f29720.values()) {
            arrayList.add(c21125.f68135);
            arrayList2.add(c21125.f68136);
            arrayList3.add(c21125.f68132);
            arrayList4.add(c21125.f68133);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        C4025.m12105(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C21125(iArr3, C6371.m17663((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C6371.m17663((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C6371.m17663((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24903() {
        return this.f29720.size();
    }
}
