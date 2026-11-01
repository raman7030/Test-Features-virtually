package bin.p000mt.plus;

import android.system.ErrnoException;
import com.umeng.commonsdk.internal.C0773c;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p067l.C7241;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class Features3 {
    public static native boolean delete(String str, byte[] bArr);

    public static native long lastModified0(byte[] bArr);

    public static native long length(int i);

    public static native byte[][] listGarbledFileNames(String str);

    public static native String newStringUTF(byte[] bArr);

    public static native int read(int i, byte[] bArr, int i2, int i3);

    public static native byte[] readlink0(byte[] bArr);

    public static native long receiveFdResponse(int i);

    public static native boolean rename(String str, byte[] bArr, String str2);

    public static native void seek(int i, long j);

    public static native int startMTIO(String str, String str2);

    public static native int stat0(byte[] bArr, long[] jArr);

    public static native void sync(int i);

    public static native long tell(int i);

    public static native void truncate(int i, long j);

    public static native void write(int i, byte[] bArr, int i2, int i3);

    static {
        System.loadLibrary("mt3");
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m56(String str) {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArr = readlink0(str.getBytes(charset));
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m55(String str) throws IOException {
        try {
            return lastModified0(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new IOException(C7241.m16586(e, C9179.m21133(str, ": ")), e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static long[] m57(String str) throws ErrnoException {
        long[] jArr = new long[3];
        int iStat0 = stat0(str.getBytes(StandardCharsets.UTF_8), jArr);
        if (iStat0 == 0) {
            return jArr;
        }
        throw new ErrnoException(C0773c.f3251h, iStat0);
    }
}
