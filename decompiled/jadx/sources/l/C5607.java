package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5607 extends AbstractC7548 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9170 f17354;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f17355;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f17356;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4733 f17357;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f17358;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C14799 f17359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f17360 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f17361;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17362;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f17363;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14799 f17364;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C4733 f17365;

    public C5607(ActivityC1748 activityC1748, boolean z, C12392 c12392, boolean z2, C12392 c12393, C9170 c9170, ResultCallback resultCallback) {
        this.f17358 = activityC1748;
        this.f17362 = z;
        this.f17355 = c12392;
        this.f17363 = z2;
        this.f17356 = c12393;
        this.f17354 = c9170;
        this.f17361 = resultCallback;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        boolean z = this.f17362;
        ActivityC1748 activityC1748 = this.f17358;
        if (z && activityC1748.f6057 != null) {
            this.f17365 = new C4733(activityC1748.f6067.f40732);
            C12392 c12392 = this.f17355;
            this.f17364 = C14799.m35198(c12392.m30436(), c12392.m30531(), activityC1748.f6057);
        }
        if (this.f17363 && activityC1748.f6065 != null) {
            this.f17360 = false;
            this.f17357 = new C4733(activityC1748.f6052.f40732);
            C12392 c12393 = this.f17356;
            this.f17359 = C14799.m35198(c12393.m30436(), c12393.m30531(), activityC1748.f6065);
        }
        m20267(activityC1748, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C14799 c14799 = this.f17364;
        try {
            C14799 c147910 = this.f17359;
            C9170 c9170 = this.f17354;
            if (c14799 != null) {
                try {
                    this.f17360 = true;
                    c14799.m35203(this.f17365);
                    C4925.m14315(new RunnableC19719(0, c9170, this.f17355));
                } catch (Throwable th) {
                    if (c147910 != null) {
                        try {
                            c147910.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (c147910 != null) {
                this.f17360 = false;
                c147910.m35203(this.f17357);
                C4925.m14315(new RunnableC0667(0, c9170, this.f17356));
            }
            if (c147910 != null) {
                c147910.close();
            }
            if (c14799 != null) {
                c14799.close();
            }
        } catch (Throwable th3) {
            if (c14799 != null) {
                try {
                    c14799.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f17354.m23581()) {
            C21374.m48457(R.string.MT_Protector);
        }
        ResultCallback resultCallback = this.f17361;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f17354.m23581()) {
            C12392 c12392 = this.f17360 ? this.f17355 : this.f17356;
            if (exc instanceof C4343) {
                c12392.m30372(((C4343) exc).m13050() - 1);
            } else if (exc instanceof C1580) {
                int iM38634 = ((C1580) exc).m5400().m38634();
                if (iM38634 != -1) {
                    c12392.m30372(iM38634 - 1);
                }
            } else if (exc instanceof C14658) {
                C14658 c14658 = (C14658) exc;
                C19287.m44466(c14658.f44794, c14658.f44798).m44474(c12392);
            } else if (exc instanceof C3781) {
                ((C3781) exc).m11437(c12392);
            }
        }
        ResultCallback resultCallback = this.f17361;
        if (resultCallback != null) {
            resultCallback.onFailure(C18321.m42696(exc));
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C14799 c14799 = this.f17364;
        if (c14799 != null) {
            c14799.close();
        }
        C14799 c147910 = this.f17359;
        if (c147910 != null) {
            c147910.close();
        }
        m20273();
    }
}
