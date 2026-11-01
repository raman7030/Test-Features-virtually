package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10493 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final InputStream f29053;

    /* JADX INFO: renamed from: ᩹ */
    public final ByteArrayOutputStream f29054;

    public RunnableC10493(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.f29053 = inputStream;
        this.f29054 = byteArrayOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = this.f29053.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    this.f29054.write(bArr, 0, i);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
