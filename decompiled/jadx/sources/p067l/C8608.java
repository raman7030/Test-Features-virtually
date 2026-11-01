package p067l;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* JADX INFO: renamed from: l.ۜۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X598 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8608 extends URLStreamHandler {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC4410 f23136 = C13128.m30022(C8608.class);

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20106 f23137;

    @Override // java.net.URLStreamHandler
    public final int getDefaultPort() {
        return 445;
    }

    public C8608() {
    }

    public C8608(InterfaceC20106 interfaceC20106) {
        this.f23137 = interfaceC20106;
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        InterfaceC4410 interfaceC4410 = f23136;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Opening file " + url);
        }
        if (this.f23137 == null) {
            this.f23137 = C18959.m43083();
        }
        return new C14642(url, this.f23137);
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
