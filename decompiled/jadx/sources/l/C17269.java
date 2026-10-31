package l;

/* JADX INFO: renamed from: l.ܿۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17269 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f52926;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52927;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52928;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14446 f52929;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52930 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f52931;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52932;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52933;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f52934;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f52935;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52936;

    public C17269(C14446 c14446, int i, int i2, int i3, int i4) {
        this.f52929 = c14446;
        this.f52933 = i;
        this.f52926 = i2;
        this.f52935 = i3;
        this.f52934 = i4;
        int i5 = c14446.f44280;
        this.f52936 = i5;
        this.f52931 = new int[i5 - i];
        this.f52928 = i;
        this.f52927 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40558() {
        if (this.f52932) {
            return true;
        }
        C14446 c14446 = this.f52929;
        if (c14446.f44279 || c14446.f44272 != this) {
            throw new IllegalStateException("Syntax context clip is not active");
        }
        int i = this.f52927;
        int i2 = this.f52936;
        if (i < i2) {
            this.f52927 = i + 1;
            int i3 = c14446.f44281[i];
            int[] iArr = this.f52931;
            int i4 = this.f52933;
            if (i3 >= i4) {
                i3 = iArr[i3 - i4];
            }
            int i5 = this.f52926;
            int[] iArr2 = c14446.f44274;
            int iMax = i < i5 ? Math.max(iArr2[i], this.f52935) : iArr2[i];
            int iMin = i < i5 ? Math.min(c14446.f44277[i], this.f52934) : c14446.f44277[i];
            if (iMax >= iMin || c14446.f44275 == c14446.f44271 || iMin <= c14446.f44275 || iMax >= c14446.f44271) {
                iArr[i - i4] = i3;
                return false;
            }
            int i6 = this.f52928;
            this.f52928 = i6 + 1;
            c14446.f44274[i6] = iMax;
            c14446.f44277[i6] = iMin;
            c14446.f44281[i6] = i3;
            c14446.f44278[i6] = c14446.f44278[i];
            iArr[i - i4] = i6;
            return false;
        }
        if (this.f52930 < 0) {
            this.f52930 = this.f52928;
        }
        if (this.f52930 < i2) {
            C15068[] c15068Arr = c14446.f44278;
            int i7 = this.f52930;
            int i8 = i7 + 1;
            this.f52930 = i8;
            c15068Arr[i7] = null;
            if (i8 < i2) {
                return false;
            }
        }
        c14446.f44280 = this.f52928;
        c14446.f44276 = true;
        this.f52932 = true;
        c14446.f44272 = null;
        return true;
    }
}
