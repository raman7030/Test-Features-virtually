package p067l;

import android.content.DialogInterface;
import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23785 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C14397 f75642;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ ActivityC18686 f75643;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ResultCallback f75644;

    public C23785(ActivityC18686 activityC18686, C14397 c14397, ResultCallback resultCallback) {
        this.f75643 = activityC18686;
        this.f75642 = c14397;
        this.f75644 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f75643, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f75642.mo5357();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f75643.m42592();
        C22682.m50793(R.string.MT_Protector);
        ResultCallback resultCallback = this.f75644;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f75642.mo5356(exc) != null) {
            this.f75643.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f75644;
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
