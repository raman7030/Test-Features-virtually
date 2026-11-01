package p067l;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XARL */
/* JADX INFO: loaded from: classes2.dex */
public final class C8173 {

    /* JADX INFO: renamed from: ֫ */
    public final C14208 f21581 = C14208.m32683();

    /* JADX INFO: renamed from: ֫ */
    public static void m18955(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX INFO: renamed from: ֫ */
    public final C22926 m18956(char[] cArr) {
        InterfaceC20503 c7762;
        AbstractC14664 c11786;
        int i;
        int[] iArr = new int[cArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < cArr.length) {
            int i4 = i2 + 1;
            char c = cArr[i2];
            if ((32768 & c) == 0) {
                iArr[i3] = c;
                i3++;
                i2 = i4;
            } else {
                i2 += 2;
                char c2 = cArr[i4];
                if (c == 65535 && c2 == 65535) {
                    iArr[i3] = -1;
                    i3++;
                } else {
                    iArr[i3] = (c2 & 65535) | ((c & 32767) << 16);
                    i3++;
                }
            }
        }
        int i5 = iArr[0];
        int i6 = 4;
        if (i5 != 4) {
            throw new UnsupportedOperationException(new InvalidClassException(C22926.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(i5), 4)));
        }
        C22926 c22926 = new C22926(EnumC15548.values()[iArr[1]], iArr[2]);
        ArrayList<C22436> arrayList = new ArrayList();
        ArrayList<C22436> arrayList2 = new ArrayList();
        int i7 = iArr[3];
        int i8 = 0;
        while (true) {
            ArrayList<AbstractC24266> arrayList3 = c22926.f72152;
            if (i8 >= i7) {
                for (C22436 c22436 : arrayList) {
                    ((C15137) c22436.f70786).f43217 = (AbstractC24266) arrayList3.get(((Integer) c22436.f70787).intValue());
                }
                for (C22436 c22437 : arrayList2) {
                    ((AbstractC25196) c22437.f70786).f80592 = (C16478) arrayList3.get(((Integer) c22437.f70787).intValue());
                }
                int i9 = i6 + 1;
                int i10 = iArr[i6];
                int i11 = 0;
                while (i11 < i10) {
                    ((AbstractC9103) arrayList3.get(iArr[i9])).f24669 = true;
                    i11++;
                    i9++;
                }
                int i12 = i9 + 1;
                int i13 = iArr[i9];
                int i14 = 0;
                while (i14 < i13) {
                    ((C22042) arrayList3.get(iArr[i12])).f69357 = true;
                    i14++;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                EnumC15548 enumC15548 = EnumC15548.LEXER;
                EnumC15548 enumC15549 = c22926.f72147;
                if (enumC15549 == enumC15548) {
                    c22926.f72146 = new int[i16];
                }
                c22926.f72148 = new C22042[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = i15 + 1;
                    c22926.f72148[i17] = (C22042) arrayList3.get(iArr[i15]);
                    if (enumC15549 == EnumC15548.LEXER) {
                        i15 += 2;
                        c22926.f72146[i17] = iArr[i18];
                    } else {
                        i15 = i18;
                    }
                }
                c22926.f72153 = new C11313[i16];
                for (AbstractC24266 abstractC24266 : arrayList3) {
                    if (abstractC24266 instanceof C11313) {
                        C11313 c11313 = (C11313) abstractC24266;
                        C11313[] c11313Arr = c22926.f72153;
                        int i19 = abstractC24266.f76896;
                        c11313Arr[i19] = c11313;
                        c22926.f72148[i19].f69358 = c11313;
                    }
                }
                int i20 = i15 + 1;
                int i21 = iArr[i15];
                int i22 = 0;
                while (i22 < i21) {
                    c22926.f72150.add((C6618) arrayList3.get(iArr[i20]));
                    i22++;
                    i20++;
                }
                ArrayList arrayList4 = new ArrayList();
                int i23 = i20 + 1;
                int i24 = iArr[i20];
                for (int i25 = 0; i25 < i24; i25++) {
                    int i26 = iArr[i23];
                    int i27 = i23 + 1;
                    C25117 c25117 = new C25117(new int[0]);
                    arrayList4.add(c25117);
                    i23 += 2;
                    if (iArr[i27] != 0) {
                        c25117.m55125(-1);
                    }
                    for (int i28 = 0; i28 < i26; i28++) {
                        int i29 = i23 + 1;
                        int i30 = iArr[i23];
                        i23 += 2;
                        c25117.m55126(i30, iArr[i29]);
                    }
                }
                int i31 = i23 + 1;
                int i32 = iArr[i23];
                for (int i33 = 0; i33 < i32; i33++) {
                    int i34 = iArr[i31];
                    int i35 = iArr[i31 + 1];
                    int i36 = iArr[i31 + 2];
                    int i37 = iArr[i31 + 3];
                    int i38 = iArr[i31 + 4];
                    int i39 = iArr[i31 + 5];
                    AbstractC24266 abstractC24267 = (AbstractC24266) arrayList3.get(i35);
                    switch (i36) {
                        case 1:
                            c11786 = new C11786(abstractC24267, -1);
                            break;
                        case 2:
                            c11786 = i39 != 0 ? new C8630(abstractC24267, -1, i38) : new C8630(abstractC24267, i37, i38);
                            break;
                        case 3:
                            c11786 = new C10642((C22042) arrayList3.get(i37), i38, i39, abstractC24267);
                            break;
                        case 4:
                            c11786 = new C12654(abstractC24267, i37, i38, i39 != 0);
                            break;
                        case 5:
                            c11786 = i39 != 0 ? new C18490(abstractC24267, -1) : new C18490(abstractC24267, i37);
                            break;
                        case 6:
                            c11786 = new C4409(abstractC24267, i37, i38);
                            break;
                        case 7:
                            c11786 = new C3265(abstractC24267, (C25117) arrayList4.get(i37));
                            break;
                        case 8:
                            c11786 = new C14467(abstractC24267, (C25117) arrayList4.get(i37));
                            break;
                        case 9:
                            c11786 = new C13994(abstractC24267);
                            break;
                        case 10:
                            c11786 = new C3936(abstractC24267, i37);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC24266) arrayList3.get(i34)).m53605(c11786);
                    i31 += 6;
                }
                for (AbstractC24266 abstractC24268 : arrayList3) {
                    for (int i40 = 0; i40 < abstractC24268.f76893.size(); i40++) {
                        AbstractC14664 abstractC14664M53604 = abstractC24268.m53604(i40);
                        if (abstractC14664M53604 instanceof C10642) {
                            C10642 c10642 = (C10642) abstractC14664M53604;
                            C22042[] c22042Arr = c22926.f72148;
                            int i41 = c10642.f41850.f76896;
                            if (!c22042Arr[i41].f69357 || c10642.f29433 != 0) {
                                i41 = -1;
                            }
                            c22926.f72153[c10642.f41850.f76896].m53605(new C11786(c10642.f29431, i41));
                        }
                    }
                }
                for (AbstractC24266 abstractC24269 : arrayList3) {
                    if (abstractC24269 instanceof AbstractC25196) {
                        AbstractC25196 abstractC25196 = (AbstractC25196) abstractC24269;
                        C16478 c16478 = abstractC25196.f80592;
                        if (c16478 == null) {
                            throw new IllegalStateException();
                        }
                        if (c16478.f48382 != null) {
                            throw new IllegalStateException();
                        }
                        c16478.f48382 = abstractC25196;
                    }
                    if (abstractC24269 instanceof C9773) {
                        C9773 c9773 = (C9773) abstractC24269;
                        for (int i42 = 0; i42 < c9773.f76893.size(); i42++) {
                            AbstractC24266 abstractC242610 = c9773.m53604(i42).f41850;
                            if (abstractC242610 instanceof C15807) {
                                ((C15807) abstractC242610).f45773 = c9773;
                            }
                        }
                    } else if (abstractC24269 instanceof C21371) {
                        C21371 c21371 = (C21371) abstractC24269;
                        for (int i43 = 0; i43 < c21371.f76893.size(); i43++) {
                            AbstractC24266 abstractC242611 = c21371.m53604(i43).f41850;
                            if (abstractC242611 instanceof C23382) {
                                ((C23382) abstractC242611).f74506 = c21371;
                            }
                        }
                    }
                }
                int i44 = i31 + 1;
                int i45 = iArr[i31];
                int i46 = 1;
                while (i46 <= i45) {
                    int i47 = i44 + 1;
                    AbstractC9103 abstractC9103 = (AbstractC9103) arrayList3.get(iArr[i44]);
                    c22926.f72145.add(abstractC9103);
                    abstractC9103.f24668 = i46 - 1;
                    i46++;
                    i44 = i47;
                }
                if (enumC15549 == EnumC15548.LEXER) {
                    int i48 = i44 + 1;
                    c22926.f72149 = new InterfaceC20503[iArr[i44]];
                    for (int i49 = 0; i49 < c22926.f72149.length; i49++) {
                        EnumC3067 enumC3067 = EnumC3067.values()[iArr[i48]];
                        int i50 = i48 + 2;
                        int i51 = iArr[i48 + 1];
                        i48 += 3;
                        int i52 = iArr[i50];
                        switch (C12197.f34104[enumC3067.ordinal()]) {
                            case 1:
                                c7762 = new C7762(i51);
                                break;
                            case 2:
                                c7762 = new C3738(i51, i52);
                                break;
                            case 3:
                                c7762 = new C17148(i51);
                                break;
                            case 4:
                                c7762 = C23185.f72831;
                                break;
                            case 5:
                                c7762 = C23855.f75784;
                                break;
                            case 6:
                                c7762 = new C21844(i51);
                                break;
                            case 7:
                                c7762 = C7091.f18493;
                                break;
                            case 8:
                                c7762 = new C5750(i51);
                                break;
                            default:
                                Locale.getDefault();
                                throw new IllegalArgumentException("The specified lexer action type " + enumC3067 + " is not valid.");
                        }
                        c22926.f72149[i49] = c7762;
                    }
                }
                for (AbstractC24266 abstractC242612 : arrayList3) {
                    if ((abstractC242612 instanceof C23382) && c22926.f72148[abstractC242612.f76896].f69357) {
                        AbstractC24266 abstractC242613 = abstractC242612.m53604(abstractC242612.f76893.size() - 1).f41850;
                        if ((abstractC242613 instanceof C15137) && abstractC242613.f76892 && (abstractC242613.m53604(0).f41850 instanceof C11313)) {
                            ((C23382) abstractC242612).f74507 = true;
                        }
                    }
                }
                this.f21581.getClass();
                for (AbstractC24266 abstractC242614 : arrayList3) {
                    if (abstractC242614 != null) {
                        ArrayList arrayList5 = abstractC242614.f76893;
                        m18955(abstractC242614.f76892 || arrayList5.size() <= 1);
                        if (abstractC242614 instanceof C15807) {
                            m18955(((C15807) abstractC242614).f45773 != null);
                        }
                        if (abstractC242614 instanceof C23382) {
                            C23382 c23382 = (C23382) abstractC242614;
                            m18955(c23382.f74506 != null);
                            m18955(c23382.f76893.size() == 2);
                            if (c23382.m53604(0).f41850 instanceof C22712) {
                                m18955(c23382.m53604(1).f41850 instanceof C15137);
                                m18955(!c23382.f24669);
                            } else {
                                if (!(c23382.m53604(0).f41850 instanceof C15137)) {
                                    throw new IllegalStateException();
                                }
                                m18955(c23382.m53604(1).f41850 instanceof C22712);
                                m18955(c23382.f24669);
                            }
                        }
                        if (abstractC242614 instanceof C21371) {
                            m18955(arrayList5.size() == 1);
                            m18955(abstractC242614.m53604(0).f41850 instanceof C23382);
                        }
                        if (abstractC242614 instanceof C15137) {
                            m18955(((C15137) abstractC242614).f43217 != null);
                        }
                        if (abstractC242614 instanceof C22042) {
                            m18955(((C22042) abstractC242614).f69358 != null);
                        }
                        if (abstractC242614 instanceof AbstractC25196) {
                            m18955(((AbstractC25196) abstractC242614).f80592 != null);
                        }
                        if (abstractC242614 instanceof C16478) {
                            m18955(((C16478) abstractC242614).f48382 != null);
                        }
                        if (abstractC242614 instanceof AbstractC9103) {
                            AbstractC9103 abstractC9104 = (AbstractC9103) abstractC242614;
                            m18955(abstractC9104.f76893.size() <= 1 || abstractC9104.f24668 >= 0);
                        } else {
                            m18955(arrayList5.size() <= 1 || (abstractC242614 instanceof C11313));
                        }
                    }
                }
                return c22926;
            }
            int i53 = i6 + 1;
            int i54 = iArr[i6];
            AbstractC24266 c19161 = null;
            if (i54 == 0) {
                arrayList3.add(null);
                i6 = i53;
            } else {
                int i55 = i6 + 2;
                int i56 = iArr[i53];
                switch (i54) {
                    case 0:
                        if (i54 != 12) {
                            if (c19161 instanceof AbstractC25196) {
                                i = i6 + 3;
                                arrayList2.add(new C22436((AbstractC25196) c19161, Integer.valueOf(iArr[i55])));
                            }
                            if (c19161 != null) {
                                c19161.f76891 = c22926;
                                c19161.f76895 = arrayList3.size();
                            }
                            arrayList3.add(c19161);
                            i6 = i55;
                            continue;
                        } else {
                            i = i6 + 3;
                            arrayList.add(new C22436((C15137) c19161, Integer.valueOf(iArr[i55])));
                        }
                        i55 = i;
                        if (c19161 != null) {
                            c19161.f76891 = c22926;
                            c19161.f76895 = arrayList3.size();
                        }
                        arrayList3.add(c19161);
                        i6 = i55;
                        continue;
                    case 1:
                        c19161 = new C19161();
                        break;
                    case 2:
                        c19161 = new C22042();
                        break;
                    case 3:
                        c19161 = new C19832();
                        break;
                    case 4:
                        c19161 = new C15807();
                        break;
                    case 5:
                        c19161 = new C22712();
                        break;
                    case 6:
                        c19161 = new C6618();
                        break;
                    case 7:
                        c19161 = new C11313();
                        break;
                    case 8:
                        c19161 = new C16478();
                        break;
                    case 9:
                        c19161 = new C21371();
                        break;
                    case 10:
                        c19161 = new C23382();
                        break;
                    case 11:
                        c19161 = new C9773();
                        break;
                    case 12:
                        c19161 = new C15137();
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(i54)));
                }
                c19161.f76896 = i56;
                if (i54 != 12) {
                    i = i6 + 3;
                    arrayList.add(new C22436((C15137) c19161, Integer.valueOf(iArr[i55])));
                } else {
                    if (c19161 instanceof AbstractC25196) {
                        i = i6 + 3;
                        arrayList2.add(new C22436((AbstractC25196) c19161, Integer.valueOf(iArr[i55])));
                    }
                    if (c19161 != null) {
                        c19161.f76891 = c22926;
                        c19161.f76895 = arrayList3.size();
                    }
                    arrayList3.add(c19161);
                    i6 = i55;
                    continue;
                }
                i55 = i;
                if (c19161 != null) {
                    c19161.f76891 = c22926;
                    c19161.f76895 = arrayList3.size();
                }
                arrayList3.add(c19161);
                i6 = i55;
                continue;
            }
            i8++;
        }
    }
}
