package p067l;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۢ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F4DQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11175 {

    /* JADX INFO: renamed from: ֫ */
    public final C7088 f31017;

    /* JADX INFO: renamed from: ۜ */
    public final C10996 f31018;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC18228 f31019;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f31020;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC21582 f31021;

    /* JADX INFO: renamed from: ܿ */
    public int f31022;

    /* JADX INFO: renamed from: ᩳ */
    public List f31023;

    /* JADX INFO: renamed from: ᩻ */
    public List f31024;

    public C11175(C7088 c7088, C10996 c10996, InterfaceC18228 interfaceC18228, AbstractC21582 abstractC21582) {
        List list = Collections.EMPTY_LIST;
        this.f31024 = list;
        this.f31023 = list;
        this.f31020 = new ArrayList();
        this.f31017 = c7088;
        this.f31018 = c10996;
        this.f31019 = interfaceC18228;
        this.f31021 = abstractC21582;
        C13535 c13535M16309 = c7088.m16309();
        Proxy proxyM16312 = c7088.m16312();
        if (proxyM16312 != null) {
            this.f31024 = Collections.singletonList(proxyM16312);
        } else {
            List<Proxy> listSelect = c7088.m16308().select(c13535M16309.m30815());
            this.f31024 = (listSelect == null || listSelect.isEmpty()) ? C21407.m48492(Proxy.NO_PROXY) : C21407.m48491(listSelect);
        }
        this.f31022 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21904 m25800() throws SocketException, UnknownHostException {
        ArrayList arrayList;
        String strM30820;
        int iM30818;
        if (!m25799()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        do {
            int i = this.f31022;
            int size = this.f31024.size();
            arrayList = this.f31020;
            if (i >= size) {
                break;
            }
            int i2 = this.f31022;
            int size2 = this.f31024.size();
            C7088 c7088 = this.f31017;
            if (i2 >= size2) {
                throw new SocketException("No route to " + c7088.m16309().m30820() + "; exhausted proxy configurations: " + this.f31024);
            }
            int i3 = this.f31022;
            this.f31022 = i3 + 1;
            Proxy proxy = (Proxy) this.f31024.get(i3);
            this.f31023 = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                strM30820 = c7088.m16309().m30820();
                iM30818 = c7088.m16309().m30818();
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                if (address == null) {
                    strM30820 = inetSocketAddress.getHostName();
                } else {
                    strM30820 = address.getHostAddress();
                }
                iM30818 = inetSocketAddress.getPort();
            }
            if (iM30818 < 1 || iM30818 > 65535) {
                throw new SocketException("No route to " + strM30820 + ":" + iM30818 + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f31023.add(InetSocketAddress.createUnresolved(strM30820, iM30818));
            } else {
                this.f31021.getClass();
                List listMo6207 = c7088.m16313().mo6207(strM30820);
                if (listMo6207.isEmpty()) {
                    throw new UnknownHostException(c7088.m16313() + " returned no addresses for " + strM30820);
                }
                int size3 = listMo6207.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f31023.add(new InetSocketAddress((InetAddress) listMo6207.get(i4), iM30818));
                }
            }
            int size4 = this.f31023.size();
            for (int i5 = 0; i5 < size4; i5++) {
                C7325 c7325 = new C7325(c7088, proxy, (InetSocketAddress) this.f31023.get(i5));
                if (this.f31018.m25383(c7325)) {
                    arrayList.add(c7325);
                } else {
                    arrayList2.add(c7325);
                }
            }
        } while (arrayList2.isEmpty());
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(arrayList);
            arrayList.clear();
        }
        return new C21904(arrayList2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25798(C7325 c7325, IOException iOException) {
        if (c7325.m16902().type() != Proxy.Type.DIRECT) {
            C7088 c7088 = this.f31017;
            if (c7088.m16308() != null) {
                c7088.m16308().connectFailed(c7088.m16309().m30815(), c7325.m16902().address(), iOException);
            }
        }
        this.f31018.m25382(c7325);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25799() {
        return this.f31022 < this.f31024.size() || !this.f31020.isEmpty();
    }
}
