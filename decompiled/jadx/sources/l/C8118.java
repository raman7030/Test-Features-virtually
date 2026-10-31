package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.۠ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8118 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15172 f25081;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f25082;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f25083;

    public C8118(C15172 c15172, int i, int i2) {
        this.f25081 = c15172;
        this.f25083 = i;
        this.f25082 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C15172.m35876(this.f25081);
        return this.f25082 - this.f25083;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid diff text index");
        }
        return this.f25081.f46351.charAt(this.f25083 + i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        C15172.m35875(i, i2, length());
        int i3 = this.f25083;
        return new C8118(this.f25081, i + i3, i3 + i2);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C15172.m35875(i, i2, length());
        if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
            throw new IndexOutOfBoundsException("Invalid diff text destination");
        }
        C15172 c15172 = this.f25081;
        CharSequence charSequence = c15172.f46351;
        boolean z = charSequence instanceof GetChars;
        int i4 = this.f25083;
        if (z) {
            ((GetChars) charSequence).getChars(i + i4, i4 + i2, cArr, i3);
            return;
        }
        while (i < i2) {
            cArr[i3] = c15172.f46351.charAt(i4 + i);
            i++;
            i3++;
        }
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int length = length();
        char[] cArr = new char[length];
        getChars(0, length, cArr, 0);
        return new String(cArr);
    }
}
