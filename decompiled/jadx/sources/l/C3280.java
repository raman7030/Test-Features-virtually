package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6SW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3280 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Byte f10319;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f10320;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f10321;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f10322;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f10323;

    public C3280(boolean z, boolean z2, String str, String str2, Byte b) {
        this.f10322 = z;
        this.f10323 = z2;
        this.f10321 = str;
        this.f10320 = str2;
        this.f10319 = b;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3280 m10089(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Byte bValueOf;
        C23930 c23930M52696 = C23930.m52696(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy search exceeds app state limit");
            }
            boolean zM52703 = c23930M52696.m52703();
            boolean zM52704 = c23930M52696.m52703();
            String strM52708 = c23930M52696.m52708(i);
            String strM52709 = c23930M52696.m52708(i);
            if (c23930M52696.m52707() == 0) {
                bValueOf = null;
            } else {
                if (c23930M52696.m52707() != 3 || c23930M52696.m52704() != 29298) {
                    throw new IOException("Invalid legacy search parameter trailer");
                }
                bValueOf = Byte.valueOf((byte) c23930M52696.readByte());
            }
            c23930M52696.m52709();
            C3280 c3280 = new C3280(zM52703, zM52704, strM52708, strM52709, bValueOf);
            c23930M52696.close();
            return c3280;
        } catch (Throwable th) {
            try {
                c23930M52696.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3280 m10090(C12951 c12951) {
        Byte bValueOf;
        boolean zM31498 = c12951.m31498();
        boolean zM31499 = c12951.m31498();
        String strM31504 = c12951.m31504();
        String strM31505 = c12951.m31504();
        if (c12951.available() < 3 || c12951.m31501() != 29298) {
            bValueOf = null;
        } else {
            c12951.skipBytes(2);
            bValueOf = Byte.valueOf(c12951.readByte());
        }
        return new C3280(zM31498, zM31499, strM31504, strM31505, bValueOf);
    }
}
