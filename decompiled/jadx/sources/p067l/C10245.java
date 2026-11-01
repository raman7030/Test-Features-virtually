package p067l;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: l.۠ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4EB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10245 implements HostnameVerifier {

    /* JADX INFO: renamed from: ֫ */
    public static final C10245 f28375 = new C10245();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m23855((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m23855(X509Certificate x509Certificate, String str) {
        boolean zEquals;
        int length;
        if (C21407.m48503(str)) {
            List listM23854 = m23854(x509Certificate, 7);
            int size = listM23854.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) listM23854.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String strConcat : m23854(x509Certificate, 2)) {
            if (lowerCase == null || lowerCase.length() == 0 || lowerCase.startsWith(".") || lowerCase.endsWith("..") || strConcat == null || strConcat.length() == 0 || strConcat.startsWith(".") || strConcat.endsWith("..")) {
                zEquals = false;
            } else {
                String strConcat2 = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                if (!strConcat.endsWith(".")) {
                    strConcat = strConcat.concat(".");
                }
                String lowerCase2 = strConcat.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    zEquals = strConcat2.equals(lowerCase2);
                } else if (!lowerCase2.startsWith("*.") || lowerCase2.indexOf(42, 1) != -1 || strConcat2.length() < lowerCase2.length() || "*.".equals(lowerCase2)) {
                    zEquals = false;
                } else {
                    String strSubstring = lowerCase2.substring(1);
                    if (strConcat2.endsWith(strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || strConcat2.lastIndexOf(46, length - 1) == -1)) {
                        zEquals = true;
                    } else {
                        zEquals = false;
                    }
                }
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m23853(X509Certificate x509Certificate) {
        List listM23854 = m23854(x509Certificate, 7);
        List listM23855 = m23854(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM23855.size() + listM23854.size());
        arrayList.addAll(listM23854);
        arrayList.addAll(listM23855);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m23854(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }
}
