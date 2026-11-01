package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ᩳۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19507 implements InterfaceC11461 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f59423 = {1, 3, 6, 8, 9};

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        return i >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final long mo20305(InterfaceC9866 interfaceC9866) {
        interfaceC9866.seek(interfaceC9866.length() - 4);
        return ((long) interfaceC9866.readInt()) & 4294967295L;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return new GZIPInputStream(inputStream, 65536);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        return new C18165(outputStream, i);
    }
}
