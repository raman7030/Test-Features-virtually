package p067l;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: l.ᩳ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19395 {

    /* JADX INFO: renamed from: ֡ */
    public final ArrayList f57884;

    /* JADX INFO: renamed from: ֨ */
    public InterfaceC15134 f57885;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC15134 f57886;

    /* JADX INFO: renamed from: ۖ */
    public boolean f57887;

    /* JADX INFO: renamed from: ۘ */
    public boolean f57888;

    /* JADX INFO: renamed from: ۙ */
    public int f57889;

    /* JADX INFO: renamed from: ۚ */
    public List f57890;

    /* JADX INFO: renamed from: ۜ */
    public List f57891;

    /* JADX INFO: renamed from: ۠ */
    public ProxySelector f57892;

    /* JADX INFO: renamed from: ۡ */
    public InterfaceC10182 f57893;

    /* JADX INFO: renamed from: ۢ */
    public C7500 f57894;

    /* JADX INFO: renamed from: ۧ */
    public C9770 f57895;

    /* JADX INFO: renamed from: ܳ */
    public int f57896;

    /* JADX INFO: renamed from: ܶ */
    public int f57897;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC23593 f57898;

    /* JADX INFO: renamed from: ܽ */
    public int f57899;

    /* JADX INFO: renamed from: ܿ */
    public C24934 f57900;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC3539 f57901;

    /* JADX INFO: renamed from: ᩴ */
    public HostnameVerifier f57902;

    /* JADX INFO: renamed from: ᩵ */
    public final ArrayList f57903;

    /* JADX INFO: renamed from: ᩶ */
    public SSLSocketFactory f57904;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC20912 f57905;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f57906;

    /* JADX INFO: renamed from: ᩹ */
    public SocketFactory f57907;

    /* JADX INFO: renamed from: ᩻ */
    public C10853 f57908;

    /* JADX INFO: renamed from: ֫ */
    public final void m44144(long j) {
        this.f57899 = C21407.m48483(j, TimeUnit.SECONDS);
    }

    public C19395() {
        this.f57903 = new ArrayList();
        this.f57884 = new ArrayList();
        this.f57894 = new C7500();
        this.f57890 = C18724.f55943;
        this.f57891 = C18724.f55942;
        this.f57898 = new C22923();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f57892 = proxySelector;
        if (proxySelector == null) {
            this.f57892 = new C20975();
        }
        this.f57905 = InterfaceC20912.f65672;
        this.f57907 = SocketFactory.getDefault();
        this.f57902 = C10245.f28375;
        this.f57900 = C24934.f79624;
        InterfaceC15134 interfaceC15134 = InterfaceC15134.f43213;
        this.f57885 = interfaceC15134;
        this.f57886 = interfaceC15134;
        this.f57908 = new C10853();
        this.f57893 = InterfaceC10182.f28238;
        this.f57888 = true;
        this.f57887 = true;
        this.f57906 = true;
        this.f57899 = 0;
        this.f57896 = 10000;
        this.f57897 = 10000;
        this.f57889 = 10000;
    }

    public C19395(C18724 c18724) {
        ArrayList arrayList = new ArrayList();
        this.f57903 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f57884 = arrayList2;
        this.f57894 = c18724.f55954;
        this.f57890 = c18724.f55961;
        this.f57891 = c18724.f55952;
        arrayList.addAll(c18724.f55960);
        arrayList2.addAll(c18724.f55962);
        this.f57898 = c18724.f55957;
        this.f57892 = c18724.f55968;
        this.f57905 = c18724.f55947;
        this.f57895 = c18724.f55966;
        this.f57907 = c18724.f55951;
        this.f57904 = c18724.f55950;
        this.f57901 = c18724.f55946;
        this.f57902 = c18724.f55953;
        this.f57900 = c18724.f55945;
        this.f57885 = c18724.f55958;
        this.f57886 = c18724.f55965;
        this.f57908 = c18724.f55955;
        this.f57893 = c18724.f55967;
        this.f57888 = c18724.f55944;
        this.f57887 = c18724.f55949;
        this.f57906 = c18724.f55964;
        this.f57899 = c18724.f55963;
        this.f57896 = c18724.f55956;
        this.f57897 = c18724.f55948;
        this.f57889 = c18724.f55959;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44145(long j, TimeUnit timeUnit) {
        this.f57896 = C21407.m48483(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44153(long j, TimeUnit timeUnit) {
        this.f57897 = C21407.m48483(j, timeUnit);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m44155(long j, TimeUnit timeUnit) {
        this.f57889 = C21407.m48483(j, timeUnit);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44149(C9770 c9770) {
        this.f57895 = c9770;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44147(SocketFactory socketFactory) {
        this.f57907 = socketFactory;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44148(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new NullPointerException("trustManager == null");
        }
        this.f57904 = sSLSocketFactory;
        this.f57901 = C20304.m45846().mo45847(x509TrustManager);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44151(C17326 c17326) {
        this.f57902 = c17326;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44150(InterfaceC15134 interfaceC15134) {
        this.f57886 = interfaceC15134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44146(List list) {
        this.f57891 = C21407.m48491(list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44152(InterfaceC24263 interfaceC24263) {
        this.f57903.add(interfaceC24263);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m44154(InterfaceC24263 interfaceC24263) {
        this.f57884.add(interfaceC24263);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18724 m44143() {
        return new C18724(this);
    }
}
