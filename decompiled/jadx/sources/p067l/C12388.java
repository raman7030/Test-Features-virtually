package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes4.dex */
public final class C12388 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public List f34614;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ AbstractC18422 f34615;

    /* JADX INFO: renamed from: ܳ */
    public boolean f34616;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C18107 f34617;

    /* JADX INFO: renamed from: ᩻ */
    public C12744 f34618;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
    }

    public C12388(C18107 c18107, AbstractC18422 abstractC18422) {
        this.f34617 = c18107;
        this.f34615 = abstractC18422;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        if (this.f34615.f55057) {
            this.f34618 = this.f34617.m41218(false, (Runnable) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractC18422 abstractC18422 = this.f34615;
        abstractC18422.mo16732(false);
        List listMo8209 = abstractC18422.mo8209();
        this.f34614 = listMo8209;
        abstractC18422.f55057 = false;
        C18107 c18107 = this.f34617;
        C9486.m22096(c18107, listMo8209);
        this.f34616 = c18107.f54078 || C18107.m41198(this.f34614, c18107.f54079);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C12744 c12744 = this.f34618;
        C18107 c18107 = this.f34617;
        if (!(c12744 == null && c18107.m41266()) && c18107.f54077 == this.f34615 && this.f34616) {
            c18107.m41187(this.f34614, true);
            c18107.f54068.m31983();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C12744 c12744 = this.f34618;
        if (c12744 != null) {
            c12744.m29269();
        }
    }
}
