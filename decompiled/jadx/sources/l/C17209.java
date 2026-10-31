package l;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ܿ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17209 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f52762;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23743 f52763;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1232 f52764;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19511 f52765;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int f52766;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f52767;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f52768;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final SocketFactory f52769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final List f52770;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f52771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5399 f52772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8927 f52773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f52774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22332 f52775;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 f52776;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final int f52777;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final List f52778;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final List f52779;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final List f52780;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f52781;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean f52782;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 f52783;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C7787 f52784;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC8221 f52785;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ProxySelector f52786;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final List f52761 = C20032.m46176(EnumC14386.HTTP_2, EnumC14386.HTTP_1_1);

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final List f52760 = C20032.m46176(C2577.f8154, C2577.f8153);

    static {
        AbstractC8037.f24775 = new C16503();
    }

    public C17209() {
        this(new C17915());
    }

    public C17209(C17915 c17915) {
        boolean z;
        this.f52772 = c17915.f54697;
        this.f52779 = c17915.f54693;
        List list = c17915.f54694;
        this.f52770 = list;
        this.f52778 = C20032.m46175((List) c17915.f54706);
        this.f52780 = C20032.m46175((List) c17915.f54687);
        this.f52775 = c17915.f54701;
        this.f52786 = c17915.f54695;
        this.f52765 = c17915.f54708;
        this.f52784 = c17915.f54698;
        this.f52769 = c17915.f54710;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = z || ((C2577) it.next()).f8157;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c17915.f54707;
        if (sSLSocketFactory != null || !z) {
            this.f52768 = sSLSocketFactory;
            this.f52764 = c17915.f54704;
        } else {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            SSLContext sSLContextMo24641 = C18872.m43580().mo24641();
                            sSLContextMo24641.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f52768 = sSLContextMo24641.getSocketFactory();
                            this.f52764 = C18872.m43580().mo43581(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw C20032.m46170("No System TLS", (Exception) e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw C20032.m46170("No System TLS", (Exception) e2);
            }
        }
        if (this.f52768 != null) {
            C18872.m43580().mo24642(this.f52768);
        }
        this.f52771 = c17915.f54705;
        this.f52763 = c17915.f54703.m52390(this.f52764);
        this.f52776 = c17915.f54688;
        this.f52783 = c17915.f54689;
        this.f52773 = c17915.f54711;
        this.f52785 = c17915.f54696;
        this.f52762 = c17915.f54691;
        this.f52767 = c17915.f54690;
        this.f52782 = c17915.f54709;
        this.f52781 = c17915.f54702;
        this.f52774 = c17915.f54699;
        this.f52766 = c17915.f54700;
        this.f52777 = c17915.f54692;
        if (this.f52778.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f52778);
        }
        if (this.f52780.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f52780);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m40482() {
        return this.f52774;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m40472() {
        return this.f52766;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m40485() {
        return this.f52777;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ProxySelector m40466() {
        return this.f52786;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19511 m40473() {
        return this.f52765;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC8221 m40484() {
        return this.f52785;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final SocketFactory m40474() {
        return this.f52769;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m40478() {
        return this.f52768;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m40479() {
        return this.f52771;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23743 m40480() {
        return this.f52763;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 m40468() {
        return this.f52783;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 m40483() {
        return this.f52776;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8927 m40481() {
        return this.f52773;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m40475() {
        return this.f52762;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m40476() {
        return this.f52767;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m40467() {
        return this.f52782;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List m40471() {
        return this.f52779;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m40477() {
        return this.f52770;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16687 m40469(C8743 c8743) {
        return C20738.m47371(this, c8743);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17915 m40470() {
        return new C17915(this);
    }
}
