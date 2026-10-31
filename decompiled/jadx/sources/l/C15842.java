package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15842 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8082 f48946;

    public C15842(C8082 c8082) {
        this.f48946 = c8082;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f48946.f24897.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.f48946.f24897.notifyDataSetInvalidated();
    }
}
