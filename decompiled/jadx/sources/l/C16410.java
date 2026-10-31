package l;

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
public final class C16410 implements InterfaceC15097 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Set f50482;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f50483;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f50484;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14293 f50485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10160 f50486;

    static {
        Object[] objArr = {"user-agent", "referer", "origin", "accept", "accept-language"};
        HashSet hashSet = new HashSet(5);
        for (int i = 0; i < 5; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f50482 = C20195.unmodifiableSet(hashSet);
    }

    public C16410(String str, C14293 c14293) {
        this.f50485 = c14293;
        try {
            String strM38669 = m38669(new URL(str));
            this.f50483 = strM38669;
            this.f50486 = new C10160();
            if (c14293.m34079().isEmpty()) {
                this.f50484 = "";
                return;
            }
            MessageDigest messageDigestM34534 = C14460.m34534();
            C14460.m34528(messageDigestM34534, strM38669 + '\n' + c14293.m34077() + '\n');
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(c14293.m34079());
            for (Map.Entry entry : treeMap.entrySet()) {
                C14460.m34528(messageDigestM34534, ((String) entry.getKey()).toLowerCase(Locale.ROOT) + ':' + ((String) entry.getValue()) + '\n');
            }
            this.f50484 = C14460.m34531(messageDigestM34534.digest());
            C10160 c10160 = this.f50486;
            c10160.m25520(c14293.m34079());
            c10160.m25521(new C13895(this));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid stream source URL", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m38670(URL url, AbstractMap abstractMap) {
        C14293 c14293 = this.f50485;
        if (c14293.m34077() || this.f50483.equals(m38669(url))) {
            return abstractMap;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(abstractMap);
        for (String str : c14293.m34079().keySet()) {
            if (!f50482.contains(str.toLowerCase(Locale.ROOT))) {
                treeMap.remove(str);
            }
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38669(URL url) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m38671() {
        return this.f50484;
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return this.f50486.mo6247();
    }
}
