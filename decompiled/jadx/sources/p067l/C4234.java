package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes2.dex */
public final class C4234 {

    /* JADX INFO: renamed from: ֫ */
    public int f9345;

    /* JADX INFO: renamed from: ۖ */
    public final CharSequence f9346;

    /* JADX INFO: renamed from: ۘ */
    public final List f9347;

    /* JADX INFO: renamed from: ۜ */
    public final int f9348;

    /* JADX INFO: renamed from: ۡ */
    public final int f9349;

    /* JADX INFO: renamed from: ۢ */
    public final int f9350;

    /* JADX INFO: renamed from: ۧ */
    public int f9351;

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC8848 f9352;

    /* JADX INFO: renamed from: ܺ */
    public final CharSequence f9353;

    /* JADX INFO: renamed from: ܽ */
    public int f9354;

    /* JADX INFO: renamed from: ܿ */
    public final C19577 f9355;

    /* JADX INFO: renamed from: ᩳ */
    public int f9356;

    /* JADX INFO: renamed from: ᩴ */
    public final List f9357;

    /* JADX INFO: renamed from: ᩷ */
    public final int f9358;

    /* JADX INFO: renamed from: ᩻ */
    public final C6836 f9359;

    public C4234(CharSequence charSequence, CharSequence charSequence2, List list, List list2, int i, int i2, InterfaceC8848 interfaceC8848, C6836 c6836) {
        this.f9353 = charSequence;
        this.f9346 = charSequence2;
        this.f9347 = list;
        this.f9357 = list2;
        this.f9350 = i;
        this.f9349 = i2;
        this.f9352 = interfaceC8848;
        this.f9359 = c6836;
        int length = charSequence.length();
        this.f9348 = length;
        int length2 = charSequence2.length();
        this.f9358 = length2;
        this.f9355 = new C19577(length, length2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8848 m8611() {
        this.f9354 = -1;
        this.f9356 = -1;
        this.f9345 = -1;
        this.f9351 = -1;
        m8610(-1, -1);
        Iterator it = this.f9352.mo8421().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            List list = this.f9357;
            List list2 = this.f9347;
            C19577 c19577 = this.f9355;
            if (zHasNext) {
                C23600 c23600 = (C23600) it.next();
                int i = c23600.f75121;
                int i2 = c23600.f75123;
                int i3 = i - i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    int i6 = c23600.f75124 + i4;
                    int iMo20638 = ((InterfaceC19657) list2.get(i5)).mo20638();
                    int i7 = this.f9350;
                    int iMo20639 = ((InterfaceC19657) list.get(i6)).mo20638();
                    int i8 = this.f9349;
                    int iMo20637 = ((InterfaceC19657) list2.get(i5)).mo20637() - i7;
                    int iMo206310 = ((InterfaceC19657) list.get(i6)).mo20637() - i8;
                    m8608(i5, i6);
                    c19577.m43009(iMo20638 - i7, iMo20639 - i8, iMo20637, iMo206310);
                    m8610(i5, i6);
                }
            } else {
                m8608(list2.size(), list.size());
                return C24941.m54812(c19577.m44486());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8608(int i, int i2) {
        int i3;
        int i4 = this.f9350;
        List list = this.f9347;
        int iMo20637 = i == 0 ? 0 : ((InterfaceC19657) list.get(i - 1)).mo20637() - i4;
        int i5 = this.f9349;
        List list2 = this.f9357;
        int iMo20638 = i2 != 0 ? ((InterfaceC19657) list2.get(i2 - 1)).mo20637() - i5 : 0;
        int iMo20639 = i == list.size() ? this.f9348 : ((InterfaceC19657) list.get(i)).mo20638() - i4;
        int iMo206310 = i2 == list2.size() ? this.f9358 : ((InterfaceC19657) list2.get(i2)).mo20638() - i5;
        int i6 = this.f9354;
        if (i6 == iMo20637 && this.f9356 == iMo20638) {
            m8609(iMo20637, iMo20638, iMo20639, iMo206310);
        } else if (i6 < iMo20637 && (i3 = this.f9356) < iMo20638) {
            m8609(i6, i3, this.f9345, this.f9351);
            m8609(iMo20637, iMo20638, iMo20639, iMo206310);
        } else {
            int i7 = this.f9356;
            int i8 = this.f9345;
            int i9 = this.f9351;
            C6836 c6836 = this.f9359;
            CharSequence charSequence = this.f9346;
            CharSequence charSequence2 = this.f9353;
            C19577 c19577 = this.f9355;
            if (i6 == iMo20637 && i8 == iMo20639) {
                C5495 c5495M50156 = C22340.m50156(charSequence2.subSequence(i6, i8), charSequence.subSequence(i7, i9), charSequence.subSequence(iMo20638, iMo206310), c6836);
                for (C23600 c23600 : ((InterfaceC8848) c5495M50156.f42436).mo8421()) {
                    c19577.m43009(c23600.f75123 + i6, c23600.f75124 + i7, c23600.f75121 + i6, c23600.f75122 + i7);
                }
                for (C23600 c23601 : ((InterfaceC8848) c5495M50156.f42437).mo8421()) {
                    c19577.m43009(c23601.f75123 + i6, c23601.f75124 + iMo20638, c23601.f75121 + i6, c23601.f75122 + iMo20638);
                }
            } else {
                if (i7 != iMo20638 || i9 != iMo206310) {
                    throw new IllegalStateException();
                }
                C5495 c5495M50157 = C22340.m50156(charSequence.subSequence(i7, i9), charSequence2.subSequence(i6, i8), charSequence2.subSequence(iMo20637, iMo20639), c6836);
                for (C23600 c23602 : ((InterfaceC8848) c5495M50157.f42436).mo8421()) {
                    c19577.m43009(c23602.f75124 + i6, c23602.f75123 + i7, c23602.f75122 + i6, c23602.f75121 + i7);
                }
                for (C23600 c23603 : ((InterfaceC8848) c5495M50157.f42437).mo8421()) {
                    c19577.m43009(c23603.f75124 + iMo20637, c23603.f75123 + i7, c23603.f75122 + iMo20637, c23603.f75121 + i7);
                }
            }
        }
        this.f9354 = -1;
        this.f9356 = -1;
        this.f9345 = -1;
        this.f9351 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m8610(int i, int i2) {
        int i3 = this.f9350;
        List list = this.f9347;
        int iMo20637 = i == -1 ? 0 : ((InterfaceC19657) list.get(i)).mo20637() - i3;
        int i4 = this.f9349;
        List list2 = this.f9357;
        int iMo20638 = i2 != -1 ? ((InterfaceC19657) list2.get(i2)).mo20637() - i4 : 0;
        int i5 = i + 1;
        int iMo20639 = i5 == list.size() ? this.f9348 : ((InterfaceC19657) list.get(i5)).mo20638() - i3;
        int i6 = i2 + 1;
        int iMo206310 = i6 == list2.size() ? this.f9358 : ((InterfaceC19657) list2.get(i6)).mo20638() - i4;
        this.f9354 = iMo20637;
        this.f9356 = iMo20638;
        this.f9345 = iMo20639;
        this.f9351 = iMo206310;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m8609(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        for (C23600 c23600 : C14312.m32883(this.f9353.subSequence(i, i3), this.f9346.subSequence(i2, i4), this.f9359).mo8421()) {
            this.f9355.m43009(c23600.f75123 + i, c23600.f75124 + i2, c23600.f75121 + i, c23600.f75122 + i2);
        }
    }
}
