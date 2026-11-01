package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C19275 {

    /* JADX INFO: renamed from: ֫ */
    public final C19137 f57601;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C15921 f57603;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f57604 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f57602 = new HashMap();

    public C19275(C15921 c15921, C19137 c19137) {
        this.f57603 = c15921;
        this.f57601 = c19137;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12570 m43921(long j, long j2) {
        C9490 c9490M51153;
        int i;
        this.f57603.f46041.run();
        if (j < 64 || j >= j2) {
            throw new IOException("Invalid history reference");
        }
        synchronized (this.f57603.f46042.f72073.f6922) {
            c9490M51153 = this.f57603.f46042.m51153(j);
        }
        if (c9490M51153.f25995 != 5 || (i = c9490M51153.f25994) < 4 || i > 72 || 32 + j + ((long) i) + 16 > j2 || c9490M51153.f25992 >= this.f57601.f57138) {
            throw new IOException("Invalid history frame boundary");
        }
        C7479 c7479M6162 = this.f57603.f46042.f72073.m6162(((long) c9490M51153.f25994) + 16);
        try {
            return new C12570(new C14677(this.f57603.f46042.m51149(j, c9490M51153)), c9490M51153.f25994, c7479M6162);
        } catch (IOException | Error | RuntimeException e) {
            c7479M6162.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11269 m43918(int i, long j, long j2, boolean z) throws IOException {
        C11269 c11269;
        if (j == 0) {
            return null;
        }
        if (i > 46) {
            throw new IOException("Invalid history sequence depth");
        }
        C12570 c12570M43921 = m43921(j, j2);
        try {
            int i2 = c12570M43921.f35321.readInt();
            if (i2 != (z ? 2 : 4)) {
                if (i2 != (z ? 3 : 5)) {
                    throw new IOException("Invalid history sequence type");
                }
            }
            Object objM43916 = m43916(i2, j);
            if (objM43916 != null) {
                C11269 c112610 = (C11269) objM43916;
                c12570M43921.close();
                return c112610;
            }
            this.f57601.m43538();
            if (i2 == 2 || i2 == 4) {
                if (c12570M43921.f35320 != 12) {
                    throw new IOException("Invalid history sequence leaf");
                }
                long j3 = c12570M43921.f35321.readLong();
                c11269 = new C11269(z ? m43922(j3, j) : m43919(j3, j));
            } else {
                if (c12570M43921.f35320 != 28) {
                    throw new IOException("Invalid history sequence branch");
                }
                int i3 = c12570M43921.f35321.readInt();
                int i4 = c12570M43921.f35321.readInt();
                long j4 = c12570M43921.f35321.readLong();
                long j5 = c12570M43921.f35321.readLong();
                if (i3 < 2 || i3 > 46 || i4 < 2 || j4 == 0 || j5 == 0) {
                    throw new IOException("Invalid history sequence metadata");
                }
                if (i4 > this.f57601.f57137) {
                    throw new C15524("History logical size limit exceeded");
                }
                int i5 = i + 1;
                C11269 c11269M43918 = m43918(i5, j4, j, z);
                C11269 c11269M43919 = m43918(i5, j5, j, z);
                if (Math.abs(c11269M43918.f31387 - c11269M43919.f31387) > 1 || i3 != Math.max(c11269M43918.f31387, c11269M43919.f31387) + 1 || ((long) c11269M43918.f31393) + ((long) c11269M43919.f31393) != i4) {
                    throw new IOException("Invalid history sequence balance");
                }
                c11269 = new C11269(c11269M43918, c11269M43919);
            }
            c11269.f31391 = this.f57603.f46042;
            c11269.f31392 = j;
            this.f57604.put(Long.valueOf(j), new C18604(i2, c11269));
            c12570M43921.close();
            return c11269;
        } catch (Throwable th) {
            try {
                c12570M43921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C10832 m43922(long j, long j2) {
        C12570 c12570M43921 = m43921(j, j2);
        try {
            C14677 c14677 = c12570M43921.f35321;
            if (c14677.readInt() != 6 || c12570M43921.f35320 != 36) {
                throw new IOException("Invalid history record shape");
            }
            Object objM43916 = m43916(6, j);
            if (objM43916 != null) {
                C10832 c10832 = (C10832) objM43916;
                c12570M43921.close();
                return c10832;
            }
            this.f57601.m43538();
            long j3 = c14677.readLong();
            long j4 = c14677.readLong();
            int i = c14677.readInt();
            long j5 = c14677.readLong();
            int i2 = c14677.readInt();
            if (j3 <= 0 || i < 0 || i > 1 || i2 <= 0) {
                throw new IOException("Invalid history record metadata");
            }
            if (i2 <= this.f57601.f57137) {
                C17302 c17302 = new C17302(m43918(0, j5, j, false));
                if (c17302.m39213() != i2) {
                    throw new IOException("History change count mismatch");
                }
                C10832 c10833 = new C10832(j3, j4, i == 0 ? EnumC15723.USER : EnumC15723.BATCH, c17302);
                c10833.f30008 = this.f57603.f46042;
                c10833.f30009 = j;
                this.f57604.put(Long.valueOf(j), new C18604(6, c10833));
                c12570M43921.close();
                return c10833;
            }
            throw new C15524("History change count limit exceeded");
        } catch (Throwable th) {
            try {
                c12570M43921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24441 m43919(long j, long j2) {
        C12570 c12570M43921 = m43921(j, j2);
        try {
            C14677 c14677 = c12570M43921.f35321;
            if (c14677.readInt() != 7 || c12570M43921.f35320 != 72) {
                throw new IOException("Invalid history change shape");
            }
            Object objM43916 = m43916(7, j);
            if (objM43916 != null) {
                C24441 c24441 = (C24441) objM43916;
                c12570M43921.close();
                return c24441;
            }
            this.f57601.m43538();
            int i = c14677.readInt();
            long j3 = c14677.readLong();
            long j4 = c14677.readLong();
            C7205 c7205M43917 = m43917(c14677);
            C13773 c13773M37373 = this.f57603.f46043.m37373(c14677.readLong(), j, c14677.readInt(), c14677.readInt(), c14677.readInt(), this.f57601);
            C13773 c13773M37374 = this.f57603.f46043.m37373(c14677.readLong(), j, c14677.readInt(), c14677.readInt(), c14677.readInt(), this.f57601);
            if (i >= 0) {
                long j5 = i;
                if (((long) c13773M37373.m31402()) + j5 <= 2147483647L && j5 + ((long) c13773M37374.m31402()) <= 2147483647L && j3 >= 0 && j4 >= 0) {
                    C24441 c24442 = new C24441(i, j3, j4, c7205M43917, c13773M37373, c13773M37374);
                    c24442.f77384 = this.f57603.f46042;
                    c24442.f77385 = j;
                    this.f57604.put(Long.valueOf(j), new C18604(7, c24442));
                    c12570M43921.close();
                    return c24442;
                }
            }
            throw new IOException("Invalid history change metadata");
        } catch (Throwable th) {
            try {
                c12570M43921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7205 m43917(C14677 c14677) throws IOException {
        final int i = c14677.readInt();
        final int i2 = c14677.readInt();
        if (i < -1 || i2 < -1) {
            throw new IOException("Invalid history selection");
        }
        return (C7205) C15525.computeIfAbsent(this.f57602, Long.valueOf((((long) i) << 32) | (((long) i2) & 4294967295L)), new Function() { // from class: l.ܽۗᩳ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new C7205(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m43916(int i, long j) throws IOException {
        C18604 c18604 = (C18604) this.f57604.get(Long.valueOf(j));
        if (c18604 == null) {
            return null;
        }
        if (c18604.f55569 != i) {
            throw new IOException("Conflicting history reference types");
        }
        return c18604.f55570;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43920(C17302 c17302, C17302 c17303, long j, long j2) throws IOException {
        long jM39213 = ((long) c17302.m39213()) + ((long) c17303.m39213());
        C19137 c19137 = this.f57601;
        if (jM39213 > c19137.f57137) {
            throw new C15524("History record count limit exceeded");
        }
        HashSet hashSet = new HashSet();
        int iM25047 = 0;
        Object[] objArr = {c17302, c17303};
        ArrayList arrayList = new ArrayList(2);
        while (iM25047 < 2) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        Iterator it = C21562.unmodifiableList(arrayList).iterator();
        long jM39214 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((C17302) it.next()).iterator();
            while (true) {
                C21998 c21998 = (C21998) it2;
                if (c21998.hasNext()) {
                    C10832 c10832 = (C10832) c21998.next();
                    long j3 = c10832.f30005;
                    C17302 c17304 = c10832.f30004;
                    if (j3 >= j || !hashSet.add(Long.valueOf(j3))) {
                        throw new IOException("Invalid history record identity");
                    }
                    jM39214 += (long) c17304.m39213();
                    if (jM39214 > c19137.f57137) {
                        throw new C15524("History replay size limit exceeded");
                    }
                    Iterator it3 = c17304.iterator();
                    while (true) {
                        C21998 c21999 = (C21998) it3;
                        if (c21999.hasNext()) {
                            C24441 c24441 = (C24441) c21999.next();
                            this.f57603.f46041.run();
                            if (c24441.f77383 > j2 || c24441.f77381 > j2) {
                                throw new IOException("Invalid historical edit mark");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43915(C17302 c17302, int i, boolean z, Runnable runnable) throws IOException {
        Iterator c21998;
        c17302.getClass();
        C21998 c21999 = new C21998(c17302, true);
        while (c21999.hasNext()) {
            C17302 c17303 = ((C10832) c21999.next()).f30004;
            if (!z) {
                c17303.getClass();
                c21998 = new C21998(c17303, true);
            } else {
                c21998 = c17303.iterator();
            }
            while (true) {
                C21998 c219910 = (C21998) c21998;
                if (c219910.hasNext()) {
                    runnable.run();
                    C24441 c24441 = (C24441) c219910.next();
                    C13773 c13773 = c24441.f77379;
                    C13773 c13774 = c24441.f77382;
                    C7205 c7205 = c24441.f77386;
                    if (z && (c7205.m16550() > i || c7205.m16548() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                    int iM31402 = z ? c13774.m31402() : c13773.m31402();
                    int iM31403 = z ? c13773.m31402() : c13774.m31402();
                    int i2 = c24441.f77380;
                    if (i2 > i || iM31402 > i - i2) {
                        throw new IOException("History range exceeds replayed text");
                    }
                    long j = (((long) i) - ((long) iM31402)) + ((long) iM31403);
                    if (j > 2147483647L) {
                        throw new IOException("History replay exceeds coordinate limit");
                    }
                    i = (int) j;
                    if (!z && (c7205.m16550() > i || c7205.m16548() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                }
            }
        }
    }
}
