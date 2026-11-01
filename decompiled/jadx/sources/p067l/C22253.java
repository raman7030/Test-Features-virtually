package p067l;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4DT */
/* JADX INFO: loaded from: classes4.dex */
public final class C22253 {

    /* JADX INFO: renamed from: ֡ */
    public static final C22253 f70343;

    /* JADX INFO: renamed from: ֨ */
    public static final C22253 f70344;

    /* JADX INFO: renamed from: ۖ */
    public static final C22253 f70345;

    /* JADX INFO: renamed from: ۘ */
    public static final C22253 f70346;

    /* JADX INFO: renamed from: ۚ */
    public static final C22253 f70347;

    /* JADX INFO: renamed from: ۜ */
    public static final C22253 f70348;

    /* JADX INFO: renamed from: ۠ */
    public static final C22253 f70349;

    /* JADX INFO: renamed from: ۡ */
    public static final C22253 f70350;

    /* JADX INFO: renamed from: ۢ */
    public static final C22253 f70351;

    /* JADX INFO: renamed from: ܳ */
    public static final C22253 f70353;

    /* JADX INFO: renamed from: ܶ */
    public static final C22253 f70354;

    /* JADX INFO: renamed from: ܺ */
    public static final C22253 f70355;

    /* JADX INFO: renamed from: ܿ */
    public static final C22253 f70357;

    /* JADX INFO: renamed from: ᩳ */
    public static final C22253 f70358;

    /* JADX INFO: renamed from: ᩴ */
    public static final C22253 f70359;

    /* JADX INFO: renamed from: ᩵ */
    public static final C22253 f70360;

    /* JADX INFO: renamed from: ᩷ */
    public static final C22253 f70361;

    /* JADX INFO: renamed from: ᩻ */
    public static final C22253 f70362;

    /* JADX INFO: renamed from: ֫ */
    public final String f70363;

    /* JADX INFO: renamed from: ܽ */
    public static final Comparator f70356 = new C8841();

    /* JADX INFO: renamed from: ۧ */
    public static final LinkedHashMap f70352 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫ */
    public static synchronized C22253 m50079(String str) {
        C22253 c22253;
        String str2;
        LinkedHashMap linkedHashMap = f70352;
        c22253 = (C22253) linkedHashMap.get(str);
        if (c22253 == null) {
            if (str.startsWith("TLS_")) {
                str2 = "SSL_" + str.substring(4);
            } else if (str.startsWith("SSL_")) {
                str2 = "TLS_" + str.substring(4);
            } else {
                str2 = str;
            }
            c22253 = (C22253) linkedHashMap.get(str2);
            if (c22253 == null) {
                c22253 = new C22253(str);
            }
            linkedHashMap.put(str, c22253);
        }
        return c22253;
    }

    static {
        m50080("SSL_RSA_WITH_NULL_MD5");
        m50080("SSL_RSA_WITH_NULL_SHA");
        m50080("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m50080("SSL_RSA_WITH_RC4_128_MD5");
        m50080("SSL_RSA_WITH_RC4_128_SHA");
        m50080("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m50080("SSL_RSA_WITH_DES_CBC_SHA");
        f70343 = m50080("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m50080("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m50080("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m50080("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m50080("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m50080("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m50080("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m50080("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m50080("SSL_DH_anon_WITH_RC4_128_MD5");
        m50080("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m50080("SSL_DH_anon_WITH_DES_CBC_SHA");
        m50080("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_KRB5_WITH_DES_CBC_SHA");
        m50080("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_KRB5_WITH_RC4_128_SHA");
        m50080("TLS_KRB5_WITH_DES_CBC_MD5");
        m50080("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m50080("TLS_KRB5_WITH_RC4_128_MD5");
        m50080("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m50080("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m50080("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m50080("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f70347 = m50080("TLS_RSA_WITH_AES_128_CBC_SHA");
        m50080("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m50080("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m50080("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f70349 = m50080("TLS_RSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m50080("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m50080("TLS_RSA_WITH_NULL_SHA256");
        m50080("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m50080("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m50080("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m50080("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m50080("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m50080("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m50080("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m50080("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m50080("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m50080("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m50080("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m50080("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m50080("TLS_PSK_WITH_RC4_128_SHA");
        m50080("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_PSK_WITH_AES_128_CBC_SHA");
        m50080("TLS_PSK_WITH_AES_256_CBC_SHA");
        m50080("TLS_RSA_WITH_SEED_CBC_SHA");
        f70344 = m50080("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f70354 = m50080("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m50080("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m50080("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m50080("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m50080("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m50080("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m50080("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m50080("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m50080("TLS_FALLBACK_SCSV");
        m50080("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m50080("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m50080("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m50080("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_ECDH_RSA_WITH_NULL_SHA");
        m50080("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m50080("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m50080("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m50080("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m50080("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f70355 = m50080("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f70346 = m50080("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m50080("TLS_ECDH_anon_WITH_NULL_SHA");
        m50080("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m50080("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m50080("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m50080("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m50080("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m50080("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m50080("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m50080("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m50080("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f70361 = m50080("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f70351 = m50080("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m50080("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m50080("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f70345 = m50080("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f70359 = m50080("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m50080("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m50080("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m50080("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m50080("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f70360 = m50080("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f70350 = m50080("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m50080("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m50080("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f70357 = m50080("TLS_AES_128_GCM_SHA256");
        f70362 = m50080("TLS_AES_256_GCM_SHA384");
        f70348 = m50080("TLS_CHACHA20_POLY1305_SHA256");
        f70358 = m50080("TLS_AES_128_CCM_SHA256");
        f70353 = m50080("TLS_AES_256_CCM_8_SHA256");
    }

    public C22253(String str) {
        str.getClass();
        this.f70363 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22253 m50080(String str) {
        C22253 c22253 = new C22253(str);
        f70352.put(str, c22253);
        return c22253;
    }

    public final String toString() {
        return this.f70363;
    }
}
