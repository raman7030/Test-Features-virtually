package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֫ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4140 extends DataSetObserver implements InterfaceC4811, InterfaceC17550 {

    /* JADX INFO: renamed from: ᩸ */
    public int f9136;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C18221 f9137;

    public C4140(C18221 c18221) {
        this.f9137 = c18221;
    }

    @Override // p067l.InterfaceC4811
    public final void onPageScrolled(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f9137.mo22787(f, false, i);
    }

    @Override // p067l.InterfaceC4811
    public final void onPageSelected(int i) {
        if (this.f9136 == 0) {
            C18221 c18221 = this.f9137;
            C2798 c2798 = c18221.f54386;
            c18221.m41444(c2798.f4765, c2798.f4783);
            float f = c18221.f54381;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c18221.mo22787(f, true, c18221.f54386.f4765);
        }
    }

    @Override // p067l.InterfaceC4811
    public final void onPageScrollStateChanged(int i) {
        this.f9136 = i;
    }

    @Override // p067l.InterfaceC17550
    public final void onAdapterChanged(C2798 c2798, AbstractC13787 abstractC13787, AbstractC13787 abstractC13788) {
        this.f9137.m41445(abstractC13787, abstractC13788);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C18221 c18221 = this.f9137;
        C2798 c2798 = c18221.f54386;
        c18221.m41444(c2798.f4765, c2798.f4783);
        float f = c18221.f54381;
        if (f < 0.0f) {
            f = 0.0f;
        }
        c18221.mo22787(f, true, c18221.f54386.f4765);
    }
}
