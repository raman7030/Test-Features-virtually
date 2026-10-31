package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2985 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12862 f9429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2985(C12862 c12862, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f9429 = c12862;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ByteArrayOutputStream byteArrayOutputStream = this.f9429.f38626;
        byteArrayOutputStream.write(bArr, i, Math.min(i2, 32768 - byteArrayOutputStream.size()));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C12862 c12862 = this.f9429;
        if (c12862.f38626.size() < 32768) {
            c12862.f38626.write(i);
        }
    }
}
