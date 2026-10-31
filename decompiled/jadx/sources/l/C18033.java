package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ᩳۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18033 implements InterfaceC9567 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f56225 = {1, 3, 6, 8, 9};

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18360(byte[] bArr, int i) {
        return i >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139;
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final long mo18357(InterfaceC7889 interfaceC7889) {
        interfaceC7889.seek(interfaceC7889.length() - 4);
        return ((long) interfaceC7889.readInt()) & 4294967295L;
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo18358(InputStream inputStream) {
        return new GZIPInputStream(inputStream, 65536);
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo18359(OutputStream outputStream, int i, long j) {
        return new C16621(outputStream, i);
    }
}
