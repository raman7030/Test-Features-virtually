package l;

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
public final class C1192 extends AbstractC2399 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Uri f4299;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f4300;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public DatagramSocket f4301;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f4302;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public MulticastSocket f4303;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f4304;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InetAddress f4305;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f4306;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f4307;

    public C1192() {
        super(true);
        this.f4304 = 8000;
        byte[] bArr = new byte[2000];
        this.f4306 = bArr;
        this.f4300 = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws C5426 {
        Uri uri = c3104.f9711;
        this.f4299 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f4299.getPort();
        m7774(c3104);
        try {
            this.f4305 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4305, port);
            if (this.f4305.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4303 = multicastSocket;
                multicastSocket.joinGroup(this.f4305);
                this.f4301 = this.f4303;
            } else {
                this.f4301 = new DatagramSocket(inetSocketAddress);
            }
            this.f4301.setSoTimeout(this.f4304);
            this.f4307 = true;
            m7776(c3104);
            return -1L;
        } catch (IOException e) {
            throw new C5426(2001, e);
        } catch (SecurityException e2) {
            throw new C5426(2006, e2);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws C5426 {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f4302;
        DatagramPacket datagramPacket = this.f4300;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f4301;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f4302 = length;
                m7777(length);
            } catch (SocketTimeoutException e) {
                throw new C5426(2002, e);
            } catch (IOException e2) {
                throw new C5426(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f4302;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.f4306, length2 - i4, bArr, i, iMin);
        this.f4302 -= iMin;
        return iMin;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        return this.f4299;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f4299 = null;
        MulticastSocket multicastSocket = this.f4303;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f4305;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f4303 = null;
        }
        DatagramSocket datagramSocket = this.f4301;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4301 = null;
        }
        this.f4305 = null;
        this.f4302 = 0;
        if (this.f4307) {
            this.f4307 = false;
            m7775();
        }
    }
}
