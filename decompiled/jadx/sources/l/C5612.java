package l;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes3.dex */
public class C5612 extends AbstractC7539 {
    public C5612(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C5612(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC7539, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m20228();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m20228();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m20228();
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo15917() {
        C16900 c16900 = (C16900) getLayoutParams();
        c16900.f51902.m35770(0);
        c16900.f51902.m35733(0);
    }
}
