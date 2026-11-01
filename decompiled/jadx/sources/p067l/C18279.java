package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܽܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 53XL */
/* JADX INFO: loaded from: classes4.dex */
public final class C18279 implements InterfaceC12916 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f54569;

    @Override // p067l.InterfaceC12916
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo12627() {
        return C4198.m8510(this);
    }

    public C18279(AbstractC17043 abstractC17043) {
        this.f54569 = abstractC17043;
    }

    @Override // p067l.InterfaceC12916
    public final InputStream getInputStream() {
        return this.f54569.mo29987();
    }

    @Override // p067l.InterfaceC12916
    public final long length() {
        return this.f54569.mo25101();
    }
}
