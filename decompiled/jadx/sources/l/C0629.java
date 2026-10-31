package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0629 implements InterfaceC1377 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C3431 f2404;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14013 f2405;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2041 f2406;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC18975 f2407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f2409;

    @Override // l.InterfaceC1377
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int mo2559(byte[] bArr) {
        return C5611.m15916(this, bArr);
    }

    public C0629(C14740 c14740, C2041 c2041, C3431 c3431, C14013 c14013) {
        this.f2407 = c14740;
        this.f2406 = c2041;
        this.f2404 = c3431;
        this.f2405 = c14013;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Integer m2558(C0629 c0629, byte[] bArr, int i, int i2) {
        InterfaceC18975 interfaceC18975 = (InterfaceC18975) c0629.f2404.get();
        c0629.f2407 = interfaceC18975;
        return Integer.valueOf(interfaceC18975.mo35043(c0629.f2409, bArr, i, i2));
    }

    @Override // l.InterfaceC1377
    public final void seek(long j) {
        this.f2409 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2408) {
            return;
        }
        try {
            this.f2407.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f2405.run();
        } catch (IOException e2) {
            e = C4863.m14183(e, e2);
        }
        this.f2408 = true;
        if (e != null) {
            throw e;
        }
    }

    @Override // l.InterfaceC1377
    public final int read(final byte[] bArr, final int i, final int i2) throws IOException {
        int iIntValue;
        if (!this.f2408) {
            C11003.checkFromIndexSize(i, i2, bArr.length);
            try {
                iIntValue = this.f2407.mo35043(this.f2409, bArr, i, i2);
            } catch (C1092 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C10951 e2) {
                iIntValue = ((Integer) C4863.m14189(this.f2406.f6836, e2, new InterfaceC16151() { // from class: l.᩵᩵᩻
                    @Override // l.InterfaceC16151
                    public final Object get() {
                        return C0629.m2558(this.f63590, bArr, i, i2);
                    }
                })).intValue();
            }
            if (iIntValue > 0) {
                this.f2409 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }
}
