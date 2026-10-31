package l;

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
public final class RunnableC9242 implements Runnable, InterfaceC20074 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f27988 = C11321.m27961(RunnableC9242.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public HashMap f27989;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DatagramPacket f27990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27991;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f27992;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f27993;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C15590 f27994;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27995;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f27996;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10653 f27997;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashSet f27998;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f27999;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C15590 f28000;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public DatagramSocket f28001;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C11107 f28002;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Thread f28003;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InetAddress f28004;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f28005;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f28006;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public DatagramPacket f28007;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C16296 f28008;

    public RunnableC9242(C11107 c11107) {
        InetAddress byName;
        c11107.mo27540().getClass();
        c11107.mo27540().getClass();
        this.f28005 = new Object();
        this.f27992 = 0;
        HashMap map = new HashMap();
        this.f28006 = map;
        this.f27998 = new HashSet();
        this.f27989 = new HashMap();
        this.f27996 = 0;
        this.f27993 = new ArrayList();
        this.f27997 = new C10653();
        this.f28002 = c11107;
        InetAddress inetAddressM32992 = ((C13722) c11107.mo27540()).m32992();
        this.f28004 = inetAddressM32992;
        byte[] bArr = new byte[((C13722) c11107.mo27540()).m32980()];
        this.f27995 = bArr;
        byte[] bArr2 = new byte[((C13722) c11107.mo27540()).m33013()];
        this.f27999 = bArr2;
        this.f28007 = new DatagramPacket(bArr, ((C13722) c11107.mo27540()).m32980(), inetAddressM32992, 137);
        this.f27990 = new DatagramPacket(bArr2, ((C13722) c11107.mo27540()).m33013());
        this.f27993 = ((C13722) c11107.mo27540()).m32994();
        C16296 c16296 = new C16296(c11107.mo27540(), "0.0.0.0", 0, null);
        this.f28008 = c16296;
        C15590 c15590 = new C15590(c16296, 0);
        this.f28000 = c15590;
        map.put(c16296, new C23352(c15590, -1L));
        c11107.mo27540().getClass();
        try {
            try {
                byName = InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                throw new C13017(e);
            }
        } catch (UnknownHostException unused) {
            byName = InetAddress.getByName("127.0.0.1");
        }
        c11107.mo27540().getClass();
        byte[] address = byName.getAddress();
        String str = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C12085.m29467((int) (Math.random() * 255.0d), 2);
        InterfaceC1023 interfaceC1023Mo27540 = c11107.mo27540();
        c11107.mo27540().getClass();
        C16296 c16297 = new C16296(interfaceC1023Mo27540, str, 0, null);
        C15590 c15591 = new C15590(c16297, byName.hashCode(), 0);
        this.f27994 = c15591;
        m23700(c16297, c15591, -1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15590 m23694(C16296 c16296) throws UnknownHostException {
        C15590 c15590M23695;
        C15590 c15590M23708 = null;
        InetAddress inetAddress = c16296.f50124 == 29 ? this.f28004 : null;
        c16296.f50126 = inetAddress != null ? inetAddress.hashCode() : 0;
        C15590 c15590M23709 = m23708(c16296);
        if (c15590M23709 == null) {
            synchronized (this.f27998) {
                if (!this.f27998.contains(c16296)) {
                    this.f27998.add(c16296);
                } else {
                    while (this.f27998.contains(c16296)) {
                        try {
                            this.f27998.wait();
                        } catch (InterruptedException e) {
                            f27988.mo7097("Interrupted", e);
                        }
                    }
                    c15590M23708 = m23708(c16296);
                    if (c15590M23708 == null) {
                        synchronized (this.f27998) {
                            this.f27998.add(c16296);
                        }
                    }
                }
            }
            try {
                if (c15590M23708 == null) {
                    try {
                        c15590M23695 = m23695(c16296, inetAddress);
                    } catch (UnknownHostException unused) {
                        c15590M23695 = this.f28000;
                    }
                    c15590M23709 = c15590M23695;
                    m23699(c16296, c15590M23709);
                    m23691(c16296);
                } else {
                    c15590M23709 = c15590M23708;
                }
            } catch (Throwable th) {
                m23699(c16296, c15590M23708);
                m23691(c16296);
                throw th;
            }
        }
        if (c15590M23709 != this.f28000) {
            return c15590M23709;
        }
        throw new UnknownHostException(c16296.toString());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m23691(C16296 c16296) {
        synchronized (this.f27998) {
            this.f27998.remove(c16296);
            this.f27998.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23699(C16296 c16296, C15590 c15590) {
        C11107 c11107 = this.f28002;
        if (((C13722) c11107.mo27540()).m33000() == 0) {
            return;
        }
        m23700(c16296, c15590, ((C13722) c11107.mo27540()).m33000() != -1 ? System.currentTimeMillis() + ((long) (((C13722) c11107.mo27540()).m33000() * 1000)) : -1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23700(C16296 c16296, C15590 c15590, long j) {
        if (((C13722) this.f28002.mo27540()).m33000() == 0) {
            return;
        }
        synchronized (this.f28006) {
            C23352 c23352 = (C23352) this.f28006.get(c16296);
            if (c23352 == null) {
                this.f28006.put(c16296, new C23352(c15590, j));
            } else {
                c23352.f75026 = c15590;
                c23352.f75027 = j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23701(C15590[] c15590Arr) {
        if (((C13722) this.f28002.mo27540()).m33000() == 0) {
            return;
        }
        long jCurrentTimeMillis = ((C13722) this.f28002.mo27540()).m33000() != -1 ? System.currentTimeMillis() + ((long) (((C13722) this.f28002.mo27540()).m33000() * 1000)) : -1L;
        synchronized (this.f28006) {
            for (int i = 0; i < c15590Arr.length; i++) {
                C23352 c23352 = (C23352) this.f28006.get(c15590Arr[i].f48031);
                if (c23352 == null) {
                    C15590 c15590 = c15590Arr[i];
                    this.f28006.put(c15590.f48031, new C23352(c15590, jCurrentTimeMillis));
                } else {
                    c23352.f75026 = c15590Arr[i];
                    c23352.f75027 = jCurrentTimeMillis;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15590 m23708(C16296 c16296) {
        C15590 c15590;
        if (((C13722) this.f28002.mo27540()).m33000() == 0) {
            return null;
        }
        synchronized (this.f28006) {
            C23352 c23352 = (C23352) this.f28006.get(c16296);
            if (c23352 != null && c23352.f75027 < System.currentTimeMillis() && c23352.f75027 >= 0) {
                c23352 = null;
            }
            c15590 = c23352 != null ? c23352.f75026 : null;
        }
        return c15590;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23697(int i) {
        this.f27991 = 0;
        C11107 c11107 = this.f28002;
        if (((C13722) c11107.mo27540()).m32978() != 0) {
            this.f27991 = Math.max(((C13722) c11107.mo27540()).m32978(), i);
        }
        if (this.f28001 == null) {
            this.f28001 = new DatagramSocket(0, null);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.f28003 = thread;
            thread.setDaemon(true);
            this.f28003.start();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m23711() {
        synchronized (this.f28005) {
            DatagramSocket datagramSocket = this.f28001;
            if (datagramSocket != null) {
                datagramSocket.close();
                this.f28001 = null;
            }
            this.f28003 = null;
            this.f27989.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (this.f28003 == Thread.currentThread()) {
            try {
                try {
                    this.f27990.setLength(((C13722) this.f28002.mo27540()).m33013());
                    this.f28001.setSoTimeout(this.f27991);
                    this.f28001.receive(this.f27990);
                    InterfaceC2148 interfaceC2148 = f27988;
                    interfaceC2148.mo7101("NetBIOS: new data read from socket");
                    AbstractC8536 abstractC8536 = (AbstractC8536) this.f27989.get(new Integer(AbstractC8536.m22219(0, this.f27999)));
                    if (abstractC8536 != null && !abstractC8536.f26084) {
                        synchronized (abstractC8536) {
                            abstractC8536.m22220(this.f27999);
                            abstractC8536.f26084 = true;
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7101(abstractC8536.toString());
                                interfaceC2148.mo7101(C12085.m29468(this.f27999, 0, this.f27990.getLength()));
                            }
                            abstractC8536.notify();
                        }
                    }
                } catch (SocketTimeoutException e) {
                    f27988.mo7097("Socket timeout", e);
                    m23711();
                    return;
                } catch (Exception e2) {
                    f27988.mo7083("Uncaught exception in NameServiceClient", (Throwable) e2);
                    m23711();
                    return;
                }
            } catch (Throwable th) {
                m23711();
                throw th;
            }
        }
        m23711();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00e3 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m23698(AbstractC8536 abstractC8536, AbstractC8536 abstractC8537, int i) {
        Integer num;
        RunnableC9242 runnableC9242 = this;
        int length = ((C13722) runnableC9242.f28002.mo27540()).m33005().length;
        if (length == 0) {
            length = 1;
        }
        synchronized (abstractC8537) {
            Integer num2 = null;
            int i2 = length;
            int iCurrentTimeMillis = i;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                try {
                    synchronized (runnableC9242.f28005) {
                        int i4 = runnableC9242.f27996 + 1;
                        runnableC9242.f27996 = i4;
                        if ((i4 & 65535) == 0) {
                            runnableC9242.f27996 = 1;
                        }
                        int i5 = runnableC9242.f27996;
                        abstractC8536.f26075 = i5;
                        num = new Integer(i5);
                        try {
                            runnableC9242.f28007.setAddress(abstractC8536.f26082);
                            runnableC9242.f28007.setLength(abstractC8536.m22221(runnableC9242.f27995));
                            abstractC8537.f26084 = false;
                            runnableC9242.f27989.put(num, abstractC8537);
                            runnableC9242.m23697(iCurrentTimeMillis + 1000);
                            runnableC9242.f28001.send(runnableC9242.f28007);
                            InterfaceC2148 interfaceC2148 = f27988;
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7101(abstractC8536.toString());
                                interfaceC2148.mo7101(C12085.m29468(runnableC9242.f27995, 0, runnableC9242.f28007.getLength()));
                            }
                            try {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                while (iCurrentTimeMillis > 0) {
                                    long j = iCurrentTimeMillis;
                                    abstractC8537.wait(j);
                                    if (!abstractC8537.f26084 || abstractC8536.f26071 != abstractC8537.f26091) {
                                        abstractC8537.f26084 = false;
                                        iCurrentTimeMillis = (int) (j - (System.currentTimeMillis() - jCurrentTimeMillis));
                                    } else {
                                        runnableC9242.f27989.remove(num);
                                        return;
                                    }
                                }
                                runnableC9242.f27989.remove(num);
                                synchronized (runnableC9242.f28005) {
                                    if (runnableC9242.m23702(abstractC8536.f26082)) {
                                        if (abstractC8536.f26082 == m23707()) {
                                            m23710();
                                        }
                                        abstractC8536.f26082 = m23707();
                                    }
                                }
                                break;
                            } catch (InterruptedException unused) {
                                runnableC9242 = runnableC9242;
                                num2 = num;
                                throw new InterruptedIOException();
                            } catch (Throwable th) {
                                th = th;
                                runnableC9242 = runnableC9242;
                                runnableC9242.f27989.remove(num);
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
                                    runnableC9242.f27989.remove(num);
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (InterruptedException unused3) {
                    runnableC9242 = runnableC9242;
                } catch (Throwable th4) {
                    th = th4;
                    runnableC9242 = runnableC9242;
                    num = num2;
                    runnableC9242.f27989.remove(num);
                    throw th;
                }
                i2 = i3;
                num2 = num;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15590 m23695(C16296 c16296, InetAddress inetAddress) throws UnknownHostException {
        C11107 c11107 = this.f28002;
        C17708 c17708 = new C17708(c11107.mo27540(), c16296);
        C17002 c17002 = new C17002(c11107.mo27540());
        InetAddress inetAddress2 = this.f28004;
        InterfaceC2148 interfaceC2148 = f27988;
        if (inetAddress != null) {
            c17708.f26082 = inetAddress;
            c17708.f26092 = inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
            int iM33014 = ((C13722) c11107.mo27540()).m33014();
            do {
                try {
                    m23698(c17708, c17002, ((C13722) c11107.mo27540()).m33010());
                    if (!c17002.f26084 || c17002.f26076 != 0) {
                        iM33014--;
                        if (iM33014 <= 0) {
                            break;
                        }
                    } else {
                        C15590[] c15590Arr = c17002.f26086;
                        int length = c15590Arr.length - 1;
                        c15590Arr[length].f48031.f50126 = inetAddress.hashCode();
                        return c17002.f26086[length];
                    }
                } catch (InterruptedIOException e) {
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7097("Timeout waiting for response " + c16296.f50125, e);
                    }
                    throw new UnknownHostException(c16296.f50125);
                } catch (IOException e2) {
                    interfaceC2148.mo7089("Failed to send nameservice request for " + c16296.f50125, (Exception) e2);
                    throw new UnknownHostException(c16296.f50125);
                }
            } while (c17708.f26092);
            throw new UnknownHostException(c16296.f50125);
        }
        for (EnumC3140 enumC3140 : this.f27993) {
            try {
                int i = C14179.f42817[enumC3140.ordinal()];
                if (i == 1) {
                    this.f27997.m26741(c11107);
                } else if (i == 2 || i == 3) {
                    if (enumC3140 == EnumC3140.RESOLVER_WINS && c16296.f50125 != "\u0001\u0002__MSBROWSE__\u0002" && c16296.f50124 != 29) {
                        c17708.f26082 = m23707();
                        c17708.f26092 = false;
                    } else {
                        c17708.f26082 = inetAddress2;
                        c17708.f26092 = true;
                    }
                    int iM33015 = ((C13722) c11107.mo27540()).m33014();
                    while (true) {
                        int i2 = iM33015 - 1;
                        if (iM33015 <= 0) {
                            break;
                        }
                        try {
                            m23698(c17708, c17002, ((C13722) c11107.mo27540()).m33010());
                            if (c17002.f26084 && c17002.f26076 == 0) {
                                c17002.f26086[0].f48031.f50126 = c17708.f26082.hashCode();
                                return c17002.f26086[0];
                            }
                            if (enumC3140 == EnumC3140.RESOLVER_WINS) {
                                break;
                            }
                            iM33015 = i2;
                        } catch (IOException e3) {
                            interfaceC2148.mo7089("Failed to send nameservice request for " + c16296.f50125, (Exception) e3);
                            throw new UnknownHostException(c16296.f50125);
                        }
                    }
                }
            } catch (IOException e4) {
                interfaceC2148.mo7081("Failed to lookup name", (Exception) e4);
            }
        }
        throw new UnknownHostException(c16296.f50125);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15590[] m23706(C15590 c15590) throws UnknownHostException {
        C11107 c11107 = this.f28002;
        InterfaceC1023 interfaceC1023Mo27540 = c11107.mo27540();
        c15590.getClass();
        C18414 c18414 = new C18414(interfaceC1023Mo27540, C15590.class.isAssignableFrom(C15590.class) ? c15590 : null);
        InterfaceC1023 interfaceC1023Mo27541 = c11107.mo27540();
        int i = 0;
        C16296 c16296 = new C16296(c11107.mo27540(), "*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null);
        AbstractC8536 c3597 = new C3597(interfaceC1023Mo27541);
        c3597.f26077 = c16296;
        c3597.f26071 = 33;
        c3597.f26080 = false;
        c3597.f26092 = false;
        c3597.f26082 = InetAddress.getByName(c15590.mo1012());
        int iM33014 = ((C13722) c11107.mo27540()).m33014();
        while (true) {
            int i2 = iM33014 - 1;
            if (iM33014 > 0) {
                try {
                    m23698(c3597, c18414, ((C13722) c11107.mo27540()).m33010());
                    if (c18414.f26084 && c18414.f26076 == 0) {
                        int iHashCode = c3597.f26082.hashCode();
                        while (true) {
                            C15590[] c15590Arr = c18414.f57164;
                            if (i >= c15590Arr.length) {
                                return c15590Arr;
                            }
                            c15590Arr[i].f48031.f50126 = iHashCode;
                            i++;
                        }
                    } else {
                        iM33014 = i2;
                    }
                } catch (IOException e) {
                    f27988.mo7089("Failed to send node status request for " + c15590, (Exception) e);
                    throw new UnknownHostException(c15590.toString());
                }
            } else {
                throw new UnknownHostException(c15590.mo1015());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15590 m23693(int i, String str) {
        if (str != null && str.length() != 0) {
            C16296 c16296 = new C16296(this.f28002.mo27540(), str, i, null);
            if (!Character.isDigit(str.charAt(0))) {
                return m23694(c16296);
            }
            char[] charArray = str.toCharArray();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < charArray.length) {
                char c = charArray[i2];
                if (c < '0' || c > '9') {
                    return m23694(c16296);
                }
                int i5 = 0;
                while (c != '.') {
                    if (c < '0' || c > '9') {
                        return m23694(c16296);
                    }
                    i5 = ((i5 * 10) + c) - 48;
                    i2++;
                    if (i2 >= charArray.length) {
                        break;
                    }
                    c = charArray[i2];
                }
                if (i5 > 255) {
                    return m23694(c16296);
                }
                i4 = (i4 << 8) + i5;
                i3++;
                i2++;
            }
            if (i3 != 4 || str.endsWith(".")) {
                return m23694(c16296);
            }
            return new C15590(this.f28008, i4);
        }
        return this.f27994;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15590[] m23705(String str, int i, InetAddress inetAddress) throws UnknownHostException {
        C11107 c11107 = this.f28002;
        C16296 c16296 = new C16296(c11107.mo27540(), str, i, null);
        InterfaceC2148 interfaceC2148 = f27988;
        InterfaceC1023 interfaceC1023Mo27540 = c11107.mo27540();
        C17708 c17708 = new C17708(interfaceC1023Mo27540, c16296);
        C17002 c17002 = new C17002(interfaceC1023Mo27540);
        if (inetAddress == null) {
            inetAddress = m23707();
        }
        c17708.f26082 = inetAddress;
        InetAddress inetAddress2 = this.f28004;
        int iM33014 = 1;
        boolean z = inetAddress == null || inetAddress.equals(inetAddress2) || inetAddress.getAddress()[3] == -1;
        c17708.f26092 = z;
        if (z) {
            if (c17708.f26082 == null) {
                c17708.f26082 = inetAddress2;
            }
            iM33014 = ((C13722) interfaceC1023Mo27540).m33014();
        }
        do {
            try {
                m23698(c17708, c17002, ((C13722) interfaceC1023Mo27540).m33010());
                if (!c17002.f26084 || c17002.f26076 != 0) {
                    iM33014--;
                    if (iM33014 <= 0) {
                        break;
                    }
                } else {
                    return c17002.f26086;
                }
            } catch (InterruptedIOException e) {
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7097("Failed to send nameservice request for " + c16296.f50125, e);
                }
                throw new UnknownHostException(c16296.f50125);
            } catch (IOException e2) {
                interfaceC2148.mo7089("Failed to send nameservice request for " + c16296.f50125, (Exception) e2);
                throw new UnknownHostException(c16296.f50125);
            }
        } while (c17708.f26092);
        throw new UnknownHostException(c16296.f50125);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4551[] m23709(String str) {
        String str2;
        C15590 c15590M23693 = m23693(0, str);
        try {
            C15590[] c15590ArrM23706 = m23706(c15590M23693);
            m23701(c15590ArrM23706);
            return c15590ArrM23706;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder("no name with type 0x");
            sb.append(C12085.m29467(c15590M23693.f48031.f50124, 2));
            String str3 = c15590M23693.f48031.f50127;
            if (str3 == null || str3.isEmpty()) {
                str2 = " with no scope";
            } else {
                str2 = " with scope " + c15590M23693.f48031.f50127;
            }
            sb.append(str2);
            sb.append(" for host ");
            sb.append(c15590M23693.mo1012());
            throw new UnknownHostException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InetAddress m23707() {
        C11107 c11107 = this.f28002;
        if (((C13722) c11107.mo27540()).m33005().length == 0) {
            return null;
        }
        return ((C13722) c11107.mo27540()).m33005()[this.f27992];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23702(InetAddress inetAddress) {
        int i = 0;
        while (inetAddress != null) {
            C11107 c11107 = this.f28002;
            if (i >= ((C13722) c11107.mo27540()).m33005().length) {
                break;
            }
            if (inetAddress.hashCode() == ((C13722) c11107.mo27540()).m33005()[i].hashCode()) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m23710() {
        int i = this.f27992 + 1;
        C11107 c11107 = this.f28002;
        this.f27992 = i < ((C13722) c11107.mo27540()).m33005().length ? this.f27992 + 1 : 0;
        if (((C13722) c11107.mo27540()).m33005().length == 0) {
            return;
        }
        InetAddress inetAddress = ((C13722) c11107.mo27540()).m33005()[this.f27992];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4551[] m23704(String str, InetAddress inetAddress) throws UnknownHostException {
        C20531 c20531 = new C20531();
        c20531.f66142 = 2;
        C6419 c6419 = new C6419(c20531, str, m23702(inetAddress) ? 27 : 29, inetAddress, this.f28002);
        C6419 c64110 = new C6419(c20531, str, 32, inetAddress, this.f28002);
        c6419.setDaemon(true);
        c64110.setDaemon(true);
        try {
            synchronized (c20531) {
                c6419.start();
                c64110.start();
                while (c20531.f66142 > 0 && c6419.m17747() == null && c64110.m17747() == null) {
                    c20531.wait();
                }
            }
            try {
                c6419.interrupt();
            } catch (SecurityException unused) {
            }
            try {
                c6419.join();
            } catch (InterruptedException unused2) {
            }
            try {
                c64110.interrupt();
            } catch (SecurityException unused3) {
            }
            try {
                c64110.join();
            } catch (InterruptedException unused4) {
            }
            if (c6419.m17747() != null) {
                return c6419.m17747();
            }
            if (c64110.m17747() != null) {
                return c64110.m17747();
            }
            throw c6419.m17748();
        } catch (InterruptedException unused5) {
            throw new UnknownHostException(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0068 m23692(String str) {
        return m23703(str, false)[0];
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0118 A[Catch: IOException -> 0x0156, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0130 A[Catch: IOException -> 0x0156, LOOP:1: B:60:0x012d->B:62:0x0130, LOOP_END, TryCatch #1 {IOException -> 0x0156, blocks: (B:16:0x0060, B:24:0x0078, B:26:0x007e, B:28:0x0088, B:29:0x0090, B:31:0x0093, B:32:0x009f, B:34:0x00a7, B:36:0x00b1, B:37:0x00b4, B:38:0x00b9, B:39:0x00ba, B:40:0x00bf, B:41:0x00c0, B:45:0x00c9, B:56:0x0110, B:58:0x0118, B:59:0x0129, B:60:0x012d, B:62:0x0130, B:46:0x00da, B:47:0x00eb, B:49:0x00f3, B:53:0x00fd, B:54:0x0106, B:64:0x013d, B:65:0x0142, B:67:0x0150, B:71:0x0155, B:66:0x0143), top: B:80:0x0060, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0053 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0068[] m23703(String str, boolean z) throws UnknownHostException {
        InterfaceC4551[] interfaceC4551ArrM23704;
        InterfaceC2148 interfaceC2148;
        C0068[] c0068Arr;
        int i;
        if (str == null || str.length() == 0) {
            throw new UnknownHostException();
        }
        if (C0068.m1011(str)) {
            return new C0068[]{new C0068(m23693(0, str))};
        }
        InterfaceC2148 interfaceC2149 = f27988;
        if (interfaceC2149.mo7099()) {
            interfaceC2149.mo7101("Resolver order is " + ((C13722) this.f28002.mo27540()).m32994());
        }
        for (EnumC3140 enumC3140 : ((C13722) this.f28002.mo27540()).m32994()) {
            try {
                int i2 = C14179.f42817[enumC3140.ordinal()];
                if (i2 == 1) {
                    C10653 c10653 = this.f27997;
                    C11107 c11107 = this.f28002;
                    synchronized (c10653) {
                        new C16296(c11107.mo27540(), str, 32, null);
                        c10653.m26741(c11107);
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new UnknownHostException(str);
                        }
                        for (int i3 = 0; i3 < str.length(); i3++) {
                            if (!Character.isDigit(str.charAt(i3))) {
                                InetAddress[] allByName = InetAddress.getAllByName(str);
                                C0068[] c0068Arr2 = new C0068[allByName.length];
                                for (int i4 = 0; i4 < allByName.length; i4++) {
                                    c0068Arr2[i4] = new C0068(allByName[i4]);
                                }
                                InterfaceC2148 interfaceC21410 = f27988;
                                if (interfaceC21410.mo7086()) {
                                    interfaceC21410.mo7082("Resolved '{}' to {} using DNS", str, Arrays.toString(c0068Arr2));
                                }
                                return c0068Arr2;
                            }
                        }
                        throw new UnknownHostException(str);
                    }
                    if (str.length() <= 15) {
                        interfaceC4551ArrM23704 = z ? m23704(str, ((C13722) this.f28002.mo27540()).m32992()) : m23705(str, 32, ((C13722) this.f28002.mo27540()).m32992());
                        if (interfaceC4551ArrM23704 != null) {
                            interfaceC2148 = f27988;
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7092("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC4551ArrM23704), enumC3140);
                            }
                            c0068Arr = new C0068[interfaceC4551ArrM23704.length];
                            for (i = 0; i < interfaceC4551ArrM23704.length; i++) {
                                c0068Arr[i] = new C0068(interfaceC4551ArrM23704[i]);
                            }
                            return c0068Arr;
                        }
                    }
                } else if (!str.equals("\u0001\u0002__MSBROWSE__\u0002") && str.length() <= 15) {
                    interfaceC4551ArrM23704 = z ? m23704(str, m23707()) : m23705(str, 32, m23707());
                    if (interfaceC4551ArrM23704 != null) {
                        interfaceC2148 = f27988;
                        if (interfaceC2148.mo7086()) {
                            interfaceC2148.mo7092("Resolved '{}' to addrs {} via {}", str, Arrays.toString(interfaceC4551ArrM23704), enumC3140);
                        }
                        c0068Arr = new C0068[interfaceC4551ArrM23704.length];
                        while (i < interfaceC4551ArrM23704.length) {
                            c0068Arr[i] = new C0068(interfaceC4551ArrM23704[i]);
                        }
                        return c0068Arr;
                    }
                }
            } catch (IOException e) {
                InterfaceC2148 interfaceC21411 = f27988;
                interfaceC21411.mo7090("Resolving {} via {} failed:", str, enumC3140);
                interfaceC21411.mo7097("Exception is", e);
            }
        }
        throw new UnknownHostException(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16296 m23696() {
        C15590 c15590 = this.f27994;
        if (c15590 != null) {
            return c15590.f48031;
        }
        return null;
    }
}
