package p067l;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۚܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1109 extends C0864 {

    /* JADX INFO: renamed from: ֡ */
    public static final C1914 f19574 = C1914.m51162(null, WindowInsets.CONSUMED);

    @Override // p067l.C1039, p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public final void mo6175(View view) {
    }

    public C1109(C1914 c1914, WindowInsets windowInsets) {
        super(c1914, windowInsets);
    }

    @Override // p067l.C1039, p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public C1388 mo6173(int i) {
        return C1388.m29404(this.f15416.getInsets(C1599.m38430(i)));
    }

    @Override // p067l.C1039, p067l.C0899
    /* JADX INFO: renamed from: ۧ */
    public C1388 mo6181(int i) {
        return C1388.m29404(this.f15416.getInsetsIgnoringVisibility(C1599.m38430(i)));
    }

    @Override // p067l.C1039, p067l.C0899
    /* JADX INFO: renamed from: ܽ */
    public boolean mo6185(int i) {
        return this.f15416.isVisible(C1599.m38430(i));
    }
}
