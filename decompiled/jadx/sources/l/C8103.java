package l;

import android.os.Build;
import android.text.Spannable;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: l.۠ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes3.dex */
public final class C8103 implements Spannable {
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        throw null;
    }
}
