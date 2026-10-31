package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2220 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0808 f7266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f7267;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f7268;

    public C2220(ActivityC17169 activityC17169, C0808 c0808, ResultCallback resultCallback) {
        this.f7267 = activityC17169;
        this.f7266 = c0808;
        this.f7268 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f7267, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f7266.mo3044();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f7267.m40347();
        C21374.m48457(R.string.MT_Protector);
        ResultCallback resultCallback = this.f7268;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f7266.mo3043(exc) != null) {
            this.f7267.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f7268;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
