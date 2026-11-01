package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܳۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15996 extends AbstractC4424 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC12257 f46331;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C19350 f46332;

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo16033(int i) {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15996(C4598 c4598, C19350 c19350, InterfaceC12257 interfaceC12257) {
        super(c4598);
        this.f46332 = c19350;
        this.f46331 = interfaceC12257;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        final C19350 c19350 = this.f46332;
        final InterfaceC12257 interfaceC12257 = this.f46331;
        return new ISequentialOutStream() { // from class: l.ܿۛܳ
            @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
            public final int write(ByteBuffer byteBuffer) throws SevenZipException {
                C19350 c19351 = c19350;
                InterfaceC12257 interfaceC12258 = interfaceC12257;
                try {
                    c19351.f57763 = true;
                    return interfaceC12258.write(byteBuffer);
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            }
        };
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܽ */
    public final void mo16035() {
        this.f46332.f57760 = true;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f46332.f57760;
    }
}
