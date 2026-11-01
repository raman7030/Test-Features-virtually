package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܺᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBEO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17672 extends C2920 {

    /* JADX INFO: renamed from: ۨ */
    public static final C23648 f52782 = new C23648(new C14260(C9566.m22275("java/lang/reflect/Array")), new C21637(new C14930("newInstance"), new C14930("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ֡ */
    public InterfaceC12548 f52783;

    /* JADX INFO: renamed from: ֨ */
    public int f52784;

    /* JADX INFO: renamed from: ۗ */
    public C12980 f52785;

    /* JADX INFO: renamed from: ۙ */
    public int f52786;

    /* JADX INFO: renamed from: ۚ */
    public boolean f52787;

    /* JADX INFO: renamed from: ۛ */
    public final C10968 f52788;

    /* JADX INFO: renamed from: ۠ */
    public boolean f52789;

    /* JADX INFO: renamed from: ۤ */
    public boolean f52790;

    /* JADX INFO: renamed from: ۫ */
    public C12054 f52791;

    /* JADX INFO: renamed from: ۬ */
    public C5348 f52792;

    /* JADX INFO: renamed from: ܶ */
    public final ArrayList f52793;

    /* JADX INFO: renamed from: ᩴ */
    public final C24794 f52794;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f52795;

    /* JADX INFO: renamed from: ᩶ */
    public final C19665 f52796;

    /* JADX INFO: renamed from: ᩸ */
    public final int f52797;

    /* JADX INFO: renamed from: ᩹ */
    public final C5563 f52798;

    public C17672(C10968 c10968, C5563 c5563, C19665 c19665) {
        super(c5563.mo12299());
        this.f52788 = c10968;
        this.f52798 = c5563;
        this.f52796 = c19665;
        this.f52794 = C24794.f79245;
        this.f52797 = c5563.m12303();
        this.f52793 = new ArrayList(25);
        this.f52783 = null;
        this.f52787 = false;
        this.f52790 = false;
        this.f52786 = -1;
        this.f52784 = 0;
        this.f52795 = false;
        this.f52792 = null;
        this.f52791 = null;
    }

    /* JADX INFO: renamed from: ۖ */
    public final ArrayList m40191() {
        return this.f52793;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C5348 m40199() {
        return this.f52792;
    }

    /* JADX INFO: renamed from: ֡ */
    public final C12054 m40188() {
        return this.f52791;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40190(C15600 c15600) {
        this.f52783 = c15600;
        this.f52793.clear();
        this.f52787 = false;
        this.f52790 = false;
        this.f52786 = 0;
        this.f52784 = 0;
        this.f52795 = false;
        this.f52789 = false;
        this.f52785 = null;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m40196() {
        return this.f52787;
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m40194() {
        return this.f52790;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m40192() {
        return this.f52786;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m40197() {
        return this.f52784;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m40195() {
        return this.f52795;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m40193() {
        return this.f52789;
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m40189() {
        return this.f52785 != null;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C12980 m40198() {
        return this.f52785;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0289  */
    /* JADX WARN: Code duplicated, block: B:147:0x032b  */
    /* JADX WARN: Code duplicated, block: B:148:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0330  */
    /* JADX WARN: Code duplicated, block: B:151:0x0336  */
    /* JADX WARN: Code duplicated, block: B:152:0x0338  */
    /* JADX WARN: Code duplicated, block: B:153:0x033a  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:189:0x0415  */
    /* JADX WARN: Code duplicated, block: B:192:0x042a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0430  */
    /* JADX WARN: Code duplicated, block: B:195:0x043f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0456  */
    /* JADX WARN: Code duplicated, block: B:198:0x045b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0461  */
    /* JADX WARN: Code duplicated, block: B:202:0x046f  */
    /* JADX WARN: Code duplicated, block: B:205:0x048f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0494 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x0496  */
    /* JADX WARN: Code duplicated, block: B:209:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x04ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:217:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:218:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:220:0x0500  */
    /* JADX WARN: Code duplicated, block: B:222:0x050d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:223:0x050f  */
    /* JADX WARN: Code duplicated, block: B:225:0x051f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0523  */
    /* JADX WARN: Code duplicated, block: B:227:0x052c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0536  */
    /* JADX WARN: Code duplicated, block: B:232:0x053b  */
    /* JADX WARN: Code duplicated, block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:211:0x04a9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.C2920
    /* JADX INFO: renamed from: ֫ */
    public final void mo4773(C14280 c14280, int i, int i2) {
        C21442 c21442;
        C22783 c22783;
        AbstractC15405 abstractC15405;
        ArrayList arrayList;
        C12054 c12054;
        int i3;
        int i4;
        int i5;
        C3336 c3336;
        C22783 c22784;
        C3336 c3337;
        AbstractC15405 abstractC15405M10335;
        C21442 c21442M48573;
        C5348 c5348;
        C21027 c21027M4787;
        ArrayList arrayListM4786;
        boolean zM11599;
        AbstractC17417 c3338;
        AbstractC17417 c7360;
        C5348 c5349;
        C22783 c22783M56524get;
        InterfaceC3830 interfaceC3830M50974;
        C9566 c9566M53655;
        C12054 c12055;
        C13395 c13395;
        int i6 = i2;
        int size = c14280.m32824().size() + this.f52797;
        int iM4765 = m4765();
        if (iM4765 == 0) {
            c21442 = C21442.f67643;
        } else {
            int iM4792 = m4792();
            if (iM4792 >= 0) {
                c21442 = new C21442(1);
                c21442.m43248(0, C22783.m50968(iM4792, m4766(0)));
            } else {
                C21442 c21443 = new C21442(iM4765);
                int iM50982 = size;
                for (int i7 = 0; i7 < iM4765; i7++) {
                    C22783 c22783M50968 = C22783.m50968(iM50982, m4766(i7));
                    c21443.m43248(i7, c22783M50968);
                    iM50982 += c22783M50968.m50982();
                }
                if (i6 == 79) {
                    if (iM4765 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C22783 c22783M56524get2 = c21443.m56524get(0);
                    C22783 c22783M56524get3 = c21443.m56524get(1);
                    c21443.m43248(0, c21443.m56524get(2));
                    c21443.m43248(1, c22783M56524get2);
                    c21443.m43248(2, c22783M56524get3);
                } else if (i6 == 181) {
                    if (iM4765 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C22783 c22783M56524get4 = c21443.m56524get(0);
                    c21443.m43248(0, c21443.m56524get(1));
                    c21443.m43248(1, c22783M56524get4);
                }
                c21442 = c21443;
            }
            c21442.mo22326();
        }
        C21442 c21444 = c21442;
        int size2 = c21444.size();
        super.mo4773(c14280, i, i2);
        C5563 c5563 = this.f52798;
        C12054 c12054M12298 = c5563.m12298(i);
        C22783 c22783M4767 = m4767(i6 == 54);
        int iM4781 = m4781();
        ArrayList arrayList2 = this.f52793;
        if (iM4781 != 0) {
            if (c22783M4767 == null) {
                if (iM4781 == 1) {
                    c22783M4767 = C22783.m50968(size, m4791());
                } else {
                    int iM25313 = this.f52788.m25313();
                    C22783[] c22783Arr = new C22783[size2];
                    for (int i8 = 0; i8 < size2; i8++) {
                        C22783 c22783M56524get5 = c21444.m56524get(i8);
                        InterfaceC3830 interfaceC3830M50975 = c22783M56524get5.m50974();
                        C22783 c22783M50983 = c22783M56524get5.m50983(iM25313);
                        arrayList2.add(new C3336(C14065.m31920(interfaceC3830M50975), c12054M12298, c22783M50983, c22783M56524get5));
                        c22783Arr[i8] = c22783M50983;
                        iM25313 += c22783M56524get5.m50982();
                    }
                    for (int iM4789 = m4789(); iM4789 != 0; iM4789 >>= 4) {
                        C22783 c22785 = c22783Arr[(iM4789 & 15) - 1];
                        InterfaceC3830 interfaceC3830M50976 = c22785.m50974();
                        arrayList2.add(new C3336(C14065.m31920(interfaceC3830M50976), c12054M12298, c22785.m50983(size), c22785));
                        size += interfaceC3830M50976.getType().m22291();
                    }
                    return;
                }
            }
            c22783 = c22783M4767;
        } else if (i6 == 87 || i6 == 88) {
            return;
        } else {
            c22783 = null;
        }
        InterfaceC3830 interfaceC3830 = c22783 != null ? c22783 : C9566.f26318;
        AbstractC15405 abstractC15405M4790 = m4790();
        if (i6 == 197) {
            this.f52795 = true;
            this.f52784 = 6;
            int iM50986 = c22783.m50986();
            C9566 c9566 = C9566.f26304;
            C22783 c22783M50969 = C22783.m50968(iM50986, c9566);
            abstractC15405 = abstractC15405M4790;
            arrayList = arrayList2;
            arrayList.add(new C13395(C14065.m31913(size2, c9566), c12054M12298, c21444, this.f52783, C14260.f40606));
            arrayList.add(new C3336(new C5348(55, c9566, C15600.f44675, null), c12054M12298, c22783M50969, C21442.f67643));
            C9566 c9566M32771 = ((C14260) abstractC15405).m32771();
            for (int i9 = 0; i9 < size2; i9++) {
                c9566M32771 = c9566M32771.m22287();
            }
            C22783 c22783M509610 = C22783.m50968(c22783.m50989(), C9566.f26328);
            if (c9566M32771.m22290()) {
                c12055 = c12054M12298;
                c13395 = new C13395(C14065.f39677, c12054M12298, C21442.f67643, this.f52783, C10908.m25164(c9566M32771));
            } else {
                c12055 = c12054M12298;
                c13395 = new C13395(C14065.f39712, c12055, C21442.f67643, this.f52783, new C14260(c9566M32771));
            }
            arrayList.add(c13395);
            C5348 c5348M31923 = C14065.m31923(c22783M509610.getType());
            C21442 c21445 = C21442.f67643;
            arrayList.add(new C3336(c5348M31923, c12055, c22783M509610, c21445));
            C22783 c22783M509611 = C22783.m50968(c22783.m50989(), C9566.f26324);
            C23648 c23648 = f52782;
            arrayList.add(new C13395(new C5348(49, c23648.m41622().m53654(), C15600.f44648), c12055, C21442.m48566(c22783M509610, c22783M50969), this.f52783, c23648));
            C9566 c9566M53656 = c23648.m41622().m53655();
            c9566M53656.getClass();
            arrayList.add(new C3336(new C5348(55, c9566M53656, C15600.f44675, null), c12055, c22783M509611, c21445));
            C21442 c21442M48568 = C21442.m48568(c22783M509611);
            c12054 = c12055;
            c21444 = c21442M48568;
            i6 = 192;
        } else {
            abstractC15405 = abstractC15405M4790;
            arrayList = arrayList2;
            c12054 = c12054M12298;
            if (i6 == 168) {
                this.f52789 = true;
                return;
            } else if (i6 == 169) {
                try {
                    this.f52785 = (C12980) m4766(0);
                    return;
                } catch (ClassCastException e) {
                    throw new RuntimeException("Argument to RET was not a ReturnAddress", e);
                }
            }
        }
        if (i6 == 0) {
            i3 = 1;
        } else if (i6 == 20) {
            i3 = 5;
        } else if (i6 == 21) {
            i3 = 2;
        } else if (i6 == 171) {
            i3 = 13;
        } else if (i6 == 172) {
            i3 = 33;
        } else if (i6 == 198) {
            i3 = 7;
        } else if (i6 != 199) {
            switch (i6) {
                case 0:
                    i3 = 1;
                    break;
                case 18:
                    i3 = 5;
                    break;
                case 46:
                    i3 = 38;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    i3 = 2;
                    break;
                case 79:
                    i3 = 39;
                    break;
                case 96:
                    i3 = 14;
                    break;
                case 100:
                    i3 = 15;
                    break;
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                    i3 = 16;
                    break;
                case 108:
                    i3 = 17;
                    break;
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                    i3 = 18;
                    break;
                case 116:
                    i3 = 19;
                    break;
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                    i3 = 23;
                    break;
                case 122:
                    i3 = 24;
                    break;
                case 124:
                    i3 = 25;
                    break;
                case 126:
                    i3 = 20;
                    break;
                case 128:
                    i3 = 21;
                    break;
                case 130:
                    i3 = 22;
                    break;
                default:
                    switch (i6) {
                        case 132:
                            i3 = 14;
                            break;
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                            i3 = 29;
                            break;
                        case 145:
                            i3 = 30;
                            break;
                        case 146:
                            i3 = 31;
                            break;
                        case 147:
                            i3 = 32;
                            break;
                        case 148:
                        case 149:
                        case 151:
                            i3 = 27;
                            break;
                        case 150:
                        case 152:
                            i3 = 28;
                            break;
                        case 153:
                        case 159:
                        case 165:
                            i3 = 7;
                            break;
                        case EnumC19222.f57460 /* 154 */:
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                        case 166:
                            i3 = 8;
                            break;
                        case 155:
                        case 161:
                            i3 = 9;
                            break;
                        case 156:
                        case 162:
                            i3 = 10;
                            break;
                        case 157:
                        case 163:
                            i3 = 12;
                            break;
                        case 158:
                        case 164:
                            i3 = 11;
                            break;
                        case 167:
                            i3 = 6;
                            break;
                        default:
                            switch (i6) {
                                case 177:
                                    i3 = 33;
                                    break;
                                case 178:
                                    i3 = 46;
                                    break;
                                case 179:
                                    i3 = 48;
                                    break;
                                case 180:
                                    i3 = 45;
                                    break;
                                case 181:
                                    i3 = 47;
                                    break;
                                case 182:
                                    C23648 c23649 = (C23648) abstractC15405;
                                    if (c23649.m38521().equals(c5563.mo12304())) {
                                        int i10 = 0;
                                        while (true) {
                                            C19665 c19665 = this.f52796;
                                            if (i10 < c19665.size()) {
                                                InterfaceC13650 interfaceC13650M56518get = c19665.m56518get(i10);
                                                if ((interfaceC13650M56518get.mo12306() & 2) == 0 || !c23649.m38522().equals(interfaceC13650M56518get.mo12301())) {
                                                    i10++;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    i3 = c23649.m41620() ? 58 : 50;
                                    break;
                                case 183:
                                    C23648 c236410 = (C23648) abstractC15405;
                                    i3 = (!c236410.m38522().m48853() && !c236410.m38521().equals(c5563.mo12304())) ? 51 : 52;
                                    break;
                                case 184:
                                    i3 = 49;
                                    break;
                                case 185:
                                    i3 = 53;
                                    break;
                                case 186:
                                    i3 = 59;
                                    break;
                                case 187:
                                    i3 = 40;
                                    break;
                                case 188:
                                case 189:
                                    i3 = 41;
                                    break;
                                case 190:
                                    i3 = 34;
                                    break;
                                case 191:
                                    i3 = 35;
                                    break;
                                case 192:
                                    i3 = 43;
                                    break;
                                case 193:
                                    i3 = 44;
                                    break;
                                case 194:
                                    i3 = 36;
                                    break;
                                case 195:
                                    i3 = 37;
                                    break;
                                default:
                                    throw new RuntimeException("shouldn't happen");
                            }
                            break;
                    }
                    break;
            }
        } else {
            i3 = 8;
        }
        InterfaceC3830 interfaceC3831 = interfaceC3830;
        C5348 c5348M31914 = C14065.m31914(i3, interfaceC3831, c21444, abstractC15405);
        if (c22783 != null && c5348M31914.m11606()) {
            this.f52784++;
            if (c5348M31914.m11605() == 59) {
                c9566M53655 = ((C24989) abstractC15405).m54888();
            } else {
                c9566M53655 = ((C23648) abstractC15405).m41622().m53655();
            }
            c9566M53655.getClass();
            i4 = i6;
            c3336 = new C3336(new C5348(55, c9566M53655, C15600.f44675, null), c12054, c22783, C21442.f67643);
        } else {
            i4 = i6;
            if (c22783 == null || !c5348M31914.m11599()) {
                i5 = 41;
                c3336 = null;
            } else {
                this.f52784++;
                c3336 = new C3336(C14065.m31923(c22783.m50974()), c12054, c22783, C21442.f67643);
            }
            c22784 = c22783;
            c3337 = c3336;
            if (i3 == i5) {
                abstractC15405M10335 = C14260.m32769(c5348M31914.m11604());
            } else if (abstractC15405 == null || size2 != 2) {
                abstractC15405M10335 = abstractC15405;
            } else {
                InterfaceC3830 interfaceC3830M50977 = c21444.m56524get(0).m50974();
                InterfaceC3830 interfaceC3830M50978 = c21444.m56524get(1).m50974();
                if (!interfaceC3830M50978.mo7482() && !interfaceC3830M50977.mo7482()) {
                    abstractC15405M10335 = abstractC15405;
                } else if (this.f52794.m54473(c5348M31914, c21444.m56524get(0), c21444.m56524get(1))) {
                    if (interfaceC3830M50978.mo7482()) {
                        abstractC15405M10335 = (AbstractC15405) interfaceC3830M50978;
                        c21442M48573 = c21444.m48574();
                        if (c5348M31914.m11605() == 15) {
                            abstractC15405M10335 = C4873.m10335(-((C4873) interfaceC3830M50978).mo4598());
                            i3 = 14;
                        }
                    } else {
                        abstractC15405M10335 = (AbstractC15405) interfaceC3830M50977;
                        c21442M48573 = c21444.m48573();
                    }
                    c21444 = c21442M48573;
                    c5348M31914 = C14065.m31914(i3, interfaceC3831, c21444, abstractC15405M10335);
                } else {
                    abstractC15405M10335 = abstractC15405;
                }
            }
            c5348 = c5348M31914;
            c21027M4787 = m4787();
            arrayListM4786 = m4786();
            zM11599 = c5348.m11599();
            this.f52795 |= zM11599;
            if (c21027M4787 != null) {
                if (i3 == 33) {
                    if (c21444.size() != 0) {
                        c22783M56524get = c21444.m56524get(0);
                        interfaceC3830M50974 = c22783M56524get.m50974();
                        if (c22783M56524get.m50989() != 0) {
                            arrayList.add(new C3336(C14065.m31920(interfaceC3830M50974), c12054, C22783.m50968(0, interfaceC3830M50974), c22783M56524get));
                        }
                    }
                    c7360 = new C3336(C14065.f39817, c12054, (C22783) null, C21442.f67643);
                    this.f52786 = 0;
                    c5349 = this.f52792;
                    if (c5349 == null) {
                        this.f52792 = c5348;
                        this.f52791 = c12054;
                    } else {
                        if (c5349 == c5348) {
                            throw new C4933("return op mismatch: " + c5348 + ", " + this.f52792, null);
                        }
                        if (c12054.m27610() > this.f52791.m27610()) {
                            this.f52791 = c12054;
                        }
                    }
                    this.f52790 = true;
                } else if (abstractC15405M10335 != null) {
                    if (zM11599) {
                        if (c5348.m11605() == 58) {
                            c3338 = new C13395(c5348, c12054, c21444, this.f52783, abstractC15405M10335);
                        } else {
                            c3338 = new C6019(c5348, c12054, c21444, this.f52783, (C23648) abstractC15405M10335);
                        }
                        this.f52787 = true;
                        this.f52786 = this.f52783.size();
                    } else {
                        c7360 = new C7360(c5348, c12054, c22784, c21444, abstractC15405M10335);
                    }
                } else if (zM11599) {
                    c3338 = new C24123(c5348, c12054, c21444, this.f52783);
                    this.f52787 = true;
                    if (i4 == 191) {
                        this.f52786 = -1;
                    } else {
                        this.f52786 = this.f52783.size();
                    }
                } else {
                    c3338 = new C3336(c5348, c12054, c22784, c21444);
                }
                c3338 = c7360;
            } else if (c21027M4787.size() == 0) {
                c3338 = new C3336(C14065.f39817, c12054, (C22783) null, C21442.f67643);
                this.f52786 = 0;
            } else {
                C22388 c22388M47442 = c21027M4787.m47442();
                c7360 = new C8030(c5348, c12054, c22784, c21444, c22388M47442);
                this.f52786 = c22388M47442.size();
                c3338 = c7360;
            }
            arrayList.add(c3338);
            if (c3337 != null) {
                arrayList.add(c3337);
            }
            if (arrayListM4786 != null) {
                this.f52784++;
                arrayList.add(new C22113(C14065.f39706, c12054, C21442.m48568(c3337.m39655()), arrayListM4786, abstractC15405M10335));
            }
        }
        i5 = 41;
        c22783 = null;
        c22784 = c22783;
        c3337 = c3336;
        if (i3 == i5) {
            abstractC15405M10335 = C14260.m32769(c5348M31914.m11604());
        } else if (abstractC15405 == null) {
            abstractC15405M10335 = abstractC15405;
        } else {
            abstractC15405M10335 = abstractC15405;
        }
        c5348 = c5348M31914;
        c21027M4787 = m4787();
        arrayListM4786 = m4786();
        zM11599 = c5348.m11599();
        this.f52795 |= zM11599;
        if (c21027M4787 != null) {
            if (i3 == 33) {
                if (c21444.size() != 0) {
                    c22783M56524get = c21444.m56524get(0);
                    interfaceC3830M50974 = c22783M56524get.m50974();
                    if (c22783M56524get.m50989() != 0) {
                        arrayList.add(new C3336(C14065.m31920(interfaceC3830M50974), c12054, C22783.m50968(0, interfaceC3830M50974), c22783M56524get));
                    }
                }
                c7360 = new C3336(C14065.f39817, c12054, (C22783) null, C21442.f67643);
                this.f52786 = 0;
                c5349 = this.f52792;
                if (c5349 == null) {
                    this.f52792 = c5348;
                    this.f52791 = c12054;
                } else {
                    if (c5349 == c5348) {
                        throw new C4933("return op mismatch: " + c5348 + ", " + this.f52792, null);
                    }
                    if (c12054.m27610() > this.f52791.m27610()) {
                        this.f52791 = c12054;
                    }
                }
                this.f52790 = true;
            } else if (abstractC15405M10335 != null) {
                if (zM11599) {
                    if (c5348.m11605() == 58) {
                        c3338 = new C13395(c5348, c12054, c21444, this.f52783, abstractC15405M10335);
                    } else {
                        c3338 = new C6019(c5348, c12054, c21444, this.f52783, (C23648) abstractC15405M10335);
                    }
                    this.f52787 = true;
                    this.f52786 = this.f52783.size();
                } else {
                    c7360 = new C7360(c5348, c12054, c22784, c21444, abstractC15405M10335);
                }
            } else if (zM11599) {
                c3338 = new C24123(c5348, c12054, c21444, this.f52783);
                this.f52787 = true;
                if (i4 == 191) {
                    this.f52786 = -1;
                } else {
                    this.f52786 = this.f52783.size();
                }
            } else {
                c3338 = new C3336(c5348, c12054, c22784, c21444);
            }
            c3338 = c7360;
        } else if (c21027M4787.size() == 0) {
            c3338 = new C3336(C14065.f39817, c12054, (C22783) null, C21442.f67643);
            this.f52786 = 0;
        } else {
            C22388 c22388M47443 = c21027M4787.m47442();
            c7360 = new C8030(c5348, c12054, c22784, c21444, c22388M47443);
            this.f52786 = c22388M47443.size();
            c3338 = c7360;
        }
        arrayList.add(c3338);
        if (c3337 != null) {
            arrayList.add(c3337);
        }
        if (arrayListM4786 != null) {
            this.f52784++;
            arrayList.add(new C22113(C14065.f39706, c12054, C21442.m48568(c3337.m39655()), arrayListM4786, abstractC15405M10335));
        }
    }
}
