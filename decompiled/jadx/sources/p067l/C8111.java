package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۛۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8111 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f21386;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C14146 f21387;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ InterfaceC18702 f21388;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f21389;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f21390;

    /* JADX INFO: renamed from: ᩻ */
    public C15113 f21391;

    public C8111(C14146 c14146, AbstractActivityC5549 abstractActivityC5549, InterfaceC18702 interfaceC18702) {
        this.f21387 = c14146;
        this.f21390 = abstractActivityC5549;
        this.f21388 = interfaceC18702;
        this.f21386 = C11084.m25529(c14146);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f21389 = this.f21387.m32500().mo28595();
        AbstractActivityC5549 abstractActivityC5549 = this.f21390;
        if (abstractActivityC5549 != null) {
            m22243(abstractActivityC5549, R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14146 c14146 = this.f21387;
        C9729 c9729 = this.f21389;
        try {
            C20438 c20438 = new C20438(C9829.toPath(c14146.getContext().getCacheDir()).resolve("format-output"), C8467.m19691());
            try {
                this.f21388.mo42670(c14146, c9729, c20438);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f21391 = c20438.finish();
                c20438.close();
                if (c9729 != null) {
                    c9729.close();
                }
            } catch (Throwable th) {
                try {
                    c20438.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c9729 != null) {
                try {
                    c9729.close();
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
        if (this.f21386.m25532()) {
            C24204.m53507(this.f21387, this.f21391);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f21386.m25532()) {
            if (this.f21388 == InterfaceC18702.f55866 && (exc instanceof C16299)) {
                C16299 c16299 = (C16299) exc;
                C20699.m46760(c16299.f47904, c16299.f47908).m46768(this.f21387);
            }
            AbstractActivityC5549 abstractActivityC5549 = this.f21390;
            if (abstractActivityC5549 != null) {
                abstractActivityC5549.m12259(exc, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        try {
            C15113 c15113 = this.f21391;
            if (c15113 != null) {
                c15113.close();
            }
        } finally {
            C9729 c9729 = this.f21389;
            if (c9729 != null) {
                c9729.close();
            }
            m22249();
        }
    }
}
