package p067l;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩸ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C22795 {

    /* JADX INFO: renamed from: ۜ */
    public static InetAddress f71829;

    /* JADX INFO: renamed from: ᩷ */
    public static Vector f71830 = new Vector();

    /* JADX INFO: renamed from: ֫ */
    public InetAddress f71831;

    /* JADX INFO: renamed from: ۧ */
    public String f71832;

    /* JADX INFO: renamed from: ܳ */
    public ServerSocket f71833;

    /* JADX INFO: renamed from: ܽ */
    public int f71834;

    /* JADX INFO: renamed from: ܿ */
    public C9383 f71835;

    /* JADX INFO: renamed from: ᩳ */
    public int f71836;

    /* JADX INFO: renamed from: ᩻ */
    public RunnableC16758 f71837;

    static {
        f71829 = null;
        try {
            f71829 = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22795 m50999(C9383 c9383, String str, int i, String str2, int i2) {
        Vector vector;
        C22795 c22795;
        int localPort;
        InetAddress inetAddress;
        if (str != null) {
            if (str.length() == 0 || str.equals("*")) {
                str = "0.0.0.0";
            } else if (str.equals("localhost")) {
                str = "127.0.0.1";
            }
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            synchronized (f71830) {
                int i3 = 0;
                while (true) {
                    vector = f71830;
                    if (i3 >= vector.size()) {
                        c22795 = null;
                        break;
                    }
                    c22795 = (C22795) vector.elementAt(i3);
                    if (c22795.f71835 == c9383 && c22795.f71834 == i && (((inetAddress = f71829) != null && c22795.f71831.equals(inetAddress)) || c22795.f71831.equals(byName))) {
                        break;
                    }
                    i3++;
                }
            }
            if (c22795 != null) {
                throw new C14392("PortForwardingL: local port " + str + ":" + i + " is already registered.");
            }
            C22795 c22796 = new C22795();
            c22796.f71835 = c9383;
            c22796.f71834 = i;
            c22796.f71832 = str2;
            c22796.f71836 = i2;
            try {
                c22796.f71831 = InetAddress.getByName(str);
                ServerSocket serverSocket = new ServerSocket(i, 0, c22796.f71831);
                c22796.f71833 = serverSocket;
                if (i == 0 && (localPort = serverSocket.getLocalPort()) != -1) {
                    c22796.f71834 = localPort;
                }
                vector.addElement(c22796);
                return c22796;
            } catch (Exception e) {
                throw new C14392("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
            }
        } catch (UnknownHostException e2) {
            throw new C14392(C6988.m16053("PortForwardingL: invalid address ", str, " specified."), e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51000(C9383 c9383) {
        Vector vector = f71830;
        synchronized (vector) {
            C22795[] c22795Arr = new C22795[vector.size()];
            int i = 0;
            int i2 = 0;
            while (true) {
                Vector vector2 = f71830;
                if (i >= vector2.size()) {
                    break;
                }
                C22795 c22795 = (C22795) vector2.elementAt(i);
                if (c22795.f71835 == c9383) {
                    c22795.f71837 = null;
                    try {
                        ServerSocket serverSocket = c22795.f71833;
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                        c22795.f71833 = null;
                    } catch (Exception unused) {
                    }
                    int i3 = i2 + 1;
                    c22795Arr[i2] = c22795;
                    i2 = i3;
                }
                i++;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                f71830.removeElement(c22795Arr[i4]);
            }
        }
    }
}
