package p067l;

import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
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
public final class C2692 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f4521 = 0;

    /* JADX INFO: renamed from: ܳ */
    public static C18115 f4523;

    /* JADX INFO: renamed from: ܿ */
    public static C20799 f4525;

    /* JADX INFO: renamed from: ᩳ */
    public static C21545 f4526;

    /* JADX INFO: renamed from: ᩻ */
    public static C23795 f4527;

    /* JADX INFO: renamed from: ۧ */
    public static final Object f4522 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static final LinkedHashMap f4524 = new LinkedHashMap();

    static {
        C18115 c18115 = new C18115();
        C21545 c21545 = new C21545();
        C20799 c20799 = new C20799();
        ExecutorService executorService = C4081.f8987;
        C12826.requireNonNull(executorService);
        C23795 c23795 = new C23795(executorService);
        f4523 = c18115;
        f4526 = c21545;
        f4525 = c20799;
        f4527 = c23795;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4168(AbstractActivityC5549 abstractActivityC5549, final C17444 c17444, final InterfaceC10740 interfaceC10740, final InterfaceC1489 interfaceC1489) {
        String[] strArr;
        int length;
        int i;
        C23795 c23795;
        final C9713 c9713;
        long j;
        if (C8381.m19539(abstractActivityC5549)) {
            View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
            TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
            textView.setText(R.string.MT_Protector);
            final ProgressBar progressBar = (ProgressBar) viewM12252.findViewById(R.id.MT_Protector);
            progressBar.setVisibility(0);
            ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
            C7040.m16181(listView);
            final C8372 c8372 = new C8372(c17444.f52169);
            c8372.f22435 = ((View) textView.getParent()).getPaddingLeft();
            c8372.f22433 = C13076.m29939(8.0f);
            listView.setDivider(null);
            listView.setAdapter((ListAdapter) c8372);
            C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
            c20671BuildDialog.m46715(viewM12252);
            c20671BuildDialog.m46736(R.string.MT_Protector, null);
            c20671BuildDialog.m46722(false);
            final DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671BuildDialog.m46732();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۠᩷᩻
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
                    interfaceC1489.accept((C12752) c8372.f22434.get(i2));
                    dialogInterfaceC2564M46732.dismiss();
                }
            });
            final C15747 c15747 = new C15747(dialogInterfaceC2564M46732);
            ArrayList<C18786> arrayList = new ArrayList();
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                if (networkInterfaces != null) {
                    while (networkInterfaces.hasMoreElements()) {
                        NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                        try {
                            String name = networkInterfaceNextElement.getName();
                            if (!m4177(name) && networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback() && !networkInterfaceNextElement.isVirtual() && !m4183(name) && !m4183(networkInterfaceNextElement.getDisplayName())) {
                                for (InterfaceAddress interfaceAddress : networkInterfaceNextElement.getInterfaceAddresses()) {
                                    InetAddress address = interfaceAddress.getAddress();
                                    if ((address instanceof Inet4Address) && !address.isAnyLocalAddress() && !address.isLoopbackAddress() && !address.isMulticastAddress()) {
                                        arrayList.add(new C18786((Inet4Address) address, interfaceAddress.getNetworkPrefixLength()));
                                    }
                                }
                            }
                        } catch (SocketException unused) {
                        }
                    }
                }
                while (true) {
                    c23795 = f4527;
                    if (i >= length) {
                        c9713 = null;
                        break;
                    }
                    if (!m4177(strArr[i])) {
                        C15747.m35794(c15747, abstractActivityC5549);
                        final C22140 c22140 = new C22140();
                        c9713 = new C9713(c15747, c22140);
                        for (String str : c17444.f52167) {
                            if (!m4177(str)) {
                                if (arrayList.isEmpty()) {
                                    c23795.f75661.execute(new Runnable() { // from class: l.ۙ᩷᩻
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C2692.m4174(c22140, c9713, c17444, (Inet4Address) null, "default");
                                        }
                                    });
                                    break;
                                }
                                for (final C18786 c18786 : arrayList) {
                                    final String hostAddress = c18786.f56129.getHostAddress();
                                    c23795.f75661.execute(new Runnable() { // from class: l.ۗ᩷᩻
                                        @Override // java.lang.Runnable
                                        public final void run() throws Throwable {
                                            C18786 c18787 = c18786;
                                            C2692.m4174(c22140, c9713, c17444, c18787.f56129, hostAddress);
                                        }
                                    });
                                }
                                break;
                            }
                        }
                        dialogInterfaceC2564M46732.m3849(new DialogInterface.OnDismissListener() { // from class: l.ܶ᩷᩻
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                c22140.m49925();
                                C15747.m35802(c15747);
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
                linkedHashSet.add(Long.valueOf(m4159(((C18786) it.next()).f56129)));
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Iterator it2 = arrayList.iterator(); it2.hasNext(); it2 = it2) {
                C18786 c18787 = (C18786) it2.next();
                int i2 = c18787.f56130;
                char c = 24;
                int iMax = (i2 < 0 || i2 > 32) ? 24 : Math.max(i2, 24);
                if (iMax < 31) {
                    long j2 = (4294967295 << (32 - iMax)) & 4294967295L;
                    long jM4159 = m4159(c18787.f56129) & j2;
                    long j3 = ((~j2) & 4294967295L) | jM4159;
                    long j4 = jM4159 + 1;
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
            strArr = c17444.f52167;
            length = strArr.length;
            i = 0;
            final C9713 c9714 = c9713;
            c15747.f45590.m4066(dialogInterfaceC2564M46732, new InterfaceC3326() { // from class: l.᩸᩷᩻
                @Override // p067l.InterfaceC3326
                /* JADX INFO: renamed from: ֫ */
                public final void mo4017(Object obj) {
                    List list = (List) obj;
                    if (list == null) {
                        list = Collections.EMPTY_LIST;
                    }
                    progressBar.setVisibility(list.isEmpty() ? 0 : 8);
                    C8372 c8373 = c8372;
                    c8373.f22434 = list;
                    c8373.notifyDataSetChanged();
                }
            });
            final AtomicInteger atomicInteger = new AtomicInteger();
            int size = arrayList2.size();
            int iMin = size <= 0 ? 0 : Math.min(size, 32);
            C15747.m35793(c15747, iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                c23795.f75661.execute(new Runnable() { // from class: l.᩶᩷᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2692.m4172(c15747, atomicInteger, arrayList2, c17444, interfaceC10740, c9714);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (m4180(r2, r6.f52167) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r4.m49926() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        m4182(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r6 = m4162(r7.f79301, r6.f52167).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r8 = (p067l.C13737) r6.next();
        r5.m22684(r8.f38836, r8.f38834, r8.f38837, r8.f38835);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r4.m49926() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        m4182(r7);
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
    
        m4182(r7);
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4174(C22140 c22140, C9713 c9713, C17444 c17444, Inet4Address inet4Address, String str) throws Throwable {
        C8728 c8728;
        C24821 c24821M4166 = m4166(c22140, inet4Address, str);
        if (c24821M4166 == null) {
            return;
        }
        C8728 c8729 = null;
        try {
            synchronized (f4522) {
                try {
                    if (c22140.f70026) {
                        m4182(c24821M4166);
                        return;
                    }
                    c8728 = new C8728(c22140, c24821M4166.f79301, str);
                    try {
                        c8728.f23666 = new C12396(c8728, c9713);
                        c22140.f70028.add(c8728);
                    } catch (Throwable th) {
                        th = th;
                        c8729 = c8728;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } catch (Throwable th3) {
            th = th3;
            c8728 = c8729;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24821 m4166(C22140 c22140, InetAddress inetAddress, String str) {
        RunnableC15077 runnableC15077;
        C11411 c11411;
        C24821 c24821;
        RunnableC15077 runnableC15078;
        while (true) {
            Object obj = f4522;
            synchronized (obj) {
                runnableC15077 = null;
                if (c22140.f70026) {
                    return null;
                }
                LinkedHashMap linkedHashMap = f4524;
                C11411 c11412 = (C11411) linkedHashMap.get(str);
                if (c11412 == null || c11412.f31837) {
                    C11411 c11413 = new C11411(str, inetAddress);
                    linkedHashMap.put(str, c11413);
                    c11411 = c11413;
                    c24821 = null;
                } else if (c11412.f31839) {
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return null;
                    }
                } else {
                    Object obj2 = c11412.f31841;
                    if (obj2 == null) {
                        runnableC15078 = null;
                    } else {
                        C20799 c20799 = f4525;
                        c11412.f31841 = null;
                        runnableC15078 = new RunnableC15077(c20799, obj2);
                    }
                    c11412.f31834++;
                    c24821 = new C24821(c11412);
                    c22140.f70027.add(c24821);
                    c11411 = null;
                    runnableC15077 = runnableC15078;
                }
            }
            if (runnableC15077 != null) {
                runnableC15077.run();
            }
            if (c24821 != null) {
                return c24821;
            }
            if (c11411 != null) {
                return m4167(c22140, c11411);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24821 m4167(C22140 c22140, C11411 c11411) {
        C10738 c10738;
        boolean z;
        C24821 c24821;
        RunnableC14407 runnableC14407;
        RunnableC15077 runnableC15077;
        try {
            C18115 c18115 = f4523;
            InetAddress inetAddress = c11411.f31833;
            c18115.getClass();
            if (inetAddress == null) {
                c10738 = new C10738(null);
            } else {
                c10738 = new C10738(inetAddress);
            }
            C19457 c19457 = new C19457(c10738);
            Object obj = f4522;
            synchronized (obj) {
                z = true;
                if (f4524.get(c11411.f31840) != c11411 || c11411.f31837) {
                    c24821 = null;
                    runnableC14407 = null;
                } else {
                    c11411.f31836 = c19457;
                    c11411.f31839 = false;
                    obj.notifyAll();
                    if (!c22140.f70026) {
                        c11411.f31834++;
                        c24821 = new C24821(c11411);
                        c22140.f70027.add(c24821);
                        runnableC14407 = null;
                    } else {
                        C20799 c20799 = f4525;
                        Object obj2 = c11411.f31841;
                        if (obj2 == null) {
                            runnableC15077 = null;
                        } else {
                            c11411.f31841 = null;
                            runnableC15077 = new RunnableC15077(c20799, obj2);
                        }
                        Object obj3 = new Object();
                        c11411.f31841 = obj3;
                        runnableC14407 = new RunnableC14407(runnableC15077, c20799, obj3, c11411);
                        c24821 = null;
                    }
                    z = false;
                }
                obj.notifyAll();
            }
            if (runnableC14407 != null) {
                runnableC14407.run();
            }
            if (c24821 != null) {
                return c24821;
            }
            if (z) {
                try {
                    c19457.m44267();
                } catch (IOException | RuntimeException unused) {
                }
            }
            return null;
        } catch (IOException | RuntimeException unused2) {
            Object obj4 = f4522;
            synchronized (obj4) {
                LinkedHashMap linkedHashMap = f4524;
                if (linkedHashMap.get(c11411.f31840) == c11411) {
                    linkedHashMap.remove(c11411.f31840);
                }
                obj4.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4180(C8728 c8728, String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            if (!m4177(str)) {
                synchronized (f4522) {
                    if (!m4184(c8728)) {
                        m4181(c8728);
                        m4186(c8728);
                        return false;
                    }
                    c8728.f23670.add(str);
                    try {
                        ((C19457) c8728.f23667.f31836).m44268(str, c8728.f23666);
                    } catch (RuntimeException unused) {
                        z = false;
                    }
                    boolean zM4179 = m4179(c8728, str, z);
                    if (!z || zM4179) {
                        try {
                            ((C19457) c8728.f23667.f31836).m44269(str, c8728.f23666);
                        } catch (RuntimeException unused2) {
                        }
                    }
                    if (!z || zM4179) {
                        m4181(c8728);
                        m4186(c8728);
                        return false;
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4179(C8728 c8728, String str, boolean z) {
        synchronized (f4522) {
            c8728.f23670.remove(str);
            if (!z) {
                return false;
            }
            if (!m4184(c8728)) {
                return true;
            }
            c8728.f23668.add(str);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4181(C8728 c8728) {
        synchronized (f4522) {
            c8728.f23665 = false;
            c8728.f23669.f70028.remove(c8728);
        }
        m4185(c8728);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m4186(C8728 c8728) {
        C24821 c24821;
        synchronized (f4522) {
            Iterator it = c8728.f23669.f70027.iterator();
            do {
                if (!it.hasNext()) {
                    c24821 = null;
                    break;
                }
                c24821 = (C24821) it.next();
            } while (c24821.f79301 != c8728.f23667);
        }
        if (c24821 != null) {
            m4182(c24821);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m4185(C8728 c8728) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        synchronized (f4522) {
            linkedHashSet.addAll(c8728.f23670);
            linkedHashSet.addAll(c8728.f23668);
            c8728.f23670.clear();
            c8728.f23668.clear();
        }
        for (String str : linkedHashSet) {
            try {
                ((C19457) c8728.f23667.f31836).m44269(str, c8728.f23666);
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13737 m4165(C8728 c8728, AbstractC14681 abstractC14681, C12752 c12752) {
        synchronized (f4522) {
            String strMo33611 = abstractC14681.mo33611();
            if (!(m4184(c8728) && (c8728.f23670.contains(strMo33611) || c8728.f23668.contains(strMo33611)))) {
                return null;
            }
            String str = c8728.f23671;
            String strMo33612 = abstractC14681.mo33611();
            AbstractC12000 abstractC12000Mo33610 = abstractC14681.mo33610();
            String strM4161 = m4161(str, strMo33612, abstractC12000Mo33610 == null ? null : abstractC12000Mo33610.mo27475(), abstractC14681.getName());
            String strM4162 = m4161(c8728.f23671, abstractC14681.mo33611(), (String) null, abstractC14681.getName());
            String strMo33613 = abstractC14681.mo33611();
            f4526.getClass();
            C13737 c13737 = new C13737(strMo33613, strM4161, strM4162, c12752, SystemClock.uptimeMillis());
            C13737 c13738 = (C13737) c8728.f23667.f31835.put(strM4161, c13737);
            if (c13738 != null) {
                C11411 c11411 = c8728.f23667;
                String str2 = c13738.f38834;
                String str3 = c13738.f38836;
                LinkedHashSet linkedHashSet = (LinkedHashSet) c11411.f31838.get(str2);
                if (linkedHashSet != null) {
                    linkedHashSet.remove(str3);
                    if (linkedHashSet.isEmpty()) {
                        c11411.f31838.remove(str2);
                    }
                }
            }
            C11411 c11412 = c8728.f23667;
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) c11412.f31838.get(strM4162);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet();
                c11412.f31838.put(strM4162, linkedHashSet2);
            }
            linkedHashSet2.add(strM4161);
            return c13737;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4178(C8728 c8728, String str, String str2, String str3) {
        synchronized (f4522) {
            if (!(m4184(c8728) && (c8728.f23670.contains(str) || c8728.f23668.contains(str)))) {
                return false;
            }
            m4171(c8728.f23667, str2);
            LinkedHashSet linkedHashSet = (LinkedHashSet) c8728.f23667.f31838.remove(str3);
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    m4171(c8728.f23667, (String) it.next());
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m4162(C11411 c11411, String[] strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : strArr) {
            if (!m4177(str)) {
                linkedHashSet.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        f4526.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (f4522) {
            ArrayList arrayList2 = new ArrayList();
            for (C13737 c13737 : c11411.f31835.values()) {
                if (jUptimeMillis - c13737.f38838 > 120000) {
                    arrayList2.add(c13737.f38836);
                } else if (linkedHashSet.contains(c13737.f38837)) {
                    arrayList.add(c13737);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m4171(c11411, (String) it.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m4184(C8728 c8728) {
        if (!c8728.f23665 || c8728.f23669.f70026 || c8728.f23667.f31839 || c8728.f23667.f31837) {
            return false;
        }
        return f4524.get(c8728.f23667.f31840) == c8728.f23667;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4182(C24821 c24821) {
        synchronized (f4522) {
            if (c24821.f79300) {
                return;
            }
            c24821.f79300 = true;
            C11411 c11411 = c24821.f79301;
            if (c11411.f31834 > 0) {
                c11411.f31834--;
            }
            RunnableC14407 runnableC14407 = null;
            RunnableC15077 runnableC15077 = null;
            runnableC14407 = null;
            runnableC14407 = null;
            runnableC14407 = null;
            if (c11411.f31834 == 0 && !c11411.f31839 && !c11411.f31837 && f4524.get(c11411.f31840) == c11411) {
                C20799 c20799 = f4525;
                Object obj = c11411.f31841;
                if (obj != null) {
                    c11411.f31841 = null;
                    runnableC15077 = new RunnableC15077(c20799, obj);
                }
                Object obj2 = new Object();
                c11411.f31841 = obj2;
                runnableC14407 = new RunnableC14407(runnableC15077, c20799, obj2, c11411);
            }
            if (runnableC14407 != null) {
                runnableC14407.run();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4170(C11411 c11411, Object obj) {
        Object obj2 = f4522;
        synchronized (obj2) {
            LinkedHashMap linkedHashMap = f4524;
            if (linkedHashMap.get(c11411.f31840) == c11411 && c11411.f31834 == 0 && c11411.f31841 == obj && !c11411.f31839 && !c11411.f31837) {
                c11411.f31837 = true;
                c11411.f31841 = null;
                c11411.f31835.clear();
                c11411.f31838.clear();
                linkedHashMap.remove(c11411.f31840);
                InterfaceC16103 interfaceC16103 = c11411.f31836;
                obj2.notifyAll();
                if (interfaceC16103 == null) {
                    return;
                }
                try {
                    ((C19457) interfaceC16103).m44267();
                } catch (IOException | RuntimeException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m4171(C11411 c11411, String str) {
        C13737 c13737 = (C13737) c11411.f31835.remove(str);
        if (c13737 == null) {
            return;
        }
        String str2 = c13737.f38834;
        String str3 = c13737.f38836;
        LinkedHashSet linkedHashSet = (LinkedHashSet) c11411.f31838.get(str2);
        if (linkedHashSet == null) {
            return;
        }
        linkedHashSet.remove(str3);
        if (linkedHashSet.isEmpty()) {
            c11411.f31838.remove(str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12752 m4163(AbstractC12000 abstractC12000) {
        String hostAddress;
        int iIndexOf;
        if (abstractC12000 == null) {
            return null;
        }
        String name = abstractC12000.getName();
        if (name != null && (iIndexOf = name.indexOf(46)) != -1) {
            name = name.substring(0, iIndexOf);
        }
        Inet4Address inet4AddressMo27481 = abstractC12000.mo27481();
        if (inet4AddressMo27481 != null) {
            hostAddress = inet4AddressMo27481.getHostAddress();
        } else {
            Inet6Address inet6AddressMo27476 = abstractC12000.mo27476();
            if (inet6AddressMo27476 == null) {
                return null;
            }
            hostAddress = inet6AddressMo27476.getHostAddress();
        }
        if (m4177(name)) {
            name = hostAddress;
        }
        return new C12752(name, abstractC12000.mo27474(), hostAddress, abstractC12000.mo27482());
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m4172(C15747 c15747, AtomicInteger atomicInteger, ArrayList arrayList, C17444 c17444, InterfaceC10740 interfaceC10740, InterfaceC4705 interfaceC4705) {
        int andIncrement;
        while (!c15747.m35798() && (andIncrement = atomicInteger.getAndIncrement()) < arrayList.size()) {
            try {
                C12752 c12752M4164 = m4164(c17444, interfaceC10740, interfaceC4705, (String) arrayList.get(andIncrement));
                if (c12752M4164 != null) {
                    C15747.m35795(c15747, c12752M4164);
                }
            } finally {
                C15747.m35801(c15747);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12752 m4164(C17444 c17444, InterfaceC10740 interfaceC10740, InterfaceC4705 interfaceC4705, String str) {
        int i = c17444.f52168;
        try {
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), 800);
                socket.close();
                try {
                    String strMo24739 = interfaceC10740.mo24739(str);
                    if (strMo24739 != null) {
                        return new C12752(strMo24739, c17444.f52168, str, strMo24739);
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
            if (interfaceC4705 != null) {
                ((C9713) interfaceC4705).m22681(c17444.f52168, str);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m4183(String str) {
        if (m4177(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.equals("lo") || lowerCase.contains("rmnet") || lowerCase.equals("br") || lowerCase.matches("br\\d+") || lowerCase.startsWith("br-") || lowerCase.startsWith("br_") || lowerCase.startsWith("ccmni") || lowerCase.startsWith("pdp") || lowerCase.startsWith("wwan") || lowerCase.startsWith("ppp") || lowerCase.startsWith("dummy") || lowerCase.startsWith("ifb") || lowerCase.startsWith("veth") || lowerCase.startsWith("virbr") || lowerCase.startsWith("docker") || lowerCase.startsWith("vbox") || lowerCase.startsWith("vmnet") || lowerCase.startsWith("sit") || lowerCase.startsWith("ip6tnl") || lowerCase.startsWith("gre") || lowerCase.startsWith("gretap") || lowerCase.startsWith("vti") || lowerCase.startsWith("clat") || lowerCase.startsWith("v4-") || lowerCase.startsWith("tun") || lowerCase.startsWith("tap") || lowerCase.startsWith("utun") || lowerCase.startsWith("vpn") || lowerCase.startsWith("wg") || lowerCase.startsWith("ipsec") || lowerCase.startsWith("l2tp") || lowerCase.startsWith("tailscale") || lowerCase.startsWith("zt");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m4161(String str, String str2, String str3, String str4) {
        if (m4177(str3)) {
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

    /* JADX INFO: renamed from: ֫ */
    public static long m4159(Inet4Address inet4Address) {
        byte[] address = inet4Address.getAddress();
        return ((((long) address[0]) & 255) << 24) | ((((long) address[1]) & 255) << 16) | ((((long) address[2]) & 255) << 8) | (255 & ((long) address[3]));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m4177(String str) {
        return str == null || str.isEmpty();
    }
}
