package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۨᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: LB1M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11860 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f35382;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1961 f35383;

    public C11860() {
        this(1);
    }

    public C11860(int i) {
        this.f35382 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11860 m28968(int i) {
        SparseArray sparseArray = this.f35382;
        if (sparseArray == null) {
            return null;
        }
        return (C11860) sparseArray.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1961 m28967() {
        return this.f35383;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28969(C1961 c1961, int i, int i2) {
        C11860 c11860M28968 = m28968(c1961.m6456(i));
        if (c11860M28968 == null) {
            c11860M28968 = new C11860();
            this.f35382.put(c1961.m6456(i), c11860M28968);
        }
        if (i2 > i) {
            c11860M28968.m28969(c1961, i + 1, i2);
        } else {
            c11860M28968.f35383 = c1961;
        }
    }
}
