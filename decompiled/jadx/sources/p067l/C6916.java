package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1MI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6916 {

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f18006;

    /* JADX INFO: renamed from: ܳ */
    public final CharSequence f18008;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8848 f18009;

    /* JADX INFO: renamed from: ܿ */
    public final CharSequence f18010;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f18013;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f18011 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public int f18005 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f18007 = -1;

    /* JADX INFO: renamed from: ᩷ */
    public C23680 f18012 = null;

    public C6916(InterfaceC8848 interfaceC8848, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        this.f18010 = charSequence;
        this.f18008 = charSequence2;
        this.f18013 = arrayList;
        this.f18006 = arrayList2;
        this.f18009 = interfaceC8848;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15846(ArrayList arrayList, CharSequence charSequence, int i) {
        if (i == -1) {
            return 0;
        }
        return i == arrayList.size() ? charSequence.length() : ((InterfaceC19657) arrayList.get(i)).mo20637();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m15848() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.f18009.mo8421().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f18006;
            arrayList2 = this.f18013;
            if (!zHasNext) {
                break;
            }
            C23600 c23600 = (C23600) it.next();
            int i = c23600.f75121;
            int i2 = c23600.f75123;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c23600.f75124 + i4;
                if (!(arrayList2.get(i5) instanceof C16303) || !(arrayList.get(i6) instanceof C16303)) {
                    if (i5 == 0 ? true : arrayList2.get(i5 - 1) instanceof C16303) {
                        if (i6 == 0 ? true : arrayList.get(i6 - 1) instanceof C16303) {
                            m15847(i5 - 1, i6 - 1, z);
                        }
                    }
                    z = true;
                } else {
                    m15847(i5, i6, z);
                    z = false;
                }
            }
        }
        m15847(arrayList2.size(), arrayList.size(), z);
        C23680 c23680 = this.f18012;
        ArrayList arrayList3 = this.f18011;
        if (c23680 != null) {
            arrayList3.add(c23680.f75385);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX INFO: renamed from: ֫ */
    private void m15847(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int i4 = this.f18005;
        if (i4 > i || (i3 = this.f18007) > i2) {
            return;
        }
        ArrayList arrayList = this.f18013;
        CharSequence charSequence = this.f18010;
        int iM15846 = m15846(arrayList, charSequence, i4);
        ArrayList arrayList2 = this.f18006;
        CharSequence charSequence2 = this.f18008;
        int iM15847 = m15846(arrayList2, charSequence2, i3);
        int iM15848 = m15846(arrayList, charSequence, i);
        int iM15849 = m15846(arrayList2, charSequence2, i2);
        int iMax = Math.max(0, i4 + 1);
        C23600 c23600 = new C23600(iMax, Math.min(i + 1, arrayList.size()), Math.max(0, i3 + 1), Math.min(i2 + 1, arrayList2.size()));
        C23600 c23601 = new C23600(iM15846, iM15848, iM15847, iM15849);
        C21669 c21669 = new C21669(c23600, c23601);
        while (true) {
            if (iMax < c23600.f75121) {
                if (arrayList.get(iMax) instanceof C16303) {
                    iMax++;
                }
            } else {
                int i5 = c23600.f75124;
                while (true) {
                    if (i5 >= c23600.f75122) {
                        z2 = false;
                        break;
                    } else if (arrayList2.get(i5) instanceof C16303) {
                        i5++;
                    }
                }
            }
            z2 = true;
            break;
        }
        int i6 = c23601.f75123;
        int i7 = c23601.f75121;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i6, i7);
        int i8 = c23601.f75124;
        int i9 = c23601.f75122;
        boolean zM29893 = C13061.m29893(charSequenceSubSequence, charSequence2.subSequence(i8, i9));
        C23680 c23680 = new C23680(c21669, z, z2, zM29893);
        if (c23601.m52411()) {
            return;
        }
        C23680 c23681 = this.f18012;
        if (c23681 != null) {
            boolean z3 = c23681.f75387;
            boolean z4 = c23681.f75388;
            boolean z5 = c23681.f75386;
            if ((!z5 && !z) || ((z4 && zM29893) || !z3 || !z2)) {
                C21669 c216610 = c23681.f75385;
                C23600 c23602 = c216610.f68249;
                int i10 = c23602.f75123;
                C23600 c23603 = c21669.f68249;
                C23600 c23604 = new C23600(i10, c23603.f75121, c23602.f75124, c23603.f75122);
                C23600 c23605 = c216610.f68248;
                this.f18012 = new C23680(new C21669(c23604, new C23600(c23605.f75123, i7, c23605.f75124, i9)), z5 || z, z3 || z2, z4 && zM29893);
            } else {
                if (c23681 != null) {
                    this.f18011.add(c23681.f75385);
                }
                this.f18012 = c23680;
            }
        } else {
            if (c23681 != null) {
                this.f18011.add(c23681.f75385);
            }
            this.f18012 = c23680;
        }
        this.f18005 = i;
        this.f18007 = i2;
    }
}
