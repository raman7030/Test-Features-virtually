package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C16378 implements InterfaceC20403 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C6991 f48129;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9578 f48130;

    public C16378(C6991 c6991, C9578 c9578) {
        this.f48129 = c6991;
        this.f48130 = c9578;
    }

    @Override // p067l.InterfaceC20403
    /* JADX INFO: renamed from: ֫ */
    public final int mo37190(long j, byte[] bArr, int i, int i2) {
        int iM22312 = this.f48130.m22312(j, bArr, i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (iM22312 == 0) {
            return -1;
        }
        return iM22312;
    }

    @Override // p067l.InterfaceC20403
    public final void close() throws IOException {
        IOException iOExceptionM16066 = this.f48129.m16066(this.f48130, (IOException) null);
        if (iOExceptionM16066 != null) {
            throw iOExceptionM16066;
        }
    }
}
