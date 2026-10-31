package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3678 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11207(C15007 c15007, C10130 c10130) {
        int size = c10130.size();
        c10130.writeInt(827544404);
        c10130.m25436();
        c10130.m25431(c15007.f45764);
        C12704 c12704 = c15007.f45762;
        c10130.m25431(c12704.m30979());
        c10130.m25434(c15007.f45763.f7359);
        C19761 c19761 = new C19761(c10130);
        c19761.m45459(c12704.m32420());
        C2309 c2309 = c15007.f45765;
        c10130.writeInt(c2309.f7443.m14642());
        c10130.writeInt(c2309.f7443.m14640());
        c10130.m25431(c2309.f7440);
        c10130.m25431(c2309.f7444);
        c10130.m25431(c2309.f7442);
        C9611 c9611 = c2309.f7441;
        c10130.m25431(c9611.f29154);
        c10130.writeByte(c9611.f29153 ? 1 : 0);
        m11208(c9611.f29156, c19761, c10130);
        m11208(c9611.f29155, c19761, c10130);
        c10130.m25418();
        c10130.writeInt(C1829.m6061(size, c10130.size() - size, c10130.m25438()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11208(C15713 c15713, C19761 c19761, C10130 c10130) {
        c10130.writeInt(c15713.m37046());
        Iterator it = c15713.iterator();
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return;
            }
            C8905 c8905 = (C8905) c20654.next();
            long j = c8905.f27082;
            C15713 c15714 = c8905.f27081;
            c10130.m25431(j);
            c10130.m25431(c8905.f27083);
            c10130.writeByte(c8905.f27084 == EnumC14051.USER ? 0 : 1);
            c10130.writeInt(c15714.m37046());
            Iterator it2 = c15714.iterator();
            while (true) {
                C20654 c20655 = (C20654) it2;
                if (c20655.hasNext()) {
                    C23224 c23224 = (C23224) c20655.next();
                    int i = c23224.f74637;
                    C5089 c5089 = c23224.f74643;
                    c10130.writeInt(i);
                    c10130.m25431(c23224.f74640);
                    c10130.m25431(c23224.f74638);
                    c10130.writeInt(c5089.m14642());
                    c10130.writeInt(c5089.m14640());
                    c19761.m45459(c23224.f74639);
                    c19761.m45459(c23224.f74636);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0139 A[Catch: all -> 0x0134, TRY_ENTER, TryCatch #1 {all -> 0x0134, blocks: (B:22:0x0072, B:24:0x00a1, B:26:0x00ab, B:28:0x00b5, B:30:0x00e0, B:34:0x00ee, B:35:0x00f3, B:36:0x00fa, B:37:0x010a, B:59:0x0139, B:60:0x013c, B:45:0x011e, B:46:0x0125, B:47:0x0126, B:48:0x012a, B:49:0x012b, B:50:0x012f), top: B:71:0x0072 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15007 m11205(C12951 c12951) {
        C12704 c12704;
        int iM31488 = c12951.m31488();
        if (c12951.available() < 12 || c12951.readInt() != 827544404) {
            throw m11204();
        }
        int i = c12951.readInt();
        if (i < 0 || i > c12951.available() - 4) {
            throw m11204();
        }
        byte[] bArr = new byte[i];
        c12951.m31489(i, bArr);
        if (c12951.readInt() != C1829.m6061(iM31488, i + 8, c12951.f38849)) {
            throw m11204();
        }
        C12951 c12952 = new C12951(bArr);
        long j = c12952.readLong();
        long j2 = c12952.readLong();
        int i2 = c12952.readInt();
        if (j < 0 || j2 < 0 || i2 < 0 || i2 > 8192 || i2 > c12952.available()) {
            throw m11204();
        }
        byte[] bArr2 = new byte[i2];
        c12952.m31489(i2, bArr2);
        C2267 c2267M7494 = C2267.m7494(null, bArr2);
        try {
            try {
                C19055 c19055 = new C19055(c12952);
                C11999 c11999M43914 = c19055.m43914();
                C5089 c5089 = new C5089(c12952.readInt(), c12952.readInt());
                long j3 = c12952.readLong();
                long j4 = c12952.readLong();
                long j5 = c12952.readLong();
                long j6 = c12952.readLong();
                int i3 = c12952.readByte() & 255;
                if (i3 > 1 || c5089.m14642() > c11999M43914.m29347() || c5089.m14640() > c11999M43914.m29347()) {
                    throw m11204();
                }
                HashSet hashSet = new HashSet();
                C15713 c15713M11206 = m11206(c12952, c19055, hashSet, j6, j4);
                C15713 c15713M11207 = m11206(c12952, c19055, hashSet, j6, j4);
                if (c12952.available() != 0) {
                    throw m11204();
                }
                C9611 c9611 = new C9611(c15713M11206, c15713M11207, j6, i3 == 1);
                try {
                    C14260.m33906(c9611, c11999M43914.m29347());
                    C2309 c2309 = new C2309(c9611, c5089, j3, j4, j5);
                    c12704 = new C12704(c11999M43914, j2);
                    try {
                        C15007 c15007 = new C15007(c12704, c2267M7494, c2309, C5131.f16061, j);
                        c2267M7494.close();
                        return c15007;
                    } catch (Error e) {
                        e = e;
                        if (c12704 != null) {
                            c12704.close();
                        }
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        if (c12704 != null) {
                            c12704.close();
                        }
                        throw e;
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException("Invalid session history", e3);
                }
            } catch (Throwable th) {
                c2267M7494.close();
                throw th;
            }
        } catch (Error | RuntimeException e4) {
            e = e4;
            c12704 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15713 m11206(C12951 c12951, C19055 c19055, HashSet hashSet, long j, long j2) {
        int i = c12951.readInt();
        if (i < 0 || i > c12951.available() / 21) {
            throw m11204();
        }
        C15713 c15713 = new C15713();
        for (int i2 = 0; i2 < i; i2++) {
            long j3 = c12951.readLong();
            long j4 = c12951.readLong();
            int i3 = c12951.readByte() & 255;
            int i4 = c12951.readInt();
            if (j3 <= 0 || j3 >= j || !hashSet.add(Long.valueOf(j3)) || i3 > 1 || i4 <= 0 || i4 > c12951.available() / 52) {
                throw m11204();
            }
            C15713 c15714 = new C15713();
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = c12951.readInt();
                long j5 = c12951.readLong();
                long j6 = c12951.readLong();
                C5089 c5089 = new C5089(c12951.readInt(), c12951.readInt());
                if (j5 < 0 || j6 < 0 || j5 > j2 || j6 > j2) {
                    throw m11204();
                }
                c15714 = c15714.m37044(new C23224(i6, j5, j6, c5089, c19055.m43914(), c19055.m43914()));
            }
            c15713 = c15713.m37044(new C8905(j3, j4, i3 == 0 ? EnumC14051.USER : EnumC14051.BATCH, c15714));
        }
        return c15713;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m11204() {
        return new IllegalArgumentException("Invalid inline session state");
    }
}
