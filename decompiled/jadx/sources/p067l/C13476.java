package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13476 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f37837;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C14146 f37838;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ InterfaceC8644 f37839;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f37840;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractActivityC5549 f37841;

    /* JADX INFO: renamed from: ᩻ */
    public C15113 f37842;

    public C13476(C14146 c14146, AbstractActivityC5549 abstractActivityC5549, InterfaceC8644 interfaceC8644) {
        this.f37838 = c14146;
        this.f37841 = abstractActivityC5549;
        this.f37839 = interfaceC8644;
        this.f37837 = C11084.m25529(c14146);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f37840 = this.f37838.m32500().mo28595();
        AbstractActivityC5549 abstractActivityC5549 = this.f37841;
        if (abstractActivityC5549 != null) {
            m22243(abstractActivityC5549, R.string.MT_Protector);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14146 c14146 = this.f37838;
        C9729 c9729 = this.f37840;
        try {
            C20438 c20438 = new C20438(C9829.toPath(c14146.getContext().getCacheDir()).resolve("format-output"), C8467.m19691());
            try {
                this.f37839.mo20058(c9729, c20438);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f37842 = c20438.finish();
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
        if (this.f37837.m25532()) {
            C24204.m53507(this.f37838, this.f37842);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC5549 abstractActivityC5549;
        if (this.f37837.m25532() && (abstractActivityC5549 = this.f37841) != null) {
            abstractActivityC5549.m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        try {
            C15113 c15113 = this.f37842;
            if (c15113 != null) {
                c15113.close();
            }
        } finally {
            C9729 c9729 = this.f37840;
            if (c9729 != null) {
                c9729.close();
            }
            m22249();
        }
    }
}
