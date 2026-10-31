package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public final class C14224 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9287 f42898;

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C9287 c9287 = this.f42898;
        if (c9287.f28156.isShowing()) {
            c9287.show();
        }
    }

    public C14224(C9287 c9287) {
        this.f42898 = c9287;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f42898.dismiss();
    }
}
