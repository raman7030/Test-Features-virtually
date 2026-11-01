package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֡᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2967 implements InterfaceC3678 {

    /* JADX INFO: renamed from: ۗ */
    public final C5630 f5177;

    /* JADX INFO: renamed from: ۙ */
    public final C15687 f5178;

    /* JADX INFO: renamed from: ۬ */
    public final C4309 f5179;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC20403 f5180;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f5181;

    /* JADX INFO: renamed from: ᩹ */
    public long f5182;

    @Override // p067l.InterfaceC3678
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int mo4915(byte[] bArr) {
        return C7702.m17837(this, bArr);
    }

    public C2967(C16378 c16378, C4309 c4309, C5630 c5630, C15687 c15687) {
        this.f5180 = c16378;
        this.f5179 = c4309;
        this.f5177 = c5630;
        this.f5178 = c15687;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Integer m4914(C2967 c2967, byte[] bArr, int i, int i2) {
        InterfaceC20403 interfaceC20403 = (InterfaceC20403) c2967.f5177.get();
        c2967.f5180 = interfaceC20403;
        return Integer.valueOf(interfaceC20403.mo37190(c2967.f5182, bArr, i, i2));
    }

    @Override // p067l.InterfaceC3678
    public final void seek(long j) {
        this.f5182 = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5181) {
            return;
        }
        try {
            this.f5180.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f5178.run();
        } catch (IOException e2) {
            e = C6991.m16064(e, e2);
        }
        this.f5181 = true;
        if (e != null) {
            throw e;
        }
    }

    @Override // p067l.InterfaceC3678
    public final int read(final byte[] bArr, final int i, final int i2) throws IOException {
        int iIntValue;
        if (!this.f5181) {
            C12826.checkFromIndexSize(i, i2, bArr.length);
            try {
                iIntValue = this.f5180.mo37190(this.f5182, bArr, i, i2);
            } catch (C3406 e) {
                throw new IOException(e.getMessage(), e);
            } catch (C12776 e2) {
                iIntValue = ((Integer) C6991.m16070(this.f5179.f9619, e2, new InterfaceC17719() { // from class: l.᩵᩵᩻
                    @Override // p067l.InterfaceC17719
                    public final Object get() {
                        return C2967.m4914(this.f66211, bArr, i, i2);
                    }
                })).intValue();
            }
            if (iIntValue > 0) {
                this.f5182 += (long) iIntValue;
            }
            return iIntValue;
        }
        throw new IOException("Stream is closed");
    }
}
