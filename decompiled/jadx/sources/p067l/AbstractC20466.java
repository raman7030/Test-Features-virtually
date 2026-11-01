package p067l;

import android.util.Pair;

/* JADX INFO: renamed from: l.ᩴ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20466 extends AbstractC6974 {

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ int f63205 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final int f63206;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3549 f63207;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo34689(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo34690(Object obj);

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo34691(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo34692(int i);

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo34693(int i);

    /* JADX INFO: renamed from: ᩳ */
    public abstract Object mo34694(int i);

    /* JADX INFO: renamed from: ᩻ */
    public abstract AbstractC6974 mo34696(int i);

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C23738 mo15985(Object obj, C23738 c23738) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo34690 = mo34690(obj2);
        int iMo34691 = mo34691(iMo34690);
        mo34696(iMo34690).mo15985(obj3, c23738);
        c23738.f75532 += iMo34691;
        c23738.f75528 = obj;
        return c23738;
    }

    public AbstractC20466(InterfaceC3549 interfaceC3549) {
        this.f63207 = interfaceC3549;
        this.f63206 = interfaceC3549.getLength();
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15976(int i, int i2, boolean z) {
        int iMo34692 = mo34692(i);
        int iMo34691 = mo34691(iMo34692);
        int iMo15976 = mo34696(iMo34692).mo15976(i - iMo34691, i2 == 2 ? 0 : i2, z);
        if (iMo15976 != -1) {
            return iMo34691 + iMo15976;
        }
        int iM46161 = m46161(iMo34692, z);
        while (iM46161 != -1 && mo34696(iM46161).m15990()) {
            iM46161 = m46161(iM46161, z);
        }
        if (iM46161 != -1) {
            return mo34696(iM46161).mo15979(z) + mo34691(iM46161);
        }
        if (i2 == 2) {
            return mo15979(z);
        }
        return -1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ۧ */
    public final int mo15988(int i, int i2, boolean z) {
        AbstractC20466 abstractC20466;
        int iMo6323;
        int iMo34692 = mo34692(i);
        int iMo34691 = mo34691(iMo34692);
        int iMo15988 = mo34696(iMo34692).mo15988(i - iMo34691, i2 == 2 ? 0 : i2, z);
        if (iMo15988 != -1) {
            return iMo34691 + iMo15988;
        }
        InterfaceC3549 interfaceC3549 = this.f63207;
        if (z) {
            iMo6323 = interfaceC3549.mo6323(iMo34692);
            abstractC20466 = this;
        } else if (iMo34692 > 0) {
            abstractC20466 = this;
            iMo6323 = iMo34692 - 1;
        } else {
            abstractC20466 = this;
            iMo6323 = -1;
        }
        while (iMo6323 != -1 && abstractC20466.mo34696(iMo6323).m15990()) {
            if (z) {
                iMo6323 = interfaceC3549.mo6323(iMo6323);
            } else if (iMo6323 > 0) {
                iMo6323--;
            } else {
                abstractC20466 = abstractC20466;
                iMo6323 = -1;
            }
        }
        if (iMo6323 != -1) {
            return abstractC20466.mo34696(iMo6323).mo15989(z) + abstractC20466.mo34691(iMo6323);
        }
        if (i2 == 2) {
            return abstractC20466.mo15989(z);
        }
        return -1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ۧ */
    public final int mo15989(boolean z) {
        int i = this.f63206;
        if (i != 0) {
            InterfaceC3549 interfaceC3549 = this.f63207;
            int iMo6321 = z ? interfaceC3549.mo6321() : i - 1;
            while (mo34696(iMo6321).m15990()) {
                if (z) {
                    iMo6321 = interfaceC3549.mo6323(iMo6321);
                } else {
                    iMo6321 = iMo6321 > 0 ? iMo6321 - 1 : -1;
                }
                if (iMo6321 == -1) {
                }
            }
            return mo34696(iMo6321).mo15989(z) + mo34691(iMo6321);
        }
        return -1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15979(boolean z) {
        if (this.f63206 != 0) {
            int iMo6325 = z ? this.f63207.mo6325() : 0;
            while (mo34696(iMo6325).m15990()) {
                iMo6325 = m46161(iMo6325, z);
                if (iMo6325 == -1) {
                }
            }
            return mo34696(iMo6325).mo15979(z) + mo34691(iMo6325);
        }
        return -1;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C21727 mo15983(int i, C21727 c21727, long j) {
        int iMo34692 = mo34692(i);
        int iMo34691 = mo34691(iMo34692);
        int iMo34693 = mo34693(iMo34692);
        mo34696(iMo34692).mo15983(i - iMo34691, c21727, j);
        Object objMo34694 = mo34694(iMo34692);
        if (!C21727.f68424.equals(c21727.f68437)) {
            objMo34694 = Pair.create(objMo34694, c21727.f68437);
        }
        c21727.f68437 = objMo34694;
        c21727.f68436 += iMo34693;
        c21727.f68428 += iMo34693;
        return c21727;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C23738 mo15984(int i, C23738 c23738, boolean z) {
        int iMo34689 = mo34689(i);
        int iMo34691 = mo34691(iMo34689);
        mo34696(iMo34689).mo15984(i - mo34693(iMo34689), c23738, z);
        c23738.f75532 += iMo34691;
        if (z) {
            Object objMo34694 = mo34694(iMo34689);
            Object obj = c23738.f75528;
            obj.getClass();
            c23738.f75528 = Pair.create(objMo34694, obj);
        }
        return c23738;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15978(Object obj) {
        int iMo15978;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo34690 = mo34690(obj2);
        if (iMo34690 == -1 || (iMo15978 = mo34696(iMo34690).mo15978(obj3)) == -1) {
            return -1;
        }
        return mo34693(iMo34690) + iMo15978;
    }

    @Override // p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15982(int i) {
        int iMo34689 = mo34689(i);
        return Pair.create(mo34694(iMo34689), mo34696(iMo34689).mo15982(i - mo34693(iMo34689)));
    }

    /* JADX INFO: renamed from: ֫ */
    private int m46161(int i, boolean z) {
        if (z) {
            return this.f63207.mo6326(i);
        }
        if (i < this.f63206 - 1) {
            return i + 1;
        }
        return -1;
    }
}
