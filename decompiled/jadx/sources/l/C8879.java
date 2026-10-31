package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8879 extends C23313 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f27025;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23695 f27026;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C6762 f27027;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f27028;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C15054 f27029;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f27030;

    @Override // l.C23313
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo22944() {
        return true;
    }

    public C8879(AbstractC3254 abstractC3254, C23695 c23695) {
        super(abstractC3254, abstractC3254.mo1330(), c23695.f76738, c23695);
        this.f27026 = c23695;
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 mo22936(boolean z) {
        return new C13163(z, true);
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo22945(C13163 c13163) {
        if (this.f27029 == null) {
            this.f27029 = new C15054();
        }
        return this.f27029.m35591(m51713(), c13163);
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet mo22943(C13163 c13163) {
        return c13163.m31896();
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22933(int i, C1875 c1875, C8931 c8931) {
        C9585 c9585;
        int iM9959;
        int iM9957;
        int i2;
        int iM9963;
        C18757.m43430();
        C23695 c23695 = this.f27026;
        int i3 = c23695.f76737;
        AbstractC9637 abstractC9637 = this.f74935;
        if (i != i3 || !(c8931 instanceof C12180) || !((AbstractC3254) abstractC9637).m9964()) {
            if (i == c23695.f76735 && (c8931 instanceof C14254)) {
                int iMo6203 = c1875.mo6203(1);
                if (iMo6203 != 93) {
                    if (iMo6203 != -1 && ((AbstractC3254) abstractC9637).m9962()) {
                        return 3;
                    }
                    if (i == c23695.f76740) {
                    }
                    if (i != c23695.f76733) {
                    }
                    c9585 = c23695.f76736;
                    if (c9585 == null) {
                    }
                    if (i != c23695.f76732) {
                    }
                    if (c23695.f76734 == 0) {
                        c23695.m52240();
                    }
                    c23695.f76734++;
                    return m22932(i, c1875, c8931);
                }
            } else if (i == c23695.f76740 || !(c8931 instanceof C9317) || c1875.mo6203(1) != 91) {
                if (i != c23695.f76733 && (c8931 instanceof C7905) && (iM9963 = ((AbstractC3254) abstractC9637).m9963()) != 0) {
                    return iM9963;
                }
                c9585 = c23695.f76736;
                if (c9585 == null && i == c9585.f29083 && (c8931 instanceof C1843) && (iM9957 = ((AbstractC3254) abstractC9637).m9957()) >= 0 && (i2 = c9585.f29082[iM9957]) != 0) {
                    return i2;
                }
                if (i != c23695.f76732 && (c8931 instanceof C14960) && !(c8931.f63075 instanceof C17783) && (iM9959 = ((AbstractC3254) abstractC9637).m9959()) != 0) {
                    return iM9959;
                }
                if (c23695.f76734 == 0 && (c23695.f76739 >= 65536 || c23695.m41845() >= 65536)) {
                    c23695.m52240();
                }
                c23695.f76734++;
                try {
                    return m22932(i, c1875, c8931);
                } finally {
                    c23695.f76734--;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m22932(int i, C1875 c1875, C8931 c8931) {
        this.f27030 = c1875.index();
        this.f27025 = 0;
        this.f27028 = 0;
        if (!this.f27026.f76731[i]) {
            try {
                return super.mo22933(i, c1875, c8931);
            } catch (C20874 unused) {
                if (this.f74934[i].f18066 == null) {
                    this.f27026.f76731[i] = true;
                }
            }
        }
        int iMo6200 = c1875.mo6200();
        this.f74938 = c1875;
        this.f74941 = this.f27030;
        this.f74937 = c8931;
        this.f27025 = 0;
        this.f27028 = 0;
        C5883 c5883 = this.f74934[i];
        try {
            return mo22934(c5883, (C13643) null, m51707((AbstractC23041) c5883.f18062, c8931, true), c1875, this.f27030, c8931);
        } finally {
            c1875.mo6201(this.f27030);
            c1875.mo6207(iMo6200);
            this.f74940 = null;
        }
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13163 mo22935(C13163 c13163, int i, boolean z) {
        if (z) {
            this.f27025 = 0;
            this.f74940 = null;
        }
        return super.mo22935(c13163, i, z);
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 mo22937(int i, C13643 c13643) {
        C23695 c23695 = this.f27026;
        BitSet bitSet = (BitSet) c23695.f76741.get(c13643);
        if (bitSet != null && bitSet.get(i + 1)) {
            throw C20874.f67550;
        }
        if (this.f74938.index() - this.f27030 < 128) {
            return super.mo22937(i, c13643);
        }
        ((BitSet) C13843.computeIfAbsent(c23695.f76741, c13643, new C4563(4))).set(i + 1);
        throw C20874.f67550;
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 mo22939(C5883 c5883, C13643 c13643, int i) {
        try {
            return super.mo22939(c5883, c13643, i);
        } catch (C20874 unused) {
            ((BitSet) C13843.computeIfAbsent(this.f27026.f76741, c13643, new C4563(4))).set(i + 1);
            throw C20874.f67550;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22934(C5883 c5883, C13643 c13643, C13163 c13163, C1875 c1875, int i, C8931 c8931) {
        int i2;
        int iM51963;
        c1875.mo6201(i);
        while (true) {
            int iMo6203 = c1875.mo6203(1);
            C13163 c13163Mo22935 = mo22935(c13163, iMo6203, true);
            if (c13163Mo22935 == null) {
                C20926 c20926M51711 = m51711(i, c1875, c8931);
                c1875.mo6201(i);
                int iM51704 = m51704(c13163, c8931);
                if (iM51704 != 0) {
                    return iM51704;
                }
                throw c20926M51711;
            }
            int iM51701 = C23313.m51701(c13163Mo22935);
            c13163Mo22935.f39357 = iM51701;
            if (iM51701 != 0) {
                m51710(c5883, iM51701, c13163Mo22935, i, c1875.index());
                return c13163Mo22935.f39357;
            }
            boolean z = m51713() == EnumC23522.LL_EXACT_AMBIG_DETECTION;
            if (!z) {
                if (this.f27027 == null) {
                    this.f27027 = new C6762();
                }
                iM51963 = this.f27027.m18412(c13163Mo22935);
            } else {
                Collection collectionM51960 = EnumC23522.m51960(c13163Mo22935);
                if (EnumC23522.m51950(collectionM51960) && EnumC23522.m51956(collectionM51960)) {
                    iM51963 = EnumC23522.m51963(collectionM51960);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    m51709(c5883, i, c1875.index(), z, c13163Mo22935.m31896(), c13163Mo22935);
                    return i2;
                }
                if (iMo6203 != -1) {
                    c1875.mo6204();
                }
                c13163 = c13163Mo22935;
            }
            i2 = iM51963;
            if (i2 != 0) {
                m51709(c5883, i, c1875.index(), z, c13163Mo22935.m31896(), c13163Mo22935);
                return i2;
            }
            if (iMo6203 != -1) {
                c1875.mo6204();
            }
            c13163 = c13163Mo22935;
        }
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22941(C22336 c22336, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m22931(c13163, hashSet, z2);
        super.mo22941(c22336, c13163, hashSet, z, z2, i, z3);
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22942(C22336 c22336, AbstractC23041 abstractC23041, C13163 c13163, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m22931(c13163, hashSet, z2);
        super.mo22942(c22336, abstractC23041, c13163, hashSet, z, z2, i, z3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22931(C13163 c13163, HashSet hashSet, boolean z) {
        int i = this.f27028 + 1;
        this.f27028 = i;
        if ((i & 255) == 0) {
            C18757.m43430();
        }
        if (!z && this.f27028 > 4096) {
            throw C20874.f67550;
        }
        if (z) {
            int i2 = this.f27025 + 1;
            this.f27025 = i2;
            if (i2 > 65536 || c13163.f39354.size() >= 4096 || hashSet.size() >= 4096) {
                throw new IllegalArgumentException("Parser prediction exceeds formatter limit");
            }
        }
    }

    @Override // l.AbstractC11753
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC16466 mo22940(AbstractC16466 abstractC16466) {
        AbstractC16466 abstractC16466M41846;
        if (abstractC16466.mo27960()) {
            return abstractC16466;
        }
        synchronized (this.f27026) {
            abstractC16466M41846 = this.f27026.m41846(abstractC16466);
            if (abstractC16466M41846 == null) {
                abstractC16466M41846 = super.mo22940(abstractC16466);
            }
        }
        return abstractC16466M41846;
    }

    @Override // l.C23313
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13643 mo22938(C5883 c5883, C13643 c13643) {
        HashMap map = c5883.f18065;
        int size = map.size();
        C13643 c13643Mo22938 = super.mo22938(c5883, c13643);
        if (map.size() != size) {
            C23695 c23695 = this.f27026;
            c23695.f76739 = c13643Mo22938.f40683.f39354.size() + c23695.f76739;
        }
        return c13643Mo22938;
    }
}
