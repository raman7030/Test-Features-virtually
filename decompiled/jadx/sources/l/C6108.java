package l;

import java.io.InvalidClassException;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۛܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XARL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6108 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12458 f18726 = C12458.m30618();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17024(boolean z) {
        if (!z) {
            throw new IllegalStateException((String) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21631 m17025(char[] cArr) {
        InterfaceC19081 c5675;
        AbstractC12938 c9909;
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
            throw new UnsupportedOperationException(new InvalidClassException(C21631.class.getName(), String.format(Locale.getDefault(), "Could not deserialize ATN with version %d (expected %d).", Integer.valueOf(i5), 4)));
        }
        C21631 c21631 = new C21631(EnumC13868.values()[iArr[1]], iArr[2]);
        ArrayList<C21115> arrayList = new ArrayList();
        ArrayList<C21115> arrayList2 = new ArrayList();
        int i7 = iArr[3];
        int i8 = 0;
        while (true) {
            ArrayList<AbstractC23041> arrayList3 = c21631.f69449;
            if (i8 >= i7) {
                for (C21115 c21115 : arrayList) {
                    ((C13435) c21115.f68104).f40146 = (AbstractC23041) arrayList3.get(((Integer) c21115.f68105).intValue());
                }
                for (C21115 c21116 : arrayList2) {
                    ((AbstractC24019) c21116.f68104).f77840 = (C14846) arrayList3.get(((Integer) c21116.f68105).intValue());
                }
                int i9 = i6 + 1;
                int i10 = iArr[i6];
                int i11 = 0;
                while (i11 < i10) {
                    ((AbstractC7086) arrayList3.get(iArr[i9])).f21788 = true;
                    i11++;
                    i9++;
                }
                int i12 = i9 + 1;
                int i13 = iArr[i9];
                int i14 = 0;
                while (i14 < i13) {
                    ((C20701) arrayList3.get(iArr[i12])).f66676 = true;
                    i14++;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = iArr[i12];
                EnumC13868 enumC13868 = EnumC13868.LEXER;
                EnumC13868 enumC13869 = c21631.f69444;
                if (enumC13869 == enumC13868) {
                    c21631.f69443 = new int[i16];
                }
                c21631.f69445 = new C20701[i16];
                for (int i17 = 0; i17 < i16; i17++) {
                    int i18 = i15 + 1;
                    c21631.f69445[i17] = (C20701) arrayList3.get(iArr[i15]);
                    if (enumC13869 == EnumC13868.LEXER) {
                        i15 += 2;
                        c21631.f69443[i17] = iArr[i18];
                    } else {
                        i15 = i18;
                    }
                }
                c21631.f69450 = new C9412[i16];
                for (AbstractC23041 abstractC23041 : arrayList3) {
                    if (abstractC23041 instanceof C9412) {
                        C9412 c9412 = (C9412) abstractC23041;
                        C9412[] c9412Arr = c21631.f69450;
                        int i19 = abstractC23041.f74154;
                        c9412Arr[i19] = c9412;
                        c21631.f69445[i19].f66677 = c9412;
                    }
                }
                int i20 = i15 + 1;
                int i21 = iArr[i15];
                int i22 = 0;
                while (i22 < i21) {
                    c21631.f69447.add((C4472) arrayList3.get(iArr[i20]));
                    i22++;
                    i20++;
                }
                ArrayList arrayList4 = new ArrayList();
                int i23 = i20 + 1;
                int i24 = iArr[i20];
                for (int i25 = 0; i25 < i24; i25++) {
                    int i26 = iArr[i23];
                    int i27 = i23 + 1;
                    C23936 c23936 = new C23936(new int[0]);
                    arrayList4.add(c23936);
                    i23 += 2;
                    if (iArr[i27] != 0) {
                        c23936.m52719(-1);
                    }
                    for (int i28 = 0; i28 < i26; i28++) {
                        int i29 = i23 + 1;
                        int i30 = iArr[i23];
                        i23 += 2;
                        c23936.m52720(i30, iArr[i29]);
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
                    AbstractC23041 abstractC23042 = (AbstractC23041) arrayList3.get(i35);
                    switch (i36) {
                        case 1:
                            c9909 = new C9909(abstractC23042, -1);
                            break;
                        case 2:
                            c9909 = i39 != 0 ? new C6589(abstractC23042, -1, i38) : new C6589(abstractC23042, i37, i38);
                            break;
                        case 3:
                            c9909 = new C8706((C20701) arrayList3.get(i37), i38, i39, abstractC23042);
                            break;
                        case 4:
                            c9909 = new C10823(abstractC23042, i37, i38, i39 != 0);
                            break;
                        case 5:
                            c9909 = i39 != 0 ? new C16963(abstractC23042, -1) : new C16963(abstractC23042, i37);
                            break;
                        case 6:
                            c9909 = new C2147(abstractC23042, i37, i38);
                            break;
                        case 7:
                            c9909 = new C0944(abstractC23042, (C23936) arrayList4.get(i37));
                            break;
                        case 8:
                            c9909 = new C12730(abstractC23042, (C23936) arrayList4.get(i37));
                            break;
                        case 9:
                            c9909 = new C12233(abstractC23042);
                            break;
                        case 10:
                            c9909 = new C1650(abstractC23042, i37);
                            break;
                        default:
                            throw new IllegalArgumentException("The specified transition type is not valid.");
                    }
                    ((AbstractC23041) arrayList3.get(i34)).m51212(c9909);
                    i31 += 6;
                }
                for (AbstractC23041 abstractC23043 : arrayList3) {
                    for (int i40 = 0; i40 < abstractC23043.f74151.size(); i40++) {
                        AbstractC12938 abstractC12938M51211 = abstractC23043.m51211(i40);
                        if (abstractC12938M51211 instanceof C8706) {
                            C8706 c8706 = (C8706) abstractC12938M51211;
                            C20701[] c20701Arr = c21631.f69445;
                            int i41 = c8706.f38806.f74154;
                            if (!c20701Arr[i41].f66676 || c8706.f26508 != 0) {
                                i41 = -1;
                            }
                            c21631.f69450[c8706.f38806.f74154].m51212(new C9909(c8706.f26506, i41));
                        }
                    }
                }
                for (AbstractC23041 abstractC23044 : arrayList3) {
                    if (abstractC23044 instanceof AbstractC24019) {
                        AbstractC24019 abstractC24019 = (AbstractC24019) abstractC23044;
                        C14846 c14846 = abstractC24019.f77840;
                        if (c14846 == null) {
                            throw new IllegalStateException();
                        }
                        if (c14846.f45266 != null) {
                            throw new IllegalStateException();
                        }
                        c14846.f45266 = abstractC24019;
                    }
                    if (abstractC23044 instanceof C7791) {
                        C7791 c7791 = (C7791) abstractC23044;
                        for (int i42 = 0; i42 < c7791.f74151.size(); i42++) {
                            AbstractC23041 abstractC23045 = c7791.m51211(i42).f38806;
                            if (abstractC23045 instanceof C14140) {
                                ((C14140) abstractC23045).f42684 = c7791;
                            }
                        }
                    } else if (abstractC23044 instanceof C19995) {
                        C19995 c19995 = (C19995) abstractC23044;
                        for (int i43 = 0; i43 < c19995.f74151.size(); i43++) {
                            AbstractC23041 abstractC23046 = c19995.m51211(i43).f38806;
                            if (abstractC23046 instanceof C22111) {
                                ((C22111) abstractC23046).f71784 = c19995;
                            }
                        }
                    }
                }
                int i44 = i31 + 1;
                int i45 = iArr[i31];
                int i46 = 1;
                while (i46 <= i45) {
                    int i47 = i44 + 1;
                    AbstractC7086 abstractC7086 = (AbstractC7086) arrayList3.get(iArr[i44]);
                    c21631.f69442.add(abstractC7086);
                    abstractC7086.f21787 = i46 - 1;
                    i46++;
                    i44 = i47;
                }
                if (enumC13869 == EnumC13868.LEXER) {
                    int i48 = i44 + 1;
                    c21631.f69446 = new InterfaceC19081[iArr[i44]];
                    for (int i49 = 0; i49 < c21631.f69446.length; i49++) {
                        EnumC0735 enumC0735 = EnumC0735.values()[iArr[i48]];
                        int i50 = i48 + 2;
                        int i51 = iArr[i48 + 1];
                        i48 += 3;
                        int i52 = iArr[i50];
                        switch (C10342.f31142[enumC0735.ordinal()]) {
                            case 1:
                                c5675 = new C5675(i51);
                                break;
                            case 2:
                                c5675 = new C1441(i51, i52);
                                break;
                            case 3:
                                c5675 = new C15551(i51);
                                break;
                            case 4:
                                c5675 = C21903.f70117;
                                break;
                            case 5:
                                c5675 = C22608.f73056;
                                break;
                            case 6:
                                c5675 = new C20492(i51);
                                break;
                            case 7:
                                c5675 = C4969.f15659;
                                break;
                            case 8:
                                c5675 = new C3558(i51);
                                break;
                            default:
                                Locale.getDefault();
                                throw new IllegalArgumentException("The specified lexer action type " + enumC0735 + " is not valid.");
                        }
                        c21631.f69446[i49] = c5675;
                    }
                }
                for (AbstractC23041 abstractC23047 : arrayList3) {
                    if ((abstractC23047 instanceof C22111) && c21631.f69445[abstractC23047.f74154].f66676) {
                        AbstractC23041 abstractC23048 = abstractC23047.m51211(abstractC23047.f74151.size() - 1).f38806;
                        if ((abstractC23048 instanceof C13435) && abstractC23048.f74150 && (abstractC23048.m51211(0).f38806 instanceof C9412)) {
                            ((C22111) abstractC23047).f71785 = true;
                        }
                    }
                }
                this.f18726.getClass();
                for (AbstractC23041 abstractC23049 : arrayList3) {
                    if (abstractC23049 != null) {
                        ArrayList arrayList5 = abstractC23049.f74151;
                        m17024(abstractC23049.f74150 || arrayList5.size() <= 1);
                        if (abstractC23049 instanceof C14140) {
                            m17024(((C14140) abstractC23049).f42684 != null);
                        }
                        if (abstractC23049 instanceof C22111) {
                            C22111 c22111 = (C22111) abstractC23049;
                            m17024(c22111.f71784 != null);
                            m17024(c22111.f74151.size() == 2);
                            if (c22111.m51211(0).f38806 instanceof C21406) {
                                m17024(c22111.m51211(1).f38806 instanceof C13435);
                                m17024(!c22111.f21788);
                            } else {
                                if (!(c22111.m51211(0).f38806 instanceof C13435)) {
                                    throw new IllegalStateException();
                                }
                                m17024(c22111.m51211(1).f38806 instanceof C21406);
                                m17024(c22111.f21788);
                            }
                        }
                        if (abstractC23049 instanceof C19995) {
                            m17024(arrayList5.size() == 1);
                            m17024(abstractC23049.m51211(0).f38806 instanceof C22111);
                        }
                        if (abstractC23049 instanceof C13435) {
                            m17024(((C13435) abstractC23049).f40146 != null);
                        }
                        if (abstractC23049 instanceof C20701) {
                            m17024(((C20701) abstractC23049).f66677 != null);
                        }
                        if (abstractC23049 instanceof AbstractC24019) {
                            m17024(((AbstractC24019) abstractC23049).f77840 != null);
                        }
                        if (abstractC23049 instanceof C14846) {
                            m17024(((C14846) abstractC23049).f45266 != null);
                        }
                        if (abstractC23049 instanceof AbstractC7086) {
                            AbstractC7086 abstractC7087 = (AbstractC7086) abstractC23049;
                            m17024(abstractC7087.f74151.size() <= 1 || abstractC7087.f21787 >= 0);
                        } else {
                            m17024(arrayList5.size() <= 1 || (abstractC23049 instanceof C9412));
                        }
                    }
                }
                return c21631;
            }
            int i53 = i6 + 1;
            int i54 = iArr[i6];
            AbstractC23041 c17669 = null;
            if (i54 == 0) {
                arrayList3.add(null);
                i6 = i53;
            } else {
                int i55 = i6 + 2;
                int i56 = iArr[i53];
                switch (i54) {
                    case 0:
                        if (i54 != 12) {
                            if (c17669 instanceof AbstractC24019) {
                                i = i6 + 3;
                                arrayList2.add(new C21115((AbstractC24019) c17669, Integer.valueOf(iArr[i55])));
                            }
                            if (c17669 != null) {
                                c17669.f74149 = c21631;
                                c17669.f74153 = arrayList3.size();
                            }
                            arrayList3.add(c17669);
                            i6 = i55;
                            continue;
                        } else {
                            i = i6 + 3;
                            arrayList.add(new C21115((C13435) c17669, Integer.valueOf(iArr[i55])));
                        }
                        i55 = i;
                        if (c17669 != null) {
                            c17669.f74149 = c21631;
                            c17669.f74153 = arrayList3.size();
                        }
                        arrayList3.add(c17669);
                        i6 = i55;
                        continue;
                    case 1:
                        c17669 = new C17669();
                        break;
                    case 2:
                        c17669 = new C20701();
                        break;
                    case 3:
                        c17669 = new C18375();
                        break;
                    case 4:
                        c17669 = new C14140();
                        break;
                    case 5:
                        c17669 = new C21406();
                        break;
                    case 6:
                        c17669 = new C4472();
                        break;
                    case 7:
                        c17669 = new C9412();
                        break;
                    case 8:
                        c17669 = new C14846();
                        break;
                    case 9:
                        c17669 = new C19995();
                        break;
                    case 10:
                        c17669 = new C22111();
                        break;
                    case 11:
                        c17669 = new C7791();
                        break;
                    case 12:
                        c17669 = new C13435();
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.getDefault(), "The specified state type %d is not valid.", Integer.valueOf(i54)));
                }
                c17669.f74154 = i56;
                if (i54 != 12) {
                    i = i6 + 3;
                    arrayList.add(new C21115((C13435) c17669, Integer.valueOf(iArr[i55])));
                } else {
                    if (c17669 instanceof AbstractC24019) {
                        i = i6 + 3;
                        arrayList2.add(new C21115((AbstractC24019) c17669, Integer.valueOf(iArr[i55])));
                    }
                    if (c17669 != null) {
                        c17669.f74149 = c21631;
                        c17669.f74153 = arrayList3.size();
                    }
                    arrayList3.add(c17669);
                    i6 = i55;
                    continue;
                }
                i55 = i;
                if (c17669 != null) {
                    c17669.f74149 = c21631;
                    c17669.f74153 = arrayList3.size();
                }
                arrayList3.add(c17669);
                i6 = i55;
                continue;
            }
            i8++;
        }
    }
}
