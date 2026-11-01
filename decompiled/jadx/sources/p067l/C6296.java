package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۘᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C6296 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ DialogInterfaceC2564 f15912;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C2942 f15913;

    public C6296(C2942 c2942, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f15913 = c2942;
        this.f15912 = dialogInterfaceC2564;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f15913.f5114.isEmpty()) {
            this.f15912.dismiss();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f15912.dismiss();
    }
}
