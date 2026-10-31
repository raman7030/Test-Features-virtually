package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C12368 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f37087;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f37088;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f37089;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f37090;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f37091;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f37093;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f37095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f37097;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37094 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f37096 = new int[256];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f37092 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f37098 = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30083(int i, int i2, int i3) {
        boolean z;
        if (!this.f37087 && i >= 0 && i2 > 0 && i3 > 0 && i > this.f37098) {
            long j = i;
            long j2 = i2;
            int i4 = i3 - 1;
            if ((((long) i4) * j2) + j <= 2147483647L) {
                int i5 = this.f37088;
                int i6 = 0;
                if (i5 != 0) {
                    long j3 = j - ((long) this.f37090);
                    if (i5 != 1) {
                        int i7 = this.f37089;
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
                        this.f37089 = i2;
                        this.f37088 = (int) j4;
                        this.f37090 = (i2 * i4) + i;
                    } else {
                        m30080();
                        this.f37097 = i;
                        this.f37090 = (i4 * i2) + i;
                        if (i3 != 1) {
                            i6 = i2;
                        }
                        this.f37089 = i6;
                        this.f37088 = i3;
                    }
                } else {
                    this.f37097 = i;
                    this.f37090 = (i4 * i2) + i;
                    if (i3 != 1) {
                        i6 = i2;
                    }
                    this.f37089 = i6;
                    this.f37088 = i3;
                }
                this.f37098 = (i2 * i4) + i;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid replacement match run");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13073 m30082(InterfaceC17066 interfaceC17066) throws C23821 {
        if (this.f37087) {
            throw new IllegalStateException("Recipe index already built");
        }
        if (interfaceC17066 != null && interfaceC17066.mo1526()) {
            throw new C23821();
        }
        this.f37087 = true;
        m30080();
        m30079();
        AbstractC11164[] abstractC11164Arr = (AbstractC11164[]) this.f37094.toArray(new AbstractC11164[0]);
        long[] jArr = new long[abstractC11164Arr.length];
        long jMo21898 = 0;
        for (int i = 0; i < abstractC11164Arr.length; i++) {
            if ((i & 255) == 0 && interfaceC17066 != null && interfaceC17066.mo1526()) {
                throw new C23821();
            }
            jMo21898 += (long) abstractC11164Arr[i].mo21898();
            jArr[i] = jMo21898;
        }
        return new C13073(abstractC11164Arr, jArr, jMo21898, C18177.m42301(abstractC11164Arr.length, this.f37091));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m30081() {
        return Math.max(C1005.m3495(this.f37093, C1005.m3495(this.f37088 == 0 ? 0L : 16L, ((long) this.f37096.length) * 4)), C18177.m42301(this.f37094.size(), this.f37091));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m30080() {
        int i = this.f37088;
        if (i == 0) {
            return;
        }
        if (i >= 3) {
            m30079();
            m30078(AbstractC11164.m27688(this.f37097, this.f37089, this.f37088));
        } else {
            int i2 = i == 1 ? 1 : this.f37089;
            for (int i3 = 0; i3 < this.f37088; i3++) {
                int i4 = (i3 * i2) + this.f37097;
                int i5 = i4 >>> 16;
                if (this.f37095 != 0 && i5 != this.f37092) {
                    m30079();
                }
                this.f37092 = i5;
                int i6 = this.f37095;
                int[] iArr = this.f37096;
                if (i6 == iArr.length) {
                    this.f37096 = Arrays.copyOf(iArr, Math.min(65536, iArr.length << 1));
                }
                int[] iArr2 = this.f37096;
                int i7 = this.f37095;
                this.f37095 = i7 + 1;
                iArr2[i7] = i4;
            }
        }
        this.f37088 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30079() {
        int i = this.f37095;
        if (i == 0) {
            return;
        }
        m30078(AbstractC11164.m27686(i, this.f37096));
        this.f37095 = 0;
        this.f37092 = -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30078(AbstractC11164 abstractC11164) {
        long jM3495 = C1005.m3495(this.f37093, C1005.m3495(abstractC11164.mo21897(), 24L));
        ArrayList arrayList = this.f37094;
        int size = arrayList.size() + 1;
        long jM3496 = C1005.m3495(this.f37091, abstractC11164.mo21890());
        long jM42301 = C18177.m42301(size, jM3496);
        if (jM3495 > 67108864 || jM42301 > 67108864) {
            throw new IllegalStateException("Replacement match index exceeds memory limit");
        }
        arrayList.add(abstractC11164);
        this.f37093 = jM3495;
        this.f37091 = jM3496;
    }
}
