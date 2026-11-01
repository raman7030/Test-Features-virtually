package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩸᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23115 implements ResultCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f72650;

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C23115(Runnable runnable) {
        this.f72650 = runnable;
    }

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        this.f72650.run();
    }
}
