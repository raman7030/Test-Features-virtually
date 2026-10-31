package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۤܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10382 implements InterfaceC11098 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1358 f31219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10531 f31220;

    @Override // l.InterfaceC11098
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo10616() {
        return C1925.m6337(this);
    }

    public C10382(C10531 c10531, C1358 c1358) {
        this.f31220 = c10531;
        this.f31219 = c1358;
    }

    @Override // l.InterfaceC11098
    public final InputStream getInputStream() {
        return this.f31220.m26453(this.f31219);
    }

    @Override // l.InterfaceC11098
    public final long length() {
        return this.f31219.m4765();
    }
}
