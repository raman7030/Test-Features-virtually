package l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܳۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14504 implements InterfaceC9567 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f44472 = {1, 3, 5, 7, 9};

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final long mo18357(InterfaceC7889 interfaceC7889) {
        return -1L;
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18360(byte[] bArr, int i) {
        return i >= 3 && (bArr[0] & 255) == 66 && (bArr[1] & 255) == 90 && (bArr[2] & 255) == 104;
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo18358(InputStream inputStream) {
        return new C9453(new BufferedInputStream(inputStream, 65536));
    }

    @Override // l.InterfaceC9567
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo18359(OutputStream outputStream, int i, long j) {
        return new C15801(new BufferedOutputStream(outputStream, 65536), f44472[i]);
    }
}
