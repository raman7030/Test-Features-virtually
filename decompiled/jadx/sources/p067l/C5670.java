package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes3.dex */
public final class C5670 implements InterfaceC15401 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C14281 f13796;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C9367 f13797;

    @Override // p067l.InterfaceC12916
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InputStream mo12627() {
        return C4198.m8510(this);
    }

    public C5670(C14281 c14281, C9367 c9367) {
        this.f13796 = c14281;
        this.f13797 = c9367;
    }

    @Override // p067l.InterfaceC15401
    /* JADX INFO: renamed from: ۧ */
    public final C14281 mo12628() {
        return this.f13796;
    }

    @Override // p067l.InterfaceC12916
    public final InputStream getInputStream() {
        return this.f13797.getInputStream();
    }

    @Override // p067l.InterfaceC12916
    public final long length() {
        return this.f13797.length();
    }
}
