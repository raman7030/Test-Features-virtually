package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩸᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C21829 implements ResultCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f69941;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C21829(Runnable runnable) {
        this.f69941 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        this.f69941.run();
    }
}
