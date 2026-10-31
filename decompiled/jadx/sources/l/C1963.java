package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C1963 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6566;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f6567;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final List f6568;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f6569;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f6570;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f6571;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f6573;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f6574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6575;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18107 f6576;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6577;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f6578;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6579;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4701 f6580;

    public C1963(CharSequence charSequence, CharSequence charSequence2, List list, List list2, int i, int i2, InterfaceC6818 interfaceC6818, C4701 c4701) {
        this.f6574 = charSequence;
        this.f6567 = charSequence2;
        this.f6568 = list;
        this.f6578 = list2;
        this.f6571 = i;
        this.f6570 = i2;
        this.f6573 = interfaceC6818;
        this.f6580 = c4701;
        int length = charSequence.length();
        this.f6569 = length;
        int length2 = charSequence2.length();
        this.f6579 = length2;
        this.f6576 = new C18107(length, length2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 m6470() {
        this.f6575 = -1;
        this.f6577 = -1;
        this.f6566 = -1;
        this.f6572 = -1;
        m6469(-1, -1);
        Iterator it = this.f6573.mo6219().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            List list = this.f6578;
            List list2 = this.f6568;
            C18107 c18107 = this.f6576;
            if (zHasNext) {
                C22340 c22340 = (C22340) it.next();
                int i = c22340.f72395;
                int i2 = c22340.f72397;
                int i3 = i - i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    int i6 = c22340.f72398 + i4;
                    int iMo18689 = ((InterfaceC18191) list2.get(i5)).mo18689();
                    int i7 = this.f6571;
                    int iMo186810 = ((InterfaceC18191) list.get(i6)).mo18689();
                    int i8 = this.f6570;
                    int iMo18688 = ((InterfaceC18191) list2.get(i5)).mo18688() - i7;
                    int iMo186811 = ((InterfaceC18191) list.get(i6)).mo18688() - i8;
                    m6467(i5, i6);
                    c18107.m40752(iMo18689 - i7, iMo186810 - i8, iMo18688, iMo186811);
                    m6469(i5, i6);
                }
            } else {
                m6467(list2.size(), list.size());
                return C23751.m52403(c18107.m42227());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6467(int i, int i2) {
        int i3;
        int i4 = this.f6571;
        List list = this.f6568;
        int iMo18688 = i == 0 ? 0 : ((InterfaceC18191) list.get(i - 1)).mo18688() - i4;
        int i5 = this.f6570;
        List list2 = this.f6578;
        int iMo18689 = i2 != 0 ? ((InterfaceC18191) list2.get(i2 - 1)).mo18688() - i5 : 0;
        int iMo186810 = i == list.size() ? this.f6569 : ((InterfaceC18191) list.get(i)).mo18689() - i4;
        int iMo186811 = i2 == list2.size() ? this.f6579 : ((InterfaceC18191) list2.get(i2)).mo18689() - i5;
        int i6 = this.f6575;
        if (i6 == iMo18688 && this.f6577 == iMo18689) {
            m6468(iMo18688, iMo18689, iMo186810, iMo186811);
        } else if (i6 < iMo18688 && (i3 = this.f6577) < iMo18689) {
            m6468(i6, i3, this.f6566, this.f6572);
            m6468(iMo18688, iMo18689, iMo186810, iMo186811);
        } else {
            int i7 = this.f6577;
            int i8 = this.f6566;
            int i9 = this.f6572;
            C4701 c4701 = this.f6580;
            CharSequence charSequence = this.f6567;
            CharSequence charSequence2 = this.f6574;
            C18107 c18107 = this.f6576;
            if (i6 == iMo18688 && i8 == iMo186810) {
                C3290 c3290M47826 = C21014.m47826(charSequence2.subSequence(i6, i8), charSequence.subSequence(i7, i9), charSequence.subSequence(iMo18689, iMo186811), c4701);
                for (C22340 c22340 : ((InterfaceC6818) c3290M47826.f39374).mo6219()) {
                    c18107.m40752(c22340.f72397 + i6, c22340.f72398 + i7, c22340.f72395 + i6, c22340.f72396 + i7);
                }
                for (C22340 c22341 : ((InterfaceC6818) c3290M47826.f39375).mo6219()) {
                    c18107.m40752(c22341.f72397 + i6, c22341.f72398 + iMo18689, c22341.f72395 + i6, c22341.f72396 + iMo18689);
                }
            } else {
                if (i7 != iMo18689 || i9 != iMo186811) {
                    throw new IllegalStateException();
                }
                C3290 c3290M47827 = C21014.m47826(charSequence.subSequence(i7, i9), charSequence2.subSequence(i6, i8), charSequence2.subSequence(iMo18688, iMo186810), c4701);
                for (C22340 c22342 : ((InterfaceC6818) c3290M47827.f39374).mo6219()) {
                    c18107.m40752(c22342.f72398 + i6, c22342.f72397 + i7, c22342.f72396 + i6, c22342.f72395 + i7);
                }
                for (C22340 c22343 : ((InterfaceC6818) c3290M47827.f39375).mo6219()) {
                    c18107.m40752(c22343.f72398 + iMo18688, c22343.f72397 + i7, c22343.f72396 + iMo18688, c22343.f72395 + i7);
                }
            }
        }
        this.f6575 = -1;
        this.f6577 = -1;
        this.f6566 = -1;
        this.f6572 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m6469(int i, int i2) {
        int i3 = this.f6571;
        List list = this.f6568;
        int iMo18688 = i == -1 ? 0 : ((InterfaceC18191) list.get(i)).mo18688() - i3;
        int i4 = this.f6570;
        List list2 = this.f6578;
        int iMo18689 = i2 != -1 ? ((InterfaceC18191) list2.get(i2)).mo18688() - i4 : 0;
        int i5 = i + 1;
        int iMo186810 = i5 == list.size() ? this.f6569 : ((InterfaceC18191) list.get(i5)).mo18689() - i3;
        int i6 = i2 + 1;
        int iMo186811 = i6 == list2.size() ? this.f6579 : ((InterfaceC18191) list2.get(i6)).mo18689() - i4;
        this.f6575 = iMo18688;
        this.f6577 = iMo18689;
        this.f6566 = iMo186810;
        this.f6572 = iMo186811;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6468(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        for (C22340 c22340 : C12567.m30808(this.f6574.subSequence(i, i3), this.f6567.subSequence(i2, i4), this.f6580).mo6219()) {
            this.f6576.m40752(c22340.f72397 + i, c22340.f72398 + i2, c22340.f72395 + i, c22340.f72396 + i2);
        }
    }
}
