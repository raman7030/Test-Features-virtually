package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۘܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes2.dex */
public final class C3981 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0452 f12628;

    public C3981(C0452 c0452) {
        this.f12628 = c0452;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.f12628.m2025();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f12628.m2025();
    }
}
