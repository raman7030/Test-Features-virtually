package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 491A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9601 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8895 f29132;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29134;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3956 f29136 = new C3956();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f29135 = new StringBuilder();

    public C9601(C8895 c8895) {
        this.f29132 = c8895;
        this.f29133 = c8895.f27063.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C3956 c3956 = this.f29136;
        c3956.m11998("", "");
        StringBuilder sb = this.f29135;
        sb.setLength(0);
        int i = this.f29134;
        String strTrim = null;
        String strTrim2 = null;
        boolean z = false;
        while (true) {
            int i2 = this.f29133;
            if (i < i2) {
                char cCharAt = this.f29132.f27063.charAt(i);
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
                        this.f29134 = i + 1;
                        c3956.m11998(strTrim, strTrim2);
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
                c3956.m11998(strTrim, sb.toString().trim());
                this.f29134 = i2;
                break;
            }
        }
        return (TextUtils.isEmpty(c3956.m11997()) || TextUtils.isEmpty(c3956.m11999())) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3956 c3956 = this.f29136;
        String strM11997 = c3956.m11997();
        String strM11999 = c3956.m11999();
        if (TextUtils.isEmpty(strM11997) || TextUtils.isEmpty(strM11999)) {
            throw new NoSuchElementException();
        }
        return c3956;
    }
}
