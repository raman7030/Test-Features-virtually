package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4478 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C3136 f10054;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f10055;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ResultCallback f10056;

    public C4478(ActivityC18686 activityC18686, C3136 c3136, ResultCallback resultCallback) {
        this.f10055 = activityC18686;
        this.f10054 = c3136;
        this.f10056 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f10055, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f10054.mo5357();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f10055.m42592();
        C22682.m50793(R.string.MT_Protector);
        ResultCallback resultCallback = this.f10056;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f10054.mo5356(exc) != null) {
            this.f10055.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f10056;
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
