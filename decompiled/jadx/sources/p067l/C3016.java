package p067l;

import android.text.SpannableString;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H540 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3016 {

    /* JADX INFO: renamed from: ֫ */
    public SparseArray f5390 = new SparseArray();

    /* JADX INFO: renamed from: ۧ */
    public int f5391 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final void m5102(SpannableString spannableString, int i) {
        SparseArray sparseArray = this.f5390;
        C21123 c21123 = (C21123) sparseArray.get(i);
        if (c21123 == null) {
            c21123 = new C21123(0);
            sparseArray.put(i, c21123);
        }
        C20452 c20452 = new C20452();
        c20452.f63173 = spannableString;
        if (c21123.f66387 == null) {
            c21123.f66388 = c20452;
            c21123.f66387 = c20452;
        } else {
            c21123.f66388.f63172 = c20452;
            c21123.f66388 = c20452;
        }
        this.f5391++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5101() {
        return this.f5391;
    }

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList m5104() {
        ArrayList arrayList = new ArrayList(this.f5391);
        m5103(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5103(ArrayList arrayList) {
        SparseArray sparseArray = this.f5390;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        Arrays.sort(iArr);
        for (int i2 = 0; i2 < size; i2++) {
            C21123 c21123 = (C21123) sparseArray.get(iArr[i2]);
            if (c21123 != null) {
                for (C20452 c20452 = c21123.f66387; c20452 != null; c20452 = c20452.f63172) {
                    arrayList.add(c20452.f63173);
                }
            }
        }
    }
}
