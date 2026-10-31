package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.ۘᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N15M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4132 extends DataSetObserver {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f13098;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0603 f13099;

    public C4132(C0603 c0603, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f13099 = c0603;
        this.f13098 = dialogInterfaceC0206;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        if (this.f13099.f2340.isEmpty()) {
            this.f13098.dismiss();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f13098.dismiss();
    }
}
