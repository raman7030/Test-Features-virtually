package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: l.᩷ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes5.dex */
public final class C22190 implements InterfaceC11461 {
    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final long mo20305(InterfaceC9866 interfaceC9866) {
        return -1L;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        if (i < 2) {
            return false;
        }
        byte b = bArr[0];
        int i2 = b & 255;
        return (b & 15) == 8 && ((i2 >> 4) & 15) <= 7 && ((i2 << 8) + (bArr[1] & 255)) % 31 == 0;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return new InflaterInputStream(inputStream, new Inflater(), 65536);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        throw new UnsupportedOperationException();
    }
}
