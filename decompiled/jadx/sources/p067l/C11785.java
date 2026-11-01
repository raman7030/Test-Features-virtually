package p067l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11785 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f32922;

    /* JADX INFO: renamed from: ۧ */
    public int f32923;

    /* JADX INFO: renamed from: ᩳ */
    public int f32926;

    /* JADX INFO: renamed from: ܿ */
    public final byte[][] f32925 = new byte[16][];

    /* JADX INFO: renamed from: ܽ */
    public int[] f32924 = new int[4];

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m27030(int i, byte[] bArr) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32922;
            if (i2 >= iArr.length) {
                int i3 = this.f32926;
                iArr[i3] = i;
                this.f32925[i3] = bArr;
                this.f32926 = (i3 + 1) % iArr.length;
                return;
            }
            if (iArr[i2] == i) {
                this.f32925[i2] = bArr;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] m27031(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32922;
            if (i2 >= iArr.length) {
                bArr = null;
                break;
            }
            if (iArr[i2] == i && (bArr = this.f32925[i2]) != null) {
                break;
            }
            i2++;
        }
        return bArr;
    }

    public C11785() {
        int[] iArr = new int[16];
        this.f32922 = iArr;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f32924, -1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0024 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002c A[LOOP:1: B:20:0x001f->B:25:0x002c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:30:0x0034 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0039 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m27028(C11785 c11785, int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int[] iArr;
        byte[] bArr;
        synchronized (c11785) {
            if (z) {
                i2 = 0;
                while (true) {
                    i3 = c11785.f32923;
                    if (i2 < i3) {
                        z2 = false;
                        break;
                    }
                    if (c11785.f32924[i2] == i) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    return false;
                }
                iArr = c11785.f32924;
                if (i3 == iArr.length) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
                    c11785.f32924 = iArrCopyOf;
                    Arrays.fill(iArrCopyOf, c11785.f32923, iArrCopyOf.length, -1);
                }
                int[] iArr2 = c11785.f32924;
                int i4 = c11785.f32923;
                c11785.f32923 = i4 + 1;
                iArr2[i4] = i;
                return true;
            }
            int i5 = 0;
            while (true) {
                int[] iArr3 = c11785.f32922;
                if (i5 >= iArr3.length) {
                    bArr = null;
                    break;
                }
                if (iArr3[i5] == i && (bArr = c11785.f32925[i5]) != null) {
                    break;
                }
                i5++;
            }
            if (bArr != null) {
                return false;
            }
            i2 = 0;
            while (true) {
                i3 = c11785.f32923;
                if (i2 < i3) {
                    z2 = false;
                    break;
                }
                if (c11785.f32924[i2] == i) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return false;
            }
            iArr = c11785.f32924;
            if (i3 == iArr.length) {
                int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length * 2);
                c11785.f32924 = iArrCopyOf2;
                Arrays.fill(iArrCopyOf2, c11785.f32923, iArrCopyOf2.length, -1);
            }
            int[] iArr4 = c11785.f32924;
            int i6 = c11785.f32923;
            c11785.f32923 = i6 + 1;
            iArr4[i6] = i;
            return true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27027(C11785 c11785) {
        synchronized (c11785) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m27026(int i, C11785 c11785) {
        synchronized (c11785) {
            int i2 = 0;
            while (true) {
                int i3 = c11785.f32923;
                if (i2 >= i3) {
                    break;
                }
                int[] iArr = c11785.f32924;
                if (iArr[i2] == i) {
                    int i4 = i3 - 1;
                    c11785.f32923 = i4;
                    iArr[i2] = iArr[i4];
                    iArr[i4] = -1;
                    break;
                }
                i2++;
            }
            c11785.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m27029(int i, C11785 c11785) {
        synchronized (c11785) {
            while (true) {
                boolean z = false;
                for (int i2 = 0; i2 < c11785.f32923; i2++) {
                    if (c11785.f32924[i2] == i) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    try {
                        c11785.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading smali cache data", e);
                    }
                }
            }
        }
    }
}
