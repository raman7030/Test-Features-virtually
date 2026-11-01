package p067l;

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
public final class C20532 {

    /* JADX INFO: renamed from: ۢ */
    public static final /* synthetic */ int f63438 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f63440;

    /* JADX INFO: renamed from: ۜ */
    public final C21545 f63441;

    /* JADX INFO: renamed from: ۧ */
    public ScheduledExecutorService f63442;

    /* JADX INFO: renamed from: ܳ */
    public boolean f63443;

    /* JADX INFO: renamed from: ܽ */
    public ScheduledFuture f63444;

    /* JADX INFO: renamed from: ܿ */
    public final Object f63445;

    /* JADX INFO: renamed from: ᩳ */
    public long f63446;

    /* JADX INFO: renamed from: ᩷ */
    public final C17177 f63447;

    /* JADX INFO: renamed from: ᩻ */
    public final C11144 f63448;

    /* JADX INFO: renamed from: ܺ */
    public static final long f63439 = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: ۡ */
    public static final long f63437 = TimeUnit.MINUTES.toMillis(10);

    /* JADX INFO: renamed from: ۖ */
    public static final byte[] f63435 = {0};

    /* JADX INFO: renamed from: ۘ */
    public static final AtomicInteger f63436 = new AtomicInteger();

    public C20532(ServiceC3906 serviceC3906) {
        C11144 c11144 = new C11144(serviceC3906.getApplicationContext(), new C21545());
        C17177 c17177 = new C17177();
        C21545 c21545 = new C21545();
        this.f63445 = new Object();
        this.f63440 = new LinkedHashMap();
        this.f63448 = c11144;
        this.f63447 = c17177;
        this.f63441 = c21545;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46351() {
        synchronized (this.f63445) {
            if (this.f63443) {
                return;
            }
            this.f63443 = true;
            final long j = this.f63446 + 1;
            this.f63446 = j;
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC4438());
            this.f63442 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            this.f63444 = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new Runnable() { // from class: l.᩷֡ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C20532.m46338(this.f68807, j);
                }
            }, 0L, f63439, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46353() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this.f63445) {
            this.f63443 = false;
            this.f63446++;
            this.f63440.clear();
            ScheduledFuture scheduledFuture = this.f63444;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f63444 = null;
            }
            scheduledExecutorService = this.f63442;
            this.f63442 = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46338(C20532 c20532, long j) {
        C19861 c19861;
        if (c20532.m46339(j)) {
            try {
                c19861 = c20532.f63448.m25675();
            } catch (RuntimeException unused) {
                c19861 = new C19861(null, null, null, Collections.EMPTY_LIST);
            }
            C19861 c19862 = c19861;
            c20532.f63441.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c19862.f60364 != null) {
                ArrayList<InetAddress> arrayListM46337 = c20532.m46337(c19862, jElapsedRealtime);
                if (c19862.f60363 != null && c20532.m46339(j)) {
                    try {
                        c20532.f63447.m38911(c19862.f60364, c19862.f60363);
                    } catch (IOException | RuntimeException unused2) {
                    }
                }
                if (c19862.f60362 != null && c20532.m46339(j)) {
                    try {
                        c20532.f63447.m38911(c19862.f60364, c19862.f60362);
                    } catch (IOException | RuntimeException unused3) {
                    }
                }
                for (InetAddress inetAddress : arrayListM46337) {
                    if (!c20532.m46339(j)) {
                        return;
                    }
                    try {
                        c20532.f63447.m38911(c19862.f60364, inetAddress);
                    } catch (IOException | RuntimeException unused4) {
                    }
                }
                return;
            }
            synchronized (c20532.f63445) {
                Iterator it = c20532.f63440.entrySet().iterator();
                while (it.hasNext()) {
                    if (jElapsedRealtime - ((C10473) ((Map.Entry) it.next()).getValue()).f28970 > f63437) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private ArrayList m46337(C19861 c19861, long j) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f63445) {
            Iterator it = this.f63440.entrySet().iterator();
            while (it.hasNext()) {
                C10473 c10473 = (C10473) ((Map.Entry) it.next()).getValue();
                if (j - c10473.f28970 <= f63437) {
                    InetAddress inetAddress = c10473.f28969;
                    boolean zIsSiteLocalAddress = false;
                    if (m46350(inetAddress)) {
                        if (!c19861.f60365.isEmpty()) {
                            Iterator it2 = c19861.f60365.iterator();
                            while (it2.hasNext()) {
                                if (((C5779) it2.next()).m12961(inetAddress)) {
                                    zIsSiteLocalAddress = true;
                                    break;
                                }
                            }
                        } else {
                            zIsSiteLocalAddress = inetAddress.isSiteLocalAddress();
                        }
                    }
                    if (zIsSiteLocalAddress) {
                        arrayList.add(c10473.f28969);
                    }
                }
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m46339(long j) {
        boolean z;
        synchronized (this.f63445) {
            z = this.f63443 && this.f63446 == j;
        }
        return z;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m46347() {
        while (true) {
            LinkedHashMap linkedHashMap = this.f63440;
            if (linkedHashMap.size() <= 8) {
                return;
            }
            String str = null;
            long j = C14849.FOREVER_NS;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (((C10473) entry.getValue()).f28970 < j) {
                    j = ((C10473) entry.getValue()).f28970;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m46352(String str) throws UnknownHostException {
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
                            if (!m46350(byAddress)) {
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
        this.f63441.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String hostAddress = byAddress.getHostAddress();
        synchronized (this.f63445) {
            C10473 c10473 = (C10473) this.f63440.get(hostAddress);
            if (c10473 == null) {
                this.f63440.put(hostAddress, new C10473(byAddress, jElapsedRealtime));
            } else {
                c10473.f28970 = jElapsedRealtime;
            }
            m46347();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m46350(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m46344(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46344(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        return address.length == 4 && (address[0] & 255) == 255 && (address[1] & 255) == 255 && (address[2] & 255) == 255 && (address[3] & 255) == 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46340(InetAddress inetAddress) {
        return (!(inetAddress instanceof Inet4Address) || inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress() || inetAddress.isMulticastAddress() || inetAddress.isLinkLocalAddress() || m46344(inetAddress)) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static InetAddress m46343(int i) {
        return m46342(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static InetAddress m46342(int i) {
        if (i == 0) {
            return null;
        }
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m46348(int i) {
        int iM46346;
        int iBitCount;
        InetAddress inetAddressM46342 = m46342(i);
        if (!(inetAddressM46342 instanceof Inet4Address) || (iBitCount = Integer.bitCount((iM46346 = m46346(inetAddressM46342)))) == 0) {
            return -1;
        }
        if (iM46346 == (iBitCount == 32 ? -1 : (int) (4294967295 << (32 - iBitCount)))) {
            return iBitCount;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m46346(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        if (address.length != 4) {
            return 0;
        }
        return (address[3] & 255) | ((address[0] & 255) << 24) | ((address[1] & 255) << 16) | ((address[2] & 255) << 8);
    }
}
