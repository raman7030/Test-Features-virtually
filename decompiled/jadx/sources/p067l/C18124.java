package p067l;

/* JADX INFO: renamed from: l.ܽۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18124 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public final int f54148;

    /* JADX INFO: renamed from: ᩹ */
    public final CharSequence[] f54149;

    public C18124(CharSequence... charSequenceArr) {
        this.f54149 = charSequenceArr;
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            long length = ((long) i) + ((long) charSequence.length());
            i = (int) length;
            if (length != i) {
                throw new ArithmeticException();
            }
        }
        this.f54148 = i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f54148;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= this.f54148) {
            throw new IndexOutOfBoundsException();
        }
        for (CharSequence charSequence : this.f54149) {
            if (i < charSequence.length()) {
                return charSequence.charAt(i);
            }
            i -= charSequence.length();
        }
        throw new AssertionError();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C14847(i, i2, this);
    }
}
