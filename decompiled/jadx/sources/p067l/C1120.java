package p067l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۚ᩸ */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes3.dex */
public class C1120 extends AbstractC1216 {
    public C1120(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1120(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p067l.AbstractC1216, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m22204();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m22204();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m22204();
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ۧ */
    public final void mo17838() {
        C1680 c1680 = (C1680) getLayoutParams();
        c1680.f55082.m37928(0);
        c1680.f55082.m37891(0);
    }
}
