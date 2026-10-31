package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C11584 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f34535;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f34536;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f34537;

    static {
        ApplicationC12518.m30701(93);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public native void mo1006();

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C11584(C22372 c22372, ActivityC16315 activityC16315, ResultCallback resultCallback) {
        this.f34536 = c22372;
        this.f34537 = activityC16315;
        this.f34535 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f34537, this.f34536.m50173() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f34536.m50144(exc, this.f34537);
        ResultCallback resultCallback = this.f34535;
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
