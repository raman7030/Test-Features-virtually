package p067l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۢ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0A0C */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11152 implements Runnable, InterfaceC21447 {

    /* JADX INFO: renamed from: ۜ֫ */
    public static final InterfaceC4410 f30934 = C13128.m30022(RunnableC11152.class);

    /* JADX INFO: renamed from: ֫֫ */
    public HashMap f30935;

    /* JADX INFO: renamed from: ۗ */
    public DatagramPacket f30936;

    /* JADX INFO: renamed from: ۙ */
    public int f30937;

    /* JADX INFO: renamed from: ۛ */
    public int f30938;

    /* JADX INFO: renamed from: ۟ */
    public ArrayList f30939;

    /* JADX INFO: renamed from: ۤ */
    public C17185 f30940;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f30941;

    /* JADX INFO: renamed from: ۨ */
    public int f30942;

    /* JADX INFO: renamed from: ۫ */
    public C12493 f30943;

    /* JADX INFO: renamed from: ۬ */
    public final HashSet f30944;

    /* JADX INFO: renamed from: ܰ */
    public byte[] f30945;

    /* JADX INFO: renamed from: ܳ֫ */
    public C17185 f30946;

    /* JADX INFO: renamed from: ܽ֫ */
    public DatagramSocket f30947;

    /* JADX INFO: renamed from: ܿ֫ */
    public C12925 f30948;

    /* JADX INFO: renamed from: ᩳ֫ */
    public Thread f30949;

    /* JADX INFO: renamed from: ᩶ */
    public InetAddress f30950;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f30951;

    /* JADX INFO: renamed from: ᩹ */
    public final HashMap f30952;

    /* JADX INFO: renamed from: ᩺ */
    public DatagramPacket f30953;

    /* JADX INFO: renamed from: ᩻֫ */
    public C17856 f30954;

    public RunnableC11152(C12925 c12925) {
        InetAddress byName;
        c12925.mo29602().getClass();
        c12925.mo29602().getClass();
        this.f30951 = new Object();
        this.f30938 = 0;
        HashMap map = new HashMap();
        this.f30952 = map;
        this.f30944 = new HashSet();
        this.f30935 = new HashMap();
        this.f30942 = 0;
        this.f30939 = new ArrayList();
        this.f30943 = new C12493();
        this.f30948 = c12925;
        InetAddress inetAddressM35106 = ((C15410) c12925.mo29602()).m35106();
        this.f30950 = inetAddressM35106;
        byte[] bArr = new byte[((C15410) c12925.mo29602()).m35094()];
        this.f30941 = bArr;
        byte[] bArr2 = new byte[((C15410) c12925.mo29602()).m35127()];
        this.f30945 = bArr2;
        this.f30953 = new DatagramPacket(bArr, ((C15410) c12925.mo29602()).m35094(), inetAddressM35106, 137);
        this.f30936 = new DatagramPacket(bArr2, ((C15410) c12925.mo29602()).m35127());
        this.f30939 = ((C15410) c12925.mo29602()).m35108();
        C17856 c17856 = new C17856(c12925.mo29602(), "0.0.0.0", 0, null);
        this.f30954 = c17856;
        C17185 c17185 = new C17185(c17856, 0);
        this.f30946 = c17185;
        map.put(c17856, new C24562(c17185, -1L));
        c12925.mo29602().getClass();
        try {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                throw new C14740(e);
            }
        } catch (UnknownHostException unused) {
            byName = InetAddress.getByName("127.0.0.1");
        }
        c12925.mo29602().getClass();
        byte[] address = byName.getAddress();
        String str = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C13854.m31529((int) (Math.random() * 255.0d), 2);
        InterfaceC3341 interfaceC3341Mo29602 = c12925.mo29602();
        c12925.mo29602().getClass();
        C17856 c17857 = new C17856(interfaceC3341Mo29602, str, 0, null);
        C17185 c17186 = new C17185(c17857, byName.hashCode(), 0);
        this.f30940 = c17186;
        m25700(c17857, c17186, -1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17185 m25694(C17856 c17856) throws UnknownHostException {
        C17185 c17185M25695;
        C17185 c17185M25708 = null;
        InetAddress inetAddress = c17856.f53291 == 29 ? this.f30950 : null;
        c17856.f53293 = inetAddress != null ? inetAddress.hashCode() : 0;
        C17185 c17185M25709 = m25708(c17856);
        if (c17185M25709 == null) {
            synchronized (this.f30944) {
                try {
                    if (!this.f30944.contains(c17856)) {
                        this.f30944.add(c17856);
                    } else {
                        while (this.f30944.contains(c17856)) {
                            try {
                                this.f30944.wait();
                            } catch (InterruptedException e) {
                                f30934.mo9192("Interrupted", e);
                            }
                        }
                        c17185M25708 = m25708(c17856);
                        if (c17185M25708 == null) {
                            synchronized (this.f30944) {
                                this.f30944.add(c17856);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                if (c17185M25708 == null) {
                    try {
                        c17185M25695 = m25695(c17856, inetAddress);
                    } catch (UnknownHostException unused) {
                        c17185M25695 = this.f30946;
                    }
                    c17185M25709 = c17185M25695;
                    m25699(c17856, c17185M25709);
                    m25691(c17856);
                } else {
                    c17185M25709 = c17185M25708;
                }
            } catch (Throwable th2) {
                m25699(c17856, c17185M25708);
                m25691(c17856);
                throw th2;
            }
        }
        if (c17185M25709 != this.f30946) {
            return c17185M25709;
        }
        throw new UnknownHostException(c17856.toString());
    }

    /* JADX INFO: renamed from: ܽ */
    private void m25691(C17856 c17856) {
        synchronized (this.f30944) {
            this.f30944.remove(c17856);
            this.f30944.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25699(C17856 c17856, C17185 c17185) {
        C12925 c12925 = this.f30948;
        if (((C15410) c12925.mo29602()).m35114() == 0) {
            return;
        }
        m25700(c17856, c17185, ((C15410) c12925.mo29602()).m35114() != -1 ? System.currentTimeMillis() + ((long) (((C15410) c12925.mo29602()).m35114() * 1000)) : -1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25700(C17856 c17856, C17185 c17185, long j) {
        if (((C15410) this.f30948.mo29602()).m35114() == 0) {
            return;
        }
        synchronized (this.f30952) {
            C24562 c24562 = (C24562) this.f30952.get(c17856);
            if (c24562 == null) {
                this.f30952.put(c17856, new C24562(c17185, j));
            } else {
                c24562.f77772 = c17185;
                c24562.f77773 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25701(C17185[] c17185Arr) {
        if (((C15410) this.f30948.mo29602()).m35114() == 0) {
            return;
        }
        long jCurrentTimeMillis = ((C15410) this.f30948.mo29602()).m35114() != -1 ? System.currentTimeMillis() + ((long) (((C15410) this.f30948.mo29602()).m35114() * 1000)) : -1L;
        synchronized (this.f30952) {
            for (int i = 0; i < c17185Arr.length; i++) {
                C24562 c24562 = (C24562) this.f30952.get(c17185Arr[i].f51163);
                if (c24562 == null) {
                    C17185 c17185 = c17185Arr[i];
                    this.f30952.put(c17185.f51163, new C24562(c17185, jCurrentTimeMillis));
                } else {
                    c24562.f77772 = c17185Arr[i];
                    c24562.f77773 = jCurrentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17185 m25708(C17856 c17856) {
        C17185 c17185;
        if (((C15410) this.f30948.mo29602()).m35114() == 0) {
            return null;
        }
        synchronized (this.f30952) {
            C24562 c24562 = (C24562) this.f30952.get(c17856);
            if (c24562 != null && c24562.f77773 < System.currentTimeMillis() && c24562.f77773 >= 0) {
                c24562 = null;
            }
            c17185 = c24562 != null ? c24562.f77772 : null;
        }
        return c17185;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25697(int i) {
        this.f30937 = 0;
        C12925 c12925 = this.f30948;
        if (((C15410) c12925.mo29602()).m35092() != 0) {
            this.f30937 = Math.max(((C15410) c12925.mo29602()).m35092(), i);
        }
        if (this.f30947 == null) {
            this.f30947 = new DatagramSocket(0, null);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.f30949 = thread;
            thread.setDaemon(true);
            this.f30949.start();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m25711() {
        synchronized (this.f30951) {
            DatagramSocket datagramSocket = this.f30947;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f30947 = null;
            }
            this.f30949 = null;
            this.f30935.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f30949 == Thread.currentThread()) {
            try {
                try {
                    this.f30936.setLength(((C15410) this.f30948.mo29602()).m35127());
                    this.f30947.setSoTimeout(this.f30937);
                    this.f30947.receive(this.f30936);
                    InterfaceC4410 interfaceC4410 = f30934;
                    interfaceC4410.mo9196("NetBIOS: new data read from socket");
                    AbstractC10481 abstractC10481 = (AbstractC10481) this.f30935.get(new Integer(AbstractC10481.m24187(0, this.f30945)));
                    if (abstractC10481 != null && !abstractC10481.f28999) {
                        synchronized (abstractC10481) {
                            abstractC10481.m24188(this.f30945);
                            abstractC10481.f28999 = true;
                            if (interfaceC4410.mo9194()) {
                                interfaceC4410.mo9196(abstractC10481.toString());
                                interfaceC4410.mo9196(C13854.m31530(this.f30945, 0, this.f30936.getLength()));
                            }
                            abstractC10481.notify();
                        }
                    }
                } catch (SocketTimeoutException e) {
                    f30934.mo9192("Socket timeout", e);
                    m25711();
                    return;
                } catch (Exception e2) {
                    f30934.mo9178("Uncaught exception in NameServiceClient", (Throwable) e2);
                    m25711();
                    return;
                }
            } catch (Throwable th) {
                m25711();
                throw th;
            }
        }
        m25711();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e3 */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25698(AbstractC10481 abstractC10481, AbstractC10481 abstractC10482, int i) {
        Integer num;
        RunnableC11152 runnableC11152 = this;
        int length = ((C15410) runnableC11152.f30948.mo29602()).m35119().length;
        if (length == 0) {
            length = 1;
        }
        synchronized (abstractC10482) {
            Integer num2 = null;
            int i2 = length;
            int iCurrentTimeMillis = i;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                try {
                    synchronized (runnableC11152.f30951) {
                        int i4 = runnableC11152.f30942 + 1;
                        runnableC11152.f30942 = i4;
                        if ((i4 & 65535) == 0) {
                            runnableC11152.f30942 = 1;
                        }
                        int i5 = runnableC11152.f30942;
                        abstractC10481.f28990 = i5;
                        num = new Integer(i5);
                        try {
                            runnableC11152.f30953.setAddress(abstractC10481.f28997);
                            runnableC11152.f30953.setLength(abstractC10481.m24189(runnableC11152.f30941));
                            abstractC10482.f28999 = false;
                            runnableC11152.f30935.put(num, abstractC10482);
                            runnableC11152.m25697(iCurrentTimeMillis + 1000);
                            runnableC11152.f30947.send(runnableC11152.f30953);
                            InterfaceC4410 interfaceC4410 = f30934;
                            if (interfaceC4410.mo9194()) {
                                interfaceC4410.mo9196(abstractC10481.toString());
                                interfaceC4410.mo9196(C13854.m31530(runnableC11152.f30941, 0, runnableC11152.f30953.getLength()));
                            }
                            try {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                while (iCurrentTimeMillis > 0) {
                                    long j = iCurrentTimeMillis;
                                    abstractC10482.wait(j);
                                    if (!abstractC10482.f28999 || abstractC10481.f28986 != abstractC10482.f29006) {
                                        abstractC10482.f28999 = false;
                                        iCurrentTimeMillis = (int) (j - (System.currentTimeMillis() - jCurrentTimeMillis));
                                    } else {
                                        runnableC11152.f30935.remove(num);
                                        return;
                                    }
                                }
                                runnableC11152.f30935.remove(num);
                                synchronized (runnableC11152.f30951) {
                                    if (runnableC11152.m25702(abstractC10481.f28997)) {
                                        if (abstractC10481.f28997 == m25707()) {
                                            m25710();
                                        }
                                        abstractC10481.f28997 = m25707();
                                    }
                                }
                                break;
                            } catch (InterruptedException unused) {
                                runnableC11152 = runnableC11152;
                                num2 = num;
                                throw new InterruptedIOException();
                            } catch (Throwable th) {
                                th = th;
                                runnableC11152 = runnableC11152;
                                runnableC11152.f30935.remove(num);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            num2 = num;
                            while (true) {
                                try {
                                    try {
                                        throw th;
                                    } catch (InterruptedException unused2) {
                                        throw new InterruptedIOException();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    num = num2;
                                    runnableC11152.f30935.remove(num);
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (InterruptedException unused3) {
                    runnableC11152 = runnableC11152;
                } catch (Throwable th4) {
                    th = th4;
                    runnableC11152 = runnableC11152;
                    num = num2;
                    runnableC11152.f30935.remove(num);
                    throw th;
                }
                i2 = i3;
                num2 = num;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17185 m25695(C17856 c17856, InetAddress inetAddress) throws UnknownHostException {
        C12925 c12925 = this.f30948;
        C19198 c19198 = new C19198(c12925.mo29602(), c17856);
        C18527 c18527 = new C18527(c12925.mo29602());
        InetAddress inetAddress2 = this.f30950;
        InterfaceC4410 interfaceC4410 = f30934;
        if (inetAddress != null) {
            c19198.f28997 = inetAddress;
            c19198.f29007 = inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
            int iM35128 = ((C15410) c12925.mo29602()).m35128();
            do {
                try {
                    m25698(c19198, c18527, ((C15410) c12925.mo29602()).m35124());
                    if (!c18527.f28999 || c18527.f28991 != 0) {
                        iM35128--;
                        if (iM35128 <= 0) {
                            break;
                        }
                    } else {
                        C17185[] c17185Arr = c18527.f29001;
                        int length = c17185Arr.length - 1;
                        c17185Arr[length].f51163.f53293 = inetAddress.hashCode();
                        return c18527.f29001[length];
                    }
                } catch (InterruptedIOException e) {
                    if (interfaceC4410.mo9194()) {
                        interfaceC4410.mo9192("Timeout waiting for response " + c17856.f53292, e);
                    }
                    throw new UnknownHostException(c17856.f53292);
                } catch (IOException e2) {
                    interfaceC4410.mo9184("Failed to send nameservice request for " + c17856.f53292, (Exception) e2);
                    throw new UnknownHostException(c17856.f53292);
                }
            } while (c19198.f29007);
            throw new UnknownHostException(c17856.f53292);
        }
        for (EnumC5353 enumC5353 : this.f30939) {
            try {
                int i = C15844.f45904[enumC5353.ordinal()];
                if (i == 1) {
                    this.f30943.m28780(c12925);
                } else if (i == 2 || i == 3) {
                    if (enumC5353 == EnumC5353.RESOLVER_WINS && c17856.f53292 != "\u0001\u0002__MSBROWSE__\u0002" && c17856.f53291 != 29) {
                        c19198.f28997 = m25707();
                        c19198.f29007 = false;
                    } else {
                        c19198.f28997 = inetAddress2;
                        c19198.f29007 = true;
                    }
                    int iM35129 = ((C15410) c12925.mo29602()).m35128();
                    while (true) {
                        int i2 = iM35129 - 1;
                        if (iM35129 <= 0) {
                            break;
                        }
                        try {
                            m25698(c19198, c18527, ((C15410) c12925.mo29602()).m35124());
                            if (c18527.f28999 && c18527.f28991 == 0) {
                                c18527.f29001[0].f51163.f53293 = c19198.f28997.hashCode();
                                return c18527.f29001[0];
                            }
                            if (enumC5353 == EnumC5353.RESOLVER_WINS) {
                                break;
                            }
                            iM35129 = i2;
                        } catch (IOException e3) {
                            interfaceC4410.mo9184("Failed to send nameservice request for " + c17856.f53292, (Exception) e3);
                            throw new UnknownHostException(c17856.f53292);
                        }
                    }
                }
            } catch (IOException e4) {
                interfaceC4410.mo9176("Failed to lookup name", (Exception) e4);
            }
        }
        throw new UnknownHostException(c17856.f53292);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17185[] m25706(C17185 c17185) throws UnknownHostException {
        C12925 c12925 = this.f30948;
        InterfaceC3341 interfaceC3341Mo29602 = c12925.mo29602();
        c17185.getClass();
        C19869 c19869 = new C19869(interfaceC3341Mo29602, C17185.class.isAssignableFrom(C17185.class) ? c17185 : null);
        InterfaceC3341 interfaceC3341Mo29603 = c12925.mo29602();
        int i = 0;
        C17856 c17856 = new C17856(c12925.mo29602(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null);
        AbstractC10481 c5787 = new C5787(interfaceC3341Mo29603);
        c5787.f28992 = c17856;
        c5787.f28986 = 33;
        c5787.f28995 = false;
        c5787.f29007 = false;
        c5787.f28997 = InetAddress.getByName(c17185.mo3408());
        int iM35128 = ((C15410) c12925.mo29602()).m35128();
        while (true) {
            int i2 = iM35128 - 1;
            if (iM35128 > 0) {
                try {
                    m25698(c5787, c19869, ((C15410) c12925.mo29602()).m35124());
                    if (c19869.f28999 && c19869.f28991 == 0) {
                        int iHashCode = c5787.f28997.hashCode();
                        while (true) {
                            C17185[] c17185Arr = c19869.f60383;
                            if (i >= c17185Arr.length) {
                                return c17185Arr;
                            }
                            c17185Arr[i].f51163.f53293 = iHashCode;
                            i++;
                        }
                    } else {
                        iM35128 = i2;
                    }
                } catch (IOException e) {
                    f30934.mo9184("Failed to send node status request for " + c17185, (Exception) e);
                    throw new UnknownHostException(c17185.toString());
                }
            } else {
                throw new UnknownHostException(c17185.mo3411());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17185 m25693(int i, String str) {
        if (str != null && str.length() != 0) {
            C17856 c17856 = new C17856(this.f30948.mo29602(), str, i, null);
            if (!Character.isDigit(str.charAt(0))) {
                return m25694(c17856);
            }
            char[] charArray = str.toCharArray();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < charArray.length) {
                char c = charArray[i2];
                if (c < '0' || c > '9') {
                    return m25694(c17856);
                }
                int i5 = 0;
                while (c != '.') {
                    if (c < '0' || c > '9') {
                        return m25694(c17856);
                    }
                    i5 = ((i5 * 10) + c) - 48;
                    i2++;
                    if (i2 >= charArray.length) {
                        break;
                    }
                    c = charArray[i2];
                }
                if (i5 > 255) {
                    return m25694(c17856);
                }
                i4 = (i4 << 8) + i5;
                i3++;
                i2++;
            }
            if (i3 != 4 || str.endsWith(".")) {
                return m25694(c17856);
            }
            return new C17185(this.f30954, i4);
        }
        return this.f30940;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17185[] m25705(String str, int i, InetAddress inetAddress) throws UnknownHostException {
        C12925 c12925 = this.f30948;
        C17856 c17856 = new C17856(c12925.mo29602(), str, i, null);
        InterfaceC4410 interfaceC4410 = f30934;
        InterfaceC3341 interfaceC3341Mo29602 = c12925.mo29602();
        C19198 c19198 = new C19198(interfaceC3341Mo29602, c17856);
        C18527 c18527 = new C18527(interfaceC3341Mo29602);
        if (inetAddress == null) {
            inetAddress = m25707();
        }
        c19198.f28997 = inetAddress;
        InetAddress inetAddress2 = this.f30950;
        int iM35128 = 1;
        boolean z = inetAddress == null || inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
        c19198.f29007 = z;
        if (z) {
            if (c19198.f28997 == null) {
                c19198.f28997 = inetAddress2;
            }
            iM35128 = ((C15410) interfaceC3341Mo29602).m35128();
        }
        do {
            try {
                m25698(c19198, c18527, ((C15410) interfaceC3341Mo29602).m35124());
                if (!c18527.f28999 || c18527.f28991 != 0) {
                    iM35128--;
                    if (iM35128 <= 0) {
                        break;
                    }
                } else {
                    return c18527.f29001;
                }
            } catch (InterruptedIOException e) {
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9192("Failed to send nameservice request for " + c17856.f53292, e);
                }
                throw new UnknownHostException(c17856.f53292);
            } catch (IOException e2) {
                interfaceC4410.mo9184("Failed to send nameservice request for " + c17856.f53292, (Exception) e2);
                throw new UnknownHostException(c17856.f53292);
            }
        } while (c19198.f29007);
        throw new UnknownHostException(c17856.f53292);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6694[] m25709(String str) {
        String str2;
        C17185 c17185M25693 = m25693(0, str);
        try {
            C17185[] c17185ArrM25706 = m25706(c17185M25693);
            m25701(c17185ArrM25706);
            return c17185ArrM25706;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder("no name with type 0x");
            sb.append(C13854.m31529(c17185M25693.f51163.f53291, 2));
            String str3 = c17185M25693.f51163.f53294;
            if (str3 == null || str3.isEmpty()) {
                str2 = " with no scope";
            } else {
                str2 = " with scope " + c17185M25693.f51163.f53294;
            }
            sb.append(str2);
            sb.append(" for host ");
            sb.append(c17185M25693.mo3408());
            throw new UnknownHostException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final InetAddress m25707() {
        C12925 c12925 = this.f30948;
        if (((C15410) c12925.mo29602()).m35119().length == 0) {
            return null;
        }
        return ((C15410) c12925.mo29602()).m35119()[this.f30938];
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25702(InetAddress inetAddress) {
        int i = 0;
        while (inetAddress != null) {
            C12925 c12925 = this.f30948;
            if (i >= ((C15410) c12925.mo29602()).m35119().length) {
                break;
            }
            if (inetAddress.hashCode() == ((C15410) c12925.mo29602()).m35119()[i].hashCode()) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m25710() {
        int i = this.f30938 + 1;
        C12925 c12925 = this.f30948;
        this.f30938 = i < ((C15410) c12925.mo29602()).m35119().length ? this.f30938 + 1 : 0;
        if (((C15410) c12925.mo29602()).m35119().length == 0) {
            return;
        }
        InetAddress inetAddress = ((C15410) c12925.mo29602()).m35119()[this.f30938];
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6694[] m25704(String str, InetAddress inetAddress) throws UnknownHostException {
        C21881 c21881 = new C21881();
        c21881.f68819 = 2;
        C8469 c8469 = new C8469(c21881, str, m25702(inetAddress) ? 27 : 29, inetAddress, this.f30948);
        C8469 c84610 = new C8469(c21881, str, 32, inetAddress, this.f30948);
        c8469.setDaemon(true);
        c84610.setDaemon(true);
        try {
            synchronized (c21881) {
                c8469.start();
                c84610.start();
                while (c21881.f68819 > 0 && c8469.m19694() == null && c84610.m19694() == null) {
                    c21881.wait();
                }
            }
            try {
                c8469.interrupt();
            } catch (SecurityException unused) {
            }
            try {
                c8469.join();
            } catch (InterruptedException unused2) {
            }
            try {
                c84610.interrupt();
            } catch (SecurityException unused3) {
            }
            try {
                c84610.join();
            } catch (InterruptedException unused4) {
            }
            if (c8469.m19694() != null) {
                return c8469.m19694();
            }
            if (c84610.m19694() != null) {
                return c84610.m19694();
            }
            throw c8469.m19695();
        } catch (InterruptedException unused5) {
            throw new UnknownHostException(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2433 m25692(String str) {
        return m25703(str, false)[0];
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: IOException -> 0x0156, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[Catch: IOException -> 0x0156, LOOP:1: B:60:0x012d->B:62:0x0130, LOOP_END, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0053 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final C2433[] m25703(String str, boolean z) throws UnknownHostException {
        InterfaceC6694[] interfaceC6694ArrM25704;
        InterfaceC4410 interfaceC4410;
        C2433[] c2433Arr;
        int i;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (C2433.m3407(str)) {
            return new C2433[]{new C2433(m25693(0, str))};
        }
        InterfaceC4410 interfaceC4411 = f30934;
        if (interfaceC4411.mo9194()) {
            interfaceC4411.mo9196("Resolver order is " + ((C15410) this.f30948.mo29602()).m35108());
        }
        for (EnumC5353 enumC5353 : ((C15410) this.f30948.mo29602()).m35108()) {
            try {
                int i2 = C15844.f45904[enumC5353.ordinal()];
                if (i2 == 1) {
                    C12493 c12493 = this.f30943;
                    C12925 c12925 = this.f30948;
                    synchronized (c12493) {
                        new C17856(c12925.mo29602(), str, 32, null);
                        c12493.m28780(c12925);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new UnknownHostException(str);
                        }
                        for (int i3 = 0; i3 < str.length(); i3++) {
                            if (!Character.isDigit(str.charAt(i3))) {
                                InetAddress[] allByName = InetAddress.getAllByName(str);
                                C2433[] c2433Arr2 = new C2433[allByName.length];
                                for (int i4 = 0; i4 < allByName.length; i4++) {
                                    c2433Arr2[i4] = new C2433(allByName[i4]);
                                }
                                InterfaceC4410 interfaceC4412 = f30934;
                                if (interfaceC4412.mo9181()) {
                                    interfaceC4412.mo9177("Resolved '{}' to {} using DNS", str, Arrays.toString(c2433Arr2));
                                }
                                return c2433Arr2;
                            }
                        }
                        throw new UnknownHostException(str);
                    }
                    if (str.length() <= 15) {
                        interfaceC6694ArrM25704 = z ? m25704(str, ((C15410) this.f30948.mo29602()).m35106()) : m25705(str, 32, ((C15410) this.f30948.mo29602()).m35106());
                        if (interfaceC6694ArrM25704 != null) {
                            interfaceC4410 = f30934;
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9187("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC6694ArrM25704), enumC5353);
                            }
                            c2433Arr = new C2433[interfaceC6694ArrM25704.length];
                            for (i = 0; i < interfaceC6694ArrM25704.length; i++) {
                                c2433Arr[i] = new C2433(interfaceC6694ArrM25704[i]);
                            }
                            return c2433Arr;
                        }
                    }
                } else if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                    interfaceC6694ArrM25704 = z ? m25704(str, m25707()) : m25705(str, 32, m25707());
                    if (interfaceC6694ArrM25704 != null) {
                        interfaceC4410 = f30934;
                        if (interfaceC4410.mo9181()) {
                            interfaceC4410.mo9187("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC6694ArrM25704), enumC5353);
                        }
                        c2433Arr = new C2433[interfaceC6694ArrM25704.length];
                        while (i < interfaceC6694ArrM25704.length) {
                            c2433Arr[i] = new C2433(interfaceC6694ArrM25704[i]);
                        }
                        return c2433Arr;
                    }
                }
            } catch (IOException e) {
                InterfaceC4410 interfaceC4413 = f30934;
                interfaceC4413.mo9185("Resolving {} via {} failed:", str, enumC5353);
                interfaceC4413.mo9192("Exception is", e);
            }
        }
        throw new UnknownHostException(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17856 m25696() {
        C17185 c17185 = this.f30940;
        if (c17185 != null) {
            return c17185.f51163;
        }
        return null;
    }
}
