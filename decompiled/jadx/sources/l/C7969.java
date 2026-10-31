package l;

import java.math.RoundingMode;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.۠ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7969 implements InterfaceC15023 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f24613 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f24614 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, EnumC5983.f18409};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f24615;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f24616;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f24617;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f24618;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f24619;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f24620;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19964 f24621;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f24622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f24623;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24624;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f24625;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24626;

    public C7969(InterfaceC21830 interfaceC21830, InterfaceC19383 interfaceC19383, C19964 c19964) throws C9080 {
        this.f24619 = interfaceC21830;
        this.f24617 = interfaceC19383;
        this.f24621 = c19964;
        int i = c19964.f64654;
        int iMax = Math.max(1, i / 10);
        this.f24618 = iMax;
        C17714 c17714 = new C17714(c19964.f64653);
        c17714.m41465();
        int iM41465 = c17714.m41465();
        this.f24624 = iM41465;
        int i2 = c19964.f64652;
        int i3 = c19964.f64651;
        int iM48904 = (C21639.m48904(i2, 4, i3, 8) / (c19964.f64650 * i2)) + 1;
        if (iM41465 != iM48904) {
            throw C9080.m23440("Expected frames per block: " + iM48904 + "; got: " + iM41465, (Throwable) null);
        }
        int iM10999 = C3603.m10999(iMax, iM41465);
        this.f24623 = new byte[iM10999 * i3];
        this.f24615 = new C17714(iM41465 * 2 * i2 * iM10999);
        int i4 = ((i3 * i) * 8) / iM41465;
        C1297 c1297 = new C1297();
        c1297.m4465("audio/raw");
        c1297.m4468(i4);
        c1297.m4438(i4);
        c1297.m4451(iMax * 2 * i2);
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4475(2);
        this.f24622 = c1297.m4440();
    }

    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21274(long j) {
        this.f24626 = 0;
        this.f24625 = j;
        this.f24616 = 0;
        this.f24620 = 0L;
    }

    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21273(int i, long j) {
        C12907 c12907 = new C12907(this.f24621, this.f24624, i, j);
        this.f24619.mo3430(c12907);
        C8353 c8353 = this.f24622;
        InterfaceC19383 interfaceC19383 = this.f24617;
        interfaceC19383.mo8456(c8353);
        interfaceC19383.mo8454(c12907.mo6827());
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
    @Override // l.InterfaceC15023
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo21275(InterfaceC8424 interfaceC8424, long j) {
        C7969 c7969;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        C19964 c19964;
        int i5;
        InterfaceC8424 interfaceC8425;
        long j2;
        byte[] bArr;
        int i6;
        boolean z2;
        int i7;
        int i8;
        C17714 c17714;
        int i9;
        int i10;
        byte[] bArrM41482;
        int i11;
        int i12;
        int iM11000;
        int[] iArr;
        int i13;
        int i14;
        int iM11001;
        int i15;
        C7969 c79610;
        byte b;
        int i16;
        int i17;
        int iM12551;
        int i18;
        int i19;
        int i20 = this.f24616;
        C19964 c19965 = this.f24621;
        int i21 = i20 / (c19965.f64652 * 2);
        int i22 = this.f24618;
        int i23 = this.f24624;
        int iM10999 = C3603.m10999(i22 - i21, i23);
        int i24 = c19965.f64652;
        int i25 = c19965.f64651;
        int i26 = iM10999 * i25;
        if (j != 0) {
            c7969 = this;
            i = i23;
            i2 = i24;
            i3 = i25;
            z = false;
            i4 = i26;
            c19964 = c19965;
            i5 = i22;
            interfaceC8425 = interfaceC8424;
            j2 = j;
            while (true) {
                bArr = c7969.f24623;
                if (z && (i18 = c7969.f24626) < i4) {
                    i19 = interfaceC8425.read(bArr, c7969.f24626, (int) Math.min(i4 - i18, j2));
                    if (i19 == -1) {
                        break;
                    }
                    c7969.f24626 += i19;
                    bArr = c7969.f24623;
                    if (z) {
                    }
                }
                i6 = c7969.f24626 / i3;
                if (i6 > 0) {
                    i8 = 0;
                    while (true) {
                        c17714 = c7969.f24615;
                        if (i8 < i6) {
                            break;
                        }
                        i10 = 0;
                        while (i10 < i2) {
                            bArrM41482 = c17714.m41482();
                            int i27 = (i10 * 4) + (i8 * i3);
                            i11 = (i2 * 4) + i27;
                            i12 = (i3 / i2) - 4;
                            boolean z3 = z;
                            iM11000 = (short) (((bArr[i27 + 1] & 255) << 8) | (bArr[i27] & 255));
                            int iMin = Math.min(bArr[i27 + 2] & 255, 88);
                            iArr = f24614;
                            int i28 = iArr[iMin];
                            i13 = ((i8 * i * i2) + i10) * 2;
                            bArrM41482[i13] = (byte) (iM11000 & 255);
                            int i29 = i5;
                            bArrM41482[i13 + 1] = (byte) (iM11000 >> 8);
                            i14 = 0;
                            iM11001 = iMin;
                            int i30 = i3;
                            i15 = i28;
                            while (true) {
                                c79610 = c7969;
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
                                    C17714 c17715 = c17714;
                                    iM12551 = C4153.m12551(i17 & 7, 2, 1, i15) >> 3;
                                    if ((i17 & 8) != 0) {
                                        iM12551 = -iM12551;
                                    }
                                    iM11000 = C3603.m11000(iM11000 + iM12551, -32768, EnumC5983.f18409);
                                    i13 = (i2 * 2) + i13;
                                    bArrM41482[i13] = (byte) (iM11000 & 255);
                                    bArrM41482[i13 + 1] = (byte) (iM11000 >> 8);
                                    iM11001 = C3603.m11000(iM11001 + f24613[i17], 0, 88);
                                    i15 = iArr[iM11001];
                                    i14++;
                                    c7969 = c79610;
                                    bArr = bArr2;
                                    i11 = i31;
                                    c17714 = c17715;
                                }
                            }
                            i10++;
                            z = z3;
                            i3 = i30;
                            i5 = i29;
                            c7969 = c79610;
                        }
                        i8++;
                    }
                    z2 = z;
                    int i32 = i * i6 * 2 * c19964.f64652;
                    c17714.m41484(0);
                    c17714.m41486(i32);
                    c7969.f24626 -= i6 * i3;
                    int iM41483 = c17714.m41483();
                    c7969.f24617.mo8453(iM41483, c17714);
                    i9 = c7969.f24616 + iM41483;
                    c7969.f24616 = i9;
                    if (i9 / (c19964.f64652 * 2) >= i5) {
                        c7969.m21272(i5);
                    }
                } else {
                    z2 = z;
                }
                if (z2 && (i7 = c7969.f24616 / (c19964.f64652 * 2)) > 0) {
                    c7969.m21272(i7);
                }
                return z2;
            }
        }
        c7969 = this;
        i = i23;
        i2 = i24;
        i3 = i25;
        i4 = i26;
        c19964 = c19965;
        i5 = i22;
        interfaceC8425 = interfaceC8424;
        j2 = j;
        z = true;
        while (true) {
            bArr = c7969.f24623;
            if (z) {
            }
            i6 = c7969.f24626 / i3;
            if (i6 > 0) {
                i8 = 0;
                while (true) {
                    c17714 = c7969.f24615;
                    if (i8 < i6) {
                        break;
                        break;
                    }
                    i10 = 0;
                    while (i10 < i2) {
                        bArrM41482 = c17714.m41482();
                        int i210 = (i10 * 4) + (i8 * i3);
                        i11 = (i2 * 4) + i210;
                        i12 = (i3 / i2) - 4;
                        boolean z4 = z;
                        iM11000 = (short) (((bArr[i210 + 1] & 255) << 8) | (bArr[i210] & 255));
                        int iMin2 = Math.min(bArr[i210 + 2] & 255, 88);
                        iArr = f24614;
                        int i211 = iArr[iMin2];
                        i13 = ((i8 * i * i2) + i10) * 2;
                        bArrM41482[i13] = (byte) (iM11000 & 255);
                        int i212 = i5;
                        bArrM41482[i13 + 1] = (byte) (iM11000 >> 8);
                        i14 = 0;
                        iM11001 = iMin2;
                        int i33 = i3;
                        i15 = i211;
                        while (true) {
                            c79610 = c7969;
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
                                C17714 c17716 = c17714;
                                iM12551 = C4153.m12551(i17 & 7, 2, 1, i15) >> 3;
                                if ((i17 & 8) != 0) {
                                    iM12551 = -iM12551;
                                }
                                iM11000 = C3603.m11000(iM11000 + iM12551, -32768, EnumC5983.f18409);
                                i13 = (i2 * 2) + i13;
                                bArrM41482[i13] = (byte) (iM11000 & 255);
                                bArrM41482[i13 + 1] = (byte) (iM11000 >> 8);
                                iM11001 = C3603.m11000(iM11001 + f24613[i17], 0, 88);
                                i15 = iArr[iM11001];
                                i14++;
                                c7969 = c79610;
                                bArr = bArr3;
                                i11 = i34;
                                c17714 = c17716;
                            }
                        }
                        i10++;
                        z = z4;
                        i3 = i33;
                        i5 = i212;
                        c7969 = c79610;
                    }
                    i8++;
                }
                z2 = z;
                int i35 = i * i6 * 2 * c19964.f64652;
                c17714.m41484(0);
                c17714.m41486(i35);
                c7969.f24626 -= i6 * i3;
                int iM41484 = c17714.m41483();
                c7969.f24617.mo8453(iM41484, c17714);
                i9 = c7969.f24616 + iM41484;
                c7969.f24616 = i9;
                if (i9 / (c19964.f64652 * 2) >= i5) {
                    c7969.m21272(i5);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                c7969.m21272(i7);
            }
            return z2;
            c7969.f24626 += i19;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21272(int i) {
        long j = this.f24625;
        long j2 = this.f24620;
        C19964 c19964 = this.f24621;
        long j3 = c19964.f64654;
        String str = C3603.f11424;
        long jM11017 = j + C3603.m11017(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c19964.f64652;
        this.f24617.mo8455(jM11017, 1, i2, this.f24616 - i2, null);
        this.f24620 += (long) i;
        this.f24616 -= i2;
    }
}
