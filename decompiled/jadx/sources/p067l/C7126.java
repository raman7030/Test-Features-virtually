package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7126 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean f18605;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC3102 f18606;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ResultCallback f18607;

    public C7126(AbstractActivityC3102 abstractActivityC3102, boolean z, ResultCallback resultCallback) {
        this.f18606 = abstractActivityC3102;
        this.f18605 = z;
        this.f18607 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f18606, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractActivityC3102 abstractActivityC3102 = this.f18606;
        abstractActivityC3102.mo5279(abstractActivityC3102.f5639.m32500().toString());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
        boolean z = this.f18605;
        AbstractActivityC3102 abstractActivityC3102 = this.f18606;
        if (z) {
            abstractActivityC3102.finish();
        } else {
            abstractActivityC3102.f5639.m32520(false);
        }
        ResultCallback resultCallback = this.f18607;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC3102 abstractActivityC3102 = this.f18606;
        abstractActivityC3102.m12259(exc, (DialogInterface.OnDismissListener) null);
        abstractActivityC3102.mo5272(exc);
        ResultCallback resultCallback = this.f18607;
        if (resultCallback != null) {
            resultCallback.onFailure(C19781.m44958(exc));
        }
    }
}
