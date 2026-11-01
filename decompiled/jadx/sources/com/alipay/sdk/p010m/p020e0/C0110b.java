package com.alipay.sdk.p010m.p020e0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: com.alipay.sdk.m.e0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0110b {
    /* JADX INFO: renamed from: a */
    public static String m582a(String str) {
        try {
            if (C0106a.m564a(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes(C0233a.f1077D));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
