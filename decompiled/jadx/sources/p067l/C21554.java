package p067l;

import android.text.Spanned;

/* JADX INFO: renamed from: l.᩶۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y91P */
/* JADX INFO: loaded from: classes4.dex */
public final class C21554 implements CharSequence, Spanned {

    /* JADX INFO: renamed from: ᩶ */
    public final int f67990;

    /* JADX INFO: renamed from: ᩸ */
    public final int f67991;

    /* JADX INFO: renamed from: ᩹ */
    public final Spanned f67992;

    public C21554(Spanned spanned, int i, int i2) {
        this.f67992 = spanned;
        this.f67990 = i;
        this.f67991 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f67991;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f67991) {
            throw new IndexOutOfBoundsException();
        }
        char cCharAt = this.f67992.charAt(this.f67990 + i);
        return Character.isLowerCase(cCharAt) ? Character.toUpperCase(cCharAt) : cCharAt;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > this.f67991 || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = this.f67990;
        return new C21554(this.f67992, i + i3, i3 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i = this.f67991;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = charAt(i2);
        }
        return new String(cArr);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        int i3 = this.f67990;
        return this.f67992.getSpans(i + i3, i3 + i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f67992.getSpanStart(obj) - this.f67990;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f67992.getSpanEnd(obj) - this.f67990;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f67992.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        int i3 = this.f67990;
        return this.f67992.nextSpanTransition(i + i3, i2 + i3, cls) - i3;
    }
}
