package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۡ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: D98Y */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8549 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f26138;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteArrayOutputStream f26139;

    public RunnableC8549(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        this.f26138 = inputStream;
        this.f26139 = byteArrayOutputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i = this.f26138.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    this.f26139.write(bArr, 0, i);
                }
            } catch (IOException unused) {
                return;
            }
        }
    }
}
