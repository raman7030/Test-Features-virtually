package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۛۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6018 implements InterfaceC18883, InterfaceC6930, InterfaceC23863 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final long f18466;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f18467;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18468;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f18469;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f18470;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f18471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f18472;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f18473;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13073 f18474;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f18475 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9047 f18476;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f18477;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] f18478;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f18479;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m16829(C6018 c6018) {
        return c6018.f18477;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m16830(C6018 c6018) {
        return c6018.f18479;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ byte[] m16831(C6018 c6018) {
        return c6018.f18470;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ int m16833(C6018 c6018) {
        return c6018.f18471;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C9047 m16834(C6018 c6018) {
        return c6018.f18476;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C13073 m16836(C6018 c6018) {
        return c6018.f18474;
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10083() {
        return this;
    }

    @Override // l.InterfaceC4066
    /* JADX INFO: renamed from: ܽ */
    public final long mo10087() {
        return mo11897();
    }

    public C6018(C9047 c9047, int i, int i2, int i3, byte[] bArr, C13073 c13073) {
        if (i < 0 || i2 <= 0 || i3 <= 0 || c13073.m31683() <= 0 || !c13073.m31681(i3)) {
            throw new IllegalArgumentException("Invalid replacement recipe");
        }
        long j = i3;
        long jM31682 = ((long) c13073.m31682(c13073.m31683() - 1)) + j;
        long j2 = i;
        long length = ((((long) bArr.length) - j) * c13073.m31683()) + j2;
        if (jM31682 > j2 || length != i2) {
            throw new IllegalArgumentException("Invalid replacement recipe mapping");
        }
        ArrayList arrayList = new ArrayList();
        C18177.m42357(c9047, arrayList);
        Iterator it = arrayList.iterator();
        int iMax = 1;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C6018) it.next()).f18468 + 1);
        }
        if (iMax > 256) {
            throw new IllegalStateException("Replacement recipe dependency is too deep");
        }
        this.f18476 = c9047;
        this.f18477 = i;
        this.f18471 = i2;
        this.f18479 = i3;
        this.f18470 = bArr;
        this.f18474 = c13073;
        this.f18467 = ((long) bArr.length) - j;
        this.f18468 = iMax;
        long jM3495 = C1005.m3495(bArr.length, C1005.m3495(c13073.m31678(), 88L));
        this.f18472 = jM3495;
        this.f18473 = C1005.m3495(jM3495, C1005.m3495(C18177.m42351(c9047), C1005.m3495(C19631.m45118(c9047), C1005.m3495(C19631.m45128(c9047), C19631.m45142(c9047)))));
        long jM3496 = C1005.m3495(jM3495, C1005.m3495(C19631.m45128(c9047), C1005.m3495(C19631.m45118(c9047), C19631.m45142(c9047))));
        this.f18469 = jM3496;
        this.f18466 = C1005.m3495(jM3496, C19631.m45129(c9047).m12332());
        this.f18478 = C19631.m45121(c9047);
    }

    @Override // l.InterfaceC23863
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16839(ArrayDeque arrayDeque) {
        for (InterfaceC18883 interfaceC18883 : this.f18478) {
            arrayDeque.push(interfaceC18883);
        }
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f18471;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo10086() {
        if (this.f18475.get() <= 0) {
            return false;
        }
        for (InterfaceC18883 interfaceC18883 : this.f18478) {
            if (!interfaceC18883.mo10086()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f18475;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new IOException("Replacement recipe is closed");
            }
            long j = ((long) i) + ((long) 1);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f18475;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Replacement recipe closed twice");
        }
        if (iDecrementAndGet == 0) {
            C16059.m37963(this.f18478);
        }
    }

    @Override // l.InterfaceC6930
    /* JADX INFO: renamed from: ܿ */
    public final long mo11897() {
        return this.f18466;
    }

    @Override // l.InterfaceC6930
    /* JADX INFO: renamed from: ᩳ */
    public final long mo11898() {
        return this.f18469;
    }

    @Override // l.InterfaceC18883
    /* JADX INFO: renamed from: ֫ */
    public final void mo10084(int i, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2;
        long j;
        int i4 = i;
        AtomicInteger atomicInteger = this.f18475;
        String str = "Replacement recipe is closed";
        if (atomicInteger.get() <= 0) {
            throw new IOException("Replacement recipe is closed");
        }
        C9005.m23246(this.f18471, i4, i3);
        C9005.m23245(bArr.length, i2, i3);
        C13073 c13073 = this.f18474;
        long jM31683 = c13073.m31683();
        long j2 = 0;
        while (true) {
            bArr2 = this.f18470;
            j = this.f18467;
            if (j2 >= jM31683) {
                break;
            }
            long j3 = jM31683;
            long j4 = (j2 + jM31683) >>> 1;
            AtomicInteger atomicInteger2 = atomicInteger;
            if ((j * j4) + ((long) c13073.m31682(j4)) + ((long) bArr2.length) <= i4) {
                j2 = j4 + 1;
                jM31683 = j3;
            } else {
                jM31683 = j4;
            }
            atomicInteger = atomicInteger2;
        }
        AtomicInteger atomicInteger3 = atomicInteger;
        C3196 c3196M31679 = j2 < c13073.m31683() ? c13073.m31679(j2) : null;
        int i5 = i2;
        int i6 = i3;
        while (i6 > 0) {
            C9047 c9047 = this.f18476;
            if (c3196M31679 == null || !c3196M31679.m9826()) {
                long j5 = ((long) i4) - (j2 * j);
                int i7 = (int) j5;
                if (j5 != i7) {
                    throw new ArithmeticException();
                }
                C19631.m45125(i7, i5, i6, c9047, bArr);
                break;
            }
            long j6 = j2 * j;
            long jM9827 = ((long) c3196M31679.m9827()) + j6;
            long j7 = j;
            long length = ((long) bArr2.length) + jM9827;
            String str2 = str;
            long j8 = i4;
            if (j8 >= length) {
                j2++;
                c3196M31679.m9825();
            } else if (j8 >= jM9827) {
                int i8 = (int) (j8 - jM9827);
                int iMin = Math.min(i6, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr, i5, iMin);
                i4 += iMin;
                i5 += iMin;
                i6 -= iMin;
                if (i4 == length) {
                    j2++;
                    c3196M31679.m9825();
                }
            } else {
                int iMin2 = (int) Math.min(i6, jM9827 - j8);
                if (iMin2 <= 0) {
                    throw new IOException("Invalid replacement recipe mapping");
                }
                long j9 = j8 - j6;
                int i9 = (int) j9;
                if (j9 != i9) {
                    throw new ArithmeticException();
                }
                C19631.m45125(i9, i5, iMin2, c9047, bArr);
                i4 += iMin2;
                i5 += iMin2;
                i6 -= iMin2;
            }
            j = j7;
            str = str2;
        }
        if (atomicInteger3.get() <= 0) {
            throw new IOException(str);
        }
    }
}
