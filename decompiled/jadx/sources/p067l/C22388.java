package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes5.dex */
public final class C22388 extends C20376 {

    /* JADX INFO: renamed from: ۗ */
    public static final C22388 f70620;

    /* JADX INFO: renamed from: ۙ */
    public int[] f70621;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f70622;

    /* JADX INFO: renamed from: ᩹ */
    public int f70623;

    static {
        C22388 c22388 = new C22388(0);
        f70620 = c22388;
        c22388.mo22326();
    }

    /* JADX INFO: renamed from: ܿ */
    public static C22388 m50240(int i) {
        C22388 c22388 = new C22388(1);
        c22388.add(i);
        c22388.mo22326();
        return c22388;
    }

    public C22388() {
        this(4);
    }

    public C22388(int i) {
        super(true);
        try {
            this.f70621 = new int[i];
            this.f70623 = 0;
            this.f70622 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f70623; i2++) {
            i = (i * 31) + this.f70621[i2];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22388)) {
            return false;
        }
        C22388 c22388 = (C22388) obj;
        if (this.f70622 != c22388.f70622 || this.f70623 != c22388.f70623) {
            return false;
        }
        for (int i = 0; i < this.f70623; i++) {
            if (this.f70621[i] != c22388.f70621[i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f70623 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f70623; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f70621[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.f70623;
    }

    public final int get(int i) {
        if (i >= this.f70623) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f70621[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public final void set(int i, int i2) {
        m46001();
        if (i >= this.f70623) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f70621[i] = i2;
            this.f70622 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public final void add(int i) {
        m46001();
        int i2 = this.f70623;
        int[] iArr = this.f70621;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C25053.m54989(i2, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f70621 = iArr2;
        }
        int[] iArr3 = this.f70621;
        int i3 = this.f70623;
        int i4 = i3 + 1;
        this.f70623 = i4;
        iArr3[i3] = i;
        if (!this.f70622 || i4 <= 1) {
            return;
        }
        this.f70622 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50246(int i, int i2) {
        int i3 = this.f70623;
        if (i > i3) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        int[] iArr = this.f70621;
        boolean z = false;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C25053.m54989(i3, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f70621 = iArr2;
        }
        int[] iArr3 = this.f70621;
        int i4 = i + 1;
        System.arraycopy(iArr3, i, iArr3, i4, this.f70623 - i);
        int[] iArr4 = this.f70621;
        iArr4[i] = i2;
        int i5 = this.f70623;
        this.f70623 = i5 + 1;
        if (this.f70622 && ((i == 0 || i2 > iArr4[i - 1]) && (i == i5 || i2 < iArr4[i4]))) {
            z = true;
        }
        this.f70622 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50245(int i) {
        int i2 = this.f70623;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.f70621;
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        this.f70623--;
    }

    /* JADX INFO: renamed from: ܶ */
    public final int m50247() {
        return get(this.f70623 - 1);
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m50241() {
        m46001();
        int i = get(this.f70623 - 1);
        this.f70623--;
        return i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m50248(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f70623) {
            throw new IllegalArgumentException("newSize > size");
        }
        m46001();
        this.f70623 = i;
    }

    /* JADX INFO: renamed from: ۚ */
    public final C22388 m50243() {
        int i = this.f70623;
        C22388 c22388 = new C22388(i);
        for (int i2 = 0; i2 < i; i2++) {
            c22388.add(this.f70621[i2]);
        }
        return c22388;
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m50244() {
        m46001();
        if (this.f70622) {
            return;
        }
        Arrays.sort(this.f70621, 0, this.f70623);
        this.f70622 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50242(int i) {
        int i2;
        int i3 = this.f70623;
        if (!this.f70622) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f70621[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f70621[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f70621[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }
}
