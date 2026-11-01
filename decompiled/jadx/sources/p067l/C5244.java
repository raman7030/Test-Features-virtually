package p067l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 874F */
/* JADX INFO: loaded from: classes3.dex */
public final class C5244 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 f12356;

    /* JADX INFO: renamed from: ۧ */
    public final C20549 f12357;

    public C5244(InterfaceC22753 interfaceC22753, C20549 c20549) {
        this.f12356 = interfaceC22753;
        this.f12357 = c20549;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        this.f12356.mo8132(interfaceC2830);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) {
        long jMo4020 = this.f12356.mo4020(c5318);
        this.f12357.m46477(c5318);
        return jMo4020;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) {
        return this.f12356.read(bArr, i, i2);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f12356.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        return this.f12356.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f12356.close();
    }
}
