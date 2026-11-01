package p067l;

/* JADX INFO: renamed from: l.ۘܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6245 implements CharSequence {

    /* JADX INFO: renamed from: ᩸ */
    public String f15814;

    /* JADX INFO: renamed from: ᩹ */
    public char[] f15815;

    /* JADX INFO: renamed from: ֫ */
    public final void m14179(char[] cArr) {
        this.f15815 = cArr;
        this.f15814 = null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f15815.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f15815[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f15815, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f15814 == null) {
            this.f15814 = new String(this.f15815);
        }
        return this.f15814;
    }
}
