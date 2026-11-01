package p067l;

import java.io.IOException;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳ᩹ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6UD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16454 {

    /* JADX INFO: renamed from: ֫ */
    public final Runnable f48337;

    /* JADX INFO: renamed from: ۧ */
    public final C22902 f48338;

    public C16454(C22902 c22902, Runnable runnable) {
        this.f48338 = c22902;
        this.f48337 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m37372(C13773 c13773) {
        return m37367(c13773.f38939);
    }

    /* JADX INFO: renamed from: ֫ */
    private long m37367(AbstractC21820 abstractC21820) throws IOException {
        long jM51156;
        this.f48337.run();
        if (abstractC21820 == null) {
            return 0L;
        }
        if (abstractC21820.f68654 >= 0) {
            return abstractC21820.f68654;
        }
        if (abstractC21820 instanceof C23161) {
            C10161 c10161 = ((C23161) abstractC21820).f72769;
            if (c10161 == null || c10161.f28112 != this.f48338) {
                throw new IOException("Text page belongs to another store");
            }
            if (c10161.m23667() < 0) {
                C20891 c20891M6163 = this.f48338.f72073.m6163(c10161);
                try {
                    this.f48338.m51148(c10161, c20891M6163.m47193());
                    c20891M6163.close();
                } catch (Throwable th) {
                    try {
                        c20891M6163.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            abstractC21820.f68654 = c10161.m23667();
            return c10161.m23667();
        }
        C25172 c25172 = (C25172) abstractC21820;
        for (AbstractC21820 abstractC21821 : c25172.f80530) {
            m37367(abstractC21821);
        }
        synchronized (this.f48338.f72073.f6922) {
            C11996 c11996 = new C11996((c25172.f80530.length * 16) + 16);
            c11996.writeInt(c25172.f68651);
            c11996.writeInt(c25172.f80530.length);
            c11996.writeInt(c25172.f68652);
            c11996.writeInt(c25172.f68653);
            for (AbstractC21820 abstractC21822 : c25172.f80530) {
                c11996.m27451(abstractC21822.f68654);
                c11996.writeInt(abstractC21822.f68652);
                c11996.writeInt(abstractC21822.f68653);
            }
            C22902 c22902 = this.f48338;
            long jM51157 = c22902.m51157();
            c22902.getClass();
            jM51156 = c22902.m51156(jM51157, c11996.m27458(), 2, c11996.size());
            c25172.f68654 = jM51156;
        }
        return jM51156;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C13773 m37368(C16454 c16454) {
        C22902 c22902 = c16454.f48338;
        return new C13773(null, c22902.f72072, c22902.f72076, c22902);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m37373(long j, long j2, int i, int i2, int i3, C19137 c19137) throws IOException {
        if (j == 0) {
            if (i != -1 || i2 != 0 || i3 != 0) {
                throw new IOException("Invalid empty recovery root");
            }
            return (C13773) C15525.computeIfAbsent(c19137.f57141, 0L, new Function() { // from class: l.ܽ᩹ᩳ
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C16454.m37368(this.f55189);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            });
        }
        final AbstractC21820 abstractC21820M37370 = m37370(j, j2, i, true, c19137);
        if (abstractC21820M37370.f68652 != i2 || abstractC21820M37370.f68653 != i3) {
            throw new IOException("Recovery root statistics do not match");
        }
        return (C13773) C15525.computeIfAbsent(c19137.f57141, Long.valueOf(j), new Function() { // from class: l.ᩳ᩹ᩳ
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo56417andThen(Function function) {
                return C22038.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C16454.m37369(this.f60239, abstractC21820M37370);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C22038.$default$compose(this, function);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C13773 m37369(C16454 c16454, AbstractC21820 abstractC21820) {
        C22902 c22902 = c16454.f48338;
        return new C13773(abstractC21820, c22902.f72072, c22902.f72076, c22902);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21820 m37370(long j, long j2, int i, boolean z, C19137 c19137) throws IOException {
        C9490 c9490M51153;
        int i2;
        boolean z2;
        AbstractC21820 c25172;
        C19137 c19138;
        int i3;
        int i4;
        int i5 = i;
        boolean z3 = z;
        this.f48337.run();
        if (i5 < 0 || i5 > 32 || j < 64 || j >= j2) {
            throw new IOException("Invalid recovery tree reference");
        }
        synchronized (this.f48338.f72073.f6922) {
            c9490M51153 = this.f48338.m51153(j);
        }
        long j3 = j + 32;
        if (((long) c9490M51153.f25994) + j3 + 16 > j2 || c9490M51153.f25992 >= c19137.f57138) {
            throw new IOException("Invalid recovery record boundary or identity");
        }
        AbstractC21820 abstractC21820 = (AbstractC21820) c19137.f57140.get(Long.valueOf(j));
        if (abstractC21820 != null) {
            m37371(abstractC21820, i5, z3);
            return abstractC21820;
        }
        c19137.m43538();
        int i6 = 2;
        if (i5 == 0) {
            if (c9490M51153.f25995 != 1 || c9490M51153.f25994 < 16) {
                throw new IOException("Missing recovery text page");
            }
            byte[] bArr = new byte[16];
            synchronized (this.f48338.f72073.f6922) {
                this.f48338.f72074.mo16281(j3, bArr, 0, 16);
            }
            C14677 c14677 = new C14677(bArr);
            int i7 = c14677.readInt();
            int i8 = c14677.readInt();
            int i9 = c14677.readInt();
            int i10 = c14677.readInt();
            C22902 c22902 = this.f48338;
            if (i7 != c22902.f72072 || i8 < 1 || i8 > i7 || i9 < 0 || i9 > i8 || ((i10 != 1 && i10 != 2) || c9490M51153.f25994 != (i8 * i10) + 16)) {
                throw new IOException("Invalid recovery text page shape");
            }
            C10161 c10161 = new C10161(c22902, c9490M51153.f25992, j, i7, i8, i9, i10 == 1);
            C20891 c20891M6163 = this.f48338.f72073.m6163(c10161);
            try {
                c25172 = new C23161(c19137.f57142, c10161);
                c20891M6163.close();
                i3 = i5;
                c19138 = c19137;
                z2 = z3;
            } catch (Throwable th) {
                try {
                    c20891M6163.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            if (c9490M51153.f25995 != 2 || (i2 = c9490M51153.f25994) < 16 || i2 > 8192) {
                throw new IOException("Missing recovery index node");
            }
            C7479 c7479M6162 = this.f48338.f72073.m6162(((long) i2) + 16);
            try {
                C14677 c14678 = new C14677(this.f48338.m51149(j, c9490M51153));
                int i11 = c14678.readInt();
                int i12 = c14678.readInt();
                int i13 = c14678.readInt();
                int i14 = c14678.readInt();
                if (i11 == i5) {
                    if (!z3) {
                        i6 = this.f48338.f72076 / 2;
                    }
                    if (i12 >= i6 && i12 <= this.f48338.f72076 && c9490M51153.f25994 == (i12 * 16) + 16 && i13 >= 1 && i14 >= 0 && i14 <= i13) {
                        AbstractC21820[] abstractC21820Arr = new AbstractC21820[i12];
                        long j4 = 0;
                        long j5 = 0;
                        int i15 = 0;
                        while (i15 < i12) {
                            long j6 = c14678.readLong();
                            int i16 = c14678.readInt();
                            int i17 = c14678.readInt();
                            int i18 = i15;
                            int i19 = i12;
                            boolean z4 = z3;
                            AbstractC21820 abstractC21820M37370 = m37370(j6, j, i5 - 1, false, c19137);
                            int i20 = abstractC21820M37370.f68652;
                            if (i20 != i16 || (i4 = abstractC21820M37370.f68653) != i17) {
                                throw new IOException("Recovery child statistics do not match");
                            }
                            abstractC21820Arr[i18] = abstractC21820M37370;
                            j4 += (long) i20;
                            j5 += (long) i4;
                            i15 = i18 + 1;
                            i5 = i;
                            z3 = z4;
                            i12 = i19;
                        }
                        z2 = z3;
                        if (j4 != i13 || j5 != i14 || c14678.available() != 0) {
                            throw new IOException("Invalid recovery index totals");
                        }
                        c19138 = c19137;
                        c25172 = new C25172(c19138.f57142, abstractC21820Arr);
                        c7479M6162.close();
                        i3 = i;
                    }
                }
                throw new IOException("Invalid recovery index shape");
            } catch (Throwable th3) {
                try {
                    c7479M6162.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        m37371(c25172, i3, z2);
        c25172.f68654 = j;
        c19138.f57140.put(Long.valueOf(j), c25172);
        return c25172;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37371(AbstractC21820 abstractC21820, int i, boolean z) throws IOException {
        int i2;
        boolean z2 = abstractC21820 instanceof C23161;
        int length = z2 ? abstractC21820.f68652 : ((C25172) abstractC21820).f80530.length;
        C22902 c22902 = this.f48338;
        int i3 = 2;
        if (z2) {
            if (z) {
                i3 = 1;
            } else {
                i2 = c22902.f72072;
                i3 = i2 / 2;
            }
        } else if (!z) {
            i2 = c22902.f72076;
            i3 = i2 / 2;
        }
        if (abstractC21820.f68651 != i || length < i3) {
            throw new IOException("Invalid recovery node occupancy");
        }
    }
}
