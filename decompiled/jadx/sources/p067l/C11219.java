package p067l;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: l.ۢۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86K0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11219 implements LineHeightSpan {

    /* JADX INFO: renamed from: ᩸ */
    public final int f31208;

    public C11219(int i) {
        this.f31208 = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(this);
        if (spanEnd == i2 || spanEnd == i2 - 1) {
            int i5 = fontMetricsInt.descent;
            int i6 = this.f31208;
            fontMetricsInt.descent = i5 + i6;
            fontMetricsInt.bottom += i6;
        }
    }
}
