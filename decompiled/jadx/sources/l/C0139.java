package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.֡ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0139 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12881 f1260;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f1262 = AbstractC15661.m36874();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Paint f1261 = AbstractC15661.m36873();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C0139(C12881 c12881) {
        this.f1260 = c12881;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int iM19938 = C7416.m19938(i5, i3, 2, i3);
        Paint paint2 = this.f1261;
        paint2.set(paint);
        this.f1260.m31324(paint2);
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i8 = iM19938 - strokeWidth;
        int i9 = iM19938 + strokeWidth;
        Rect rect = this.f1262;
        rect.set(i, i8, width, i9);
        canvas.drawRect(rect, paint2);
    }
}
