package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C14123 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f40103;

    /* JADX INFO: renamed from: ۜ */
    public int f40104;

    /* JADX INFO: renamed from: ۡ */
    public int f40105;

    /* JADX INFO: renamed from: ۢ */
    public int f40106;

    /* JADX INFO: renamed from: ۧ */
    public long f40107;

    /* JADX INFO: renamed from: ܺ */
    public long f40109;

    /* JADX INFO: renamed from: ܿ */
    public int f40111;

    /* JADX INFO: renamed from: ᩷ */
    public int f40113;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f40110 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public int[] f40112 = new int[256];

    /* JADX INFO: renamed from: ܳ */
    public int f40108 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public int f40114 = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX INFO: renamed from: ֫ */
    public final void m32144(int i, int i2, int i3) {
        boolean z;
        if (!this.f40103 && i >= 0 && i2 > 0 && i3 > 0 && i > this.f40114) {
            long j = i;
            long j2 = i2;
            int i4 = i3 - 1;
            if ((((long) i4) * j2) + j <= 2147483647L) {
                int i5 = this.f40104;
                int i6 = 0;
                if (i5 != 0) {
                    long j3 = j - ((long) this.f40106);
                    if (i5 != 1) {
                        int i7 = this.f40105;
                        if (j3 == i7 && i2 == i7) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (j3 == j2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long j4 = ((long) i5) + ((long) i3);
                    if (z && j4 <= 2147483647L) {
                        this.f40105 = i2;
                        this.f40104 = (int) j4;
                        this.f40106 = (i2 * i4) + i;
                    } else {
                        m32141();
                        this.f40113 = i;
                        this.f40106 = (i4 * i2) + i;
                        if (i3 != 1) {
                            i6 = i2;
                        }
                        this.f40105 = i6;
                        this.f40104 = i3;
                    }
                } else {
                    this.f40113 = i;
                    this.f40106 = (i4 * i2) + i;
                    if (i3 != 1) {
                        i6 = i2;
                    }
                    this.f40105 = i6;
                    this.f40104 = i3;
                }
                this.f40114 = (i2 * i4) + i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid replacement match run");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14793 m32143(InterfaceC18588 interfaceC18588) throws C25008 {
        if (this.f40103) {
            throw new IllegalStateException("Recipe index already built");
        }
        if (interfaceC18588 != null && interfaceC18588.mo3924()) {
            throw new C25008();
        }
        this.f40103 = true;
        m32141();
        m32140();
        AbstractC12979[] abstractC12979Arr = (AbstractC12979[]) this.f40110.toArray(new AbstractC12979[0]);
        long[] jArr = new long[abstractC12979Arr.length];
        long jMo23868 = 0;
        for (int i = 0; i < abstractC12979Arr.length; i++) {
            if ((i & 255) == 0 && interfaceC18588 != null && interfaceC18588.mo3924()) {
                throw new C25008();
            }
            jMo23868 += (long) abstractC12979Arr[i].mo23868();
            jArr[i] = jMo23868;
        }
        return new C14793(abstractC12979Arr, jArr, jMo23868, C19644.m44562(abstractC12979Arr.length, this.f40107));
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m32142() {
        return Math.max(C0892.m55743(this.f40109, C0892.m55743(this.f40104 == 0 ? 0L : 16L, ((long) this.f40112.length) * 4)), C19644.m44562(this.f40110.size(), this.f40107));
    }

    /* JADX INFO: renamed from: ܽ */
    private void m32141() {
        int i = this.f40104;
        if (i == 0) {
            return;
        }
        if (i >= 3) {
            m32140();
            m32139(AbstractC12979.m29750(this.f40113, this.f40105, this.f40104));
        } else {
            int i2 = i == 1 ? 1 : this.f40105;
            for (int i3 = 0; i3 < this.f40104; i3++) {
                int i4 = (i3 * i2) + this.f40113;
                int i5 = i4 >>> 16;
                if (this.f40111 != 0 && i5 != this.f40108) {
                    m32140();
                }
                this.f40108 = i5;
                int i6 = this.f40111;
                int[] iArr = this.f40112;
                if (i6 == iArr.length) {
                    this.f40112 = Arrays.copyOf(iArr, Math.min(65536, iArr.length << 1));
                }
                int[] iArr2 = this.f40112;
                int i7 = this.f40111;
                this.f40111 = i7 + 1;
                iArr2[i7] = i4;
            }
        }
        this.f40104 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m32140() {
        int i = this.f40111;
        if (i == 0) {
            return;
        }
        m32139(AbstractC12979.m29748(i, this.f40112));
        this.f40111 = 0;
        this.f40108 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m32139(AbstractC12979 abstractC12979) {
        long jM55743 = C0892.m55743(this.f40109, C0892.m55743(abstractC12979.mo23867(), 24L));
        ArrayList arrayList = this.f40110;
        int size = arrayList.size() + 1;
        long jM55744 = C0892.m55743(this.f40107, abstractC12979.mo23860());
        long jM44562 = C19644.m44562(size, jM55744);
        if (jM55743 > 67108864 || jM44562 > 67108864) {
            throw new IllegalStateException("Replacement match index exceeds memory limit");
        }
        arrayList.add(abstractC12979);
        this.f40109 = jM55743;
        this.f40107 = jM55744;
    }
}
