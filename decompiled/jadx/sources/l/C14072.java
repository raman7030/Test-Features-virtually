package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܰ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14072 implements ResultCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f42497;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9170 f42498;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C14072(C9170 c9170, Runnable runnable) {
        this.f42498 = c9170;
        this.f42497 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        if (this.f42498.m23581()) {
            this.f42497.run();
        }
    }
}
