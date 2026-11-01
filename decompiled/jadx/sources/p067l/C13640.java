package p067l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۨᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes3.dex */
public final class C13640 {

    /* JADX INFO: renamed from: ֫ */
    public final SparseArray f38391;

    /* JADX INFO: renamed from: ۧ */
    public C4232 f38392;

    public C13640() {
        this(1);
    }

    public C13640(int i) {
        this.f38391 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13640 m31019(int i) {
        SparseArray sparseArray = this.f38391;
        if (sparseArray == null) {
            return null;
        }
        return (C13640) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4232 m31018() {
        return this.f38392;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31020(C4232 c4232, int i, int i2) {
        C13640 c13640M31019 = m31019(c4232.m8597(i));
        if (c13640M31019 == null) {
            c13640M31019 = new C13640();
            this.f38391.put(c4232.m8597(i), c13640M31019);
        }
        if (i2 > i) {
            c13640M31019.m31020(c4232, i + 1, i2);
        } else {
            c13640M31019.f38392 = c4232;
        }
    }
}
