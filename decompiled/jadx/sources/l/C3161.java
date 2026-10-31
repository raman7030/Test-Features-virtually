package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۗۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A16 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3161 extends Thread {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f9950 = C11321.m27962(C3161.class.getName());

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8806 f9951;

    public C3161(C8806 c8806) {
        super("SocketListener(" + c8806.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        setDaemon(true);
        this.f9951 = c8806;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InetAddress address;
        InterfaceC2148 interfaceC2148 = f9950;
        C8806 c8806 = this.f9951;
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!c8806.m22750() && !c8806.m22741()) {
                datagramPacket.setLength(8972);
                c8806.m22742().receive(datagramPacket);
                if (c8806.m22750() || c8806.m22741() || c8806.m22759() || c8806.isClosed()) {
                    break;
                }
                try {
                    InetAddress inetAddress = c8806.m22739().f23908;
                    boolean z = false;
                    if (inetAddress != null && (address = datagramPacket.getAddress()) != null) {
                        if ((inetAddress.isLinkLocalAddress() || inetAddress.isMCLinkLocal()) && !address.isLinkLocalAddress()) {
                            z = true;
                        }
                        if (address.isLoopbackAddress() && !inetAddress.isLoopbackAddress()) {
                            z = true;
                        }
                    }
                    if (!z) {
                        C11254 c11254 = new C11254(datagramPacket);
                        if (c11254.m42650()) {
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7090("{}.run() JmDNS in:{}", getName(), c11254.m27849());
                            }
                            if (c11254.m42653()) {
                                int port = datagramPacket.getPort();
                                int i = C13038.f39044;
                                if (port != i) {
                                    c8806.m22746(c11254, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                c8806.m22746(c11254, c8806.m22764(), i);
                            } else {
                                c8806.m22726(c11254);
                            }
                        } else if (interfaceC2148.mo7086()) {
                            interfaceC2148.mo7082("{}.run() JmDNS in message with error code: {}", getName(), c11254.m27849());
                        }
                    }
                } catch (IOException e) {
                    interfaceC2148.mo7083(getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!c8806.m22750() && !c8806.m22741() && !c8806.m22759() && !c8806.isClosed()) {
                interfaceC2148.mo7083(getName() + ".run() exception ", (Throwable) e2);
                c8806.m22754();
            }
        }
        interfaceC2148.mo7095(getName(), "{}.run() exiting.");
    }
}
