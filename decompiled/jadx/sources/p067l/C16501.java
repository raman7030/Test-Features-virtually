package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܶ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16501 implements InterfaceC11277 {

    /* JADX INFO: renamed from: ֡ */
    public static final int[] f48482 = new int[0];

    /* JADX INFO: renamed from: ۚ */
    public static final Unsafe f48483 = C22558.m50573();

    /* JADX INFO: renamed from: ֫ */
    public final int[] f48484;

    /* JADX INFO: renamed from: ۖ */
    public final Object[] f48485;

    /* JADX INFO: renamed from: ۘ */
    public final int f48486;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f48487;

    /* JADX INFO: renamed from: ۡ */
    public final int f48488;

    /* JADX INFO: renamed from: ۢ */
    public final int f48489;

    /* JADX INFO: renamed from: ۧ */
    public final int f48490;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f48491;

    /* JADX INFO: renamed from: ܺ */
    public final InterfaceC23208 f48492;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10467 f48493;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f48494;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC18612 f48495;

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC18533 f48496;

    /* JADX INFO: renamed from: ᩵ */
    public final boolean f48497;

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC12479 f48498;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC2951 f48499;

    /* JADX INFO: renamed from: ܿ */
    public static int m37453(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m37454(int i) {
        return i & 1048575;
    }

    public C16501(int[] iArr, Object[] objArr, int i, int i2, InterfaceC10467 interfaceC10467, int[] iArr2, int i3, int i4, InterfaceC23208 interfaceC23208, AbstractC2951 abstractC2951, AbstractC18533 abstractC18533, AbstractC18612 abstractC18612, InterfaceC12479 interfaceC12479) {
        this.f48484 = iArr;
        this.f48485 = objArr;
        this.f48488 = i;
        this.f48489 = i2;
        this.f48487 = interfaceC10467 instanceof AbstractC23049;
        this.f48494 = abstractC18612 != null && abstractC18612.mo42353(interfaceC10467);
        this.f48497 = true;
        this.f48491 = iArr2;
        this.f48490 = i3;
        this.f48486 = i4;
        this.f48492 = interfaceC23208;
        this.f48499 = abstractC2951;
        this.f48496 = abstractC18533;
        this.f48495 = abstractC18612;
        this.f48493 = interfaceC10467;
        this.f48498 = interfaceC12479;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX INFO: renamed from: ֫ */
    public static C16501 m37430(InterfaceC8455 interfaceC8455, InterfaceC23208 interfaceC23208, AbstractC2951 abstractC2951, AbstractC18533 abstractC18533, AbstractC18612 abstractC18612, InterfaceC12479 interfaceC12479) {
        int iM39101;
        int iM39102;
        int i;
        int[] iArr;
        int i2;
        int iM5496;
        int i3;
        long jM50568;
        int iM50568;
        int iNumberOfTrailingZeros;
        int i4;
        int i5;
        int i6;
        Class clsM39095;
        int i7;
        if (!(interfaceC8455 instanceof C3900)) {
            C21335 c21335 = (C21335) interfaceC8455;
            C17270[] c17270ArrM48352 = c21335.m48352();
            if (c17270ArrM48352.length == 0) {
                iM39101 = 0;
                iM39102 = 0;
            } else {
                iM39101 = c17270ArrM48352[0].m39101();
                iM39102 = c17270ArrM48352[c17270ArrM48352.length - 1].m39101();
            }
            int length = c17270ArrM48352.length;
            int[] iArr2 = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            int i8 = 0;
            int i9 = 0;
            for (C17270 c17270 : c17270ArrM48352) {
                if (c17270.getType() == EnumC3189.f6176) {
                    i8++;
                } else if (c17270.getType().m5496() >= 18 && c17270.getType().m5496() <= 49) {
                    i9++;
                }
            }
            int[] iArr3 = i8 > 0 ? new int[i8] : null;
            int[] iArr4 = i9 > 0 ? new int[i9] : null;
            int[] iArrM48353 = c21335.m48353();
            int[] iArr5 = f48482;
            if (iArrM48353 == null) {
                iArrM48353 = iArr5;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i10 < c17270ArrM48352.length) {
                C17270 c17271 = c17270ArrM48352[i10];
                C17270[] c17270Arr = c17270ArrM48352;
                int iM39103 = c17271.m39101();
                C14490 c14490M39094 = c17271.m39094();
                if (c14490M39094 != null) {
                    iM5496 = c17271.getType().m5496() + 51;
                    i = iM39102;
                    iArr = iArr5;
                    int iM50569 = (int) C22558.m50568(c14490M39094.m33141());
                    jM50568 = C22558.m50568(c14490M39094.m33140());
                    i2 = i10;
                    i3 = iM50569;
                } else {
                    i = iM39102;
                    iArr = iArr5;
                    EnumC3189 type = c17271.getType();
                    i2 = i10;
                    int iM505610 = (int) C22558.m50568(c17271.m39098());
                    iM5496 = type.m5496();
                    if (!type.m5497() && !type.m5500()) {
                        Field fieldM39097 = c17271.m39097();
                        iM50568 = fieldM39097 == null ? 1048575 : (int) C22558.m50568(fieldM39097);
                        iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(c17271.m39099());
                        i4 = iM505610;
                    } else {
                        i3 = iM505610;
                        if (c17271.m39092() == null) {
                            iM50568 = 0;
                        } else {
                            jM50568 = C22558.m50568(c17271.m39092());
                        }
                        i4 = i3;
                        iNumberOfTrailingZeros = 0;
                    }
                    iArr2[i11] = c17271.m39101();
                    int i15 = i11 + 1;
                    if (c17271.m39091()) {
                        i5 = 536870912;
                    } else {
                        i5 = 0;
                    }
                    if (c17271.m39093()) {
                        i6 = 268435456;
                    } else {
                        i6 = 0;
                    }
                    iArr2[i15] = i5 | i6 | (iM5496 << 20) | i4;
                    iArr2[i11 + 2] = iM50568 | (iNumberOfTrailingZeros << 20);
                    clsM39095 = c17271.m39095();
                    if (c17271.m39100() != null) {
                        i7 = (i11 / 3) * 2;
                        objArr[i7] = c17271.m39100();
                        if (clsM39095 != null) {
                            objArr[i7 + 1] = clsM39095;
                        } else if (c17271.m39096() != null) {
                            objArr[i7 + 1] = c17271.m39096();
                        }
                    } else if (clsM39095 != null) {
                        objArr[((i11 / 3) * 2) + 1] = clsM39095;
                    } else if (c17271.m39096() != null) {
                        objArr[((i11 / 3) * 2) + 1] = c17271.m39096();
                    }
                    if (i12 < iArrM48353.length && iArrM48353[i12] == iM39103) {
                        iArrM48353[i12] = i11;
                        i12++;
                    }
                    if (c17271.getType() == EnumC3189.f6176) {
                        iArr3[i13] = i11;
                        i13++;
                    } else if (c17271.getType().m5496() < 18 && c17271.getType().m5496() <= 49) {
                        iArr4[i14] = (int) C22558.m50568(c17271.m39098());
                        i14++;
                    }
                    i10 = i2 + 1;
                    i11 += 3;
                    c17270ArrM48352 = c17270Arr;
                    iM39102 = i;
                    iArr5 = iArr;
                }
                iM50568 = (int) jM50568;
                i4 = i3;
                iNumberOfTrailingZeros = 0;
                iArr2[i11] = c17271.m39101();
                int i16 = i11 + 1;
                if (c17271.m39091()) {
                    i5 = 536870912;
                } else {
                    i5 = 0;
                }
                if (c17271.m39093()) {
                    i6 = 268435456;
                } else {
                    i6 = 0;
                }
                iArr2[i16] = i5 | i6 | (iM5496 << 20) | i4;
                iArr2[i11 + 2] = iM50568 | (iNumberOfTrailingZeros << 20);
                clsM39095 = c17271.m39095();
                if (c17271.m39100() != null) {
                    i7 = (i11 / 3) * 2;
                    objArr[i7] = c17271.m39100();
                    if (clsM39095 != null) {
                        objArr[i7 + 1] = clsM39095;
                    } else if (c17271.m39096() != null) {
                        objArr[i7 + 1] = c17271.m39096();
                    }
                } else if (clsM39095 != null) {
                    objArr[((i11 / 3) * 2) + 1] = clsM39095;
                } else if (c17271.m39096() != null) {
                    objArr[((i11 / 3) * 2) + 1] = c17271.m39096();
                }
                if (i12 < iArrM48353.length) {
                    iArrM48353[i12] = i11;
                    i12++;
                }
                if (c17271.getType() == EnumC3189.f6176) {
                    iArr3[i13] = i11;
                    i13++;
                } else if (c17271.getType().m5496() < 18) {
                }
                i10 = i2 + 1;
                i11 += 3;
                c17270ArrM48352 = c17270Arr;
                iM39102 = i;
                iArr5 = iArr;
            }
            int i17 = iM39102;
            int[] iArr6 = iArr5;
            if (iArr3 == null) {
                iArr3 = iArr6;
            }
            if (iArr4 == null) {
                iArr4 = iArr6;
            }
            int[] iArr7 = new int[iArrM48353.length + iArr3.length + iArr4.length];
            System.arraycopy(iArrM48353, 0, iArr7, 0, iArrM48353.length);
            System.arraycopy(iArr3, 0, iArr7, iArrM48353.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr7, iArrM48353.length + iArr3.length, iArr4.length);
            return new C16501(iArr2, objArr, iM39101, i17, c21335.mo19677(), iArr7, iArrM48353.length, iArrM48353.length + iArr3.length, interfaceC23208, abstractC2951, abstractC18533, abstractC18612, interfaceC12479);
        }
        throw null;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final Object mo26207() {
        return this.f48492.mo14735(this.f48493);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo26212(AbstractC23049 abstractC23049, AbstractC23049 abstractC230410) {
        int[] iArr = this.f48484;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM24402 = true;
            if (i >= length) {
                AbstractC18533 abstractC18533 = this.f48496;
                if (abstractC18533.mo9315(abstractC23049).equals(abstractC18533.mo9315(abstractC230410))) {
                    if (!this.f48494) {
                        return true;
                    }
                    AbstractC18612 abstractC18612 = this.f48495;
                    return abstractC18612.mo42349((Object) abstractC23049).equals(abstractC18612.mo42349((Object) abstractC230410));
                }
            } else {
                int iM37447 = m37447(i);
                long j = iM37447 & 1048575;
                switch (m37453(iM37447)) {
                    case 0:
                        if (!m37440(abstractC23049, abstractC230410, i) || Double.doubleToLongBits(C22558.m50572(j, abstractC23049)) != Double.doubleToLongBits(C22558.m50572(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 1:
                        if (!m37440(abstractC23049, abstractC230410, i) || Float.floatToIntBits(C22558.m50585(j, abstractC23049)) != Float.floatToIntBits(C22558.m50585(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 2:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50584(j, abstractC23049) != C22558.m50584(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 3:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50584(j, abstractC23049) != C22558.m50584(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 4:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 5:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50584(j, abstractC23049) != C22558.m50584(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 6:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 7:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50579(j, abstractC23049) != C22558.m50579(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 8:
                        if (!m37440(abstractC23049, abstractC230410, i) || !C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 9:
                        if (!m37440(abstractC23049, abstractC230410, i) || !C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 10:
                        if (!m37440(abstractC23049, abstractC230410, i) || !C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 11:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 12:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 13:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 14:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50584(j, abstractC23049) != C22558.m50584(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 15:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50564(j, abstractC23049) != C22558.m50564(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 16:
                        if (!m37440(abstractC23049, abstractC230410, i) || C22558.m50584(j, abstractC23049) != C22558.m50584(j, abstractC230410)) {
                            zM24402 = false;
                        }
                        break;
                    case 17:
                        if (!m37440(abstractC23049, abstractC230410, i) || !C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM24402 = C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410));
                        break;
                    case 50:
                        zM24402 = C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (C22558.m50564(j2, abstractC23049) != C22558.m50564(j2, abstractC230410) || !C10606.m24402(C22558.m50565(j, abstractC23049), C22558.m50565(j, abstractC230410))) {
                            zM24402 = false;
                        }
                        break;
                }
                if (zM24402) {
                    i += 3;
                }
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final int mo26206(AbstractC23049 abstractC23049) {
        int i;
        int iM35600;
        int i2;
        int iM50564;
        int[] iArr = this.f48484;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM37447 = m37447(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM37447;
            int iHashCode = 37;
            switch (m37453(iM37447)) {
                case 0:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(Double.doubleToLongBits(C22558.m50572(j, abstractC23049)));
                    i3 = iM35600 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM35600 = Float.floatToIntBits(C22558.m50585(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(C22558.m50584(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(C22558.m50584(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 5:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(C22558.m50584(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 7:
                    i = i3 * 53;
                    iM35600 = C15671.m35601(C22558.m50579(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iM35600 = ((String) C22558.m50565(j, abstractC23049)).hashCode();
                    i3 = iM35600 + i;
                    break;
                case 9:
                    Object objM50565 = C22558.m50565(j, abstractC23049);
                    if (objM50565 != null) {
                        iHashCode = objM50565.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                    i3 = iM35600 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 14:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(C22558.m50584(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM50564 = C22558.m50564(j, abstractC23049);
                    i3 = i2 + iM50564;
                    break;
                case 16:
                    i = i3 * 53;
                    iM35600 = C15671.m35600(C22558.m50584(j, abstractC23049));
                    i3 = iM35600 + i;
                    break;
                case 17:
                    Object objM50566 = C22558.m50565(j, abstractC23049);
                    if (objM50566 != null) {
                        iHashCode = objM50566.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                    i3 = iM35600 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                    i3 = iM35600 + i;
                    break;
                case 51:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(Double.doubleToLongBits(((Double) C22558.m50565(j, abstractC23049)).doubleValue()));
                        i3 = iM35600 + i;
                    }
                    break;
                case 52:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = Float.floatToIntBits(((Float) C22558.m50565(j, abstractC23049)).floatValue());
                        i3 = iM35600 + i;
                    }
                    break;
                case 53:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(m37441(j, abstractC23049));
                        i3 = iM35600 + i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(m37441(j, abstractC23049));
                        i3 = iM35600 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case 56:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(m37441(j, abstractC23049));
                        i3 = iM35600 + i;
                    }
                    break;
                case 57:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35601(((Boolean) C22558.m50565(j, abstractC23049)).booleanValue());
                        i3 = iM35600 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = ((String) C22558.m50565(j, abstractC23049)).hashCode();
                        i3 = iM35600 + i;
                    }
                    break;
                case 60:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                        i3 = iM35600 + i;
                    }
                    break;
                case 61:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                        i3 = iM35600 + i;
                    }
                    break;
                case 62:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case 63:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case 64:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case 65:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(m37441(j, abstractC23049));
                        i3 = iM35600 + i;
                    }
                    break;
                case 66:
                    if (m37437(i5, i4, abstractC23049)) {
                        i2 = i3 * 53;
                        iM50564 = m37428(j, abstractC23049);
                        i3 = i2 + iM50564;
                    }
                    break;
                case 67:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C15671.m35600(m37441(j, abstractC23049));
                        i3 = iM35600 + i;
                    }
                    break;
                case 68:
                    if (m37437(i5, i4, abstractC23049)) {
                        i = i3 * 53;
                        iM35600 = C22558.m50565(j, abstractC23049).hashCode();
                        i3 = iM35600 + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f48496.mo9315(abstractC23049).hashCode() + (i3 * 53);
        return this.f48494 ? (iHashCode2 * 53) + this.f48495.mo42349((Object) abstractC23049).hashCode() : iHashCode2;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26209(Object obj, Object obj2) {
        m37452(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f48484;
            if (i >= iArr.length) {
                int i2 = C10606.f29361;
                AbstractC18533 abstractC18533 = this.f48496;
                abstractC18533.mo9321(obj, abstractC18533.mo9308(abstractC18533.mo9315(obj), abstractC18533.mo9315(obj2)));
                if (this.f48494) {
                    AbstractC18612 abstractC18612 = this.f48495;
                    C20625 c20625Mo42349 = abstractC18612.mo42349(obj2);
                    if (c20625Mo42349.m46619()) {
                        return;
                    }
                    abstractC18612.mo42354(obj).m46612(c20625Mo42349);
                    return;
                }
                return;
            }
            int iM37447 = m37447(i);
            long j = 1048575 & iM37447;
            int i3 = iArr[i];
            switch (m37453(iM37447)) {
                case 0:
                    if (m37438(i, obj2)) {
                        C22558.m50558(obj, j, C22558.m50572(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 1:
                    if (m37438(i, obj2)) {
                        C22558.m50559(obj, j, C22558.m50585(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 2:
                    if (m37438(i, obj2)) {
                        C22558.m50560(obj, j, C22558.m50584(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 3:
                    if (m37438(i, obj2)) {
                        C22558.m50560(obj, j, C22558.m50584(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 4:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 5:
                    if (m37438(i, obj2)) {
                        C22558.m50560(obj, j, C22558.m50584(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 6:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 7:
                    if (m37438(i, obj2)) {
                        C22558.m50576(obj, j, C22558.m50579(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 8:
                    if (m37438(i, obj2)) {
                        C22558.m50555(j, obj, C22558.m50565(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 9:
                    m37431(i, obj, obj2);
                    break;
                case 10:
                    if (m37438(i, obj2)) {
                        C22558.m50555(j, obj, C22558.m50565(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 11:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 12:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 13:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 14:
                    if (m37438(i, obj2)) {
                        C22558.m50560(obj, j, C22558.m50584(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 15:
                    if (m37438(i, obj2)) {
                        C22558.m50554(C22558.m50564(j, obj2), j, obj);
                        m37450(i, obj);
                    }
                    break;
                case 16:
                    if (m37438(i, obj2)) {
                        C22558.m50560(obj, j, C22558.m50584(j, obj2));
                        m37450(i, obj);
                    }
                    break;
                case 17:
                    m37431(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f48499.mo4877(j, obj, obj2);
                    break;
                case 50:
                    int i4 = C10606.f29361;
                    C22558.m50555(j, obj, this.f48498.mo28729(C22558.m50565(j, obj), C22558.m50565(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case 56:
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m37437(i3, i, obj2)) {
                        C22558.m50555(j, obj, C22558.m50565(j, obj2));
                        m37449(i3, i, obj);
                    }
                    break;
                case 60:
                    m37445(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m37437(i3, i, obj2)) {
                        C22558.m50555(j, obj, C22558.m50565(j, obj2));
                        m37449(i3, i, obj);
                    }
                    break;
                case 68:
                    m37445(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37431(int i, Object obj, Object obj2) {
        if (m37438(i, obj2)) {
            long jM37447 = m37447(i) & 1048575;
            Unsafe unsafe = f48483;
            Object object = unsafe.getObject(obj2, jM37447);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f48484[i] + " is present but null: " + obj2);
            }
            InterfaceC11277 interfaceC11277M37448 = m37448(i);
            if (!m37438(i, obj)) {
                if (!m37455(object)) {
                    unsafe.putObject(obj, jM37447, object);
                } else {
                    Object objMo26207 = interfaceC11277M37448.mo26207();
                    interfaceC11277M37448.mo26209(objMo26207, object);
                    unsafe.putObject(obj, jM37447, objMo26207);
                }
                m37450(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM37447);
            if (!m37455(object2)) {
                Object objMo26208 = interfaceC11277M37448.mo26207();
                interfaceC11277M37448.mo26209(objMo26208, object2);
                unsafe.putObject(obj, jM37447, objMo26208);
                object2 = objMo26208;
            }
            interfaceC11277M37448.mo26209(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:239:0x0560  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[PHI: r11
      0x008e: PHI (r11v4 int) = 
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v12 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v15 int)
      (r11v1 int)
      (r11v16 int)
      (r11v1 int)
     binds: [B:21:0x005f, B:245:0x0599, B:162:0x0389, B:157:0x036a, B:152:0x034b, B:147:0x0330, B:142:0x0314, B:137:0x02f8, B:132:0x02d8, B:127:0x02b8, B:122:0x029a, B:117:0x027e, B:112:0x0262, B:107:0x0242, B:102:0x0222, B:97:0x0206, B:88:0x01ba, B:85:0x01b0, B:81:0x01a2, B:78:0x0192, B:75:0x0182, B:72:0x0172, B:69:0x0167, B:66:0x015b, B:63:0x014f, B:56:0x012b, B:61:0x0147, B:50:0x00f9, B:47:0x00e7, B:44:0x00d7, B:41:0x00c7, B:38:0x00bb, B:35:0x00af, B:32:0x0095, B:29:0x008d, B:27:0x0079, B:249:0x05b4, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final int mo26205(AbstractC5951 abstractC5951) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM37220;
        int iM37221;
        int iM37222;
        int iM37223;
        int iM37225;
        int iM37224;
        int serializedSize;
        int iM37230;
        int iM37216;
        InterfaceC10467 interfaceC10467;
        InterfaceC11277 interfaceC11277M37448;
        int iM24408;
        int iM37226;
        int size;
        int iM24423;
        int iM37227;
        int iM37228;
        int iM37229;
        int iM372210;
        int iM37231;
        int iM372211;
        int iM372212;
        Unsafe unsafe = f48483;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iM372213 = 0;
        C16501 c16501 = this;
        AbstractC5951 abstractC5952 = abstractC5951;
        while (true) {
            int[] iArr = c16501.f48484;
            if (i8 >= iArr.length) {
                AbstractC18533 abstractC18533 = c16501.f48496;
                int iMo9320 = iM372213 + abstractC18533.mo9320(abstractC18533.mo9315(abstractC5952));
                return c16501.f48494 ? iMo9320 + c16501.f48495.mo42349((Object) abstractC5952).m46620() : iMo9320;
            }
            int iM37447 = c16501.m37447(i8);
            int iM37453 = m37453(iM37447);
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 2];
            int i11 = i10 & i5;
            if (iM37453 <= 17) {
                if (i11 != i6) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(abstractC5952, i11);
                    i6 = i11;
                }
                i3 = 1 << (i10 >>> 20);
                i = i6;
                i2 = i7;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            long j = i5 & iM37447;
            if (iM37453 < EnumC3189.f6129.m5496() || iM37453 > EnumC3189.f6165.m5496()) {
                i11 = 0;
            }
            boolean z = c16501.f48497;
            switch (iM37453) {
                case 0:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37220 = AbstractC16402.m37220(i9);
                        iM37216 = iM37220 + 8;
                        iM372213 += iM37216;
                    }
                    break;
                case 1:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37221 = AbstractC16402.m37220(i9);
                        iM37225 = iM37221 + 4;
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 2:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37222(i9, unsafe.getLong(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 3:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37228(i9, unsafe.getLong(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 4:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37221(i9, unsafe.getInt(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 5:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37223 = AbstractC16402.m37220(i9);
                        iM37225 = iM37223 + 8;
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 6:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37225 = AbstractC16402.m37225(i9);
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 7:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37225 = AbstractC16402.m37227(i9);
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 8:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        Object object = unsafe.getObject(abstractC5952, j);
                        iM372213 += object instanceof AbstractC7962 ? AbstractC16402.m37223(i9, (AbstractC7962) object) : AbstractC16402.m37217((String) object) + AbstractC16402.m37220(i9);
                    }
                    c16501 = this;
                    break;
                case 9:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        Object object2 = unsafe.getObject(abstractC5952, j);
                        InterfaceC11277 interfaceC11277M37449 = c16501.m37448(i8);
                        int i12 = C10606.f29361;
                        if (object2 instanceof C17703) {
                            iM37216 = AbstractC16402.m37216(i9, (C17703) object2);
                        } else {
                            iM37224 = AbstractC16402.m37220(i9);
                            serializedSize = ((AbstractC5951) ((InterfaceC10467) object2)).getSerializedSize(interfaceC11277M37449);
                            iM37230 = AbstractC16402.m37230(serializedSize);
                            iM37216 = iM37230 + serializedSize + iM37224;
                        }
                        iM372213 += iM37216;
                    }
                    break;
                case 10:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37223(i9, (AbstractC7962) unsafe.getObject(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 11:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37231(i9, unsafe.getInt(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 12:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37222 = AbstractC16402.m37226(i9, unsafe.getInt(abstractC5952, j));
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 13:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37221 = AbstractC16402.m37220(i9);
                        iM37225 = iM37221 + 4;
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 14:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i4, i2, i3)) {
                        iM37223 = AbstractC16402.m37220(i9);
                        iM37225 = iM37223 + 8;
                        iM372213 += iM37225;
                    }
                    c16501 = this;
                    abstractC5952 = abstractC5951;
                    break;
                case 15:
                    i4 = i;
                    if (c16501.m37439(abstractC5952, i8, i, i2, i3)) {
                        int i13 = unsafe.getInt(abstractC5952, j);
                        iM37222 = AbstractC16402.m37230((i13 >> 31) ^ (i13 << 1)) + AbstractC16402.m37220(i9);
                        iM372213 += iM37222;
                    }
                    c16501 = this;
                    break;
                case 16:
                    if (c16501.m37439(abstractC5952, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(abstractC5952, j);
                        iM372213 += AbstractC16402.m37224((j2 >> 63) ^ (j2 << 1)) + AbstractC16402.m37220(i9);
                    }
                    i4 = i;
                    c16501 = this;
                    break;
                case 17:
                    if (c16501.m37439(abstractC5952, i8, i, i2, i3)) {
                        interfaceC10467 = (InterfaceC10467) unsafe.getObject(abstractC5952, j);
                        interfaceC11277M37448 = c16501.m37448(i8);
                        iM37229 = AbstractC16402.m37220(i9) * 2;
                        iM24423 = ((AbstractC5951) interfaceC10467).getSerializedSize(interfaceC11277M37448);
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 18:
                    iM24408 = C10606.m24408(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 19:
                    iM24408 = C10606.m24394(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC5952, j);
                    int i14 = C10606.f29361;
                    if (list.size() == 0) {
                        iM37226 = 0;
                    } else {
                        iM37226 = (AbstractC16402.m37220(i9) * list.size()) + C10606.m24416(list);
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC5952, j);
                    int i15 = C10606.f29361;
                    size = list2.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24423(list2);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC5952, j);
                    int i16 = C10606.f29361;
                    size = list3.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24409(list3);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 23:
                    iM24408 = C10606.m24408(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 24:
                    iM24408 = C10606.m24394(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC5952, j);
                    int i17 = C10606.f29361;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM37228 = 0;
                    } else {
                        iM37228 = size2 * AbstractC16402.m37227(i9);
                    }
                    iM372213 += iM37228;
                    i4 = i;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC5952, j);
                    int i18 = C10606.f29361;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM37226 = 0;
                    } else {
                        iM37226 = AbstractC16402.m37220(i9) * size3;
                        if (list5 instanceof InterfaceC6305) {
                            InterfaceC6305 interfaceC6305 = (InterfaceC6305) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objMo10519 = interfaceC6305.mo10519(i19);
                                if (objMo10519 instanceof AbstractC7962) {
                                    int size4 = ((AbstractC7962) objMo10519).size();
                                    iM37226 = AbstractC16402.m37230(size4) + size4 + iM37226;
                                } else {
                                    iM37226 = AbstractC16402.m37217((String) objMo10519) + iM37226;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof AbstractC7962) {
                                    int size5 = ((AbstractC7962) obj).size();
                                    iM37226 = AbstractC16402.m37230(size5) + size5 + iM37226;
                                } else {
                                    iM37226 = AbstractC16402.m37217((String) obj) + iM37226;
                                }
                            }
                        }
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC5952, j);
                    InterfaceC11277 interfaceC11277M374410 = c16501.m37448(i8);
                    int i21 = C10606.f29361;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iM37228 = 0;
                    } else {
                        int iM372214 = AbstractC16402.m37220(i9) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj2 = list6.get(i22);
                            int iM40237 = obj2 instanceof C17703 ? ((C17703) obj2).m40237() : ((AbstractC5951) ((InterfaceC10467) obj2)).getSerializedSize(interfaceC11277M374410);
                            iM372214 += AbstractC16402.m37230(iM40237) + iM40237;
                        }
                        iM37228 = iM372214;
                    }
                    iM372213 += iM37228;
                    i4 = i;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC5952, j);
                    int i23 = C10606.f29361;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iM37226 = 0;
                    } else {
                        iM37226 = AbstractC16402.m37220(i9) * size7;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int size8 = ((AbstractC7962) list7.get(i24)).size();
                            iM37226 += AbstractC16402.m37230(size8) + size8;
                        }
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC5952, j);
                    int i25 = C10606.f29361;
                    size = list8.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24413(list8);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC5952, j);
                    int i26 = C10606.f29361;
                    size = list9.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24395(list9);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 31:
                    iM24408 = C10606.m24394(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 32:
                    iM24408 = C10606.m24408(i9, (List) unsafe.getObject(abstractC5952, j));
                    iM37216 = iM24408;
                    i4 = i;
                    iM372213 += iM37216;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC5952, j);
                    int i27 = C10606.f29361;
                    size = list10.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24420(list10);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC5952, j);
                    int i28 = C10606.f29361;
                    size = list11.size();
                    if (size == 0) {
                        iM37226 = 0;
                    } else {
                        iM24423 = C10606.m24418(list11);
                        iM37227 = AbstractC16402.m37220(i9);
                        iM37229 = iM37227 * size;
                        iM37226 = iM37229 + iM24423;
                    }
                    iM372213 += iM37226;
                    i4 = i;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC5952, j);
                    int i29 = C10606.f29361;
                    iM24423 = list12.size() * 8;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC5952, j);
                    int i30 = C10606.f29361;
                    iM24423 = list13.size() * 4;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 37:
                    iM24423 = C10606.m24416((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 38:
                    iM24423 = C10606.m24423((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 39:
                    iM24423 = C10606.m24409((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC5952, j);
                    int i31 = C10606.f29361;
                    iM24423 = list14.size() * 8;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC5952, j);
                    int i32 = C10606.f29361;
                    iM24423 = list15.size() * 4;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC5952, j);
                    int i33 = C10606.f29361;
                    iM24423 = list16.size();
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 43:
                    iM24423 = C10606.m24413((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 44:
                    iM24423 = C10606.m24395((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC5952, j);
                    int i34 = C10606.f29361;
                    iM24423 = list17.size() * 4;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC5952, j);
                    int i35 = C10606.f29361;
                    iM24423 = list18.size() * 8;
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 47:
                    iM24423 = C10606.m24420((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 48:
                    iM24423 = C10606.m24418((List) unsafe.getObject(abstractC5952, j));
                    if (iM24423 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC5952, i11, iM24423);
                        }
                        iM372210 = AbstractC16402.m37220(i9);
                        iM37231 = AbstractC16402.m37230(iM24423);
                        iM37229 = iM37231 + iM372210;
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC5952, j);
                    InterfaceC11277 interfaceC11277M374411 = c16501.m37448(i8);
                    int i36 = C10606.f29361;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iM37228 = 0;
                    } else {
                        int iM372215 = 0;
                        for (int i37 = 0; i37 < size9; i37++) {
                            iM372215 += (AbstractC16402.m37220(i9) * 2) + ((AbstractC5951) ((InterfaceC10467) list19.get(i37))).getSerializedSize(interfaceC11277M374411);
                        }
                        iM37228 = iM372215;
                    }
                    iM372213 += iM37228;
                    i4 = i;
                    break;
                case 50:
                    c16501.f48498.mo28730(i9, unsafe.getObject(abstractC5952, j), c16501.m37442(i8));
                    i4 = i;
                    break;
                case 51:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM372211 = AbstractC16402.m37220(i9);
                        iM37220 = iM372211;
                        i4 = i;
                        iM37216 = iM37220 + 8;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 52:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM372212 = AbstractC16402.m37220(i9);
                        iM24408 = iM372212 + 4;
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 53:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37222(i9, m37441(j, abstractC5952));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37228(i9, m37441(j, abstractC5952));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37221(i9, m37428(j, abstractC5952));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 56:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM372211 = AbstractC16402.m37220(i9);
                        iM37220 = iM372211;
                        i4 = i;
                        iM37216 = iM37220 + 8;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 57:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37225(i9);
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37227(i9);
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        Object object3 = unsafe.getObject(abstractC5952, j);
                        iM372213 = (object3 instanceof AbstractC7962 ? AbstractC16402.m37223(i9, (AbstractC7962) object3) : AbstractC16402.m37217((String) object3) + AbstractC16402.m37220(i9)) + iM372213;
                    }
                    i4 = i;
                    break;
                case 60:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        Object object4 = unsafe.getObject(abstractC5952, j);
                        InterfaceC11277 interfaceC11277M374412 = c16501.m37448(i8);
                        int i38 = C10606.f29361;
                        if (object4 instanceof C17703) {
                            iM24408 = AbstractC16402.m37216(i9, (C17703) object4);
                            iM37216 = iM24408;
                            i4 = i;
                            iM372213 += iM37216;
                        } else {
                            int iM372216 = AbstractC16402.m37220(i9);
                            int serializedSize2 = ((AbstractC5951) ((InterfaceC10467) object4)).getSerializedSize(interfaceC11277M374412);
                            iM37224 = iM372216;
                            iM37230 = AbstractC16402.m37230(serializedSize2);
                            serializedSize = serializedSize2;
                            i4 = i;
                            iM37216 = iM37230 + serializedSize + iM37224;
                            iM372213 += iM37216;
                        }
                    } else {
                        i4 = i;
                    }
                    break;
                case 61:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37223(i9, (AbstractC7962) unsafe.getObject(abstractC5952, j));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 62:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37231(i9, m37428(j, abstractC5952));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 63:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM24408 = AbstractC16402.m37226(i9, m37428(j, abstractC5952));
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 64:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM372212 = AbstractC16402.m37220(i9);
                        iM24408 = iM372212 + 4;
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 65:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        iM372211 = AbstractC16402.m37220(i9);
                        iM37220 = iM372211;
                        i4 = i;
                        iM37216 = iM37220 + 8;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 66:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        int iM37428 = m37428(j, abstractC5952);
                        iM24408 = AbstractC16402.m37230((iM37428 >> 31) ^ (iM37428 << 1)) + AbstractC16402.m37220(i9);
                        iM37216 = iM24408;
                        i4 = i;
                        iM372213 += iM37216;
                    } else {
                        i4 = i;
                    }
                    break;
                case 67:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        long jM37441 = m37441(j, abstractC5952);
                        iM37228 = AbstractC16402.m37224((jM37441 >> 63) ^ (jM37441 << 1)) + AbstractC16402.m37220(i9);
                        iM372213 += iM37228;
                    }
                    i4 = i;
                    break;
                case 68:
                    if (c16501.m37437(i9, i8, abstractC5952)) {
                        interfaceC10467 = (InterfaceC10467) unsafe.getObject(abstractC5952, j);
                        interfaceC11277M37448 = c16501.m37448(i8);
                        iM37229 = AbstractC16402.m37220(i9) * 2;
                        iM24423 = ((AbstractC5951) interfaceC10467).getSerializedSize(interfaceC11277M37448);
                        iM37226 = iM37229 + iM24423;
                        iM372213 += iM37226;
                    }
                    i4 = i;
                    break;
                default:
                    i4 = i;
                    break;
            }
            i8 += 3;
            i6 = i4;
            i7 = i2;
            i5 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26210(Object obj, InterfaceC8672 interfaceC8672) {
        Iterator itM46608;
        Map.Entry entry;
        C25120 c25120 = (C25120) interfaceC8672;
        c25120.getClass();
        if (EnumC24765.ASCENDING != EnumC24765.DESCENDING) {
            m37446(obj, interfaceC8672);
            return;
        }
        AbstractC18533 abstractC18533 = this.f48496;
        abstractC18533.mo9318(abstractC18533.mo9315(obj), interfaceC8672);
        boolean z = this.f48494;
        AbstractC18612 abstractC18612 = this.f48495;
        if (z) {
            C20625 c20625Mo42349 = abstractC18612.mo42349(obj);
            if (c20625Mo42349.m46619()) {
                itM46608 = null;
                entry = null;
            } else {
                itM46608 = c20625Mo42349.m46608();
                entry = (Map.Entry) itM46608.next();
            }
        } else {
            itM46608 = null;
            entry = null;
        }
        int[] iArr = this.f48484;
        int length = iArr.length;
        while (true) {
            length -= 3;
            if (length < 0) {
                while (entry != null) {
                    abstractC18612.mo42351(interfaceC8672, entry);
                    entry = itM46608.hasNext() ? (Map.Entry) itM46608.next() : null;
                }
                return;
            }
            int iM37447 = m37447(length);
            int i = iArr[length];
            while (entry != null && abstractC18612.mo42346(entry) > i) {
                abstractC18612.mo42351(interfaceC8672, entry);
                entry = itM46608.hasNext() ? (Map.Entry) itM46608.next() : null;
            }
            switch (m37453(iM37447)) {
                case 0:
                    if (m37438(length, obj)) {
                        c25120.m55136(i, C22558.m50572(iM37447 & 1048575, obj));
                    }
                    break;
                case 1:
                    if (m37438(length, obj)) {
                        c25120.m55134(C22558.m50585(iM37447 & 1048575, obj), i);
                    }
                    break;
                case 2:
                    if (m37438(length, obj)) {
                        c25120.m55154(i, C22558.m50584(iM37447 & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m37438(length, obj)) {
                        c25120.m55167(i, C22558.m50584(iM37447 & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m37438(length, obj)) {
                        c25120.m55162(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 5:
                    if (m37438(length, obj)) {
                        c25120.m55138(i, C22558.m50584(iM37447 & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m37438(length, obj)) {
                        c25120.m55153(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m37438(length, obj)) {
                        c25120.m55145(i, C22558.m50579(iM37447 & 1048575, obj));
                    }
                    break;
                case 8:
                    if (m37438(length, obj)) {
                        m37432(i, C22558.m50565(iM37447 & 1048575, obj), interfaceC8672);
                    }
                    break;
                case 9:
                    if (m37438(length, obj)) {
                        c25120.m55156(i, C22558.m50565(iM37447 & 1048575, obj), m37448(length));
                    }
                    break;
                case 10:
                    if (m37438(length, obj)) {
                        c25120.m55144(i, (AbstractC7962) C22558.m50565(iM37447 & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m37438(length, obj)) {
                        c25120.m55159(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 12:
                    if (m37438(length, obj)) {
                        c25120.m55137(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 13:
                    if (m37438(length, obj)) {
                        c25120.m55169(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m37438(length, obj)) {
                        c25120.m55163(i, C22558.m50584(iM37447 & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m37438(length, obj)) {
                        c25120.m55166(i, C22558.m50564(iM37447 & 1048575, obj));
                    }
                    break;
                case 16:
                    if (m37438(length, obj)) {
                        c25120.m55170(i, C22558.m50584(iM37447 & 1048575, obj));
                    }
                    break;
                case 17:
                    if (m37438(length, obj)) {
                        c25120.m55140(i, C22558.m50565(iM37447 & 1048575, obj), m37448(length));
                    }
                    break;
                case 18:
                    C10606.m24412(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 19:
                    C10606.m24414(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 20:
                    C10606.m24405(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 21:
                    C10606.m24404(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 22:
                    C10606.m24424(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 23:
                    C10606.m24419(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 24:
                    C10606.m24421(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 25:
                    C10606.m24400(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 26:
                    int i2 = iArr[length];
                    List list = (List) C22558.m50565(iM37447 & 1048575, obj);
                    int i3 = C10606.f29361;
                    if (list != null && !list.isEmpty()) {
                        c25120.m55157(i2, list);
                    }
                    break;
                case 27:
                    C10606.m24411(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, m37448(length));
                    break;
                case 28:
                    int i4 = iArr[length];
                    List list2 = (List) C22558.m50565(iM37447 & 1048575, obj);
                    int i5 = C10606.f29361;
                    if (list2 != null && !list2.isEmpty()) {
                        c25120.m55142(i4, list2);
                    }
                    break;
                case 29:
                    C10606.m24403(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 30:
                    C10606.m24417(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 31:
                    C10606.m24422(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 32:
                    C10606.m24407(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 33:
                    C10606.m24406(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 34:
                    C10606.m24415(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, false);
                    break;
                case 35:
                    C10606.m24412(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 36:
                    C10606.m24414(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 37:
                    C10606.m24405(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 38:
                    C10606.m24404(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 39:
                    C10606.m24424(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 40:
                    C10606.m24419(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 41:
                    C10606.m24421(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 42:
                    C10606.m24400(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 43:
                    C10606.m24403(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 44:
                    C10606.m24417(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C10606.m24422(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 46:
                    C10606.m24407(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 47:
                    C10606.m24406(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 48:
                    C10606.m24415(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, true);
                    break;
                case 49:
                    C10606.m24399(iArr[length], (List) C22558.m50565(iM37447 & 1048575, obj), interfaceC8672, m37448(length));
                    break;
                case 50:
                    Object objM50565 = C22558.m50565(iM37447 & 1048575, obj);
                    if (objM50565 != null) {
                        Object objM37442 = m37442(length);
                        InterfaceC12479 interfaceC12479 = this.f48498;
                        interfaceC12479.mo28731(objM37442);
                        c25120.m55143(i, interfaceC12479.mo28736(objM50565));
                    }
                    break;
                case 51:
                    if (m37437(i, length, obj)) {
                        c25120.m55136(i, ((Double) C22558.m50565(iM37447 & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m37437(i, length, obj)) {
                        c25120.m55134(((Float) C22558.m50565(iM37447 & 1048575, obj)).floatValue(), i);
                    }
                    break;
                case 53:
                    if (m37437(i, length, obj)) {
                        c25120.m55154(i, m37441(iM37447 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m37437(i, length, obj)) {
                        c25120.m55167(i, m37441(iM37447 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m37437(i, length, obj)) {
                        c25120.m55162(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m37437(i, length, obj)) {
                        c25120.m55138(i, m37441(iM37447 & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m37437(i, length, obj)) {
                        c25120.m55153(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m37437(i, length, obj)) {
                        c25120.m55145(i, ((Boolean) C22558.m50565(iM37447 & 1048575, obj)).booleanValue());
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m37437(i, length, obj)) {
                        m37432(i, C22558.m50565(iM37447 & 1048575, obj), interfaceC8672);
                    }
                    break;
                case 60:
                    if (m37437(i, length, obj)) {
                        c25120.m55156(i, C22558.m50565(iM37447 & 1048575, obj), m37448(length));
                    }
                    break;
                case 61:
                    if (m37437(i, length, obj)) {
                        c25120.m55144(i, (AbstractC7962) C22558.m50565(iM37447 & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m37437(i, length, obj)) {
                        c25120.m55159(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m37437(i, length, obj)) {
                        c25120.m55137(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m37437(i, length, obj)) {
                        c25120.m55169(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m37437(i, length, obj)) {
                        c25120.m55163(i, m37441(iM37447 & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m37437(i, length, obj)) {
                        c25120.m55166(i, m37428(iM37447 & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m37437(i, length, obj)) {
                        c25120.m55170(i, m37441(iM37447 & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m37437(i, length, obj)) {
                        c25120.m55140(i, C22558.m50565(iM37447 & 1048575, obj), m37448(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ۧ */
    private void m37446(Object obj, InterfaceC8672 interfaceC8672) {
        Map.Entry entry;
        Iterator itM46614;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Map.Entry entry3;
        int[] iArr;
        int i4;
        boolean z = this.f48494;
        AbstractC18612 abstractC18612 = this.f48495;
        if (z) {
            C20625 c20625Mo42349 = abstractC18612.mo42349(obj);
            if (c20625Mo42349.m46619()) {
                entry = null;
                itM46614 = null;
            } else {
                itM46614 = c20625Mo42349.m46614();
                entry = (Map.Entry) itM46614.next();
            }
        } else {
            entry = null;
            itM46614 = null;
        }
        Iterator it = itM46614;
        int[] iArr2 = this.f48484;
        int length = iArr2.length;
        Unsafe unsafe = f48483;
        int i5 = 1048575;
        int i6 = 0;
        C16501 c16501 = this;
        int i7 = 0;
        while (i7 < length) {
            int iM37447 = c16501.m37447(i7);
            int i8 = iArr2[i7];
            int iM37453 = m37453(iM37447);
            if (iM37453 <= 17) {
                int i9 = iArr2[i7 + 2];
                Map.Entry entry4 = entry;
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
                entry2 = entry4;
            } else {
                i = i5;
                i2 = i6;
                entry2 = entry;
                i3 = 0;
            }
            while (entry2 != null && abstractC18612.mo42346(entry2) <= i8) {
                abstractC18612.mo42351(interfaceC8672, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iM37447 & 1048575;
            switch (iM37453) {
                case 0:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55136(i8, C22558.m50572(j, obj));
                    }
                    break;
                case 1:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55134(C22558.m50585(j, obj), i8);
                    }
                    c16501 = this;
                    break;
                case 2:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55154(i8, unsafe.getLong(obj, j));
                    }
                    c16501 = this;
                    break;
                case 3:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55167(i8, unsafe.getLong(obj, j));
                    }
                    c16501 = this;
                    break;
                case 4:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55162(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 5:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55138(i8, unsafe.getLong(obj, j));
                    }
                    c16501 = this;
                    break;
                case 6:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55153(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 7:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55145(i8, C22558.m50579(j, obj));
                    }
                    c16501 = this;
                    break;
                case 8:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        m37432(i8, unsafe.getObject(obj, j), interfaceC8672);
                    }
                    c16501 = this;
                    break;
                case 9:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55156(i8, unsafe.getObject(obj, j), c16501.m37448(i7));
                    }
                    break;
                case 10:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55144(i8, (AbstractC7962) unsafe.getObject(obj, j));
                    }
                    c16501 = this;
                    break;
                case 11:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55159(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 12:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55137(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 13:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55169(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 14:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55163(i8, unsafe.getLong(obj, j));
                    }
                    c16501 = this;
                    break;
                case 15:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55166(i8, unsafe.getInt(obj, j));
                    }
                    c16501 = this;
                    break;
                case 16:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55170(i8, unsafe.getLong(obj, j));
                    }
                    c16501 = this;
                    break;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    entry3 = entry2;
                    if (c16501.m37439(obj, i7, i, i2, i3)) {
                        ((C25120) interfaceC8672).m55140(i8, unsafe.getObject(obj, j), c16501.m37448(i7));
                    }
                    break;
                case 18:
                    C10606.m24412(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 19:
                    C10606.m24414(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 20:
                    C10606.m24405(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 21:
                    C10606.m24404(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 22:
                    C10606.m24424(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 23:
                    C10606.m24419(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 24:
                    C10606.m24421(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 25:
                    C10606.m24400(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 26:
                    int i11 = iArr2[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = C10606.f29361;
                    if (list != null && !list.isEmpty()) {
                        ((C25120) interfaceC8672).m55157(i11, list);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 27:
                    C10606.m24411(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, c16501.m37448(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 28:
                    int i13 = iArr2[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = C10606.f29361;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C25120) interfaceC8672).m55142(i13, list2);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 29:
                    C10606.m24403(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 30:
                    C10606.m24417(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 31:
                    C10606.m24422(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 32:
                    C10606.m24407(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 33:
                    C10606.m24406(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 34:
                    C10606.m24415(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 35:
                    C10606.m24412(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 36:
                    C10606.m24414(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 37:
                    C10606.m24405(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 38:
                    C10606.m24404(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 39:
                    C10606.m24424(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 40:
                    C10606.m24419(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 41:
                    C10606.m24421(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 42:
                    C10606.m24400(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 43:
                    C10606.m24403(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 44:
                    C10606.m24417(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C10606.m24422(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 46:
                    C10606.m24407(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 47:
                    C10606.m24406(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 48:
                    C10606.m24415(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 49:
                    C10606.m24399(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC8672, c16501.m37448(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objM37442 = c16501.m37442(i7);
                        InterfaceC12479 interfaceC12479 = c16501.f48498;
                        interfaceC12479.mo28731(objM37442);
                        ((C25120) interfaceC8672).m55143(i8, interfaceC12479.mo28736(object));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 51:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55136(i8, ((Double) C22558.m50565(j, obj)).doubleValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 52:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55134(((Float) C22558.m50565(j, obj)).floatValue(), i8);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 53:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55154(i8, m37441(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55167(i8, m37441(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55162(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 56:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55138(i8, m37441(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 57:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55153(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55145(i8, ((Boolean) C22558.m50565(j, obj)).booleanValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c16501.m37437(i8, i7, obj)) {
                        m37432(i8, unsafe.getObject(obj, j), interfaceC8672);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 60:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55156(i8, unsafe.getObject(obj, j), c16501.m37448(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 61:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55144(i8, (AbstractC7962) unsafe.getObject(obj, j));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 62:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55159(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 63:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55137(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 64:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55169(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 65:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55163(i8, m37441(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 66:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55166(i8, m37428(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 67:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55170(i8, m37441(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 68:
                    if (c16501.m37437(i8, i7, obj)) {
                        ((C25120) interfaceC8672).m55140(i8, unsafe.getObject(obj, j), c16501.m37448(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                default:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            iArr2 = iArr;
            length = i4;
            entry = entry3;
        }
        while (entry != null) {
            abstractC18612.mo42351(interfaceC8672, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        AbstractC18533 abstractC18533 = c16501.f48496;
        abstractC18533.mo9318(abstractC18533.mo9315(obj), interfaceC8672);
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0610 A[Catch: all -> 0x0657, TRY_LEAVE, TryCatch #12 {all -> 0x0657, blocks: (B:217:0x060a, B:219:0x0610), top: B:261:0x060a }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0618 A[LOOP:4: B:221:0x0616->B:222:0x0618, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x062b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x062d A[Catch: all -> 0x0601, TRY_ENTER, TryCatch #3 {all -> 0x0601, blocks: (B:203:0x05e0, B:226:0x062d, B:227:0x0631), top: B:253:0x05e0 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0639 A[LOOP:5: B:229:0x0637->B:230:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0668 A[LOOP:3: B:242:0x0666->B:243:0x0668, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x067a  */
    /* JADX WARN: Code duplicated, block: B:291:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26211(Object obj, InterfaceC12618 interfaceC12618, C19283 c19283) throws Throwable {
        Object obj2;
        int i;
        int[] iArr;
        AbstractC18533 abstractC18533;
        Object obj3;
        Object objMo9307;
        int i2;
        Object obj4;
        C20625 c20625Mo42354;
        C19283 c19284;
        Object obj5;
        Object obj6;
        Object objM24396;
        C16501 c16501 = this;
        Object obj7 = obj;
        C19283 c19285 = c19283;
        c19283.getClass();
        m37452(obj);
        AbstractC18533 abstractC18534 = c16501.f48496;
        int[] iArr2 = c16501.f48491;
        int i3 = c16501.f48486;
        int i4 = c16501.f48490;
        C20625 c20625 = null;
        Object objMo9308 = null;
        while (true) {
            try {
                int iMo8900 = interfaceC12618.mo8900();
                if (iMo8900 < c16501.f48488 || iMo8900 > c16501.f48489) {
                    i2 = -1;
                } else {
                    int[] iArr3 = c16501.f48484;
                    int length = (iArr3.length / 3) - 1;
                    int i5 = 0;
                    while (true) {
                        if (i5 <= length) {
                            int i6 = (length + i5) >>> 1;
                            int i7 = i6 * 3;
                            int i8 = length;
                            int i9 = iArr3[i7];
                            if (iMo8900 == i9) {
                                i2 = i7;
                            } else if (iMo8900 < i9) {
                                length = i6 - 1;
                            } else {
                                i5 = i6 + 1;
                                length = i8;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                }
                if (i2 >= 0) {
                    obj2 = objMo9308;
                    i = i3;
                    iArr = iArr2;
                    abstractC18533 = abstractC18534;
                    c16501 = this;
                    obj3 = obj7;
                    try {
                        int iM37447 = c16501.m37447(i2);
                        try {
                            int iM37453 = m37453(iM37447);
                            AbstractC2951 abstractC2951 = c16501.f48499;
                            switch (iM37453) {
                                case 0:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50558(obj3, m37454(iM37447), interfaceC12618.readDouble());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 1:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50559(obj3, m37454(iM37447), interfaceC12618.readFloat());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 2:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50560(obj3, m37454(iM37447), interfaceC12618.mo8902());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 3:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50560(obj3, m37454(iM37447), interfaceC12618.mo8907());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 4:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50554(interfaceC12618.mo8928(), m37454(iM37447), obj3);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 5:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50560(obj3, m37454(iM37447), interfaceC12618.mo8892());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 6:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50554(interfaceC12618.mo8905(), m37454(iM37447), obj3);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 7:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50576(obj3, m37454(iM37447), interfaceC12618.mo8913());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 8:
                                    i4 = i4;
                                    c19284 = c19285;
                                    c16501.m37436(obj3, iM37447, interfaceC12618);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 9:
                                    i4 = i4;
                                    c19284 = c19285;
                                    InterfaceC10467 interfaceC10467 = (InterfaceC10467) c16501.m37444(i2, obj3);
                                    interfaceC12618.mo8910(interfaceC10467, c16501.m37448(i2), c19284);
                                    c16501.m37451(i2, obj3, interfaceC10467);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 10:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50555(m37454(iM37447), obj3, interfaceC12618.mo8903());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 11:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50554(interfaceC12618.mo8922(), m37454(iM37447), obj3);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 12:
                                    i4 = i4;
                                    c19284 = c19285;
                                    int iMo8914 = interfaceC12618.mo8914();
                                    InterfaceC14331 interfaceC14331M37429 = c16501.m37429(i2);
                                    if (interfaceC14331M37429 == null || interfaceC14331M37429.mo20899(iMo8914)) {
                                        C22558.m50554(iMo8914, iM37447 & 1048575, obj3);
                                        c16501.m37450(i2, obj3);
                                        objM24396 = obj2;
                                    } else {
                                        objM24396 = C10606.m24396(obj3, iMo8900, iMo8914, obj2, abstractC18533);
                                    }
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 13:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50554(interfaceC12618.mo8889(), iM37447 & 1048575, obj3);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 14:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50560(obj3, iM37447 & 1048575, interfaceC12618.mo8918());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 15:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50554(interfaceC12618.mo8930(), iM37447 & 1048575, obj3);
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 16:
                                    i4 = i4;
                                    c19284 = c19285;
                                    C22558.m50560(obj3, iM37447 & 1048575, interfaceC12618.mo8916());
                                    c16501.m37450(i2, obj3);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 17:
                                    i4 = i4;
                                    c19284 = c19285;
                                    InterfaceC10467 interfaceC10468 = (InterfaceC10467) c16501.m37444(i2, obj3);
                                    interfaceC12618.mo8894(interfaceC10468, c16501.m37448(i2), c19284);
                                    c16501.m37451(i2, obj3, interfaceC10468);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 18:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8890(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 19:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8925(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 20:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8923(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 21:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8919(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 22:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8917(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 23:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8904(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 24:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8899(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 25:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8915(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 26:
                                    i4 = i4;
                                    c19284 = c19285;
                                    if ((536870912 & iM37447) != 0) {
                                        interfaceC12618.mo8931(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    } else {
                                        interfaceC12618.mo8901(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    }
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 27:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8912(abstractC2951.mo4878(iM37447 & 1048575, obj3), c16501.m37448(i2), c19284);
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 28:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8926(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 29:
                                    i4 = i4;
                                    c19284 = c19285;
                                    interfaceC12618.mo8908(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 30:
                                    i4 = i4;
                                    c19284 = c19285;
                                    List listMo4878 = abstractC2951.mo4878(iM37447 & 1048575, obj3);
                                    interfaceC12618.mo8921(listMo4878);
                                    objM24396 = C10606.m24397(obj, iMo8900, listMo4878, c16501.m37429(i2), obj2, abstractC18533);
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 31:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8895(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 32:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8906(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 33:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8929(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 34:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8911(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 35:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8890(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 36:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8925(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 37:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8923(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 38:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8919(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 39:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8917(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 40:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8904(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 41:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8899(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 42:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8915(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 43:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8908(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 44:
                                    i4 = i4;
                                    c19284 = c19285;
                                    try {
                                        List listMo4879 = abstractC2951.mo4878(iM37447 & 1048575, obj3);
                                        interfaceC12618.mo8921(listMo4879);
                                        objMo9307 = obj2;
                                        try {
                                            objM24396 = C10606.m24397(obj, iMo8900, listMo4879, c16501.m37429(i2), obj2, abstractC18533);
                                            objMo9307 = objM24396;
                                        } catch (C9637 unused) {
                                            obj2 = objMo9307;
                                            objMo9307 = obj2;
                                            try {
                                                if (abstractC18533.mo9314(interfaceC12618)) {
                                                    if (objMo9307 == null) {
                                                        objMo9307 = abstractC18533.mo9307(obj3);
                                                    }
                                                    if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                        while (i4 < i) {
                                                            m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                            i4++;
                                                        }
                                                        if (objMo9307 == null) {
                                                            return;
                                                        }
                                                        abstractC18533.mo9317(obj3, objMo9307);
                                                        return;
                                                    }
                                                } else if (!interfaceC12618.mo8927()) {
                                                    while (i4 < i) {
                                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                        i4++;
                                                    }
                                                    if (objMo9307 == null) {
                                                        return;
                                                    }
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                obj2 = objMo9307;
                                                objMo9307 = obj2;
                                                while (i4 < i) {
                                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                    i4++;
                                                }
                                                if (objMo9307 != null) {
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = objMo9307;
                                            objMo9307 = obj2;
                                            while (i4 < i) {
                                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                i4++;
                                            }
                                            if (objMo9307 != null) {
                                                abstractC18533.mo9317(obj3, objMo9307);
                                            }
                                            throw th;
                                        }
                                    } catch (C9637 unused2) {
                                        objMo9307 = obj2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objMo9307 = obj2;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8895(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 46:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8906(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 47:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8929(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 48:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    interfaceC12618.mo8911(abstractC2951.mo4878(iM37447 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 49:
                                    i4 = i4;
                                    c19284 = c19285;
                                    obj6 = obj2;
                                    try {
                                        interfaceC12618.mo8896(abstractC2951.mo4878(iM37447 & 1048575, obj3), c16501.m37448(i2), c19284);
                                        obj2 = obj6;
                                        objM24396 = obj2;
                                        objMo9307 = objM24396;
                                    } catch (C9637 unused3) {
                                        obj2 = obj6;
                                        objMo9307 = obj2;
                                        if (abstractC18533.mo9314(interfaceC12618)) {
                                            if (objMo9307 == null) {
                                                objMo9307 = abstractC18533.mo9307(obj3);
                                            }
                                            if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                while (i4 < i) {
                                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                    i4++;
                                                }
                                                if (objMo9307 == null) {
                                                    return;
                                                }
                                                abstractC18533.mo9317(obj3, objMo9307);
                                                return;
                                            }
                                        } else if (!interfaceC12618.mo8927()) {
                                            while (i4 < i) {
                                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                i4++;
                                            }
                                            if (objMo9307 == null) {
                                                return;
                                            }
                                            abstractC18533.mo9317(obj3, objMo9307);
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj6;
                                        objMo9307 = obj2;
                                        while (i4 < i) {
                                            m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                            i4++;
                                        }
                                        if (objMo9307 != null) {
                                            abstractC18533.mo9317(obj3, objMo9307);
                                        }
                                        throw th;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 50:
                                    try {
                                        obj5 = obj2;
                                        i4 = i4;
                                        C19283 c19286 = c19285;
                                        try {
                                            m37435(obj, i2, c16501.m37442(i2), c19283, interfaceC12618);
                                            throw null;
                                        } catch (C9637 unused4) {
                                            obj6 = obj5;
                                            c19284 = c19286;
                                            obj2 = obj6;
                                            objMo9307 = obj2;
                                            if (abstractC18533.mo9314(interfaceC12618)) {
                                                if (!interfaceC12618.mo8927()) {
                                                    while (i4 < i) {
                                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                        i4++;
                                                    }
                                                    if (objMo9307 == null) {
                                                        return;
                                                    }
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo9308 = objMo9307;
                                                c19285 = c19284;
                                                iArr2 = iArr;
                                                abstractC18534 = abstractC18533;
                                                i3 = i;
                                            } else {
                                                if (objMo9307 == null) {
                                                    objMo9307 = abstractC18533.mo9307(obj3);
                                                }
                                                if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                    while (i4 < i) {
                                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                        i4++;
                                                    }
                                                    if (objMo9307 == null) {
                                                        return;
                                                    }
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo9308 = objMo9307;
                                                c19285 = c19284;
                                                iArr2 = iArr;
                                                abstractC18534 = abstractC18533;
                                                i3 = i;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj6 = obj5;
                                            obj2 = obj6;
                                            objMo9307 = obj2;
                                            while (i4 < i) {
                                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                i4++;
                                            }
                                            if (objMo9307 != null) {
                                                abstractC18533.mo9317(obj3, objMo9307);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj5 = obj2;
                                        i4 = i4;
                                    }
                                    break;
                                case 51:
                                    C22558.m50555(iM37447 & 1048575, obj3, Double.valueOf(interfaceC12618.readDouble()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 52:
                                    C22558.m50555(iM37447 & 1048575, obj3, Float.valueOf(interfaceC12618.readFloat()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 53:
                                    C22558.m50555(iM37447 & 1048575, obj3, Long.valueOf(interfaceC12618.mo8902()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    C22558.m50555(iM37447 & 1048575, obj3, Long.valueOf(interfaceC12618.mo8907()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(interfaceC12618.mo8928()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 56:
                                    C22558.m50555(iM37447 & 1048575, obj3, Long.valueOf(interfaceC12618.mo8892()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 57:
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(interfaceC12618.mo8905()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    C22558.m50555(iM37447 & 1048575, obj3, Boolean.valueOf(interfaceC12618.mo8913()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    c16501.m37436(obj3, iM37447, interfaceC12618);
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 60:
                                    InterfaceC10467 interfaceC10469 = (InterfaceC10467) c16501.m37443(iMo8900, i2, obj3);
                                    interfaceC12618.mo8910(interfaceC10469, c16501.m37448(i2), c19285);
                                    c16501.m37433(obj3, iMo8900, i2, interfaceC10469);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 61:
                                    C22558.m50555(iM37447 & 1048575, obj3, interfaceC12618.mo8903());
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 62:
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(interfaceC12618.mo8922()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 63:
                                    int iMo8915 = interfaceC12618.mo8914();
                                    InterfaceC14331 interfaceC14331M374210 = c16501.m37429(i2);
                                    if (interfaceC14331M374210 != null && !interfaceC14331M374210.mo20899(iMo8915)) {
                                        objMo9307 = C10606.m24396(obj3, iMo8900, iMo8915, obj2, abstractC18533);
                                        i4 = i4;
                                        c19284 = c19285;
                                        objM24396 = objMo9307;
                                        objMo9307 = objM24396;
                                        obj7 = obj3;
                                        i4 = i4;
                                        objMo9308 = objMo9307;
                                        c19285 = c19284;
                                        iArr2 = iArr;
                                        abstractC18534 = abstractC18533;
                                        i3 = i;
                                    }
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(iMo8915));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 64:
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(interfaceC12618.mo8889()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 65:
                                    C22558.m50555(iM37447 & 1048575, obj3, Long.valueOf(interfaceC12618.mo8918()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 66:
                                    C22558.m50555(iM37447 & 1048575, obj3, Integer.valueOf(interfaceC12618.mo8930()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 67:
                                    C22558.m50555(iM37447 & 1048575, obj3, Long.valueOf(interfaceC12618.mo8916()));
                                    c16501.m37449(iMo8900, i2, obj3);
                                    i4 = i4;
                                    c19284 = c19285;
                                    objM24396 = obj2;
                                    objMo9307 = objM24396;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                case 68:
                                    try {
                                        InterfaceC10467 interfaceC104610 = (InterfaceC10467) c16501.m37443(iMo8900, i2, obj3);
                                        interfaceC12618.mo8894(interfaceC104610, c16501.m37448(i2), c19285);
                                        c16501.m37433(obj3, iMo8900, i2, interfaceC104610);
                                        i4 = i4;
                                        c19284 = c19285;
                                        objM24396 = obj2;
                                        objMo9307 = objM24396;
                                    } catch (C9637 unused5) {
                                        objMo9307 = obj2;
                                        i4 = i4;
                                        c19284 = c19285;
                                        if (abstractC18533.mo9314(interfaceC12618)) {
                                            if (objMo9307 == null) {
                                                objMo9307 = abstractC18533.mo9307(obj3);
                                            }
                                            if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                while (i4 < i) {
                                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                    i4++;
                                                }
                                                if (objMo9307 == null) {
                                                    return;
                                                }
                                                abstractC18533.mo9317(obj3, objMo9307);
                                                return;
                                            }
                                        } else if (!interfaceC12618.mo8927()) {
                                            while (i4 < i) {
                                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                i4++;
                                            }
                                            if (objMo9307 == null) {
                                                return;
                                            }
                                            abstractC18533.mo9317(obj3, objMo9307);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                                default:
                                    i4 = i4;
                                    c19284 = c19285;
                                    if (obj2 == null) {
                                        try {
                                            objMo9307 = abstractC18533.mo9307(obj3);
                                        } catch (C9637 unused6) {
                                            objMo9307 = obj2;
                                            if (abstractC18533.mo9314(interfaceC12618)) {
                                                if (!interfaceC12618.mo8927()) {
                                                    while (i4 < i) {
                                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                        i4++;
                                                    }
                                                    if (objMo9307 == null) {
                                                        return;
                                                    }
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo9308 = objMo9307;
                                                c19285 = c19284;
                                                iArr2 = iArr;
                                                abstractC18534 = abstractC18533;
                                                i3 = i;
                                            } else {
                                                if (objMo9307 == null) {
                                                    objMo9307 = abstractC18533.mo9307(obj3);
                                                }
                                                if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                    while (i4 < i) {
                                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                        i4++;
                                                    }
                                                    if (objMo9307 == null) {
                                                        return;
                                                    }
                                                    abstractC18533.mo9317(obj3, objMo9307);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo9308 = objMo9307;
                                                c19285 = c19284;
                                                iArr2 = iArr;
                                                abstractC18534 = abstractC18533;
                                                i3 = i;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            objMo9307 = obj2;
                                        }
                                    } else {
                                        objMo9307 = obj2;
                                    }
                                    try {
                                        try {
                                            if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                while (i4 < i) {
                                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                    i4++;
                                                }
                                                if (objMo9307 == null) {
                                                    return;
                                                }
                                                abstractC18533.mo9317(obj3, objMo9307);
                                                return;
                                            }
                                            objM24396 = objMo9307;
                                            objMo9307 = objM24396;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                        break;
                                    } catch (C9637 unused7) {
                                        if (abstractC18533.mo9314(interfaceC12618)) {
                                            if (objMo9307 == null) {
                                                objMo9307 = abstractC18533.mo9307(obj3);
                                            }
                                            if (!abstractC18533.m42136(objMo9307, interfaceC12618)) {
                                                while (i4 < i) {
                                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                    i4++;
                                                }
                                                if (objMo9307 == null) {
                                                    return;
                                                }
                                                abstractC18533.mo9317(obj3, objMo9307);
                                                return;
                                            }
                                        } else if (!interfaceC12618.mo8927()) {
                                            while (i4 < i) {
                                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                                i4++;
                                            }
                                            if (objMo9307 == null) {
                                                return;
                                            }
                                            abstractC18533.mo9317(obj3, objMo9307);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo9308 = objMo9307;
                                    c19285 = c19284;
                                    iArr2 = iArr;
                                    abstractC18534 = abstractC18533;
                                    i3 = i;
                                    break;
                            }
                        } catch (C9637 unused8) {
                            i4 = i4;
                            c19284 = c19285;
                        } catch (Throwable th9) {
                            th = th9;
                            i4 = i4;
                            objMo9307 = obj2;
                            while (i4 < i) {
                                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                i4++;
                            }
                            if (objMo9307 != null) {
                                abstractC18533.mo9317(obj3, objMo9307);
                            }
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    if (iMo8900 == Integer.MAX_VALUE) {
                        for (int i10 = i4; i10 < i3; i10++) {
                            m37434(obj, iArr2[i10], objMo9308, abstractC18534, obj);
                        }
                        if (objMo9308 != null) {
                            abstractC18534.mo9317(obj7, objMo9308);
                            return;
                        }
                        return;
                    }
                    try {
                        boolean z = c16501.f48494;
                        AbstractC18612 abstractC18612 = c16501.f48495;
                        Object objMo42348 = !z ? null : abstractC18612.mo42348(c19285, c16501.f48493, iMo8900);
                        if (objMo42348 != null) {
                            if (c20625 == null) {
                                try {
                                    c20625Mo42354 = abstractC18612.mo42354(obj7);
                                } catch (Throwable th11) {
                                    th = th11;
                                    i = i3;
                                    iArr = iArr2;
                                    abstractC18533 = abstractC18534;
                                    i4 = i4;
                                    objMo9307 = objMo9308;
                                    obj3 = obj7;
                                    obj2 = objMo9307;
                                    objMo9307 = obj2;
                                    while (i4 < i) {
                                        m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                        i4++;
                                    }
                                    if (objMo9307 != null) {
                                        abstractC18533.mo9317(obj3, objMo9307);
                                    }
                                    throw th;
                                }
                            } else {
                                c20625Mo42354 = c20625;
                            }
                            obj2 = objMo9308;
                            Object obj8 = objMo42348;
                            i = i3;
                            iArr = iArr2;
                            AbstractC18533 abstractC18535 = abstractC18534;
                            obj4 = obj7;
                            try {
                                objMo9308 = abstractC18612.mo42347(obj, interfaceC12618, obj8, c19283, c20625Mo42354, obj2, abstractC18535);
                                abstractC18534 = abstractC18535;
                                c20625 = c20625Mo42354;
                            } catch (Throwable th12) {
                                th = th12;
                                abstractC18533 = abstractC18535;
                                i = i;
                                obj3 = obj4;
                                objMo9307 = obj2;
                                while (i4 < i) {
                                    m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                    i4++;
                                }
                                if (objMo9307 != null) {
                                    abstractC18533.mo9317(obj3, objMo9307);
                                }
                                throw th;
                            }
                        } else {
                            Object obj9 = objMo9308;
                            i = i3;
                            iArr = iArr2;
                            abstractC18533 = abstractC18534;
                            obj4 = obj7;
                            try {
                                if (abstractC18533.mo9314(interfaceC12618)) {
                                    objMo9308 = obj9;
                                    if (interfaceC12618.mo8927()) {
                                        abstractC18534 = abstractC18533;
                                    }
                                } else {
                                    objMo9308 = obj9 == null ? abstractC18533.mo9307(obj4) : obj9;
                                    try {
                                        if (!abstractC18533.m42136(objMo9308, interfaceC12618)) {
                                        }
                                        abstractC18534 = abstractC18533;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = objMo9308;
                                        obj3 = obj4;
                                        objMo9307 = obj2;
                                        while (i4 < i) {
                                            m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                                            i4++;
                                        }
                                        if (objMo9307 != null) {
                                            abstractC18533.mo9317(obj3, objMo9307);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                objMo9308 = obj9;
                            }
                        }
                        i3 = i;
                        obj7 = obj4;
                        iArr2 = iArr;
                        c16501 = this;
                    } catch (Throwable th15) {
                        th = th15;
                        obj2 = objMo9308;
                        i = i3;
                        iArr = iArr2;
                        abstractC18533 = abstractC18534;
                        obj4 = obj7;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = objMo9308;
                i = i3;
                iArr = iArr2;
                abstractC18533 = abstractC18534;
                obj3 = obj7;
            }
            while (i4 < i) {
                m37434(obj, iArr[i4], objMo9307, abstractC18533, obj);
                i4++;
            }
            if (objMo9307 != null) {
                abstractC18533.mo9317(obj3, objMo9307);
            }
            throw th;
        }
        int i11 = i4;
        while (i11 < i) {
            AbstractC18533 abstractC18536 = abstractC18533;
            m37434(obj, iArr[i11], objMo9308, abstractC18536, obj);
            i11++;
            abstractC18533 = abstractC18536;
            i = i;
        }
        AbstractC18533 abstractC18537 = abstractC18533;
        if (objMo9308 != null) {
            abstractC18537.mo9317(obj4, objMo9308);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private InterfaceC11277 m37448(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f48485;
        InterfaceC11277 interfaceC11277 = (InterfaceC11277) objArr[i2];
        if (interfaceC11277 != null) {
            return interfaceC11277;
        }
        InterfaceC11277 interfaceC11277M30099 = C13150.m30098().m30099((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC11277M30099;
        return interfaceC11277M30099;
    }

    /* JADX INFO: renamed from: ۧ */
    private Object m37442(int i) {
        return this.f48485[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC14331 m37429(int i) {
        return (InterfaceC14331) this.f48485[((i / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: ۧ */
    private Object m37444(int i, Object obj) {
        InterfaceC11277 interfaceC11277M37448 = m37448(i);
        long jM37447 = m37447(i) & 1048575;
        if (!m37438(i, obj)) {
            return interfaceC11277M37448.mo26207();
        }
        Object object = f48483.getObject(obj, jM37447);
        if (m37455(object)) {
            return object;
        }
        Object objMo26207 = interfaceC11277M37448.mo26207();
        if (object != null) {
            interfaceC11277M37448.mo26209(objMo26207, object);
        }
        return objMo26207;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37451(int i, Object obj, Object obj2) {
        f48483.putObject(obj, m37447(i) & 1048575, obj2);
        m37450(i, obj);
    }

    /* JADX INFO: renamed from: ۧ */
    private Object m37443(int i, int i2, Object obj) {
        InterfaceC11277 interfaceC11277M37448 = m37448(i2);
        if (!m37437(i, i2, obj)) {
            return interfaceC11277M37448.mo26207();
        }
        Object object = f48483.getObject(obj, m37447(i2) & 1048575);
        if (m37455(object)) {
            return object;
        }
        Object objMo26207 = interfaceC11277M37448.mo26207();
        if (object != null) {
            interfaceC11277M37448.mo26209(objMo26207, object);
        }
        return objMo26207;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37433(Object obj, int i, int i2, Object obj2) {
        f48483.putObject(obj, m37447(i2) & 1048575, obj2);
        m37449(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ֫ */
    public final void mo26208(Object obj) {
        if (m37455(obj)) {
            if (obj instanceof AbstractC23049) {
                AbstractC23049 abstractC23049 = (AbstractC23049) obj;
                abstractC23049.setMemoizedSerializedSize(Integer.MAX_VALUE);
                abstractC23049.memoizedHashCode = 0;
                abstractC23049.m51431();
            }
            int[] iArr = this.f48484;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM37447 = m37447(i);
                long j = 1048575 & iM37447;
                int iM37453 = m37453(iM37447);
                if (iM37453 != 9) {
                    if (iM37453 != 60 && iM37453 != 68) {
                        switch (iM37453) {
                            case 17:
                                if (m37438(i, obj)) {
                                    m37448(i).mo26208(f48483.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f48499.mo4876(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f48483;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f48498.mo28735(object));
                                }
                                break;
                        }
                    } else if (m37437(iArr[i], i, obj)) {
                        m37448(i).mo26208(f48483.getObject(obj, j));
                    }
                } else if (m37438(i, obj)) {
                    m37448(i).mo26208(f48483.getObject(obj, j));
                }
            }
            this.f48496.mo9322(obj);
            if (this.f48494) {
                this.f48495.mo42355(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m37435(Object obj, int i, Object obj2, C19283 c19283, InterfaceC12618 interfaceC12618) {
        long jM37447 = m37447(i) & 1048575;
        Object objM50565 = C22558.m50565(jM37447, obj);
        InterfaceC12479 interfaceC12479 = this.f48498;
        if (objM50565 == null) {
            objM50565 = interfaceC12479.mo28734(obj2);
            C22558.m50555(jM37447, obj, objM50565);
        } else if (interfaceC12479.mo28733(objM50565)) {
            Object objMo28734 = interfaceC12479.mo28734(obj2);
            interfaceC12479.mo28729(objMo28734, objM50565);
            C22558.m50555(jM37447, obj, objMo28734);
            objM50565 = objMo28734;
        }
        interfaceC12479.mo28732(objM50565);
        interfaceC12479.mo28731(obj2);
        interfaceC12618.mo8920();
        throw null;
    }

    @Override // p067l.InterfaceC11277
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo26213(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f48490) {
            int i6 = this.f48491[i5];
            int[] iArr = this.f48484;
            int i7 = iArr[i6];
            int iM37447 = m37447(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f48483.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iM37447) == 0 || m37439(obj, i6, i, i2, i10)) {
                int iM37453 = m37453(iM37447);
                if (iM37453 == 9 || iM37453 == 17) {
                    if (!m37439(obj, i6, i, i2, i10) || m37448(i6).mo26213(C22558.m50565(iM37447 & 1048575, obj))) {
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                } else {
                    if (iM37453 != 27) {
                        if (iM37453 == 60 || iM37453 == 68) {
                            if (!m37437(i7, i6, obj) || m37448(i6).mo26213(C22558.m50565(iM37447 & 1048575, obj))) {
                            }
                        } else if (iM37453 != 49) {
                            if (iM37453 != 50) {
                                continue;
                            } else {
                                Object objM50565 = C22558.m50565(iM37447 & 1048575, obj);
                                InterfaceC12479 interfaceC12479 = this.f48498;
                                if (!interfaceC12479.mo28736(objM50565).isEmpty()) {
                                    interfaceC12479.mo28731(m37442(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) C22558.m50565(iM37447 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC11277 interfaceC11277M37448 = m37448(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (interfaceC11277M37448.mo26213(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
        }
        return !this.f48494 || this.f48495.mo42349(obj).m46622();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37432(int i, Object obj, InterfaceC8672 interfaceC8672) {
        if (obj instanceof String) {
            ((C25120) interfaceC8672).m55141(i, (String) obj);
        } else {
            ((C25120) interfaceC8672).m55144(i, (AbstractC7962) obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37436(Object obj, int i, InterfaceC12618 interfaceC12618) {
        if ((536870912 & i) != 0) {
            C22558.m50555(i & 1048575, obj, interfaceC12618.mo8891());
        } else if (this.f48487) {
            C22558.m50555(i & 1048575, obj, interfaceC12618.mo8898());
        } else {
            C22558.m50555(i & 1048575, obj, interfaceC12618.mo8903());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m37434(Object obj, int i, Object obj2, AbstractC18533 abstractC18533, Object obj3) {
        InterfaceC14331 interfaceC14331M37429;
        int i2 = this.f48484[i];
        Object objM50565 = C22558.m50565(m37447(i) & 1048575, obj);
        if (objM50565 == null || (interfaceC14331M37429 = m37429(i)) == null) {
            return;
        }
        InterfaceC12479 interfaceC12479 = this.f48498;
        Map mapMo28732 = interfaceC12479.mo28732(objM50565);
        interfaceC12479.mo28731(m37442(i));
        for (Map.Entry entry : mapMo28732.entrySet()) {
            if (!interfaceC14331M37429.mo20899(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC18533.mo9307(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m37445(int i, Object obj, Object obj2) {
        int[] iArr = this.f48484;
        int i2 = iArr[i];
        if (m37437(i2, i, obj2)) {
            long jM37447 = m37447(i) & 1048575;
            Unsafe unsafe = f48483;
            Object object = unsafe.getObject(obj2, jM37447);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC11277 interfaceC11277M37448 = m37448(i);
            if (!m37437(i2, i, obj)) {
                if (!m37455(object)) {
                    unsafe.putObject(obj, jM37447, object);
                } else {
                    Object objMo26207 = interfaceC11277M37448.mo26207();
                    interfaceC11277M37448.mo26209(objMo26207, object);
                    unsafe.putObject(obj, jM37447, objMo26207);
                }
                m37449(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM37447);
            if (!m37455(object2)) {
                Object objMo26208 = interfaceC11277M37448.mo26207();
                interfaceC11277M37448.mo26209(objMo26208, object2);
                unsafe.putObject(obj, jM37447, objMo26208);
                object2 = objMo26208;
            }
            interfaceC11277M37448.mo26209(object2, object);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private int m37447(int i) {
        return this.f48484[i + 1];
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37437(int i, int i2, Object obj) {
        return C22558.m50564((long) (this.f48484[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37438(int i, Object obj) {
        boolean zEquals;
        int i2 = this.f48484[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM37447 = m37447(i);
            long j2 = iM37447 & 1048575;
            switch (m37453(iM37447)) {
                case 0:
                    if (Double.doubleToRawLongBits(C22558.m50572(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C22558.m50585(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C22558.m50584(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C22558.m50584(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C22558.m50584(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C22558.m50579(j2, obj);
                case 8:
                    Object objM50565 = C22558.m50565(j2, obj);
                    if (objM50565 instanceof String) {
                        zEquals = ((String) objM50565).isEmpty();
                    } else if (objM50565 instanceof AbstractC7962) {
                        zEquals = AbstractC7962.f20935.equals(objM50565);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return !zEquals;
                case 9:
                    if (C22558.m50565(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    zEquals = AbstractC7962.f20935.equals(C22558.m50565(j2, obj));
                    return !zEquals;
                case 11:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C22558.m50584(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C22558.m50564(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C22558.m50584(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C22558.m50565(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C22558.m50564(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37449(int i, int i2, Object obj) {
        C22558.m50554(i, this.f48484[i2 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37450(int i, Object obj) {
        int i2 = this.f48484[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C22558.m50554((1 << (i2 >>> 20)) | C22558.m50564(j, obj), j, obj);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m37455(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC23049) {
            return ((AbstractC23049) obj).m51430();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m37452(Object obj) {
        if (!m37455(obj)) {
            throw new IllegalArgumentException(C7470.m17246(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m37428(long j, Object obj) {
        return ((Integer) C22558.m50565(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m37441(long j, Object obj) {
        return ((Long) C22558.m50565(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37440(AbstractC23049 abstractC23049, AbstractC23049 abstractC230410, int i) {
        return m37438(i, (Object) abstractC23049) == m37438(i, (Object) abstractC230410);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m37439(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m37438(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
