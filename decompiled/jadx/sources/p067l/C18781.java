package p067l;

/* JADX INFO: renamed from: l.ܿۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18781 {

    /* JADX INFO: renamed from: ֫ */
    public final int f56108;

    /* JADX INFO: renamed from: ۜ */
    public int f56109;

    /* JADX INFO: renamed from: ۡ */
    public int f56110;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C16098 f56111;

    /* JADX INFO: renamed from: ۧ */
    public int f56112 = -1;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f56113;

    /* JADX INFO: renamed from: ܽ */
    public boolean f56114;

    /* JADX INFO: renamed from: ܿ */
    public final int f56115;

    /* JADX INFO: renamed from: ᩳ */
    public final int f56116;

    /* JADX INFO: renamed from: ᩷ */
    public final int f56117;

    /* JADX INFO: renamed from: ᩻ */
    public final int f56118;

    public C18781(C16098 c16098, int i, int i2, int i3, int i4) {
        this.f56111 = c16098;
        this.f56115 = i;
        this.f56108 = i2;
        this.f56117 = i3;
        this.f56116 = i4;
        int i5 = c16098.f47374;
        this.f56118 = i5;
        this.f56113 = new int[i5 - i];
        this.f56110 = i;
        this.f56109 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42807() {
        if (this.f56114) {
            return true;
        }
        C16098 c16098 = this.f56111;
        if (c16098.f47373 || c16098.f47366 != this) {
            throw new IllegalStateException("Syntax context clip is not active");
        }
        int i = this.f56109;
        int i2 = this.f56118;
        if (i < i2) {
            this.f56109 = i + 1;
            int i3 = c16098.f47375[i];
            int[] iArr = this.f56113;
            int i4 = this.f56115;
            if (i3 >= i4) {
                i3 = iArr[i3 - i4];
            }
            int i5 = this.f56108;
            int[] iArr2 = c16098.f47368;
            int iMax = i < i5 ? Math.max(iArr2[i], this.f56117) : iArr2[i];
            int iMin = i < i5 ? Math.min(c16098.f47371[i], this.f56116) : c16098.f47371[i];
            if (iMax >= iMin || c16098.f47369 == c16098.f47365 || iMin <= c16098.f47369 || iMax >= c16098.f47365) {
                iArr[i - i4] = i3;
                return false;
            }
            int i6 = this.f56110;
            this.f56110 = i6 + 1;
            c16098.f47368[i6] = iMax;
            c16098.f47371[i6] = iMin;
            c16098.f47375[i6] = i3;
            c16098.f47372[i6] = c16098.f47372[i];
            iArr[i - i4] = i6;
            return false;
        }
        if (this.f56112 < 0) {
            this.f56112 = this.f56110;
        }
        if (this.f56112 < i2) {
            C16689[] c16689Arr = c16098.f47372;
            int i7 = this.f56112;
            int i8 = i7 + 1;
            this.f56112 = i8;
            c16689Arr[i7] = null;
            if (i8 < i2) {
                return false;
            }
        }
        c16098.f47374 = this.f56110;
        c16098.f47370 = true;
        this.f56114 = true;
        c16098.f47366 = null;
        return true;
    }
}
