package l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14820 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f45221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21605 f45222;

    public C14820(C21605 c21605, Runnable runnable) {
        this.f45222 = c21605;
        this.f45221 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m35224(C11999 c11999) {
        return m35219(c11999.f35929);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m35219(AbstractC20466 abstractC20466) throws IOException {
        long jM48809;
        this.f45221.run();
        if (abstractC20466 == null) {
            return 0L;
        }
        if (abstractC20466.f65978 >= 0) {
            return abstractC20466.f65978;
        }
        if (abstractC20466 instanceof C21877) {
            C8199 c8199 = ((C21877) abstractC20466).f70059;
            if (c8199 == null || c8199.f25202 != this.f45222) {
                throw new IOException("Text page belongs to another store");
            }
            if (c8199.m21698() < 0) {
                C19489 c19489M3922 = this.f45222.f69370.m3922(c8199);
                try {
                    this.f45222.m48801(c8199, c19489M3922.m44896());
                    c19489M3922.close();
                } catch (Throwable th) {
                    try {
                        c19489M3922.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            abstractC20466.f65978 = c8199.m21698();
            return c8199.m21698();
        }
        C23993 c23993 = (C23993) abstractC20466;
        for (AbstractC20466 abstractC20467 : c23993.f77779) {
            m35219(abstractC20467);
        }
        synchronized (this.f45222.f69370.f4153) {
            C10130 c10130 = new C10130((c23993.f77779.length * 16) + 16);
            c10130.writeInt(c23993.f65975);
            c10130.writeInt(c23993.f77779.length);
            c10130.writeInt(c23993.f65976);
            c10130.writeInt(c23993.f65977);
            for (AbstractC20466 abstractC20468 : c23993.f77779) {
                c10130.m25431(abstractC20468.f65978);
                c10130.writeInt(abstractC20468.f65976);
                c10130.writeInt(abstractC20468.f65977);
            }
            C21605 c21605 = this.f45222;
            long jM48810 = c21605.m48810();
            c21605.getClass();
            jM48809 = c21605.m48809(jM48810, c10130.m25438(), 2, c10130.size());
            c23993.f65978 = jM48809;
        }
        return jM48809;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11999 m35220(C14820 c14820) {
        C21605 c21605 = c14820.f45222;
        return new C11999(null, c21605.f69369, c21605.f69373, c21605);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m35225(long j, long j2, int i, int i2, int i3, C17643 c17643) throws IOException {
        if (j == 0) {
            if (i != -1 || i2 != 0 || i3 != 0) {
                throw new IOException("Invalid empty recovery root");
            }
            return (C11999) C13843.computeIfAbsent(c17643.f53948, 0L, new Function() { // from class: l.ܽ᩹ᩳ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C14820.m35220(this.f52008);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
        }
        final AbstractC20466 abstractC20466M35222 = m35222(j, j2, i, true, c17643);
        if (abstractC20466M35222.f65976 != i2 || abstractC20466M35222.f65977 != i3) {
            throw new IOException("Recovery root statistics do not match");
        }
        return (C11999) C13843.computeIfAbsent(c17643.f53948, Long.valueOf(j), new Function() { // from class: l.ᩳ᩹ᩳ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C14820.m35221(this.f57021, abstractC20466M35222);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C11999 m35221(C14820 c14820, AbstractC20466 abstractC20466) {
        C21605 c21605 = c14820.f45222;
        return new C11999(abstractC20466, c21605.f69369, c21605.f69373, c21605);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m35222(long j, long j2, int i, boolean z, C17643 c17643) throws IOException {
        C7493 c7493M48806;
        int i2;
        boolean z2;
        AbstractC20466 c23993;
        C17643 c17644;
        int i3;
        int i4;
        int i5 = i;
        boolean z3 = z;
        this.f45221.run();
        if (i5 < 0 || i5 > 32 || j < 64 || j >= j2) {
            throw new IOException("Invalid recovery tree reference");
        }
        synchronized (this.f45222.f69370.f4153) {
            c7493M48806 = this.f45222.m48806(j);
        }
        long j3 = j + 32;
        if (((long) c7493M48806.f23082) + j3 + 16 > j2 || c7493M48806.f23080 >= c17643.f53945) {
            throw new IOException("Invalid recovery record boundary or identity");
        }
        AbstractC20466 abstractC20466 = (AbstractC20466) c17643.f53947.get(Long.valueOf(j));
        if (abstractC20466 != null) {
            m35223(abstractC20466, i5, z3);
            return abstractC20466;
        }
        c17643.m41292();
        int i6 = 2;
        if (i5 == 0) {
            if (c7493M48806.f23083 != 1 || c7493M48806.f23082 < 16) {
                throw new IOException("Missing recovery text page");
            }
            byte[] bArr = new byte[16];
            synchronized (this.f45222.f69370.f4153) {
                this.f45222.f69371.mo14384(j3, bArr, 0, 16);
            }
            C12951 c12951 = new C12951(bArr);
            int i7 = c12951.readInt();
            int i8 = c12951.readInt();
            int i9 = c12951.readInt();
            int i10 = c12951.readInt();
            C21605 c21605 = this.f45222;
            if (i7 != c21605.f69369 || i8 < 1 || i8 > i7 || i9 < 0 || i9 > i8 || ((i10 != 1 && i10 != 2) || c7493M48806.f23082 != (i8 * i10) + 16)) {
                throw new IOException("Invalid recovery text page shape");
            }
            C8199 c8199 = new C8199(c21605, c7493M48806.f23080, j, i7, i8, i9, i10 == 1);
            C19489 c19489M3922 = this.f45222.f69370.m3922(c8199);
            try {
                c23993 = new C21877(c17643.f53949, c8199);
                c19489M3922.close();
                i3 = i5;
                c17644 = c17643;
                z2 = z3;
            } catch (Throwable th) {
                try {
                    c19489M3922.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            if (c7493M48806.f23083 != 2 || (i2 = c7493M48806.f23082) < 16 || i2 > 8192) {
                throw new IOException("Missing recovery index node");
            }
            C5377 c5377M3921 = this.f45222.f69370.m3921(((long) i2) + 16);
            try {
                C12951 c12952 = new C12951(this.f45222.m48802(j, c7493M48806));
                int i11 = c12952.readInt();
                int i12 = c12952.readInt();
                int i13 = c12952.readInt();
                int i14 = c12952.readInt();
                if (i11 == i5) {
                    if (!z3) {
                        i6 = this.f45222.f69373 / 2;
                    }
                    if (i12 >= i6 && i12 <= this.f45222.f69373 && c7493M48806.f23082 == (i12 * 16) + 16 && i13 >= 1 && i14 >= 0 && i14 <= i13) {
                        AbstractC20466[] abstractC20466Arr = new AbstractC20466[i12];
                        long j4 = 0;
                        long j5 = 0;
                        int i15 = 0;
                        while (i15 < i12) {
                            long j6 = c12952.readLong();
                            int i16 = c12952.readInt();
                            int i17 = c12952.readInt();
                            int i18 = i15;
                            int i19 = i12;
                            boolean z4 = z3;
                            AbstractC20466 abstractC20466M35222 = m35222(j6, j, i5 - 1, false, c17643);
                            int i20 = abstractC20466M35222.f65976;
                            if (i20 != i16 || (i4 = abstractC20466M35222.f65977) != i17) {
                                throw new IOException("Recovery child statistics do not match");
                            }
                            abstractC20466Arr[i18] = abstractC20466M35222;
                            j4 += (long) i20;
                            j5 += (long) i4;
                            i15 = i18 + 1;
                            i5 = i;
                            z3 = z4;
                            i12 = i19;
                        }
                        z2 = z3;
                        if (j4 != i13 || j5 != i14 || c12952.available() != 0) {
                            throw new IOException("Invalid recovery index totals");
                        }
                        c17644 = c17643;
                        c23993 = new C23993(c17644.f53949, abstractC20466Arr);
                        c5377M3921.close();
                        i3 = i;
                    }
                }
                throw new IOException("Invalid recovery index shape");
            } catch (Throwable th3) {
                try {
                    c5377M3921.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        m35223(c23993, i3, z2);
        c23993.f65978 = j;
        c17644.f53947.put(Long.valueOf(j), c23993);
        return c23993;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35223(AbstractC20466 abstractC20466, int i, boolean z) throws IOException {
        int i2;
        boolean z2 = abstractC20466 instanceof C21877;
        int length = z2 ? abstractC20466.f65976 : ((C23993) abstractC20466).f77779.length;
        C21605 c21605 = this.f45222;
        int i3 = 2;
        if (z2) {
            if (z) {
                i3 = 1;
            } else {
                i2 = c21605.f69369;
                i3 = i2 / 2;
            }
        } else if (!z) {
            i2 = c21605.f69373;
            i3 = i2 / 2;
        }
        if (abstractC20466.f65975 != i || length < i3) {
            throw new IOException("Invalid recovery node occupancy");
        }
    }
}
