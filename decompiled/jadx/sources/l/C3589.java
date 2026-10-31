package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: l.ۘ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3589 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f11383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f11384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11385;

    public C3589(InetAddress inetAddress, int i) {
        int iMax = Math.max(0, Math.min(32, i));
        this.f11385 = iMax;
        int i2 = iMax != 0 ? (int) (4294967295 << (32 - iMax)) : 0;
        this.f11383 = i2;
        this.f11384 = C19112.m44052(inetAddress) & i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10985(InetAddress inetAddress) {
        return (inetAddress instanceof Inet4Address) && (C19112.m44052(inetAddress) & this.f11383) == this.f11384;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InetAddress m10984() {
        int i = this.f11385;
        if (i == 0 || i >= 31) {
            return null;
        }
        int i2 = (~this.f11383) | this.f11384;
        int i3 = C19112.f60206;
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
