package l;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩷ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R4DT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20922 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C20922 f67658;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C20922 f67659;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67660;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67661;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67662;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67663;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C20922 f67664;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67665;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67666;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67668;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67669;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67670;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67672;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67673;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C20922 f67674;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C20922 f67675;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C20922 f67676;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C20922 f67677;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f67678;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Comparator f67671 = new C6810();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f67667 = new LinkedHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C20922 m47749(String str) {
        C20922 c20922;
        String str2;
        LinkedHashMap linkedHashMap = f67667;
        c20922 = (C20922) linkedHashMap.get(str);
        if (c20922 == null) {
            if (str.startsWith("TLS_")) {
                str2 = "SSL_" + str.substring(4);
            } else if (str.startsWith("SSL_")) {
                str2 = "TLS_" + str.substring(4);
            } else {
                str2 = str;
            }
            c20922 = (C20922) linkedHashMap.get(str2);
            if (c20922 == null) {
                c20922 = new C20922(str);
            }
            linkedHashMap.put(str, c20922);
        }
        return c20922;
    }

    static {
        m47750("SSL_RSA_WITH_NULL_MD5");
        m47750("SSL_RSA_WITH_NULL_SHA");
        m47750("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        m47750("SSL_RSA_WITH_RC4_128_MD5");
        m47750("SSL_RSA_WITH_RC4_128_SHA");
        m47750("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m47750("SSL_RSA_WITH_DES_CBC_SHA");
        f67658 = m47750("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        m47750("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        m47750("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        m47750("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        m47750("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        m47750("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        m47750("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        m47750("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        m47750("SSL_DH_anon_WITH_RC4_128_MD5");
        m47750("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        m47750("SSL_DH_anon_WITH_DES_CBC_SHA");
        m47750("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_KRB5_WITH_DES_CBC_SHA");
        m47750("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_KRB5_WITH_RC4_128_SHA");
        m47750("TLS_KRB5_WITH_DES_CBC_MD5");
        m47750("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        m47750("TLS_KRB5_WITH_RC4_128_MD5");
        m47750("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        m47750("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        m47750("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        m47750("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f67662 = m47750("TLS_RSA_WITH_AES_128_CBC_SHA");
        m47750("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        m47750("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        m47750("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f67664 = m47750("TLS_RSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        m47750("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        m47750("TLS_RSA_WITH_NULL_SHA256");
        m47750("TLS_RSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_RSA_WITH_AES_256_CBC_SHA256");
        m47750("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        m47750("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m47750("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        m47750("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        m47750("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        m47750("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        m47750("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        m47750("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        m47750("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m47750("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        m47750("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        m47750("TLS_PSK_WITH_RC4_128_SHA");
        m47750("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_PSK_WITH_AES_128_CBC_SHA");
        m47750("TLS_PSK_WITH_AES_256_CBC_SHA");
        m47750("TLS_RSA_WITH_SEED_CBC_SHA");
        f67659 = m47750("TLS_RSA_WITH_AES_128_GCM_SHA256");
        f67669 = m47750("TLS_RSA_WITH_AES_256_GCM_SHA384");
        m47750("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        m47750("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        m47750("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        m47750("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        m47750("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        m47750("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        m47750("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        m47750("TLS_FALLBACK_SCSV");
        m47750("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        m47750("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        m47750("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        m47750("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_ECDH_RSA_WITH_NULL_SHA");
        m47750("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        m47750("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        m47750("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_ECDHE_RSA_WITH_NULL_SHA");
        m47750("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        m47750("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f67670 = m47750("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f67661 = m47750("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        m47750("TLS_ECDH_anon_WITH_NULL_SHA");
        m47750("TLS_ECDH_anon_WITH_RC4_128_SHA");
        m47750("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        m47750("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        m47750("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        m47750("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        m47750("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        m47750("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        m47750("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        m47750("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f67676 = m47750("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f67666 = m47750("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        m47750("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        m47750("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f67660 = m47750("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f67674 = m47750("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        m47750("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        m47750("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        m47750("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        m47750("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f67675 = m47750("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f67665 = m47750("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        m47750("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        m47750("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f67672 = m47750("TLS_AES_128_GCM_SHA256");
        f67677 = m47750("TLS_AES_256_GCM_SHA384");
        f67663 = m47750("TLS_CHACHA20_POLY1305_SHA256");
        f67673 = m47750("TLS_AES_128_CCM_SHA256");
        f67668 = m47750("TLS_AES_256_CCM_8_SHA256");
    }

    public C20922(String str) {
        str.getClass();
        this.f67678 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20922 m47750(String str) {
        C20922 c20922 = new C20922(str);
        f67667.put(str, c20922);
        return c20922;
    }

    public final String toString() {
        return this.f67678;
    }
}
