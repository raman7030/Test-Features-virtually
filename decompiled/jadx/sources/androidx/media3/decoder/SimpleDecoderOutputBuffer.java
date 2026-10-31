package androidx.media3.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l.AbstractC20432;
import l.InterfaceC22548;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends AbstractC20432 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC22548 f1;

    public SimpleDecoderOutputBuffer(InterfaceC22548 interfaceC22548) {
        this.f1 = interfaceC22548;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m6(int i, long j) {
        this.f65926 = j;
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.f0 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.f0.position(0);
        this.f0.limit(i);
        return this.f0;
    }

    @Override // l.AbstractC20432, l.AbstractC4204
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7() {
        super.mo7();
        ByteBuffer byteBuffer = this.f0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // l.AbstractC20432
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo8() {
        this.f1.mo6995(this);
    }
}
