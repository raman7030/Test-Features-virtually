package l;

import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: T30P */
/* JADX INFO: loaded from: classes4.dex */
public final class C18062 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f56275 = new ThreadLocal();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 >= r7) goto L24;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m42132(TextPaint textPaint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C16650.m39174(textPaint, str);
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
                    ThreadLocal threadLocal = f56275;
                    C10220 c10220 = (C10220) threadLocal.get();
                    if (c10220 == null) {
                        c10220 = new C10220(new Rect(), new Rect());
                        threadLocal.set(c10220);
                    } else {
                        ((Rect) c10220.f30697).setEmpty();
                        ((Rect) c10220.f30698).setEmpty();
                    }
                    Object obj = c10220.f30698;
                    Rect rect = (Rect) c10220.f30697;
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
