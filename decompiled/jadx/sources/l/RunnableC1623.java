package l;

import bin.mt.plugin.api.ui.dialog.DualProgressDialog;

/* JADX INFO: renamed from: l.֫ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1623 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5710;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5711;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5712;

    public /* synthetic */ RunnableC1623(int i, int i2, Object obj) {
        this.f5711 = i2;
        this.f5712 = obj;
        this.f5710 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5711) {
            case 0:
                ((C2664) this.f5712).setItemChecked(this.f5710, true);
                break;
            default:
                ((DualProgressDialog) this.f5712).lambda$setMaxSubProgress$1(this.f5710);
                break;
        }
    }
}
