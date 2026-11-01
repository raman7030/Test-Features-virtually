package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10116 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m23593(byte[] bArr, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStreamM6039 = C3410.m6039(byteArrayOutputStream, 2);
        outputStreamM6039.write(bArr, 0, i);
        outputStreamM6039.flush();
        outputStreamM6039.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m23592(InputStream inputStream) throws IOException {
        InputStream inputStreamM6038 = C3410.m6038(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamM6038.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStreamM6038.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
