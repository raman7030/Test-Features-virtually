package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6TK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15671 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10130 m36879(C5131 c5131) {
        C10130 c10130 = new C10130(128);
        c10130.writeInt(2);
        c10130.writeInt(c5131.m14689().ordinal());
        c10130.writeInt(c5131.m14692().ordinal());
        c10130.writeInt(c5131.m14685() == null ? 0 : 1);
        c10130.writeInt(c5131.m14681());
        c10130.m25431(c5131.m14693());
        c10130.m25431(c5131.m14687());
        c10130.writeInt(c5131.m14688());
        c10130.writeInt(c5131.m14694() ? 1 : 0);
        byte[] bArrM14684 = c5131.m14684();
        c10130.write(bArrM14684, 0, bArrM14684.length);
        m36880(c10130, c5131.m14690());
        if (c5131.m14685() != null) {
            m36880(c10130, c5131.m14685().m18433());
            m36880(c10130, c5131.m14685().m18432());
            c10130.m25431(c5131.m14685().m18431());
            c10130.writeInt(c5131.m14685().m18434() ? 1 : 0);
        }
        if (c10130.size() <= 4096) {
            return c10130;
        }
        throw new IllegalArgumentException("Load checkpoint exceeds record limit");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5131 m36878(byte[] bArr) throws IOException {
        if (bArr.length > 4096) {
            throw new IOException("Load checkpoint exceeds record limit");
        }
        try {
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 2) {
                throw new IOException("Unsupported load checkpoint version");
            }
            int i = c12951.readInt();
            int i2 = c12951.readInt();
            if (i < 0 || i >= EnumC0191.values().length || i2 < 0 || i2 >= EnumC19243.values().length) {
                throw new IOException("Invalid load checkpoint status");
            }
            boolean zM36881 = m36881(c12951);
            int i3 = c12951.readInt();
            long j = c12951.readLong();
            long j2 = c12951.readLong();
            int i4 = c12951.readInt();
            boolean zM36882 = m36881(c12951);
            byte[] bArr2 = new byte[32];
            c12951.m31489(32, bArr2);
            String strM36877 = m36877(c12951, 80);
            C6788 c6788 = zM36881 ? new C6788(m36877(c12951, 1024), m36877(c12951, 512), c12951.readLong(), m36881(c12951)) : null;
            if (c12951.available() != 0) {
                throw new IOException("Trailing load checkpoint bytes");
            }
            return new C5131(EnumC0191.values()[i], EnumC19243.values()[i2], c6788, strM36877, i3, j, j2, bArr2, i4, zM36882);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new IOException("Invalid load checkpoint", e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new IOException("Invalid load checkpoint", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36881(C12951 c12951) throws IOException {
        int i = c12951.readInt();
        if (i == 0 || i == 1) {
            return i == 1;
        }
        throw new IOException("Invalid load checkpoint flag");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36880(C10130 c10130, String str) {
        c10130.writeInt(str.length());
        for (int i = 0; i < str.length(); i++) {
            c10130.mo13229((short) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36877(C12951 c12951, int i) throws IOException {
        int i2 = c12951.readInt();
        if (i2 < 0 || i2 > i || i2 > c12951.available() / 2) {
            throw new IOException("Invalid load checkpoint string length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) c12951.readShort();
        }
        return new String(cArr);
    }
}
