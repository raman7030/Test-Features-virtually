package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13289 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        int i;
        boolean z;
        boolean z2;
        EnumC15405 enumC15405;
        ArrayList arrayListM41446 = interfaceC18418.mo12421().m41446();
        if (arrayListM41446.isEmpty() || C8751.m22635('|', ((C16300) C18566.m43105(arrayListM41446, 1)).m38335(), 0) == -1) {
            return null;
        }
        C16300 line = c19662.getLine();
        CharSequence charSequenceM38335 = line.m38336(c19662.getIndex(), line.m38335().length()).m38335();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z3 = false;
        loop0: while (true) {
            int i3 = 0;
            while (true) {
                if (i2 >= charSequenceM38335.length()) {
                    if (!z3) {
                        break loop0;
                    }
                    break loop0;
                }
                char cCharAt = charSequenceM38335.charAt(i2);
                if (cCharAt == '\t' || cCharAt == ' ') {
                    i2++;
                } else if (cCharAt == '-' || cCharAt == ':') {
                    if (i3 != 0 || arrayList.isEmpty()) {
                        if (cCharAt == ':') {
                            i2++;
                            i = 1;
                            z = true;
                        } else {
                            i = 0;
                            z = false;
                        }
                        boolean z4 = false;
                        while (i2 < charSequenceM38335.length() && charSequenceM38335.charAt(i2) == '-') {
                            i2++;
                            i++;
                            z4 = true;
                        }
                        if (z4) {
                            if (i2 >= charSequenceM38335.length() || charSequenceM38335.charAt(i2) != ':') {
                                z2 = false;
                            } else {
                                i2++;
                                i++;
                                z2 = true;
                            }
                            if (z && z2) {
                                enumC15405 = EnumC15405.CENTER;
                            } else if (z) {
                                enumC15405 = EnumC15405.LEFT;
                            } else {
                                enumC15405 = z2 ? EnumC15405.RIGHT : null;
                            }
                            arrayList.add(new C12584(enumC15405, i));
                        }
                    }
                } else if (cCharAt == '|') {
                    i2++;
                    i3++;
                    if (i3 <= 1) {
                        z3 = true;
                    }
                }
                arrayList = null;
                break loop0;
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        C16300 c16300 = (C16300) C18566.m43105(arrayListM41446, 1);
        if (arrayList.size() < C10468.m26351(c16300).size()) {
            return null;
        }
        C21073 c21073 = new C21073(new C10468(arrayList, c16300));
        c21073.m47974(c19662.getIndex());
        c21073.m47976(1);
        return c21073;
    }
}
