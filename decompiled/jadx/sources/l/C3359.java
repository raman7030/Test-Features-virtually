package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۗܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3359 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9710 f10628;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseArray f10629 = new SparseArray();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10627 = -1;

    public C3359(C9710 c9710) {
        this.f10628 = c9710;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m10259(int i) {
        SparseArray sparseArray;
        if (this.f10627 == -1) {
            this.f10627 = 0;
        }
        while (true) {
            int i2 = this.f10627;
            sparseArray = this.f10629;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.f10627--;
        }
        while (this.f10627 < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f10627 + 1)) {
            this.f10627++;
        }
        return sparseArray.valueAt(this.f10627);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10256(int i, Object obj) {
        int i2 = this.f10627;
        SparseArray sparseArray = this.f10629;
        if (i2 == -1) {
            C22632.m50634(sparseArray.size() == 0);
            this.f10627 = 0;
        }
        if (sparseArray.size() > 0) {
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C22632.m50631(i >= iKeyAt);
            if (iKeyAt == i) {
                this.f10628.accept(sparseArray.valueAt(sparseArray.size() - 1));
            }
        }
        sparseArray.append(i, obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m10257() {
        SparseArray sparseArray = this.f10629;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10258(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f10629;
            if (i2 >= sparseArray.size() - 1) {
                return;
            }
            int i3 = i2 + 1;
            if (i < sparseArray.keyAt(i3)) {
                return;
            }
            this.f10628.accept(sparseArray.valueAt(i2));
            sparseArray.removeAt(i2);
            int i4 = this.f10627;
            if (i4 > 0) {
                this.f10627 = i4 - 1;
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10255(int i) {
        SparseArray sparseArray = this.f10629;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0 || i >= sparseArray.keyAt(size)) {
                break;
            }
            this.f10628.accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        this.f10627 = sparseArray.size() > 0 ? Math.min(this.f10627, sparseArray.size() - 1) : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10254() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f10629;
            if (i < sparseArray.size()) {
                this.f10628.accept(sparseArray.valueAt(i));
                i++;
            } else {
                this.f10627 = -1;
                sparseArray.clear();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m10260() {
        return this.f10629.size() == 0;
    }
}
