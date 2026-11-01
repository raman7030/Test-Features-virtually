package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public enum IOUtils {
    ;


    /* JADX INFO: renamed from: ᩶ */
    public static final Log f1994 = LogFactory.m1468(IOUtils.class);

    /* JADX INFO: renamed from: ᩹ */
    public static final int f1996 = 4096;

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1945(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m1946(InputStream inputStream) {
        return new String(m1945(inputStream), StringUtils.f2004);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1944(Closeable closeable, Log log) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (f1994.mo1459()) {
                    f1994.mo1458("Ignore failure in closing the Closeable", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1947(Closeable closeable, Log log) {
        m1944(closeable, log);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m1943(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= -1) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }
}
