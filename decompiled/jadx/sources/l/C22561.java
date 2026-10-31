package l;

import android.text.GetChars;

/* JADX INFO: renamed from: l.᩹᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB2A */
/* JADX INFO: loaded from: classes.dex */
public final class C22561 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f72956;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char[] f72957;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f72958;

    public C22561(char[] cArr, int i, int i2) {
        this.f72957 = cArr;
        this.f72956 = i;
        this.f72958 = i2 - i;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f72958;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f72958;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("index = ", i, i2, ", length = "));
        }
        return this.f72957[this.f72956 + i];
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f72958;
        if (i == 0 && i2 == i3) {
            return this;
        }
        int i4 = i2 - i;
        if (i4 < 0 || i < 0 || i2 > i3) {
            StringBuilder sbM46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            sbM46682.append(i3);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        if (i4 == 0) {
            return "";
        }
        int i5 = this.f72956;
        return new C22561(this.f72957, i + i5, i5 + i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f72957, this.f72956, this.f72958);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f72958;
        if (i < 0 || i2 > i4 || i > i2) {
            StringBuilder sbM46682 = C20361.m46682("start = ", i, ", end = ", ", length = ", i2);
            sbM46682.append(i4);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        System.arraycopy(this.f72957, this.f72956 + i, cArr, i3, i2 - i);
    }
}
