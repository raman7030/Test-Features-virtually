package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩻ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes.dex */
public final class C24810 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C11400 f79275;

    public C24810(C11400 c11400) {
        this.f79275 = c11400;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C11400.m26358(this.f79275);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        C11400.m26358(this.f79275);
    }
}
