package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֫֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1463 extends AbstractC15594 {
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Switch 'out' block B:36:0x00ad for B:17:0x0059 already processed. Defaulting to fallback option. */
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        C16279 c16279;
        char cCharAt;
        C10636 c10636;
        boolean zEquals;
        boolean z;
        int i;
        char cCharAt2;
        C4139 c4139 = (C4139) interfaceC18418;
        InterfaceC2190 interfaceC2190Mo12420 = c4139.mo12420();
        if (c19662.mo44151() < 4) {
            int iMo44153 = c19662.mo44153();
            int iMo44151 = c19662.mo44151() + c19662.mo44150();
            boolean zM41448 = c4139.mo12421().m41448();
            CharSequence charSequenceM38335 = c19662.getLine().m38335();
            char cCharAt3 = charSequenceM38335.charAt(iMo44153);
            if (cCharAt3 != '*' && cCharAt3 != '+' && cCharAt3 != '-') {
                int length = charSequenceM38335.length();
                int i2 = 0;
                int i3 = iMo44153;
                while (true) {
                    if (i3 < length) {
                        char cCharAt4 = charSequenceM38335.charAt(i3);
                        if (cCharAt4 != ')' && cCharAt4 != '.') {
                            switch (cCharAt4) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                case '8':
                                case '9':
                                    i2++;
                                    if (i2 <= 9) {
                                        i3++;
                                    }
                                    break;
                                default:
                                    break;
                            }
                        } else if (i2 >= 1 && ((i = i3 + 1) >= charSequenceM38335.length() || (cCharAt2 = charSequenceM38335.charAt(i)) == '\t' || cCharAt2 == ' ')) {
                            String string = charSequenceM38335.subSequence(iMo44153, i3).toString();
                            C15013 c15013 = new C15013();
                            c15013.m35547(Integer.valueOf(Integer.parseInt(string)));
                            c15013.m35548(String.valueOf(cCharAt4));
                            c16279 = new C16279(c15013, i);
                        }
                    }
                    c16279 = null;
                }
            } else {
                int i4 = iMo44153 + 1;
                if (i4 >= charSequenceM38335.length() || (cCharAt = charSequenceM38335.charAt(i4)) == '\t' || cCharAt == ' ') {
                    C13457 c13457 = new C13457();
                    c13457.m32480(String.valueOf(cCharAt3));
                    c16279 = new C16279(c13457, i4);
                } else {
                    c16279 = null;
                }
            }
            if (c16279 == null) {
                c10636 = null;
            } else {
                AbstractC18543 abstractC18543 = c16279.f50048;
                int i5 = c16279.f50047;
                int i6 = (i5 - iMo44153) + iMo44151;
                int length2 = charSequenceM38335.length();
                int i7 = i6;
                while (true) {
                    if (i5 >= length2) {
                        z = false;
                    } else {
                        char cCharAt5 = charSequenceM38335.charAt(i5);
                        if (cCharAt5 == '\t') {
                            i7 = (4 - (i7 % 4)) + i7;
                        } else if (cCharAt5 == ' ') {
                            i7++;
                        } else {
                            z = true;
                        }
                        i5++;
                    }
                }
                if (zM41448 || ((!(abstractC18543 instanceof C15013) || ((C15013) abstractC18543).m35549().intValue() == 1) && z)) {
                    if (!z || i7 - i6 > 4) {
                        i7 = i6 + 1;
                    }
                    c10636 = new C10636(abstractC18543, i7);
                } else {
                    c10636 = null;
                }
            }
            if (c10636 != null) {
                AbstractC18543 abstractC18544 = c10636.f31974;
                int i8 = c10636.f31973;
                C16985 c16985 = new C16985(i8 - c19662.mo44150());
                if (interfaceC2190Mo12420 instanceof C17691) {
                    AbstractC18543 abstractC18545 = (AbstractC18543) ((C17691) interfaceC2190Mo12420).mo7223();
                    if ((abstractC18545 instanceof C13457) && (abstractC18544 instanceof C13457)) {
                        zEquals = C11003.equals(((C13457) abstractC18545).m32481(), ((C13457) abstractC18544).m32481());
                    } else {
                        zEquals = ((abstractC18545 instanceof C15013) && (abstractC18544 instanceof C15013)) ? C11003.equals(((C15013) abstractC18545).m35550(), ((C15013) abstractC18544).m35550()) : false;
                    }
                    if (zEquals) {
                        C21073 c21073 = new C21073(c16985);
                        c21073.m47971(i8);
                        return c21073;
                    }
                }
                C17691 c17691 = new C17691(abstractC18544);
                abstractC18544.m43087(true);
                C21073 c21074 = new C21073(c17691, c16985);
                c21074.m47971(i8);
                return c21074;
            }
        }
        return null;
    }
}
