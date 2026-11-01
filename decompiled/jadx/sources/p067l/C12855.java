package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12855 implements InterfaceC5761 {

    /* JADX INFO: renamed from: ۙ */
    public final OutputStream f36159;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f36160;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f36161 = new byte[32768];

    /* JADX INFO: renamed from: ᩹ */
    public final C9760 f36162;

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12853(int i) {
    }

    public C12855(OutputStream outputStream, C9760 c9760) {
        this.f36159 = outputStream;
        this.f36162 = c9760;
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12854(int i, byte[] bArr) throws IOException {
        AbstractC24196.m53499(this.f36162);
        this.f36159.write(bArr, 0, i);
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ֫ */
    public final void mo12855(ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.hasRemaining()) {
            AbstractC24196.m53499(this.f36162);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = this.f36161;
            int iMin = Math.min(iRemaining, bArr.length);
            byteBuffer.get(bArr, 0, iMin);
            this.f36159.write(bArr, 0, iMin);
        }
    }

    @Override // p067l.InterfaceC5761
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo12856() {
        this.f36160 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f36162.mo3924();
    }
}
