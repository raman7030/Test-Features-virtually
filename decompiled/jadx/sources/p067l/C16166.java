package p067l;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R2TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16166 implements Iterable, Cloneable {

    /* JADX INFO: renamed from: ۙ */
    public static final String[] f47604 = new String[0];

    /* JADX INFO: renamed from: ᩶ */
    public String[] f47605;

    /* JADX INFO: renamed from: ᩸ */
    public String[] f47606;

    /* JADX INFO: renamed from: ᩹ */
    public int f47607 = 0;

    public C16166() {
        String[] strArr = f47604;
        this.f47606 = strArr;
        this.f47605 = strArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36812(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.f47607; i++) {
            if (str.equals(this.f47606[i])) {
                return i;
            }
        }
        return -1;
    }

    public final void put(String str, String str2) {
        int iM36812 = m36812(str);
        if (iM36812 != -1) {
            this.f47605[iM36812] = str2;
            return;
        }
        int i = this.f47607;
        int i2 = i + 1;
        if (i2 < i) {
            throw new IllegalArgumentException("Must be true");
        }
        String[] strArr = this.f47606;
        int length = strArr.length;
        if (length < i2) {
            int i3 = length >= 4 ? i * 2 : 4;
            if (i2 <= i3) {
                i2 = i3;
            }
            String[] strArr2 = new String[i2];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
            this.f47606 = strArr2;
            String[] strArr3 = this.f47605;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f47605 = strArr4;
        }
        String[] strArr5 = this.f47606;
        int i4 = this.f47607;
        strArr5[i4] = str;
        this.f47605[i4] = str2;
        this.f47607 = i4 + 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36811(C16166 c16166, int i) {
        int i2 = c16166.f47607;
        if (i >= i2) {
            throw new IllegalArgumentException("Must be false");
        }
        int i3 = (i2 - i) - 1;
        if (i3 > 0) {
            String[] strArr = c16166.f47606;
            int i4 = i + 1;
            System.arraycopy(strArr, i4, strArr, i, i3);
            String[] strArr2 = c16166.f47605;
            System.arraycopy(strArr2, i4, strArr2, i, i3);
        }
        int i5 = c16166.f47607 - 1;
        c16166.f47607 = i5;
        c16166.f47606[i5] = null;
        c16166.f47605[i5] = null;
    }

    public final int size() {
        return this.f47607;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C18849(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16166.class != obj.getClass()) {
            return false;
        }
        C16166 c16166 = (C16166) obj;
        if (this.f47607 == c16166.f47607 && Arrays.equals(this.f47606, c16166.f47606)) {
            return Arrays.equals(this.f47605, c16166.f47605);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f47607 * 31) + Arrays.hashCode(this.f47606)) * 31) + Arrays.hashCode(this.f47605);
    }

    public final Object clone() {
        try {
            C16166 c16166 = (C16166) super.clone();
            c16166.f47607 = this.f47607;
            String[] strArr = this.f47606;
            int i = this.f47607;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.f47606 = strArr2;
            String[] strArr3 = this.f47605;
            int i2 = this.f47607;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f47605 = strArr4;
            return c16166;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
