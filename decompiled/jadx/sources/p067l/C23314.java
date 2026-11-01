package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: l.᩹ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18RZ */
/* JADX INFO: loaded from: classes.dex */
public final class C23314 extends AbstractC16607 {

    /* JADX INFO: renamed from: ֡ */
    public C16764 f73363;

    /* JADX INFO: renamed from: ۘ */
    public C3354 f73364;

    /* JADX INFO: renamed from: ۚ */
    public C22644 f73365;

    /* JADX INFO: renamed from: ᩴ */
    public int f73366;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f73367;

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final void mo9593(boolean z) {
        super.mo9593(z);
        if (z) {
            this.f73365 = null;
            this.f73363 = null;
            this.f73364 = null;
        }
        this.f73366 = 0;
        this.f73367 = false;
    }

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ܽ */
    public final void mo37633(long j) {
        super.mo37633(j);
        this.f73367 = j != 0;
        C16764 c16764 = this.f73363;
        this.f73366 = c16764 != null ? c16764.f49407 : 0;
    }

    @Override // p067l.AbstractC16607
    /* JADX INFO: renamed from: ֫ */
    public final long mo9592(C19203 c19203) {
        int i;
        if ((c19203.m43728()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c19203.m43728()[0];
        C22644 c22644 = this.f73365;
        C23877.m52958(c22644);
        int i2 = c22644.f71448;
        C16764 c16764 = c22644.f71449;
        if (!c22644.f71451[(b >> 1) & (255 >>> (8 - i2))].f27838) {
            i = c16764.f49407;
        } else {
            i = c16764.f49409;
        }
        long j = this.f73367 ? (this.f73366 + i) / 4 : 0;
        if (c19203.m43718() < c19203.m43729() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(c19203.m43728(), c19203.m43729() + 4);
            c19203.m43708(bArrCopyOf.length, bArrCopyOf);
        } else {
            c19203.m43732(c19203.m43729() + 4);
        }
        byte[] bArrM43728 = c19203.m43728();
        bArrM43728[c19203.m43729() - 4] = (byte) (j & 255);
        bArrM43728[c19203.m43729() - 3] = (byte) ((j >>> 8) & 255);
        bArrM43728[c19203.m43729() - 2] = (byte) ((j >>> 16) & 255);
        bArrM43728[c19203.m43729() - 1] = (byte) ((j >>> 24) & 255);
        this.f73367 = true;
        this.f73366 = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0384 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x0386  */
    @Override // p067l.AbstractC16607
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9594(C19203 c19203, long j, C3196 c3196) throws C10998 {
        C22644 c22644;
        int i;
        long jFloor;
        if (this.f73365 == null) {
            C16764 c16764 = this.f73363;
            int i2 = 4;
            if (c16764 != null) {
                C3354 c3354 = this.f73364;
                if (c3354 == null) {
                    this.f73364 = C22801.m51003(c19203, true, true);
                } else {
                    byte[] bArr = new byte[c19203.m43729()];
                    System.arraycopy(c19203.m43728(), 0, bArr, 0, c19203.m43729());
                    int i3 = c16764.f49408;
                    int i4 = 5;
                    C22801.m51005(5, c19203, false);
                    int iM43702 = c19203.m43702() + 1;
                    C7378 c7378 = new C7378(c19203.m43728());
                    c7378.m17105(c19203.m43731() * 8);
                    int i5 = 0;
                    while (true) {
                        int i6 = 16;
                        if (i5 >= iM43702) {
                            int i7 = 6;
                            int iM17104 = c7378.m17104(6) + 1;
                            for (int i8 = 0; i8 < iM17104; i8++) {
                                if (c7378.m17104(16) != 0) {
                                    throw C10998.m25387("placeholder of time domain transforms not zeroed out", (Throwable) null);
                                }
                            }
                            int i9 = 1;
                            int iM17105 = c7378.m17104(6) + 1;
                            int i10 = 0;
                            while (true) {
                                int i11 = 3;
                                if (i10 >= iM17105) {
                                    int iM17106 = c7378.m17104(i7) + 1;
                                    int i12 = 0;
                                    while (i12 < iM17106) {
                                        if (c7378.m17104(16) > 2) {
                                            throw C10998.m25387("residueType greater than 2 is not decodable", (Throwable) null);
                                        }
                                        c7378.m17105(24);
                                        c7378.m17105(24);
                                        c7378.m17105(24);
                                        int iM17107 = c7378.m17104(i7) + 1;
                                        int i13 = 8;
                                        c7378.m17105(8);
                                        int[] iArr = new int[iM17107];
                                        for (int i14 = 0; i14 < iM17107; i14++) {
                                            iArr[i14] = ((c7378.m17106() ? c7378.m17104(5) : 0) * 8) + c7378.m17104(3);
                                        }
                                        int i15 = 0;
                                        while (i15 < iM17107) {
                                            int i16 = 0;
                                            while (i16 < i13) {
                                                if ((iArr[i15] & (1 << i16)) != 0) {
                                                    c7378.m17105(i13);
                                                }
                                                i16++;
                                                i13 = 8;
                                            }
                                            i15++;
                                            i13 = 8;
                                        }
                                        i12++;
                                        i7 = 6;
                                    }
                                    int iM17108 = c7378.m17104(i7) + 1;
                                    for (int i17 = 0; i17 < iM17108; i17++) {
                                        int iM17109 = c7378.m17104(16);
                                        if (iM17109 != 0) {
                                            C21334.m48347("mapping type other than 0 not supported: " + iM17109);
                                        } else {
                                            int iM171010 = c7378.m17106() ? c7378.m17104(4) + 1 : 1;
                                            if (c7378.m17106()) {
                                                int iM171011 = c7378.m17104(8) + 1;
                                                for (int i18 = 0; i18 < iM171011; i18++) {
                                                    int i19 = i3 - 1;
                                                    int i20 = 0;
                                                    for (int i21 = i19; i21 > 0; i21 >>>= 1) {
                                                        i20++;
                                                    }
                                                    c7378.m17105(i20);
                                                    int i22 = 0;
                                                    while (i19 > 0) {
                                                        i22++;
                                                        i19 >>>= 1;
                                                    }
                                                    c7378.m17105(i22);
                                                }
                                            }
                                            if (c7378.m17104(2) != 0) {
                                                throw C10998.m25387("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                                            }
                                            if (iM171010 > 1) {
                                                for (int i23 = 0; i23 < i3; i23++) {
                                                    c7378.m17105(4);
                                                }
                                            }
                                            for (int i24 = 0; i24 < iM171010; i24++) {
                                                c7378.m17105(8);
                                                c7378.m17105(8);
                                                c7378.m17105(8);
                                            }
                                        }
                                    }
                                    int iM171012 = c7378.m17104(6);
                                    int i25 = iM171012 + 1;
                                    C10060[] c10060Arr = new C10060[i25];
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        boolean zM17106 = c7378.m17106();
                                        c7378.m17104(16);
                                        c7378.m17104(16);
                                        c7378.m17104(8);
                                        c10060Arr[i26] = new C10060(zM17106);
                                    }
                                    if (c7378.m17106()) {
                                        int i27 = 0;
                                        while (iM171012 > 0) {
                                            i27++;
                                            iM171012 >>>= 1;
                                        }
                                        c22644 = new C22644(c16764, c3354, bArr, c10060Arr, i27);
                                        break;
                                    }
                                    throw C10998.m25387("framing bit after modes not set as expected", (Throwable) null);
                                }
                                int iM171013 = c7378.m17104(i6);
                                if (iM171013 == 0) {
                                    i = iM17105;
                                    int i28 = 8;
                                    c7378.m17105(8);
                                    c7378.m17105(16);
                                    c7378.m17105(16);
                                    c7378.m17105(6);
                                    c7378.m17105(8);
                                    int iM171014 = c7378.m17104(4) + 1;
                                    int i29 = 0;
                                    while (i29 < iM171014) {
                                        c7378.m17105(i28);
                                        i29++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (iM171013 != i9) {
                                        throw C10998.m25387("floor type greater than 1 not decodable: " + iM171013, (Throwable) null);
                                    }
                                    int iM171015 = c7378.m17104(5);
                                    int[] iArr2 = new int[iM171015];
                                    int i30 = -1;
                                    for (int i31 = 0; i31 < iM171015; i31++) {
                                        int iM171016 = c7378.m17104(4);
                                        iArr2[i31] = iM171016;
                                        if (iM171016 > i30) {
                                            i30 = iM171016;
                                        }
                                    }
                                    int i32 = i30 + 1;
                                    int[] iArr3 = new int[i32];
                                    int i33 = 0;
                                    while (i33 < i32) {
                                        iArr3[i33] = c7378.m17104(i11) + 1;
                                        int iM171017 = c7378.m17104(2);
                                        if (iM171017 > 0) {
                                            c7378.m17105(8);
                                        }
                                        int i34 = iM17105;
                                        int i35 = i32;
                                        int i36 = 8;
                                        int i37 = 0;
                                        while (i37 < (1 << iM171017)) {
                                            c7378.m17105(i36);
                                            i37++;
                                            i36 = 8;
                                        }
                                        i33++;
                                        i11 = 3;
                                        iM17105 = i34;
                                        i32 = i35;
                                    }
                                    i = iM17105;
                                    c7378.m17105(2);
                                    int iM171018 = c7378.m17104(4);
                                    int i38 = 0;
                                    int i39 = 0;
                                    for (int i40 = 0; i40 < iM171015; i40++) {
                                        i38 += iArr3[iArr2[i40]];
                                        while (i39 < i38) {
                                            c7378.m17105(iM171018);
                                            i39++;
                                        }
                                    }
                                }
                                i10++;
                                i7 = 6;
                                i9 = 1;
                                i6 = 16;
                                iM17105 = i;
                            }
                        } else {
                            if (c7378.m17104(24) != 5653314) {
                                throw C10998.m25387("expected code book to start with [0x56, 0x43, 0x42] at " + c7378.m17103(), (Throwable) null);
                            }
                            int iM171019 = c7378.m17104(16);
                            int iM171020 = c7378.m17104(24);
                            if (!c7378.m17106()) {
                                boolean zM17107 = c7378.m17106();
                                for (int i41 = 0; i41 < iM171020; i41++) {
                                    if (zM17107) {
                                        if (c7378.m17106()) {
                                            c7378.m17105(i4);
                                        }
                                    } else {
                                        c7378.m17105(i4);
                                    }
                                }
                            } else {
                                c7378.m17105(i4);
                                int iM171021 = 0;
                                while (iM171021 < iM171020) {
                                    int i42 = 0;
                                    for (int i43 = iM171020 - iM171021; i43 > 0; i43 >>>= 1) {
                                        i42++;
                                    }
                                    iM171021 += c7378.m17104(i42);
                                }
                            }
                            int iM171022 = c7378.m17104(i2);
                            if (iM171022 > 2) {
                                throw C10998.m25387("lookup type greater than 2 not decodable: " + iM171022, (Throwable) null);
                            }
                            if (iM171022 == 1 || iM171022 == 2) {
                                c7378.m17105(32);
                                c7378.m17105(32);
                                int iM171023 = c7378.m17104(i2) + 1;
                                c7378.m17105(1);
                                if (iM171022 == 1) {
                                    jFloor = iM171019 != 0 ? (long) Math.floor(Math.pow(iM171020, 1.0d / ((double) iM171019))) : 0L;
                                } else {
                                    jFloor = ((long) iM171020) * ((long) iM171019);
                                }
                                c7378.m17105((int) (jFloor * ((long) iM171023)));
                            }
                            i5++;
                            i2 = 4;
                            i4 = 5;
                        }
                    }
                }
                this.f73365 = c22644;
                if (c22644 == null) {
                    return true;
                }
                C16764 c16765 = c22644.f71449;
                ArrayList arrayList = new ArrayList();
                arrayList.add(c16765.f49406);
                arrayList.add(c22644.f71450);
                C25079 c25079M51004 = C22801.m51004(AbstractC16192.m36882(c22644.f71447.f6558));
                C3601 c3601 = new C3601();
                c3601.m6694("audio/ogg");
                c3601.m6697("audio/vorbis");
                c3601.m6700(c16765.f49405);
                c3601.m6670(c16765.f49404);
                c3601.m6704(c16765.f49408);
                c3601.m6688(c16765.f49410);
                c3601.m6678((List) arrayList);
                c3601.m6681(c25079M51004);
                c3196.f6200 = c3601.m6672();
                return true;
            }
            C22801.m51005(1, c19203, false);
            c19203.m43709();
            int iM43703 = c19203.m43702();
            int iM43709 = c19203.m43709();
            int iM43736 = c19203.m43736();
            int i44 = iM43736 <= 0 ? -1 : iM43736;
            int iM43737 = c19203.m43736();
            int i45 = iM43737 <= 0 ? -1 : iM43737;
            c19203.m43736();
            int iM43704 = c19203.m43702();
            int iPow = (int) Math.pow(2.0d, iM43704 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iM43704 & 240) >> 4);
            c19203.m43702();
            this.f73363 = new C16764(iM43703, iM43709, i44, i45, iPow, iPow2, Arrays.copyOf(c19203.m43728(), c19203.m43729()));
            c22644 = null;
            this.f73365 = c22644;
            if (c22644 == null) {
                return true;
            }
            C16764 c16766 = c22644.f71449;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c16766.f49406);
            arrayList2.add(c22644.f71450);
            C25079 c25079M51005 = C22801.m51004(AbstractC16192.m36882(c22644.f71447.f6558));
            C3601 c3602 = new C3601();
            c3602.m6694("audio/ogg");
            c3602.m6697("audio/vorbis");
            c3602.m6700(c16766.f49405);
            c3602.m6670(c16766.f49404);
            c3602.m6704(c16766.f49408);
            c3602.m6688(c16766.f49410);
            c3602.m6678((List) arrayList2);
            c3602.m6681(c25079M51005);
            c3196.f6200 = c3602.m6672();
            return true;
        }
        c3196.f6200.getClass();
        return false;
    }
}
