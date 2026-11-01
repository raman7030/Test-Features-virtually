package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.᩺۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C24106 implements ResultCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C23631 f76522;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC9768 f76523;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f76524;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ Runnable f76525;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C14146 f76526;

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C24106(C23631 c23631, C14146 c14146, InterfaceC9768 interfaceC9768, String str, Runnable runnable) {
        this.f76522 = c23631;
        this.f76526 = c14146;
        this.f76523 = interfaceC9768;
        this.f76524 = str;
        this.f76525 = runnable;
    }

    @Override // bin.p000mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        C23631 c23631 = this.f76522;
        C14146 c14146 = c23631.f75242;
        if (c14146 == this.f76526) {
            if (c14146 == null || c14146.m32500() == this.f76523) {
                if (!this.f76524.equals(c23631.m7649().f17850.mo25505()) || c23631.m7655()) {
                    return;
                }
                this.f76525.run();
            }
        }
    }
}
