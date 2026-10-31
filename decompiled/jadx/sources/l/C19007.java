package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ᩴ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19007 extends C13802 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f59894;

    public C19007(C6306 c6306) {
        this.f59894 = c6306;
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ֫ */
    public final void mo22095(ResultCallback resultCallback) {
        C6306 c6306 = this.f59894;
        ActivityC17169 activityC17169 = (ActivityC17169) c6306.requireActivity();
        if (c6306.mo17426()) {
            new C22534(activityC17169, new C12656(activityC17169, c6306, true), resultCallback).m20274();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ۧ */
    public final String mo8403() {
        return C9523.m24404(this.f59894.m17420()) + ".smali";
    }

    @Override // l.C13802
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo22097() {
        return this.f59894.mo17426();
    }
}
