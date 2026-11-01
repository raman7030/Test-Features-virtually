package p067l;

import bin.p000mt.plugin.api.p002ui.dialog.DualProgressDialog;

/* JADX INFO: renamed from: l.֫ۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3911 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f8490;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8491;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f8492;

    public /* synthetic */ RunnableC3911(int i, int i2, Object obj) {
        this.f8491 = i2;
        this.f8492 = obj;
        this.f8490 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8491) {
            case 0:
                ((C0974) this.f8492).setItemChecked(this.f8490, true);
                break;
            default:
                ((DualProgressDialog) this.f8492).lambda$setMaxSubProgress$1(this.f8490);
                break;
        }
    }
}
