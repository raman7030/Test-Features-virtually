package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41QS */
/* JADX INFO: loaded from: classes5.dex */
public final class C21064 extends C18947 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C21064 f67936;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f67937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f67938;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67939;

    static {
        C21064 c21064 = new C21064(0);
        f67936 = c21064;
        c21064.mo20349();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C21064 m47910(int i) {
        C21064 c21064 = new C21064(1);
        c21064.add(i);
        c21064.mo20349();
        return c21064;
    }

    public C21064() {
        this(4);
    }

    public C21064(int i) {
        super(true);
        try {
            this.f67937 = new int[i];
            this.f67939 = 0;
            this.f67938 = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.f67939; i2++) {
            i = (i * 31) + this.f67937[i2];
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21064)) {
            return false;
        }
        C21064 c21064 = (C21064) obj;
        if (this.f67938 != c21064.f67938 || this.f67939 != c21064.f67939) {
            return false;
        }
        for (int i = 0; i < this.f67939; i++) {
            if (this.f67937[i] != c21064.f67937[i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f67939 * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.f67939; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(this.f67937[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    public final int size() {
        return this.f67939;
    }

    public final int get(int i) {
        if (i >= this.f67939) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            return this.f67937[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IndexOutOfBoundsException("n < 0");
        }
    }

    public final void set(int i, int i2) {
        m43734();
        if (i >= this.f67939) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        try {
            this.f67937[i] = i2;
            this.f67938 = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i < 0) {
                throw new IllegalArgumentException("n < 0");
            }
        }
    }

    public final void add(int i) {
        m43734();
        int i2 = this.f67939;
        int[] iArr = this.f67937;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[C23868.m52580(i2, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f67937 = iArr2;
        }
        int[] iArr3 = this.f67937;
        int i3 = this.f67939;
        int i4 = i3 + 1;
        this.f67939 = i4;
        iArr3[i3] = i;
        if (!this.f67938 || i4 <= 1) {
            return;
        }
        this.f67938 = i >= iArr3[i3 + (-1)];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47916(int i, int i2) {
        int i3 = this.f67939;
        if (i > i3) {
            throw new IndexOutOfBoundsException("n > size()");
        }
        int[] iArr = this.f67937;
        boolean z = false;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[C23868.m52580(i3, 3, 2, 10)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f67937 = iArr2;
        }
        int[] iArr3 = this.f67937;
        int i4 = i + 1;
        System.arraycopy(iArr3, i, iArr3, i4, this.f67939 - i);
        int[] iArr4 = this.f67937;
        iArr4[i] = i2;
        int i5 = this.f67939;
        this.f67939 = i5 + 1;
        if (this.f67938 && ((i == 0 || i2 > iArr4[i - 1]) && (i == i5 || i2 < iArr4[i4]))) {
            z = true;
        }
        this.f67938 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47915(int i) {
        int i2 = this.f67939;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("n >= size()");
        }
        int[] iArr = this.f67937;
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        this.f67939--;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m47917() {
        return get(this.f67939 - 1);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m47911() {
        m43734();
        int i = get(this.f67939 - 1);
        this.f67939--;
        return i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47918(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("newSize < 0");
        }
        if (i > this.f67939) {
            throw new IllegalArgumentException("newSize > size");
        }
        m43734();
        this.f67939 = i;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21064 m47913() {
        int i = this.f67939;
        C21064 c21064 = new C21064(i);
        for (int i2 = 0; i2 < i; i2++) {
            c21064.add(this.f67937[i2]);
        }
        return c21064;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m47914() {
        m43734();
        if (this.f67938) {
            return;
        }
        Arrays.sort(this.f67937, 0, this.f67939);
        this.f67938 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47912(int i) {
        int i2;
        int i3 = this.f67939;
        if (!this.f67938) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f67937[i4] == i) {
                    return i4;
                }
            }
            return -i3;
        }
        int i5 = -1;
        int i6 = i3;
        while (i6 > i5 + 1) {
            int i7 = ((i6 - i5) >> 1) + i5;
            if (i <= this.f67937[i7]) {
                i6 = i7;
            } else {
                i5 = i7;
            }
        }
        if (i6 == i3) {
            i2 = -i3;
        } else {
            if (i == this.f67937[i6]) {
                return i6;
            }
            i2 = -i6;
        }
        return i2 - 1;
    }
}
