package l;

import bin.mt.plugin.api.ui.dialog.LoadingDialog;

/* JADX INFO: renamed from: l.ۡ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8885 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27040;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27041;

    public /* synthetic */ RunnableC8885(int i, Object obj) {
        this.f27040 = i;
        this.f27041 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27040) {
            case 0:
                C7473.m20023((C7473) this.f27041);
                break;
            case 1:
                ((LoadingDialog) this.f27041).lambda$dismiss$2();
                break;
            default:
                C15757.m37160((String[]) this.f27041);
                break;
        }
    }
}
