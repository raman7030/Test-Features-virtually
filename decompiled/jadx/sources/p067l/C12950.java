package p067l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: renamed from: l.ۧܿ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: TB2A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12950 extends AbstractC23698 {

    /* JADX INFO: renamed from: ۗ */
    public TextPaint f36415;

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length == 1 && characterStyleArr[0] == this) {
                    if (paint2 instanceof TextPaint) {
                        textPaint = (TextPaint) paint2;
                    }
                } else {
                    TextPaint textPaint2 = this.f36415;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f36415 = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + m52711(), i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C8946.m20666().getClass();
        C4232 c4232M52710 = m52710();
        float f2 = i4;
        if (textPaint3 != null) {
            paint2 = textPaint3;
        }
        c4232M52710.m8598(canvas, f, f2, paint2);
    }
}
