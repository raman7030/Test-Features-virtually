package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ME */
/* JADX INFO: loaded from: classes3.dex */
public final class C11136 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f33417 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f33418;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f33419;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f33420;

    public C11136(InterfaceC6818 interfaceC6818, CharSequence charSequence, CharSequence charSequence2) {
        this.f33418 = interfaceC6818;
        this.f33419 = charSequence;
        this.f33420 = charSequence2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 m27621() {
        Iterator itMo6220 = this.f33418.mo6218().f41655.mo6220();
        while (true) {
            boolean zHasNext = itMo6220.hasNext();
            ArrayList arrayList = this.f33417;
            CharSequence charSequence = this.f33420;
            CharSequence charSequence2 = this.f33419;
            if (zHasNext) {
                C22340 c22340 = (C22340) itMo6220.next();
                int i = c22340.f72397;
                int i2 = c22340.f72398;
                int i3 = c22340.f72396;
                int i4 = c22340.f72395;
                int i5 = i4;
                for (int i6 = i3; i < i5 && i2 < i6; i6--) {
                    int i7 = i5 - 1;
                    if (charSequence2.charAt(i7) != charSequence.charAt(i6 - 1) || !C11250.m27828(charSequence2.charAt(i7))) {
                        break;
                    }
                    i5--;
                }
                int i8 = i4 - i5;
                int i9 = i4 - i8;
                int i10 = i3 - i8;
                int iM10306 = C3374.m10306(charSequence2, charSequence, c22340.f72397, c22340.f72398, i9, i10);
                C22340 c22341 = new C22340(c22340.f72397 + iM10306, i9, i2 + iM10306, i10);
                if (!c22341.m50072()) {
                    arrayList.add(c22341);
                }
            } else {
                return C23751.m52400(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}
