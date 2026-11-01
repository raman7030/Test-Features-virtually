package p067l;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: l.֡ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28K4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f5087;

    /* JADX INFO: renamed from: ۧ */
    public final SparseBooleanArray f5088 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ֫ */
    public final void m4801(int i) {
        C23877.m52960(!this.f5087);
        this.f5088.append(i, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7625 m4800() {
        C23877.m52960(!this.f5087);
        this.f5087 = true;
        return new C7625(this.f5088);
    }
}
