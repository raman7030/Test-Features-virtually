package p067l;

import bin.p000mt.plugin.api.p002ui.dialog.LoadingDialog;

/* JADX INFO: renamed from: l.ۡ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10813 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29964;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f29965;

    public /* synthetic */ RunnableC10813(int i, Object obj) {
        this.f29964 = i;
        this.f29965 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29964) {
            case 0:
                C9471.m21998((C9471) this.f29965);
                break;
            case 1:
                ((LoadingDialog) this.f29965).lambda$dismiss$2();
                break;
            default:
                C17344.m39330((String[]) this.f29965);
                break;
        }
    }
}
