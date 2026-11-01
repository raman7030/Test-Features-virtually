package p067l;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.ۚᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7625 {

    /* JADX INFO: renamed from: ֫ */
    public final SparseBooleanArray f19968;

    public C7625(SparseBooleanArray sparseBooleanArray) {
        this.f19968 = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17590(int i) {
        return this.f19968.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17591(int... iArr) {
        for (int i : iArr) {
            if (this.f19968.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17589() {
        return this.f19968.size();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17592(int i) {
        SparseBooleanArray sparseBooleanArray = this.f19968;
        C23877.m52953(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7625)) {
            return false;
        }
        C7625 c7625 = (C7625) obj;
        SparseBooleanArray sparseBooleanArray = c7625.f19968;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f19968;
        if (i < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                if (m17592(i2) != c7625.m17592(i2)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f19968;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + m17592(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
