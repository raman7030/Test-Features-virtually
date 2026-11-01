package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6246 extends AbstractC20328 {

    /* JADX INFO: renamed from: ܳ */
    public final CharSequence f15816;

    /* JADX INFO: renamed from: ܿ */
    public final CharSequence f15817;

    public C6246(InterfaceC8848 interfaceC8848, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2, interfaceC8848);
        this.f15817 = charSequence;
        this.f15816 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m14180(CharSequence charSequence, List list, int i, int i2, boolean z) {
        InterfaceC19657 interfaceC19657;
        InterfaceC19657 interfaceC19658;
        int i3 = 0;
        while (i3 < i2) {
            if (z) {
                int i4 = i + i3;
                interfaceC19657 = (InterfaceC19657) list.get(i4);
                interfaceC19658 = (InterfaceC19657) list.get(i4 + 1);
            } else {
                int i5 = i - i3;
                interfaceC19657 = (InterfaceC19657) list.get(i5 - 1);
                interfaceC19658 = (InterfaceC19657) list.get(i5);
            }
            i3++;
            if (m14181(charSequence, interfaceC19657, interfaceC19658)) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m14181(CharSequence charSequence, InterfaceC19657 interfaceC19657, InterfaceC19657 interfaceC19658) {
        if ((interfaceC19657 instanceof C16303) || (interfaceC19658 instanceof C16303)) {
            return true;
        }
        int iMo20638 = interfaceC19658.mo20638();
        for (int iMo20637 = interfaceC19657.mo20637(); iMo20637 < iMo20638; iMo20637++) {
            if (C13061.m29890(charSequence.charAt(iMo20637))) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.AbstractC20328
    /* JADX INFO: renamed from: ֫ */
    public final int mo10410(EnumC21589 enumC21589, int i, int i2, C23600 c23600, C23600 c23601) {
        List list = (List) enumC21589.m48787((Object) this.f62792, (Object) this.f62793);
        C12826.requireNonNull(list);
        CharSequence charSequence = (CharSequence) enumC21589.m48787(this.f15817, this.f15816);
        C12826.requireNonNull(charSequence);
        int iM48794 = enumC21589.m48794(c23601.f75123, c23601.f75124);
        int i3 = iM48794 - 1;
        if (!m14181(charSequence, (InterfaceC19657) list.get(i3), (InterfaceC19657) list.get(iM48794))) {
            int iM14180 = m14180(charSequence, list, iM48794, i, true);
            if (iM14180 > 0) {
                return iM14180;
            }
            int iM14181 = m14180(charSequence, list, i3, i2, false);
            if (iM14181 > 0) {
                return -iM14181;
            }
        }
        return 0;
    }
}
