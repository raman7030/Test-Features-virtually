package l;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W7A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9907 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f29964;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29965;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29968;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[][] f29967 = new byte[16][];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f29966 = new int[4];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25013(int i, byte[] bArr) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29964;
            if (i2 >= iArr.length) {
                int i3 = this.f29968;
                iArr[i3] = i;
                this.f29967[i3] = bArr;
                this.f29968 = (i3 + 1) % iArr.length;
                return;
            }
            if (iArr[i2] == i) {
                this.f29967[i2] = bArr;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m25014(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29964;
            if (i2 >= iArr.length) {
                bArr = null;
                break;
            }
            if (iArr[i2] == i && (bArr = this.f29967[i2]) != null) {
                break;
            }
            i2++;
        }
        return bArr;
    }

    public C9907() {
        int[] iArr = new int[16];
        this.f29964 = iArr;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f29966, -1);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0024 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002c A[LOOP:1: B:20:0x001f->B:25:0x002c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:30:0x0034 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0039 A[Catch: all -> 0x0055, TryCatch #0 {, blocks: (B:7:0x0006, B:9:0x000b, B:11:0x000f, B:20:0x001f, B:22:0x0024, B:30:0x0034, B:32:0x0039, B:33:0x0049), top: B:39:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x002f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x002a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25011(C9907 c9907, int i, boolean z) {
        int i2;
        int i3;
        boolean z2;
        int[] iArr;
        byte[] bArr;
        synchronized (c9907) {
            if (z) {
                i2 = 0;
                while (true) {
                    i3 = c9907.f29965;
                    if (i2 < i3) {
                        z2 = false;
                        break;
                    }
                    if (c9907.f29966[i2] == i) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
                if (z2) {
                    return false;
                }
                iArr = c9907.f29966;
                if (i3 == iArr.length) {
                    int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
                    c9907.f29966 = iArrCopyOf;
                    Arrays.fill(iArrCopyOf, c9907.f29965, iArrCopyOf.length, -1);
                }
                int[] iArr2 = c9907.f29966;
                int i4 = c9907.f29965;
                c9907.f29965 = i4 + 1;
                iArr2[i4] = i;
                return true;
            }
            int i5 = 0;
            while (true) {
                int[] iArr3 = c9907.f29964;
                if (i5 >= iArr3.length) {
                    bArr = null;
                    break;
                }
                if (iArr3[i5] == i && (bArr = c9907.f29967[i5]) != null) {
                    break;
                }
                i5++;
            }
            if (bArr != null) {
                return false;
            }
            i2 = 0;
            while (true) {
                i3 = c9907.f29965;
                if (i2 < i3) {
                    z2 = false;
                    break;
                }
                if (c9907.f29966[i2] == i) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return false;
            }
            iArr = c9907.f29966;
            if (i3 == iArr.length) {
                int[] iArrCopyOf2 = Arrays.copyOf(iArr, iArr.length * 2);
                c9907.f29966 = iArrCopyOf2;
                Arrays.fill(iArrCopyOf2, c9907.f29965, iArrCopyOf2.length, -1);
            }
            int[] iArr4 = c9907.f29966;
            int i6 = c9907.f29965;
            c9907.f29965 = i6 + 1;
            iArr4[i6] = i;
            return true;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25010(C9907 c9907) {
        synchronized (c9907) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25009(int i, C9907 c9907) {
        synchronized (c9907) {
            int i2 = 0;
            while (true) {
                int i3 = c9907.f29965;
                if (i2 >= i3) {
                    break;
                }
                int[] iArr = c9907.f29966;
                if (iArr[i2] == i) {
                    int i4 = i3 - 1;
                    c9907.f29965 = i4;
                    iArr[i2] = iArr[i4];
                    iArr[i4] = -1;
                    break;
                }
                i2++;
            }
            c9907.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25012(int i, C9907 c9907) {
        synchronized (c9907) {
            while (true) {
                boolean z = false;
                for (int i2 = 0; i2 < c9907.f29965; i2++) {
                    try {
                        if (c9907.f29966[i2] == i) {
                            z = true;
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    try {
                        c9907.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading smali cache data", e);
                    }
                }
            }
        }
    }
}
