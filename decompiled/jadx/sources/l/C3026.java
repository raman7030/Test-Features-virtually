package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 874F */
/* JADX INFO: loaded from: classes3.dex */
public final class C3026 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f9554;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19130 f9555;

    public C3026(InterfaceC21449 interfaceC21449, C19130 c19130) {
        this.f9554 = interfaceC21449;
        this.f9555 = c19130;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        this.f9554.mo5937(interfaceC0486);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        long jMo1620 = this.f9554.mo1620(c3104);
        this.f9555.m44183(c3104);
        return jMo1620;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        return this.f9554.read(bArr, i, i2);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f9554.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        return this.f9554.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f9554.close();
    }
}
