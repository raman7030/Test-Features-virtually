package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ܺᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBEO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16102 extends C0580 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C22390 f49619 = new C22390(new C12512(C7573.m20298("java/lang/reflect/Array")), new C20274(new C13217("newInstance"), new C13217("(Ljava/lang/Class;[I)Ljava/lang/Object;")));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC10711 f49620;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f49621;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11165 f49622;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49623;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f49624;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C9048 f49625;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f49626;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f49627;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10191 f49628;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3135 f49629;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49630;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23596 f49631;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f49632;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18199 f49633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f49634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3361 f49635;

    public C16102(C9048 c9048, C3361 c3361, C18199 c18199) {
        super(c3361.mo10262());
        this.f49625 = c9048;
        this.f49635 = c3361;
        this.f49633 = c18199;
        this.f49631 = C23596.f76501;
        this.f49634 = c3361.m10266();
        this.f49630 = new ArrayList(25);
        this.f49620 = null;
        this.f49624 = false;
        this.f49627 = false;
        this.f49623 = -1;
        this.f49621 = 0;
        this.f49632 = false;
        this.f49629 = null;
        this.f49628 = null;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList m38000() {
        return this.f49630;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C3135 m38008() {
        return this.f49629;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10191 m37997() {
        return this.f49628;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37999(C13922 c13922) {
        this.f49620 = c13922;
        this.f49630.clear();
        this.f49624 = false;
        this.f49627 = false;
        this.f49623 = 0;
        this.f49621 = 0;
        this.f49632 = false;
        this.f49626 = false;
        this.f49622 = null;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m38005() {
        return this.f49624;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m38003() {
        return this.f49627;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m38001() {
        return this.f49623;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m38006() {
        return this.f49621;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m38004() {
        return this.f49632;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m38002() {
        return this.f49626;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m37998() {
        return this.f49622 != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11165 m38007() {
        return this.f49622;
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
    @Override // l.C0580
    /* JADX INFO: renamed from: ֫ */
    public final void mo2402(C12533 c12533, int i, int i2) {
        C20069 c20069;
        C21480 c21480;
        AbstractC13717 abstractC13717;
        ArrayList arrayList;
        C10191 c10191;
        int i3;
        int i4;
        int i5;
        C1018 c1018;
        C21480 c21481;
        C1018 c1019;
        AbstractC13717 abstractC13717M8291;
        C20069 c20069M46257;
        C3135 c3135;
        C19632 c19632M2416;
        ArrayList arrayListM2415;
        boolean zM9556;
        AbstractC15834 c10110;
        AbstractC15834 c5252;
        C3135 c3136;
        C21480 c21480M41004get;
        InterfaceC1538 interfaceC1538M48637;
        C7573 c7573M51261;
        C10191 c10192;
        C11602 c11602;
        int i6 = i2;
        int size = c12533.m30752().size() + this.f49634;
        int iM2394 = m2394();
        if (iM2394 == 0) {
            c20069 = C20069.f65002;
        } else {
            int iM2421 = m2421();
            if (iM2421 >= 0) {
                c20069 = new C20069(1);
                c20069.m40988(0, C21480.m48631(iM2421, m2395(0)));
            } else {
                C20069 c200610 = new C20069(iM2394);
                int iM48645 = size;
                for (int i7 = 0; i7 < iM2394; i7++) {
                    C21480 c21480M48631 = C21480.m48631(iM48645, m2395(i7));
                    c200610.m40988(i7, c21480M48631);
                    iM48645 += c21480M48631.m48645();
                }
                if (i6 == 79) {
                    if (iM2394 != 3) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C21480 c21480M41004get2 = c200610.m41004get(0);
                    C21480 c21480M41004get3 = c200610.m41004get(1);
                    c200610.m40988(0, c200610.m41004get(2));
                    c200610.m40988(1, c21480M41004get2);
                    c200610.m40988(2, c21480M41004get3);
                } else if (i6 == 181) {
                    if (iM2394 != 2) {
                        throw new RuntimeException("shouldn't happen");
                    }
                    C21480 c21480M41004get4 = c200610.m41004get(0);
                    c200610.m40988(0, c200610.m41004get(1));
                    c200610.m40988(1, c21480M41004get4);
                }
                c20069 = c200610;
            }
            c20069.mo20349();
        }
        C20069 c200611 = c20069;
        int size2 = c200611.size();
        super.mo2402(c12533, i, i2);
        C3361 c3361 = this.f49635;
        C10191 c10191M10261 = c3361.m10261(i);
        C21480 c21480M2396 = m2396(i6 == 54);
        int iM2410 = m2410();
        ArrayList arrayList2 = this.f49630;
        if (iM2410 != 0) {
            if (c21480M2396 == null) {
                if (iM2410 == 1) {
                    c21480M2396 = C21480.m48631(size, m2420());
                } else {
                    int iM23368 = this.f49625.m23368();
                    C21480[] c21480Arr = new C21480[size2];
                    for (int i8 = 0; i8 < size2; i8++) {
                        C21480 c21480M41004get5 = c200611.m41004get(i8);
                        InterfaceC1538 interfaceC1538M48638 = c21480M41004get5.m48637();
                        C21480 c21480M48646 = c21480M41004get5.m48646(iM23368);
                        arrayList2.add(new C1018(C12307.m29860(interfaceC1538M48638), c10191M10261, c21480M48646, c21480M41004get5));
                        c21480Arr[i8] = c21480M48646;
                        iM23368 += c21480M41004get5.m48645();
                    }
                    for (int iM2418 = m2418(); iM2418 != 0; iM2418 >>= 4) {
                        C21480 c21482 = c21480Arr[(iM2418 & 15) - 1];
                        InterfaceC1538 interfaceC1538M48639 = c21482.m48637();
                        arrayList2.add(new C1018(C12307.m29860(interfaceC1538M48639), c10191M10261, c21482.m48646(size), c21482));
                        size += interfaceC1538M48639.getType().m20314();
                    }
                    return;
                }
            }
            c21480 = c21480M2396;
        } else if (i6 == 87 || i6 == 88) {
            return;
        } else {
            c21480 = null;
        }
        InterfaceC1538 interfaceC1538 = c21480 != null ? c21480 : C7573.f23406;
        AbstractC13717 abstractC13717M2419 = m2419();
        if (i6 == 197) {
            this.f49632 = true;
            this.f49621 = 6;
            int iM48649 = c21480.m48649();
            C7573 c7573 = C7573.f23392;
            C21480 c21480M48632 = C21480.m48631(iM48649, c7573);
            abstractC13717 = abstractC13717M2419;
            arrayList = arrayList2;
            arrayList.add(new C11602(C12307.m29853(size2, c7573), c10191M10261, c200611, this.f49620, C12512.f37582));
            arrayList.add(new C1018(new C3135(55, c7573, C13922.f41594, null), c10191M10261, c21480M48632, C20069.f65002));
            C7573 c7573M30696 = ((C12512) abstractC13717).m30696();
            for (int i9 = 0; i9 < size2; i9++) {
                c7573M30696 = c7573M30696.m20310();
            }
            C21480 c21480M48633 = C21480.m48631(c21480.m48652(), C7573.f23416);
            if (c7573M30696.m20313()) {
                c10192 = c10191M10261;
                c11602 = new C11602(C12307.f36662, c10191M10261, C20069.f65002, this.f49620, C8985.m23220(c7573M30696));
            } else {
                c10192 = c10191M10261;
                c11602 = new C11602(C12307.f36697, c10192, C20069.f65002, this.f49620, new C12512(c7573M30696));
            }
            arrayList.add(c11602);
            C3135 c3135M29863 = C12307.m29863(c21480M48633.getType());
            C20069 c200612 = C20069.f65002;
            arrayList.add(new C1018(c3135M29863, c10192, c21480M48633, c200612));
            C21480 c21480M48634 = C21480.m48631(c21480.m48652(), C7573.f23412);
            C22390 c22390 = f49619;
            arrayList.add(new C11602(new C3135(49, c22390.m39386().m51260(), C13922.f41567), c10192, C20069.m46250(c21480M48633, c21480M48632), this.f49620, c22390));
            C7573 c7573M51262 = c22390.m39386().m51261();
            c7573M51262.getClass();
            arrayList.add(new C1018(new C3135(55, c7573M51262, C13922.f41594, null), c10192, c21480M48634, c200612));
            C20069 c20069M46252 = C20069.m46252(c21480M48634);
            c10191 = c10192;
            c200611 = c20069M46252;
            i6 = 192;
        } else {
            abstractC13717 = abstractC13717M2419;
            arrayList = arrayList2;
            c10191 = c10191M10261;
            if (i6 == 168) {
                this.f49626 = true;
                return;
            } else if (i6 == 169) {
                try {
                    this.f49622 = (C11165) m2395(0);
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
                        case EnumC17734.f54268 /* 154 */:
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
                                    C22390 c22391 = (C22390) abstractC13717;
                                    if (c22391.m36363().equals(c3361.mo10267())) {
                                        int i10 = 0;
                                        while (true) {
                                            C18199 c18199 = this.f49633;
                                            if (i10 < c18199.size()) {
                                                InterfaceC11870 interfaceC11870M40998get = c18199.m40998get(i10);
                                                if ((interfaceC11870M40998get.mo10269() & 2) == 0 || !c22391.m36364().equals(interfaceC11870M40998get.mo10264())) {
                                                    i10++;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    i3 = c22391.m39384() ? 58 : 50;
                                    break;
                                case 183:
                                    C22390 c22392 = (C22390) abstractC13717;
                                    i3 = (!c22392.m36364().m46531() && !c22392.m36363().equals(c3361.mo10267())) ? 51 : 52;
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
        InterfaceC1538 interfaceC1539 = interfaceC1538;
        C3135 c3135M29854 = C12307.m29854(i3, interfaceC1539, c200611, abstractC13717);
        if (c21480 != null && c3135M29854.m9563()) {
            this.f49621++;
            if (c3135M29854.m9562() == 59) {
                c7573M51261 = ((C23801) abstractC13717).m52479();
            } else {
                c7573M51261 = ((C22390) abstractC13717).m39386().m51261();
            }
            c7573M51261.getClass();
            i4 = i6;
            c1018 = new C1018(new C3135(55, c7573M51261, C13922.f41594, null), c10191, c21480, C20069.f65002);
        } else {
            i4 = i6;
            if (c21480 == null || !c3135M29854.m9556()) {
                i5 = 41;
                c1018 = null;
            } else {
                this.f49621++;
                c1018 = new C1018(C12307.m29863(c21480.m48637()), c10191, c21480, C20069.f65002);
            }
            c21481 = c21480;
            c1019 = c1018;
            if (i3 == i5) {
                abstractC13717M8291 = C12512.m30694(c3135M29854.m9561());
            } else if (abstractC13717 == null || size2 != 2) {
                abstractC13717M8291 = abstractC13717;
            } else {
                InterfaceC1538 interfaceC1538M486310 = c200611.m41004get(0).m48637();
                InterfaceC1538 interfaceC1538M486311 = c200611.m41004get(1).m48637();
                if (!interfaceC1538M486311.mo5253() && !interfaceC1538M486310.mo5253()) {
                    abstractC13717M8291 = abstractC13717;
                } else if (this.f49631.m52070(c3135M29854, c200611.m41004get(0), c200611.m41004get(1))) {
                    if (interfaceC1538M486311.mo5253()) {
                        abstractC13717M8291 = (AbstractC13717) interfaceC1538M486311;
                        c20069M46257 = c200611.m46258();
                        if (c3135M29854.m9562() == 15) {
                            abstractC13717M8291 = C2635.m8291(-((C2635) interfaceC1538M486311).mo2231());
                            i3 = 14;
                        }
                    } else {
                        abstractC13717M8291 = (AbstractC13717) interfaceC1538M486310;
                        c20069M46257 = c200611.m46257();
                    }
                    c200611 = c20069M46257;
                    c3135M29854 = C12307.m29854(i3, interfaceC1539, c200611, abstractC13717M8291);
                } else {
                    abstractC13717M8291 = abstractC13717;
                }
            }
            c3135 = c3135M29854;
            c19632M2416 = m2416();
            arrayListM2415 = m2415();
            zM9556 = c3135.m9556();
            this.f49632 |= zM9556;
            if (c19632M2416 != null) {
                if (i3 == 33) {
                    if (c200611.size() != 0) {
                        c21480M41004get = c200611.m41004get(0);
                        interfaceC1538M48637 = c21480M41004get.m48637();
                        if (c21480M41004get.m48652() != 0) {
                            arrayList.add(new C1018(C12307.m29860(interfaceC1538M48637), c10191, C21480.m48631(0, interfaceC1538M48637), c21480M41004get));
                        }
                    }
                    c5252 = new C1018(C12307.f36802, c10191, (C21480) null, C20069.f65002);
                    this.f49623 = 0;
                    c3136 = this.f49629;
                    if (c3136 == null) {
                        this.f49629 = c3135;
                        this.f49628 = c10191;
                    } else {
                        if (c3136 == c3135) {
                            throw new C2698("return op mismatch: " + c3135 + ", " + this.f49629, null);
                        }
                        if (c10191.m25588() > this.f49628.m25588()) {
                            this.f49628 = c10191;
                        }
                    }
                    this.f49627 = true;
                } else if (abstractC13717M8291 != null) {
                    if (zM9556) {
                        if (c3135.m9562() == 58) {
                            c10110 = new C11602(c3135, c10191, c200611, this.f49620, abstractC13717M8291);
                        } else {
                            c10110 = new C3841(c3135, c10191, c200611, this.f49620, (C22390) abstractC13717M8291);
                        }
                        this.f49624 = true;
                        this.f49623 = this.f49620.size();
                    } else {
                        c5252 = new C5252(c3135, c10191, c21481, c200611, abstractC13717M8291);
                    }
                } else if (zM9556) {
                    c10110 = new C22890(c3135, c10191, c200611, this.f49620);
                    this.f49624 = true;
                    if (i4 == 191) {
                        this.f49623 = -1;
                    } else {
                        this.f49623 = this.f49620.size();
                    }
                } else {
                    c10110 = new C1018(c3135, c10191, c21481, c200611);
                }
                c10110 = c5252;
            } else if (c19632M2416.size() == 0) {
                c10110 = new C1018(C12307.f36802, c10191, (C21480) null, C20069.f65002);
                this.f49623 = 0;
            } else {
                C21064 c21064M45146 = c19632M2416.m45146();
                c5252 = new C5957(c3135, c10191, c21481, c200611, c21064M45146);
                this.f49623 = c21064M45146.size();
                c10110 = c5252;
            }
            arrayList.add(c10110);
            if (c1019 != null) {
                arrayList.add(c1019);
            }
            if (arrayListM2415 != null) {
                this.f49621++;
                arrayList.add(new C20775(C12307.f36691, c10191, C20069.m46252(c1019.m37483()), arrayListM2415, abstractC13717M8291));
            }
        }
        i5 = 41;
        c21480 = null;
        c21481 = c21480;
        c1019 = c1018;
        if (i3 == i5) {
            abstractC13717M8291 = C12512.m30694(c3135M29854.m9561());
        } else if (abstractC13717 == null) {
            abstractC13717M8291 = abstractC13717;
        } else {
            abstractC13717M8291 = abstractC13717;
        }
        c3135 = c3135M29854;
        c19632M2416 = m2416();
        arrayListM2415 = m2415();
        zM9556 = c3135.m9556();
        this.f49632 |= zM9556;
        if (c19632M2416 != null) {
            if (i3 == 33) {
                if (c200611.size() != 0) {
                    c21480M41004get = c200611.m41004get(0);
                    interfaceC1538M48637 = c21480M41004get.m48637();
                    if (c21480M41004get.m48652() != 0) {
                        arrayList.add(new C1018(C12307.m29860(interfaceC1538M48637), c10191, C21480.m48631(0, interfaceC1538M48637), c21480M41004get));
                    }
                }
                c5252 = new C1018(C12307.f36802, c10191, (C21480) null, C20069.f65002);
                this.f49623 = 0;
                c3136 = this.f49629;
                if (c3136 == null) {
                    this.f49629 = c3135;
                    this.f49628 = c10191;
                } else {
                    if (c3136 == c3135) {
                        throw new C2698("return op mismatch: " + c3135 + ", " + this.f49629, null);
                    }
                    if (c10191.m25588() > this.f49628.m25588()) {
                        this.f49628 = c10191;
                    }
                }
                this.f49627 = true;
            } else if (abstractC13717M8291 != null) {
                if (zM9556) {
                    if (c3135.m9562() == 58) {
                        c10110 = new C11602(c3135, c10191, c200611, this.f49620, abstractC13717M8291);
                    } else {
                        c10110 = new C3841(c3135, c10191, c200611, this.f49620, (C22390) abstractC13717M8291);
                    }
                    this.f49624 = true;
                    this.f49623 = this.f49620.size();
                } else {
                    c5252 = new C5252(c3135, c10191, c21481, c200611, abstractC13717M8291);
                }
            } else if (zM9556) {
                c10110 = new C22890(c3135, c10191, c200611, this.f49620);
                this.f49624 = true;
                if (i4 == 191) {
                    this.f49623 = -1;
                } else {
                    this.f49623 = this.f49620.size();
                }
            } else {
                c10110 = new C1018(c3135, c10191, c21481, c200611);
            }
            c10110 = c5252;
        } else if (c19632M2416.size() == 0) {
            c10110 = new C1018(C12307.f36802, c10191, (C21480) null, C20069.f65002);
            this.f49623 = 0;
        } else {
            C21064 c21064M45147 = c19632M2416.m45146();
            c5252 = new C5957(c3135, c10191, c21481, c200611, c21064M45147);
            this.f49623 = c21064M45147.size();
            c10110 = c5252;
        }
        arrayList.add(c10110);
        if (c1019 != null) {
            arrayList.add(c1019);
        }
        if (arrayListM2415 != null) {
            this.f49621++;
            arrayList.add(new C20775(C12307.f36691, c10191, C20069.m46252(c1019.m37483()), arrayListM2415, abstractC13717M8291));
        }
    }
}
