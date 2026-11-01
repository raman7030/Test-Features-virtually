package p067l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ᩴܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C1774 extends C1039 {

    /* JADX INFO: renamed from: ۖ */
    public C1388 f62527;

    public C1774(C1914 c1914, WindowInsets windowInsets) {
        super(c1914, windowInsets);
        this.f62527 = null;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ۢ */
    public boolean mo6180() {
        return this.f15416.isConsumed();
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ۧ */
    public C1914 mo6182() {
        return C1914.m51162(null, this.f15416.consumeStableInsets());
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ܽ */
    public C1914 mo6184() {
        return C1914.m51162(null, this.f15416.consumeSystemWindowInsets());
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ܳ */
    public final C1388 mo6183() {
        if (this.f62527 == null) {
            WindowInsets windowInsets = this.f15416;
            this.f62527 = C1388.m29403(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f62527;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public void mo4374(C1388 c1388) {
        this.f62527 = c1388;
    }
}
