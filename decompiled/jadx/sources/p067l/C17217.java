package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܺ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17217 implements ResultCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f51242;

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C17217(Runnable runnable) {
        this.f51242 = runnable;
    }

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        this.f51242.run();
    }
}
