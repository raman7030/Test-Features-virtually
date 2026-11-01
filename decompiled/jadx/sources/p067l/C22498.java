package p067l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.᩷᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J7MO */
/* JADX INFO: loaded from: classes4.dex */
public final class C22498 {

    /* JADX INFO: renamed from: ֫ */
    public final SparseArray f70940 = new SparseArray();

    /* JADX INFO: renamed from: ֫ */
    public final C11157 m50459(int i) {
        SparseArray sparseArray = this.f70940;
        C11157 c11157 = (C11157) sparseArray.get(i);
        if (c11157 != null) {
            return c11157;
        }
        C11157 c11158 = new C11157(9223372036854775806L);
        sparseArray.put(i, c11158);
        return c11158;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50460() {
        this.f70940.clear();
    }
}
