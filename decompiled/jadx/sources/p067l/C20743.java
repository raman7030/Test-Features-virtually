package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 026V */
/* JADX INFO: loaded from: classes4.dex */
public final class C20743 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f64014;

    /* JADX INFO: renamed from: ۧ */
    public final C5990 f64015;

    public C20743(C5990 c5990) {
        this.f64015 = c5990;
        ArrayList arrayList = new ArrayList();
        this.f64014 = arrayList;
        arrayList.add(new C20072(c5990, new int[]{1}));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46844(int i, int[] iArr) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ArrayList arrayList = this.f64014;
        int size = arrayList.size();
        C5990 c5990 = this.f64015;
        if (i >= size) {
            C20072 c20072M45454 = (C20072) C20013.m45383(arrayList, 1);
            for (int size2 = arrayList.size(); size2 <= i; size2++) {
                c20072M45454 = c20072M45454.m45454(new C20072(c5990, new int[]{1, c5990.m13430(c5990.m13429() + (size2 - 1))}));
                arrayList.add(c20072M45454);
            }
        }
        C20072 c20072 = (C20072) arrayList.get(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM45451 = new C20072(c5990, iArr2).m45449(i, 1).m45453(c20072)[1].m45451();
        int length2 = i - iArrM45451.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM45451, 0, iArr, length + length2, iArrM45451.length);
    }
}
