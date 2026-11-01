package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ܺܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R70I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17631 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final long f52677;

    /* JADX INFO: renamed from: ۙ */
    public final long f52678;

    /* JADX INFO: renamed from: ۤ */
    public final C10967 f52679;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC20315[] f52680;

    /* JADX INFO: renamed from: ۬ */
    public final C2919 f52681;

    /* JADX INFO: renamed from: ᩶ */
    public final long f52682;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicBoolean f52683 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩹ */
    public final C13868 f52684;

    public C17631(long j, long j2, long j3, C10967 c10967, C13868 c13868) {
        this.f52677 = j;
        this.f52682 = j2;
        this.f52678 = j3;
        this.f52679 = c10967;
        this.f52684 = c13868;
        this.f52680 = C21026.m47417(c10967);
        this.f52681 = new C2919(c10967);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m40153() {
        return this.f52678;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40152(byte[] bArr, int i, InterfaceC18588 interfaceC18588) {
        m40157();
        C2919 c2919 = this.f52681;
        c2919.getClass();
        C12826.requireNonNull(bArr, "pattern");
        int iM4762 = c2919.m4762();
        if (i < 0 || i > iM4762) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "fromIndex="));
        }
        if (bArr.length != 0) {
            int i2 = iM4762 - i;
            if (bArr.length > i2) {
                i = -1;
            } else {
                InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
                int[] iArrM25188 = C10927.m25188(bArr);
                int iMin = Math.min(65536, i2);
                byte[] bArr2 = new byte[iMin];
                int i3 = 0;
                while (i < iM4762 && !interfaceC18588M40721.mo3924()) {
                    int iMin2 = Math.min(iMin, iM4762 - i);
                    c2919.m4763(i, iMin2, bArr2);
                    for (int i4 = 0; i4 < iMin2; i4++) {
                        byte b = bArr2[i4];
                        while (i3 > 0 && bArr[i3] != b) {
                            i3 = iArrM25188[i3 - 1];
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
        m40157();
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX INFO: renamed from: ۧ */
    public final int m40155(byte[] bArr, int i, InterfaceC18588 interfaceC18588) {
        int iMin;
        m40157();
        C2919 c2919 = this.f52681;
        c2919.getClass();
        C12826.requireNonNull(bArr, "pattern");
        int iM4762 = c2919.m4762();
        if (i < 0) {
            iMin = -1;
        } else if (bArr.length == 0) {
            iMin = Math.min(i, iM4762);
        } else {
            int iMin2 = Math.min(i, iM4762 - bArr.length);
            if (iMin2 < 0) {
                iMin = -1;
            } else {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr2[i2] = bArr[(bArr.length - i2) - 1];
                }
                int[] iArrM25188 = C10927.m25188(bArr2);
                InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
                int iMin3 = Math.min(65536, bArr.length + iMin2);
                byte[] bArr3 = new byte[iMin3];
                int length2 = (iMin2 + bArr.length) - 1;
                int i3 = 0;
                while (length2 >= 0 && !interfaceC18588M40721.mo3924()) {
                    int iMax = Math.max(0, (length2 - iMin3) + 1);
                    int i4 = length2 - iMax;
                    c2919.m4763(iMax, i4 + 1, bArr3);
                    while (i4 >= 0) {
                        byte b = bArr3[i4];
                        while (i3 > 0 && bArr2[i3] != b) {
                            i3 = iArrM25188[i3 - 1];
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
        m40157();
        return iMin;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40154(OutputStream outputStream, int i) throws IOException {
        m40157();
        this.f52681.m4764(outputStream, i);
        m40157();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f52683.compareAndSet(false, true)) {
            m40151(this.f52680);
        }
    }

    public final int length() {
        if (!this.f52683.get()) {
            return this.f52681.m4762();
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40156() {
        if (this.f52683.get()) {
            throw new IllegalStateException("HexSnapshot is closed");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40157() {
        if (!this.f52683.get()) {
            for (InterfaceC20315 interfaceC20315 : this.f52680) {
                if (!interfaceC20315.mo12119()) {
                    throw new C7614();
                }
            }
            return;
        }
        throw new IllegalStateException("HexSnapshot is closed");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m40151(InterfaceC20315[] interfaceC20315Arr) {
        IOException iOException = null;
        for (InterfaceC20315 interfaceC20315 : interfaceC20315Arr) {
            try {
                interfaceC20315.close();
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
