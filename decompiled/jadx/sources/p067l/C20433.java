package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ᩴ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20433 extends C15486 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C8362 f63123;

    public C20433(C8362 c8362) {
        this.f63123 = c8362;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo24065(ResultCallback resultCallback) {
        C8362 c8362 = this.f63123;
        ActivityC18686 activityC18686 = (ActivityC18686) c8362.requireActivity();
        if (c8362.mo19366()) {
            new C23785(activityC18686, new C14397(activityC18686, c8362, true), resultCallback).m22250();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ۧ */
    public final String mo10449() {
        return C11419.m26414(this.f63123.m19360()) + ".smali";
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24067() {
        return this.f63123.mo19366();
    }
}
