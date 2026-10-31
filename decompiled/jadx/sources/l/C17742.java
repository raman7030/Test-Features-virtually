package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ᩳ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17742 extends C13802 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f54291;

    public C17742(C7864 c7864) {
        this.f54291 = c7864;
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ֫ */
    public final void mo22095(ResultCallback resultCallback) {
        C7864 c7864 = this.f54291;
        ActivityC17169 activityC17169 = (ActivityC17169) c7864.requireActivity();
        if (c7864.mo17426()) {
            new C2220(activityC17169, new C0808(activityC17169, c7864, true), resultCallback).m20274();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ۧ */
    public final String mo8403() {
        return C9523.m24404(this.f54291.m21123()) + ".xml";
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo22097() {
        return this.f54291.mo17426();
    }
}
