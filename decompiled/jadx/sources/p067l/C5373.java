package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;

/* JADX INFO: renamed from: l.ۗۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A16 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5373 extends Thread {

    /* JADX INFO: renamed from: ᩹ */
    public static InterfaceC4410 f12753 = C13128.m30023(C5373.class.getName());

    /* JADX INFO: renamed from: ᩸ */
    public final C10738 f12754;

    public C5373(C10738 c10738) {
        super("SocketListener(" + c10738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        setDaemon(true);
        this.f12754 = c10738;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InetAddress address;
        InterfaceC4410 interfaceC4410 = f12753;
        C10738 c10738 = this.f12754;
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!c10738.m24720() && !c10738.m24711()) {
                datagramPacket.setLength(8972);
                c10738.m24712().receive(datagramPacket);
                if (c10738.m24720() || c10738.m24711() || c10738.m24729() || c10738.isClosed()) {
                    break;
                }
                try {
                    InetAddress inetAddress = c10738.m24709().f26821;
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
                        C13065 c13065 = new C13065(datagramPacket);
                        if (c13065.m44911()) {
                            if (interfaceC4410.mo9194()) {
                                interfaceC4410.mo9185("{}.run() JmDNS in:{}", getName(), c13065.m29911());
                            }
                            if (c13065.m44914()) {
                                int port = datagramPacket.getPort();
                                int i = C14760.f42090;
                                if (port != i) {
                                    c10738.m24716(c13065, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                c10738.m24716(c13065, c10738.m24734(), i);
                            } else {
                                c10738.m24696(c13065);
                            }
                        } else if (interfaceC4410.mo9181()) {
                            interfaceC4410.mo9177("{}.run() JmDNS in message with error code: {}", getName(), c13065.m29911());
                        }
                    }
                } catch (IOException e) {
                    interfaceC4410.mo9178(getName() + ".run() exception ", (Throwable) e);
                }
            }
        } catch (IOException e2) {
            if (!c10738.m24720() && !c10738.m24711() && !c10738.m24729() && !c10738.isClosed()) {
                interfaceC4410.mo9178(getName() + ".run() exception ", (Throwable) e2);
                c10738.m24724();
            }
        }
        interfaceC4410.mo9190(getName(), "{}.run() exiting.");
    }
}
