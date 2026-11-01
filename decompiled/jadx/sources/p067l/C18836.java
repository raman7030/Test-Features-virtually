package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import net.p069sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ܿۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18836 implements InterfaceC11461 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f56257 = {0, 3, 6, 7, 8};

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        return C11392.m26344(i, bArr);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final long mo20305(InterfaceC9866 interfaceC9866) {
        return C11392.m26343(interfaceC9866);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return C3410.m6038(inputStream);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        OutputStream outputStreamM6039 = C3410.m6039(outputStream, f56257[i]);
        return (j <= 0 || !(outputStreamM6039 instanceof NativeXZOutputStream)) ? outputStreamM6039 : new C10790((NativeXZOutputStream) outputStreamM6039, j);
    }
}
