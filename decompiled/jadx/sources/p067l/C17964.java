package p067l;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܽۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z70F */
/* JADX INFO: loaded from: classes4.dex */
public final class C17964 implements InterfaceC16716 {

    /* JADX INFO: renamed from: ۗ */
    public static final Set f53654;

    /* JADX INFO: renamed from: ۙ */
    public final String f53655;

    /* JADX INFO: renamed from: ᩶ */
    public final String f53656;

    /* JADX INFO: renamed from: ᩸ */
    public final C15952 f53657;

    /* JADX INFO: renamed from: ᩹ */
    public final C12024 f53658;

    static {
        Object[] objArr = {"user-agent", "referer", "origin", "accept", "accept-language"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f53654 = C21562.unmodifiableSet(hashSet);
    }

    public C17964(String str, C15952 c15952) {
        this.f53657 = c15952;
        try {
            String strM40885 = m40885(new URL(str));
            this.f53655 = strM40885;
            this.f53658 = new C12024();
            if (c15952.m36212().isEmpty()) {
                this.f53656 = "";
                return;
            }
            MessageDigest messageDigestM36668 = C16111.m36668();
            C16111.m36662(messageDigestM36668, strM40885 + '\n' + c15952.m36210() + '\n');
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(c15952.m36212());
            for (Map.Entry entry : treeMap.entrySet()) {
                C16111.m36662(messageDigestM36668, ((String) entry.getKey()).toLowerCase(Locale.ROOT) + ':' + ((String) entry.getValue()) + '\n');
            }
            this.f53656 = C16111.m36665(messageDigestM36668.digest());
            C12024 c12024 = this.f53658;
            c12024.m27539(c15952.m36212());
            c12024.m27540(new C15574(this));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid stream source URL", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m40886(URL url, AbstractMap abstractMap) {
        C15952 c15952 = this.f53657;
        if (c15952.m36210() || this.f53655.equals(m40885(url))) {
            return abstractMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(abstractMap);
        for (String str : c15952.m36212().keySet()) {
            if (!f53654.contains(str.toLowerCase(Locale.ROOT))) {
                treeMap.remove(str);
            }
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m40885(URL url) {
        int defaultPort = url.getPort() == -1 ? url.getDefaultPort() : url.getPort();
        StringBuilder sb = new StringBuilder();
        String protocol = url.getProtocol();
        Locale locale = Locale.ROOT;
        sb.append(protocol.toLowerCase(locale));
        sb.append("://");
        sb.append(url.getHost().toLowerCase(locale));
        sb.append(':');
        sb.append(defaultPort);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m40887() {
        return this.f53656;
    }

    @Override // p067l.InterfaceC16716
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22753 mo8449() {
        return this.f53658.mo8449();
    }
}
