package l;

import java.nio.ByteBuffer;
import java.util.Set;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۛܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6123 implements ISequentialOutStream, InterfaceC18303, InterfaceC10611 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18760;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18761;

    public /* synthetic */ C6123(Object obj, Object obj2) {
        this.f18760 = obj;
        this.f18761 = obj2;
    }

    @Override // l.InterfaceC18303
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC10611
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo17037(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC6377.m17693((ViewOnClickListenerC6377) this.f18760, (Set) this.f18761, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC18303
    /* JADX INFO: renamed from: ۧ */
    public AbstractC16891 mo4620(int i) {
        return C5259.m15152((C5259) this.f18760, (C16560) this.f18761, i);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC13883 interfaceC13883 = (InterfaceC13883) this.f18760;
        ISequentialOutStream iSequentialOutStream = (ISequentialOutStream) this.f18761;
        if (interfaceC13883.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        return iSequentialOutStream.write(byteBuffer);
    }
}
