package l;

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
public final class C17915 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f54687;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC13431 f54688;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC13431 f54689;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f54690;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f54691;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54692;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public List f54693;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f54694;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public ProxySelector f54695;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC8221 f54696;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5399 f54697;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7787 f54698;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f54699;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f54700;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC22332 f54701;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23743 f54703;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC1232 f54704;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HostnameVerifier f54705;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final ArrayList f54706;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public SSLSocketFactory f54707;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19511 f54708;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54709;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public SocketFactory f54710;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8927 f54711;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41895(long j) {
        this.f54702 = C20032.m46167(j, TimeUnit.SECONDS);
    }

    public C17915() {
        this.f54706 = new ArrayList();
        this.f54687 = new ArrayList();
        this.f54697 = new C5399();
        this.f54693 = C17209.f52761;
        this.f54694 = C17209.f52760;
        this.f54701 = new C21627();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f54695 = proxySelector;
        if (proxySelector == null) {
            this.f54695 = new C19578();
        }
        this.f54708 = InterfaceC19511.f63052;
        this.f54710 = SocketFactory.getDefault();
        this.f54705 = C8288.f25465;
        this.f54703 = C23743.f76872;
        InterfaceC13431 interfaceC13431 = InterfaceC13431.f40142;
        this.f54688 = interfaceC13431;
        this.f54689 = interfaceC13431;
        this.f54711 = new C8927();
        this.f54696 = InterfaceC8221.f25328;
        this.f54691 = true;
        this.f54690 = true;
        this.f54709 = true;
        this.f54702 = 0;
        this.f54699 = 10000;
        this.f54700 = 10000;
        this.f54692 = 10000;
    }

    public C17915(C17209 c17209) {
        ArrayList arrayList = new ArrayList();
        this.f54706 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f54687 = arrayList2;
        this.f54697 = c17209.f52772;
        this.f54693 = c17209.f52779;
        this.f54694 = c17209.f52770;
        arrayList.addAll(c17209.f52778);
        arrayList2.addAll(c17209.f52780);
        this.f54701 = c17209.f52775;
        this.f54695 = c17209.f52786;
        this.f54708 = c17209.f52765;
        this.f54698 = c17209.f52784;
        this.f54710 = c17209.f52769;
        this.f54707 = c17209.f52768;
        this.f54704 = c17209.f52764;
        this.f54705 = c17209.f52771;
        this.f54703 = c17209.f52763;
        this.f54688 = c17209.f52776;
        this.f54689 = c17209.f52783;
        this.f54711 = c17209.f52773;
        this.f54696 = c17209.f52785;
        this.f54691 = c17209.f52762;
        this.f54690 = c17209.f52767;
        this.f54709 = c17209.f52782;
        this.f54702 = c17209.f52781;
        this.f54699 = c17209.f52774;
        this.f54700 = c17209.f52766;
        this.f54692 = c17209.f52777;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41896(long j, TimeUnit timeUnit) {
        this.f54699 = C20032.m46167(j, timeUnit);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41904(long j, TimeUnit timeUnit) {
        this.f54700 = C20032.m46167(j, timeUnit);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41906(long j, TimeUnit timeUnit) {
        this.f54692 = C20032.m46167(j, timeUnit);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41900(C7787 c7787) {
        this.f54698 = c7787;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41898(SocketFactory socketFactory) {
        this.f54710 = socketFactory;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41899(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (x509TrustManager == null) {
            throw new NullPointerException("trustManager == null");
        }
        this.f54707 = sSLSocketFactory;
        this.f54704 = C18872.m43580().mo43581(x509TrustManager);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41902(C15738 c15738) {
        this.f54705 = c15738;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41901(InterfaceC13431 interfaceC13431) {
        this.f54689 = interfaceC13431;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41897(List list) {
        this.f54694 = C20032.m46175(list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41903(InterfaceC23037 interfaceC23037) {
        this.f54706.add(interfaceC23037);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41905(InterfaceC23037 interfaceC23037) {
        this.f54687.add(interfaceC23037);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17209 m41894() {
        return new C17209(this);
    }
}
