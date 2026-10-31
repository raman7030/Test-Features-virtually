package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩺۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C22872 implements ResultCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f73791;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7785 f73792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f73793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f73794;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f73795;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C22872(C22372 c22372, C12392 c12392, InterfaceC7785 interfaceC7785, String str, Runnable runnable) {
        this.f73791 = c22372;
        this.f73795 = c12392;
        this.f73792 = interfaceC7785;
        this.f73793 = str;
        this.f73794 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        C22372 c22372 = this.f73791;
        C12392 c12392 = c22372.f72517;
        if (c12392 == this.f73795) {
            if (c12392 == null || c12392.m30436() == this.f73792) {
                if (!this.f73793.equals(c22372.m5420().f15019.mo23554()) || c22372.m5426()) {
                    return;
                }
                this.f73794.run();
            }
        }
    }
}
