package com.alipay.sdk.p010m.p048s0;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p044q0.C0192b;
import com.alipay.sdk.p010m.p044q0.C0193c;
import com.alipay.sdk.p010m.p044q0.C0194d;
import com.alipay.sdk.p010m.p044q0.C0195e;
import com.alipay.sdk.p010m.p044q0.C0196f;
import com.alipay.sdk.p010m.p046r0.C0200a;
import com.umeng.analytics.pro.C0684bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import p067l.C10965;
import p067l.C17073;

/* JADX INFO: renamed from: com.alipay.sdk.m.s0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0206d {

    /* JADX INFO: renamed from: j */
    public static C0206d f963j;

    /* JADX INFO: renamed from: a */
    public Context f965a;

    /* JADX INFO: renamed from: c */
    public C0207e f967c;

    /* JADX INFO: renamed from: d */
    public String f968d;

    /* JADX INFO: renamed from: e */
    public String f969e;

    /* JADX INFO: renamed from: f */
    public C0200a f970f;

    /* JADX INFO: renamed from: g */
    public C0200a f971g;

    /* JADX INFO: renamed from: i */
    public static final Object f962i = new Object();

    /* JADX INFO: renamed from: k */
    public static final String f964k = C10965.m25286(new StringBuilder(".UTSystemConfig"), File.separator, "Global");

    /* JADX INFO: renamed from: b */
    public String f966b = null;

    /* JADX INFO: renamed from: h */
    public Pattern f972h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public C0206d(Context context) {
        this.f965a = null;
        this.f967c = null;
        this.f968d = "xx_utdid_key";
        this.f969e = "xx_utdid_domain";
        this.f970f = null;
        this.f971g = null;
        this.f965a = context;
        this.f971g = new C0200a(context, f964k, "Alvin2", false, true);
        this.f970f = new C0200a(context, ".DataStorage", "ContextData", false, true);
        this.f967c = new C0207e();
        this.f968d = String.format("K_%d", Integer.valueOf(C0196f.m947a(this.f968d)));
        this.f969e = String.format("D_%d", Integer.valueOf(C0196f.m947a(this.f969e)));
    }

    /* JADX INFO: renamed from: a */
    public final void m1001a() {
        boolean z;
        C0200a c0200a = this.f971g;
        if (c0200a != null) {
            if (C0196f.m948b(c0200a.m971a("UTDID2"))) {
                String strM971a = this.f971g.m971a("UTDID");
                if (!C0196f.m948b(strM971a)) {
                    m1003b(strM971a);
                }
            }
            boolean z2 = true;
            if (C0196f.m948b(this.f971g.m971a("DID"))) {
                z = false;
            } else {
                this.f971g.m974b("DID");
                z = true;
            }
            if (!C0196f.m948b(this.f971g.m971a("EI"))) {
                this.f971g.m974b("EI");
                z = true;
            }
            if (C0196f.m948b(this.f971g.m971a("SI"))) {
                z2 = z;
            } else {
                this.f971g.m974b("SI");
            }
            if (z2) {
                this.f971g.m975b();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1003b(String str) {
        C0200a c0200a;
        if (m1002a(str)) {
            if (str.endsWith("\n")) {
                str = C17073.m38720(1, 0, str);
            }
            if (str.length() != 24 || (c0200a = this.f971g) == null) {
                return;
            }
            c0200a.m973a("UTDID2", str);
            this.f971g.m975b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1006c(String str) {
        C0200a c0200a;
        if (str == null || (c0200a = this.f970f) == null || str.equals(c0200a.m971a(this.f968d))) {
            return;
        }
        this.f970f.m973a(this.f968d, str);
        this.f970f.m975b();
    }

    /* JADX INFO: renamed from: d */
    public synchronized String m1007d() {
        String strM1009f = m1009f();
        this.f966b = strM1009f;
        if (!TextUtils.isEmpty(strM1009f)) {
            return this.f966b;
        }
        try {
            byte[] bArrM1004b = m1004b();
            if (bArrM1004b != null) {
                String strM935c = C0192b.m935c(bArrM1004b, 2);
                this.f966b = strM935c;
                m1003b(strM935c);
                String strM1011a = this.f967c.m1011a(bArrM1004b);
                if (strM1011a != null) {
                    m1006c(strM1011a);
                }
                return this.f966b;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m1008e() {
        String str = this.f966b;
        if (str != null) {
            return str;
        }
        return m1007d();
    }

    /* JADX INFO: renamed from: f */
    public synchronized String m1009f() {
        String strM1005c = m1005c();
        if (m1002a(strM1005c)) {
            m1006c(this.f967c.m1010a(strM1005c));
            this.f966b = strM1005c;
            return strM1005c;
        }
        String strM971a = this.f970f.m971a(this.f968d);
        if (!C0196f.m948b(strM971a)) {
            String strM1013a = new C0208f().m1013a(strM971a);
            if (!m1002a(strM1013a)) {
                strM1013a = this.f967c.m1012b(strM971a);
            }
            if (m1002a(strM1013a) && !C0196f.m948b(strM1013a)) {
                this.f966b = strM1013a;
                m1003b(strM1013a);
                return this.f966b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m1005c() {
        C0200a c0200a = this.f971g;
        if (c0200a == null) {
            return null;
        }
        String strM971a = c0200a.m971a("UTDID2");
        if (C0196f.m948b(strM971a) || this.f967c.m1010a(strM971a) == null) {
            return null;
        }
        return strM971a;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1004b() throws IOException {
        String strM940a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNextInt = new Random().nextInt();
        byte[] bArrM938a = C0193c.m938a(iCurrentTimeMillis);
        byte[] bArrM938a2 = C0193c.m938a(iNextInt);
        byteArrayOutputStream.write(bArrM938a, 0, 4);
        byteArrayOutputStream.write(bArrM938a2, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            strM940a = C0194d.m940a(this.f965a);
        } catch (Exception unused) {
            strM940a = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(C0193c.m938a(C0196f.m947a(strM940a)), 0, 4);
        byteArrayOutputStream.write(C0193c.m938a(C0196f.m947a(m1000a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: a */
    public static C0206d m999a(Context context) {
        if (context != null && f963j == null) {
            synchronized (f962i) {
                if (f963j == null) {
                    C0206d c0206d = new C0206d(context);
                    f963j = c0206d;
                    c0206d.m1001a();
                }
            }
        }
        return f963j;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1002a(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = C17073.m38720(1, 0, str);
            }
            if (24 == str.length() && !this.f972h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m1000a(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr2 = {69, 114, 116, -33, 125, -54, GCMSIVBlockCipher.ADD, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, C0684bo.f2503h, -82, -64, KeyFactorySpi.Ed448_type, 116, -16, -103, 49, -30, 9, -39, PublicSuffixDatabase.EXCEPTION_MARKER, -80, PSSSigner.TRAILER_IMPLICIT, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93};
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(C0195e.m945a(bArr2), mac.getAlgorithm()));
        return C0192b.m935c(mac.doFinal(bArr), 2);
    }
}
