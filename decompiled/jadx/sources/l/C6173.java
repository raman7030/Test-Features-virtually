package l;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۛܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MAME */
/* JADX INFO: loaded from: classes3.dex */
public final class C6173 implements InterfaceC11155 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f18968 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TextPaint f18969;

    public C6173() {
        TextPaint textPaint = new TextPaint();
        this.f18969 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17078(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        ThreadLocal threadLocal = f18968;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return C18062.m42132(this.f18969, sb.toString());
    }
}
