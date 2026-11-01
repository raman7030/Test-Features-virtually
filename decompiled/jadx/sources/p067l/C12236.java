package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12236 implements InterfaceC12916 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C3659 f34184;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C12377 f34185;

    @Override // p067l.InterfaceC12916
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo12627() {
        return C4198.m8510(this);
    }

    public C12236(C12377 c12377, C3659 c3659) {
        this.f34185 = c12377;
        this.f34184 = c3659;
    }

    @Override // p067l.InterfaceC12916
    public final InputStream getInputStream() {
        return this.f34185.m28486(this.f34184);
    }

    @Override // p067l.InterfaceC12916
    public final long length() {
        return this.f34184.m7003();
    }
}
