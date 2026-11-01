package p067l;

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
public final class C18724 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫ */
    public final boolean f55944;

    /* JADX INFO: renamed from: ۗ */
    public final C24934 f55945;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC3539 f55946;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC20912 f55947;

    /* JADX INFO: renamed from: ۜ֫ */
    public final int f55948;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f55949;

    /* JADX INFO: renamed from: ۡ֫ */
    public final SSLSocketFactory f55950;

    /* JADX INFO: renamed from: ۢ֫ */
    public final SocketFactory f55951;

    /* JADX INFO: renamed from: ۤ */
    public final List f55952;

    /* JADX INFO: renamed from: ۧ֫ */
    public final HostnameVerifier f55953;

    /* JADX INFO: renamed from: ۨ */
    public final C7500 f55954;

    /* JADX INFO: renamed from: ۫ */
    public final C10853 f55955;

    /* JADX INFO: renamed from: ۬ */
    public final int f55956;

    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC23593 f55957;

    /* JADX INFO: renamed from: ܳ֫ */
    public final InterfaceC15134 f55958;

    /* JADX INFO: renamed from: ܺ֫ */
    public final int f55959;

    /* JADX INFO: renamed from: ܽ֫ */
    public final List f55960;

    /* JADX INFO: renamed from: ܿ֫ */
    public final List f55961;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final List f55962;

    /* JADX INFO: renamed from: ᩶ */
    public final int f55963;

    /* JADX INFO: renamed from: ᩷֫ */
    public final boolean f55964;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC15134 f55965;

    /* JADX INFO: renamed from: ᩹ */
    public final C9770 f55966;

    /* JADX INFO: renamed from: ᩺ */
    public final InterfaceC10182 f55967;

    /* JADX INFO: renamed from: ᩻֫ */
    public final ProxySelector f55968;

    /* JADX INFO: renamed from: ۘ֫ */
    public static final List f55943 = C21407.m48492(EnumC16041.HTTP_2, EnumC16041.HTTP_1_1);

    /* JADX INFO: renamed from: ۖ֫ */
    public static final List f55942 = C21407.m48492(C4818.f10946, C4818.f10945);

    static {
        AbstractC10007.f27689 = new C18053();
    }

    public C18724() {
        this(new C19395());
    }

    public C18724(C19395 c19395) {
        boolean z;
        this.f55954 = c19395.f57894;
        this.f55961 = c19395.f57890;
        List list = c19395.f57891;
        this.f55952 = list;
        this.f55960 = C21407.m48491((List) c19395.f57903);
        this.f55962 = C21407.m48491((List) c19395.f57884);
        this.f55957 = c19395.f57898;
        this.f55968 = c19395.f57892;
        this.f55947 = c19395.f57905;
        this.f55966 = c19395.f57895;
        this.f55951 = c19395.f57907;
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = z || ((C4818) it.next()).f10949;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = c19395.f57904;
        if (sSLSocketFactory != null || !z) {
            this.f55950 = sSLSocketFactory;
            this.f55946 = c19395.f57901;
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
                            SSLContext sSLContextMo26655 = C20304.m45846().mo26655();
                            sSLContextMo26655.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f55950 = sSLContextMo26655.getSocketFactory();
                            this.f55946 = C20304.m45846().mo45847(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw C21407.m48486("No System TLS", (Exception) e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw C21407.m48486("No System TLS", (Exception) e2);
            }
        }
        if (this.f55950 != null) {
            C20304.m45846().mo26656(this.f55950);
        }
        this.f55953 = c19395.f57902;
        this.f55945 = c19395.f57900.m54799(this.f55946);
        this.f55958 = c19395.f57885;
        this.f55965 = c19395.f57886;
        this.f55955 = c19395.f57908;
        this.f55967 = c19395.f57893;
        this.f55944 = c19395.f57888;
        this.f55949 = c19395.f57887;
        this.f55964 = c19395.f57906;
        this.f55963 = c19395.f57899;
        this.f55956 = c19395.f57896;
        this.f55948 = c19395.f57897;
        this.f55959 = c19395.f57889;
        if (this.f55960.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f55960);
        }
        if (this.f55962.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f55962);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m42729() {
        return this.f55956;
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m42719() {
        return this.f55948;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m42732() {
        return this.f55959;
    }

    /* JADX INFO: renamed from: ֡ */
    public final ProxySelector m42713() {
        return this.f55968;
    }

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC20912 m42720() {
        return this.f55947;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC10182 m42731() {
        return this.f55967;
    }

    /* JADX INFO: renamed from: ۠ */
    public final SocketFactory m42721() {
        return this.f55951;
    }

    /* JADX INFO: renamed from: ܶ */
    public final SSLSocketFactory m42725() {
        return this.f55950;
    }

    /* JADX INFO: renamed from: ܺ */
    public final HostnameVerifier m42726() {
        return this.f55953;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24934 m42727() {
        return this.f55945;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15134 m42715() {
        return this.f55965;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC15134 m42730() {
        return this.f55958;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C10853 m42728() {
        return this.f55955;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m42722() {
        return this.f55944;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m42723() {
        return this.f55949;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m42714() {
        return this.f55964;
    }

    /* JADX INFO: renamed from: ۘ */
    public final List m42718() {
        return this.f55961;
    }

    /* JADX INFO: renamed from: ܳ */
    public final List m42724() {
        return this.f55952;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18228 m42716(C10678 c10678) {
        return C22078.m49698(this, c10678);
    }

    /* JADX INFO: renamed from: ۖ */
    public final C19395 m42717() {
        return new C19395(this);
    }
}
