package l;

/* JADX INFO: renamed from: l.۬᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5AJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13365 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39980;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11955[] f39981;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12660 f39982;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39983;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16040 f39984;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11955[] f39985;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11955 f39986;

    public C13365(C12660 c12660, C20422 c20422, boolean z) {
        this.f39982 = c12660;
        C11955[] c11955Arr = new C11955[c12660.f38138];
        this.f39985 = c11955Arr;
        if (z) {
            this.f39981 = c11955Arr;
            c20422.f65885 = c11955Arr;
        } else {
            this.f39981 = c20422.f65885;
        }
        this.f39984 = c20422.f65886;
        this.f39980 = 0;
        this.f39983 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32378() {
        C12660 c12660 = this.f39982;
        int i = (c12660.f38134[this.f39980 + 3] << 24) | ((c12660.f38134[this.f39980 + 2] & 255) << 16) | ((c12660.f38134[this.f39980 + 1] & 255) << 8);
        byte[] bArr = c12660.f38134;
        int i2 = this.f39980;
        int i3 = (bArr[i2] & 255) | i;
        this.f39980 = i2 + 4;
        return i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m32380() {
        C12660 c12660 = this.f39982;
        int i = (c12660.f38134[this.f39980 + 1] & 255) << 8;
        byte[] bArr = c12660.f38134;
        int i2 = this.f39980;
        short s = (short) ((bArr[i2] & 255) | i);
        this.f39980 = i2 + 2;
        return s;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m32379() {
        C12660 c12660 = this.f39982;
        long j = (((long) c12660.f38134[this.f39980 + 7]) << 56) | ((((long) c12660.f38134[this.f39980 + 6]) & 255) << 48) | ((((long) c12660.f38134[this.f39980 + 5]) & 255) << 40) | ((((long) c12660.f38134[this.f39980 + 4]) & 255) << 32) | ((((long) c12660.f38134[this.f39980 + 3]) & 255) << 24) | ((((long) c12660.f38134[this.f39980 + 2]) & 255) << 16) | ((((long) c12660.f38134[this.f39980 + 1]) & 255) << 8);
        byte[] bArr = c12660.f38134;
        int i = this.f39980;
        long j2 = j | (((long) bArr[i]) & 255);
        this.f39980 = i + 8;
        return j2;
    }
}
