package l;

import android.util.Pair;

/* JADX INFO: renamed from: l.ᩴ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8OL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19042 extends AbstractC4846 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59976 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f59977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1242 f59978;

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo32586(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo32587(Object obj);

    /* JADX INFO: renamed from: ܳ */
    public abstract int mo32588(int i);

    /* JADX INFO: renamed from: ܽ */
    public abstract int mo32589(int i);

    /* JADX INFO: renamed from: ܿ */
    public abstract int mo32590(int i);

    /* JADX INFO: renamed from: ᩳ */
    public abstract Object mo32591(int i);

    /* JADX INFO: renamed from: ᩻ */
    public abstract AbstractC4846 mo32593(int i);

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C22485 mo14105(Object obj, C22485 c22485) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo32587 = mo32587(obj2);
        int iMo32588 = mo32588(iMo32587);
        mo32593(iMo32587).mo14105(obj3, c22485);
        c22485.f72806 += iMo32588;
        c22485.f72802 = obj;
        return c22485;
    }

    public AbstractC19042(InterfaceC1242 interfaceC1242) {
        this.f59978 = interfaceC1242;
        this.f59977 = interfaceC1242.getLength();
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14096(int i, int i2, boolean z) {
        int iMo32589 = mo32589(i);
        int iMo32588 = mo32588(iMo32589);
        int iMo14096 = mo32593(iMo32589).mo14096(i - iMo32588, i2 == 2 ? 0 : i2, z);
        if (iMo14096 != -1) {
            return iMo32588 + iMo14096;
        }
        int iM43892 = m43892(iMo32589, z);
        while (iM43892 != -1 && mo32593(iM43892).m14110()) {
            iM43892 = m43892(iM43892, z);
        }
        if (iM43892 != -1) {
            return mo32593(iM43892).mo14099(z) + mo32588(iM43892);
        }
        if (i2 == 2) {
            return mo14099(z);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ۧ */
    public final int mo14108(int i, int i2, boolean z) {
        AbstractC19042 abstractC19042;
        int iMo4079;
        int iMo32589 = mo32589(i);
        int iMo32588 = mo32588(iMo32589);
        int iMo14108 = mo32593(iMo32589).mo14108(i - iMo32588, i2 == 2 ? 0 : i2, z);
        if (iMo14108 != -1) {
            return iMo32588 + iMo14108;
        }
        InterfaceC1242 interfaceC1242 = this.f59978;
        if (z) {
            iMo4079 = interfaceC1242.mo4079(iMo32589);
            abstractC19042 = this;
        } else if (iMo32589 > 0) {
            abstractC19042 = this;
            iMo4079 = iMo32589 - 1;
        } else {
            abstractC19042 = this;
            iMo4079 = -1;
        }
        while (iMo4079 != -1 && abstractC19042.mo32593(iMo4079).m14110()) {
            if (z) {
                iMo4079 = interfaceC1242.mo4079(iMo4079);
            } else if (iMo4079 > 0) {
                iMo4079--;
            } else {
                abstractC19042 = abstractC19042;
                iMo4079 = -1;
            }
        }
        if (iMo4079 != -1) {
            return abstractC19042.mo32593(iMo4079).mo14109(z) + abstractC19042.mo32588(iMo4079);
        }
        if (i2 == 2) {
            return abstractC19042.mo14109(z);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ۧ */
    public final int mo14109(boolean z) {
        int i = this.f59977;
        if (i != 0) {
            InterfaceC1242 interfaceC1242 = this.f59978;
            int iMo4077 = z ? interfaceC1242.mo4077() : i - 1;
            while (mo32593(iMo4077).m14110()) {
                if (z) {
                    iMo4077 = interfaceC1242.mo4079(iMo4077);
                } else {
                    iMo4077 = iMo4077 > 0 ? iMo4077 - 1 : -1;
                }
                if (iMo4077 == -1) {
                }
            }
            return mo32593(iMo4077).mo14109(z) + mo32588(iMo4077);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14099(boolean z) {
        if (this.f59977 != 0) {
            int iMo4081 = z ? this.f59978.mo4081() : 0;
            while (mo32593(iMo4081).m14110()) {
                iMo4081 = m43892(iMo4081, z);
                if (iMo4081 == -1) {
                }
            }
            return mo32593(iMo4081).mo14099(z) + mo32588(iMo4081);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C20369 mo14103(int i, C20369 c20369, long j) {
        int iMo32589 = mo32589(i);
        int iMo32588 = mo32588(iMo32589);
        int iMo32590 = mo32590(iMo32589);
        mo32593(iMo32589).mo14103(i - iMo32588, c20369, j);
        Object objMo32591 = mo32591(iMo32589);
        if (!C20369.f65748.equals(c20369.f65761)) {
            objMo32591 = Pair.create(objMo32591, c20369.f65761);
        }
        c20369.f65761 = objMo32591;
        c20369.f65760 += iMo32590;
        c20369.f65752 += iMo32590;
        return c20369;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        int iMo32586 = mo32586(i);
        int iMo32588 = mo32588(iMo32586);
        mo32593(iMo32586).mo14104(i - mo32590(iMo32586), c22485, z);
        c22485.f72806 += iMo32588;
        if (z) {
            Object objMo32591 = mo32591(iMo32586);
            Object obj = c22485.f72802;
            obj.getClass();
            c22485.f72802 = Pair.create(objMo32591, obj);
        }
        return c22485;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14098(Object obj) {
        int iMo14098;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo32587 = mo32587(obj2);
        if (iMo32587 == -1 || (iMo14098 = mo32593(iMo32587).mo14098(obj3)) == -1) {
            return -1;
        }
        return mo32590(iMo32587) + iMo14098;
    }

    @Override // l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14102(int i) {
        int iMo32586 = mo32586(i);
        return Pair.create(mo32591(iMo32586), mo32593(iMo32586).mo14102(i - mo32590(iMo32586)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43892(int i, boolean z) {
        if (z) {
            return this.f59978.mo4082(i);
        }
        if (i < this.f59977 - 1) {
            return i + 1;
        }
        return -1;
    }
}
