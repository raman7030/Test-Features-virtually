package l;

import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۙ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4L7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4647 implements InterfaceC3569 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3236 f14739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5458 f14740;

    public C4647(C3236 c3236, C5458 c5458) {
        this.f14739 = c3236;
        this.f14740 = c5458;
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10874(int i, byte[] bArr) {
        this.f14740.m15562(new ByteArrayInputStream(bArr, 0, i), null);
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10875(ByteBuffer byteBuffer) {
        this.f14740.m15563(byteBuffer);
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10873(int i) {
        this.f14739.f10185.m51045(i);
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo10876() {
        this.f14739.f10183 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f14739.f10185.m51053();
    }
}
