package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C11034 implements InterfaceC3569 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream f33164;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f33165;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f33166 = new byte[32768];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7777 f33167;

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10873(int i) {
    }

    public C11034(OutputStream outputStream, C7777 c7777) {
        this.f33164 = outputStream;
        this.f33167 = c7777;
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10874(int i, byte[] bArr) throws IOException {
        AbstractC22967.m51107(this.f33167);
        this.f33164.write(bArr, 0, i);
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ֫ */
    public final void mo10875(ByteBuffer byteBuffer) throws IOException {
        while (byteBuffer.hasRemaining()) {
            AbstractC22967.m51107(this.f33167);
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = this.f33166;
            int iMin = Math.min(iRemaining, bArr.length);
            byteBuffer.get(bArr, 0, iMin);
            this.f33164.write(bArr, 0, iMin);
        }
    }

    @Override // l.InterfaceC3569
    /* JADX INFO: renamed from: ܳ֫ */
    public final void mo10876() {
        this.f33165 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f33167.mo1526();
    }
}
