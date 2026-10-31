package l;

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
public final class C8288 implements HostnameVerifier {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8288 f25465 = new C8288();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m21885((X509Certificate) sSLSession.getPeerCertificates()[0], str);
        } catch (SSLException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21885(X509Certificate x509Certificate, String str) {
        boolean zEquals;
        int length;
        if (C20032.m46187(str)) {
            List listM21884 = m21884(x509Certificate, 7);
            int size = listM21884.size();
            for (int i = 0; i < size; i++) {
                if (str.equalsIgnoreCase((String) listM21884.get(i))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String strConcat : m21884(x509Certificate, 2)) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m21883(X509Certificate x509Certificate) {
        List listM21884 = m21884(x509Certificate, 7);
        List listM21885 = m21884(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listM21885.size() + listM21884.size());
        arrayList.addAll(listM21884);
        arrayList.addAll(listM21885);
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m21884(X509Certificate x509Certificate, int i) {
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
