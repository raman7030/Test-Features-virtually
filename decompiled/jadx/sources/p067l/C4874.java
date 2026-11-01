package p067l;

/* JADX INFO: renamed from: l.ۖܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y74I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4874 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public char[] f11118 = new char[64];

    /* JADX INFO: renamed from: ᩹ */
    public int f11119;

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f11119;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0 && i < this.f11119) {
            return this.f11118[i];
        }
        StringBuilder sbM34408 = C15033.m34408(i, "index = ", ", length = ");
        sbM34408.append(this.f11119);
        throw new IndexOutOfBoundsException(sbM34408.toString());
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i >= 0 && i2 <= this.f11119 && i <= i2) {
            return new String(this.f11118, i, i2 - i);
        }
        StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
        sbM49005.append(this.f11119);
        throw new IndexOutOfBoundsException(sbM49005.toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f11118, 0, this.f11119);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10337(int i, int i2, int i3, String str) {
        int i4 = i2 - i;
        char[] cArr = this.f11118;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f11118 = new char[length];
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11118[i5] = C6215.m14069(str.charAt(i + i5), i3);
        }
        this.f11119 = i4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10338(int i, int i2, String str) {
        int i3 = i2 - i;
        int i4 = i3 + 2;
        char[] cArr = this.f11118;
        if (cArr.length < i4) {
            int length = cArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f11118 = new char[length];
        }
        char[] cArr2 = this.f11118;
        cArr2[0] = 'L';
        str.getChars(i, i2, cArr2, 1);
        this.f11118[i3 + 1] = ';';
        this.f11119 = i4;
    }
}
