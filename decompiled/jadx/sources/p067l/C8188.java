package p067l;

import java.nio.ByteBuffer;
import java.util.Set;
import net.p069sf.sevenzipjbinding.ISequentialOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۛܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8188 implements ISequentialOutStream, InterfaceC19764, InterfaceC12454 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f21615;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f21616;

    public /* synthetic */ C8188(Object obj, Object obj2) {
        this.f21615 = obj;
        this.f21616 = obj2;
    }

    @Override // p067l.InterfaceC19764
    public /* synthetic */ void cancel() {
    }

    @Override // p067l.InterfaceC12454
    /* JADX INFO: renamed from: ֫ */
    public void mo18968(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC8430.m19640((ViewOnClickListenerC8430) this.f21615, (Set) this.f21616, str, str2, z, z2, z3);
    }

    @Override // p067l.InterfaceC19764
    /* JADX INFO: renamed from: ۧ */
    public AbstractC18422 mo6852(int i) {
        return C7367.m17055((C7367) this.f21615, (C18107) this.f21616, i);
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC15563 interfaceC15563 = (InterfaceC15563) this.f21615;
        ISequentialOutStream iSequentialOutStream = (ISequentialOutStream) this.f21616;
        if (interfaceC15563.mo3924()) {
            throw new SevenZipException("Canceled");
        }
        return iSequentialOutStream.write(byteBuffer);
    }
}
