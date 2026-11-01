package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܰ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15743 implements ResultCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ Runnable f45583;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11084 f45584;

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C15743(C11084 c11084, Runnable runnable) {
        this.f45584 = c11084;
        this.f45583 = runnable;
    }

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        if (this.f45584.m25532()) {
            this.f45583.run();
        }
    }
}
