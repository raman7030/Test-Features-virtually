package p067l;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ܶۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5F4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16626 {

    /* JADX INFO: renamed from: ۧ */
    public final SparseIntArray f48870 = new SparseIntArray();

    /* JADX INFO: renamed from: ֫ */
    public final SparseIntArray f48869 = new SparseIntArray();

    /* JADX INFO: renamed from: ֫ */
    public static int m37694(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37695() {
        this.f48870.clear();
    }
}
