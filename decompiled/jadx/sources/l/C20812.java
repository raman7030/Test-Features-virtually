package l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩷ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20812 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47627(AbstractC15440 abstractC15440, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamMo27926;
        InputStream inputStream = null;
        if (!abstractC15440.mo23119()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            inputStreamMo27926 = abstractC15440.mo27926();
            while (true) {
                try {
                    int i = inputStreamMo27926.read(bArr, 0, 1024);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        String strM34531 = C14460.m34531(messageDigest.digest());
                        C0349.m1793(inputStreamMo27926);
                        return strM34531;
                    }
                } catch (Exception unused) {
                    C0349.m1793(inputStreamMo27926);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamMo27926;
                    C0349.m1793(inputStream);
                    throw th;
                }
            }
        } catch (Exception unused2) {
            inputStreamMo27926 = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47628(File file) throws Throwable {
        FileInputStream fileInputStream;
        try {
            int i = C15843.f48947;
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrM1795 = C0349.m1795(fileInputStream, 0);
                C22194.m49850((Closeable) fileInputStream);
                return bArrM1795;
            } catch (Throwable th) {
                th = th;
                C22194.m49850((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
