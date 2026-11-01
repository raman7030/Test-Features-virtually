package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۬ᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4917 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14998 extends AbstractC17188 {
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        int i;
        boolean z;
        boolean z2;
        EnumC17009 enumC17009;
        ArrayList arrayListM43692 = interfaceC19872.mo14311().m43692();
        if (arrayListM43692.isEmpty() || C10685.m24605('|', ((C17859) C20013.m45383(arrayListM43692, 1)).m40550(), 0) == -1) {
            return null;
        }
        C17859 line = c21055.getLine();
        CharSequence charSequenceM40550 = line.m40551(c21055.getIndex(), line.m40550().length()).m40550();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z3 = false;
        loop0: while (true) {
            int i3 = 0;
            while (true) {
                if (i2 >= charSequenceM40550.length()) {
                    if (!z3) {
                        break loop0;
                    }
                    break loop0;
                }
                char cCharAt = charSequenceM40550.charAt(i2);
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
                        while (i2 < charSequenceM40550.length() && charSequenceM40550.charAt(i2) == '-') {
                            i2++;
                            i++;
                            z4 = true;
                        }
                        if (z4) {
                            if (i2 >= charSequenceM40550.length() || charSequenceM40550.charAt(i2) != ':') {
                                z2 = false;
                            } else {
                                i2++;
                                i++;
                                z2 = true;
                            }
                            if (z && z2) {
                                enumC17009 = EnumC17009.CENTER;
                            } else if (z) {
                                enumC17009 = EnumC17009.LEFT;
                            } else {
                                enumC17009 = z2 ? EnumC17009.RIGHT : null;
                            }
                            arrayList.add(new C14328(enumC17009, i));
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
        C17859 c17859 = (C17859) C20013.m45383(arrayListM43692, 1);
        if (arrayList.size() < C12317.m28383(c17859).size()) {
            return null;
        }
        C22396 c22396 = new C22396(new C12317(arrayList, c17859));
        c22396.m50304(c21055.getIndex());
        c22396.m50306(1);
        return c22396;
    }
}
