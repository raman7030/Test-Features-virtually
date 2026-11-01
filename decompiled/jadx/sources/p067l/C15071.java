package p067l;

/* JADX INFO: renamed from: l.۬᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15071 {

    /* JADX INFO: renamed from: ֫ */
    public int f43047;

    /* JADX INFO: renamed from: ۧ */
    public final C13731[] f43048;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C14401 f43049;

    /* JADX INFO: renamed from: ܽ */
    public int f43050;

    /* JADX INFO: renamed from: ܿ */
    public final C17613 f43051;

    /* JADX INFO: renamed from: ᩳ */
    public final C13731[] f43052;

    /* JADX INFO: renamed from: ᩻ */
    public C13731 f43053;

    public C15071(C14401 c14401, C21778 c21778, boolean z) {
        this.f43049 = c14401;
        C13731[] c13731Arr = new C13731[c14401.f41165];
        this.f43052 = c13731Arr;
        if (z) {
            this.f43048 = c13731Arr;
            c21778.f68560 = c13731Arr;
        } else {
            this.f43048 = c21778.f68560;
        }
        this.f43051 = c21778.f68561;
        this.f43047 = 0;
        this.f43050 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34479() {
        C14401 c14401 = this.f43049;
        int i = (c14401.f41161[this.f43047 + 3] << 24) | ((c14401.f41161[this.f43047 + 2] & 255) << 16) | ((c14401.f41161[this.f43047 + 1] & 255) << 8);
        byte[] bArr = c14401.f41161;
        int i2 = this.f43047;
        int i3 = (bArr[i2] & 255) | i;
        this.f43047 = i2 + 4;
        return i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final short m34481() {
        C14401 c14401 = this.f43049;
        int i = (c14401.f41161[this.f43047 + 1] & 255) << 8;
        byte[] bArr = c14401.f41161;
        int i2 = this.f43047;
        short s = (short) ((bArr[i2] & 255) | i);
        this.f43047 = i2 + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m34480() {
        C14401 c14401 = this.f43049;
        long j = (((long) c14401.f41161[this.f43047 + 7]) << 56) | ((((long) c14401.f41161[this.f43047 + 6]) & 255) << 48) | ((((long) c14401.f41161[this.f43047 + 5]) & 255) << 40) | ((((long) c14401.f41161[this.f43047 + 4]) & 255) << 32) | ((((long) c14401.f41161[this.f43047 + 3]) & 255) << 24) | ((((long) c14401.f41161[this.f43047 + 2]) & 255) << 16) | ((((long) c14401.f41161[this.f43047 + 1]) & 255) << 8);
        byte[] bArr = c14401.f41161;
        int i = this.f43047;
        long j2 = j | (((long) bArr[i]) & 255);
        this.f43047 = i + 8;
        return j2;
    }
}
