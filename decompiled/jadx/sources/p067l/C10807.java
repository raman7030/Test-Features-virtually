package p067l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6PQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10807 extends C24525 {

    /* JADX INFO: renamed from: ֡ */
    public int f29949;

    /* JADX INFO: renamed from: ۖ */
    public final C24888 f29950;

    /* JADX INFO: renamed from: ۘ */
    public C8795 f29951;

    /* JADX INFO: renamed from: ۚ */
    public int f29952;

    /* JADX INFO: renamed from: ᩴ */
    public C16675 f29953;

    /* JADX INFO: renamed from: ᩵ */
    public int f29954;

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo24915() {
        return true;
    }

    public C10807(AbstractC5461 abstractC5461, C24888 c24888) {
        super(abstractC5461, abstractC5461.mo3738(), c24888.f79488, c24888);
        this.f29950 = c24888;
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final C14878 mo24907(boolean z) {
        return new C14878(z, true);
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo24916(C14878 c14878) {
        if (this.f29953 == null) {
            this.f29953 = new C16675();
        }
        return this.f29953.m37749(m54110(), c14878);
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ۧ */
    public final BitSet mo24914(C14878 c14878) {
        return c14878.m33992();
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final int mo24904(int i, C4150 c4150, C10856 c10856) {
        C11478 c11478;
        int iM11992;
        int iM11990;
        int i2;
        int iM11996;
        C20195.m45697();
        C24888 c24888 = this.f29950;
        int i3 = c24888.f79487;
        AbstractC11527 abstractC11527 = this.f77682;
        if (i != i3 || !(c10856 instanceof C13944) || !((AbstractC5461) abstractC11527).m11997()) {
            if (i == c24888.f79485 && (c10856 instanceof C15915)) {
                int iMo8405 = c4150.mo8405(1);
                if (iMo8405 != 93) {
                    if (iMo8405 != -1 && ((AbstractC5461) abstractC11527).m11995()) {
                        return 3;
                    }
                    if (i == c24888.f79490) {
                    }
                    if (i != c24888.f79483) {
                    }
                    c11478 = c24888.f79486;
                    if (c11478 == null) {
                    }
                    if (i != c24888.f79482) {
                    }
                    if (c24888.f79484 == 0) {
                        c24888.m54643();
                    }
                    c24888.f79484++;
                    return m24903(i, c4150, c10856);
                }
            } else if (i == c24888.f79490 || !(c10856 instanceof C11223) || c4150.mo8405(1) != 91) {
                if (i != c24888.f79483 && (c10856 instanceof C9881) && (iM11996 = ((AbstractC5461) abstractC11527).m11996()) != 0) {
                    return iM11996;
                }
                c11478 = c24888.f79486;
                if (c11478 == null && i == c11478.f32030 && (c10856 instanceof C4120) && (iM11990 = ((AbstractC5461) abstractC11527).m11990()) >= 0 && (i2 = c11478.f32029[iM11990]) != 0) {
                    return i2;
                }
                if (i != c24888.f79482 && (c10856 instanceof C16586) && !(c10856.f65695 instanceof C19269) && (iM11992 = ((AbstractC5461) abstractC11527).m11992()) != 0) {
                    return iM11992;
                }
                if (c24888.f79484 == 0 && (c24888.f79489 >= 65536 || c24888.m44092() >= 65536)) {
                    c24888.m54643();
                }
                c24888.f79484++;
                try {
                    return m24903(i, c4150, c10856);
                } finally {
                    c24888.f79484--;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m24903(int i, C4150 c4150, C10856 c10856) {
        this.f29954 = c4150.index();
        this.f29949 = 0;
        this.f29952 = 0;
        if (!this.f29950.f79481[i]) {
            try {
                return super.mo24904(i, c4150, c10856);
            } catch (C22207 unused) {
                if (this.f77681[i].f20921 == null) {
                    this.f29950.f79481[i] = true;
                }
            }
        }
        int iMo8402 = c4150.mo8402();
        this.f77685 = c4150;
        this.f77688 = this.f29954;
        this.f77684 = c10856;
        this.f29949 = 0;
        this.f29952 = 0;
        C7959 c7959 = this.f77681[i];
        try {
            return mo24905(c7959, (C15334) null, m54104((AbstractC24266) c7959.f20917, c10856, true), c4150, this.f29954, c10856);
        } finally {
            c4150.mo8403(this.f29954);
            c4150.mo8409(iMo8402);
            this.f77687 = null;
        }
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final C14878 mo24906(C14878 c14878, int i, boolean z) {
        if (z) {
            this.f29949 = 0;
            this.f77687 = null;
        }
        return super.mo24906(c14878, i, z);
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final C15334 mo24908(int i, C15334 c15334) {
        C24888 c24888 = this.f29950;
        BitSet bitSet = (BitSet) c24888.f79491.get(c15334);
        if (bitSet != null && bitSet.get(i + 1)) {
            throw C22207.f70236;
        }
        if (this.f77685.index() - this.f29954 < 128) {
            return super.mo24908(i, c15334);
        }
        ((BitSet) C15525.computeIfAbsent(c24888.f79491, c15334, new C6705(4))).set(i + 1);
        throw C22207.f70236;
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final C15334 mo24910(C7959 c7959, C15334 c15334, int i) {
        try {
            return super.mo24910(c7959, c15334, i);
        } catch (C22207 unused) {
            ((BitSet) C15525.computeIfAbsent(this.f29950.f79491, c15334, new C6705(4))).set(i + 1);
            throw C22207.f70236;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0083 A[SYNTHETIC] */
    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final int mo24905(C7959 c7959, C15334 c15334, C14878 c14878, C4150 c4150, int i, C10856 c10856) {
        int i2;
        int iM54365;
        c4150.mo8403(i);
        while (true) {
            int iMo8405 = c4150.mo8405(1);
            C14878 c14878Mo24906 = mo24906(c14878, iMo8405, true);
            if (c14878Mo24906 == null) {
                C22256 c22256M54108 = m54108(i, c4150, c10856);
                c4150.mo8403(i);
                int iM54101 = m54101(c14878, c10856);
                if (iM54101 != 0) {
                    return iM54101;
                }
                throw c22256M54108;
            }
            int iM54098 = C24525.m54098(c14878Mo24906);
            c14878Mo24906.f42419 = iM54098;
            if (iM54098 != 0) {
                m54107(c7959, iM54098, c14878Mo24906, i, c4150.index());
                return c14878Mo24906.f42419;
            }
            boolean z = m54110() == EnumC24723.LL_EXACT_AMBIG_DETECTION;
            if (!z) {
                if (this.f29951 == null) {
                    this.f29951 = new C8795();
                }
                iM54365 = this.f29951.m20360(c14878Mo24906);
            } else {
                Collection collectionM54362 = EnumC24723.m54362(c14878Mo24906);
                if (EnumC24723.m54352(collectionM54362) && EnumC24723.m54358(collectionM54362)) {
                    iM54365 = EnumC24723.m54365(collectionM54362);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    m54106(c7959, i, c4150.index(), z, c14878Mo24906.m33992(), c14878Mo24906);
                    return i2;
                }
                if (iMo8405 != -1) {
                    c4150.mo8406();
                }
                c14878 = c14878Mo24906;
            }
            i2 = iM54365;
            if (i2 != 0) {
                m54106(c7959, i, c4150.index(), z, c14878Mo24906.m33992(), c14878Mo24906);
                return i2;
            }
            if (iMo8405 != -1) {
                c4150.mo8406();
            }
            c14878 = c14878Mo24906;
        }
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final void mo24912(C23596 c23596, C14878 c14878, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m24902(c14878, hashSet, z2);
        super.mo24912(c23596, c14878, hashSet, z, z2, i, z3);
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final void mo24913(C23596 c23596, AbstractC24266 abstractC24266, C14878 c14878, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        m24902(c14878, hashSet, z2);
        super.mo24913(c23596, abstractC24266, c14878, hashSet, z, z2, i, z3);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24902(C14878 c14878, HashSet hashSet, boolean z) {
        int i = this.f29952 + 1;
        this.f29952 = i;
        if ((i & 255) == 0) {
            C20195.m45697();
        }
        if (!z && this.f29952 > 4096) {
            throw C22207.f70236;
        }
        if (z) {
            int i2 = this.f29949 + 1;
            this.f29949 = i2;
            if (i2 > 65536 || c14878.f42416.size() >= 4096 || hashSet.size() >= 4096) {
                throw new IllegalArgumentException("Parser prediction exceeds formatter limit");
            }
        }
    }

    @Override // p067l.AbstractC13538
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18017 mo24911(AbstractC18017 abstractC18017) {
        AbstractC18017 abstractC18017M44093;
        if (abstractC18017.mo30021()) {
            return abstractC18017;
        }
        synchronized (this.f29950) {
            abstractC18017M44093 = this.f29950.m44093(abstractC18017);
            if (abstractC18017M44093 == null) {
                abstractC18017M44093 = super.mo24911(abstractC18017);
            }
        }
        return abstractC18017M44093;
    }

    @Override // p067l.C24525
    /* JADX INFO: renamed from: ֫ */
    public final C15334 mo24909(C7959 c7959, C15334 c15334) {
        HashMap map = c7959.f20920;
        int size = map.size();
        C15334 c15334Mo24909 = super.mo24909(c7959, c15334);
        if (map.size() != size) {
            C24888 c24888 = this.f29950;
            c24888.f79489 = c15334Mo24909.f43764.f42416.size() + c24888.f79489;
        }
        return c15334Mo24909;
    }
}
