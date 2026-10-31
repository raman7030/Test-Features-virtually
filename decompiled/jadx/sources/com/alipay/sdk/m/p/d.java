package com.alipay.sdk.m.p;

import com.alipay.sdk.m.y.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public static final String a = "RSA";

    /* JADX WARN: Code duplicated, block: B:45:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] a(String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        try {
            PublicKey publicKeyB = b(a, str2);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKeyB);
            byte[] bytes = str.getBytes(com.alipay.sdk.m.w.a.D);
            int blockSize = cipher.getBlockSize();
            byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < bytes.length; i += blockSize) {
                try {
                    byteArrayOutputStream.write(cipher.doFinal(bytes, i, bytes.length - i < blockSize ? bytes.length - i : blockSize));
                } catch (Exception e) {
                    e = e;
                    try {
                        g.a(e);
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e2) {
                                e = e2;
                                g.a(e);
                                return bArr;
                            }
                        }
                        return bArr;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e3) {
                                g.a(e3);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e4) {
                e = e4;
                bArr = byteArray;
                g.a(e);
                return bArr;
            }
        } catch (Exception e5) {
            e = e5;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = byteArrayOutputStream2;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }

    public static PublicKey b(String str, String str2) {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(a.a(str2)));
    }
}
