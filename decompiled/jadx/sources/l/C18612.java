package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ᩴ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CG0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18612 extends C17879 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57719 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C3545 f57720;

    public C18612(C3545 c3545, InputStream inputStream, long j, byte b, int i) {
        super(inputStream, j, b, i);
        this.f57720 = c3545;
    }

    @Override // l.C17879, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws ZipException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            if (e instanceof EOFException) {
                return -1;
            }
            C2568.m8117(e, this.f57720);
            throw null;
        }
    }
}
