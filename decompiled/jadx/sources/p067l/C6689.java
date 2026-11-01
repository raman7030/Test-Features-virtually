package p067l;

/* JADX INFO: renamed from: l.ۙۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7BAL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6689 extends C20376 {

    /* JADX INFO: renamed from: ᩶ */
    public final C22783[] f17334;

    /* JADX INFO: renamed from: ᩹ */
    public int f17335;

    static {
        new C6689(0);
    }

    public C6689(int i) {
        super(i != 0);
        this.f17334 = new C22783[i];
        this.f17335 = 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6689)) {
            return false;
        }
        C6689 c6689 = (C6689) obj;
        C22783[] c22783Arr = c6689.f17334;
        C22783[] c22783Arr2 = this.f17334;
        int length = c22783Arr2.length;
        if (length != c22783Arr.length || size() != c6689.size()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            C22783 c22783 = c22783Arr2[i];
            Object obj2 = c22783Arr[i];
            if (c22783 != obj2 && (c22783 == null || !c22783.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        C22783[] c22783Arr = this.f17334;
        int length = c22783Arr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            C22783 c22783 = c22783Arr[i];
            iHashCode = (iHashCode * 31) + (c22783 == null ? 0 : c22783.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        C22783[] c22783Arr = this.f17334;
        StringBuilder sb = new StringBuilder(c22783Arr.length * 25);
        sb.append('{');
        boolean z = false;
        for (C22783 c22783 : c22783Arr) {
            if (c22783 != null) {
                if (z) {
                    sb.append(", ");
                } else {
                    z = true;
                }
                sb.append(c22783);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m15244() {
        return this.f17334.length;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15245(C6689 c6689) {
        int length = c6689.f17334.length;
        for (int i = 0; i < length; i++) {
            C22783 c22783 = c6689.get(i);
            if (c22783 != null) {
                m15246(c22783);
            }
        }
    }

    public final int size() {
        int i = this.f17335;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (C22783 c22783 : this.f17334) {
            if (c22783 != null) {
                i2++;
            }
        }
        this.f17335 = i2;
        return i2;
    }

    public final C22783 get(int i) {
        try {
            return this.f17334[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m15242(C22783 c22783) {
        for (C22783 c22784 : this.f17334) {
            if (c22784 != null && c22783.m50988(c22784)) {
                return c22784;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22783 m15241(C20101 c20101) {
        for (C22783 c22783 : this.f17334) {
            if (c22783 != null && c20101.equals(c22783.m50990())) {
                return c22783;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m15247(C22783 c22783) {
        try {
            this.f17334[c22783.m50989()] = null;
            this.f17335 = -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("bogus reg");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15246(C22783 c22783) {
        int i;
        C22783 c22784;
        C22783[] c22783Arr = this.f17334;
        m46001();
        if (c22783 == null) {
            throw new NullPointerException("spec == null");
        }
        this.f17335 = -1;
        try {
            int iM50989 = c22783.m50989();
            c22783Arr[iM50989] = c22783;
            if (iM50989 > 0 && (c22784 = c22783Arr[(i = iM50989 - 1)]) != null && c22784.m50982() == 2) {
                c22783Arr[i] = null;
            }
            if (c22783.m50982() == 2) {
                c22783Arr[iM50989 + 1] = null;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("spec.getReg() out of range");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15243(C6689 c6689) {
        C22783 c22783M50987;
        m46001();
        C22783[] c22783Arr = c6689.f17334;
        C22783[] c22783Arr2 = this.f17334;
        int length = c22783Arr2.length;
        int iMin = Math.min(length, c22783Arr.length);
        this.f17335 = -1;
        for (int i = 0; i < iMin; i++) {
            C22783 c22783 = c22783Arr2[i];
            if (c22783 != null && (c22783M50987 = c22783.m50987(c22783Arr[i])) != c22783) {
                c22783Arr2[i] = c22783M50987;
            }
        }
        while (iMin < length) {
            c22783Arr2[iMin] = null;
            iMin++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6689 m15240(int i) {
        C22783[] c22783Arr = this.f17334;
        C6689 c6689 = new C6689(c22783Arr.length + i);
        for (C22783 c22783 : c22783Arr) {
            if (c22783 != null) {
                c6689.m15246(c22783.m50977(i));
            }
        }
        c6689.f17335 = this.f17335;
        if (m46002()) {
            c6689.mo22326();
        }
        return c6689;
    }

    /* JADX INFO: renamed from: ֨ */
    public final C6689 m15239() {
        C22783[] c22783Arr = this.f17334;
        C6689 c6689 = new C6689(c22783Arr.length);
        for (C22783 c22783 : c22783Arr) {
            if (c22783 != null) {
                c6689.m15246(c22783);
            }
        }
        c6689.f17335 = this.f17335;
        return c6689;
    }
}
