package p067l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16153 implements InterfaceC11461 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f47573 = {1, 3, 5, 7, 9};

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final long mo20305(InterfaceC9866 interfaceC9866) {
        return -1L;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        return i >= 3 && (bArr[0] & 255) == 66 && (bArr[1] & 255) == 90 && (bArr[2] & 255) == 104;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return new C11352(new BufferedInputStream(inputStream, 65536));
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        return new C17385(new BufferedOutputStream(outputStream, 65536), f47573[i]);
    }
}
