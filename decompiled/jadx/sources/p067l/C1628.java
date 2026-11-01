package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ܺۢ */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1628 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C1243 f52084;

    public C1628(C1243 c1243) {
        this.f52084 = c1243;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        this.f52084.f27808.notifyDataSetChanged();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        super.onInvalidated();
        this.f52084.f27808.notifyDataSetInvalidated();
    }
}
