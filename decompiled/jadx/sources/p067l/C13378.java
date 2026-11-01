package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C13378 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ResultCallback f37534;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23631 f37535;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC17874 f37536;

    static {
        ApplicationC14266.m56479(93);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public native void mo3402();

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C13378(C23631 c23631, ActivityC17874 activityC17874, ResultCallback resultCallback) {
        this.f37535 = c23631;
        this.f37536 = activityC17874;
        this.f37534 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f37536, this.f37535.m52513() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f37535.m52484(exc, this.f37536);
        ResultCallback resultCallback = this.f37534;
        if (resultCallback != null) {
            resultCallback.onFailure(C19781.m44958(exc));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
