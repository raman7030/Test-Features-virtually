package p067l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.֫֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8XU */
/* JADX INFO: loaded from: classes3.dex */
public final class C3758 extends AbstractC17188 {
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Switch 'out' block B:36:0x00ad for B:17:0x0059 already processed. Defaulting to fallback option. */
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        C17839 c17839;
        char cCharAt;
        C12476 c12476;
        boolean zEquals;
        boolean z;
        int i;
        char cCharAt2;
        C6302 c6302 = (C6302) interfaceC19872;
        InterfaceC4449 interfaceC4449Mo14310 = c6302.mo14310();
        if (c21055.mo46445() < 4) {
            int iMo46447 = c21055.mo46447();
            int iMo46445 = c21055.mo46445() + c21055.mo46444();
            boolean zM43694 = c6302.mo14311().m43694();
            CharSequence charSequenceM40550 = c21055.getLine().m40550();
            char cCharAt3 = charSequenceM40550.charAt(iMo46447);
            if (cCharAt3 != '*' && cCharAt3 != '+' && cCharAt3 != '-') {
                int length = charSequenceM40550.length();
                int i2 = 0;
                int i3 = iMo46447;
                while (true) {
                    if (i3 < length) {
                        char cCharAt4 = charSequenceM40550.charAt(i3);
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
                        } else if (i2 >= 1 && ((i = i3 + 1) >= charSequenceM40550.length() || (cCharAt2 = charSequenceM40550.charAt(i)) == '\t' || cCharAt2 == ' ')) {
                            String string = charSequenceM40550.subSequence(iMo46447, i3).toString();
                            C16636 c16636 = new C16636();
                            c16636.m37703(Integer.valueOf(Integer.parseInt(string)));
                            c16636.m37704(String.valueOf(cCharAt4));
                            c17839 = new C17839(c16636, i);
                        }
                    }
                    c17839 = null;
                }
            } else {
                int i4 = iMo46447 + 1;
                if (i4 >= charSequenceM40550.length() || (cCharAt = charSequenceM40550.charAt(i4)) == '\t' || cCharAt == ' ') {
                    C15157 c15157 = new C15157();
                    c15157.m34582(String.valueOf(cCharAt3));
                    c17839 = new C17839(c15157, i4);
                } else {
                    c17839 = null;
                }
            }
            if (c17839 == null) {
                c12476 = null;
            } else {
                AbstractC19991 abstractC19991 = c17839.f53215;
                int i5 = c17839.f53214;
                int i6 = (i5 - iMo46447) + iMo46445;
                int length2 = charSequenceM40550.length();
                int i7 = i6;
                while (true) {
                    if (i5 >= length2) {
                        z = false;
                    } else {
                        char cCharAt5 = charSequenceM40550.charAt(i5);
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
                if (zM43694 || ((!(abstractC19991 instanceof C16636) || ((C16636) abstractC19991).m37705().intValue() == 1) && z)) {
                    if (!z || i7 - i6 > 4) {
                        i7 = i6 + 1;
                    }
                    c12476 = new C12476(abstractC19991, i7);
                } else {
                    c12476 = null;
                }
            }
            if (c12476 != null) {
                AbstractC19991 abstractC19992 = c12476.f34945;
                int i8 = c12476.f34944;
                C18510 c18510 = new C18510(i8 - c21055.mo46444());
                if (interfaceC4449Mo14310 instanceof C19181) {
                    AbstractC19991 abstractC19993 = (AbstractC19991) ((C19181) interfaceC4449Mo14310).mo9302();
                    if ((abstractC19993 instanceof C15157) && (abstractC19992 instanceof C15157)) {
                        zEquals = C12826.equals(((C15157) abstractC19993).m34583(), ((C15157) abstractC19992).m34583());
                    } else {
                        zEquals = ((abstractC19993 instanceof C16636) && (abstractC19992 instanceof C16636)) ? C12826.equals(((C16636) abstractC19993).m37706(), ((C16636) abstractC19992).m37706()) : false;
                    }
                    if (zEquals) {
                        C22396 c22396 = new C22396(c18510);
                        c22396.m50301(i8);
                        return c22396;
                    }
                }
                C19181 c19181 = new C19181(abstractC19992);
                abstractC19992.m45365(true);
                C22396 c22397 = new C22396(c19181, c18510);
                c22397.m50301(i8);
                return c22397;
            }
        }
        return null;
    }
}
