package l;

import android.os.Build;
import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.ۚᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5531 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f17126;

    public C5531(SparseBooleanArray sparseBooleanArray) {
        this.f17126 = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15675(int i) {
        return this.f17126.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15676(int... iArr) {
        for (int i : iArr) {
            if (this.f17126.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15674() {
        return this.f17126.size();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15677(int i) {
        SparseBooleanArray sparseBooleanArray = this.f17126;
        C22632.m50627(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5531)) {
            return false;
        }
        C5531 c5531 = (C5531) obj;
        SparseBooleanArray sparseBooleanArray = c5531.f17126;
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray2 = this.f17126;
        if (i < 24) {
            if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
                return false;
            }
            for (int i2 = 0; i2 < sparseBooleanArray2.size(); i2++) {
                if (m15677(i2) != c5531.m15677(i2)) {
                    return false;
                }
            }
            return true;
        }
        return sparseBooleanArray2.equals(sparseBooleanArray);
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        SparseBooleanArray sparseBooleanArray = this.f17126;
        if (i < 24) {
            int size = sparseBooleanArray.size();
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                size = (size * 31) + m15677(i2);
            }
            return size;
        }
        return sparseBooleanArray.hashCode();
    }
}
