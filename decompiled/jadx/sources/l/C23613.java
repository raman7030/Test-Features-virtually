package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩻ۢۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J5HS */
/* JADX INFO: loaded from: classes.dex */
public final class C23613 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9503 f76531;

    public C23613(C9503 c9503) {
        this.f76531 = c9503;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C9503.m24348(this.f76531);
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        C9503.m24348(this.f76531);
    }
}
