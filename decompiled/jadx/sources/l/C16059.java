package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C16059 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f49514;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f49515;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9047 f49516;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] f49517;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0579 f49518;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f49519;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f49520 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12100 f49521;

    public C16059(long j, long j2, long j3, C9047 c9047, C12100 c12100) {
        this.f49514 = j;
        this.f49519 = j2;
        this.f49515 = j3;
        this.f49516 = c9047;
        this.f49521 = c12100;
        this.f49517 = C19631.m45121(c9047);
        this.f49518 = new C0579(c9047);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m37965() {
        return this.f49515;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37964(byte[] bArr, int i, InterfaceC17066 interfaceC17066) {
        m37969();
        C0579 c0579 = this.f49518;
        c0579.getClass();
        C11003.requireNonNull(bArr, "pattern");
        int iM2391 = c0579.m2391();
        if (i < 0 || i > iM2391) {
            throw new IndexOutOfBoundsException(C19370.m44628(i, "fromIndex="));
        }
        if (bArr.length != 0) {
            int i2 = iM2391 - i;
            if (bArr.length > i2) {
                i = -1;
            } else {
                InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
                int[] iArrM23244 = C9005.m23244(bArr);
                int iMin = Math.min(65536, i2);
                byte[] bArr2 = new byte[iMin];
                int i3 = 0;
                while (i < iM2391 && !interfaceC17066M38504.mo1526()) {
                    int iMin2 = Math.min(iMin, iM2391 - i);
                    c0579.m2392(i, iMin2, bArr2);
                    for (int i4 = 0; i4 < iMin2; i4++) {
                        byte b = bArr2[i4];
                        while (i3 > 0 && bArr[i3] != b) {
                            i3 = iArrM23244[i3 - 1];
                        }
                        if (bArr[i3] == b && (i3 = i3 + 1) == bArr.length) {
                            i = ((i + i4) - bArr.length) + 1;
                        }
                    }
                    i += iMin2;
                }
                i = -1;
            }
        }
        m37969();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37967(byte[] bArr, int i, InterfaceC17066 interfaceC17066) {
        int iMin;
        m37969();
        C0579 c0579 = this.f49518;
        c0579.getClass();
        C11003.requireNonNull(bArr, "pattern");
        int iM2391 = c0579.m2391();
        if (i < 0) {
            iMin = -1;
        } else if (bArr.length == 0) {
            iMin = Math.min(i, iM2391);
        } else {
            int iMin2 = Math.min(i, iM2391 - bArr.length);
            if (iMin2 < 0) {
                iMin = -1;
            } else {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr2[i2] = bArr[(bArr.length - i2) - 1];
                }
                int[] iArrM23244 = C9005.m23244(bArr2);
                InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
                int iMin3 = Math.min(65536, bArr.length + iMin2);
                byte[] bArr3 = new byte[iMin3];
                int length2 = (iMin2 + bArr.length) - 1;
                int i3 = 0;
                while (length2 >= 0 && !interfaceC17066M38504.mo1526()) {
                    int iMax = Math.max(0, (length2 - iMin3) + 1);
                    int i4 = length2 - iMax;
                    c0579.m2392(iMax, i4 + 1, bArr3);
                    while (i4 >= 0) {
                        byte b = bArr3[i4];
                        while (i3 > 0 && bArr2[i3] != b) {
                            i3 = iArrM23244[i3 - 1];
                        }
                        if (bArr2[i3] == b && (i3 = i3 + 1) == length) {
                            iMin = iMax + i4;
                        } else {
                            i4--;
                        }
                    }
                    length2 = iMax - 1;
                }
                iMin = -1;
            }
        }
        m37969();
        return iMin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37966(OutputStream outputStream, int i) throws IOException {
        m37969();
        this.f49518.m2393(outputStream, i);
        m37969();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f49520.compareAndSet(false, true)) {
            m37963(this.f49517);
        }
    }

    public final int length() {
        if (!this.f49520.get()) {
            return this.f49518.m2391();
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37968() {
        if (this.f49520.get()) {
            throw new IllegalStateException("HexSnapshot is closed");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m37969() {
        if (!this.f49520.get()) {
            for (InterfaceC18883 interfaceC18883 : this.f49517) {
                if (!interfaceC18883.mo10086()) {
                    throw new C5519();
                }
            }
            return;
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37963(InterfaceC18883[] interfaceC18883Arr) {
        IOException iOException = null;
        for (InterfaceC18883 interfaceC18883 : interfaceC18883Arr) {
            try {
                interfaceC18883.close();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    iOException.addSuppressed(e);
                }
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }
}
