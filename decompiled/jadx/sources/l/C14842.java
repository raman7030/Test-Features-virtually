package l;

import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ܳ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes4.dex */
public final class C14842 implements InterfaceC5330 {
    @Override // l.InterfaceC5330
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo15276(int i) {
        int i2 = NativeXZOutputStream.f77882;
        return i >= 0 && i <= 9;
    }

    @Override // l.InterfaceC5330
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo15275(OutputStream outputStream, int i) {
        return new NativeXZOutputStream(outputStream, i);
    }
}
