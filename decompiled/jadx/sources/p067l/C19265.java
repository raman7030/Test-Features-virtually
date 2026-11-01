package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ᩳۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N90X */
/* JADX INFO: loaded from: classes4.dex */
public final class C19265 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final C14610 f57583;

    /* JADX INFO: renamed from: ᩹ */
    public final Rect f57585 = AbstractC17252.m39040();

    /* JADX INFO: renamed from: ᩸ */
    public final Paint f57584 = AbstractC17252.m39039();

    public C19265(C14610 c14610) {
        this.f57583 = c14610;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f57583.m33400();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iM33405 = this.f57583.m33405();
        Paint paint2 = this.f57584;
        paint2.set(paint);
        int iM21029 = AbstractC9088.m21029(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iM21029);
        int i8 = i2 * iM33405;
        int i9 = i + i8;
        int i10 = i8 + i9;
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        Rect rect = this.f57585;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }
}
