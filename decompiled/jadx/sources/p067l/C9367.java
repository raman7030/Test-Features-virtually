package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9367 implements InterfaceC12916 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f25527;

    @Override // p067l.InterfaceC12916
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo12627() {
        return C4198.m8510(this);
    }

    @Override // p067l.InterfaceC12916
    public final InputStream getInputStream() {
        return new C11208(this.f25527);
    }

    public C9367(byte[] bArr) {
        this.f25527 = bArr;
    }

    @Override // p067l.InterfaceC12916
    public final long length() {
        return this.f25527.length;
    }
}
