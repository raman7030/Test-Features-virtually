package p067l;

/* JADX INFO: renamed from: l.ܿ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1LQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19165 implements CharSequence {

    /* JADX INFO: renamed from: ۙ */
    public final int f57260;

    /* JADX INFO: renamed from: ᩶ */
    public final int f57261;

    /* JADX INFO: renamed from: ᩸ */
    public transient int f57262;

    /* JADX INFO: renamed from: ᩹ */
    public final CharSequence f57263;

    public C19165(int i, int i2, CharSequence charSequence) {
        if (i < 0 || i2 > charSequence.length() || i > i2) {
            throw new IndexOutOfBoundsException("chars sequence.length:" + charSequence.length() + ", start:" + i + ", end:" + i2);
        }
        this.f57263 = charSequence;
        this.f57260 = i;
        this.f57261 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f57261 - this.f57260;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f57263.charAt(i + this.f57260);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f57260;
        return (i == i3 && i2 == this.f57261) ? this : new C19165(i + i3, i3 + i2, this.f57263);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        CharSequence charSequence = this.f57263;
        boolean z = charSequence instanceof String;
        int i = this.f57261;
        int i2 = this.f57260;
        if (z) {
            return ((String) charSequence).substring(i2, i);
        }
        int i3 = i - i2;
        char[] cArr = new char[i3];
        C3395.m5938(charSequence, cArr, i2, i3);
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43642(char[] cArr, int i, int i2) {
        C3395.m5938(this.f57263, cArr, this.f57260 + i, i2 - i);
    }

    public final int hashCode() {
        int i = this.f57262;
        if (i != 0) {
            return i;
        }
        int iM29889 = C13061.m29889(0, length(), this);
        this.f57262 = iM29889;
        return iM29889;
    }
}
