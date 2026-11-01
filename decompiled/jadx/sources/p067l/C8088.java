package p067l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۛۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C8088 implements InterfaceC20315, InterfaceC8955, InterfaceC25048 {

    /* JADX INFO: renamed from: ֫֫ */
    public final long f21321;

    /* JADX INFO: renamed from: ۗ */
    public final long f21322;

    /* JADX INFO: renamed from: ۙ */
    public final int f21323;

    /* JADX INFO: renamed from: ۛ */
    public final long f21324;

    /* JADX INFO: renamed from: ۟ */
    public final byte[] f21325;

    /* JADX INFO: renamed from: ۤ */
    public final int f21326;

    /* JADX INFO: renamed from: ۨ */
    public final long f21327;

    /* JADX INFO: renamed from: ۫ */
    public final long f21328;

    /* JADX INFO: renamed from: ۬ */
    public final C14793 f21329;

    /* JADX INFO: renamed from: ܰ */
    public final AtomicInteger f21330 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩶ */
    public final C10967 f21331;

    /* JADX INFO: renamed from: ᩸ */
    public final int f21332;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC20315[] f21333;

    /* JADX INFO: renamed from: ᩺ */
    public final int f21334;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ int m18757(C8088 c8088) {
        return c8088.f21332;
    }

    /* JADX INFO: renamed from: ۜ */
    public static /* bridge */ /* synthetic */ int m18758(C8088 c8088) {
        return c8088.f21334;
    }

    /* JADX INFO: renamed from: ۢ */
    public static /* bridge */ /* synthetic */ byte[] m18759(C8088 c8088) {
        return c8088.f21325;
    }

    /* JADX INFO: renamed from: ܳ */
    public static /* bridge */ /* synthetic */ int m18761(C8088 c8088) {
        return c8088.f21326;
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* bridge */ /* synthetic */ C10967 m18762(C8088 c8088) {
        return c8088.f21331;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* bridge */ /* synthetic */ C14793 m18764(C8088 c8088) {
        return c8088.f21329;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12116() {
        return this;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ܽ */
    public final long mo12120() {
        return mo13833();
    }

    public C8088(C10967 c10967, int i, int i2, int i3, byte[] bArr, C14793 c14793) {
        if (i < 0 || i2 <= 0 || i3 <= 0 || c14793.m33771() <= 0 || !c14793.m33769(i3)) {
            throw new IllegalArgumentException("Invalid replacement recipe");
        }
        long j = i3;
        long jM33770 = ((long) c14793.m33770(c14793.m33771() - 1)) + j;
        long j2 = i;
        long length = ((((long) bArr.length) - j) * c14793.m33771()) + j2;
        if (jM33770 > j2 || length != i2) {
            throw new IllegalArgumentException("Invalid replacement recipe mapping");
        }
        ArrayList arrayList = new ArrayList();
        C19644.m44618(c10967, arrayList);
        Iterator it = arrayList.iterator();
        int iMax = 1;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C8088) it.next()).f21323 + 1);
        }
        if (iMax > 256) {
            throw new IllegalStateException("Replacement recipe dependency is too deep");
        }
        this.f21331 = c10967;
        this.f21332 = i;
        this.f21326 = i2;
        this.f21334 = i3;
        this.f21325 = bArr;
        this.f21329 = c14793;
        this.f21322 = ((long) bArr.length) - j;
        this.f21323 = iMax;
        long jM55743 = C0892.m55743(bArr.length, C0892.m55743(c14793.m33766(), 88L));
        this.f21327 = jM55743;
        this.f21328 = C0892.m55743(jM55743, C0892.m55743(C19644.m44612(c10967), C0892.m55743(C21026.m47414(c10967), C0892.m55743(C21026.m47424(c10967), C21026.m47438(c10967)))));
        long jM55744 = C0892.m55743(jM55743, C0892.m55743(C21026.m47424(c10967), C0892.m55743(C21026.m47414(c10967), C21026.m47438(c10967))));
        this.f21324 = jM55744;
        this.f21321 = C0892.m55743(jM55744, C21026.m47425(c10967).m14237());
        this.f21333 = C21026.m47417(c10967);
    }

    @Override // p067l.InterfaceC25048
    /* JADX INFO: renamed from: ֫ */
    public final void mo18767(ArrayDeque arrayDeque) {
        for (InterfaceC20315 interfaceC20315 : this.f21333) {
            arrayDeque.push(interfaceC20315);
        }
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f21326;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo12119() {
        if (this.f21330.get() <= 0) {
            return false;
        }
        for (InterfaceC20315 interfaceC20315 : this.f21333) {
            if (!interfaceC20315.mo12119()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC20315 mo12121() throws IOException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f21330;
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
        AtomicInteger atomicInteger = this.f21330;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Replacement recipe closed twice");
        }
        if (iDecrementAndGet == 0) {
            C17631.m40151(this.f21333);
        }
    }

    @Override // p067l.InterfaceC8955
    /* JADX INFO: renamed from: ܿ */
    public final long mo13833() {
        return this.f21321;
    }

    @Override // p067l.InterfaceC8955
    /* JADX INFO: renamed from: ᩳ */
    public final long mo13834() {
        return this.f21324;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2;
        long j;
        int i4 = i;
        AtomicInteger atomicInteger = this.f21330;
        String str = "Replacement recipe is closed";
        if (atomicInteger.get() <= 0) {
            throw new IOException("Replacement recipe is closed");
        }
        C10927.m25190(this.f21326, i4, i3);
        C10927.m25189(bArr.length, i2, i3);
        C14793 c14793 = this.f21329;
        long jM33771 = c14793.m33771();
        long j2 = 0;
        while (true) {
            bArr2 = this.f21325;
            j = this.f21322;
            if (j2 >= jM33771) {
                break;
            }
            long j3 = jM33771;
            long j4 = (j2 + jM33771) >>> 1;
            AtomicInteger atomicInteger2 = atomicInteger;
            if ((j * j4) + ((long) c14793.m33770(j4)) + ((long) bArr2.length) <= i4) {
                j2 = j4 + 1;
                jM33771 = j3;
            } else {
                jM33771 = j4;
            }
            atomicInteger = atomicInteger2;
        }
        AtomicInteger atomicInteger3 = atomicInteger;
        C5406 c5406M33767 = j2 < c14793.m33771() ? c14793.m33767(j2) : null;
        int i5 = i2;
        int i6 = i3;
        while (i6 > 0) {
            C10967 c10967 = this.f21331;
            if (c5406M33767 == null || !c5406M33767.m11871()) {
                long j5 = ((long) i4) - (j2 * j);
                int i7 = (int) j5;
                if (j5 != i7) {
                    throw new ArithmeticException();
                }
                C21026.m47421(i7, i5, i6, c10967, bArr);
                break;
            }
            long j6 = j2 * j;
            long jM11872 = ((long) c5406M33767.m11872()) + j6;
            long j7 = j;
            long length = ((long) bArr2.length) + jM11872;
            String str2 = str;
            long j8 = i4;
            if (j8 >= length) {
                j2++;
                c5406M33767.m11870();
            } else if (j8 >= jM11872) {
                int i8 = (int) (j8 - jM11872);
                int iMin = Math.min(i6, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr, i5, iMin);
                i4 += iMin;
                i5 += iMin;
                i6 -= iMin;
                if (i4 == length) {
                    j2++;
                    c5406M33767.m11870();
                }
            } else {
                int iMin2 = (int) Math.min(i6, jM11872 - j8);
                if (iMin2 <= 0) {
                    throw new IOException("Invalid replacement recipe mapping");
                }
                long j9 = j8 - j6;
                int i9 = (int) j9;
                if (j9 != i9) {
                    throw new ArithmeticException();
                }
                C21026.m47421(i9, i5, iMin2, c10967, bArr);
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
