package p067l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩹᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB2A */
/* JADX INFO: loaded from: classes.dex */
public final class C23811 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩶ */
    public final int f75683;

    /* JADX INFO: renamed from: ᩸ */
    public final char[] f75684;

    /* JADX INFO: renamed from: ᩹ */
    public final int f75685;

    public C23811(char[] cArr, int i, int i2) {
        this.f75684 = cArr;
        this.f75683 = i;
        this.f75685 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f75685;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f75685;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index = ", i, i2, ", length = "));
        }
        return this.f75684[this.f75683 + i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f75685;
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = i2 - i;
        if (i4 < 0 || i < 0 || i2 > i3) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(i3);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f75683;
        return new C23811(this.f75684, i + i5, i5 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f75684, this.f75683, this.f75685);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f75685;
        if (i < 0 || i2 > i4 || i > i2) {
            StringBuilder sbM49005 = C21720.m49005("start = ", i, ", end = ", ", length = ", i2);
            sbM49005.append(i4);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
        System.arraycopy(this.f75684, this.f75683 + i, cArr, i3, i2 - i);
    }
}
