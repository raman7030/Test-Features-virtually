package l;

import android.text.Spanned;

/* JADX INFO: renamed from: l.᩶۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes4.dex */
public final class C20187 implements CharSequence, Spanned {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f65342;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65343;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Spanned f65344;

    public C20187(Spanned spanned, int i, int i2) {
        this.f65344 = spanned;
        this.f65342 = i;
        this.f65343 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f65343;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f65343) {
            throw new IndexOutOfBoundsException();
        }
        char cCharAt = this.f65344.charAt(this.f65342 + i);
        return Character.isLowerCase(cCharAt) ? Character.toUpperCase(cCharAt) : cCharAt;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > this.f65343 || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f65342;
        return new C20187(this.f65344, i + i3, i3 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f65343;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = charAt(i2);
        }
        return new String(cArr);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        int i3 = this.f65342;
        return this.f65344.getSpans(i + i3, i3 + i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f65344.getSpanStart(obj) - this.f65342;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f65344.getSpanEnd(obj) - this.f65342;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f65344.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        int i3 = this.f65342;
        return this.f65344.nextSpanTransition(i + i3, i2 + i3, cls) - i3;
    }
}
