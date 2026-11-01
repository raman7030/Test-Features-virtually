package p067l;

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
public final class C10738 extends AbstractC23399 implements InterfaceC5688, InterfaceC13735 {

    /* JADX INFO: renamed from: ֫֫ */
    public final ConcurrentMapC12768 f29738;

    /* JADX INFO: renamed from: ۙ */
    public Thread f29740;

    /* JADX INFO: renamed from: ۛ */
    public final String f29741;

    /* JADX INFO: renamed from: ۟ */
    public final ConcurrentMapC12768 f29742;

    /* JADX INFO: renamed from: ۤ */
    public C9711 f29743;

    /* JADX INFO: renamed from: ۧ֫ */
    public final ConcurrentMapC12768 f29744;

    /* JADX INFO: renamed from: ۨ */
    public C13065 f29745;

    /* JADX INFO: renamed from: ۫ */
    public final List f29746;

    /* JADX INFO: renamed from: ۬ */
    public long f29747;

    /* JADX INFO: renamed from: ܰ */
    public final ConcurrentMapC12768 f29748;

    /* JADX INFO: renamed from: ܽ֫ */
    public volatile MulticastSocket f29749;

    /* JADX INFO: renamed from: ܿ֫ */
    public final Set f29750;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f29751;

    /* JADX INFO: renamed from: ᩶ */
    public volatile InetAddress f29752;

    /* JADX INFO: renamed from: ᩸ */
    public final C24069 f29753;

    /* JADX INFO: renamed from: ᩻֫ */
    public static InterfaceC4410 f29737 = C13128.m30023(C10738.class.getName());

    /* JADX INFO: renamed from: ܳ֫ */
    public static final Random f29736 = new Random();

    /* JADX INFO: renamed from: ᩹ */
    public final ExecutorService f29754 = Executors.newSingleThreadExecutor(new ThreadFactoryC4683());

    /* JADX INFO: renamed from: ۗ */
    public final ReentrantLock f29739 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩺ */
    public final Object f29755 = new Object();

    public C10738(InetAddress inetAddress) throws IOException {
        f29737.mo9183("JmDNS instance created");
        this.f29753 = new C24069(100);
        this.f29746 = C18426.m41997();
        this.f29742 = new ConcurrentMapC12768();
        this.f29750 = C21562.synchronizedSet(new HashSet());
        this.f29748 = new ConcurrentMapC12768();
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768(20);
        this.f29744 = concurrentMapC12768;
        this.f29738 = new ConcurrentMapC12768(20);
        C9711 c9711M22661 = C9711.m22661(inetAddress, this);
        this.f29743 = c9711M22661;
        this.f29741 = c9711M22661.f26820;
        m24683(c9711M22661);
        m24682(concurrentMapC12768.values());
        mo24706();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24682(Collection collection) {
        if (this.f29740 == null) {
            C5373 c5373 = new C5373(this);
            this.f29740 = c5373;
            c5373.start();
        }
        mo24728();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            try {
                m24717(new C21467((AbstractC12000) it.next()));
            } catch (Exception e) {
                f29737.mo9178("start() Registration exception ", (Throwable) e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24683(C9711 c9711) throws IOException {
        if (this.f29752 == null) {
            if (c9711.f26821 instanceof Inet6Address) {
                this.f29752 = InetAddress.getByName(C14760.f42091);
            } else {
                this.f29752 = InetAddress.getByName(C14760.f42089);
            }
        }
        if (this.f29749 != null) {
            m24685();
        }
        int i = C14760.f42090;
        this.f29749 = new MulticastSocket(i);
        if (c9711 == null || c9711.f26822 == null) {
            f29737.mo9190(this.f29752, "Trying to joinGroup({})");
            this.f29749.joinGroup(this.f29752);
        } else {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f29752, i);
            this.f29749.setNetworkInterface(c9711.f26822);
            f29737.mo9185("Trying to joinGroup({}, {})", inetSocketAddress, c9711.f26822);
            this.f29749.joinGroup(inetSocketAddress, c9711.f26822);
        }
        this.f29749.setTimeToLive(255);
    }

    /* JADX INFO: renamed from: ܺ֫ */
    private void m24685() {
        f29737.mo9183("closeMulticastSocket()");
        if (this.f29749 != null) {
            try {
                try {
                    this.f29749.leaveGroup(this.f29752);
                    while (true) {
                        Thread thread = this.f29740;
                        if (thread == null || !thread.isAlive()) {
                            break;
                        }
                        synchronized (this) {
                            try {
                                Thread thread2 = this.f29740;
                                if (thread2 != null && thread2.isAlive()) {
                                    f29737.mo9183("closeMulticastSocket(): waiting for jmDNS monitor");
                                    wait(1000L);
                                }
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                } catch (SocketException unused2) {
                }
                this.f29749.close();
                this.f29740 = null;
            } catch (Exception e) {
                f29737.mo9178("closeMulticastSocket() Close socket exception ", (Throwable) e);
            }
            this.f29749 = null;
        }
    }

    @Override // p067l.InterfaceC5688
    /* JADX INFO: renamed from: ֫ */
    public final void mo12669(AbstractC4012 abstractC4012) {
        this.f29743.mo12669(abstractC4012);
    }

    /* JADX INFO: renamed from: ᩻֫ */
    public final void m24738() {
        this.f29743.m22670();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24704(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        this.f29743.m22666(abstractC22118, enumC9396);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24703(AbstractC22118 abstractC22118) {
        this.f29743.m22665(abstractC22118);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m24719(AbstractC22118 abstractC22118, EnumC9396 enumC9396) {
        return this.f29743.m22673(abstractC22118, enumC9396);
    }

    /* JADX INFO: renamed from: ܿ֫ */
    public final boolean m24727() {
        return this.f29743.m22679();
    }

    /* JADX INFO: renamed from: ܰ */
    public final boolean m24722() {
        return this.f29743.m22678();
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final boolean m24720() {
        return this.f29743.m22674();
    }

    /* JADX INFO: renamed from: ۟ */
    public final boolean m24711() {
        return this.f29743.m22677();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C9711 c9711 = this.f29743;
        if (c9711.m22669()) {
            return;
        }
        InterfaceC4410 interfaceC4410 = f29737;
        interfaceC4410.mo9195(this, "Cancelling JmDNS: {}");
        if (c9711.m22667()) {
            interfaceC4410.mo9183("Canceling the timer");
            mo24726();
            m24733();
            m24684();
            interfaceC4410.mo9195(this, "Wait for JmDNS cancel: {}");
            c9711.m22675();
            interfaceC4410.mo9183("Canceling the state timer");
            mo24691();
            this.f29754.shutdown();
            m24685();
            C8370.m19381().m19382(this);
            interfaceC4410.mo9183("JmDNS closed.");
        }
        mo12669((AbstractC4012) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24717(C21467 c21467) {
        C9711 c9711 = this.f29743;
        boolean zM22669 = c9711.m22669();
        InetAddress inetAddress = c9711.f26821;
        if (zM22669 || c9711.m22680()) {
            throw new IllegalStateException("This DNS is closed.");
        }
        C10738 c10738M48647 = c21467.m48647();
        ConcurrentMapC12768 concurrentMapC12768 = this.f29744;
        if (c10738M48647 != null) {
            if (c21467.m48647() != this) {
                throw new IllegalStateException("A service information can only be registered with a single instamce of JmDNS.");
            }
            if (concurrentMapC12768.get(c21467.mo27475()) != null) {
                throw new IllegalStateException("A service information can only be registered once.");
            }
        }
        c21467.m48642(this);
        m24718(c21467.m48650());
        c21467.m48649();
        c21467.m48651(c9711.f26820);
        c21467.m48640(inetAddress instanceof Inet4Address ? (Inet4Address) inetAddress : null);
        c21467.m48641(inetAddress instanceof Inet6Address ? (Inet6Address) inetAddress : null);
        m24686(c21467);
        while (concurrentMapC12768.putIfAbsent(c21467.mo27475(), c21467) != null) {
            m24686(c21467);
        }
        mo24728();
        f29737.mo9195(c21467, "registerService() JmDNS registered service as {}");
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean m24729() {
        return this.f29743.m22669();
    }

    public final boolean isClosed() {
        return this.f29743.m22680();
    }

    /* JADX INFO: renamed from: ܶ */
    public final C24069 m24725() {
        return this.f29753;
    }

    public final String getName() {
        return this.f29741;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24716(C13065 c13065, InetAddress inetAddress, int i) {
        f29737.mo9177("{} handle query: {}", this.f29741, c13065);
        System.currentTimeMillis();
        Iterator it = c13065.m44909().iterator();
        boolean zMo5057 = false;
        while (it.hasNext()) {
            zMo5057 |= ((AbstractC23793) it.next()).mo5057(this);
        }
        ReentrantLock reentrantLock = this.f29739;
        reentrantLock.lock();
        try {
            C13065 c13066 = this.f29745;
            if (c13066 != null) {
                c13066.m29908(c13065);
            } else {
                C13065 c13065Clone = c13065.clone();
                if (c13065.m44918()) {
                    this.f29745 = c13065Clone;
                }
                mo24697(c13065Clone, inetAddress, i);
            }
            reentrantLock.unlock();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = c13065.f60135.iterator();
            while (it2.hasNext()) {
                m24705((AbstractC23793) it2.next(), jCurrentTimeMillis);
            }
            if (zMo5057) {
                mo24728();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final C9711 m24709() {
        return this.f29743;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final InetAddress m24735() {
        return this.f29743.f26821;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21467 m24689(String str, String str2, String str3) {
        m24688();
        String lowerCase = str.toLowerCase();
        m24718(str);
        C8726 c8726 = new C8726(str);
        ConcurrentMapC12768 concurrentMapC12768 = this.f29748;
        if (concurrentMapC12768.putIfAbsent(lowerCase, c8726) == null) {
            m24681(lowerCase, (InterfaceC7976) concurrentMapC12768.get(lowerCase), true);
        }
        C21467 c21467M24690 = m24690(str, str2, str3, true);
        mo24701(c21467M24690);
        return c21467M24690;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21467 m24690(String str, String str2, String str3, boolean z) {
        byte[] bArr;
        String strMo27482;
        HashMap mapM15319 = C6714.m15319(str);
        mapM15319.put(EnumC14011.Instance, str2);
        mapM15319.put(EnumC14011.Subtype, str3);
        C21467 c21467 = new C21467(C21467.m48636(mapM15319), 0, 0, 0, z, null);
        EnumC8055 enumC8055 = EnumC8055.CLASS_ANY;
        C10382 c10382 = new C10382(str, enumC8055, false, 0, c21467.mo27470());
        C24069 c24069 = this.f29753;
        AbstractC15351 abstractC15351M53336 = c24069.m53336(c10382);
        if (abstractC15351M53336 instanceof AbstractC23793) {
            C21467 c21467Mo5054 = ((AbstractC23793) abstractC15351M53336).mo5054(z);
            HashMap mapM48654 = c21467Mo5054.m48654();
            AbstractC15351 abstractC15351M53332 = c24069.m53332(c21467.mo27470(), EnumC13420.TYPE_SRV, enumC8055);
            if (abstractC15351M53332 instanceof AbstractC23793) {
                C21467 c21467Mo5055 = ((AbstractC23793) abstractC15351M53332).mo5054(z);
                C21467 c21468 = new C21467(mapM48654, c21467Mo5055.mo27474(), c21467Mo5055.mo27473(), c21467Mo5055.mo27478(), z, null);
                byte[] bArrMo27471 = c21467Mo5055.mo27471();
                strMo27482 = c21467Mo5055.mo27482();
                bArr = bArrMo27471;
                c21467Mo5054 = c21468;
            } else {
                bArr = null;
                strMo27482 = "";
            }
            Iterator it = c24069.m53335(strMo27482, EnumC13420.TYPE_A, enumC8055).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC15351 abstractC15351 = (AbstractC15351) it.next();
                if (abstractC15351 instanceof AbstractC23793) {
                    C21467 c21467Mo5056 = ((AbstractC23793) abstractC15351).mo5054(z);
                    for (Inet4Address inet4Address : c21467Mo5056.mo27480()) {
                        c21467Mo5054.m48640(inet4Address);
                    }
                    c21467Mo5054.m48645(c21467Mo5056.mo27471());
                }
            }
            for (AbstractC15351 abstractC15352 : c24069.m53335(strMo27482, EnumC13420.TYPE_AAAA, EnumC8055.CLASS_ANY)) {
                if (abstractC15352 instanceof AbstractC23793) {
                    C21467 c21467Mo5057 = ((AbstractC23793) abstractC15352).mo5054(z);
                    for (Inet6Address inet6Address : c21467Mo5057.mo27472()) {
                        c21467Mo5054.m48641(inet6Address);
                    }
                    c21467Mo5054.m48645(c21467Mo5057.mo27471());
                }
            }
            AbstractC15351 abstractC15351M53333 = c24069.m53332(c21467Mo5054.mo27470(), EnumC13420.TYPE_TXT, EnumC8055.CLASS_ANY);
            if (abstractC15351M53333 instanceof AbstractC23793) {
                c21467Mo5054.m48645(((AbstractC23793) abstractC15351M53333).mo5054(z).mo27471());
            }
            if (c21467Mo5054.mo27471().length == 0) {
                c21467Mo5054.m48645(bArr);
            }
            if (c21467Mo5054.mo27477()) {
                return c21467Mo5054;
            }
        }
        return c21467;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24699(C16771 c16771) {
        ArrayList arrayList;
        List list = (List) this.f29742.get(c16771.mo33611().toLowerCase());
        if (list == null || list.isEmpty() || c16771.mo33610() == null || !c16771.mo33610().mo27477()) {
            return;
        }
        synchronized (list) {
            arrayList = new ArrayList(list);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f29754.submit(new RunnableC4032((C17442) it.next(), c16771));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24695(String str, InterfaceC7976 interfaceC7976) {
        m24681(str, interfaceC7976, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24681(String str, InterfaceC7976 interfaceC7976, boolean z) {
        C17442 c17442 = new C17442(interfaceC7976, z);
        String lowerCase = str.toLowerCase();
        List list = (List) this.f29742.get(lowerCase);
        if (list == null) {
            if (this.f29742.putIfAbsent(lowerCase, new LinkedList()) == null && this.f29748.putIfAbsent(lowerCase, new C8726(str)) == null) {
                m24681(lowerCase, (InterfaceC7976) this.f29748.get(lowerCase), true);
            }
            list = (List) this.f29742.get(lowerCase);
        }
        if (list != null) {
            synchronized (list) {
                if (!list.contains(c17442)) {
                    list.add(c17442);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C24069 c24069 = this.f29753;
        c24069.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : c24069.values()) {
            if (list2 != null) {
                arrayList2.addAll(list2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC23793 abstractC23793 = (AbstractC23793) ((AbstractC15351) it.next());
            if (abstractC23793.m34947() == EnumC13420.TYPE_SRV && abstractC23793.m34937().endsWith(lowerCase)) {
                arrayList.add(new C16771(this, abstractC23793.m34944(), m24680(abstractC23793.m34944(), abstractC23793.m34943()), abstractC23793.mo5054(false)));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c17442.m39769((AbstractC14681) it2.next());
        }
        mo24694(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24714(String str, InterfaceC7976 interfaceC7976) {
        String lowerCase = str.toLowerCase();
        List list = (List) this.f29742.get(lowerCase);
        if (list != null) {
            synchronized (list) {
                list.remove(new C17442(interfaceC7976, false));
                if (list.isEmpty()) {
                    this.f29742.remove(lowerCase, list);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷֫ */
    public final void m24733() {
        InterfaceC4410 interfaceC4410 = f29737;
        interfaceC4410.mo9183("unregisterAllServices()");
        ConcurrentMapC12768 concurrentMapC12768 = this.f29744;
        for (AbstractC12000 abstractC12000 : concurrentMapC12768.values()) {
            if (abstractC12000 != null) {
                interfaceC4410.mo9195(abstractC12000, "Cancelling service info: {}");
                ((C21467) abstractC12000).m48657();
            }
        }
        mo24710();
        for (Map.Entry entry : concurrentMapC12768.entrySet()) {
            AbstractC12000 abstractC12001 = (AbstractC12000) entry.getValue();
            if (abstractC12001 != null) {
                String str = (String) entry.getKey();
                interfaceC4410.mo9195(abstractC12001, "Wait for service info cancel: {}");
                ((C21467) abstractC12001).m48656();
                concurrentMapC12768.remove(str, abstractC12001);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m24718(String str) {
        boolean z;
        C11409 c11409;
        HashMap mapM15319 = C6714.m15319(str);
        String str2 = (String) mapM15319.get(EnumC14011.Domain);
        String str3 = (String) mapM15319.get(EnumC14011.Protocol);
        String str4 = (String) mapM15319.get(EnumC14011.Application);
        String str5 = (String) mapM15319.get(EnumC14011.Subtype);
        StringBuilder sb = new StringBuilder();
        sb.append(str4.length() > 0 ? C6988.m16053("_", str4, ".") : "");
        String strM53894 = C24420.m53894(sb, str3.length() > 0 ? C6988.m16053("_", str3, ".") : "", str2, ".");
        String lowerCase = strM53894.toLowerCase();
        boolean z2 = true;
        f29737.mo9187("{} registering service type: {} as: {}{}{}", this.f29741, str, strM53894, str5.length() > 0 ? " subtype: " : "", str5.length() > 0 ? str5 : "");
        if (this.f29738.containsKey(lowerCase) || str4.toLowerCase().equals("dns-sd") || str2.toLowerCase().endsWith("in-addr.arpa") || str2.toLowerCase().endsWith("ip6.arpa")) {
            z = false;
        } else {
            z = this.f29738.putIfAbsent(lowerCase, new C11409(strM53894)) == null;
            if (z) {
                Set set = this.f29750;
                C4703[] c4703Arr = (C4703[]) set.toArray(new C4703[set.size()]);
                C16771 c16771 = new C16771(this, strM53894, "", null);
                for (C4703 c4703 : c4703Arr) {
                    this.f29754.submit(new RunnableC12750(c4703, c16771));
                }
            }
        }
        if (str5.length() <= 0 || (c11409 = (C11409) this.f29738.get(lowerCase)) == null || c11409.containsKey(str5.toLowerCase())) {
            return z;
        }
        synchronized (c11409) {
            if (c11409.containsKey(str5.toLowerCase())) {
                z2 = z;
            } else {
                c11409.m26383(str5);
                Set set2 = this.f29750;
                C4703[] c4703Arr2 = (C4703[]) set2.toArray(new C4703[set2.size()]);
                C16771 c16772 = new C16771(this, "_" + str5 + "._sub." + strM53894, "", null);
                for (C4703 c4704 : c4703Arr2) {
                    this.f29754.submit(new RunnableC18113(c4704, c16772));
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m24686(C21467 c21467) {
        boolean z;
        boolean z2;
        C9711 c9711;
        String strMo27475 = c21467.mo27475();
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            Iterator it = this.f29753.m53331(c21467.mo27475()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z = false;
                z2 = true;
                c9711 = this.f29743;
                if (!zHasNext) {
                    break;
                }
                AbstractC15351 abstractC15351 = (AbstractC15351) it.next();
                if (EnumC13420.TYPE_SRV.equals(abstractC15351.m34947()) && !abstractC15351.mo34939(jCurrentTimeMillis)) {
                    C17086 c17086 = (C17086) abstractC15351;
                    if (c17086.m38728() != c21467.mo27474() || !c17086.m38727().equals(c9711.f26820)) {
                        f29737.mo9187("makeServiceNameUnique() JmDNS.makeServiceNameUnique srv collision:{} s.server={} {} equals:{}", abstractC15351, c17086.m38727(), c9711.f26820, Boolean.valueOf(c17086.m38727().equals(c9711.f26820)));
                        c21467.m48639(((C7385) C20797.m46958()).m17108(c21467.getName(), EnumC2690.SERVICE));
                        z = true;
                        break;
                    }
                }
            }
            AbstractC12000 abstractC12000 = (AbstractC12000) this.f29744.get(c21467.mo27475());
            if (abstractC12000 == null || abstractC12000 == c21467) {
                z2 = z;
            } else {
                InterfaceC3361 interfaceC3361M46958 = C20797.m46958();
                InetAddress inetAddress = c9711.f26821;
                c21467.m48639(((C7385) interfaceC3361M46958).m17108(c21467.getName(), EnumC2690.SERVICE));
            }
        } while (z2);
        strMo27475.equals(c21467.mo27475());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24702(C21467 c21467, C20441 c20441) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f29746.add(c21467);
        String lowerCase = c20441.m34943().toLowerCase();
        C24069 c24069 = this.f29753;
        for (AbstractC15351 abstractC15351 : c24069.m53331(lowerCase)) {
            if (abstractC15351 != null && abstractC15351.m34945() == c20441.m34945() && c20441.mo20945(abstractC15351) && c20441.m34943().equals(abstractC15351.m34943()) && !abstractC15351.mo34939(jCurrentTimeMillis)) {
                c21467.mo41999(c24069, jCurrentTimeMillis, abstractC15351);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24700(InterfaceC18428 interfaceC18428) {
        this.f29746.remove(interfaceC18428);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24693(long j, AbstractC23793 abstractC23793, EnumC24819 enumC24819) {
        ArrayList arrayList;
        List<C17442> arrayList2;
        C16771 c16771Mo5053 = abstractC23793.mo5053(this);
        if (enumC24819 == EnumC24819.Remove && EnumC13420.TYPE_SRV.equals(abstractC23793.m34947())) {
            Cloneable cloneableMo33610 = c16771Mo5053.mo33610();
            if (cloneableMo33610 instanceof InterfaceC18428) {
                m24700((InterfaceC18428) cloneableMo33610);
            }
        }
        synchronized (this.f29746) {
            arrayList = new ArrayList(this.f29746);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC18428) it.next()).mo41999(this.f29753, j, abstractC23793);
        }
        if (EnumC13420.TYPE_PTR.equals(abstractC23793.m34947()) || (EnumC13420.TYPE_SRV.equals(abstractC23793.m34947()) && EnumC24819.Remove.equals(enumC24819))) {
            if (c16771Mo5053.mo33610() == null || !c16771Mo5053.mo33610().mo27477()) {
                C21467 c21467M24690 = m24690(c16771Mo5053.mo33611(), c16771Mo5053.getName(), "", false);
                if (c21467M24690.mo27477()) {
                    c16771Mo5053 = new C16771(this, c16771Mo5053.mo33611(), c16771Mo5053.getName(), c21467M24690);
                }
            }
            List list = (List) this.f29742.get(c16771Mo5053.mo33611().toLowerCase());
            if (list != null) {
                synchronized (list) {
                    arrayList2 = new ArrayList(list);
                }
            } else {
                arrayList2 = Collections.EMPTY_LIST;
            }
            f29737.mo9188(this.f29741, c16771Mo5053, arrayList2, enumC24819);
            if (arrayList2.isEmpty()) {
                return;
            }
            int iOrdinal = enumC24819.ordinal();
            if (iOrdinal == 0) {
                for (C17442 c17442 : arrayList2) {
                    if (c17442.m13617()) {
                        c17442.m39771(c16771Mo5053);
                    } else {
                        this.f29754.submit(new RunnableC18784(c17442, c16771Mo5053));
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            for (C17442 c17443 : arrayList2) {
                if (c17443.m13617()) {
                    c17443.m39769((AbstractC14681) c16771Mo5053);
                } else {
                    this.f29754.submit(new RunnableC19455(c17443, c16771Mo5053));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24705(AbstractC23793 abstractC23793, long j) {
        EnumC24819 enumC24819 = EnumC24819.Noop;
        boolean zMo34939 = abstractC23793.mo34939(j);
        InterfaceC4410 interfaceC4410 = f29737;
        interfaceC4410.mo9177("{} handle response: {}", this.f29741, abstractC23793);
        if (!abstractC23793.m34941() && !abstractC23793.m34949()) {
            boolean zM34948 = abstractC23793.m34948();
            AbstractC23793 abstractC23794 = (AbstractC23793) this.f29753.m53336(abstractC23793);
            interfaceC4410.mo9177("{} handle response cached record: {}", this.f29741, abstractC23794);
            if (zM34948) {
                for (AbstractC15351 abstractC15351 : this.f29753.m53331(abstractC23793.m34937())) {
                    if (abstractC23793.m34947().equals(abstractC15351.m34947()) && abstractC23793.m34945().equals(abstractC15351.m34945())) {
                        AbstractC23793 abstractC23795 = (AbstractC23793) abstractC15351;
                        if (abstractC23795.m52884() < j - 1000) {
                            f29737.mo9190(abstractC15351, "setWillExpireSoon() on: {}");
                            abstractC23795.m52889(j);
                        }
                    }
                }
            }
            if (abstractC23794 != null) {
                if (zMo34939) {
                    if (abstractC23793.m52882() == 0) {
                        enumC24819 = EnumC24819.Noop;
                        f29737.mo9190(abstractC23794, "Record is expired - setWillExpireSoon() on:\n\t{}");
                        abstractC23794.m52889(j);
                    } else {
                        enumC24819 = EnumC24819.Remove;
                        f29737.mo9190(abstractC23794, "Record is expired - removeDNSEntry() on:\n\t{}");
                        this.f29753.m53337(abstractC23794);
                    }
                } else if (abstractC23793.mo5059(abstractC23794) && (abstractC23793.m34946().equals(abstractC23794.m34946()) || abstractC23793.m34946().length() <= 0)) {
                    abstractC23794.m52885(abstractC23793);
                    abstractC23793 = abstractC23794;
                } else if (abstractC23793.mo5060()) {
                    EnumC24819 enumC248110 = EnumC24819.Update;
                    f29737.mo9185("Record (singleValued) has changed - replaceDNSEntry() on:\n\t{}\n\t{}", abstractC23793, abstractC23794);
                    C24069 c24069 = this.f29753;
                    c24069.getClass();
                    if (abstractC23793.m34937().equals(abstractC23794.m34937())) {
                        List list = (List) c24069.get(abstractC23793.m34937());
                        if (list == null) {
                            c24069.putIfAbsent(abstractC23793.m34937(), new ArrayList());
                            list = (List) c24069.get(abstractC23793.m34937());
                        }
                        synchronized (list) {
                            list.remove(abstractC23794);
                            list.add(abstractC23793);
                        }
                    }
                    enumC24819 = enumC248110;
                } else {
                    enumC24819 = EnumC24819.Add;
                    f29737.mo9190(abstractC23793, "Record (multiValue) has changed - addDNSEntry on:\n\t{}");
                    this.f29753.m53334(abstractC23793);
                }
            } else if (!zMo34939) {
                enumC24819 = EnumC24819.Add;
                f29737.mo9190(abstractC23793, "Record not cached - addDNSEntry on:\n\t{}");
                this.f29753.m53334(abstractC23793);
            }
        }
        if (abstractC23793.m34947() == EnumC13420.TYPE_PTR) {
            if (abstractC23793.m34941()) {
                if (zMo34939) {
                    return;
                }
                m24718(((C10382) abstractC23793).m24082());
                return;
            } else if (m24718(abstractC23793.m34943()) && enumC24819 == EnumC24819.Noop) {
                enumC24819 = EnumC24819.RegisterServiceType;
            }
        }
        if (enumC24819 != EnumC24819.Noop) {
            m24693(j, abstractC23793, enumC24819);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24696(C13065 c13065) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<AbstractC23793> arrayListM44909 = c13065.m44909();
        ArrayList<AbstractC23793> arrayList = new ArrayList(arrayListM44909.size());
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC23793 abstractC23793 : arrayListM44909) {
            if (abstractC23793.m34947().equals(EnumC13420.TYPE_A) || abstractC23793.m34947().equals(EnumC13420.TYPE_AAAA)) {
                arrayList2.add(abstractC23793);
            } else {
                arrayList.add(abstractC23793);
            }
        }
        arrayList.addAll(arrayList2);
        boolean zMo5058 = false;
        boolean zMo5059 = false;
        for (AbstractC23793 abstractC23794 : arrayList) {
            m24705(abstractC23794, jCurrentTimeMillis);
            if (EnumC13420.TYPE_A.equals(abstractC23794.m34947()) || EnumC13420.TYPE_AAAA.equals(abstractC23794.m34947())) {
                zMo5058 |= abstractC23794.mo5058(this);
            } else {
                zMo5059 |= abstractC23794.mo5058(this);
            }
        }
        if (zMo5058 || zMo5059) {
            mo24728();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24698(C16416 c16416) throws IOException {
        InetAddress address;
        int port;
        if (c16416.m44912()) {
            return;
        }
        if (c16416.m37314() != null) {
            address = c16416.m37314().getAddress();
            port = c16416.m37314().getPort();
        } else {
            address = this.f29752;
            port = C14760.f42090;
        }
        byte[] bArrM37313 = c16416.m37313();
        DatagramPacket datagramPacket = new DatagramPacket(bArrM37313, bArrM37313.length, address, port);
        InterfaceC4410 interfaceC4410 = f29737;
        if (interfaceC4410.mo9194()) {
            try {
                C13065 c13065 = new C13065(datagramPacket);
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9185("send({}) JmDNS out:{}", this.f29741, c13065.m29911());
                }
            } catch (IOException e) {
                f29737.mo9177(C10738.class.toString(), C10965.m25286(new StringBuilder(".send("), this.f29741, ") - JmDNS can not parse what it sends!!!"), e);
            }
        }
        MulticastSocket multicastSocket = this.f29749;
        if (multicastSocket == null || multicastSocket.isClosed()) {
            return;
        }
        multicastSocket.send(datagramPacket);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩻ */
    public final void mo24737() {
        C8370.m19381().m19383(this).mo24737();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩴ */
    public final void mo24730() {
        C8370.m19381().m19383(this).mo24730();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ܽ */
    public final void mo24726() {
        C8370.m19381().m19383(this).mo24726();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24691() {
        C8370.m19381().m19383(this).mo24691();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24728() {
        C8370.m19381().m19383(this).mo24728();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۘ */
    public final void mo24708() {
        C8370.m19381().m19383(this).mo24708();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ܳ */
    public final void mo24723() {
        C8370.m19381().m19383(this).mo24723();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۜ */
    public final void mo24710() {
        C8370.m19381().m19383(this).mo24710();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ۖ */
    public final void mo24706() {
        C8370.m19381().m19383(this).mo24706();
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24701(C21467 c21467) {
        C8370.m19381().m19383(this).mo24701(c21467);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24694(String str) {
        C8370.m19381().m19383(this).mo24694(str);
    }

    @Override // p067l.InterfaceC13735
    /* JADX INFO: renamed from: ֫ */
    public final void mo24697(C13065 c13065, InetAddress inetAddress, int i) {
        C8370.m19381().m19383(this).mo24697(c13065, inetAddress, i);
    }

    /* JADX INFO: renamed from: ܳ֫ */
    public final void m24724() {
        InterfaceC4410 interfaceC4410 = f29737;
        interfaceC4410.mo9195(this.f29741, "{}.recover()");
        if (this.f29743.m22669() || this.f29743.m22680() || this.f29743.m22674() || this.f29743.m22677()) {
            return;
        }
        synchronized (this.f29755) {
            if (this.f29743.m22667()) {
                String str = this.f29741 + ".recover()";
                interfaceC4410.mo9177("{} thread {}", str, Thread.currentThread().getName());
                new C16101(this, str).start();
            }
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m24731() {
        InterfaceC4410 interfaceC4410 = f29737;
        String str = this.f29741;
        interfaceC4410.mo9195(str, "{}.recover() Cleanning up");
        interfaceC4410.mo9199("RECOVERING");
        mo24737();
        ArrayList arrayList = new ArrayList(this.f29744.values());
        m24733();
        m24684();
        C9711 c9711 = this.f29743;
        c9711.m22675();
        mo24730();
        m24685();
        this.f29753.clear();
        interfaceC4410.mo9195(str, "{}.recover() All is clean");
        if (c9711.m22677()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C21467) ((AbstractC12000) it.next())).m48649();
            }
            c9711.m22671();
            try {
                m24683(c9711);
                m24682(arrayList);
            } catch (Exception e) {
                interfaceC4410.mo9178(str + ".recover() Start services exception ", (Throwable) e);
            }
            interfaceC4410.mo9198(str, "{}.recover() We are back!");
            return;
        }
        interfaceC4410.mo9198(str, "{}.recover() Could not recover we are Down!");
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m24688() {
        InterfaceC4410 interfaceC4410 = f29737;
        C24069 c24069 = this.f29753;
        c24069.m53333();
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        ArrayList<AbstractC15351> arrayList = new ArrayList();
        for (List list : c24069.values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        for (AbstractC15351 abstractC15351 : arrayList) {
            try {
                AbstractC23793 abstractC23793 = (AbstractC23793) abstractC15351;
                if (abstractC23793.mo34939(jCurrentTimeMillis)) {
                    m24693(jCurrentTimeMillis, abstractC23793, EnumC24819.Remove);
                    interfaceC4410.mo9190(abstractC15351, "Removing DNSEntry from cache: {}");
                    c24069.m53337(abstractC23793);
                } else if (abstractC23793.m52888(jCurrentTimeMillis)) {
                    abstractC23793.m52883();
                    String lowerCase = abstractC23793.mo5054(false).mo27466().toLowerCase();
                    if (hashSet.add(lowerCase) && this.f29748.containsKey(lowerCase.toLowerCase())) {
                        mo24694(lowerCase);
                    }
                }
            } catch (Exception e) {
                interfaceC4410.mo9178(this.f29741 + ".Error while reaping records: " + abstractC15351, (Throwable) e);
                interfaceC4410.mo9199(toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.AbstractMap, l.ۢۢ᩵] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(2048, "\n\t---- Local Host -----\n\t");
        sbM34407.append(this.f29743);
        sbM34407.append("\n\t---- Services -----");
        for (Map.Entry entry : this.f29744.entrySet()) {
            sbM34407.append("\n\t\tService: ");
            sbM34407.append((String) entry.getKey());
            sbM34407.append(": ");
            sbM34407.append(entry.getValue());
        }
        sbM34407.append("\n\t---- Types ----");
        for (Object obj : this.f29738.values()) {
            sbM34407.append("\n\t\tType: ");
            sbM34407.append(obj.m26382());
            sbM34407.append(": ");
            if (obj.isEmpty()) {
                obj = "no subtypes";
            }
            sbM34407.append(obj);
        }
        sbM34407.append("\n");
        sbM34407.append(this.f29753.toString());
        sbM34407.append("\n\t---- Service Collectors ----");
        for (Map.Entry entry2 : this.f29748.entrySet()) {
            sbM34407.append("\n\t\tService Collector: ");
            sbM34407.append((String) entry2.getKey());
            sbM34407.append(": ");
            sbM34407.append(entry2.getValue());
        }
        sbM34407.append("\n\t---- Service Listeners ----");
        for (Map.Entry entry3 : this.f29742.entrySet()) {
            sbM34407.append("\n\t\tService Listener: ");
            sbM34407.append((String) entry3.getKey());
            sbM34407.append(": ");
            sbM34407.append(entry3.getValue());
        }
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ۖ֫ */
    private void m24684() {
        f29737.mo9183("disposeServiceCollectors()");
        ConcurrentMapC12768 concurrentMapC12768 = this.f29748;
        for (Map.Entry entry : concurrentMapC12768.entrySet()) {
            C8726 c8726 = (C8726) entry.getValue();
            if (c8726 != null) {
                String str = (String) entry.getKey();
                m24714(str, c8726);
                concurrentMapC12768.remove(str, c8726);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m24680(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        return (!lowerCase2.endsWith(lowerCase) || lowerCase2.equals(lowerCase)) ? str2 : str2.substring(0, (str2.length() - str.length()) - 1);
    }

    /* JADX INFO: renamed from: ۬ */
    public final ConcurrentMap m24721() {
        return this.f29744;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24713(long j) {
        this.f29747 = j;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final long m24732() {
        return this.f29747;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24692(int i) {
        this.f29751 = i;
    }

    /* JADX INFO: renamed from: ᩺ */
    public final int m24736() {
        return this.f29751;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public static Random m24687() {
        return f29736;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24715(C13065 c13065) {
        ReentrantLock reentrantLock = this.f29739;
        reentrantLock.lock();
        try {
            if (this.f29745 == c13065) {
                this.f29745 = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۗ */
    public final ConcurrentMapC12768 m24707() {
        return this.f29738;
    }

    /* JADX INFO: renamed from: ۤ */
    public final MulticastSocket m24712() {
        return this.f29749;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final InetAddress m24734() {
        return this.f29752;
    }
}
