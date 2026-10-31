package l;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: renamed from: l.ۜۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6565 extends URLStreamHandler {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f20258 = C11321.m27961(C6565.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f20259;

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        return 445;
    }

    public C6565() {
    }

    public C6565(InterfaceC18663 interfaceC18663) {
        this.f20259 = interfaceC18663;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        InterfaceC2148 interfaceC2148 = f20258;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Opening file " + url);
        }
        if (this.f20259 == null) {
            this.f20259 = C17456.m40825();
        }
        return new C12914(url, this.f20259);
    }

    @Override // java.net.URLStreamHandler
    public final void parseURL(URL url, String str, int i, int i2) {
        String host = url.getHost();
        if (str.equals("smb://")) {
            i2 += 2;
            str = "smb:////";
        } else if (!str.startsWith("smb://") && host != null && host.length() == 0) {
            str = "//".concat(str);
            i2 += 2;
        }
        super.parseURL(url, str, i, i2);
        String path = url.getPath();
        String ref = url.getRef();
        if (ref != null) {
            path = path + '#' + ref;
        }
        String str2 = path;
        int port = url.getPort();
        setURL(url, "smb", url.getHost(), port == -1 ? 445 : port, url.getAuthority(), url.getUserInfo(), str2, url.getQuery(), null);
    }
}
