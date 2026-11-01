package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: renamed from: l.֡ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I8YA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2500 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: ᩶ */
    public final C14610 f4035;

    /* JADX INFO: renamed from: ᩹ */
    public final Rect f4037 = AbstractC17252.m39040();

    /* JADX INFO: renamed from: ᩸ */
    public final Paint f4036 = AbstractC17252.m39039();

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    public C2500(C14610 c14610) {
        this.f4035 = c14610;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int iM21912 = C9417.m21912(i5, i3, 2, i3);
        Paint paint2 = this.f4036;
        paint2.set(paint);
        this.f4035.m33410(paint2);
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        int i8 = iM21912 - strokeWidth;
        int i9 = iM21912 + strokeWidth;
        Rect rect = this.f4037;
        rect.set(i, i8, width, i9);
        canvas.drawRect(rect, paint2);
    }
}
