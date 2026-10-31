package l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C14518 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f44498 = new String[0];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String[] f44499;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String[] f44500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f44501 = 0;

    public C14518() {
        String[] strArr = f44498;
        this.f44500 = strArr;
        this.f44499 = strArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34670(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.f44501; i++) {
            if (str.equals(this.f44500[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void put(String str, String str2) {
        int iM34670 = m34670(str);
        if (iM34670 != -1) {
            this.f44499[iM34670] = str2;
            return;
        }
        int i = this.f44501;
        int i2 = i + 1;
        if (i2 < i) {
            throw new IllegalArgumentException("Must be true");
        }
        String[] strArr = this.f44500;
        int length = strArr.length;
        if (length < i2) {
            int i3 = length >= 4 ? i * 2 : 4;
            if (i2 <= i3) {
                i2 = i3;
            }
            String[] strArr2 = new String[i2];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
            this.f44500 = strArr2;
            String[] strArr3 = this.f44499;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f44499 = strArr4;
        }
        String[] strArr5 = this.f44500;
        int i4 = this.f44501;
        strArr5[i4] = str;
        this.f44499[i4] = str2;
        this.f44501 = i4 + 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34669(C14518 c14518, int i) {
        int i2 = c14518.f44501;
        if (i >= i2) {
            throw new IllegalArgumentException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = c14518.f44500;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            String[] strArr2 = c14518.f44499;
            System.arraycopy(strArr2, i4, strArr2, i, i3);
        }
        int i5 = c14518.f44501 - 1;
        c14518.f44501 = i5;
        c14518.f44500[i5] = null;
        c14518.f44499[i5] = null;
    }

    public final int size() {
        return this.f44501;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C17341(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14518.class != obj.getClass()) {
            return false;
        }
        C14518 c14518 = (C14518) obj;
        if (this.f44501 == c14518.f44501 && Arrays.equals(this.f44500, c14518.f44500)) {
            return Arrays.equals(this.f44499, c14518.f44499);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f44501 * 31) + Arrays.hashCode(this.f44500)) * 31) + Arrays.hashCode(this.f44499);
    }

    public final Object clone() {
        try {
            C14518 c14518 = (C14518) super.clone();
            c14518.f44501 = this.f44501;
            String[] strArr = this.f44500;
            int i = this.f44501;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f44500 = strArr2;
            String[] strArr3 = this.f44499;
            int i2 = this.f44501;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f44499 = strArr4;
            return c14518;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
