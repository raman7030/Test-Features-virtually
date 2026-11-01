package p067l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۘ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5779 {

    /* JADX INFO: renamed from: ֫ */
    public final int f14187;

    /* JADX INFO: renamed from: ۧ */
    public final int f14188;

    /* JADX INFO: renamed from: ܽ */
    public final int f14189;

    public C5779(InetAddress inetAddress, int i) {
        int iMax = Math.max(0, Math.min(32, i));
        this.f14189 = iMax;
        int i2 = iMax != 0 ? (int) (4294967295 << (32 - iMax)) : 0;
        this.f14187 = i2;
        this.f14188 = C20532.m46346(inetAddress) & i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12961(InetAddress inetAddress) {
        return (inetAddress instanceof Inet4Address) && (C20532.m46346(inetAddress) & this.f14187) == this.f14188;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InetAddress m12960() {
        int i = this.f14189;
        if (i == 0 || i >= 31) {
            return null;
        }
        int i2 = (~this.f14187) | this.f14188;
        int i3 = C20532.f63438;
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
