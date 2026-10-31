package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5006 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15772;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC0772 f15773;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f15774;

    public C5006(AbstractActivityC0772 abstractActivityC0772, boolean z, ResultCallback resultCallback) {
        this.f15773 = abstractActivityC0772;
        this.f15772 = z;
        this.f15774 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f15773, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        AbstractActivityC0772 abstractActivityC0772 = this.f15773;
        abstractActivityC0772.mo2950(abstractActivityC0772.f2867.m30436().toString());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector);
        boolean z = this.f15772;
        AbstractActivityC0772 abstractActivityC0772 = this.f15773;
        if (z) {
            abstractActivityC0772.finish();
        } else {
            abstractActivityC0772.f2867.m30456(false);
        }
        ResultCallback resultCallback = this.f15774;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC0772 abstractActivityC0772 = this.f15773;
        abstractActivityC0772.m10223(exc, (DialogInterface.OnDismissListener) null);
        abstractActivityC0772.mo2943(exc);
        ResultCallback resultCallback = this.f15774;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }
}
