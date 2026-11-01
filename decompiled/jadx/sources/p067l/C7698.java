package p067l;

import bin.p000mt.plugin.api.util.ResultCallback;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7698 extends AbstractC9542 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ C11084 f20198;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C14146 f20199;

    /* JADX INFO: renamed from: ۘ */
    public final /* synthetic */ C14146 f20200;

    /* JADX INFO: renamed from: ۜ */
    public C6867 f20201;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ ActivityC4030 f20202;

    /* JADX INFO: renamed from: ۢ */
    public C16434 f20203;

    /* JADX INFO: renamed from: ܳ */
    public boolean f20204 = true;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ ResultCallback f20205;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean f20206;

    /* JADX INFO: renamed from: ᩵ */
    public final /* synthetic */ boolean f20207;

    /* JADX INFO: renamed from: ᩷ */
    public C16434 f20208;

    /* JADX INFO: renamed from: ᩻ */
    public C6867 f20209;

    public C7698(ActivityC4030 activityC4030, boolean z, C14146 c14146, boolean z2, C14146 c14147, C11084 c11084, ResultCallback resultCallback) {
        this.f20202 = activityC4030;
        this.f20206 = z;
        this.f20199 = c14146;
        this.f20207 = z2;
        this.f20200 = c14147;
        this.f20198 = c11084;
        this.f20205 = resultCallback;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        boolean z = this.f20206;
        ActivityC4030 activityC4030 = this.f20202;
        if (z && activityC4030.f8833 != null) {
            this.f20209 = new C6867(activityC4030.f8843.f43813);
            C14146 c14146 = this.f20199;
            this.f20208 = C16434.m37345(c14146.m32500(), c14146.m32595(), activityC4030.f8833);
        }
        if (this.f20207 && activityC4030.f8841 != null) {
            this.f20204 = false;
            this.f20201 = new C6867(activityC4030.f8828.f43813);
            C14146 c14147 = this.f20200;
            this.f20203 = C16434.m37345(c14147.m32500(), c14147.m32595(), activityC4030.f8841);
        }
        m22243(activityC4030, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C16434 c16434 = this.f20208;
        try {
            C16434 c16435 = this.f20203;
            C11084 c11084 = this.f20198;
            if (c16434 != null) {
                try {
                    this.f20204 = true;
                    c16434.m37350(this.f20209);
                    C7050.m16212(new RunnableC21110(0, c11084, this.f20199));
                } catch (Throwable th) {
                    if (c16435 != null) {
                        try {
                            c16435.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (c16435 != null) {
                this.f20204 = false;
                c16435.m37350(this.f20201);
                C7050.m16212(new RunnableC3003(0, c11084, this.f20200));
            }
            if (c16435 != null) {
                c16435.close();
            }
            if (c16434 != null) {
                c16434.close();
            }
        } catch (Throwable th3) {
            if (c16434 != null) {
                try {
                    c16434.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f20198.m25532()) {
            C22682.m50793(R.string.MT_Protector);
        }
        ResultCallback resultCallback = this.f20205;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f20198.m25532()) {
            C14146 c14146 = this.f20204 ? this.f20199 : this.f20200;
            if (exc instanceof C6496) {
                c14146.m32436(((C6496) exc).m14914() - 1);
            } else if (exc instanceof C3870) {
                int iM40851 = ((C3870) exc).m7629().m40851();
                if (iM40851 != -1) {
                    c14146.m32436(iM40851 - 1);
                }
            } else if (exc instanceof C16299) {
                C16299 c16299 = (C16299) exc;
                C20699.m46760(c16299.f47904, c16299.f47908).m46768(c14146);
            } else if (exc instanceof C5962) {
                ((C5962) exc).m13373(c14146);
            }
        }
        ResultCallback resultCallback = this.f20205;
        if (resultCallback != null) {
            resultCallback.onFailure(C19781.m44958(exc));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C16434 c16434 = this.f20208;
        if (c16434 != null) {
            c16434.close();
        }
        C16434 c16435 = this.f20203;
        if (c16435 != null) {
            c16435.close();
        }
        m22249();
    }
}
