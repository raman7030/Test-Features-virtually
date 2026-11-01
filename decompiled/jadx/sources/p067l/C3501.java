package p067l;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: l.֨ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18M5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3501 extends AbstractC4648 {

    /* JADX INFO: renamed from: ۖ */
    public Uri f7068;

    /* JADX INFO: renamed from: ۜ */
    public final DatagramPacket f7069;

    /* JADX INFO: renamed from: ۡ */
    public DatagramSocket f7070;

    /* JADX INFO: renamed from: ۢ */
    public int f7071;

    /* JADX INFO: renamed from: ܳ */
    public MulticastSocket f7072;

    /* JADX INFO: renamed from: ܺ */
    public final int f7073;

    /* JADX INFO: renamed from: ܿ */
    public InetAddress f7074;

    /* JADX INFO: renamed from: ᩷ */
    public final byte[] f7075;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f7076;

    public C3501() {
        super(true);
        this.f7073 = 8000;
        byte[] bArr = new byte[2000];
        this.f7075 = bArr;
        this.f7069 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws C7525 {
        Uri uri = c5318.f12514;
        this.f7068 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f7068.getPort();
        m9837(c5318);
        try {
            this.f7074 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f7074, port);
            if (this.f7074.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f7072 = multicastSocket;
                multicastSocket.joinGroup(this.f7074);
                this.f7070 = this.f7072;
            } else {
                this.f7070 = new DatagramSocket(inetSocketAddress);
            }
            this.f7070.setSoTimeout(this.f7073);
            this.f7076 = true;
            m9839(c5318);
            return -1L;
        } catch (IOException e) {
            throw new C7525(2001, e);
        } catch (SecurityException e2) {
            throw new C7525(2006, e2);
        }
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws C7525 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f7071;
        DatagramPacket datagramPacket = this.f7069;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f7070;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f7071 = length;
                m9840(length);
            } catch (SocketTimeoutException e) {
                throw new C7525(2002, e);
            } catch (IOException e2) {
                throw new C7525(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f7071;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f7075, length2 - i4, bArr, i, iMin);
        this.f7071 -= iMin;
        return iMin;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        return this.f7068;
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        this.f7068 = null;
        MulticastSocket multicastSocket = this.f7072;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f7074;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f7072 = null;
        }
        DatagramSocket datagramSocket = this.f7070;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7070 = null;
        }
        this.f7074 = null;
        this.f7071 = 0;
        if (this.f7076) {
            this.f7076 = false;
            m9838();
        }
    }
}
