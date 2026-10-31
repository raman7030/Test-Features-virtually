package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11687 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f34838;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f34839;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6603 f34840;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f34841;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f34842;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13409 f34843;

    public C11687(C12392 c12392, AbstractActivityC3346 abstractActivityC3346, InterfaceC6603 interfaceC6603) {
        this.f34839 = c12392;
        this.f34842 = abstractActivityC3346;
        this.f34840 = interfaceC6603;
        this.f34838 = C9170.m23578(c12392);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f34841 = this.f34839.m30436().mo26562();
        AbstractActivityC3346 abstractActivityC3346 = this.f34842;
        if (abstractActivityC3346 != null) {
            m20267(abstractActivityC3346, R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C12392 c12392 = this.f34839;
        C7744 c7744 = this.f34841;
        try {
            C19012 c19012 = new C19012(C7850.toPath(c12392.getContext().getCacheDir()).resolve("format-output"), C6417.m17744());
            try {
                this.f34840.mo18106(c7744, c19012);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f34843 = c19012.finish();
                c19012.close();
                if (c7744 != null) {
                    c7744.close();
                }
            } catch (Throwable th) {
                try {
                    c19012.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c7744 != null) {
                try {
                    c7744.close();
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
        if (this.f34838.m23581()) {
            C22975.m51115(this.f34839, this.f34843);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346;
        if (this.f34838.m23581() && (abstractActivityC3346 = this.f34842) != null) {
            abstractActivityC3346.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        try {
            C13409 c13409 = this.f34843;
            if (c13409 != null) {
                c13409.close();
            }
        } finally {
            C7744 c7744 = this.f34841;
            if (c7744 != null) {
                c7744.close();
            }
            m20273();
        }
    }
}
