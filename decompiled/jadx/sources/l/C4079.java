package l;

/* JADX INFO: renamed from: l.ۘܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: TUG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4079 implements CharSequence {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f12999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f13000;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12274(char[] cArr) {
        this.f13000 = cArr;
        this.f12999 = null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13000.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f13000[i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f13000, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f12999 == null) {
            this.f12999 = new String(this.f13000);
        }
        return this.f12999;
    }
}
