package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.y.l;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.ۙ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DV */
/* JADX INFO: loaded from: classes2.dex */
public final class C4965 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23743 f15636;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ProxySelector f15637;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11749 f15638;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory f15639;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f15640;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Proxy f15641;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8221 f15642;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f15643;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier f15644;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SocketFactory f15645;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 f15646;

    public C4965(String str, int i, InterfaceC8221 interfaceC8221, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C23743 c23743, InterfaceC13431 interfaceC13431, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        C6104 c6104 = new C6104();
        String str2 = sSLSocketFactory != null ? b.a : a.s;
        if (str2.equalsIgnoreCase(a.s)) {
            c6104.f18714 = a.s;
        } else {
            if (!str2.equalsIgnoreCase(b.a)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c6104.f18714 = b.a;
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strM46171 = C20032.m46171(C11749.m28758(str, 0, str.length(), false));
        if (strM46171 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c6104.f18716 = strM46171;
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException(C19370.m44628(i, "unexpected port: "));
        }
        c6104.f18720 = i;
        this.f15638 = c6104.m17022();
        if (interfaceC8221 == null) {
            throw new NullPointerException("dns == null");
        }
        this.f15642 = interfaceC8221;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f15645 = socketFactory;
        if (interfaceC13431 == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f15646 = interfaceC13431;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f15643 = C20032.m46175(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f15640 = C20032.m46175(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f15637 = proxySelector;
        this.f15641 = proxy;
        this.f15639 = sSLSocketFactory;
        this.f15644 = hostnameVerifier;
        this.f15636 = c23743;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11749 m14405() {
        return this.f15638;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8221 m14409() {
        return this.f15642;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SocketFactory m14412() {
        return this.f15645;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC13431 m14413() {
        return this.f15646;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m14410() {
        return this.f15643;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m14407() {
        return this.f15640;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ProxySelector m14404() {
        return this.f15637;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Proxy m14408() {
        return this.f15641;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final SSLSocketFactory m14406() {
        return this.f15639;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HostnameVerifier m14411() {
        return this.f15644;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23743 m14402() {
        return this.f15636;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4965)) {
            return false;
        }
        C4965 c4965 = (C4965) obj;
        return this.f15638.equals(c4965.f15638) && m14403(c4965);
    }

    public final int hashCode() {
        int iHashCode = (this.f15637.hashCode() + ((this.f15640.hashCode() + ((this.f15643.hashCode() + ((this.f15646.hashCode() + ((this.f15642.hashCode() + ((this.f15638.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Proxy proxy = this.f15641;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f15639;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f15644;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C23743 c23743 = this.f15636;
        return iHashCode4 + (c23743 != null ? c23743.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14403(C4965 c4965) {
        return this.f15642.equals(c4965.f15642) && this.f15646.equals(c4965.f15646) && this.f15643.equals(c4965.f15643) && this.f15640.equals(c4965.f15640) && this.f15637.equals(c4965.f15637) && C20032.m46183(this.f15641, c4965.f15641) && C20032.m46183(this.f15639, c4965.f15639) && C20032.m46183(this.f15644, c4965.f15644) && C20032.m46183(this.f15636, c4965.f15636) && this.f15638.f35071 == c4965.f15638.f35071;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C11749 c11749 = this.f15638;
        sb.append(c11749.f35068);
        sb.append(":");
        sb.append(c11749.f35071);
        Proxy proxy = this.f15641;
        if (proxy != null) {
            sb.append(", proxy=");
            sb.append(proxy);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f15637);
        }
        sb.append(l.d);
        return sb.toString();
    }
}
