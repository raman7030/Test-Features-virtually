package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܳۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C14339 extends AbstractC2162 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10405 f43239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17868 f43240;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo14152(int i) {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14155(int i) {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14156() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14339(C2346 c2346, C17868 c17868, InterfaceC10405 interfaceC10405) {
        super(c2346);
        this.f43240 = c17868;
        this.f43239 = interfaceC10405;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo14153() {
        final C17868 c17868 = this.f43240;
        final InterfaceC10405 interfaceC10405 = this.f43239;
        return new ISequentialOutStream() { // from class: l.ܿۛܳ
            @Override // net.sf.sevenzipjbinding.ISequentialOutStream
            public final int write(ByteBuffer byteBuffer) throws SevenZipException {
                C17868 c17869 = c17868;
                InterfaceC10405 interfaceC10406 = interfaceC10405;
                try {
                    c17869.f54565 = true;
                    return interfaceC10406.write(byteBuffer);
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            }
        };
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܽ */
    public final void mo14154() {
        this.f43240.f54562 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f43240.f54562;
    }
}
