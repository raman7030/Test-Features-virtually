package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes4.dex */
public final class C16779 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f51534 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f51535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f51536;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f51537;

    public C16779(InterfaceC6818 interfaceC6818, CharSequence charSequence, CharSequence charSequence2) {
        this.f51535 = interfaceC6818;
        this.f51536 = charSequence;
        this.f51537 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 m39513() {
        Iterator itMo6220 = this.f51535.mo6218().f41655.mo6220();
        while (true) {
            boolean zHasNext = itMo6220.hasNext();
            ArrayList arrayList = this.f51534;
            CharSequence charSequence = this.f51537;
            CharSequence charSequence2 = this.f51536;
            if (zHasNext) {
                C22340 c22340 = (C22340) itMo6220.next();
                int i = c22340.f72397;
                int i2 = c22340.f72398;
                int i3 = c22340.f72395;
                int i4 = c22340.f72396;
                int i5 = i;
                for (int i6 = i2; i5 < i3 && i6 < i4 && charSequence2.charAt(i5) == charSequence.charAt(i6) && C11250.m27828(charSequence2.charAt(i5)); i6++) {
                    i5++;
                }
                int i7 = i5 - i;
                int i8 = i + i7;
                int i9 = i2 + i7;
                int i10 = i3;
                for (int i11 = i4; i8 < i10 && i9 < i11; i11--) {
                    int i12 = i10 - 1;
                    if (charSequence2.charAt(i12) != charSequence.charAt(i11 - 1) || !C11250.m27828(charSequence2.charAt(i12))) {
                        break;
                    }
                    i10--;
                }
                int i13 = i3 - i10;
                int i14 = i3 - i13;
                int i15 = i4 - i13;
                while (i8 < i14 && C11250.m27828(charSequence2.charAt(i8))) {
                    i8++;
                }
                while (i8 < i14 && C11250.m27828(charSequence2.charAt(i14 - 1))) {
                    i14--;
                }
                while (i9 < i15 && C11250.m27828(charSequence.charAt(i9))) {
                    i9++;
                }
                while (i9 < i15 && C11250.m27828(charSequence.charAt(i15 - 1))) {
                    i15--;
                }
                C22340 c22341 = new C22340(i8, i14, i9, i15);
                if (!c22341.m50072() && !C8313.m21915(charSequence2.subSequence(i8, i14), charSequence.subSequence(i9, i15), EnumC5491.IGNORE_WHITESPACES)) {
                    arrayList.add(c22341);
                }
            } else {
                return C23751.m52400(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
