package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.ۙ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DV */
/* JADX INFO: loaded from: classes2.dex */
public final class C7088 {

    /* JADX INFO: renamed from: ֫ */
    public final C24934 f18470;

    /* JADX INFO: renamed from: ۜ */
    public final ProxySelector f18471;

    /* JADX INFO: renamed from: ۡ */
    public final C13535 f18472;

    /* JADX INFO: renamed from: ۢ */
    public final SSLSocketFactory f18473;

    /* JADX INFO: renamed from: ۧ */
    public final List f18474;

    /* JADX INFO: renamed from: ܳ */
    public final Proxy f18475;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10182 f18476;

    /* JADX INFO: renamed from: ܿ */
    public final List f18477;

    /* JADX INFO: renamed from: ᩳ */
    public final HostnameVerifier f18478;

    /* JADX INFO: renamed from: ᩷ */
    public final SocketFactory f18479;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15134 f18480;

    public C7088(String str, int i, InterfaceC10182 interfaceC10182, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C24934 c24934, InterfaceC15134 interfaceC15134, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C8170 c8170 = new C8170();
        String str2 = sSLSocketFactory != null ? C0171b.f688a : C0170a.f680s;
        if (str2.equalsIgnoreCase(C0170a.f680s)) {
            c8170.f21569 = C0170a.f680s;
        } else {
            if (!str2.equalsIgnoreCase(C0171b.f688a)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c8170.f21569 = C0171b.f688a;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strM48487 = C21407.m48487(C13535.m30805(str, 0, str.length(), false));
        if (strM48487 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c8170.f21571 = strM48487;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(C20778.m46922(i, "unexpected port: "));
        }
        c8170.f21575 = i;
        this.f18472 = c8170.m18953();
        if (interfaceC10182 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f18476 = interfaceC10182;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f18479 = socketFactory;
        if (interfaceC15134 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f18480 = interfaceC15134;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f18477 = C21407.m48491(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f18474 = C21407.m48491(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f18471 = proxySelector;
        this.f18475 = proxy;
        this.f18473 = sSLSocketFactory;
        this.f18478 = hostnameVerifier;
        this.f18470 = c24934;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C13535 m16309() {
        return this.f18472;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10182 m16313() {
        return this.f18476;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final SocketFactory m16316() {
        return this.f18479;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15134 m16317() {
        return this.f18480;
    }

    /* JADX INFO: renamed from: ܿ */
    public final List m16314() {
        return this.f18477;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m16311() {
        return this.f18474;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ProxySelector m16308() {
        return this.f18471;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Proxy m16312() {
        return this.f18475;
    }

    /* JADX INFO: renamed from: ۢ */
    public final SSLSocketFactory m16310() {
        return this.f18473;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final HostnameVerifier m16315() {
        return this.f18478;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24934 m16306() {
        return this.f18470;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7088)) {
            return false;
        }
        C7088 c7088 = (C7088) obj;
        return this.f18472.equals(c7088.f18472) && m16307(c7088);
    }

    public final int hashCode() {
        int iHashCode = (this.f18471.hashCode() + ((this.f18474.hashCode() + ((this.f18477.hashCode() + ((this.f18480.hashCode() + ((this.f18476.hashCode() + ((this.f18472.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f18475;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f18473;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f18478;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C24934 c24934 = this.f18470;
        return iHashCode4 + (c24934 != null ? c24934.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16307(C7088 c7088) {
        return this.f18476.equals(c7088.f18476) && this.f18480.equals(c7088.f18480) && this.f18477.equals(c7088.f18477) && this.f18474.equals(c7088.f18474) && this.f18471.equals(c7088.f18471) && C21407.m48499(this.f18475, c7088.f18475) && C21407.m48499(this.f18473, c7088.f18473) && C21407.m48499(this.f18478, c7088.f18478) && C21407.m48499(this.f18470, c7088.f18470) && this.f18472.f38070 == c7088.f18472.f38070;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C13535 c13535 = this.f18472;
        sb.append(c13535.f38067);
        sb.append(":");
        sb.append(c13535.f38070);
        Proxy proxy = this.f18475;
        if (proxy != null) {
            sb.append(", proxy=");
            sb.append(proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f18471);
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }
}
