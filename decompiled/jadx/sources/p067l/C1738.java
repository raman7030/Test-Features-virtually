package p067l;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ᩳ۬ */
/* JADX INFO: compiled from: T30P */
/* JADX INFO: loaded from: classes4.dex */
public final class C1738 {

    /* JADX INFO: renamed from: ֫ */
    public static final ThreadLocal f59480 = new ThreadLocal();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 >= r7) goto L24;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m44384(TextPaint textPaint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1668.m41403(textPaint, str);
        }
        int length = str.length();
        if (length != 1 || !Character.isWhitespace(str.charAt(0))) {
            float fMeasureText = textPaint.measureText("\udfffd");
            float fMeasureText2 = textPaint.measureText("m");
            float fMeasureText3 = textPaint.measureText(str);
            float fMeasureText4 = 0.0f;
            if (fMeasureText3 != 0.0f) {
                if (str.codePointCount(0, str.length()) > 1) {
                    if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                        int i = 0;
                        while (i < length) {
                            int iCharCount = Character.charCount(str.codePointAt(i)) + i;
                            fMeasureText4 += textPaint.measureText(str, i, iCharCount);
                            i = iCharCount;
                        }
                    }
                }
                if (fMeasureText3 == fMeasureText) {
                    ThreadLocal threadLocal = f59480;
                    C1349 c1349 = (C1349) threadLocal.get();
                    if (c1349 == null) {
                        c1349 = new C1349(new Rect(), new Rect());
                        threadLocal.set(c1349);
                    } else {
                        ((Rect) c1349.f33658).setEmpty();
                        ((Rect) c1349.f33659).setEmpty();
                    }
                    Object obj = c1349.f33659;
                    Rect rect = (Rect) c1349.f33658;
                    textPaint.getTextBounds("\udfffd", 0, 2, rect);
                    textPaint.getTextBounds(str, 0, length, (Rect) obj);
                    return !rect.equals(obj);
                }
            }
            return false;
        }
        return true;
    }
}
