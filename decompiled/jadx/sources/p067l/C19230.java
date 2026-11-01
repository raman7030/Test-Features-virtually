package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ᩳ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19230 extends C15486 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C9842 f57483;

    public C19230(C9842 c9842) {
        this.f57483 = c9842;
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ֫ */
    public final void mo24065(ResultCallback resultCallback) {
        C9842 c9842 = this.f57483;
        ActivityC18686 activityC18686 = (ActivityC18686) c9842.requireActivity();
        if (c9842.mo19366()) {
            new C4478(activityC18686, new C3136(activityC18686, c9842, true), resultCallback).m22250();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ۧ */
    public final String mo10449() {
        return C11419.m26414(this.f57483.m23088()) + ".xml";
    }

    @Override // p067l.C15486
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo24067() {
        return this.f57483.mo19366();
    }
}
