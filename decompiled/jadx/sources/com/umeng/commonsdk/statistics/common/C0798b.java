package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.common.b */
/* JADX INFO: compiled from: S5CP */
/* JADX INFO: loaded from: classes.dex */
public class C0798b {

    /* JADX INFO: renamed from: a */
    public static int f3378a;

    /* JADX INFO: renamed from: a */
    public static byte[] m3011a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m3012a(str.getBytes(str2));
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3012a(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[8192];
        f3378a = 0;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            while (!deflater.finished()) {
                try {
                    int iDeflate = deflater.deflate(bArr2);
                    f3378a += iDeflate;
                    byteArrayOutputStream2.write(bArr2, 0, iDeflate);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            deflater.end();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m3010a(byte[] bArr, String str) throws DataFormatException {
        byte[] bArrM3013b = m3013b(bArr);
        if (bArrM3013b != null) {
            return new String(bArrM3013b, str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3013b(byte[] bArr) throws DataFormatException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Inflater inflater = new Inflater();
        int i = 0;
        inflater.setInput(bArr, 0, bArr.length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (!inflater.needsInput()) {
            int iInflate = inflater.inflate(bArr2);
            byteArrayOutputStream.write(bArr2, i, iInflate);
            i += iInflate;
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
