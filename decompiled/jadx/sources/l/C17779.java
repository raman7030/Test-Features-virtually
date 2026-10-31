package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.ᩳۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N90X */
/* JADX INFO: loaded from: classes4.dex */
public final class C17779 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12881 f54389;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f54391 = AbstractC15661.m36874();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f54390 = AbstractC15661.m36873();

    public C17779(C12881 c12881) {
        this.f54389 = c12881;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.f54389.m31314();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iM31319 = this.f54389.m31319();
        Paint paint2 = this.f54390;
        paint2.set(paint);
        int iM19071 = AbstractC7070.m19071(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iM19071);
        int i8 = i2 * iM31319;
        int i9 = i + i8;
        int i10 = i8 + i9;
        int iMin = Math.min(i9, i10);
        int iMax = Math.max(i9, i10);
        Rect rect = this.f54391;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }
}
