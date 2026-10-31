package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14342 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f43248;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f43249;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15518 f43250;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f43251;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f43252;

    public C14342(Main main, AbstractC15440 abstractC15440, C16560 c16560) {
        this.f43248 = main;
        this.f43251 = abstractC15440;
        this.f43249 = c16560;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f43248, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C12534 c12534;
        AbstractC15440 abstractC15440 = this.f43251;
        AbstractC15440 abstractC15440M36524 = abstractC15440.m36524("resources.arsc");
        if (abstractC15440M36524.mo23120()) {
            try {
                c12534 = new C12534(abstractC15440M36524);
            } catch (Exception unused) {
                c12534 = null;
            }
        } else {
            c12534 = null;
        }
        if (c12534 == null) {
            c12534 = new C12534();
        }
        this.f43250 = C15518.m36587(C15206.m35978(abstractC15440.m36506()).m35994(), c12534, false);
        this.f43252 = this.f43249.m38993(abstractC15440.m36517() + ".png", false).m36492(true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        new C17165(this, this.f43248, this.f43250.getIntrinsicWidth(), this.f43250.getIntrinsicHeight());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f43248.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
