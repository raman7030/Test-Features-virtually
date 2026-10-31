package l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.֫ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1864 extends DataSetObserver implements InterfaceC2570, InterfaceC15974 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f6355;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16680 f6356;

    public C1864(C16680 c16680) {
        this.f6356 = c16680;
    }

    @Override // l.InterfaceC2570
    public final void onPageScrolled(int i, float f, int i2) {
        if (f > 0.5f) {
            i++;
        }
        this.f6356.mo20806(f, false, i);
    }

    @Override // l.InterfaceC2570
    public final void onPageSelected(int i) {
        if (this.f6355 == 0) {
            C16680 c16680 = this.f6356;
            C0452 c0452 = c16680.f51201;
            c16680.m39209(c0452.f1989, c0452.f2007);
            float f = c16680.f51196;
            if (f < 0.0f) {
                f = 0.0f;
            }
            c16680.mo20806(f, true, c16680.f51201.f1989);
        }
    }

    @Override // l.InterfaceC2570
    public final void onPageScrollStateChanged(int i) {
        this.f6355 = i;
    }

    @Override // l.InterfaceC15974
    public final void onAdapterChanged(C0452 c0452, AbstractC12014 abstractC12014, AbstractC12014 abstractC12015) {
        this.f6356.m39210(abstractC12014, abstractC12015);
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C16680 c16680 = this.f6356;
        C0452 c0452 = c16680.f51201;
        c16680.m39209(c0452.f1989, c0452.f2007);
        float f = c16680.f51196;
        if (f < 0.0f) {
            f = 0.0f;
        }
        c16680.mo20806(f, true, c16680.f51201.f1989);
    }
}
