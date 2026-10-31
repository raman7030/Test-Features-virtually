package l;

import android.os.SystemClock;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩵֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19112 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60206 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f60208;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20177 f60209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f60210;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60211;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f60212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f60213;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f60214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15582 f60215;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9234 f60216;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final long f60207 = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final long f60205 = TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f60203 = {0};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f60204 = new AtomicInteger();

    public C19112(ServiceC1618 serviceC1618) {
        C9234 c9234 = new C9234(serviceC1618.getApplicationContext(), new C20177());
        C15582 c15582 = new C15582();
        C20177 c20177 = new C20177();
        this.f60213 = new Object();
        this.f60208 = new LinkedHashMap();
        this.f60216 = c9234;
        this.f60215 = c15582;
        this.f60209 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44057() {
        synchronized (this.f60213) {
            if (this.f60211) {
                return;
            }
            this.f60211 = true;
            final long j = this.f60214 + 1;
            this.f60214 = j;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2178());
            this.f60210 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            this.f60212 = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.᩷֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C19112.m44044(this.f66130, j);
                }
            }, 0L, f60207, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44059() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f60213) {
            this.f60211 = false;
            this.f60214++;
            this.f60208.clear();
            ScheduledFuture scheduledFuture = this.f60212;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f60212 = null;
            }
            scheduledExecutorService = this.f60210;
            this.f60210 = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44044(C19112 c19112, long j) {
        C18406 c18406;
        if (c19112.m44045(j)) {
            try {
                c18406 = c19112.f60216.m23676();
            } catch (RuntimeException unused) {
                c18406 = new C18406(null, null, null, Collections.EMPTY_LIST);
            }
            C18406 c18407 = c18406;
            c19112.f60209.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c18407.f57145 != null) {
                ArrayList<InetAddress> arrayListM44043 = c19112.m44043(c18407, jElapsedRealtime);
                if (c18407.f57144 != null && c19112.m44045(j)) {
                    try {
                        c19112.f60215.m36751(c18407.f57145, c18407.f57144);
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                if (c18407.f57143 != null && c19112.m44045(j)) {
                    try {
                        c19112.f60215.m36751(c18407.f57145, c18407.f57143);
                    } catch (IOException | RuntimeException unused3) {
                    }
                }
                for (InetAddress inetAddress : arrayListM44043) {
                    if (!c19112.m44045(j)) {
                        return;
                    }
                    try {
                        c19112.f60215.m36751(c18407.f57145, inetAddress);
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
                return;
            }
            synchronized (c19112.f60213) {
                Iterator it = c19112.f60208.entrySet().iterator();
                while (it.hasNext()) {
                    if (jElapsedRealtime - ((C8528) ((Map.Entry) it.next()).getValue()).f26055 > f60205) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m44043(C18406 c18406, long j) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f60213) {
            Iterator it = this.f60208.entrySet().iterator();
            while (it.hasNext()) {
                C8528 c8528 = (C8528) ((Map.Entry) it.next()).getValue();
                if (j - c8528.f26055 <= f60205) {
                    InetAddress inetAddress = c8528.f26054;
                    boolean zIsSiteLocalAddress = false;
                    if (m44056(inetAddress)) {
                        if (!c18406.f57146.isEmpty()) {
                            Iterator it2 = c18406.f57146.iterator();
                            while (it2.hasNext()) {
                                if (((C3589) it2.next()).m10985(inetAddress)) {
                                    zIsSiteLocalAddress = true;
                                    break;
                                }
                            }
                        } else {
                            zIsSiteLocalAddress = inetAddress.isSiteLocalAddress();
                        }
                    }
                    if (zIsSiteLocalAddress) {
                        arrayList.add(c8528.f26054);
                    }
                }
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44045(long j) {
        boolean z;
        synchronized (this.f60213) {
            z = this.f60211 && this.f60214 == j;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44053() {
        while (true) {
            LinkedHashMap linkedHashMap = this.f60208;
            if (linkedHashMap.size() <= 8) {
                return;
            }
            String str = null;
            long j = C13132.FOREVER_NS;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C8528) entry.getValue()).f26055 < j) {
                    j = ((C8528) entry.getValue()).f26055;
                    str = (String) entry.getKey();
                }
            }
            if (str == null) {
                return;
            } else {
                linkedHashMap.remove(str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44058(String str) throws UnknownHostException {
        InetAddress byAddress;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                String[] strArrSplit = strTrim.split("\\.", -1);
                if (strArrSplit.length == 4) {
                    byte[] bArr = new byte[4];
                    int i = 0;
                    while (true) {
                        if (i < strArrSplit.length) {
                            try {
                                int i2 = Integer.parseInt(strArrSplit[i]);
                                if (i2 >= 0 && i2 <= 255) {
                                    bArr[i] = (byte) i2;
                                    i++;
                                }
                            } catch (NumberFormatException | UnknownHostException unused) {
                            }
                        } else {
                            byAddress = InetAddress.getByAddress(bArr);
                            if (!m44056(byAddress)) {
                                break;
                            } else {
                                break;
                            }
                        }
                        byAddress = null;
                        break;
                    }
                }
                byAddress = null;
                break;
            }
            byAddress = null;
            break;
        }
        byAddress = null;
        break;
        if (byAddress == null) {
            return;
        }
        this.f60209.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String hostAddress = byAddress.getHostAddress();
        synchronized (this.f60213) {
            C8528 c8528 = (C8528) this.f60208.get(hostAddress);
            if (c8528 == null) {
                this.f60208.put(hostAddress, new C8528(byAddress, jElapsedRealtime));
            } else {
                c8528.f26055 = jElapsedRealtime;
            }
            m44053();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m44056(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m44050(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44050(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        return address.length == 4 && (address[0] & 255) == 255 && (address[1] & 255) == 255 && (address[2] & 255) == 255 && (address[3] & 255) == 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44046(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m44050(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InetAddress m44049(int i) {
        return m44048(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InetAddress m44048(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m44054(int i) {
        int iM44052;
        int iBitCount;
        InetAddress inetAddressM44048 = m44048(i);
        if (!(inetAddressM44048 instanceof Inet4Address) || (iBitCount = Integer.bitCount((iM44052 = m44052(inetAddressM44048)))) == 0) {
            return -1;
        }
        if (iM44052 == (iBitCount == 32 ? -1 : (int) (4294967295 << (32 - iBitCount)))) {
            return iBitCount;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m44052(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4) {
            return 0;
        }
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }
}
