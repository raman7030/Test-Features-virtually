package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C627 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3012 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f9483;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f9484;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f9485;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9170 f9486;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f9487;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12889 f9488;

    public C3012(AbstractC12889 abstractC12889, AbstractActivityC3346 abstractActivityC3346, String str, String str2, boolean z) {
        this.f9488 = abstractC12889;
        this.f9483 = abstractActivityC3346;
        this.f9484 = str;
        this.f9487 = str2;
        this.f9485 = z;
        this.f9486 = C9170.m23579(abstractActivityC3346);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f9483, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f9488.mo17649(this.f9484, this.f9487, this.f9485);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        if (this.f9486.m23581()) {
            this.f9488.mo17648();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f9486.m23581()) {
            this.f9483.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
