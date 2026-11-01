package p067l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.᩷ۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22148 {
    /* JADX INFO: renamed from: ֫ */
    public static String m49955(AbstractC17043 abstractC17043, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamMo29987;
        InputStream inputStream = null;
        if (!abstractC17043.mo25093()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            inputStreamMo29987 = abstractC17043.mo29987();
            while (true) {
                try {
                    int i = inputStreamMo29987.read(bArr, 0, 1024);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        String strM36665 = C16111.m36665(messageDigest.digest());
                        C2700.m4192(inputStreamMo29987);
                        return strM36665;
                    }
                } catch (Exception unused) {
                    C2700.m4192(inputStreamMo29987);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamMo29987;
                    C2700.m4192(inputStream);
                    throw th;
                }
            }
        } catch (Exception unused2) {
            inputStreamMo29987 = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m49956(File file) throws Throwable {
        FileInputStream fileInputStream;
        try {
            int i = C17425.f52085;
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrM4194 = C2700.m4194(fileInputStream, 0);
                C23461.m52177((Closeable) fileInputStream);
                return bArrM4194;
            } catch (Throwable th) {
                th = th;
                C23461.m52177((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
