package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܳۛܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15999 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractActivityC5549 f46339;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C18107 f46340;

    /* JADX INFO: renamed from: ܳ */
    public C17117 f46341;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC17043 f46342;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC17043 f46343;

    public C15999(Main main, AbstractC17043 abstractC17043, C18107 c18107) {
        this.f46339 = main;
        this.f46342 = abstractC17043;
        this.f46340 = c18107;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f46339, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C14281 c14281;
        AbstractC17043 abstractC17043 = this.f46342;
        AbstractC17043 abstractC17043M38682 = abstractC17043.m38682("resources.arsc");
        if (abstractC17043M38682.mo25094()) {
            try {
                c14281 = new C14281(abstractC17043M38682);
            } catch (Exception unused) {
                c14281 = null;
            }
        } else {
            c14281 = null;
        }
        if (c14281 == null) {
            c14281 = new C14281();
        }
        this.f46341 = C17117.m38746(C16820.m38138(abstractC17043.m38664()).m38154(), c14281, false);
        this.f46343 = this.f46340.m41219(abstractC17043.m38675() + ".png", false).m38650(true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        new C18682(this, this.f46339, this.f46341.getIntrinsicWidth(), this.f46341.getIntrinsicHeight());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f46339.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
