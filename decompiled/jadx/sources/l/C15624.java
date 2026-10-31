package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܺ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15624 implements ResultCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f48103;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C15624(Runnable runnable) {
        this.f48103 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        this.f48103.run();
    }
}
