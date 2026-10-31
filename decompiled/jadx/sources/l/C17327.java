package l;

import java.io.InputStream;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ܿۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17327 implements InterfaceC9567 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f53075 = {0, 3, 6, 7, 8};

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18360(byte[] bArr, int i) {
        return C9495.m24334(i, bArr);
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final long mo18357(InterfaceC7889 interfaceC7889) {
        return C9495.m24333(interfaceC7889);
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo18358(InputStream inputStream) {
        return C1096.m3765(inputStream);
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo18359(OutputStream outputStream, int i, long j) {
        OutputStream outputStreamM3766 = C1096.m3766(outputStream, f53075[i]);
        return (j <= 0 || !(outputStreamM3766 instanceof NativeXZOutputStream)) ? outputStreamM3766 : new C8861((NativeXZOutputStream) outputStreamM3766, j);
    }
}
