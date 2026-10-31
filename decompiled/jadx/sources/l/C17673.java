package l;

/* JADX INFO: renamed from: l.ܿ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17673 implements CharSequence {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f54067;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f54068;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient int f54069;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f54070;

    public C17673(int i, int i2, CharSequence charSequence) {
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            throw new IndexOutOfBoundsException("chars sequence.length:" + charSequence.length() + ", start:" + i + ", end:" + i2);
        }
        this.f54070 = charSequence;
        this.f54067 = i;
        this.f54068 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f54068 - this.f54067;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f54070.charAt(i + this.f54067);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f54067;
        return (i == i3 && i2 == this.f54068) ? this : new C17673(i + i3, i3 + i2, this.f54070);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f54070;
        boolean z = charSequence instanceof String;
        int i = this.f54068;
        int i2 = this.f54067;
        if (z) {
            return ((String) charSequence).substring(i2, i);
        }
        int i3 = i - i2;
        char[] cArr = new char[i3];
        C1080.m3667(charSequence, cArr, i2, i3);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41396(char[] cArr, int i, int i2) {
        C1080.m3667(this.f54070, cArr, this.f54067 + i, i2 - i);
    }

    public final int hashCode() {
        int i = this.f54069;
        if (i != 0) {
            return i;
        }
        int iM27827 = C11250.m27827(0, length(), this);
        this.f54069 = iM27827;
        return iM27827;
    }
}
