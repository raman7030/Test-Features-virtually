package p067l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBGP */
/* JADX INFO: loaded from: classes.dex */
public final class C24949 {

    /* JADX INFO: renamed from: ֫ */
    public final C11619 f79659;

    /* JADX INFO: renamed from: ۜ */
    public final int f79660;

    /* JADX INFO: renamed from: ܿ */
    public final int f79664;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f79665;

    /* JADX INFO: renamed from: ᩻ */
    public int f79666;

    /* JADX INFO: renamed from: ܳ */
    public int f79662 = -1;

    /* JADX INFO: renamed from: ܽ */
    public boolean f79663 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f79661 = false;

    public C24949(C11619 c11619, int i, int i2, int i3) {
        this.f79659 = c11619;
        this.f79660 = i2;
        this.f79665 = new ArrayList(i);
        this.f79664 = i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m54832() {
        return this.f79663;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m54830() {
        return this.f79661;
    }

    /* JADX INFO: renamed from: ۧ */
    public final HashSet m54829() {
        HashSet hashSet = new HashSet(20);
        for (AbstractC6924 abstractC6924 : this.f79665) {
            if (abstractC6924 instanceof C23018) {
                hashSet.add(((C23018) abstractC6924).m51402());
            } else {
                int i = 0;
                if (abstractC6924 instanceof C19585) {
                    C19585 c19585 = (C19585) abstractC6924;
                    while (i < c19585.m44497()) {
                        hashSet.add(c19585.m44498(i));
                        i++;
                    }
                } else if (abstractC6924 instanceof C12880) {
                    C6689 c6689M29508 = ((C12880) abstractC6924).m29508();
                    int size = c6689M29508.size();
                    while (i < size) {
                        m54819(hashSet, c6689M29508.get(i));
                        i++;
                    }
                } else if (abstractC6924 instanceof C18243) {
                    m54819(hashSet, ((C18243) abstractC6924).m41505());
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54819(HashSet hashSet, C22783 c22783) {
        if (c22783 == null) {
            return;
        }
        C20101 c20101M50990 = c22783.m50990();
        C14930 name = c20101M50990.getName();
        C14930 signature = c20101M50990.getSignature();
        C9566 type = c22783.getType();
        if (type != C9566.f26329) {
            hashSet.add(C14260.m32769(type));
        } else {
            hashSet.add(C14260.m32769(C9566.f26324));
        }
        if (name != null) {
            hashSet.add(name);
        }
        if (signature != null) {
            hashSet.add(signature);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54826(AbstractC6924 abstractC6924) {
        C22783 c22783M41505;
        this.f79665.add(abstractC6924);
        if (!this.f79663 && abstractC6924.m15863().m27610() >= 0) {
            this.f79663 = true;
        }
        if (this.f79661) {
            return;
        }
        if (abstractC6924 instanceof C12880) {
            C6689 c6689M29508 = ((C12880) abstractC6924).m29508();
            int size = c6689M29508.size();
            for (int i = 0; i < size; i++) {
                C22783 c22783 = c6689M29508.get(i);
                if (c22783 == null || c22783.m50990().getName() == null) {
                }
            }
            return;
        }
        if (!(abstractC6924 instanceof C18243) || (c22783M41505 = ((C18243) abstractC6924).m41505()) == null || c22783M41505.m50990().getName() == null) {
            return;
        }
        this.f79661 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6924 m54825(int i) {
        return (AbstractC6924) this.f79665.get(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m54831() {
        return this.f79665.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54827(C16981 c16981) {
        int size = this.f79665.size() - 2;
        try {
            C7515 c7515 = (C7515) this.f79665.get(size);
            this.f79665.set(size, new C7515(c7515.m15874().m34268(), c7515.m15863(), c7515.m15873(), c16981));
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("non-reversible instruction");
        } catch (IndexOutOfBoundsException unused2) {
            throw new IllegalArgumentException("too few instructions");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54828(InterfaceC23688 interfaceC23688) {
        int iMo33113;
        for (AbstractC6924 abstractC6924 : this.f79665) {
            if (abstractC6924 instanceof C23018) {
                C23018 c23018 = (C23018) abstractC6924;
                AbstractC15405 abstractC15405M51402 = c23018.m51402();
                int iMo33114 = interfaceC23688.mo33113(abstractC15405M51402);
                if (iMo33114 >= 0) {
                    c23018.m51405(iMo33114);
                }
                if ((abstractC15405M51402 instanceof AbstractC16941) && (iMo33113 = interfaceC23688.mo33113(((AbstractC16941) abstractC15405M51402).m38521())) >= 0) {
                    c23018.m51404(iMo33113);
                }
            } else if (abstractC6924 instanceof C19585) {
                C19585 c19585 = (C19585) abstractC6924;
                for (int i = 0; i < c19585.m44497(); i++) {
                    AbstractC15405 abstractC15405M44498 = c19585.m44498(i);
                    c19585.m44496(i, interfaceC23688.mo33113(abstractC15405M44498));
                    if (abstractC15405M44498 instanceof AbstractC16941) {
                        c19585.m44499(interfaceC23688.mo33113(((AbstractC16941) abstractC15405M44498).m38521()));
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
    /* JADX INFO: renamed from: ֫ */
    public final C5583 m54824() {
        int i;
        C20256 c20256M15866;
        C8265 c8265;
        Iterator it;
        boolean z;
        if (this.f79662 >= 0) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = this.f79665.size();
        C14970[] c14970Arr = new C14970[size];
        for (int i2 = 0; i2 < size; i2++) {
            c14970Arr[i2] = ((AbstractC6924) this.f79665.get(i2)).m15874();
        }
        m54820(c14970Arr);
        this.f79659.getClass();
        do {
            int i3 = this.f79662;
            i = this.f79660;
            int i4 = i3 + i + this.f79666;
            int i5 = this.f79664;
            int i6 = i4 - i5;
            Iterator it2 = this.f79665.iterator();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (it2.hasNext()) {
                C21442 c21442M15873 = ((AbstractC6924) it2.next()).m15873();
                for (int i11 = 0; i11 < c21442M15873.size(); i11++) {
                    C22783 c22783M56524get = c21442M15873.m56524get(i11);
                    if (c22783M56524get.m50980()) {
                        boolean z2 = c22783M56524get.m50989() >= i6;
                        if (c22783M56524get.m50975()) {
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
                m54823();
            } else if (i7 > i8) {
                m54822();
            } else {
                if (i9 <= i10) {
                    break;
                }
                m54823();
                if (i5 != 0 && i8 > i7) {
                    m54822();
                }
            }
        } while (m54820(c14970Arr));
        if (this.f79662 == 0) {
            int size2 = this.f79665.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractC6924 abstractC6924 = (AbstractC6924) this.f79665.get(i12);
                C14970 c14970M15874 = abstractC6924.m15874();
                C14970 c14970 = c14970Arr[i12];
                if (c14970M15874 != c14970) {
                    this.f79665.set(i12, abstractC6924.mo6235(c14970));
                }
            }
        } else {
            int size3 = this.f79665.size();
            ArrayList arrayList = new ArrayList(size3 * 2);
            ArrayList arrayList2 = new ArrayList();
            for (int i13 = 0; i13 < size3; i13++) {
                AbstractC6924 abstractC6924M15869 = (AbstractC6924) this.f79665.get(i13);
                C14970 c14970M15875 = abstractC6924M15869.m15874();
                C14970 c14970M54821 = c14970Arr[i13];
                if (c14970M54821 != null) {
                    c8265 = null;
                    c20256M15866 = null;
                } else {
                    c14970M54821 = m54821(abstractC6924M15869);
                    BitSet bitSetMo9226 = c14970M54821.m34267().mo9226(abstractC6924M15869);
                    C8265 c8265M15861 = abstractC6924M15869.m15861(bitSetMo9226);
                    c20256M15866 = abstractC6924M15869.m15866(bitSetMo9226);
                    abstractC6924M15869 = abstractC6924M15869.m15869(bitSetMo9226);
                    c8265 = c8265M15861;
                }
                if (abstractC6924M15869 instanceof C16981) {
                    C16981 c16981 = (C16981) abstractC6924M15869;
                    if (c16981.m38568()) {
                        arrayList2.add(c16981);
                    } else {
                        if (c8265 != null) {
                            arrayList.add(c8265);
                        }
                        if (!(abstractC6924M15869 instanceof AbstractC10197) && arrayList2.size() > 0) {
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((C16981) it.next());
                            }
                            arrayList2.clear();
                        }
                        if (c14970M54821 != c14970M15875) {
                            abstractC6924M15869 = abstractC6924M15869.mo6235(c14970M54821);
                        }
                        arrayList.add(abstractC6924M15869);
                        if (c20256M15866 != null) {
                            arrayList.add(c20256M15866);
                        }
                    }
                } else {
                    if (c8265 != null) {
                        arrayList.add(c8265);
                    }
                    if (!(abstractC6924M15869 instanceof AbstractC10197)) {
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add((C16981) it.next());
                        }
                        arrayList2.clear();
                    }
                    if (c14970M54821 != c14970M15875) {
                        abstractC6924M15869 = abstractC6924M15869.mo6235(c14970M54821);
                    }
                    arrayList.add(abstractC6924M15869);
                    if (c20256M15866 != null) {
                        arrayList.add(c20256M15866);
                    }
                }
            }
            this.f79665 = arrayList;
        }
        do {
            int size4 = this.f79665.size();
            int iMo4465 = 0;
            for (int i14 = 0; i14 < size4; i14++) {
                AbstractC6924 abstractC6925 = (AbstractC6924) this.f79665.get(i14);
                abstractC6925.m15862(iMo4465);
                iMo4465 += abstractC6925.mo4465();
            }
            int size5 = this.f79665.size();
            int i15 = 0;
            z = false;
            while (i15 < size5) {
                AbstractC6924 abstractC6926 = (AbstractC6924) this.f79665.get(i15);
                if (abstractC6926 instanceof C7515) {
                    C14970 c14970M15876 = abstractC6926.m15874();
                    C7515 c7515 = (C7515) abstractC6926;
                    if (c14970M15876.m34267().mo12133(c7515)) {
                        continue;
                    } else {
                        if (c14970M15876.m34266() == 40) {
                            C14970 c14970M54818 = m54818(abstractC6926, c14970M15876);
                            if (c14970M54818 == null) {
                                throw new UnsupportedOperationException("method too long");
                            }
                            this.f79665.set(i15, abstractC6926.mo6235(c14970M54818));
                        } else {
                            try {
                                int i16 = i15 + 1;
                                C16981 c16982 = (C16981) this.f79665.get(i16);
                                this.f79665.set(i15, new C7515(C14300.f40848, c7515.m15863(), C21442.f67643, c7515.m17406()));
                                this.f79665.add(i15, new C7515(c7515.m15874().m34268(), c7515.m15863(), c7515.m15873(), c16982));
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
        return C5583.m12352(this.f79665, this.f79662 + i + this.f79666);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54820(C14970[] c14970Arr) {
        int i = this.f79662;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int size = this.f79665.size();
            int i2 = this.f79662;
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC6924 abstractC6924 = (AbstractC6924) this.f79665.get(i3);
                C14970 c14970 = c14970Arr[i3];
                C14970 c14970M54818 = m54818(abstractC6924, c14970);
                if (c14970M54818 == null) {
                    int iM15871 = abstractC6924.m15871(m54821(abstractC6924).m34267().mo9226(abstractC6924));
                    if (iM15871 > i2) {
                        i2 = iM15871;
                    }
                } else {
                    if (c14970 == c14970M54818) {
                    }
                }
                c14970Arr[i3] = c14970M54818;
            }
            if (i < i2) {
                int i4 = i2 - i;
                int size2 = this.f79665.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    AbstractC6924 abstractC6925 = (AbstractC6924) this.f79665.get(i5);
                    if (!(abstractC6925 instanceof C16981)) {
                        this.f79665.set(i5, abstractC6925.mo6236(i4));
                    }
                }
                z = true;
                i = i2;
            } else {
                this.f79662 = i;
                return z;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14970 m54818(AbstractC6924 abstractC6924, C14970 c14970) {
        while (c14970 != null) {
            if (c14970.m34267().mo9229(abstractC6924)) {
                this.f79659.getClass();
                return c14970;
            }
            c14970 = C14300.m32863(c14970);
        }
        return c14970;
    }

    /* JADX INFO: renamed from: ۧ */
    private C14970 m54821(AbstractC6924 abstractC6924) {
        C14970 c14970M54818 = m54818(abstractC6924.m15867(), abstractC6924.m15874());
        if (c14970M54818 != null) {
            return c14970M54818;
        }
        throw new C2724("No expanded opcode for " + abstractC6924, null);
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m54823() {
        int size = this.f79665.size();
        for (int i = 0; i < size; i++) {
            AbstractC6924 abstractC6924 = (AbstractC6924) this.f79665.get(i);
            if (!(abstractC6924 instanceof C16981)) {
                this.f79665.set(i, abstractC6924.mo6236(1));
            }
        }
        this.f79662++;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m54822() {
        int size = this.f79665.size();
        int i = this.f79660 + this.f79662 + this.f79666;
        int i2 = i - this.f79664;
        C17911 c17911 = new C17911(i);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 >= i2) {
                c17911.mo23134(i3, i3 + 1, 1);
            } else {
                c17911.mo23134(i3, i3, 1);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC6924 abstractC6924 = (AbstractC6924) this.f79665.get(i4);
            if (!(abstractC6924 instanceof C16981)) {
                this.f79665.set(i4, abstractC6924.mo15860(c17911));
            }
        }
        this.f79666++;
    }
}
