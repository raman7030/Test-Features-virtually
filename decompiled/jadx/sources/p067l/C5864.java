package p067l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C5864 {
    /* JADX INFO: renamed from: ֫ */
    public static void m13167(C16631 c16631, C11996 c11996) {
        int size = c11996.size();
        c11996.writeInt(827544404);
        c11996.m27456();
        c11996.m27451(c16631.f48877);
        C14443 c14443 = c16631.f48875;
        c11996.m27451(c14443.m33057());
        c11996.m27454(c16631.f48876.f10147);
        C21150 c21150 = new C21150(c11996);
        c21150.m47766(c14443.m34522());
        C4563 c4563 = c16631.f48878;
        c11996.writeInt(c4563.f10229.m16550());
        c11996.writeInt(c4563.f10229.m16548());
        c11996.m27451(c4563.f10226);
        c11996.m27451(c4563.f10230);
        c11996.m27451(c4563.f10228);
        C11503 c11503 = c4563.f10227;
        c11996.m27451(c11503.f32101);
        c11996.writeByte(c11503.f32100 ? 1 : 0);
        m13168(c11503.f32103, c21150, c11996);
        m13168(c11503.f32102, c21150, c11996);
        c11996.m27438();
        c11996.writeInt(C4107.m8259(size, c11996.size() - size, c11996.m27458()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13168(C17302 c17302, C21150 c21150, C11996 c11996) {
        c11996.writeInt(c17302.m39213());
        Iterator it = c17302.iterator();
        while (true) {
            C21998 c21998 = (C21998) it;
            if (!c21998.hasNext()) {
                return;
            }
            C10832 c10832 = (C10832) c21998.next();
            long j = c10832.f30005;
            C17302 c17303 = c10832.f30004;
            c11996.m27451(j);
            c11996.m27451(c10832.f30006);
            c11996.writeByte(c10832.f30007 == EnumC15723.USER ? 0 : 1);
            c11996.writeInt(c17303.m39213());
            Iterator it2 = c17303.iterator();
            while (true) {
                C21998 c21999 = (C21998) it2;
                if (c21999.hasNext()) {
                    C24441 c24441 = (C24441) c21999.next();
                    int i = c24441.f77380;
                    C7205 c7205 = c24441.f77386;
                    c11996.writeInt(i);
                    c11996.m27451(c24441.f77383);
                    c11996.m27451(c24441.f77381);
                    c11996.writeInt(c7205.m16550());
                    c11996.writeInt(c7205.m16548());
                    c21150.m47766(c24441.f77382);
                    c21150.m47766(c24441.f77379);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:22:0x0072, B:24:0x00a1, B:26:0x00ab, B:28:0x00b5, B:30:0x00e0, B:34:0x00ee, B:35:0x00f3, B:36:0x00fa, B:37:0x010a, B:59:0x0139, B:60:0x013c, B:45:0x011e, B:46:0x0125, B:47:0x0126, B:48:0x012a, B:49:0x012b, B:50:0x012f), top: B:71:0x0072 }] */
    /* JADX INFO: renamed from: ֫ */
    public static C16631 m13165(C14677 c14677) {
        C14443 c14443;
        int iM33575 = c14677.m33575();
        if (c14677.available() < 12 || c14677.readInt() != 827544404) {
            throw m13164();
        }
        int i = c14677.readInt();
        if (i < 0 || i > c14677.available() - 4) {
            throw m13164();
        }
        byte[] bArr = new byte[i];
        c14677.m33576(i, bArr);
        if (c14677.readInt() != C4107.m8259(iM33575, i + 8, c14677.f41893)) {
            throw m13164();
        }
        C14677 c14678 = new C14677(bArr);
        long j = c14678.readLong();
        long j2 = c14678.readLong();
        int i2 = c14678.readInt();
        if (j < 0 || j2 < 0 || i2 < 0 || i2 > 8192 || i2 > c14678.available()) {
            throw m13164();
        }
        byte[] bArr2 = new byte[i2];
        c14678.m33576(i2, bArr2);
        C4523 c4523M9576 = C4523.m9576(null, bArr2);
        try {
            try {
                C20479 c20479 = new C20479(c14678);
                C13773 c13773M46183 = c20479.m46183();
                C7205 c7205 = new C7205(c14678.readInt(), c14678.readInt());
                long j3 = c14678.readLong();
                long j4 = c14678.readLong();
                long j5 = c14678.readLong();
                long j6 = c14678.readLong();
                int i3 = c14678.readByte() & 255;
                if (i3 > 1 || c7205.m16550() > c13773M46183.m31402() || c7205.m16548() > c13773M46183.m31402()) {
                    throw m13164();
                }
                HashSet hashSet = new HashSet();
                C17302 c17302M13166 = m13166(c14678, c20479, hashSet, j6, j4);
                C17302 c17302M13167 = m13166(c14678, c20479, hashSet, j6, j4);
                if (c14678.available() != 0) {
                    throw m13164();
                }
                C11503 c11503 = new C11503(c17302M13166, c17302M13167, j6, i3 == 1);
                try {
                    C15921.m36039(c11503, c13773M46183.m31402());
                    C4563 c4563 = new C4563(c11503, c7205, j3, j4, j5);
                    c14443 = new C14443(c13773M46183, j2);
                    try {
                        C16631 c16631 = new C16631(c14443, c4523M9576, c4563, C7245.f18895, j);
                        c4523M9576.close();
                        return c16631;
                    } catch (Error e) {
                        e = e;
                        if (c14443 != null) {
                            c14443.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c14443 != null) {
                            c14443.close();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Invalid session history", e3);
                }
            } catch (Throwable th) {
                c4523M9576.close();
                throw th;
            }
        } catch (Error | RuntimeException e4) {
            e = e4;
            c14443 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17302 m13166(C14677 c14677, C20479 c20479, HashSet hashSet, long j, long j2) {
        int i = c14677.readInt();
        if (i < 0 || i > c14677.available() / 21) {
            throw m13164();
        }
        C17302 c17302 = new C17302();
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = c14677.readLong();
            long j4 = c14677.readLong();
            int i3 = c14677.readByte() & 255;
            int i4 = c14677.readInt();
            if (j3 <= 0 || j3 >= j || !hashSet.add(Long.valueOf(j3)) || i3 > 1 || i4 <= 0 || i4 > c14677.available() / 52) {
                throw m13164();
            }
            C17302 c17303 = new C17302();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = c14677.readInt();
                long j5 = c14677.readLong();
                long j6 = c14677.readLong();
                C7205 c7205 = new C7205(c14677.readInt(), c14677.readInt());
                if (j5 < 0 || j6 < 0 || j5 > j2 || j6 > j2) {
                    throw m13164();
                }
                c17303 = c17303.m39211(new C24441(i6, j5, j6, c7205, c20479.m46183(), c20479.m46183()));
            }
            c17302 = c17302.m39211(new C10832(j3, j4, i3 == 0 ? EnumC15723.USER : EnumC15723.BATCH, c17303));
        }
        return c17302;
    }

    /* JADX INFO: renamed from: ֫ */
    public static IllegalArgumentException m13164() {
        return new IllegalArgumentException("Invalid inline session state");
    }
}
