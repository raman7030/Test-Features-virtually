package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6TK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17262 {
    /* JADX INFO: renamed from: ֫ */
    public static C11996 m39045(C7245 c7245) {
        C11996 c11996 = new C11996(128);
        c11996.writeInt(2);
        c11996.writeInt(c7245.m16597().ordinal());
        c11996.writeInt(c7245.m16600().ordinal());
        c11996.writeInt(c7245.m16593() == null ? 0 : 1);
        c11996.writeInt(c7245.m16589());
        c11996.m27451(c7245.m16601());
        c11996.m27451(c7245.m16595());
        c11996.writeInt(c7245.m16596());
        c11996.writeInt(c7245.m16602() ? 1 : 0);
        byte[] bArrM16592 = c7245.m16592();
        c11996.write(bArrM16592, 0, bArrM16592.length);
        m39046(c11996, c7245.m16598());
        if (c7245.m16593() != null) {
            m39046(c11996, c7245.m16593().m20381());
            m39046(c11996, c7245.m16593().m20380());
            c11996.m27451(c7245.m16593().m20379());
            c11996.writeInt(c7245.m16593().m20382() ? 1 : 0);
        }
        if (c11996.size() <= 4096) {
            return c11996;
        }
        throw new IllegalArgumentException("Load checkpoint exceeds record limit");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7245 m39044(byte[] bArr) throws IOException {
        if (bArr.length > 4096) {
            throw new IOException("Load checkpoint exceeds record limit");
        }
        try {
            C14677 c14677 = new C14677(bArr);
            if (c14677.readInt() != 2) {
                throw new IOException("Unsupported load checkpoint version");
            }
            int i = c14677.readInt();
            int i2 = c14677.readInt();
            if (i < 0 || i >= EnumC2550.values().length || i2 < 0 || i2 >= EnumC20657.values().length) {
                throw new IOException("Invalid load checkpoint status");
            }
            boolean zM39047 = m39047(c14677);
            int i3 = c14677.readInt();
            long j = c14677.readLong();
            long j2 = c14677.readLong();
            int i4 = c14677.readInt();
            boolean zM39048 = m39047(c14677);
            byte[] bArr2 = new byte[32];
            c14677.m33576(32, bArr2);
            String strM39043 = m39043(c14677, 80);
            C8820 c8820 = zM39047 ? new C8820(m39043(c14677, 1024), m39043(c14677, 512), c14677.readLong(), m39047(c14677)) : null;
            if (c14677.available() != 0) {
                throw new IOException("Trailing load checkpoint bytes");
            }
            return new C7245(EnumC2550.values()[i], EnumC20657.values()[i2], c8820, strM39043, i3, j, j2, bArr2, i4, zM39048);
        } catch (IllegalArgumentException e) {
            e = e;
            throw new IOException("Invalid load checkpoint", e);
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            throw new IOException("Invalid load checkpoint", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39047(C14677 c14677) throws IOException {
        int i = c14677.readInt();
        if (i == 0 || i == 1) {
            return i == 1;
        }
        throw new IOException("Invalid load checkpoint flag");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39046(C11996 c11996, String str) {
        c11996.writeInt(str.length());
        for (int i = 0; i < str.length(); i++) {
            c11996.mo15111((short) str.charAt(i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m39043(C14677 c14677, int i) throws IOException {
        int i2 = c14677.readInt();
        if (i2 < 0 || i2 > i || i2 > c14677.available() / 2) {
            throw new IOException("Invalid load checkpoint string length");
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) c14677.readShort();
        }
        return new String(cArr);
    }
}
