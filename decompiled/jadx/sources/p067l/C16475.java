package p067l;

import java.io.OutputStream;
import net.p069sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ܳ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes4.dex */
public final class C16475 implements InterfaceC7434 {
    @Override // p067l.InterfaceC7434
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo17183(int i) {
        int i2 = NativeXZOutputStream.f80644;
        return i >= 0 && i <= 9;
    }

    @Override // p067l.InterfaceC7434
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo17182(OutputStream outputStream, int i) {
        return new NativeXZOutputStream(outputStream, i);
    }
}
