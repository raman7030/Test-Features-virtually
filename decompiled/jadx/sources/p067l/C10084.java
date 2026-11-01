package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.۠ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10084 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16788 f27990;

    /* JADX INFO: renamed from: ᩸ */
    public final int f27991;

    /* JADX INFO: renamed from: ᩹ */
    public final int f27992;

    public C10084(C16788 c16788, int i, int i2) {
        this.f27990 = c16788;
        this.f27992 = i;
        this.f27991 = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        C16788.m38034(this.f27990);
        return this.f27991 - this.f27992;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0 || i >= length()) {
            throw new IndexOutOfBoundsException("Invalid diff text index");
        }
        return this.f27990.f49469.charAt(this.f27992 + i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        C16788.m38033(i, i2, length());
        int i3 = this.f27992;
        return new C10084(this.f27990, i + i3, i3 + i2);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        C16788.m38033(i, i2, length());
        if (i3 < 0 || i3 > cArr.length - (i2 - i)) {
            throw new IndexOutOfBoundsException("Invalid diff text destination");
        }
        C16788 c16788 = this.f27990;
        CharSequence charSequence = c16788.f49469;
        boolean z = charSequence instanceof GetChars;
        int i4 = this.f27992;
        if (z) {
            ((GetChars) charSequence).getChars(i + i4, i4 + i2, cArr, i3);
            return;
        }
        while (i < i2) {
            cArr[i3] = c16788.f49469.charAt(i4 + i);
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
