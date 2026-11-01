package p067l;

import java.math.RoundingMode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9942 implements InterfaceC16646 {

    /* JADX INFO: renamed from: ۖ */
    public static final int[] f27526 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: ۘ */
    public static final int[] f27527 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, EnumC8055.f21261};

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f27528;

    /* JADX INFO: renamed from: ۜ */
    public int f27529;

    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC20790 f27530;

    /* JADX INFO: renamed from: ۢ */
    public final int f27531;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC23116 f27532;

    /* JADX INFO: renamed from: ܳ */
    public long f27533;

    /* JADX INFO: renamed from: ܺ */
    public final C21342 f27534;

    /* JADX INFO: renamed from: ܽ */
    public final C10307 f27535;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f27536;

    /* JADX INFO: renamed from: ᩳ */
    public final int f27537;

    /* JADX INFO: renamed from: ᩷ */
    public long f27538;

    /* JADX INFO: renamed from: ᩻ */
    public int f27539;

    public C9942(InterfaceC23116 interfaceC23116, InterfaceC20790 interfaceC20790, C21342 c21342) throws C10998 {
        this.f27532 = interfaceC23116;
        this.f27530 = interfaceC20790;
        this.f27534 = c21342;
        int i = c21342.f67294;
        int iMax = Math.max(1, i / 10);
        this.f27531 = iMax;
        C19203 c19203 = new C19203(c21342.f67293);
        c19203.m43711();
        int iM43711 = c19203.m43711();
        this.f27537 = iM43711;
        int i2 = c21342.f67292;
        int i3 = c21342.f67291;
        int iM51252 = (C22934.m51252(i2, 4, i3, 8) / (c21342.f67290 * i2)) + 1;
        if (iM43711 != iM51252) {
            throw C10998.m25387("Expected frames per block: " + iM51252 + "; got: " + iM43711, (Throwable) null);
        }
        int iM12975 = C5792.m12975(iMax, iM43711);
        this.f27536 = new byte[iM12975 * i3];
        this.f27528 = new C19203(iM43711 * 2 * i2 * iM12975);
        int i4 = ((i3 * i) * 8) / iM43711;
        C3601 c3601 = new C3601();
        c3601.m6697("audio/raw");
        c3601.m6700(i4);
        c3601.m6670(i4);
        c3601.m6683(iMax * 2 * i2);
        c3601.m6704(i2);
        c3601.m6688(i);
        c3601.m6707(2);
        this.f27535 = c3601.m6672();
    }

    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final void mo23240(long j) {
        this.f27539 = 0;
        this.f27538 = j;
        this.f27529 = 0;
        this.f27533 = 0L;
    }

    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final void mo23239(int i, long j) {
        C14635 c14635 = new C14635(this.f27534, this.f27537, i, j);
        this.f27532.mo5733(c14635);
        C10307 c10307 = this.f27535;
        InterfaceC20790 interfaceC20790 = this.f27530;
        interfaceC20790.mo10503(c10307);
        interfaceC20790.mo10501(c14635.mo8953());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0177  */
    /* JADX WARN: Code duplicated, block: B:37:0x017b  */
    /* JADX WARN: Code duplicated, block: B:43:0x005b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0140 A[EDGE_INSN: B:47:0x0140->B:34:0x0140 BREAK  A[LOOP:1: B:17:0x0061->B:33:0x0130], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0051 -> B:12:0x0053). Please report as a decompilation issue!!! */
    @Override // p067l.InterfaceC16646
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23241(InterfaceC10375 interfaceC10375, long j) {
        C9942 c9942;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        C21342 c21342;
        int i5;
        InterfaceC10375 interfaceC10376;
        long j2;
        byte[] bArr;
        int i6;
        boolean z2;
        int i7;
        int i8;
        C19203 c19203;
        int i9;
        int i10;
        byte[] bArrM43728;
        int i11;
        int i12;
        int iM12976;
        int[] iArr;
        int i13;
        int i14;
        int iM12977;
        int i15;
        C9942 c9943;
        byte b;
        int i16;
        int i17;
        int iM14441;
        int i18;
        int i19;
        int i20 = this.f27529;
        C21342 c21343 = this.f27534;
        int i21 = i20 / (c21343.f67292 * 2);
        int i22 = this.f27531;
        int i23 = this.f27537;
        int iM12975 = C5792.m12975(i22 - i21, i23);
        int i24 = c21343.f67292;
        int i25 = c21343.f67291;
        int i26 = iM12975 * i25;
        if (j != 0) {
            c9942 = this;
            i = i23;
            i2 = i24;
            i3 = i25;
            z = false;
            i4 = i26;
            c21342 = c21343;
            i5 = i22;
            interfaceC10376 = interfaceC10375;
            j2 = j;
            while (true) {
                bArr = c9942.f27536;
                if (z && (i18 = c9942.f27539) < i4) {
                    i19 = interfaceC10376.read(bArr, c9942.f27539, (int) Math.min(i4 - i18, j2));
                    if (i19 == -1) {
                        break;
                    }
                    c9942.f27539 += i19;
                    bArr = c9942.f27536;
                    if (z) {
                    }
                }
                i6 = c9942.f27539 / i3;
                if (i6 > 0) {
                    i8 = 0;
                    while (true) {
                        c19203 = c9942.f27528;
                        if (i8 < i6) {
                            break;
                        }
                        i10 = 0;
                        while (i10 < i2) {
                            bArrM43728 = c19203.m43728();
                            int i27 = (i10 * 4) + (i8 * i3);
                            i11 = (i2 * 4) + i27;
                            i12 = (i3 / i2) - 4;
                            boolean z3 = z;
                            iM12976 = (short) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
                            int iMin = Math.min(bArr[i27 + 2] & 255, 88);
                            iArr = f27527;
                            int i28 = iArr[iMin];
                            i13 = ((i8 * i * i2) + i10) * 2;
                            bArrM43728[i13] = (byte) (iM12976 & 255);
                            int i29 = i5;
                            bArrM43728[i13 + 1] = (byte) (iM12976 >> 8);
                            i14 = 0;
                            iM12977 = iMin;
                            int i30 = i3;
                            i15 = i28;
                            while (true) {
                                c9943 = c9942;
                                if (i14 < i12 * 2) {
                                    b = bArr[((i14 / 8) * i2 * 4) + i11 + ((i14 / 2) % 4)];
                                    byte[] bArr2 = bArr;
                                    i16 = b & 255;
                                    if (i14 % 2 == 0) {
                                        i17 = b & 15;
                                    } else {
                                        i17 = i16 >> 4;
                                    }
                                    int i31 = i11;
                                    C19203 c19204 = c19203;
                                    iM14441 = C6316.m14441(i17 & 7, 2, 1, i15) >> 3;
                                    if ((i17 & 8) != 0) {
                                        iM14441 = -iM14441;
                                    }
                                    iM12976 = C5792.m12976(iM12976 + iM14441, -32768, EnumC8055.f21261);
                                    i13 = (i2 * 2) + i13;
                                    bArrM43728[i13] = (byte) (iM12976 & 255);
                                    bArrM43728[i13 + 1] = (byte) (iM12976 >> 8);
                                    iM12977 = C5792.m12976(iM12977 + f27526[i17], 0, 88);
                                    i15 = iArr[iM12977];
                                    i14++;
                                    c9942 = c9943;
                                    bArr = bArr2;
                                    i11 = i31;
                                    c19203 = c19204;
                                }
                            }
                            i10++;
                            z = z3;
                            i3 = i30;
                            i5 = i29;
                            c9942 = c9943;
                        }
                        i8++;
                    }
                    z2 = z;
                    int i32 = i * i6 * 2 * c21342.f67292;
                    c19203.m43730(0);
                    c19203.m43732(i32);
                    c9942.f27539 -= i6 * i3;
                    int iM43729 = c19203.m43729();
                    c9942.f27530.mo10500(iM43729, c19203);
                    i9 = c9942.f27529 + iM43729;
                    c9942.f27529 = i9;
                    if (i9 / (c21342.f67292 * 2) >= i5) {
                        c9942.m23238(i5);
                    }
                } else {
                    z2 = z;
                }
                if (z2 && (i7 = c9942.f27529 / (c21342.f67292 * 2)) > 0) {
                    c9942.m23238(i7);
                }
                return z2;
            }
        }
        c9942 = this;
        i = i23;
        i2 = i24;
        i3 = i25;
        i4 = i26;
        c21342 = c21343;
        i5 = i22;
        interfaceC10376 = interfaceC10375;
        j2 = j;
        z = true;
        while (true) {
            bArr = c9942.f27536;
            if (z) {
            }
            i6 = c9942.f27539 / i3;
            if (i6 > 0) {
                i8 = 0;
                while (true) {
                    c19203 = c9942.f27528;
                    if (i8 < i6) {
                        break;
                        break;
                    }
                    i10 = 0;
                    while (i10 < i2) {
                        bArrM43728 = c19203.m43728();
                        int i210 = (i10 * 4) + (i8 * i3);
                        i11 = (i2 * 4) + i210;
                        i12 = (i3 / i2) - 4;
                        boolean z4 = z;
                        iM12976 = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                        int iMin2 = Math.min(bArr[i210 + 2] & 255, 88);
                        iArr = f27527;
                        int i211 = iArr[iMin2];
                        i13 = ((i8 * i * i2) + i10) * 2;
                        bArrM43728[i13] = (byte) (iM12976 & 255);
                        int i212 = i5;
                        bArrM43728[i13 + 1] = (byte) (iM12976 >> 8);
                        i14 = 0;
                        iM12977 = iMin2;
                        int i33 = i3;
                        i15 = i211;
                        while (true) {
                            c9943 = c9942;
                            if (i14 < i12 * 2) {
                                b = bArr[((i14 / 8) * i2 * 4) + i11 + ((i14 / 2) % 4)];
                                byte[] bArr3 = bArr;
                                i16 = b & 255;
                                if (i14 % 2 == 0) {
                                    i17 = b & 15;
                                } else {
                                    i17 = i16 >> 4;
                                }
                                int i34 = i11;
                                C19203 c19205 = c19203;
                                iM14441 = C6316.m14441(i17 & 7, 2, 1, i15) >> 3;
                                if ((i17 & 8) != 0) {
                                    iM14441 = -iM14441;
                                }
                                iM12976 = C5792.m12976(iM12976 + iM14441, -32768, EnumC8055.f21261);
                                i13 = (i2 * 2) + i13;
                                bArrM43728[i13] = (byte) (iM12976 & 255);
                                bArrM43728[i13 + 1] = (byte) (iM12976 >> 8);
                                iM12977 = C5792.m12976(iM12977 + f27526[i17], 0, 88);
                                i15 = iArr[iM12977];
                                i14++;
                                c9942 = c9943;
                                bArr = bArr3;
                                i11 = i34;
                                c19203 = c19205;
                            }
                        }
                        i10++;
                        z = z4;
                        i3 = i33;
                        i5 = i212;
                        c9942 = c9943;
                    }
                    i8++;
                }
                z2 = z;
                int i35 = i * i6 * 2 * c21342.f67292;
                c19203.m43730(0);
                c19203.m43732(i35);
                c9942.f27539 -= i6 * i3;
                int iM437210 = c19203.m43729();
                c9942.f27530.mo10500(iM437210, c19203);
                i9 = c9942.f27529 + iM437210;
                c9942.f27529 = i9;
                if (i9 / (c21342.f67292 * 2) >= i5) {
                    c9942.m23238(i5);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c9942.m23238(i7);
            }
            return z2;
            c9942.f27539 += i19;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23238(int i) {
        long j = this.f27538;
        long j2 = this.f27533;
        C21342 c21342 = this.f27534;
        long j3 = c21342.f67294;
        String str = C5792.f14228;
        long jM12993 = j + C5792.m12993(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c21342.f67292;
        this.f27530.mo10502(jM12993, 1, i2, this.f27529 - i2, null);
        this.f27533 += (long) i;
        this.f27529 -= i2;
    }
}
