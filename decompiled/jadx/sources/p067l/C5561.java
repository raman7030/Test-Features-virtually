package p067l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۗܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5561 {

    /* JADX INFO: renamed from: ۧ */
    public final C11597 f13436;

    /* JADX INFO: renamed from: ܽ */
    public final SparseArray f13437 = new SparseArray();

    /* JADX INFO: renamed from: ֫ */
    public int f13435 = -1;

    public C5561(C11597 c11597) {
        this.f13436 = c11597;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m12296(int i) {
        SparseArray sparseArray;
        if (this.f13435 == -1) {
            this.f13435 = 0;
        }
        while (true) {
            int i2 = this.f13435;
            sparseArray = this.f13437;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f13435--;
        }
        while (this.f13435 < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f13435 + 1)) {
            this.f13435++;
        }
        return sparseArray.valueAt(this.f13435);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12293(int i, Object obj) {
        int i2 = this.f13435;
        SparseArray sparseArray = this.f13437;
        if (i2 == -1) {
            C23877.m52960(sparseArray.size() == 0);
            this.f13435 = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C23877.m52957(i >= iKeyAt);
            if (iKeyAt == i) {
                this.f13436.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m12294() {
        SparseArray sparseArray = this.f13437;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12295(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f13437;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.f13436.accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.f13435;
            if (i4 > 0) {
                this.f13435 = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12292(int i) {
        SparseArray sparseArray = this.f13437;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0 || i >= sparseArray.keyAt(size)) {
                break;
            }
            this.f13436.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f13435 = sparseArray.size() > 0 ? Math.min(this.f13435, sparseArray.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12291() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f13437;
            if (i < sparseArray.size()) {
                this.f13436.accept(sparseArray.valueAt(i));
                i++;
            } else {
                this.f13435 = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m12297() {
        return this.f13437.size() == 0;
    }
}
