package l;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩸ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21493 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static InetAddress f69132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Vector f69133 = new Vector();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InetAddress f69134;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f69135;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ServerSocket f69136;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69137;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7381 f69138;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f69139;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public RunnableC15141 f69140;

    static {
        f69132 = null;
        try {
            f69132 = InetAddress.getByName("0.0.0.0");
        } catch (UnknownHostException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21493 m48662(C7381 c7381, String str, int i, String str2, int i2) {
        Vector vector;
        C21493 c21493;
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
            synchronized (f69133) {
                int i3 = 0;
                while (true) {
                    vector = f69133;
                    if (i3 >= vector.size()) {
                        c21493 = null;
                        break;
                    }
                    c21493 = (C21493) vector.elementAt(i3);
                    if (c21493.f69138 == c7381 && c21493.f69137 == i && (((inetAddress = f69132) != null && c21493.f69134.equals(inetAddress)) || c21493.f69134.equals(byName))) {
                        break;
                    }
                    i3++;
                }
            }
            if (c21493 != null) {
                throw new C12651("PortForwardingL: local port " + str + ":" + i + " is already registered.");
            }
            C21493 c21494 = new C21493();
            c21494.f69138 = c7381;
            c21494.f69137 = i;
            c21494.f69135 = str2;
            c21494.f69139 = i2;
            try {
                c21494.f69134 = InetAddress.getByName(str);
                ServerSocket serverSocket = new ServerSocket(i, 0, c21494.f69134);
                c21494.f69136 = serverSocket;
                if (i == 0 && (localPort = serverSocket.getLocalPort()) != -1) {
                    c21494.f69137 = localPort;
                }
                vector.addElement(c21494);
                return c21494;
            } catch (Exception e) {
                throw new C12651("PortForwardingL: local port " + str + ":" + i + " cannot be bound.", e);
            }
        } catch (UnknownHostException e2) {
            throw new C12651(C4860.m14172("PortForwardingL: invalid address ", str, " specified."), e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48663(C7381 c7381) {
        Vector vector = f69133;
        synchronized (vector) {
            C21493[] c21493Arr = new C21493[vector.size()];
            int i = 0;
            int i2 = 0;
            while (true) {
                Vector vector2 = f69133;
                if (i >= vector2.size()) {
                    break;
                }
                C21493 c21493 = (C21493) vector2.elementAt(i);
                if (c21493.f69138 == c7381) {
                    c21493.f69140 = null;
                    try {
                        ServerSocket serverSocket = c21493.f69136;
                        if (serverSocket != null) {
                            serverSocket.close();
                        }
                        c21493.f69136 = null;
                    } catch (Exception unused) {
                    }
                    int i3 = i2 + 1;
                    c21493Arr[i2] = c21493;
                    i2 = i3;
                }
                i++;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                f69133.removeElement(c21493Arr[i4]);
            }
        }
    }
}
