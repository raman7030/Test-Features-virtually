package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܳۖ */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1548 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1303 f45991;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1303 c1303 = this.f45991;
        if (c1303.f31105.isShowing()) {
            c1303.show();
        }
    }

    public C1548(C1303 c1303) {
        this.f45991 = c1303;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f45991.dismiss();
    }
}
