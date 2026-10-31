package l;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۡۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8806 extends AbstractC22128 implements InterfaceC3492, InterfaceC11959 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f26813;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Thread f26815;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f26816;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f26817;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7725 f26818;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f26819;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C11254 f26820;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f26821;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f26822;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f26823;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile MulticastSocket f26824;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Set f26825;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f26826;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile InetAddress f26827;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22833 f26828;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f26812 = C11321.m27962(C8806.class.getName());

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final Random f26811 = new Random();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ExecutorService f26829 = Executors.newSingleThreadExecutor(new ThreadFactoryC2435());

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f26814 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Object f26830 = new Object();

    public C8806(InetAddress inetAddress) throws IOException {
        f26812.mo7088("JmDNS instance created");
        this.f26828 = new C22833(100);
        this.f26821 = C16895.m39756();
        this.f26817 = new ConcurrentMapC10942();
        this.f26825 = C20195.synchronizedSet(new HashSet());
        this.f26823 = new ConcurrentMapC10942();
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(20);
        this.f26819 = concurrentMapC10942;
        this.f26813 = new ConcurrentMapC10942(20);
        C7725 c7725M20681 = C7725.m20681(inetAddress, this);
        this.f26818 = c7725M20681;
        this.f26816 = c7725M20681.f23907;
        m22713(c7725M20681);
        m22712(concurrentMapC10942.values());
        mo22736();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22712(Collection collection) {
        if (this.f26815 == null) {
            C3161 c3161 = new C3161(this);
            this.f26815 = c3161;
            c3161.start();
        }
        mo22758();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                m22747(new C20095((AbstractC10134) it.next()));
            } catch (Exception e) {
                f26812.mo7083("start() Registration exception ", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22713(C7725 c7725) throws IOException {
        if (this.f26827 == null) {
            if (c7725.f23908 instanceof Inet6Address) {
                this.f26827 = InetAddress.getByName(C13038.f39045);
            } else {
                this.f26827 = InetAddress.getByName(C13038.f39043);
            }
        }
        if (this.f26824 != null) {
            m22715();
        }
        int i = C13038.f39044;
        this.f26824 = new MulticastSocket(i);
        if (c7725 == null || c7725.f23909 == null) {
            f26812.mo7095(this.f26827, "Trying to joinGroup({})");
            this.f26824.joinGroup(this.f26827);
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f26827, i);
            this.f26824.setNetworkInterface(c7725.f23909);
            f26812.mo7090("Trying to joinGroup({}, {})", inetSocketAddress, c7725.f23909);
            this.f26824.joinGroup(inetSocketAddress, c7725.f23909);
        }
        this.f26824.setTimeToLive(255);
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    private void m22715() {
        f26812.mo7088("closeMulticastSocket()");
        if (this.f26824 != null) {
            try {
                try {
                    this.f26824.leaveGroup(this.f26827);
                    while (true) {
                        Thread thread = this.f26815;
                        if (thread == null || !thread.isAlive()) {
                            break;
                        }
                        synchronized (this) {
                            try {
                                Thread thread2 = this.f26815;
                                if (thread2 != null && thread2.isAlive()) {
                                    f26812.mo7088("closeMulticastSocket(): waiting for jmDNS monitor");
                                    wait(1000L);
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (SocketException unused2) {
                }
                this.f26824.close();
                this.f26815 = null;
            } catch (Exception e) {
                f26812.mo7083("closeMulticastSocket() Close socket exception ", (Throwable) e);
            }
            this.f26824 = null;
        }
    }

    @Override // l.InterfaceC3492
    /* JADX INFO: renamed from: ֫ */
    public final void mo10674(AbstractC1729 abstractC1729) {
        this.f26818.mo10674(abstractC1729);
    }

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m22768() {
        this.f26818.m20690();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22734(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        this.f26818.m20686(abstractC20780, enumC7394);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22733(AbstractC20780 abstractC20780) {
        this.f26818.m20685(abstractC20780);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22749(AbstractC20780 abstractC20780, EnumC7394 enumC7394) {
        return this.f26818.m20693(abstractC20780, enumC7394);
    }

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22757() {
        return this.f26818.m20699();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m22752() {
        return this.f26818.m20698();
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22750() {
        return this.f26818.m20694();
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean m22741() {
        return this.f26818.m20697();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C7725 c7725 = this.f26818;
        if (c7725.m20689()) {
            return;
        }
        InterfaceC2148 interfaceC2148 = f26812;
        interfaceC2148.mo7100(this, "Cancelling JmDNS: {}");
        if (c7725.m20687()) {
            interfaceC2148.mo7088("Canceling the timer");
            mo22756();
            m22763();
            m22714();
            interfaceC2148.mo7100(this, "Wait for JmDNS cancel: {}");
            c7725.m20695();
            interfaceC2148.mo7088("Canceling the state timer");
            mo22721();
            this.f26829.shutdown();
            m22715();
            C6314.m17441().m17442(this);
            interfaceC2148.mo7088("JmDNS closed.");
        }
        mo10674((AbstractC1729) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22747(C20095 c20095) {
        C7725 c7725 = this.f26818;
        boolean zM20689 = c7725.m20689();
        InetAddress inetAddress = c7725.f23908;
        if (zM20689 || c7725.m20700()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C8806 c8806M46331 = c20095.m46331();
        ConcurrentMapC10942 concurrentMapC10942 = this.f26819;
        if (c8806M46331 != null) {
            if (c20095.m46331() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (concurrentMapC10942.get(c20095.mo25455()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c20095.m46326(this);
        m22748(c20095.m46334());
        c20095.m46333();
        c20095.m46335(c7725.f23907);
        c20095.m46324(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
        c20095.m46325(inetAddress instanceof Inet6Address ? (Inet6Address) inetAddress : null);
        m22716(c20095);
        while (concurrentMapC10942.putIfAbsent(c20095.mo25455(), c20095) != null) {
            m22716(c20095);
        }
        mo22758();
        f26812.mo7100(c20095, "registerService() JmDNS registered service as {}");
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22759() {
        return this.f26818.m20689();
    }

    public final boolean isClosed() {
        return this.f26818.m20700();
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22833 m22755() {
        return this.f26828;
    }

    public final String getName() {
        return this.f26816;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22746(C11254 c11254, InetAddress inetAddress, int i) {
        f26812.mo7082("{} handle query: {}", this.f26816, c11254);
        System.currentTimeMillis();
        Iterator it = c11254.m42648().iterator();
        boolean zMo2718 = false;
        while (it.hasNext()) {
            zMo2718 |= ((AbstractC22542) it.next()).mo2718(this);
        }
        ReentrantLock reentrantLock = this.f26814;
        reentrantLock.lock();
        try {
            C11254 c11255 = this.f26820;
            if (c11255 != null) {
                c11255.m27846(c11254);
            } else {
                C11254 c11254Clone = c11254.clone();
                if (c11254.m42657()) {
                    this.f26820 = c11254Clone;
                }
                mo22727(c11254Clone, inetAddress, i);
            }
            reentrantLock.unlock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = c11254.f56917.iterator();
            while (it2.hasNext()) {
                m22735((AbstractC22542) it2.next(), jCurrentTimeMillis);
            }
            if (zMo2718) {
                mo22758();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7725 m22739() {
        return this.f26818;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InetAddress m22765() {
        return this.f26818.f23908;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20095 m22719(String str, String str2, String str3) {
        m22718();
        String lowerCase = str.toLowerCase();
        m22748(str);
        C6689 c6689 = new C6689(str);
        ConcurrentMapC10942 concurrentMapC10942 = this.f26823;
        if (concurrentMapC10942.putIfAbsent(lowerCase, c6689) == null) {
            m22711(lowerCase, (InterfaceC5900) concurrentMapC10942.get(lowerCase), true);
        }
        C20095 c20095M22720 = m22720(str, str2, str3, true);
        mo22731(c20095M22720);
        return c20095M22720;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20095 m22720(String str, String str2, String str3, boolean z) {
        byte[] bArr;
        String strMo25462;
        HashMap mapM13431 = C4572.m13431(str);
        mapM13431.put(EnumC12250.Instance, str2);
        mapM13431.put(EnumC12250.Subtype, str3);
        C20095 c20095 = new C20095(C20095.m46320(mapM13431), 0, 0, 0, z, null);
        EnumC5983 enumC5983 = EnumC5983.CLASS_ANY;
        C8431 c8431 = new C8431(str, enumC5983, false, 0, c20095.mo25450());
        C22833 c22833 = this.f26828;
        AbstractC13660 abstractC13660M50946 = c22833.m50946(c8431);
        if (abstractC13660M50946 instanceof AbstractC22542) {
            C20095 c20095Mo2715 = ((AbstractC22542) abstractC13660M50946).mo2715(z);
            HashMap mapM46338 = c20095Mo2715.m46338();
            AbstractC13660 abstractC13660M50942 = c22833.m50942(c20095.mo25450(), EnumC11628.TYPE_SRV, enumC5983);
            if (abstractC13660M50942 instanceof AbstractC22542) {
                C20095 c20095Mo2716 = ((AbstractC22542) abstractC13660M50942).mo2715(z);
                C20095 c20096 = new C20095(mapM46338, c20095Mo2716.mo25454(), c20095Mo2716.mo25453(), c20095Mo2716.mo25458(), z, null);
                byte[] bArrMo25451 = c20095Mo2716.mo25451();
                strMo25462 = c20095Mo2716.mo25462();
                bArr = bArrMo25451;
                c20095Mo2715 = c20096;
            } else {
                bArr = null;
                strMo25462 = "";
            }
            Iterator it = c22833.m50945(strMo25462, EnumC11628.TYPE_A, enumC5983).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC13660 abstractC13660 = (AbstractC13660) it.next();
                if (abstractC13660 instanceof AbstractC22542) {
                    C20095 c20095Mo2717 = ((AbstractC22542) abstractC13660).mo2715(z);
                    for (Inet4Address inet4Address : c20095Mo2717.mo25460()) {
                        c20095Mo2715.m46324(inet4Address);
                    }
                    c20095Mo2715.m46329(c20095Mo2717.mo25451());
                }
            }
            for (AbstractC13660 abstractC13661 : c22833.m50945(strMo25462, EnumC11628.TYPE_AAAA, EnumC5983.CLASS_ANY)) {
                if (abstractC13661 instanceof AbstractC22542) {
                    C20095 c20095Mo2718 = ((AbstractC22542) abstractC13661).mo2715(z);
                    for (Inet6Address inet6Address : c20095Mo2718.mo25452()) {
                        c20095Mo2715.m46325(inet6Address);
                    }
                    c20095Mo2715.m46329(c20095Mo2718.mo25451());
                }
            }
            AbstractC13660 abstractC13660M50943 = c22833.m50942(c20095Mo2715.mo25450(), EnumC11628.TYPE_TXT, EnumC5983.CLASS_ANY);
            if (abstractC13660M50943 instanceof AbstractC22542) {
                c20095Mo2715.m46329(((AbstractC22542) abstractC13660M50943).mo2715(z).mo25451());
            }
            if (c20095Mo2715.mo25451().length == 0) {
                c20095Mo2715.m46329(bArr);
            }
            if (c20095Mo2715.mo25457()) {
                return c20095Mo2715;
            }
        }
        return c20095;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22729(C15154 c15154) {
        ArrayList arrayList;
        List list = (List) this.f26817.get(c15154.mo31524().toLowerCase());
        if (list == null || list.isEmpty() || c15154.mo31523() == null || !c15154.mo31523().mo25457()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f26829.submit(new RunnableC1750((C15860) it.next(), c15154));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22725(String str, InterfaceC5900 interfaceC5900) {
        m22711(str, interfaceC5900, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22711(String str, InterfaceC5900 interfaceC5900, boolean z) {
        C15860 c15860 = new C15860(interfaceC5900, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f26817.get(lowerCase);
        if (list == null) {
            if (this.f26817.putIfAbsent(lowerCase, new LinkedList()) == null && this.f26823.putIfAbsent(lowerCase, new C6689(str)) == null) {
                m22711(lowerCase, (InterfaceC5900) this.f26823.get(lowerCase), true);
            }
            list = (List) this.f26817.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(c15860)) {
                    list.add(c15860);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C22833 c22833 = this.f26828;
        c22833.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : c22833.values()) {
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC22542 abstractC22542 = (AbstractC22542) ((AbstractC13660) it.next());
            if (abstractC22542.m32832() == EnumC11628.TYPE_SRV && abstractC22542.m32822().endsWith(lowerCase)) {
                arrayList.add(new C15154(this, abstractC22542.m32829(), m22710(abstractC22542.m32829(), abstractC22542.m32828()), abstractC22542.mo2715(false)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c15860.m37597((AbstractC12955) it2.next());
        }
        mo22724(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22744(String str, InterfaceC5900 interfaceC5900) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f26817.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C15860(interfaceC5900, false));
                if (list.isEmpty()) {
                    this.f26817.remove(lowerCase, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m22763() {
        InterfaceC2148 interfaceC2148 = f26812;
        interfaceC2148.mo7088("unregisterAllServices()");
        ConcurrentMapC10942 concurrentMapC10942 = this.f26819;
        for (AbstractC10134 abstractC10134 : concurrentMapC10942.values()) {
            if (abstractC10134 != null) {
                interfaceC2148.mo7100(abstractC10134, "Cancelling service info: {}");
                ((C20095) abstractC10134).m46341();
            }
        }
        mo22740();
        for (Map.Entry entry : concurrentMapC10942.entrySet()) {
            AbstractC10134 abstractC10135 = (AbstractC10134) entry.getValue();
            if (abstractC10135 != null) {
                String str = (String) entry.getKey();
                interfaceC2148.mo7100(abstractC10135, "Wait for service info cancel: {}");
                ((C20095) abstractC10135).m46340();
                concurrentMapC10942.remove(str, abstractC10135);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22748(String str) {
        boolean z;
        C9512 c9512;
        HashMap mapM13431 = C4572.m13431(str);
        String str2 = (String) mapM13431.get(EnumC12250.Domain);
        String str3 = (String) mapM13431.get(EnumC12250.Protocol);
        String str4 = (String) mapM13431.get(EnumC12250.Application);
        String str5 = (String) mapM13431.get(EnumC12250.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C4860.m14172("_", str4, ".") : "");
        String strM51498 = C23202.m51498(sb, str3.length() > 0 ? C4860.m14172("_", str3, ".") : "", str2, ".");
        String lowerCase = strM51498.toLowerCase();
        boolean z2 = true;
        f26812.mo7092("{} registering service type: {} as: {}{}{}", this.f26816, str, strM51498, str5.length() > 0 ? " subtype: " : "", str5.length() > 0 ? str5 : "");
        if (this.f26813.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f26813.putIfAbsent(lowerCase, new C9512(strM51498)) == null;
            if (z) {
                Set set = this.f26825;
                C2456[] c2456Arr = (C2456[]) set.toArray(new C2456[set.size()]);
                C15154 c15154 = new C15154(this, strM51498, "", null);
                for (C2456 c2456 : c2456Arr) {
                    this.f26829.submit(new RunnableC10923(c2456, c15154));
                }
            }
        }
        if (str5.length() <= 0 || (c9512 = (C9512) this.f26813.get(lowerCase)) == null || c9512.containsKey(str5.toLowerCase())) {
            return z;
        }
        synchronized (c9512) {
            if (c9512.containsKey(str5.toLowerCase())) {
                z2 = z;
            } else {
                c9512.m24373(str5);
                Set set2 = this.f26825;
                C2456[] c2456Arr2 = (C2456[]) set2.toArray(new C2456[set2.size()]);
                C15154 c15155 = new C15154(this, "_" + str5 + "._sub." + strM51498, "", null);
                for (C2456 c2457 : c2456Arr2) {
                    this.f26829.submit(new RunnableC16566(c2457, c15155));
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m22716(C20095 c20095) {
        boolean z;
        boolean z2;
        C7725 c7725;
        String strMo25455 = c20095.mo25455();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            Iterator it = this.f26828.m50941(c20095.mo25455()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z = false;
                z2 = true;
                c7725 = this.f26818;
                if (!zHasNext) {
                    break;
                }
                AbstractC13660 abstractC13660 = (AbstractC13660) it.next();
                if (EnumC11628.TYPE_SRV.equals(abstractC13660.m32832()) && !abstractC13660.mo32824(jCurrentTimeMillis)) {
                    C15485 c15485 = (C15485) abstractC13660;
                    if (c15485.m36569() != c20095.mo25454() || !c15485.m36568().equals(c7725.f23907)) {
                        f26812.mo7092("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}", abstractC13660, c15485.m36568(), c7725.f23907, Boolean.valueOf(c15485.m36568().equals(c7725.f23907)));
                        c20095.m46323(((C5278) C19390.m44664()).m15205(c20095.getName(), EnumC0338.SERVICE));
                        z = true;
                        break;
                    }
                }
            }
            AbstractC10134 abstractC10134 = (AbstractC10134) this.f26819.get(c20095.mo25455());
            if (abstractC10134 == null || abstractC10134 == c20095) {
                z2 = z;
            } else {
                InterfaceC1044 interfaceC1044M44664 = C19390.m44664();
                InetAddress inetAddress = c7725.f23908;
                c20095.m46323(((C5278) interfaceC1044M44664).m15205(c20095.getName(), EnumC0338.SERVICE));
            }
        } while (z2);
        strMo25455.equals(c20095.mo25455());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22732(C20095 c20095, C19015 c19015) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f26821.add(c20095);
        String lowerCase = c19015.m32828().toLowerCase();
        C22833 c22833 = this.f26828;
        for (AbstractC13660 abstractC13660 : c22833.m50941(lowerCase)) {
            if (abstractC13660 != null && abstractC13660.m32830() == c19015.m32830() && c19015.mo18988(abstractC13660) && c19015.m32828().equals(abstractC13660.m32828()) && !abstractC13660.mo32824(jCurrentTimeMillis)) {
                c20095.mo39758(c22833, jCurrentTimeMillis, abstractC13660);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22730(InterfaceC16897 interfaceC16897) {
        this.f26821.remove(interfaceC16897);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22723(long j, AbstractC22542 abstractC22542, EnumC23622 enumC23622) {
        ArrayList arrayList;
        List<C15860> arrayList2;
        C15154 c15154Mo2714 = abstractC22542.mo2714(this);
        if (enumC23622 == EnumC23622.Remove && EnumC11628.TYPE_SRV.equals(abstractC22542.m32832())) {
            Cloneable cloneableMo31523 = c15154Mo2714.mo31523();
            if (cloneableMo31523 instanceof InterfaceC16897) {
                m22730((InterfaceC16897) cloneableMo31523);
            }
        }
        synchronized (this.f26821) {
            arrayList = new ArrayList(this.f26821);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC16897) it.next()).mo39758(this.f26828, j, abstractC22542);
        }
        if (EnumC11628.TYPE_PTR.equals(abstractC22542.m32832()) || (EnumC11628.TYPE_SRV.equals(abstractC22542.m32832()) && EnumC23622.Remove.equals(enumC23622))) {
            if (c15154Mo2714.mo31523() == null || !c15154Mo2714.mo31523().mo25457()) {
                C20095 c20095M22720 = m22720(c15154Mo2714.mo31524(), c15154Mo2714.getName(), "", false);
                if (c20095M22720.mo25457()) {
                    c15154Mo2714 = new C15154(this, c15154Mo2714.mo31524(), c15154Mo2714.getName(), c20095M22720);
                }
            }
            List list = (List) this.f26817.get(c15154Mo2714.mo31524().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList(list);
                }
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            f26812.mo7093(this.f26816, c15154Mo2714, arrayList2, enumC23622);
            if (arrayList2.isEmpty()) {
                return;
            }
            int iOrdinal = enumC23622.ordinal();
            if (iOrdinal == 0) {
                for (C15860 c15860 : arrayList2) {
                    if (c15860.m11681()) {
                        c15860.m37599(c15154Mo2714);
                    } else {
                        this.f26829.submit(new RunnableC17272(c15860, c15154Mo2714));
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            for (C15860 c15861 : arrayList2) {
                if (c15861.m11681()) {
                    c15861.m37597((AbstractC12955) c15154Mo2714);
                } else {
                    this.f26829.submit(new RunnableC17978(c15861, c15154Mo2714));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22735(AbstractC22542 abstractC22542, long j) {
        EnumC23622 enumC23622 = EnumC23622.Noop;
        boolean zMo32824 = abstractC22542.mo32824(j);
        InterfaceC2148 interfaceC2148 = f26812;
        interfaceC2148.mo7082("{} handle response: {}", this.f26816, abstractC22542);
        if (!abstractC22542.m32826() && !abstractC22542.m32834()) {
            boolean zM32833 = abstractC22542.m32833();
            AbstractC22542 abstractC22543 = (AbstractC22542) this.f26828.m50946(abstractC22542);
            interfaceC2148.mo7082("{} handle response cached record: {}", this.f26816, abstractC22543);
            if (zM32833) {
                for (AbstractC13660 abstractC13660 : this.f26828.m50941(abstractC22542.m32822())) {
                    if (abstractC22542.m32832().equals(abstractC13660.m32832()) && abstractC22542.m32830().equals(abstractC13660.m32830())) {
                        AbstractC22542 abstractC22544 = (AbstractC22542) abstractC13660;
                        if (abstractC22544.m50542() < j - 1000) {
                            f26812.mo7095(abstractC13660, "setWillExpireSoon() on: {}");
                            abstractC22544.m50547(j);
                        }
                    }
                }
            }
            if (abstractC22543 != null) {
                if (zMo32824) {
                    if (abstractC22542.m50540() == 0) {
                        enumC23622 = EnumC23622.Noop;
                        f26812.mo7095(abstractC22543, "Record is expired - setWillExpireSoon() on:\n\t{}");
                        abstractC22543.m50547(j);
                    } else {
                        enumC23622 = EnumC23622.Remove;
                        f26812.mo7095(abstractC22543, "Record is expired - removeDNSEntry() on:\n\t{}");
                        this.f26828.m50947(abstractC22543);
                    }
                } else if (abstractC22542.mo2720(abstractC22543) && (abstractC22542.m32831().equals(abstractC22543.m32831()) || abstractC22542.m32831().length() <= 0)) {
                    abstractC22543.m50543(abstractC22542);
                    abstractC22542 = abstractC22543;
                } else if (abstractC22542.mo2721()) {
                    EnumC23622 enumC23623 = EnumC23622.Update;
                    f26812.mo7090("Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}", abstractC22542, abstractC22543);
                    C22833 c22833 = this.f26828;
                    c22833.getClass();
                    if (abstractC22542.m32822().equals(abstractC22543.m32822())) {
                        List list = (List) c22833.get(abstractC22542.m32822());
                        if (list == null) {
                            c22833.putIfAbsent(abstractC22542.m32822(), new ArrayList());
                            list = (List) c22833.get(abstractC22542.m32822());
                        }
                        synchronized (list) {
                            list.remove(abstractC22543);
                            list.add(abstractC22542);
                        }
                    }
                    enumC23622 = enumC23623;
                } else {
                    enumC23622 = EnumC23622.Add;
                    f26812.mo7095(abstractC22542, "Record (multiValue) has changed - addDNSEntry on:\n\t{}");
                    this.f26828.m50944(abstractC22542);
                }
            } else if (!zMo32824) {
                enumC23622 = EnumC23622.Add;
                f26812.mo7095(abstractC22542, "Record not cached - addDNSEntry on:\n\t{}");
                this.f26828.m50944(abstractC22542);
            }
        }
        if (abstractC22542.m32832() == EnumC11628.TYPE_PTR) {
            if (abstractC22542.m32826()) {
                if (zMo32824) {
                    return;
                }
                m22748(((C8431) abstractC22542).m22113());
                return;
            } else if (m22748(abstractC22542.m32828()) && enumC23622 == EnumC23622.Noop) {
                enumC23622 = EnumC23622.RegisterServiceType;
            }
        }
        if (enumC23622 != EnumC23622.Noop) {
            m22723(j, abstractC22542, enumC23622);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22726(C11254 c11254) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<AbstractC22542> arrayListM42648 = c11254.m42648();
        ArrayList<AbstractC22542> arrayList = new ArrayList(arrayListM42648.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC22542 abstractC22542 : arrayListM42648) {
            if (abstractC22542.m32832().equals(EnumC11628.TYPE_A) || abstractC22542.m32832().equals(EnumC11628.TYPE_AAAA)) {
                arrayList2.add(abstractC22542);
            } else {
                arrayList.add(abstractC22542);
            }
        }
        arrayList.addAll(arrayList2);
        boolean zMo2719 = false;
        boolean zMo27110 = false;
        for (AbstractC22542 abstractC22543 : arrayList) {
            m22735(abstractC22543, jCurrentTimeMillis);
            if (EnumC11628.TYPE_A.equals(abstractC22543.m32832()) || EnumC11628.TYPE_AAAA.equals(abstractC22543.m32832())) {
                zMo2719 |= abstractC22543.mo2719(this);
            } else {
                zMo27110 |= abstractC22543.mo2719(this);
            }
        }
        if (zMo2719 || zMo27110) {
            mo22758();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22728(C14780 c14780) throws IOException {
        InetAddress address;
        int port;
        if (c14780.m42651()) {
            return;
        }
        if (c14780.m35167() != null) {
            address = c14780.m35167().getAddress();
            port = c14780.m35167().getPort();
        } else {
            address = this.f26827;
            port = C13038.f39044;
        }
        byte[] bArrM35166 = c14780.m35166();
        DatagramPacket datagramPacket = new DatagramPacket(bArrM35166, bArrM35166.length, address, port);
        InterfaceC2148 interfaceC2148 = f26812;
        if (interfaceC2148.mo7099()) {
            try {
                C11254 c11254 = new C11254(datagramPacket);
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7090("send({}) JmDNS out:{}", this.f26816, c11254.m27849());
                }
            } catch (IOException e) {
                f26812.mo7082(C8806.class.toString(), C9045.m23341(new StringBuilder(".send("), this.f26816, ") - JmDNS can not parse what it sends!!!"), e);
            }
        }
        MulticastSocket multicastSocket = this.f26824;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo22767() {
        C6314.m17441().m17443(this).mo22767();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo22760() {
        C6314.m17441().m17443(this).mo22760();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo22756() {
        C6314.m17441().m17443(this).mo22756();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22721() {
        C6314.m17441().m17443(this).mo22721();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo22758() {
        C6314.m17441().m17443(this).mo22758();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo22738() {
        C6314.m17441().m17443(this).mo22738();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo22753() {
        C6314.m17441().m17443(this).mo22753();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo22740() {
        C6314.m17441().m17443(this).mo22740();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo22736() {
        C6314.m17441().m17443(this).mo22736();
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22731(C20095 c20095) {
        C6314.m17441().m17443(this).mo22731(c20095);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22724(String str) {
        C6314.m17441().m17443(this).mo22724(str);
    }

    @Override // l.InterfaceC11959
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22727(C11254 c11254, InetAddress inetAddress, int i) {
        C6314.m17441().m17443(this).mo22727(c11254, inetAddress, i);
    }

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m22754() {
        InterfaceC2148 interfaceC2148 = f26812;
        interfaceC2148.mo7100(this.f26816, "{}.recover()");
        if (this.f26818.m20689() || this.f26818.m20700() || this.f26818.m20694() || this.f26818.m20697()) {
            return;
        }
        synchronized (this.f26830) {
            if (this.f26818.m20687()) {
                String str = this.f26816 + ".recover()";
                interfaceC2148.mo7082("{} thread {}", str, Thread.currentThread().getName());
                new C14449(this, str).start();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m22761() {
        InterfaceC2148 interfaceC2148 = f26812;
        String str = this.f26816;
        interfaceC2148.mo7100(str, "{}.recover() Cleanning up");
        interfaceC2148.mo7104("RECOVERING");
        mo22767();
        ArrayList arrayList = new ArrayList(this.f26819.values());
        m22763();
        m22714();
        C7725 c7725 = this.f26818;
        c7725.m20695();
        mo22760();
        m22715();
        this.f26828.clear();
        interfaceC2148.mo7100(str, "{}.recover() All is clean");
        if (c7725.m20697()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C20095) ((AbstractC10134) it.next())).m46333();
            }
            c7725.m20691();
            try {
                m22713(c7725);
                m22712(arrayList);
            } catch (Exception e) {
                interfaceC2148.mo7083(str + ".recover() Start services exception ", (Throwable) e);
            }
            interfaceC2148.mo7103(str, "{}.recover() We are back!");
            return;
        }
        interfaceC2148.mo7103(str, "{}.recover() Could not recover we are Down!");
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m22718() {
        InterfaceC2148 interfaceC2148 = f26812;
        C22833 c22833 = this.f26828;
        c22833.m50943();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList<AbstractC13660> arrayList = new ArrayList();
        for (List list : c22833.values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (AbstractC13660 abstractC13660 : arrayList) {
            try {
                AbstractC22542 abstractC22542 = (AbstractC22542) abstractC13660;
                if (abstractC22542.mo32824(jCurrentTimeMillis)) {
                    m22723(jCurrentTimeMillis, abstractC22542, EnumC23622.Remove);
                    interfaceC2148.mo7095(abstractC13660, "Removing DNSEntry from cache: {}");
                    c22833.m50947(abstractC22542);
                } else if (abstractC22542.m50546(jCurrentTimeMillis)) {
                    abstractC22542.m50541();
                    String lowerCase = abstractC22542.mo2715(false).mo25446().toLowerCase();
                    if (hashSet.add(lowerCase) && this.f26823.containsKey(lowerCase.toLowerCase())) {
                        mo22724(lowerCase);
                    }
                }
            } catch (Exception e) {
                interfaceC2148.mo7083(this.f26816 + ".Error while reaping records: " + abstractC13660, (Throwable) e);
                interfaceC2148.mo7104(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.AbstractMap, l.ۢۢ᩵] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(2048, "\n\t---- Local Host -----\n\t");
        sbM32307.append(this.f26818);
        sbM32307.append("\n\t---- Services -----");
        for (Map.Entry entry : this.f26819.entrySet()) {
            sbM32307.append("\n\t\tService: ");
            sbM32307.append((String) entry.getKey());
            sbM32307.append(": ");
            sbM32307.append(entry.getValue());
        }
        sbM32307.append("\n\t---- Types ----");
        for (Object obj : this.f26813.values()) {
            sbM32307.append("\n\t\tType: ");
            sbM32307.append(obj.m24372());
            sbM32307.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sbM32307.append(obj);
        }
        sbM32307.append("\n");
        sbM32307.append(this.f26828.toString());
        sbM32307.append("\n\t---- Service Collectors ----");
        for (Map.Entry entry2 : this.f26823.entrySet()) {
            sbM32307.append("\n\t\tService Collector: ");
            sbM32307.append((String) entry2.getKey());
            sbM32307.append(": ");
            sbM32307.append(entry2.getValue());
        }
        sbM32307.append("\n\t---- Service Listeners ----");
        for (Map.Entry entry3 : this.f26817.entrySet()) {
            sbM32307.append("\n\t\tService Listener: ");
            sbM32307.append((String) entry3.getKey());
            sbM32307.append(": ");
            sbM32307.append(entry3.getValue());
        }
        return sbM32307.toString();
    }

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    private void m22714() {
        f26812.mo7088("disposeServiceCollectors()");
        ConcurrentMapC10942 concurrentMapC10942 = this.f26823;
        for (Map.Entry entry : concurrentMapC10942.entrySet()) {
            C6689 c6689 = (C6689) entry.getValue();
            if (c6689 != null) {
                String str = (String) entry.getKey();
                m22744(str, c6689);
                concurrentMapC10942.remove(str, c6689);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m22710(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ConcurrentMap m22751() {
        return this.f26819;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22743(long j) {
        this.f26822 = j;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long m22762() {
        return this.f26822;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22722(int i) {
        this.f26826 = i;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m22766() {
        return this.f26826;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static Random m22717() {
        return f26811;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22745(C11254 c11254) {
        ReentrantLock reentrantLock = this.f26814;
        reentrantLock.lock();
        try {
            if (this.f26820 == c11254) {
                this.f26820 = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 m22737() {
        return this.f26813;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MulticastSocket m22742() {
        return this.f26824;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InetAddress m22764() {
        return this.f26827;
    }
}
