package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17789 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17643 f54408;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14260 f54410;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f54411 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f54409 = new HashMap();

    public C17789(C14260 c14260, C17643 c17643) {
        this.f54410 = c14260;
        this.f54408 = c17643;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10734 m41675(long j, long j2) {
        C7493 c7493M48806;
        int i;
        this.f54410.f42949.run();
        if (j < 64 || j >= j2) {
            throw new IOException("Invalid history reference");
        }
        synchronized (this.f54410.f42950.f69370.f4153) {
            c7493M48806 = this.f54410.f42950.m48806(j);
        }
        if (c7493M48806.f23083 != 5 || (i = c7493M48806.f23082) < 4 || i > 72 || 32 + j + ((long) i) + 16 > j2 || c7493M48806.f23080 >= this.f54408.f53945) {
            throw new IOException("Invalid history frame boundary");
        }
        C5377 c5377M3921 = this.f54410.f42950.f69370.m3921(((long) c7493M48806.f23082) + 16);
        try {
            return new C10734(new C12951(this.f54410.f42950.m48802(j, c7493M48806)), c7493M48806.f23082, c5377M3921);
        } catch (IOException | Error | RuntimeException e) {
            c5377M3921.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9365 m41672(int i, long j, long j2, boolean z) throws IOException {
        C9365 c9365;
        if (j == 0) {
            return null;
        }
        if (i > 46) {
            throw new IOException("Invalid history sequence depth");
        }
        C10734 c10734M41675 = m41675(j, j2);
        try {
            int i2 = c10734M41675.f32348.readInt();
            if (i2 != (z ? 2 : 4)) {
                if (i2 != (z ? 3 : 5)) {
                    throw new IOException("Invalid history sequence type");
                }
            }
            Object objM41670 = m41670(i2, j);
            if (objM41670 != null) {
                C9365 c9366 = (C9365) objM41670;
                c10734M41675.close();
                return c9366;
            }
            this.f54408.m41292();
            if (i2 == 2 || i2 == 4) {
                if (c10734M41675.f32347 != 12) {
                    throw new IOException("Invalid history sequence leaf");
                }
                long j3 = c10734M41675.f32348.readLong();
                c9365 = new C9365(z ? m41676(j3, j) : m41673(j3, j));
            } else {
                if (c10734M41675.f32347 != 28) {
                    throw new IOException("Invalid history sequence branch");
                }
                int i3 = c10734M41675.f32348.readInt();
                int i4 = c10734M41675.f32348.readInt();
                long j4 = c10734M41675.f32348.readLong();
                long j5 = c10734M41675.f32348.readLong();
                if (i3 < 2 || i3 > 46 || i4 < 2 || j4 == 0 || j5 == 0) {
                    throw new IOException("Invalid history sequence metadata");
                }
                if (i4 > this.f54408.f53944) {
                    throw new C13842("History logical size limit exceeded");
                }
                int i5 = i + 1;
                C9365 c9365M41672 = m41672(i5, j4, j, z);
                C9365 c9365M41673 = m41672(i5, j5, j, z);
                if (Math.abs(c9365M41672.f28438 - c9365M41673.f28438) > 1 || i3 != Math.max(c9365M41672.f28438, c9365M41673.f28438) + 1 || ((long) c9365M41672.f28444) + ((long) c9365M41673.f28444) != i4) {
                    throw new IOException("Invalid history sequence balance");
                }
                c9365 = new C9365(c9365M41672, c9365M41673);
            }
            c9365.f28442 = this.f54410.f42950;
            c9365.f28443 = j;
            this.f54411.put(Long.valueOf(j), new C17083(i2, c9365));
            c10734M41675.close();
            return c9365;
        } catch (Throwable th) {
            try {
                c10734M41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8905 m41676(long j, long j2) {
        C10734 c10734M41675 = m41675(j, j2);
        try {
            C12951 c12951 = c10734M41675.f32348;
            if (c12951.readInt() != 6 || c10734M41675.f32347 != 36) {
                throw new IOException("Invalid history record shape");
            }
            Object objM41670 = m41670(6, j);
            if (objM41670 != null) {
                C8905 c8905 = (C8905) objM41670;
                c10734M41675.close();
                return c8905;
            }
            this.f54408.m41292();
            long j3 = c12951.readLong();
            long j4 = c12951.readLong();
            int i = c12951.readInt();
            long j5 = c12951.readLong();
            int i2 = c12951.readInt();
            if (j3 <= 0 || i < 0 || i > 1 || i2 <= 0) {
                throw new IOException("Invalid history record metadata");
            }
            if (i2 <= this.f54408.f53944) {
                C15713 c15713 = new C15713(m41672(0, j5, j, false));
                if (c15713.m37046() != i2) {
                    throw new IOException("History change count mismatch");
                }
                C8905 c8906 = new C8905(j3, j4, i == 0 ? EnumC14051.USER : EnumC14051.BATCH, c15713);
                c8906.f27085 = this.f54410.f42950;
                c8906.f27086 = j;
                this.f54411.put(Long.valueOf(j), new C17083(6, c8906));
                c10734M41675.close();
                return c8906;
            }
            throw new C13842("History change count limit exceeded");
        } catch (Throwable th) {
            try {
                c10734M41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23224 m41673(long j, long j2) {
        C10734 c10734M41675 = m41675(j, j2);
        try {
            C12951 c12951 = c10734M41675.f32348;
            if (c12951.readInt() != 7 || c10734M41675.f32347 != 72) {
                throw new IOException("Invalid history change shape");
            }
            Object objM41670 = m41670(7, j);
            if (objM41670 != null) {
                C23224 c23224 = (C23224) objM41670;
                c10734M41675.close();
                return c23224;
            }
            this.f54408.m41292();
            int i = c12951.readInt();
            long j3 = c12951.readLong();
            long j4 = c12951.readLong();
            C5089 c5089M41671 = m41671(c12951);
            C11999 c11999M35225 = this.f54410.f42951.m35225(c12951.readLong(), j, c12951.readInt(), c12951.readInt(), c12951.readInt(), this.f54408);
            C11999 c11999M35226 = this.f54410.f42951.m35225(c12951.readLong(), j, c12951.readInt(), c12951.readInt(), c12951.readInt(), this.f54408);
            if (i >= 0) {
                long j5 = i;
                if (((long) c11999M35225.m29347()) + j5 <= 2147483647L && j5 + ((long) c11999M35226.m29347()) <= 2147483647L && j3 >= 0 && j4 >= 0) {
                    C23224 c23225 = new C23224(i, j3, j4, c5089M41671, c11999M35225, c11999M35226);
                    c23225.f74641 = this.f54410.f42950;
                    c23225.f74642 = j;
                    this.f54411.put(Long.valueOf(j), new C17083(7, c23225));
                    c10734M41675.close();
                    return c23225;
                }
            }
            throw new IOException("Invalid history change metadata");
        } catch (Throwable th) {
            try {
                c10734M41675.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5089 m41671(C12951 c12951) throws IOException {
        final int i = c12951.readInt();
        final int i2 = c12951.readInt();
        if (i < -1 || i2 < -1) {
            throw new IOException("Invalid history selection");
        }
        return (C5089) C13843.computeIfAbsent(this.f54409, Long.valueOf((((long) i) << 32) | (((long) i2) & 4294967295L)), new Function() { // from class: l.ܽۗᩳ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new C5089(i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m41670(int i, long j) throws IOException {
        C17083 c17083 = (C17083) this.f54411.get(Long.valueOf(j));
        if (c17083 == null) {
            return null;
        }
        if (c17083.f52387 != i) {
            throw new IOException("Conflicting history reference types");
        }
        return c17083.f52388;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41674(C15713 c15713, C15713 c15714, long j, long j2) throws IOException {
        long jM37046 = ((long) c15713.m37046()) + ((long) c15714.m37046());
        C17643 c17643 = this.f54408;
        if (jM37046 > c17643.f53944) {
            throw new C13842("History record count limit exceeded");
        }
        HashSet hashSet = new HashSet();
        int iM23073 = 0;
        Object[] objArr = {c15713, c15714};
        ArrayList arrayList = new ArrayList(2);
        while (iM23073 < 2) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList, obj, iM23073, 1);
        }
        Iterator it = C20195.unmodifiableList(arrayList).iterator();
        long jM37047 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((C15713) it.next()).iterator();
            while (true) {
                C20654 c20654 = (C20654) it2;
                if (c20654.hasNext()) {
                    C8905 c8905 = (C8905) c20654.next();
                    long j3 = c8905.f27082;
                    C15713 c15715 = c8905.f27081;
                    if (j3 >= j || !hashSet.add(Long.valueOf(j3))) {
                        throw new IOException("Invalid history record identity");
                    }
                    jM37047 += (long) c15715.m37046();
                    if (jM37047 > c17643.f53944) {
                        throw new C13842("History replay size limit exceeded");
                    }
                    Iterator it3 = c15715.iterator();
                    while (true) {
                        C20654 c20655 = (C20654) it3;
                        if (c20655.hasNext()) {
                            C23224 c23224 = (C23224) c20655.next();
                            this.f54410.f42949.run();
                            if (c23224.f74640 > j2 || c23224.f74638 > j2) {
                                throw new IOException("Invalid historical edit mark");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41669(C15713 c15713, int i, boolean z, Runnable runnable) throws IOException {
        Iterator c20654;
        c15713.getClass();
        C20654 c20655 = new C20654(c15713, true);
        while (c20655.hasNext()) {
            C15713 c15714 = ((C8905) c20655.next()).f27081;
            if (!z) {
                c15714.getClass();
                c20654 = new C20654(c15714, true);
            } else {
                c20654 = c15714.iterator();
            }
            while (true) {
                C20654 c20656 = (C20654) c20654;
                if (c20656.hasNext()) {
                    runnable.run();
                    C23224 c23224 = (C23224) c20656.next();
                    C11999 c11999 = c23224.f74636;
                    C11999 c119910 = c23224.f74639;
                    C5089 c5089 = c23224.f74643;
                    if (z && (c5089.m14642() > i || c5089.m14640() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                    int iM29347 = z ? c119910.m29347() : c11999.m29347();
                    int iM29348 = z ? c11999.m29347() : c119910.m29347();
                    int i2 = c23224.f74637;
                    if (i2 > i || iM29347 > i - i2) {
                        throw new IOException("History range exceeds replayed text");
                    }
                    long j = (((long) i) - ((long) iM29347)) + ((long) iM29348);
                    if (j > 2147483647L) {
                        throw new IOException("History replay exceeds coordinate limit");
                    }
                    i = (int) j;
                    if (!z && (c5089.m14642() > i || c5089.m14640() > i)) {
                        throw new IOException("Historical selection exceeds text length");
                    }
                }
            }
        }
    }
}
