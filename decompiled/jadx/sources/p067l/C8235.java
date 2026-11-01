package p067l;

import android.os.Build;
import android.text.TextPaint;

/* JADX INFO: renamed from: l.ۛܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: MAME */
/* JADX INFO: loaded from: classes3.dex */
public final class C8235 implements InterfaceC12970 {

    /* JADX INFO: renamed from: ۧ */
    public static final ThreadLocal f21827 = new ThreadLocal();

    /* JADX INFO: renamed from: ֫ */
    public final TextPaint f21828;

    public C8235() {
        TextPaint textPaint = new TextPaint();
        this.f21828 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19010(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23 && i3 > i4) {
            return false;
        }
        ThreadLocal threadLocal = f21827;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        return C1738.m44384(this.f21828, sb.toString());
    }
}
