package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۘܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes2.dex */
public final class C6152 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C2798 f15439;

    public C6152(C2798 c2798) {
        this.f15439 = c2798;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f15439.m4402();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f15439.m4402();
    }
}
