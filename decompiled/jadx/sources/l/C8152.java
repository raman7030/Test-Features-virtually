package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OJQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8152 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21624(byte[] bArr, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStreamM3766 = C1096.m3766(byteArrayOutputStream, 2);
        outputStreamM3766.write(bArr, 0, i);
        outputStreamM3766.flush();
        outputStreamM3766.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m21623(InputStream inputStream) throws IOException {
        InputStream inputStreamM3765 = C1096.m3765(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamM3765.read(bArr);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStreamM3765.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
