package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܶ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14871 implements InterfaceC9374 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[] f45367 = new int[0];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f45368 = C21244.m48242();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f45369;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object[] f45370;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f45371;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f45372;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f45373;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f45374;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f45375;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f45376;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21928 f45377;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8522 f45378;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f45379;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC17092 f45380;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC17009 f45381;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f45382;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC10639 f45383;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC0613 f45384;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m35300(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m35301(int i) {
        return i & 1048575;
    }

    public C14871(int[] iArr, Object[] objArr, int i, int i2, InterfaceC8522 interfaceC8522, int[] iArr2, int i3, int i4, InterfaceC21928 interfaceC21928, AbstractC0613 abstractC0613, AbstractC17009 abstractC17009, AbstractC17092 abstractC17092, InterfaceC10639 interfaceC10639) {
        this.f45369 = iArr;
        this.f45370 = objArr;
        this.f45373 = i;
        this.f45374 = i2;
        this.f45372 = interfaceC8522 instanceof AbstractC21760;
        this.f45379 = abstractC17092 != null && abstractC17092.mo40108(interfaceC8522);
        this.f45382 = true;
        this.f45376 = iArr2;
        this.f45375 = i3;
        this.f45371 = i4;
        this.f45377 = interfaceC21928;
        this.f45384 = abstractC0613;
        this.f45381 = abstractC17009;
        this.f45380 = abstractC17092;
        this.f45378 = interfaceC8522;
        this.f45383 = interfaceC10639;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14871 m35277(InterfaceC6405 interfaceC6405, InterfaceC21928 interfaceC21928, AbstractC0613 abstractC0613, AbstractC17009 abstractC17009, AbstractC17092 abstractC17092, InterfaceC10639 interfaceC10639) {
        int iM36935;
        int iM36936;
        int i;
        int[] iArr;
        int i2;
        int iM3182;
        int i3;
        long jM48237;
        int iM48237;
        int iNumberOfTrailingZeros;
        int i4;
        int i5;
        int i6;
        Class clsM36929;
        int i7;
        if (!(interfaceC6405 instanceof C1612)) {
            C19957 c19957 = (C19957) interfaceC6405;
            C15680[] c15680ArrM46038 = c19957.m46038();
            if (c15680ArrM46038.length == 0) {
                iM36935 = 0;
                iM36936 = 0;
            } else {
                iM36935 = c15680ArrM46038[0].m36935();
                iM36936 = c15680ArrM46038[c15680ArrM46038.length - 1].m36935();
            }
            int length = c15680ArrM46038.length;
            int[] iArr2 = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            int i8 = 0;
            int i9 = 0;
            for (C15680 c15680 : c15680ArrM46038) {
                if (c15680.getType() == EnumC0864.f3403) {
                    i8++;
                } else if (c15680.getType().m3182() >= 18 && c15680.getType().m3182() <= 49) {
                    i9++;
                }
            }
            int[] iArr3 = i8 > 0 ? new int[i8] : null;
            int[] iArr4 = i9 > 0 ? new int[i9] : null;
            int[] iArrM46039 = c19957.m46039();
            int[] iArr5 = f45367;
            if (iArrM46039 == null) {
                iArrM46039 = iArr5;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i10 < c15680ArrM46038.length) {
                C15680 c15681 = c15680ArrM46038[i10];
                C15680[] c15680Arr = c15680ArrM46038;
                int iM36937 = c15681.m36935();
                C12755 c12755M36928 = c15681.m36928();
                if (c12755M36928 != null) {
                    iM3182 = c15681.getType().m3182() + 51;
                    i = iM36936;
                    iArr = iArr5;
                    int iM48238 = (int) C21244.m48237(c12755M36928.m31057());
                    jM48237 = C21244.m48237(c12755M36928.m31056());
                    i2 = i10;
                    i3 = iM48238;
                } else {
                    i = iM36936;
                    iArr = iArr5;
                    EnumC0864 type = c15681.getType();
                    i2 = i10;
                    int iM48239 = (int) C21244.m48237(c15681.m36932());
                    iM3182 = type.m3182();
                    if (!type.m3183() && !type.m3186()) {
                        Field fieldM36931 = c15681.m36931();
                        iM48237 = fieldM36931 == null ? 1048575 : (int) C21244.m48237(fieldM36931);
                        iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(c15681.m36933());
                        i4 = iM48239;
                    } else {
                        i3 = iM48239;
                        if (c15681.m36926() == null) {
                            iM48237 = 0;
                        } else {
                            jM48237 = C21244.m48237(c15681.m36926());
                        }
                        i4 = i3;
                        iNumberOfTrailingZeros = 0;
                    }
                    iArr2[i11] = c15681.m36935();
                    int i15 = i11 + 1;
                    if (c15681.m36925()) {
                        i5 = 536870912;
                    } else {
                        i5 = 0;
                    }
                    if (c15681.m36927()) {
                        i6 = 268435456;
                    } else {
                        i6 = 0;
                    }
                    iArr2[i15] = i5 | i6 | (iM3182 << 20) | i4;
                    iArr2[i11 + 2] = iM48237 | (iNumberOfTrailingZeros << 20);
                    clsM36929 = c15681.m36929();
                    if (c15681.m36934() != null) {
                        i7 = (i11 / 3) * 2;
                        objArr[i7] = c15681.m36934();
                        if (clsM36929 != null) {
                            objArr[i7 + 1] = clsM36929;
                        } else if (c15681.m36930() != null) {
                            objArr[i7 + 1] = c15681.m36930();
                        }
                    } else if (clsM36929 != null) {
                        objArr[((i11 / 3) * 2) + 1] = clsM36929;
                    } else if (c15681.m36930() != null) {
                        objArr[((i11 / 3) * 2) + 1] = c15681.m36930();
                    }
                    if (i12 < iArrM46039.length && iArrM46039[i12] == iM36937) {
                        iArrM46039[i12] = i11;
                        i12++;
                    }
                    if (c15681.getType() == EnumC0864.f3403) {
                        iArr3[i13] = i11;
                        i13++;
                    } else if (c15681.getType().m3182() < 18 && c15681.getType().m3182() <= 49) {
                        iArr4[i14] = (int) C21244.m48237(c15681.m36932());
                        i14++;
                    }
                    i10 = i2 + 1;
                    i11 += 3;
                    c15680ArrM46038 = c15680Arr;
                    iM36936 = i;
                    iArr5 = iArr;
                }
                iM48237 = (int) jM48237;
                i4 = i3;
                iNumberOfTrailingZeros = 0;
                iArr2[i11] = c15681.m36935();
                int i16 = i11 + 1;
                if (c15681.m36925()) {
                    i5 = 536870912;
                } else {
                    i5 = 0;
                }
                if (c15681.m36927()) {
                    i6 = 268435456;
                } else {
                    i6 = 0;
                }
                iArr2[i16] = i5 | i6 | (iM3182 << 20) | i4;
                iArr2[i11 + 2] = iM48237 | (iNumberOfTrailingZeros << 20);
                clsM36929 = c15681.m36929();
                if (c15681.m36934() != null) {
                    i7 = (i11 / 3) * 2;
                    objArr[i7] = c15681.m36934();
                    if (clsM36929 != null) {
                        objArr[i7 + 1] = clsM36929;
                    } else if (c15681.m36930() != null) {
                        objArr[i7 + 1] = c15681.m36930();
                    }
                } else if (clsM36929 != null) {
                    objArr[((i11 / 3) * 2) + 1] = clsM36929;
                } else if (c15681.m36930() != null) {
                    objArr[((i11 / 3) * 2) + 1] = c15681.m36930();
                }
                if (i12 < iArrM46039.length) {
                    iArrM46039[i12] = i11;
                    i12++;
                }
                if (c15681.getType() == EnumC0864.f3403) {
                    iArr3[i13] = i11;
                    i13++;
                } else if (c15681.getType().m3182() < 18) {
                }
                i10 = i2 + 1;
                i11 += 3;
                c15680ArrM46038 = c15680Arr;
                iM36936 = i;
                iArr5 = iArr;
            }
            int i17 = iM36936;
            int[] iArr6 = iArr5;
            if (iArr3 == null) {
                iArr3 = iArr6;
            }
            if (iArr4 == null) {
                iArr4 = iArr6;
            }
            int[] iArr7 = new int[iArrM46039.length + iArr3.length + iArr4.length];
            System.arraycopy(iArrM46039, 0, iArr7, 0, iArrM46039.length);
            System.arraycopy(iArr3, 0, iArr7, iArrM46039.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr7, iArrM46039.length + iArr3.length, iArr4.length);
            return new C14871(iArr2, objArr, iM36935, i17, c19957.mo17730(), iArr7, iArrM46039.length, iArrM46039.length + iArr3.length, interfaceC21928, abstractC0613, abstractC17009, abstractC17092, interfaceC10639);
        }
        throw null;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24197() {
        return this.f45377.mo12871(this.f45378);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24202(AbstractC21760 abstractC21760, AbstractC21760 abstractC21761) {
        int[] iArr = this.f45369;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM22433 = true;
            if (i >= length) {
                AbstractC17009 abstractC17009 = this.f45381;
                if (abstractC17009.mo7236(abstractC21760).equals(abstractC17009.mo7236(abstractC21761))) {
                    if (!this.f45379) {
                        return true;
                    }
                    AbstractC17092 abstractC17092 = this.f45380;
                    return abstractC17092.mo40104((Object) abstractC21760).equals(abstractC17092.mo40104((Object) abstractC21761));
                }
            } else {
                int iM35294 = m35294(i);
                long j = iM35294 & 1048575;
                switch (m35300(iM35294)) {
                    case 0:
                        if (!m35287(abstractC21760, abstractC21761, i) || Double.doubleToLongBits(C21244.m48241(j, abstractC21760)) != Double.doubleToLongBits(C21244.m48241(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                    case 1:
                        if (!m35287(abstractC21760, abstractC21761, i) || Float.floatToIntBits(C21244.m48254(j, abstractC21760)) != Float.floatToIntBits(C21244.m48254(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                    case 2:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48253(j, abstractC21760) != C21244.m48253(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 3:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48253(j, abstractC21760) != C21244.m48253(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 4:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 5:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48253(j, abstractC21760) != C21244.m48253(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 6:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 7:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48248(j, abstractC21760) != C21244.m48248(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 8:
                        if (!m35287(abstractC21760, abstractC21761, i) || !C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                    case 9:
                        if (!m35287(abstractC21760, abstractC21761, i) || !C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                    case 10:
                        if (!m35287(abstractC21760, abstractC21761, i) || !C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                    case 11:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 12:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 13:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 14:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48253(j, abstractC21760) != C21244.m48253(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 15:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48233(j, abstractC21760) != C21244.m48233(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 16:
                        if (!m35287(abstractC21760, abstractC21761, i) || C21244.m48253(j, abstractC21760) != C21244.m48253(j, abstractC21761)) {
                            zM22433 = false;
                        }
                        break;
                    case 17:
                        if (!m35287(abstractC21760, abstractC21761, i) || !C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761))) {
                            zM22433 = false;
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
                        zM22433 = C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761));
                        break;
                    case 50:
                        zM22433 = C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761));
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
                        if (C21244.m48233(j2, abstractC21760) != C21244.m48233(j2, abstractC21761) || !C8668.m22433(C21244.m48234(j, abstractC21760), C21244.m48234(j, abstractC21761))) {
                            zM22433 = false;
                        }
                        break;
                }
                if (zM22433) {
                    i += 3;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final int mo24196(AbstractC21760 abstractC21760) {
        int i;
        int iM33480;
        int i2;
        int iM48233;
        int[] iArr = this.f45369;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM35294 = m35294(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM35294;
            int iHashCode = 37;
            switch (m35300(iM35294)) {
                case 0:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(Double.doubleToLongBits(C21244.m48241(j, abstractC21760)));
                    i3 = iM33480 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM33480 = Float.floatToIntBits(C21244.m48254(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 5:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 7:
                    i = i3 * 53;
                    iM33480 = C13997.m33481(C21244.m48248(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iM33480 = ((String) C21244.m48234(j, abstractC21760)).hashCode();
                    i3 = iM33480 + i;
                    break;
                case 9:
                    Object objM48234 = C21244.m48234(j, abstractC21760);
                    if (objM48234 != null) {
                        iHashCode = objM48234.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = iM33480 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 14:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM48233 = C21244.m48233(j, abstractC21760);
                    i3 = i2 + iM48233;
                    break;
                case 16:
                    i = i3 * 53;
                    iM33480 = C13997.m33480(C21244.m48253(j, abstractC21760));
                    i3 = iM33480 + i;
                    break;
                case 17:
                    Object objM48235 = C21244.m48234(j, abstractC21760);
                    if (objM48235 != null) {
                        iHashCode = objM48235.hashCode();
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
                    iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = iM33480 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                    i3 = iM33480 + i;
                    break;
                case 51:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(Double.doubleToLongBits(((Double) C21244.m48234(j, abstractC21760)).doubleValue()));
                        i3 = iM33480 + i;
                    }
                    break;
                case 52:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = Float.floatToIntBits(((Float) C21244.m48234(j, abstractC21760)).floatValue());
                        i3 = iM33480 + i;
                    }
                    break;
                case 53:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = iM33480 + i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = iM33480 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case 56:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = iM33480 + i;
                    }
                    break;
                case 57:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33481(((Boolean) C21244.m48234(j, abstractC21760)).booleanValue());
                        i3 = iM33480 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = ((String) C21244.m48234(j, abstractC21760)).hashCode();
                        i3 = iM33480 + i;
                    }
                    break;
                case 60:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = iM33480 + i;
                    }
                    break;
                case 61:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = iM33480 + i;
                    }
                    break;
                case 62:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case 63:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case 64:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case 65:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = iM33480 + i;
                    }
                    break;
                case 66:
                    if (m35284(i5, i4, abstractC21760)) {
                        i2 = i3 * 53;
                        iM48233 = m35275(j, abstractC21760);
                        i3 = i2 + iM48233;
                    }
                    break;
                case 67:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C13997.m33480(m35288(j, abstractC21760));
                        i3 = iM33480 + i;
                    }
                    break;
                case 68:
                    if (m35284(i5, i4, abstractC21760)) {
                        i = i3 * 53;
                        iM33480 = C21244.m48234(j, abstractC21760).hashCode();
                        i3 = iM33480 + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f45381.mo7236(abstractC21760).hashCode() + (i3 * 53);
        return this.f45379 ? (iHashCode2 * 53) + this.f45380.mo40104((Object) abstractC21760).hashCode() : iHashCode2;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24199(Object obj, Object obj2) {
        m35299(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f45369;
            if (i >= iArr.length) {
                int i2 = C8668.f26436;
                AbstractC17009 abstractC17009 = this.f45381;
                abstractC17009.mo7242(obj, abstractC17009.mo7229(abstractC17009.mo7236(obj), abstractC17009.mo7236(obj2)));
                if (this.f45379) {
                    AbstractC17092 abstractC17092 = this.f45380;
                    C19210 c19210Mo40104 = abstractC17092.mo40104(obj2);
                    if (c19210Mo40104.m44324()) {
                        return;
                    }
                    abstractC17092.mo40109(obj).m44317(c19210Mo40104);
                    return;
                }
                return;
            }
            int iM35294 = m35294(i);
            long j = 1048575 & iM35294;
            int i3 = iArr[i];
            switch (m35300(iM35294)) {
                case 0:
                    if (m35285(i, obj2)) {
                        C21244.m48227(obj, j, C21244.m48241(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 1:
                    if (m35285(i, obj2)) {
                        C21244.m48228(obj, j, C21244.m48254(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 2:
                    if (m35285(i, obj2)) {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 3:
                    if (m35285(i, obj2)) {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 4:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 5:
                    if (m35285(i, obj2)) {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 6:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 7:
                    if (m35285(i, obj2)) {
                        C21244.m48245(obj, j, C21244.m48248(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 8:
                    if (m35285(i, obj2)) {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 9:
                    m35278(i, obj, obj2);
                    break;
                case 10:
                    if (m35285(i, obj2)) {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 11:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 12:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 13:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 14:
                    if (m35285(i, obj2)) {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 15:
                    if (m35285(i, obj2)) {
                        C21244.m48223(C21244.m48233(j, obj2), j, obj);
                        m35297(i, obj);
                    }
                    break;
                case 16:
                    if (m35285(i, obj2)) {
                        C21244.m48229(obj, j, C21244.m48253(j, obj2));
                        m35297(i, obj);
                    }
                    break;
                case 17:
                    m35278(i, obj, obj2);
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
                    this.f45384.mo2521(j, obj, obj2);
                    break;
                case 50:
                    int i4 = C8668.f26436;
                    C21244.m48224(j, obj, this.f45383.mo26689(C21244.m48234(j, obj), C21244.m48234(j, obj2)));
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
                    if (m35284(i3, i, obj2)) {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35296(i3, i, obj);
                    }
                    break;
                case 60:
                    m35292(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m35284(i3, i, obj2)) {
                        C21244.m48224(j, obj, C21244.m48234(j, obj2));
                        m35296(i3, i, obj);
                    }
                    break;
                case 68:
                    m35292(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35278(int i, Object obj, Object obj2) {
        if (m35285(i, obj2)) {
            long jM35294 = m35294(i) & 1048575;
            Unsafe unsafe = f45368;
            Object object = unsafe.getObject(obj2, jM35294);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f45369[i] + " is present but null: " + obj2);
            }
            InterfaceC9374 interfaceC9374M35295 = m35295(i);
            if (!m35285(i, obj)) {
                if (!m35302(object)) {
                    unsafe.putObject(obj, jM35294, object);
                } else {
                    Object objMo24197 = interfaceC9374M35295.mo24197();
                    interfaceC9374M35295.mo24199(objMo24197, object);
                    unsafe.putObject(obj, jM35294, objMo24197);
                }
                m35297(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM35294);
            if (!m35302(object2)) {
                Object objMo24198 = interfaceC9374M35295.mo24197();
                interfaceC9374M35295.mo24199(objMo24198, object2);
                unsafe.putObject(obj, jM35294, objMo24198);
                object2 = objMo24198;
            }
            interfaceC9374M35295.mo24199(object2, object);
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
    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final int mo24195(AbstractC3770 abstractC3770) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM35073;
        int iM35074;
        int iM35075;
        int iM35076;
        int iM35078;
        int iM35077;
        int serializedSize;
        int iM35083;
        int iM35069;
        InterfaceC8522 interfaceC8522;
        InterfaceC9374 interfaceC9374M35295;
        int iM22439;
        int iM35079;
        int size;
        int iM22454;
        int iM350710;
        int iM35080;
        int iM350711;
        int iM350712;
        int iM35084;
        int iM350713;
        int iM350714;
        Unsafe unsafe = f45368;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iM350715 = 0;
        C14871 c14871 = this;
        AbstractC3770 abstractC3771 = abstractC3770;
        while (true) {
            int[] iArr = c14871.f45369;
            if (i8 >= iArr.length) {
                AbstractC17009 abstractC17009 = c14871.f45381;
                int iMo7241 = iM350715 + abstractC17009.mo7241(abstractC17009.mo7236(abstractC3771));
                return c14871.f45379 ? iMo7241 + c14871.f45380.mo40104((Object) abstractC3771).m44325() : iMo7241;
            }
            int iM35294 = c14871.m35294(i8);
            int iM35300 = m35300(iM35294);
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 2];
            int i11 = i10 & i5;
            if (iM35300 <= 17) {
                if (i11 != i6) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(abstractC3771, i11);
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
            long j = i5 & iM35294;
            if (iM35300 < EnumC0864.f3356.m3182() || iM35300 > EnumC0864.f3392.m3182()) {
                i11 = 0;
            }
            boolean z = c14871.f45382;
            switch (iM35300) {
                case 0:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35073 = AbstractC14766.m35073(i9);
                        iM35069 = iM35073 + 8;
                        iM350715 += iM35069;
                    }
                    break;
                case 1:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35074 = AbstractC14766.m35073(i9);
                        iM35078 = iM35074 + 4;
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 2:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35075(i9, unsafe.getLong(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 3:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35081(i9, unsafe.getLong(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 4:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35074(i9, unsafe.getInt(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 5:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35076 = AbstractC14766.m35073(i9);
                        iM35078 = iM35076 + 8;
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 6:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35078 = AbstractC14766.m35078(i9);
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 7:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35078 = AbstractC14766.m35080(i9);
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 8:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        Object object = unsafe.getObject(abstractC3771, j);
                        iM350715 += object instanceof AbstractC5886 ? AbstractC14766.m35076(i9, (AbstractC5886) object) : AbstractC14766.m35070((String) object) + AbstractC14766.m35073(i9);
                    }
                    c14871 = this;
                    break;
                case 9:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        Object object2 = unsafe.getObject(abstractC3771, j);
                        InterfaceC9374 interfaceC9374M35296 = c14871.m35295(i8);
                        int i12 = C8668.f26436;
                        if (object2 instanceof C16135) {
                            iM35069 = AbstractC14766.m35069(i9, (C16135) object2);
                        } else {
                            iM35077 = AbstractC14766.m35073(i9);
                            serializedSize = ((AbstractC3770) ((InterfaceC8522) object2)).getSerializedSize(interfaceC9374M35296);
                            iM35083 = AbstractC14766.m35083(serializedSize);
                            iM35069 = iM35083 + serializedSize + iM35077;
                        }
                        iM350715 += iM35069;
                    }
                    break;
                case 10:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35076(i9, (AbstractC5886) unsafe.getObject(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 11:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35084(i9, unsafe.getInt(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 12:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35075 = AbstractC14766.m35079(i9, unsafe.getInt(abstractC3771, j));
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 13:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35074 = AbstractC14766.m35073(i9);
                        iM35078 = iM35074 + 4;
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 14:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i4, i2, i3)) {
                        iM35076 = AbstractC14766.m35073(i9);
                        iM35078 = iM35076 + 8;
                        iM350715 += iM35078;
                    }
                    c14871 = this;
                    abstractC3771 = abstractC3770;
                    break;
                case 15:
                    i4 = i;
                    if (c14871.m35286(abstractC3771, i8, i, i2, i3)) {
                        int i13 = unsafe.getInt(abstractC3771, j);
                        iM35075 = AbstractC14766.m35083((i13 >> 31) ^ (i13 << 1)) + AbstractC14766.m35073(i9);
                        iM350715 += iM35075;
                    }
                    c14871 = this;
                    break;
                case 16:
                    if (c14871.m35286(abstractC3771, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(abstractC3771, j);
                        iM350715 += AbstractC14766.m35077((j2 >> 63) ^ (j2 << 1)) + AbstractC14766.m35073(i9);
                    }
                    i4 = i;
                    c14871 = this;
                    break;
                case 17:
                    if (c14871.m35286(abstractC3771, i8, i, i2, i3)) {
                        interfaceC8522 = (InterfaceC8522) unsafe.getObject(abstractC3771, j);
                        interfaceC9374M35295 = c14871.m35295(i8);
                        iM350711 = AbstractC14766.m35073(i9) * 2;
                        iM22454 = ((AbstractC3770) interfaceC8522).getSerializedSize(interfaceC9374M35295);
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 18:
                    iM22439 = C8668.m22439(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 19:
                    iM22439 = C8668.m22425(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC3771, j);
                    int i14 = C8668.f26436;
                    if (list.size() == 0) {
                        iM35079 = 0;
                    } else {
                        iM35079 = (AbstractC14766.m35073(i9) * list.size()) + C8668.m22447(list);
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC3771, j);
                    int i15 = C8668.f26436;
                    size = list2.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22454(list2);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC3771, j);
                    int i16 = C8668.f26436;
                    size = list3.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22440(list3);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 23:
                    iM22439 = C8668.m22439(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 24:
                    iM22439 = C8668.m22425(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC3771, j);
                    int i17 = C8668.f26436;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM35080 = 0;
                    } else {
                        iM35080 = size2 * AbstractC14766.m35080(i9);
                    }
                    iM350715 += iM35080;
                    i4 = i;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC3771, j);
                    int i18 = C8668.f26436;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM35079 = 0;
                    } else {
                        iM35079 = AbstractC14766.m35073(i9) * size3;
                        if (list5 instanceof InterfaceC4142) {
                            InterfaceC4142 interfaceC4142 = (InterfaceC4142) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objMo8472 = interfaceC4142.mo8472(i19);
                                if (objMo8472 instanceof AbstractC5886) {
                                    int size4 = ((AbstractC5886) objMo8472).size();
                                    iM35079 = AbstractC14766.m35083(size4) + size4 + iM35079;
                                } else {
                                    iM35079 = AbstractC14766.m35070((String) objMo8472) + iM35079;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof AbstractC5886) {
                                    int size5 = ((AbstractC5886) obj).size();
                                    iM35079 = AbstractC14766.m35083(size5) + size5 + iM35079;
                                } else {
                                    iM35079 = AbstractC14766.m35070((String) obj) + iM35079;
                                }
                            }
                        }
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC3771, j);
                    InterfaceC9374 interfaceC9374M35297 = c14871.m35295(i8);
                    int i21 = C8668.f26436;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iM35080 = 0;
                    } else {
                        int iM350716 = AbstractC14766.m35073(i9) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj2 = list6.get(i22);
                            int iM38045 = obj2 instanceof C16135 ? ((C16135) obj2).m38045() : ((AbstractC3770) ((InterfaceC8522) obj2)).getSerializedSize(interfaceC9374M35297);
                            iM350716 += AbstractC14766.m35083(iM38045) + iM38045;
                        }
                        iM35080 = iM350716;
                    }
                    iM350715 += iM35080;
                    i4 = i;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC3771, j);
                    int i23 = C8668.f26436;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iM35079 = 0;
                    } else {
                        iM35079 = AbstractC14766.m35073(i9) * size7;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int size8 = ((AbstractC5886) list7.get(i24)).size();
                            iM35079 += AbstractC14766.m35083(size8) + size8;
                        }
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC3771, j);
                    int i25 = C8668.f26436;
                    size = list8.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22444(list8);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC3771, j);
                    int i26 = C8668.f26436;
                    size = list9.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22426(list9);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 31:
                    iM22439 = C8668.m22425(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 32:
                    iM22439 = C8668.m22439(i9, (List) unsafe.getObject(abstractC3771, j));
                    iM35069 = iM22439;
                    i4 = i;
                    iM350715 += iM35069;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC3771, j);
                    int i27 = C8668.f26436;
                    size = list10.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22451(list10);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC3771, j);
                    int i28 = C8668.f26436;
                    size = list11.size();
                    if (size == 0) {
                        iM35079 = 0;
                    } else {
                        iM22454 = C8668.m22449(list11);
                        iM350710 = AbstractC14766.m35073(i9);
                        iM350711 = iM350710 * size;
                        iM35079 = iM350711 + iM22454;
                    }
                    iM350715 += iM35079;
                    i4 = i;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC3771, j);
                    int i29 = C8668.f26436;
                    iM22454 = list12.size() * 8;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC3771, j);
                    int i30 = C8668.f26436;
                    iM22454 = list13.size() * 4;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 37:
                    iM22454 = C8668.m22447((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 38:
                    iM22454 = C8668.m22454((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 39:
                    iM22454 = C8668.m22440((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC3771, j);
                    int i31 = C8668.f26436;
                    iM22454 = list14.size() * 8;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC3771, j);
                    int i32 = C8668.f26436;
                    iM22454 = list15.size() * 4;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC3771, j);
                    int i33 = C8668.f26436;
                    iM22454 = list16.size();
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 43:
                    iM22454 = C8668.m22444((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 44:
                    iM22454 = C8668.m22426((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC3771, j);
                    int i34 = C8668.f26436;
                    iM22454 = list17.size() * 4;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC3771, j);
                    int i35 = C8668.f26436;
                    iM22454 = list18.size() * 8;
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 47:
                    iM22454 = C8668.m22451((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 48:
                    iM22454 = C8668.m22449((List) unsafe.getObject(abstractC3771, j));
                    if (iM22454 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC3771, i11, iM22454);
                        }
                        iM350712 = AbstractC14766.m35073(i9);
                        iM35084 = AbstractC14766.m35083(iM22454);
                        iM350711 = iM35084 + iM350712;
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
                    }
                    i4 = i;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC3771, j);
                    InterfaceC9374 interfaceC9374M35298 = c14871.m35295(i8);
                    int i36 = C8668.f26436;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iM35080 = 0;
                    } else {
                        int iM350717 = 0;
                        for (int i37 = 0; i37 < size9; i37++) {
                            iM350717 += (AbstractC14766.m35073(i9) * 2) + ((AbstractC3770) ((InterfaceC8522) list19.get(i37))).getSerializedSize(interfaceC9374M35298);
                        }
                        iM35080 = iM350717;
                    }
                    iM350715 += iM35080;
                    i4 = i;
                    break;
                case 50:
                    c14871.f45383.mo26690(i9, unsafe.getObject(abstractC3771, j), c14871.m35289(i8));
                    i4 = i;
                    break;
                case 51:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM350713 = AbstractC14766.m35073(i9);
                        iM35073 = iM350713;
                        i4 = i;
                        iM35069 = iM35073 + 8;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 52:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM350714 = AbstractC14766.m35073(i9);
                        iM22439 = iM350714 + 4;
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 53:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35075(i9, m35288(j, abstractC3771));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35081(i9, m35288(j, abstractC3771));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35074(i9, m35275(j, abstractC3771));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 56:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM350713 = AbstractC14766.m35073(i9);
                        iM35073 = iM350713;
                        i4 = i;
                        iM35069 = iM35073 + 8;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 57:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35078(i9);
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35080(i9);
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        Object object3 = unsafe.getObject(abstractC3771, j);
                        iM350715 = (object3 instanceof AbstractC5886 ? AbstractC14766.m35076(i9, (AbstractC5886) object3) : AbstractC14766.m35070((String) object3) + AbstractC14766.m35073(i9)) + iM350715;
                    }
                    i4 = i;
                    break;
                case 60:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        Object object4 = unsafe.getObject(abstractC3771, j);
                        InterfaceC9374 interfaceC9374M35299 = c14871.m35295(i8);
                        int i38 = C8668.f26436;
                        if (object4 instanceof C16135) {
                            iM22439 = AbstractC14766.m35069(i9, (C16135) object4);
                            iM35069 = iM22439;
                            i4 = i;
                            iM350715 += iM35069;
                        } else {
                            int iM350718 = AbstractC14766.m35073(i9);
                            int serializedSize2 = ((AbstractC3770) ((InterfaceC8522) object4)).getSerializedSize(interfaceC9374M35299);
                            iM35077 = iM350718;
                            iM35083 = AbstractC14766.m35083(serializedSize2);
                            serializedSize = serializedSize2;
                            i4 = i;
                            iM35069 = iM35083 + serializedSize + iM35077;
                            iM350715 += iM35069;
                        }
                    } else {
                        i4 = i;
                    }
                    break;
                case 61:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35076(i9, (AbstractC5886) unsafe.getObject(abstractC3771, j));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 62:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35084(i9, m35275(j, abstractC3771));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 63:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM22439 = AbstractC14766.m35079(i9, m35275(j, abstractC3771));
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 64:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM350714 = AbstractC14766.m35073(i9);
                        iM22439 = iM350714 + 4;
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 65:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        iM350713 = AbstractC14766.m35073(i9);
                        iM35073 = iM350713;
                        i4 = i;
                        iM35069 = iM35073 + 8;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 66:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        int iM35275 = m35275(j, abstractC3771);
                        iM22439 = AbstractC14766.m35083((iM35275 >> 31) ^ (iM35275 << 1)) + AbstractC14766.m35073(i9);
                        iM35069 = iM22439;
                        i4 = i;
                        iM350715 += iM35069;
                    } else {
                        i4 = i;
                    }
                    break;
                case 67:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        long jM35288 = m35288(j, abstractC3771);
                        iM35080 = AbstractC14766.m35077((jM35288 >> 63) ^ (jM35288 << 1)) + AbstractC14766.m35073(i9);
                        iM350715 += iM35080;
                    }
                    i4 = i;
                    break;
                case 68:
                    if (c14871.m35284(i9, i8, abstractC3771)) {
                        interfaceC8522 = (InterfaceC8522) unsafe.getObject(abstractC3771, j);
                        interfaceC9374M35295 = c14871.m35295(i8);
                        iM350711 = AbstractC14766.m35073(i9) * 2;
                        iM22454 = ((AbstractC3770) interfaceC8522).getSerializedSize(interfaceC9374M35295);
                        iM35079 = iM350711 + iM22454;
                        iM350715 += iM35079;
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
    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24200(Object obj, InterfaceC6633 interfaceC6633) {
        Iterator itM44313;
        Map.Entry entry;
        C23939 c23939 = (C23939) interfaceC6633;
        c23939.getClass();
        if (EnumC23566.ASCENDING != EnumC23566.DESCENDING) {
            m35293(obj, interfaceC6633);
            return;
        }
        AbstractC17009 abstractC17009 = this.f45381;
        abstractC17009.mo7239(abstractC17009.mo7236(obj), interfaceC6633);
        boolean z = this.f45379;
        AbstractC17092 abstractC17092 = this.f45380;
        if (z) {
            C19210 c19210Mo40104 = abstractC17092.mo40104(obj);
            if (c19210Mo40104.m44324()) {
                itM44313 = null;
                entry = null;
            } else {
                itM44313 = c19210Mo40104.m44313();
                entry = (Map.Entry) itM44313.next();
            }
        } else {
            itM44313 = null;
            entry = null;
        }
        int[] iArr = this.f45369;
        int length = iArr.length;
        while (true) {
            length -= 3;
            if (length < 0) {
                while (entry != null) {
                    abstractC17092.mo40106(interfaceC6633, entry);
                    entry = itM44313.hasNext() ? (Map.Entry) itM44313.next() : null;
                }
                return;
            }
            int iM35294 = m35294(length);
            int i = iArr[length];
            while (entry != null && abstractC17092.mo40101(entry) > i) {
                abstractC17092.mo40106(interfaceC6633, entry);
                entry = itM44313.hasNext() ? (Map.Entry) itM44313.next() : null;
            }
            switch (m35300(iM35294)) {
                case 0:
                    if (m35285(length, obj)) {
                        c23939.m52730(i, C21244.m48241(iM35294 & 1048575, obj));
                    }
                    break;
                case 1:
                    if (m35285(length, obj)) {
                        c23939.m52728(C21244.m48254(iM35294 & 1048575, obj), i);
                    }
                    break;
                case 2:
                    if (m35285(length, obj)) {
                        c23939.m52748(i, C21244.m48253(iM35294 & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m35285(length, obj)) {
                        c23939.m52761(i, C21244.m48253(iM35294 & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m35285(length, obj)) {
                        c23939.m52756(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 5:
                    if (m35285(length, obj)) {
                        c23939.m52732(i, C21244.m48253(iM35294 & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m35285(length, obj)) {
                        c23939.m52747(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m35285(length, obj)) {
                        c23939.m52739(i, C21244.m48248(iM35294 & 1048575, obj));
                    }
                    break;
                case 8:
                    if (m35285(length, obj)) {
                        m35279(i, C21244.m48234(iM35294 & 1048575, obj), interfaceC6633);
                    }
                    break;
                case 9:
                    if (m35285(length, obj)) {
                        c23939.m52750(i, C21244.m48234(iM35294 & 1048575, obj), m35295(length));
                    }
                    break;
                case 10:
                    if (m35285(length, obj)) {
                        c23939.m52738(i, (AbstractC5886) C21244.m48234(iM35294 & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m35285(length, obj)) {
                        c23939.m52753(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 12:
                    if (m35285(length, obj)) {
                        c23939.m52731(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 13:
                    if (m35285(length, obj)) {
                        c23939.m52763(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m35285(length, obj)) {
                        c23939.m52757(i, C21244.m48253(iM35294 & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m35285(length, obj)) {
                        c23939.m52760(i, C21244.m48233(iM35294 & 1048575, obj));
                    }
                    break;
                case 16:
                    if (m35285(length, obj)) {
                        c23939.m52764(i, C21244.m48253(iM35294 & 1048575, obj));
                    }
                    break;
                case 17:
                    if (m35285(length, obj)) {
                        c23939.m52734(i, C21244.m48234(iM35294 & 1048575, obj), m35295(length));
                    }
                    break;
                case 18:
                    C8668.m22443(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 19:
                    C8668.m22445(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 20:
                    C8668.m22436(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 21:
                    C8668.m22435(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 22:
                    C8668.m22455(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 23:
                    C8668.m22450(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 24:
                    C8668.m22452(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 25:
                    C8668.m22431(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 26:
                    int i2 = iArr[length];
                    List list = (List) C21244.m48234(iM35294 & 1048575, obj);
                    int i3 = C8668.f26436;
                    if (list != null && !list.isEmpty()) {
                        c23939.m52751(i2, list);
                    }
                    break;
                case 27:
                    C8668.m22442(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, m35295(length));
                    break;
                case 28:
                    int i4 = iArr[length];
                    List list2 = (List) C21244.m48234(iM35294 & 1048575, obj);
                    int i5 = C8668.f26436;
                    if (list2 != null && !list2.isEmpty()) {
                        c23939.m52736(i4, list2);
                    }
                    break;
                case 29:
                    C8668.m22434(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 30:
                    C8668.m22448(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 31:
                    C8668.m22453(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 32:
                    C8668.m22438(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 33:
                    C8668.m22437(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 34:
                    C8668.m22446(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, false);
                    break;
                case 35:
                    C8668.m22443(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 36:
                    C8668.m22445(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 37:
                    C8668.m22436(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 38:
                    C8668.m22435(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 39:
                    C8668.m22455(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 40:
                    C8668.m22450(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 41:
                    C8668.m22452(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 42:
                    C8668.m22431(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 43:
                    C8668.m22434(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 44:
                    C8668.m22448(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C8668.m22453(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 46:
                    C8668.m22438(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 47:
                    C8668.m22437(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 48:
                    C8668.m22446(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, true);
                    break;
                case 49:
                    C8668.m22430(iArr[length], (List) C21244.m48234(iM35294 & 1048575, obj), interfaceC6633, m35295(length));
                    break;
                case 50:
                    Object objM48234 = C21244.m48234(iM35294 & 1048575, obj);
                    if (objM48234 != null) {
                        Object objM35289 = m35289(length);
                        InterfaceC10639 interfaceC10639 = this.f45383;
                        interfaceC10639.mo26691(objM35289);
                        c23939.m52737(i, interfaceC10639.mo26696(objM48234));
                    }
                    break;
                case 51:
                    if (m35284(i, length, obj)) {
                        c23939.m52730(i, ((Double) C21244.m48234(iM35294 & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m35284(i, length, obj)) {
                        c23939.m52728(((Float) C21244.m48234(iM35294 & 1048575, obj)).floatValue(), i);
                    }
                    break;
                case 53:
                    if (m35284(i, length, obj)) {
                        c23939.m52748(i, m35288(iM35294 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m35284(i, length, obj)) {
                        c23939.m52761(i, m35288(iM35294 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m35284(i, length, obj)) {
                        c23939.m52756(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m35284(i, length, obj)) {
                        c23939.m52732(i, m35288(iM35294 & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m35284(i, length, obj)) {
                        c23939.m52747(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m35284(i, length, obj)) {
                        c23939.m52739(i, ((Boolean) C21244.m48234(iM35294 & 1048575, obj)).booleanValue());
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m35284(i, length, obj)) {
                        m35279(i, C21244.m48234(iM35294 & 1048575, obj), interfaceC6633);
                    }
                    break;
                case 60:
                    if (m35284(i, length, obj)) {
                        c23939.m52750(i, C21244.m48234(iM35294 & 1048575, obj), m35295(length));
                    }
                    break;
                case 61:
                    if (m35284(i, length, obj)) {
                        c23939.m52738(i, (AbstractC5886) C21244.m48234(iM35294 & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m35284(i, length, obj)) {
                        c23939.m52753(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m35284(i, length, obj)) {
                        c23939.m52731(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m35284(i, length, obj)) {
                        c23939.m52763(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m35284(i, length, obj)) {
                        c23939.m52757(i, m35288(iM35294 & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m35284(i, length, obj)) {
                        c23939.m52760(i, m35275(iM35294 & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m35284(i, length, obj)) {
                        c23939.m52764(i, m35288(iM35294 & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m35284(i, length, obj)) {
                        c23939.m52734(i, C21244.m48234(iM35294 & 1048575, obj), m35295(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35293(Object obj, InterfaceC6633 interfaceC6633) {
        Map.Entry entry;
        Iterator itM44319;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Map.Entry entry3;
        int[] iArr;
        int i4;
        boolean z = this.f45379;
        AbstractC17092 abstractC17092 = this.f45380;
        if (z) {
            C19210 c19210Mo40104 = abstractC17092.mo40104(obj);
            if (c19210Mo40104.m44324()) {
                entry = null;
                itM44319 = null;
            } else {
                itM44319 = c19210Mo40104.m44319();
                entry = (Map.Entry) itM44319.next();
            }
        } else {
            entry = null;
            itM44319 = null;
        }
        Iterator it = itM44319;
        int[] iArr2 = this.f45369;
        int length = iArr2.length;
        Unsafe unsafe = f45368;
        int i5 = 1048575;
        int i6 = 0;
        C14871 c14871 = this;
        int i7 = 0;
        while (i7 < length) {
            int iM35294 = c14871.m35294(i7);
            int i8 = iArr2[i7];
            int iM35300 = m35300(iM35294);
            if (iM35300 <= 17) {
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
            while (entry2 != null && abstractC17092.mo40101(entry2) <= i8) {
                abstractC17092.mo40106(interfaceC6633, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iM35294 & 1048575;
            switch (iM35300) {
                case 0:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52730(i8, C21244.m48241(j, obj));
                    }
                    break;
                case 1:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52728(C21244.m48254(j, obj), i8);
                    }
                    c14871 = this;
                    break;
                case 2:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52748(i8, unsafe.getLong(obj, j));
                    }
                    c14871 = this;
                    break;
                case 3:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52761(i8, unsafe.getLong(obj, j));
                    }
                    c14871 = this;
                    break;
                case 4:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52756(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 5:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52732(i8, unsafe.getLong(obj, j));
                    }
                    c14871 = this;
                    break;
                case 6:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52747(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 7:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52739(i8, C21244.m48248(j, obj));
                    }
                    c14871 = this;
                    break;
                case 8:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        m35279(i8, unsafe.getObject(obj, j), interfaceC6633);
                    }
                    c14871 = this;
                    break;
                case 9:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52750(i8, unsafe.getObject(obj, j), c14871.m35295(i7));
                    }
                    break;
                case 10:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52738(i8, (AbstractC5886) unsafe.getObject(obj, j));
                    }
                    c14871 = this;
                    break;
                case 11:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52753(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 12:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52731(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 13:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52763(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 14:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52757(i8, unsafe.getLong(obj, j));
                    }
                    c14871 = this;
                    break;
                case 15:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52760(i8, unsafe.getInt(obj, j));
                    }
                    c14871 = this;
                    break;
                case 16:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52764(i8, unsafe.getLong(obj, j));
                    }
                    c14871 = this;
                    break;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    entry3 = entry2;
                    if (c14871.m35286(obj, i7, i, i2, i3)) {
                        ((C23939) interfaceC6633).m52734(i8, unsafe.getObject(obj, j), c14871.m35295(i7));
                    }
                    break;
                case 18:
                    C8668.m22443(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 19:
                    C8668.m22445(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 20:
                    C8668.m22436(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 21:
                    C8668.m22435(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 22:
                    C8668.m22455(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 23:
                    C8668.m22450(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 24:
                    C8668.m22452(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 25:
                    C8668.m22431(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 26:
                    int i11 = iArr2[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = C8668.f26436;
                    if (list != null && !list.isEmpty()) {
                        ((C23939) interfaceC6633).m52751(i11, list);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 27:
                    C8668.m22442(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, c14871.m35295(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 28:
                    int i13 = iArr2[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = C8668.f26436;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C23939) interfaceC6633).m52736(i13, list2);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 29:
                    C8668.m22434(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 30:
                    C8668.m22448(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 31:
                    C8668.m22453(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 32:
                    C8668.m22438(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 33:
                    C8668.m22437(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 34:
                    C8668.m22446(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 35:
                    C8668.m22443(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 36:
                    C8668.m22445(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 37:
                    C8668.m22436(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 38:
                    C8668.m22435(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 39:
                    C8668.m22455(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 40:
                    C8668.m22450(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 41:
                    C8668.m22452(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 42:
                    C8668.m22431(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 43:
                    C8668.m22434(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 44:
                    C8668.m22448(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C8668.m22453(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 46:
                    C8668.m22438(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 47:
                    C8668.m22437(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 48:
                    C8668.m22446(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 49:
                    C8668.m22430(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC6633, c14871.m35295(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objM35289 = c14871.m35289(i7);
                        InterfaceC10639 interfaceC10639 = c14871.f45383;
                        interfaceC10639.mo26691(objM35289);
                        ((C23939) interfaceC6633).m52737(i8, interfaceC10639.mo26696(object));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 51:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52730(i8, ((Double) C21244.m48234(j, obj)).doubleValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 52:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52728(((Float) C21244.m48234(j, obj)).floatValue(), i8);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 53:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52748(i8, m35288(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52761(i8, m35288(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52756(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 56:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52732(i8, m35288(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 57:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52747(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52739(i8, ((Boolean) C21244.m48234(j, obj)).booleanValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c14871.m35284(i8, i7, obj)) {
                        m35279(i8, unsafe.getObject(obj, j), interfaceC6633);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 60:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52750(i8, unsafe.getObject(obj, j), c14871.m35295(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 61:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52738(i8, (AbstractC5886) unsafe.getObject(obj, j));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 62:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52753(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 63:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52731(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 64:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52763(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 65:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52757(i8, m35288(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 66:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52760(i8, m35275(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 67:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52764(i8, m35288(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 68:
                    if (c14871.m35284(i8, i7, obj)) {
                        ((C23939) interfaceC6633).m52734(i8, unsafe.getObject(obj, j), c14871.m35295(i7));
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
            abstractC17092.mo40106(interfaceC6633, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        AbstractC17009 abstractC17009 = c14871.f45381;
        abstractC17009.mo7239(abstractC17009.mo7236(obj), interfaceC6633);
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
    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24201(Object obj, InterfaceC10785 interfaceC10785, C17798 c17798) throws Throwable {
        Object obj2;
        int i;
        int[] iArr;
        AbstractC17009 abstractC17009;
        Object obj3;
        Object objMo7228;
        int i2;
        Object obj4;
        C19210 c19210Mo40109;
        C17798 c17799;
        Object obj5;
        Object obj6;
        Object objM22427;
        C14871 c14871 = this;
        Object obj7 = obj;
        C17798 c177910 = c17798;
        c17798.getClass();
        m35299(obj);
        AbstractC17009 abstractC170010 = c14871.f45381;
        int[] iArr2 = c14871.f45376;
        int i3 = c14871.f45371;
        int i4 = c14871.f45375;
        C19210 c19210 = null;
        Object objMo7229 = null;
        while (true) {
            try {
                int iMo6774 = interfaceC10785.mo6774();
                if (iMo6774 < c14871.f45373 || iMo6774 > c14871.f45374) {
                    i2 = -1;
                } else {
                    int[] iArr3 = c14871.f45369;
                    int length = (iArr3.length / 3) - 1;
                    int i5 = 0;
                    while (true) {
                        if (i5 <= length) {
                            int i6 = (length + i5) >>> 1;
                            int i7 = i6 * 3;
                            int i8 = length;
                            int i9 = iArr3[i7];
                            if (iMo6774 == i9) {
                                i2 = i7;
                            } else if (iMo6774 < i9) {
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
                    obj2 = objMo7229;
                    i = i3;
                    iArr = iArr2;
                    abstractC17009 = abstractC170010;
                    c14871 = this;
                    obj3 = obj7;
                    try {
                        int iM35294 = c14871.m35294(i2);
                        try {
                            int iM35300 = m35300(iM35294);
                            AbstractC0613 abstractC0613 = c14871.f45384;
                            switch (iM35300) {
                                case 0:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48227(obj3, m35301(iM35294), interfaceC10785.readDouble());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 1:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48228(obj3, m35301(iM35294), interfaceC10785.readFloat());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 2:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48229(obj3, m35301(iM35294), interfaceC10785.mo6776());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 3:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48229(obj3, m35301(iM35294), interfaceC10785.mo6781());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 4:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48223(interfaceC10785.mo6802(), m35301(iM35294), obj3);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 5:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48229(obj3, m35301(iM35294), interfaceC10785.mo6766());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 6:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48223(interfaceC10785.mo6779(), m35301(iM35294), obj3);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 7:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48245(obj3, m35301(iM35294), interfaceC10785.mo6787());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 8:
                                    i4 = i4;
                                    c17799 = c177910;
                                    c14871.m35283(obj3, iM35294, interfaceC10785);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 9:
                                    i4 = i4;
                                    c17799 = c177910;
                                    InterfaceC8522 interfaceC8522 = (InterfaceC8522) c14871.m35291(i2, obj3);
                                    interfaceC10785.mo6784(interfaceC8522, c14871.m35295(i2), c17799);
                                    c14871.m35298(i2, obj3, interfaceC8522);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 10:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48224(m35301(iM35294), obj3, interfaceC10785.mo6777());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 11:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48223(interfaceC10785.mo6796(), m35301(iM35294), obj3);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 12:
                                    i4 = i4;
                                    c17799 = c177910;
                                    int iMo6788 = interfaceC10785.mo6788();
                                    InterfaceC12587 interfaceC12587M35276 = c14871.m35276(i2);
                                    if (interfaceC12587M35276 == null || interfaceC12587M35276.mo18942(iMo6788)) {
                                        C21244.m48223(iMo6788, iM35294 & 1048575, obj3);
                                        c14871.m35297(i2, obj3);
                                        objM22427 = obj2;
                                    } else {
                                        objM22427 = C8668.m22427(obj3, iMo6774, iMo6788, obj2, abstractC17009);
                                    }
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 13:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48223(interfaceC10785.mo6763(), iM35294 & 1048575, obj3);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 14:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48229(obj3, iM35294 & 1048575, interfaceC10785.mo6792());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 15:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48223(interfaceC10785.mo6804(), iM35294 & 1048575, obj3);
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 16:
                                    i4 = i4;
                                    c17799 = c177910;
                                    C21244.m48229(obj3, iM35294 & 1048575, interfaceC10785.mo6790());
                                    c14871.m35297(i2, obj3);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 17:
                                    i4 = i4;
                                    c17799 = c177910;
                                    InterfaceC8522 interfaceC8523 = (InterfaceC8522) c14871.m35291(i2, obj3);
                                    interfaceC10785.mo6768(interfaceC8523, c14871.m35295(i2), c17799);
                                    c14871.m35298(i2, obj3, interfaceC8523);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 18:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6764(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 19:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6799(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 20:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6797(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 21:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6793(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 22:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6791(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 23:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6778(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 24:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6773(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 25:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6789(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 26:
                                    i4 = i4;
                                    c17799 = c177910;
                                    if ((536870912 & iM35294) != 0) {
                                        interfaceC10785.mo6805(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    } else {
                                        interfaceC10785.mo6775(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    }
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 27:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6786(abstractC0613.mo2522(iM35294 & 1048575, obj3), c14871.m35295(i2), c17799);
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 28:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6800(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 29:
                                    i4 = i4;
                                    c17799 = c177910;
                                    interfaceC10785.mo6782(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 30:
                                    i4 = i4;
                                    c17799 = c177910;
                                    List listMo2522 = abstractC0613.mo2522(iM35294 & 1048575, obj3);
                                    interfaceC10785.mo6795(listMo2522);
                                    objM22427 = C8668.m22428(obj, iMo6774, listMo2522, c14871.m35276(i2), obj2, abstractC17009);
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 31:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6769(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 32:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6780(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 33:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6803(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 34:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6785(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 35:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6764(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 36:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6799(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 37:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6797(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 38:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6793(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 39:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6791(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 40:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6778(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 41:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6773(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 42:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6789(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 43:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6782(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 44:
                                    i4 = i4;
                                    c17799 = c177910;
                                    try {
                                        List listMo2523 = abstractC0613.mo2522(iM35294 & 1048575, obj3);
                                        interfaceC10785.mo6795(listMo2523);
                                        objMo7228 = obj2;
                                        try {
                                            objM22427 = C8668.m22428(obj, iMo6774, listMo2523, c14871.m35276(i2), obj2, abstractC17009);
                                            objMo7228 = objM22427;
                                        } catch (C7648 unused) {
                                            obj2 = objMo7228;
                                            objMo7228 = obj2;
                                            try {
                                                if (abstractC17009.mo7235(interfaceC10785)) {
                                                    if (objMo7228 == null) {
                                                        objMo7228 = abstractC17009.mo7228(obj3);
                                                    }
                                                    if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                        while (i4 < i) {
                                                            m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                            i4++;
                                                        }
                                                        if (objMo7228 == null) {
                                                            return;
                                                        }
                                                        abstractC17009.mo7238(obj3, objMo7228);
                                                        return;
                                                    }
                                                } else if (!interfaceC10785.mo6801()) {
                                                    while (i4 < i) {
                                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                        i4++;
                                                    }
                                                    if (objMo7228 == null) {
                                                        return;
                                                    }
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                obj2 = objMo7228;
                                                objMo7228 = obj2;
                                                while (i4 < i) {
                                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                    i4++;
                                                }
                                                if (objMo7228 != null) {
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = objMo7228;
                                            objMo7228 = obj2;
                                            while (i4 < i) {
                                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                i4++;
                                            }
                                            if (objMo7228 != null) {
                                                abstractC17009.mo7238(obj3, objMo7228);
                                            }
                                            throw th;
                                        }
                                    } catch (C7648 unused2) {
                                        objMo7228 = obj2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objMo7228 = obj2;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6769(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 46:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6780(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 47:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6803(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 48:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    interfaceC10785.mo6785(abstractC0613.mo2522(iM35294 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 49:
                                    i4 = i4;
                                    c17799 = c177910;
                                    obj6 = obj2;
                                    try {
                                        interfaceC10785.mo6770(abstractC0613.mo2522(iM35294 & 1048575, obj3), c14871.m35295(i2), c17799);
                                        obj2 = obj6;
                                        objM22427 = obj2;
                                        objMo7228 = objM22427;
                                    } catch (C7648 unused3) {
                                        obj2 = obj6;
                                        objMo7228 = obj2;
                                        if (abstractC17009.mo7235(interfaceC10785)) {
                                            if (objMo7228 == null) {
                                                objMo7228 = abstractC17009.mo7228(obj3);
                                            }
                                            if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                while (i4 < i) {
                                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                    i4++;
                                                }
                                                if (objMo7228 == null) {
                                                    return;
                                                }
                                                abstractC17009.mo7238(obj3, objMo7228);
                                                return;
                                            }
                                        } else if (!interfaceC10785.mo6801()) {
                                            while (i4 < i) {
                                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                i4++;
                                            }
                                            if (objMo7228 == null) {
                                                return;
                                            }
                                            abstractC17009.mo7238(obj3, objMo7228);
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj6;
                                        objMo7228 = obj2;
                                        while (i4 < i) {
                                            m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                            i4++;
                                        }
                                        if (objMo7228 != null) {
                                            abstractC17009.mo7238(obj3, objMo7228);
                                        }
                                        throw th;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 50:
                                    try {
                                        obj5 = obj2;
                                        i4 = i4;
                                        C17798 c177911 = c177910;
                                        try {
                                            m35282(obj, i2, c14871.m35289(i2), c17798, interfaceC10785);
                                            throw null;
                                        } catch (C7648 unused4) {
                                            obj6 = obj5;
                                            c17799 = c177911;
                                            obj2 = obj6;
                                            objMo7228 = obj2;
                                            if (abstractC17009.mo7235(interfaceC10785)) {
                                                if (!interfaceC10785.mo6801()) {
                                                    while (i4 < i) {
                                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                        i4++;
                                                    }
                                                    if (objMo7228 == null) {
                                                        return;
                                                    }
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo7229 = objMo7228;
                                                c177910 = c17799;
                                                iArr2 = iArr;
                                                abstractC170010 = abstractC17009;
                                                i3 = i;
                                            } else {
                                                if (objMo7228 == null) {
                                                    objMo7228 = abstractC17009.mo7228(obj3);
                                                }
                                                if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                    while (i4 < i) {
                                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                        i4++;
                                                    }
                                                    if (objMo7228 == null) {
                                                        return;
                                                    }
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo7229 = objMo7228;
                                                c177910 = c17799;
                                                iArr2 = iArr;
                                                abstractC170010 = abstractC17009;
                                                i3 = i;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj6 = obj5;
                                            obj2 = obj6;
                                            objMo7228 = obj2;
                                            while (i4 < i) {
                                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                i4++;
                                            }
                                            if (objMo7228 != null) {
                                                abstractC17009.mo7238(obj3, objMo7228);
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
                                    C21244.m48224(iM35294 & 1048575, obj3, Double.valueOf(interfaceC10785.readDouble()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 52:
                                    C21244.m48224(iM35294 & 1048575, obj3, Float.valueOf(interfaceC10785.readFloat()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 53:
                                    C21244.m48224(iM35294 & 1048575, obj3, Long.valueOf(interfaceC10785.mo6776()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    C21244.m48224(iM35294 & 1048575, obj3, Long.valueOf(interfaceC10785.mo6781()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(interfaceC10785.mo6802()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 56:
                                    C21244.m48224(iM35294 & 1048575, obj3, Long.valueOf(interfaceC10785.mo6766()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 57:
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(interfaceC10785.mo6779()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    C21244.m48224(iM35294 & 1048575, obj3, Boolean.valueOf(interfaceC10785.mo6787()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    c14871.m35283(obj3, iM35294, interfaceC10785);
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 60:
                                    InterfaceC8522 interfaceC8524 = (InterfaceC8522) c14871.m35290(iMo6774, i2, obj3);
                                    interfaceC10785.mo6784(interfaceC8524, c14871.m35295(i2), c177910);
                                    c14871.m35280(obj3, iMo6774, i2, interfaceC8524);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 61:
                                    C21244.m48224(iM35294 & 1048575, obj3, interfaceC10785.mo6777());
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 62:
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(interfaceC10785.mo6796()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 63:
                                    int iMo6789 = interfaceC10785.mo6788();
                                    InterfaceC12587 interfaceC12587M35277 = c14871.m35276(i2);
                                    if (interfaceC12587M35277 != null && !interfaceC12587M35277.mo18942(iMo6789)) {
                                        objMo7228 = C8668.m22427(obj3, iMo6774, iMo6789, obj2, abstractC17009);
                                        i4 = i4;
                                        c17799 = c177910;
                                        objM22427 = objMo7228;
                                        objMo7228 = objM22427;
                                        obj7 = obj3;
                                        i4 = i4;
                                        objMo7229 = objMo7228;
                                        c177910 = c17799;
                                        iArr2 = iArr;
                                        abstractC170010 = abstractC17009;
                                        i3 = i;
                                    }
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(iMo6789));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 64:
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(interfaceC10785.mo6763()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 65:
                                    C21244.m48224(iM35294 & 1048575, obj3, Long.valueOf(interfaceC10785.mo6792()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 66:
                                    C21244.m48224(iM35294 & 1048575, obj3, Integer.valueOf(interfaceC10785.mo6804()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 67:
                                    C21244.m48224(iM35294 & 1048575, obj3, Long.valueOf(interfaceC10785.mo6790()));
                                    c14871.m35296(iMo6774, i2, obj3);
                                    i4 = i4;
                                    c17799 = c177910;
                                    objM22427 = obj2;
                                    objMo7228 = objM22427;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                case 68:
                                    try {
                                        InterfaceC8522 interfaceC8525 = (InterfaceC8522) c14871.m35290(iMo6774, i2, obj3);
                                        interfaceC10785.mo6768(interfaceC8525, c14871.m35295(i2), c177910);
                                        c14871.m35280(obj3, iMo6774, i2, interfaceC8525);
                                        i4 = i4;
                                        c17799 = c177910;
                                        objM22427 = obj2;
                                        objMo7228 = objM22427;
                                    } catch (C7648 unused5) {
                                        objMo7228 = obj2;
                                        i4 = i4;
                                        c17799 = c177910;
                                        if (abstractC17009.mo7235(interfaceC10785)) {
                                            if (objMo7228 == null) {
                                                objMo7228 = abstractC17009.mo7228(obj3);
                                            }
                                            if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                while (i4 < i) {
                                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                    i4++;
                                                }
                                                if (objMo7228 == null) {
                                                    return;
                                                }
                                                abstractC17009.mo7238(obj3, objMo7228);
                                                return;
                                            }
                                        } else if (!interfaceC10785.mo6801()) {
                                            while (i4 < i) {
                                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                i4++;
                                            }
                                            if (objMo7228 == null) {
                                                return;
                                            }
                                            abstractC17009.mo7238(obj3, objMo7228);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                                default:
                                    i4 = i4;
                                    c17799 = c177910;
                                    if (obj2 == null) {
                                        try {
                                            objMo7228 = abstractC17009.mo7228(obj3);
                                        } catch (C7648 unused6) {
                                            objMo7228 = obj2;
                                            if (abstractC17009.mo7235(interfaceC10785)) {
                                                if (!interfaceC10785.mo6801()) {
                                                    while (i4 < i) {
                                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                        i4++;
                                                    }
                                                    if (objMo7228 == null) {
                                                        return;
                                                    }
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo7229 = objMo7228;
                                                c177910 = c17799;
                                                iArr2 = iArr;
                                                abstractC170010 = abstractC17009;
                                                i3 = i;
                                            } else {
                                                if (objMo7228 == null) {
                                                    objMo7228 = abstractC17009.mo7228(obj3);
                                                }
                                                if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                    while (i4 < i) {
                                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                        i4++;
                                                    }
                                                    if (objMo7228 == null) {
                                                        return;
                                                    }
                                                    abstractC17009.mo7238(obj3, objMo7228);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo7229 = objMo7228;
                                                c177910 = c17799;
                                                iArr2 = iArr;
                                                abstractC170010 = abstractC17009;
                                                i3 = i;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            objMo7228 = obj2;
                                        }
                                    } else {
                                        objMo7228 = obj2;
                                    }
                                    try {
                                        try {
                                            if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                while (i4 < i) {
                                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                    i4++;
                                                }
                                                if (objMo7228 == null) {
                                                    return;
                                                }
                                                abstractC17009.mo7238(obj3, objMo7228);
                                                return;
                                            }
                                            objM22427 = objMo7228;
                                            objMo7228 = objM22427;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                        break;
                                    } catch (C7648 unused7) {
                                        if (abstractC17009.mo7235(interfaceC10785)) {
                                            if (objMo7228 == null) {
                                                objMo7228 = abstractC17009.mo7228(obj3);
                                            }
                                            if (!abstractC17009.m39893(objMo7228, interfaceC10785)) {
                                                while (i4 < i) {
                                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                    i4++;
                                                }
                                                if (objMo7228 == null) {
                                                    return;
                                                }
                                                abstractC17009.mo7238(obj3, objMo7228);
                                                return;
                                            }
                                        } else if (!interfaceC10785.mo6801()) {
                                            while (i4 < i) {
                                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                                i4++;
                                            }
                                            if (objMo7228 == null) {
                                                return;
                                            }
                                            abstractC17009.mo7238(obj3, objMo7228);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo7229 = objMo7228;
                                    c177910 = c17799;
                                    iArr2 = iArr;
                                    abstractC170010 = abstractC17009;
                                    i3 = i;
                                    break;
                            }
                        } catch (C7648 unused8) {
                            i4 = i4;
                            c17799 = c177910;
                        } catch (Throwable th9) {
                            th = th9;
                            i4 = i4;
                            objMo7228 = obj2;
                            while (i4 < i) {
                                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                i4++;
                            }
                            if (objMo7228 != null) {
                                abstractC17009.mo7238(obj3, objMo7228);
                            }
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    if (iMo6774 == Integer.MAX_VALUE) {
                        for (int i10 = i4; i10 < i3; i10++) {
                            m35281(obj, iArr2[i10], objMo7229, abstractC170010, obj);
                        }
                        if (objMo7229 != null) {
                            abstractC170010.mo7238(obj7, objMo7229);
                            return;
                        }
                        return;
                    }
                    try {
                        boolean z = c14871.f45379;
                        AbstractC17092 abstractC17092 = c14871.f45380;
                        Object objMo40103 = !z ? null : abstractC17092.mo40103(c177910, c14871.f45378, iMo6774);
                        if (objMo40103 != null) {
                            if (c19210 == null) {
                                try {
                                    c19210Mo40109 = abstractC17092.mo40109(obj7);
                                } catch (Throwable th11) {
                                    th = th11;
                                    i = i3;
                                    iArr = iArr2;
                                    abstractC17009 = abstractC170010;
                                    i4 = i4;
                                    objMo7228 = objMo7229;
                                    obj3 = obj7;
                                    obj2 = objMo7228;
                                    objMo7228 = obj2;
                                    while (i4 < i) {
                                        m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                        i4++;
                                    }
                                    if (objMo7228 != null) {
                                        abstractC17009.mo7238(obj3, objMo7228);
                                    }
                                    throw th;
                                }
                            } else {
                                c19210Mo40109 = c19210;
                            }
                            obj2 = objMo7229;
                            Object obj8 = objMo40103;
                            i = i3;
                            iArr = iArr2;
                            AbstractC17009 abstractC170011 = abstractC170010;
                            obj4 = obj7;
                            try {
                                objMo7229 = abstractC17092.mo40102(obj, interfaceC10785, obj8, c17798, c19210Mo40109, obj2, abstractC170011);
                                abstractC170010 = abstractC170011;
                                c19210 = c19210Mo40109;
                            } catch (Throwable th12) {
                                th = th12;
                                abstractC17009 = abstractC170011;
                                i = i;
                                obj3 = obj4;
                                objMo7228 = obj2;
                                while (i4 < i) {
                                    m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                    i4++;
                                }
                                if (objMo7228 != null) {
                                    abstractC17009.mo7238(obj3, objMo7228);
                                }
                                throw th;
                            }
                        } else {
                            Object obj9 = objMo7229;
                            i = i3;
                            iArr = iArr2;
                            abstractC17009 = abstractC170010;
                            obj4 = obj7;
                            try {
                                if (abstractC17009.mo7235(interfaceC10785)) {
                                    objMo7229 = obj9;
                                    if (interfaceC10785.mo6801()) {
                                        abstractC170010 = abstractC17009;
                                    }
                                } else {
                                    objMo7229 = obj9 == null ? abstractC17009.mo7228(obj4) : obj9;
                                    try {
                                        if (!abstractC17009.m39893(objMo7229, interfaceC10785)) {
                                        }
                                        abstractC170010 = abstractC17009;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = objMo7229;
                                        obj3 = obj4;
                                        objMo7228 = obj2;
                                        while (i4 < i) {
                                            m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                                            i4++;
                                        }
                                        if (objMo7228 != null) {
                                            abstractC17009.mo7238(obj3, objMo7228);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                objMo7229 = obj9;
                            }
                        }
                        i3 = i;
                        obj7 = obj4;
                        iArr2 = iArr;
                        c14871 = this;
                    } catch (Throwable th15) {
                        th = th15;
                        obj2 = objMo7229;
                        i = i3;
                        iArr = iArr2;
                        abstractC17009 = abstractC170010;
                        obj4 = obj7;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = objMo7229;
                i = i3;
                iArr = iArr2;
                abstractC17009 = abstractC170010;
                obj3 = obj7;
            }
            while (i4 < i) {
                m35281(obj, iArr[i4], objMo7228, abstractC17009, obj);
                i4++;
            }
            if (objMo7228 != null) {
                abstractC17009.mo7238(obj3, objMo7228);
            }
            throw th;
        }
        int i11 = i4;
        while (i11 < i) {
            AbstractC17009 abstractC170012 = abstractC17009;
            m35281(obj, iArr[i11], objMo7229, abstractC170012, obj);
            i11++;
            abstractC17009 = abstractC170012;
            i = i;
        }
        AbstractC17009 abstractC170013 = abstractC17009;
        if (objMo7229 != null) {
            abstractC170013.mo7238(obj4, objMo7229);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC9374 m35295(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f45370;
        InterfaceC9374 interfaceC9374 = (InterfaceC9374) objArr[i2];
        if (interfaceC9374 != null) {
            return interfaceC9374;
        }
        InterfaceC9374 interfaceC9374M28054 = C11345.m28053().m28054((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC9374M28054;
        return interfaceC9374M28054;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35289(int i) {
        return this.f45370[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12587 m35276(int i) {
        return (InterfaceC12587) this.f45370[((i / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35291(int i, Object obj) {
        InterfaceC9374 interfaceC9374M35295 = m35295(i);
        long jM35294 = m35294(i) & 1048575;
        if (!m35285(i, obj)) {
            return interfaceC9374M35295.mo24197();
        }
        Object object = f45368.getObject(obj, jM35294);
        if (m35302(object)) {
            return object;
        }
        Object objMo24197 = interfaceC9374M35295.mo24197();
        if (object != null) {
            interfaceC9374M35295.mo24199(objMo24197, object);
        }
        return objMo24197;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35298(int i, Object obj, Object obj2) {
        f45368.putObject(obj, m35294(i) & 1048575, obj2);
        m35297(i, obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m35290(int i, int i2, Object obj) {
        InterfaceC9374 interfaceC9374M35295 = m35295(i2);
        if (!m35284(i, i2, obj)) {
            return interfaceC9374M35295.mo24197();
        }
        Object object = f45368.getObject(obj, m35294(i2) & 1048575);
        if (m35302(object)) {
            return object;
        }
        Object objMo24197 = interfaceC9374M35295.mo24197();
        if (object != null) {
            interfaceC9374M35295.mo24199(objMo24197, object);
        }
        return objMo24197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35280(Object obj, int i, int i2, Object obj2) {
        f45368.putObject(obj, m35294(i2) & 1048575, obj2);
        m35296(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ֫ */
    public final void mo24198(Object obj) {
        if (m35302(obj)) {
            if (obj instanceof AbstractC21760) {
                AbstractC21760 abstractC21760 = (AbstractC21760) obj;
                abstractC21760.setMemoizedSerializedSize(Integer.MAX_VALUE);
                abstractC21760.memoizedHashCode = 0;
                abstractC21760.m49082();
            }
            int[] iArr = this.f45369;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM35294 = m35294(i);
                long j = 1048575 & iM35294;
                int iM35300 = m35300(iM35294);
                if (iM35300 != 9) {
                    if (iM35300 != 60 && iM35300 != 68) {
                        switch (iM35300) {
                            case 17:
                                if (m35285(i, obj)) {
                                    m35295(i).mo24198(f45368.getObject(obj, j));
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
                                this.f45384.mo2520(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f45368;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f45383.mo26695(object));
                                }
                                break;
                        }
                    } else if (m35284(iArr[i], i, obj)) {
                        m35295(i).mo24198(f45368.getObject(obj, j));
                    }
                } else if (m35285(i, obj)) {
                    m35295(i).mo24198(f45368.getObject(obj, j));
                }
            }
            this.f45381.mo7243(obj);
            if (this.f45379) {
                this.f45380.mo40110(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m35282(Object obj, int i, Object obj2, C17798 c17798, InterfaceC10785 interfaceC10785) {
        long jM35294 = m35294(i) & 1048575;
        Object objM48234 = C21244.m48234(jM35294, obj);
        InterfaceC10639 interfaceC10639 = this.f45383;
        if (objM48234 == null) {
            objM48234 = interfaceC10639.mo26694(obj2);
            C21244.m48224(jM35294, obj, objM48234);
        } else if (interfaceC10639.mo26693(objM48234)) {
            Object objMo26694 = interfaceC10639.mo26694(obj2);
            interfaceC10639.mo26689(objMo26694, objM48234);
            C21244.m48224(jM35294, obj, objMo26694);
            objM48234 = objMo26694;
        }
        interfaceC10639.mo26692(objM48234);
        interfaceC10639.mo26691(obj2);
        interfaceC10785.mo6794();
        throw null;
    }

    @Override // l.InterfaceC9374
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo24203(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f45375) {
            int i6 = this.f45376[i5];
            int[] iArr = this.f45369;
            int i7 = iArr[i6];
            int iM35294 = m35294(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f45368.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iM35294) == 0 || m35286(obj, i6, i, i2, i10)) {
                int iM35300 = m35300(iM35294);
                if (iM35300 == 9 || iM35300 == 17) {
                    if (!m35286(obj, i6, i, i2, i10) || m35295(i6).mo24203(C21244.m48234(iM35294 & 1048575, obj))) {
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                } else {
                    if (iM35300 != 27) {
                        if (iM35300 == 60 || iM35300 == 68) {
                            if (!m35284(i7, i6, obj) || m35295(i6).mo24203(C21244.m48234(iM35294 & 1048575, obj))) {
                            }
                        } else if (iM35300 != 49) {
                            if (iM35300 != 50) {
                                continue;
                            } else {
                                Object objM48234 = C21244.m48234(iM35294 & 1048575, obj);
                                InterfaceC10639 interfaceC10639 = this.f45383;
                                if (!interfaceC10639.mo26696(objM48234).isEmpty()) {
                                    interfaceC10639.mo26691(m35289(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) C21244.m48234(iM35294 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC9374 interfaceC9374M35295 = m35295(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (interfaceC9374M35295.mo24203(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
        }
        return !this.f45379 || this.f45380.mo40104(obj).m44327();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35279(int i, Object obj, InterfaceC6633 interfaceC6633) {
        if (obj instanceof String) {
            ((C23939) interfaceC6633).m52735(i, (String) obj);
        } else {
            ((C23939) interfaceC6633).m52738(i, (AbstractC5886) obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35283(Object obj, int i, InterfaceC10785 interfaceC10785) {
        if ((536870912 & i) != 0) {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6765());
        } else if (this.f45372) {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6772());
        } else {
            C21244.m48224(i & 1048575, obj, interfaceC10785.mo6777());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35281(Object obj, int i, Object obj2, AbstractC17009 abstractC17009, Object obj3) {
        InterfaceC12587 interfaceC12587M35276;
        int i2 = this.f45369[i];
        Object objM48234 = C21244.m48234(m35294(i) & 1048575, obj);
        if (objM48234 == null || (interfaceC12587M35276 = m35276(i)) == null) {
            return;
        }
        InterfaceC10639 interfaceC10639 = this.f45383;
        Map mapMo26692 = interfaceC10639.mo26692(objM48234);
        interfaceC10639.mo26691(m35289(i));
        for (Map.Entry entry : mapMo26692.entrySet()) {
            if (!interfaceC12587M35276.mo18942(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC17009.mo7228(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m35292(int i, Object obj, Object obj2) {
        int[] iArr = this.f45369;
        int i2 = iArr[i];
        if (m35284(i2, i, obj2)) {
            long jM35294 = m35294(i) & 1048575;
            Unsafe unsafe = f45368;
            Object object = unsafe.getObject(obj2, jM35294);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC9374 interfaceC9374M35295 = m35295(i);
            if (!m35284(i2, i, obj)) {
                if (!m35302(object)) {
                    unsafe.putObject(obj, jM35294, object);
                } else {
                    Object objMo24197 = interfaceC9374M35295.mo24197();
                    interfaceC9374M35295.mo24199(objMo24197, object);
                    unsafe.putObject(obj, jM35294, objMo24197);
                }
                m35296(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM35294);
            if (!m35302(object2)) {
                Object objMo24198 = interfaceC9374M35295.mo24197();
                interfaceC9374M35295.mo24199(objMo24198, object2);
                unsafe.putObject(obj, jM35294, objMo24198);
                object2 = objMo24198;
            }
            interfaceC9374M35295.mo24199(object2, object);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m35294(int i) {
        return this.f45369[i + 1];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35284(int i, int i2, Object obj) {
        return C21244.m48233((long) (this.f45369[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35285(int i, Object obj) {
        boolean zEquals;
        int i2 = this.f45369[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM35294 = m35294(i);
            long j2 = iM35294 & 1048575;
            switch (m35300(iM35294)) {
                case 0:
                    if (Double.doubleToRawLongBits(C21244.m48241(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C21244.m48254(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C21244.m48248(j2, obj);
                case 8:
                    Object objM48234 = C21244.m48234(j2, obj);
                    if (objM48234 instanceof String) {
                        zEquals = ((String) objM48234).isEmpty();
                    } else if (objM48234 instanceof AbstractC5886) {
                        zEquals = AbstractC5886.f18080.equals(objM48234);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return !zEquals;
                case 9:
                    if (C21244.m48234(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    zEquals = AbstractC5886.f18080.equals(C21244.m48234(j2, obj));
                    return !zEquals;
                case 11:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C21244.m48233(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C21244.m48253(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C21244.m48234(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C21244.m48233(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35296(int i, int i2, Object obj) {
        C21244.m48223(i, this.f45369[i2 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35297(int i, Object obj) {
        int i2 = this.f45369[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C21244.m48223((1 << (i2 >>> 20)) | C21244.m48233(j, obj), j, obj);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m35302(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC21760) {
            return ((AbstractC21760) obj).m49081();
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m35299(Object obj) {
        if (!m35302(obj)) {
            throw new IllegalArgumentException(C5368.m15337(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35275(long j, Object obj) {
        return ((Integer) C21244.m48234(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m35288(long j, Object obj) {
        return ((Long) C21244.m48234(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35287(AbstractC21760 abstractC21760, AbstractC21760 abstractC21761, int i) {
        return m35285(i, (Object) abstractC21760) == m35285(i, (Object) abstractC21761);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m35286(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m35285(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
