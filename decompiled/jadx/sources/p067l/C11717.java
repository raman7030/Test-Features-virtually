package p067l;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۢ᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7TA */
/* JADX INFO: loaded from: classes3.dex */
public final class C11717 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f32673 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m26917(C22446 c22446) {
        long[] jArr = c22446.f70815;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f32673;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(c22446.f70815[0]), c22446);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22446 m26916() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C22446 c22446 : this.f32673.values()) {
            arrayList.add(c22446.f70817);
            arrayList2.add(c22446.f70818);
            arrayList3.add(c22446.f70814);
            arrayList4.add(c22446.f70815);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        C6194.m14025(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new C22446(iArr3, C8424.m19608((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), C8424.m19608((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), C8424.m19608((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m26918() {
        return this.f32673.size();
    }
}
