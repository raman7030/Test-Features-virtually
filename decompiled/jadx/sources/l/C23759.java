package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBGP */
/* JADX INFO: loaded from: classes.dex */
public final class C23759 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9733 f76907;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f76908;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f76912;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f76913;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f76914;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76910 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f76911 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f76909 = false;

    public C23759(C9733 c9733, int i, int i2, int i3) {
        this.f76907 = c9733;
        this.f76908 = i2;
        this.f76913 = new ArrayList(i);
        this.f76912 = i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m52423() {
        return this.f76911;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m52421() {
        return this.f76909;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet m52420() {
        HashSet hashSet = new HashSet(20);
        for (AbstractC4793 abstractC4793 : this.f76913) {
            if (abstractC4793 instanceof C21727) {
                hashSet.add(((C21727) abstractC4793).m49053());
            } else {
                int i = 0;
                if (abstractC4793 instanceof C18115) {
                    C18115 c18115 = (C18115) abstractC4793;
                    while (i < c18115.m42238()) {
                        hashSet.add(c18115.m42239(i));
                        i++;
                    }
                } else if (abstractC4793 instanceof C11060) {
                    C4546 c4546M27446 = ((C11060) abstractC4793).m27446();
                    int size = c4546M27446.size();
                    while (i < size) {
                        m52410(hashSet, c4546M27446.get(i));
                        i++;
                    }
                } else if (abstractC4793 instanceof C16703) {
                    m52410(hashSet, ((C16703) abstractC4793).m39269());
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52410(HashSet hashSet, C21480 c21480) {
        if (c21480 == null) {
            return;
        }
        C18658 c18658M48653 = c21480.m48653();
        C13217 name = c18658M48653.getName();
        C13217 signature = c18658M48653.getSignature();
        C7573 type = c21480.getType();
        if (type != C7573.f23417) {
            hashSet.add(C12512.m30694(type));
        } else {
            hashSet.add(C12512.m30694(C7573.f23412));
        }
        if (name != null) {
            hashSet.add(name);
        }
        if (signature != null) {
            hashSet.add(signature);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52417(AbstractC4793 abstractC4793) {
        C21480 c21480M39269;
        this.f76913.add(abstractC4793);
        if (!this.f76911 && abstractC4793.m13983().m25588() >= 0) {
            this.f76911 = true;
        }
        if (this.f76909) {
            return;
        }
        if (abstractC4793 instanceof C11060) {
            C4546 c4546M27446 = ((C11060) abstractC4793).m27446();
            int size = c4546M27446.size();
            for (int i = 0; i < size; i++) {
                C21480 c21480 = c4546M27446.get(i);
                if (c21480 == null || c21480.m48653().getName() == null) {
                }
            }
            return;
        }
        if (!(abstractC4793 instanceof C16703) || (c21480M39269 = ((C16703) abstractC4793).m39269()) == null || c21480M39269.m48653().getName() == null) {
            return;
        }
        this.f76909 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4793 m52416(int i) {
        return (AbstractC4793) this.f76913.get(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52422() {
        return this.f76913.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52418(C15375 c15375) {
        int size = this.f76913.size() - 2;
        try {
            C5415 c5415 = (C5415) this.f76913.get(size);
            this.f76913.set(size, new C5415(c5415.m13994().m32169(), c5415.m13983(), c5415.m13993(), c15375));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52419(InterfaceC22432 interfaceC22432) {
        int iMo31029;
        for (AbstractC4793 abstractC4793 : this.f76913) {
            if (abstractC4793 instanceof C21727) {
                C21727 c21727 = (C21727) abstractC4793;
                AbstractC13717 abstractC13717M49053 = c21727.m49053();
                int iMo310210 = interfaceC22432.mo31029(abstractC13717M49053);
                if (iMo310210 >= 0) {
                    c21727.m49056(iMo310210);
                }
                if ((abstractC13717M49053 instanceof AbstractC15333) && (iMo31029 = interfaceC22432.mo31029(((AbstractC15333) abstractC13717M49053).m36363())) >= 0) {
                    c21727.m49055(iMo31029);
                }
            } else if (abstractC4793 instanceof C18115) {
                C18115 c18115 = (C18115) abstractC4793;
                for (int i = 0; i < c18115.m42238(); i++) {
                    AbstractC13717 abstractC13717M42239 = c18115.m42239(i);
                    c18115.m42237(i, interfaceC22432.mo31029(abstractC13717M42239));
                    if (abstractC13717M42239 instanceof AbstractC15333) {
                        c18115.m42240(interfaceC22432.mo31029(((AbstractC15333) abstractC13717M42239).m36363()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133 A[LOOP:9: B:67:0x012d->B:69:0x0133, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0142  */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3382 m52415() {
        int i;
        C18821 c18821M13986;
        C6204 c6204;
        Iterator it;
        boolean z;
        if (this.f76910 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f76913.size();
        C13259[] c13259Arr = new C13259[size];
        for (int i2 = 0; i2 < size; i2++) {
            c13259Arr[i2] = ((AbstractC4793) this.f76913.get(i2)).m13994();
        }
        m52411(c13259Arr);
        this.f76907.getClass();
        do {
            int i3 = this.f76910;
            i = this.f76908;
            int i4 = i3 + i + this.f76914;
            int i5 = this.f76912;
            int i6 = i4 - i5;
            Iterator it2 = this.f76913.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it2.hasNext()) {
                C20069 c20069M13993 = ((AbstractC4793) it2.next()).m13993();
                for (int i11 = 0; i11 < c20069M13993.size(); i11++) {
                    C21480 c21480M41004get = c20069M13993.m41004get(i11);
                    if (c21480M41004get.m48643()) {
                        boolean z2 = c21480M41004get.m48652() >= i6;
                        if (c21480M41004get.m48638()) {
                            if (z2) {
                                i8++;
                            } else {
                                i10++;
                            }
                        } else if (z2) {
                            i7++;
                        } else {
                            i9++;
                        }
                    }
                }
            }
            if (i7 > i8 && i9 > i10) {
                m52414();
            } else if (i7 > i8) {
                m52413();
            } else {
                if (i9 <= i10) {
                    break;
                }
                m52414();
                if (i5 != 0 && i8 > i7) {
                    m52413();
                }
            }
        } while (m52411(c13259Arr));
        if (this.f76910 == 0) {
            int size2 = this.f76913.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i12);
                C13259 c13259M13994 = abstractC4793.m13994();
                C13259 c13259 = c13259Arr[i12];
                if (c13259M13994 != c13259) {
                    this.f76913.set(i12, abstractC4793.mo3993(c13259));
                }
            }
        } else {
            int size3 = this.f76913.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC4793 abstractC4793M13989 = (AbstractC4793) this.f76913.get(i13);
                C13259 c13259M13995 = abstractC4793M13989.m13994();
                C13259 c13259M52412 = c13259Arr[i13];
                if (c13259M52412 != null) {
                    c6204 = null;
                    c18821M13986 = null;
                } else {
                    c13259M52412 = m52412(abstractC4793M13989);
                    BitSet bitSetMo7131 = c13259M52412.m32168().mo7131(abstractC4793M13989);
                    C6204 c6204M13981 = abstractC4793M13989.m13981(bitSetMo7131);
                    c18821M13986 = abstractC4793M13989.m13986(bitSetMo7131);
                    abstractC4793M13989 = abstractC4793M13989.m13989(bitSetMo7131);
                    c6204 = c6204M13981;
                }
                if (abstractC4793M13989 instanceof C15375) {
                    C15375 c15375 = (C15375) abstractC4793M13989;
                    if (c15375.m36410()) {
                        arrayList2.add(c15375);
                    } else {
                        if (c6204 != null) {
                            arrayList.add(c6204);
                        }
                        if (!(abstractC4793M13989 instanceof AbstractC8237) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C15375) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c13259M52412 != c13259M13995) {
                            abstractC4793M13989 = abstractC4793M13989.mo3993(c13259M52412);
                        }
                        arrayList.add(abstractC4793M13989);
                        if (c18821M13986 != null) {
                            arrayList.add(c18821M13986);
                        }
                    }
                } else {
                    if (c6204 != null) {
                        arrayList.add(c6204);
                    }
                    if (!(abstractC4793M13989 instanceof AbstractC8237)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C15375) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c13259M52412 != c13259M13995) {
                        abstractC4793M13989 = abstractC4793M13989.mo3993(c13259M52412);
                    }
                    arrayList.add(abstractC4793M13989);
                    if (c18821M13986 != null) {
                        arrayList.add(c18821M13986);
                    }
                }
            }
            this.f76913 = arrayList;
        }
        do {
            int size4 = this.f76913.size();
            int iMo2084 = 0;
            for (int i14 = 0; i14 < size4; i14++) {
                AbstractC4793 abstractC4794 = (AbstractC4793) this.f76913.get(i14);
                abstractC4794.m13982(iMo2084);
                iMo2084 += abstractC4794.mo2084();
            }
            int size5 = this.f76913.size();
            int i15 = 0;
            z = false;
            while (i15 < size5) {
                AbstractC4793 abstractC4795 = (AbstractC4793) this.f76913.get(i15);
                if (abstractC4795 instanceof C5415) {
                    C13259 c13259M13996 = abstractC4795.m13994();
                    C5415 c5415 = (C5415) abstractC4795;
                    if (c13259M13996.m32168().mo10098(c5415)) {
                        continue;
                    } else {
                        if (c13259M13996.m32167() == 40) {
                            C13259 c13259M52409 = m52409(abstractC4795, c13259M13996);
                            if (c13259M52409 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f76913.set(i15, abstractC4795.mo3993(c13259M52409));
                        } else {
                            try {
                                int i16 = i15 + 1;
                                C15375 c15376 = (C15375) this.f76913.get(i16);
                                this.f76913.set(i15, new C5415(C12554.f37822, c5415.m13983(), C20069.f65002, c5415.m15495()));
                                this.f76913.add(i15, new C5415(c5415.m13994().m32169(), c5415.m13983(), c5415.m13993(), c15376));
                                size5++;
                                i15 = i16;
                            } catch (ClassCastException unused) {
                                throw new IllegalStateException("unpaired TargetInsn");
                            } catch (IndexOutOfBoundsException unused2) {
                                throw new IllegalStateException("unpaired TargetInsn (dangling)");
                            }
                        }
                        z = true;
                    }
                }
                i15++;
            }
        } while (z);
        return C3382.m10314(this.f76913, this.f76910 + i + this.f76914);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52411(C13259[] c13259Arr) {
        int i = this.f76910;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f76913.size();
            int i2 = this.f76910;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i3);
                C13259 c13259 = c13259Arr[i3];
                C13259 c13259M52409 = m52409(abstractC4793, c13259);
                if (c13259M52409 == null) {
                    int iM13991 = abstractC4793.m13991(m52412(abstractC4793).m32168().mo7131(abstractC4793));
                    if (iM13991 > i2) {
                        i2 = iM13991;
                    }
                } else {
                    if (c13259 == c13259M52409) {
                    }
                }
                c13259Arr[i3] = c13259M52409;
            }
            if (i < i2) {
                int i4 = i2 - i;
                int size2 = this.f76913.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC4793 abstractC4794 = (AbstractC4793) this.f76913.get(i5);
                    if (!(abstractC4794 instanceof C15375)) {
                        this.f76913.set(i5, abstractC4794.mo3994(i4));
                    }
                }
                z = true;
                i = i2;
            } else {
                this.f76910 = i;
                return z;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13259 m52409(AbstractC4793 abstractC4793, C13259 c13259) {
        while (c13259 != null) {
            if (c13259.m32168().mo7134(abstractC4793)) {
                this.f76907.getClass();
                return c13259;
            }
            c13259 = C12554.m30789(c13259);
        }
        return c13259;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13259 m52412(AbstractC4793 abstractC4793) {
        C13259 c13259M52409 = m52409(abstractC4793.m13987(), abstractC4793.m13994());
        if (c13259M52409 != null) {
            return c13259M52409;
        }
        throw new C0374("No expanded opcode for " + abstractC4793, null);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52414() {
        int size = this.f76913.size();
        for (int i = 0; i < size; i++) {
            AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i);
            if (!(abstractC4793 instanceof C15375)) {
                this.f76913.set(i, abstractC4793.mo3994(1));
            }
        }
        this.f76910++;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m52413() {
        int size = this.f76913.size();
        int i = this.f76908 + this.f76910 + this.f76914;
        int i2 = i - this.f76912;
        C16354 c16354 = new C16354(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c16354.mo21169(i3, i3 + 1, 1);
            } else {
                c16354.mo21169(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC4793 abstractC4793 = (AbstractC4793) this.f76913.get(i4);
            if (!(abstractC4793 instanceof C15375)) {
                this.f76913.set(i4, abstractC4793.mo13980(c16354));
            }
        }
        this.f76914++;
    }
}
