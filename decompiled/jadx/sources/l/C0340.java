package l;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: W79N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0340 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f1745 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C16568 f1747;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C19392 f1749;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C20177 f1750;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C22544 f1751;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f1746 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final LinkedHashMap f1748 = new LinkedHashMap();

    static {
        C16568 c16568 = new C16568();
        C20177 c20177 = new C20177();
        C19392 c19392 = new C19392();
        ExecutorService executorService = C1802.f6208;
        C11003.requireNonNull(executorService);
        C22544 c22544 = new C22544(executorService);
        f1747 = c16568;
        f1750 = c20177;
        f1749 = c19392;
        f1751 = c22544;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1769(AbstractActivityC3346 abstractActivityC3346, final C15862 c15862, final InterfaceC8808 interfaceC8808, final InterfaceC13041 interfaceC13041) {
        String[] strArr;
        int length;
        int i;
        C22544 c22544;
        final C7727 c7727;
        long j;
        if (C6326.m17599(abstractActivityC3346)) {
            View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
            TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
            textView.setText(R.string.MT_Protector);
            final ProgressBar progressBar = (ProgressBar) viewM10216.findViewById(R.id.MT_Protector);
            progressBar.setVisibility(0);
            ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
            C4915.m14284(listView);
            final C6316 c6316 = new C6316(c15862.f49031);
            c6316.f19564 = ((View) textView.getParent()).getPaddingLeft();
            c6316.f19562 = C11266.m27878(8.0f);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) c6316);
            C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
            c19258BuildDialog.m44421(viewM10216);
            c19258BuildDialog.m44442(R.string.MT_Protector, null);
            c19258BuildDialog.m44428(false);
            final DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258BuildDialog.m44438();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۠᩷᩻
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    interfaceC13041.accept((C10925) c6316.f19563.get(i2));
                    dialogInterfaceC0206M44438.dismiss();
                }
            });
            final C14076 c14076 = new C14076(dialogInterfaceC0206M44438);
            ArrayList<C17274> arrayList = new ArrayList();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        try {
                            String name = networkInterfaceNextElement.getName();
                            if (!m1778(name) && networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isVirtual() && !m1784(name) && !m1784(networkInterfaceNextElement.getDisplayName())) {
                                for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                                    InetAddress address = interfaceAddress.getAddress();
                                    if ((address instanceof Inet4Address) && !address.isAnyLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()) {
                                        arrayList.add(new C17274((Inet4Address) address, interfaceAddress.getNetworkPrefixLength()));
                                    }
                                }
                            }
                        } catch (SocketException unused) {
                        }
                    }
                }
                while (true) {
                    c22544 = f1751;
                    if (i >= length) {
                        c7727 = null;
                        break;
                    }
                    if (!m1778(strArr[i])) {
                        C14076.m33669(c14076, abstractActivityC3346);
                        final C20803 c20803 = new C20803();
                        c7727 = new C7727(c14076, c20803);
                        for (String str : c15862.f49029) {
                            if (!m1778(str)) {
                                if (arrayList.isEmpty()) {
                                    c22544.f72934.execute(new Runnable() { // from class: l.ۙ᩷᩻
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C0340.m1775(c20803, c7727, c15862, (Inet4Address) null, "default");
                                        }
                                    });
                                    break;
                                }
                                for (final C17274 c17274 : arrayList) {
                                    final String hostAddress = c17274.f52947.getHostAddress();
                                    c22544.f72934.execute(new Runnable() { // from class: l.ۗ᩷᩻
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C17274 c17275 = c17274;
                                            C0340.m1775(c20803, c7727, c15862, c17275.f52947, hostAddress);
                                        }
                                    });
                                }
                                break;
                            }
                        }
                        dialogInterfaceC0206M44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܶ᩷᩻
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                c20803.m47597();
                                C14076.m33677(c14076);
                            }
                        });
                        break;
                    }
                    i++;
                }
            } catch (SocketException unused2) {
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Long.valueOf(m1760(((C17274) it.next()).f52947)));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                C17274 c17275 = (C17274) it2.next();
                int i2 = c17275.f52948;
                char c = 24;
                int iMax = (i2 < 0 || i2 > 32) ? 24 : Math.max(i2, 24);
                if (iMax < 31) {
                    long j2 = (4294967295 << (32 - iMax)) & 4294967295L;
                    long jM1760 = m1760(c17275.f52947) & j2;
                    long j3 = ((~j2) & 4294967295L) | jM1760;
                    long j4 = jM1760 + 1;
                    while (j4 < j3) {
                        if (linkedHashSet.contains(Long.valueOf(j4))) {
                            j = j4;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append((j4 >> c) & 255);
                            sb.append(".");
                            j = j4;
                            sb.append((j4 >> 16) & 255);
                            sb.append(".");
                            sb.append((j >> 8) & 255);
                            sb.append(".");
                            sb.append(j & 255);
                            linkedHashSet2.add(sb.toString());
                        }
                        j4 = j + 1;
                        c = 24;
                    }
                }
            }
            final ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            strArr = c15862.f49029;
            length = strArr.length;
            i = 0;
            final C7727 c7728 = c7727;
            c14076.f42504.m1668(dialogInterfaceC0206M44438, new InterfaceC1008() { // from class: l.᩸᩷᩻
                @Override // l.InterfaceC1008
                /* JADX INFO: renamed from: ֫ */
                public final void mo1617(Object obj) {
                    List list = (List) obj;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    progressBar.setVisibility(list.isEmpty() ? 0 : 8);
                    C6316 c6317 = c6316;
                    c6317.f19563 = list;
                    c6317.notifyDataSetChanged();
                }
            });
            final AtomicInteger atomicInteger = new AtomicInteger();
            int size = arrayList2.size();
            int iMin = size <= 0 ? 0 : Math.min(size, 32);
            C14076.m33668(c14076, iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                c22544.f72934.execute(new Runnable() { // from class: l.᩶᩷᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0340.m1773(c14076, atomicInteger, arrayList2, c15862, interfaceC8808, c7728);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (m1781(r2, r6.f49029) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r4.m47598() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        m1783(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r6 = m1763(r7.f76557, r6.f49029).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r8 = (l.C11961) r6.next();
        r5.m20704(r8.f35826, r8.f35824, r8.f35827, r8.f35825);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4.m47598() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        m1783(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        m1783(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1775(C20803 c20803, C7727 c7727, C15862 c15862, Inet4Address inet4Address, String str) throws Throwable {
        C6691 c6691;
        C23624 c23624M1767 = m1767(c20803, inet4Address, str);
        if (c23624M1767 == null) {
            return;
        }
        C6691 c6692 = null;
        try {
            synchronized (f1746) {
                try {
                    if (c20803.f67343) {
                        m1783(c23624M1767);
                        return;
                    }
                    c6691 = new C6691(c20803, c23624M1767.f76557, str);
                    try {
                        c6691.f20791 = new C10550(c6691, c7727);
                        c20803.f67345.add(c6691);
                    } catch (Throwable th) {
                        th = th;
                        c6692 = c6691;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } catch (Throwable th3) {
            th = th3;
            c6691 = c6692;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23624 m1767(C20803 c20803, InetAddress inetAddress, String str) {
        RunnableC13371 runnableC13371;
        C9514 c9514;
        C23624 c23624;
        RunnableC13371 runnableC13372;
        while (true) {
            Object obj = f1746;
            synchronized (obj) {
                runnableC13371 = null;
                if (c20803.f67343) {
                    return null;
                }
                LinkedHashMap linkedHashMap = f1748;
                C9514 c9515 = (C9514) linkedHashMap.get(str);
                if (c9515 == null || c9515.f28890) {
                    C9514 c9516 = new C9514(str, inetAddress);
                    linkedHashMap.put(str, c9516);
                    c9514 = c9516;
                    c23624 = null;
                } else if (c9515.f28892) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return null;
                    }
                } else {
                    Object obj2 = c9515.f28894;
                    if (obj2 == null) {
                        runnableC13372 = null;
                    } else {
                        C19392 c19392 = f1749;
                        c9515.f28894 = null;
                        runnableC13372 = new RunnableC13371(c19392, obj2);
                    }
                    c9515.f28887++;
                    c23624 = new C23624(c9515);
                    c20803.f67344.add(c23624);
                    c9514 = null;
                    runnableC13371 = runnableC13372;
                }
            }
            if (runnableC13371 != null) {
                runnableC13371.run();
            }
            if (c23624 != null) {
                return c23624;
            }
            if (c9514 != null) {
                return m1768(c20803, c9514);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23624 m1768(C20803 c20803, C9514 c9514) {
        C8806 c8806;
        boolean z;
        C23624 c23624;
        RunnableC12666 runnableC12666;
        RunnableC13371 runnableC13371;
        try {
            C16568 c16568 = f1747;
            InetAddress inetAddress = c9514.f28886;
            c16568.getClass();
            if (inetAddress == null) {
                c8806 = new C8806(null);
            } else {
                c8806 = new C8806(inetAddress);
            }
            C17980 c17980 = new C17980(c8806);
            Object obj = f1746;
            synchronized (obj) {
                z = true;
                if (f1748.get(c9514.f28893) != c9514 || c9514.f28890) {
                    c23624 = null;
                    runnableC12666 = null;
                } else {
                    c9514.f28889 = c17980;
                    c9514.f28892 = false;
                    obj.notifyAll();
                    if (!c20803.f67343) {
                        c9514.f28887++;
                        c23624 = new C23624(c9514);
                        c20803.f67344.add(c23624);
                        runnableC12666 = null;
                    } else {
                        C19392 c19392 = f1749;
                        Object obj2 = c9514.f28894;
                        if (obj2 == null) {
                            runnableC13371 = null;
                        } else {
                            c9514.f28894 = null;
                            runnableC13371 = new RunnableC13371(c19392, obj2);
                        }
                        Object obj3 = new Object();
                        c9514.f28894 = obj3;
                        runnableC12666 = new RunnableC12666(runnableC13371, c19392, obj3, c9514);
                        c23624 = null;
                    }
                    z = false;
                }
                obj.notifyAll();
            }
            if (runnableC12666 != null) {
                runnableC12666.run();
            }
            if (c23624 != null) {
                return c23624;
            }
            if (z) {
                try {
                    c17980.m42018();
                } catch (IOException | RuntimeException unused) {
                }
            }
            return null;
        } catch (IOException | RuntimeException unused2) {
            Object obj4 = f1746;
            synchronized (obj4) {
                LinkedHashMap linkedHashMap = f1748;
                if (linkedHashMap.get(c9514.f28893) == c9514) {
                    linkedHashMap.remove(c9514.f28893);
                }
                obj4.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1781(C6691 c6691, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!m1778(str)) {
                synchronized (f1746) {
                    if (!m1785(c6691)) {
                        m1782(c6691);
                        m1787(c6691);
                        return false;
                    }
                    c6691.f20795.add(str);
                    try {
                        ((C17980) c6691.f20792.f28889).m42019(str, c6691.f20791);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    boolean zM1780 = m1780(c6691, str, z);
                    if (!z || zM1780) {
                        try {
                            ((C17980) c6691.f20792.f28889).m42020(str, c6691.f20791);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    if (!z || zM1780) {
                        m1782(c6691);
                        m1787(c6691);
                        return false;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1780(C6691 c6691, String str, boolean z) {
        synchronized (f1746) {
            c6691.f20795.remove(str);
            if (!z) {
                return false;
            }
            if (!m1785(c6691)) {
                return true;
            }
            c6691.f20793.add(str);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1782(C6691 c6691) {
        synchronized (f1746) {
            c6691.f20790 = false;
            c6691.f20794.f67345.remove(c6691);
        }
        m1786(c6691);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m1787(C6691 c6691) {
        C23624 c23624;
        synchronized (f1746) {
            Iterator it = c6691.f20794.f67344.iterator();
            do {
                if (!it.hasNext()) {
                    c23624 = null;
                    break;
                }
                c23624 = (C23624) it.next();
            } while (c23624.f76557 != c6691.f20792);
        }
        if (c23624 != null) {
            m1783(c23624);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m1786(C6691 c6691) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        synchronized (f1746) {
            linkedHashSet.addAll(c6691.f20795);
            linkedHashSet.addAll(c6691.f20793);
            c6691.f20795.clear();
            c6691.f20793.clear();
        }
        for (String str : linkedHashSet) {
            try {
                ((C17980) c6691.f20792.f28889).m42020(str, c6691.f20791);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11961 m1766(C6691 c6691, AbstractC12955 abstractC12955, C10925 c10925) {
        synchronized (f1746) {
            String strMo31524 = abstractC12955.mo31524();
            if (!(m1785(c6691) && (c6691.f20795.contains(strMo31524) || c6691.f20793.contains(strMo31524)))) {
                return null;
            }
            String str = c6691.f20796;
            String strMo31525 = abstractC12955.mo31524();
            AbstractC10134 abstractC10134Mo31523 = abstractC12955.mo31523();
            String strM1762 = m1762(str, strMo31525, abstractC10134Mo31523 == null ? null : abstractC10134Mo31523.mo25455(), abstractC12955.getName());
            String strM1763 = m1762(c6691.f20796, abstractC12955.mo31524(), (String) null, abstractC12955.getName());
            String strMo31526 = abstractC12955.mo31524();
            f1750.getClass();
            C11961 c11961 = new C11961(strMo31526, strM1762, strM1763, c10925, SystemClock.uptimeMillis());
            C11961 c11962 = (C11961) c6691.f20792.f28888.put(strM1762, c11961);
            if (c11962 != null) {
                C9514 c9514 = c6691.f20792;
                String str2 = c11962.f35824;
                String str3 = c11962.f35826;
                LinkedHashSet linkedHashSet = (LinkedHashSet) c9514.f28891.get(str2);
                if (linkedHashSet != null) {
                    linkedHashSet.remove(str3);
                    if (linkedHashSet.isEmpty()) {
                        c9514.f28891.remove(str2);
                    }
                }
            }
            C9514 c9515 = c6691.f20792;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) c9515.f28891.get(strM1763);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet();
                c9515.f28891.put(strM1763, linkedHashSet2);
            }
            linkedHashSet2.add(strM1762);
            return c11961;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1779(C6691 c6691, String str, String str2, String str3) {
        synchronized (f1746) {
            if (!(m1785(c6691) && (c6691.f20795.contains(str) || c6691.f20793.contains(str)))) {
                return false;
            }
            m1772(c6691.f20792, str2);
            LinkedHashSet linkedHashSet = (LinkedHashSet) c6691.f20792.f28891.remove(str3);
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    m1772(c6691.f20792, (String) it.next());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m1763(C9514 c9514, String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            if (!m1778(str)) {
                linkedHashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        f1750.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f1746) {
            ArrayList arrayList2 = new ArrayList();
            for (C11961 c11961 : c9514.f28888.values()) {
                if (jUptimeMillis - c11961.f35828 > 120000) {
                    arrayList2.add(c11961.f35826);
                } else if (linkedHashSet.contains(c11961.f35827)) {
                    arrayList.add(c11961);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m1772(c9514, (String) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m1785(C6691 c6691) {
        if (!c6691.f20790 || c6691.f20794.f67343 || c6691.f20792.f28892 || c6691.f20792.f28890) {
            return false;
        }
        return f1748.get(c6691.f20792.f28893) == c6691.f20792;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1783(C23624 c23624) {
        synchronized (f1746) {
            if (c23624.f76556) {
                return;
            }
            c23624.f76556 = true;
            C9514 c9514 = c23624.f76557;
            if (c9514.f28887 > 0) {
                c9514.f28887--;
            }
            RunnableC12666 runnableC12666 = null;
            RunnableC13371 runnableC13371 = null;
            runnableC12666 = null;
            runnableC12666 = null;
            runnableC12666 = null;
            if (c9514.f28887 == 0 && !c9514.f28892 && !c9514.f28890 && f1748.get(c9514.f28893) == c9514) {
                C19392 c19392 = f1749;
                Object obj = c9514.f28894;
                if (obj != null) {
                    c9514.f28894 = null;
                    runnableC13371 = new RunnableC13371(c19392, obj);
                }
                Object obj2 = new Object();
                c9514.f28894 = obj2;
                runnableC12666 = new RunnableC12666(runnableC13371, c19392, obj2, c9514);
            }
            if (runnableC12666 != null) {
                runnableC12666.run();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1771(C9514 c9514, Object obj) {
        Object obj2 = f1746;
        synchronized (obj2) {
            LinkedHashMap linkedHashMap = f1748;
            if (linkedHashMap.get(c9514.f28893) == c9514 && c9514.f28887 == 0 && c9514.f28894 == obj && !c9514.f28892 && !c9514.f28890) {
                c9514.f28890 = true;
                c9514.f28894 = null;
                c9514.f28888.clear();
                c9514.f28891.clear();
                linkedHashMap.remove(c9514.f28893);
                InterfaceC14451 interfaceC14451 = c9514.f28889;
                obj2.notifyAll();
                if (interfaceC14451 == null) {
                    return;
                }
                try {
                    ((C17980) interfaceC14451).m42018();
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1772(C9514 c9514, String str) {
        C11961 c11961 = (C11961) c9514.f28888.remove(str);
        if (c11961 == null) {
            return;
        }
        String str2 = c11961.f35824;
        String str3 = c11961.f35826;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c9514.f28891.get(str2);
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.remove(str3);
        if (linkedHashSet.isEmpty()) {
            c9514.f28891.remove(str2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10925 m1764(AbstractC10134 abstractC10134) {
        String hostAddress;
        int iIndexOf;
        if (abstractC10134 == null) {
            return null;
        }
        String name = abstractC10134.getName();
        if (name != null && (iIndexOf = name.indexOf(46)) != -1) {
            name = name.substring(0, iIndexOf);
        }
        Inet4Address inet4AddressMo25461 = abstractC10134.mo25461();
        if (inet4AddressMo25461 != null) {
            hostAddress = inet4AddressMo25461.getHostAddress();
        } else {
            Inet6Address inet6AddressMo25456 = abstractC10134.mo25456();
            if (inet6AddressMo25456 == null) {
                return null;
            }
            hostAddress = inet6AddressMo25456.getHostAddress();
        }
        if (m1778(name)) {
            name = hostAddress;
        }
        return new C10925(name, abstractC10134.mo25454(), hostAddress, abstractC10134.mo25462());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1773(C14076 c14076, AtomicInteger atomicInteger, ArrayList arrayList, C15862 c15862, InterfaceC8808 interfaceC8808, InterfaceC2458 interfaceC2458) {
        int andIncrement;
        while (!c14076.m33673() && (andIncrement = atomicInteger.getAndIncrement()) < arrayList.size()) {
            try {
                C10925 c10925M1765 = m1765(c15862, interfaceC8808, interfaceC2458, (String) arrayList.get(andIncrement));
                if (c10925M1765 != null) {
                    C14076.m33670(c14076, c10925M1765);
                }
            } finally {
                C14076.m33676(c14076);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10925 m1765(C15862 c15862, InterfaceC8808 interfaceC8808, InterfaceC2458 interfaceC2458, String str) {
        int i = c15862.f49030;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), 800);
                socket.close();
                try {
                    String strMo22769 = interfaceC8808.mo22769(str);
                    if (strMo22769 != null) {
                        return new C10925(strMo22769, c15862.f49030, str, strMo22769);
                    }
                    return null;
                } catch (RuntimeException unused) {
                    return null;
                }
            } catch (Throwable th) {
                try {
                    socket.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused2) {
            if (interfaceC2458 != null) {
                ((C7727) interfaceC2458).m20701(c15862.f49030, str);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1784(String str) {
        if (m1778(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("lo") || lowerCase.contains("rmnet") || lowerCase.equals("br") || lowerCase.matches("br\\d+") || lowerCase.startsWith("br-") || lowerCase.startsWith("br_") || lowerCase.startsWith("ccmni") || lowerCase.startsWith("pdp") || lowerCase.startsWith("wwan") || lowerCase.startsWith("ppp") || lowerCase.startsWith("dummy") || lowerCase.startsWith("ifb") || lowerCase.startsWith("veth") || lowerCase.startsWith("virbr") || lowerCase.startsWith("docker") || lowerCase.startsWith("vbox") || lowerCase.startsWith("vmnet") || lowerCase.startsWith("sit") || lowerCase.startsWith("ip6tnl") || lowerCase.startsWith("gre") || lowerCase.startsWith("gretap") || lowerCase.startsWith("vti") || lowerCase.startsWith("clat") || lowerCase.startsWith("v4-") || lowerCase.startsWith("tun") || lowerCase.startsWith("tap") || lowerCase.startsWith("utun") || lowerCase.startsWith("vpn") || lowerCase.startsWith("wg") || lowerCase.startsWith("ipsec") || lowerCase.startsWith("l2tp") || lowerCase.startsWith("tailscale") || lowerCase.startsWith("zt");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1762(String str, String str2, String str3, String str4) {
        if (m1778(str3)) {
            str3 = str4;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("|");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("|");
        if (str3 == null) {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m1760(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return ((((long) address[0]) & 255) << 24) | ((((long) address[1]) & 255) << 16) | ((((long) address[2]) & 255) << 8) | (255 & ((long) address[3]));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1778(String str) {
        return str == null || str.isEmpty();
    }
}
