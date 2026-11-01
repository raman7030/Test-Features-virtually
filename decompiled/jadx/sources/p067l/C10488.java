package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A88Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C10488 extends AbstractC11159 {

    /* JADX INFO: renamed from: ܽ */
    public final C7135 f29030;

    public C10488(C7135 c7135) {
        this.f29030 = c7135;
    }

    @Override // p067l.AbstractC11159
    /* JADX INFO: renamed from: ֫ */
    public final int mo24213(byte[] bArr, byte[] bArr2) throws IOException {
        byte[] bArrM16411 = this.f29030.m16411(bArr);
        System.arraycopy(bArrM16411, 0, bArr2, 0, bArrM16411.length);
        return bArrM16411.length;
    }

    @Override // p067l.AbstractC11159
    /* JADX INFO: renamed from: ۧ */
    public final void mo24214(byte[] bArr) {
        this.f29030.write(bArr);
    }

    @Override // p067l.AbstractC11159
    /* JADX INFO: renamed from: ֫ */
    public final int mo24212(byte[] bArr) {
        byte[] bArr2 = this.f29030.read();
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return bArr2.length;
    }
}
