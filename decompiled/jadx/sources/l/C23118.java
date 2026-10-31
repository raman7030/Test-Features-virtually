package l;

/* JADX INFO: renamed from: l.᩺ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23118 implements CharSequence {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f74360;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f74361;

    public C23118(int i, CharSequence charSequence) {
        this.f74361 = charSequence;
        this.f74360 = Math.min(charSequence.length(), i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f74360;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f74360;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("Index: ", i, i2, ", Length: "));
        }
        return this.f74361.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f74360;
        if (i >= 0 && i2 >= 0 && i <= i2 && i2 <= i3) {
            return this.f74361.subSequence(i, i2);
        }
        StringBuilder sbM46682 = C20361.m46682("start: ", i, ", end: ", ", length: ", i2);
        sbM46682.append(i3);
        throw new IndexOutOfBoundsException(sbM46682.toString());
    }
}
