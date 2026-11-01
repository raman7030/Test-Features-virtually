package p067l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5205 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14592 f12228;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5205(C14592 c14592, BufferedOutputStream bufferedOutputStream) {
        super(bufferedOutputStream);
        this.f12228 = c14592;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        ByteArrayOutputStream byteArrayOutputStream = this.f12228.f41670;
        byteArrayOutputStream.write(bArr, i, Math.min(i2, 32768 - byteArrayOutputStream.size()));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C14592 c14592 = this.f12228;
        if (c14592.f41670.size() < 32768) {
            c14592.f41670.write(i);
        }
    }
}
