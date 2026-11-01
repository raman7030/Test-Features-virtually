package p067l;

/* JADX INFO: renamed from: l.ܳ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: TATF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16399 {

    /* JADX INFO: renamed from: ܽ */
    public static final C16399[] f48194 = new C16399[1001];

    /* JADX INFO: renamed from: ֫ */
    public int f48195;

    /* JADX INFO: renamed from: ۧ */
    public int f48196;

    public C16399(int i, int i2) {
        this.f48195 = i;
        this.f48196 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16399 m37214(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C16399(i, i2);
        }
        C16399[] c16399Arr = f48194;
        if (c16399Arr[i] == null) {
            c16399Arr[i] = new C16399(i, i);
        }
        return c16399Arr[i];
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C16399)) {
            C16399 c16399 = (C16399) obj;
            if (this.f48195 == c16399.f48195 && this.f48196 == c16399.f48196) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f48195 + 713) * 31) + this.f48196;
    }

    public final String toString() {
        return this.f48195 + ".." + this.f48196;
    }
}
