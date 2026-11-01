package p067l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes3.dex */
public final class C11493 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C10822 f32079;

    /* JADX INFO: renamed from: ۙ */
    public final int f32080;

    /* JADX INFO: renamed from: ᩶ */
    public int f32081;

    /* JADX INFO: renamed from: ᩹ */
    public final C6128 f32083 = new C6128();

    /* JADX INFO: renamed from: ᩸ */
    public final StringBuilder f32082 = new StringBuilder();

    public C11493(C10822 c10822) {
        this.f32079 = c10822;
        this.f32080 = c10822.f29987.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6128 c6128 = this.f32083;
        c6128.m13919("", "");
        StringBuilder sb = this.f32082;
        sb.setLength(0);
        int i = this.f32081;
        String strTrim = null;
        String strTrim2 = null;
        boolean z = false;
        while (true) {
            int i2 = this.f32080;
            if (i < i2) {
                char cCharAt = this.f32079.f29987.charAt(i);
                if (strTrim == null) {
                    if (':' == cCharAt) {
                        if (sb.length() > 0) {
                            strTrim = sb.toString().trim();
                        }
                        sb.setLength(0);
                    } else if (';' == cCharAt) {
                        sb.setLength(0);
                    } else if (Character.isWhitespace(cCharAt)) {
                        if (sb.length() > 0) {
                            z = true;
                        }
                    } else if (z) {
                        sb.setLength(0);
                        sb.append(cCharAt);
                        z = false;
                    } else {
                        sb.append(cCharAt);
                    }
                } else if (strTrim2 != null) {
                    continue;
                } else if (Character.isWhitespace(cCharAt)) {
                    if (sb.length() > 0) {
                        sb.append(cCharAt);
                    }
                } else if (';' == cCharAt) {
                    strTrim2 = sb.toString().trim();
                    sb.setLength(0);
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        this.f32081 = i + 1;
                        c6128.m13919(strTrim, strTrim2);
                        break;
                    }
                } else {
                    sb.append(cCharAt);
                }
                i++;
            } else {
                if (strTrim == null || sb.length() <= 0) {
                    break;
                    break;
                }
                c6128.m13919(strTrim, sb.toString().trim());
                this.f32081 = i2;
                break;
            }
        }
        return (TextUtils.isEmpty(c6128.m13918()) || TextUtils.isEmpty(c6128.m13920())) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C6128 c6128 = this.f32083;
        String strM13918 = c6128.m13918();
        String strM13920 = c6128.m13920();
        if (TextUtils.isEmpty(strM13918) || TextUtils.isEmpty(strM13920)) {
            throw new NoSuchElementException();
        }
        return c6128;
    }
}
