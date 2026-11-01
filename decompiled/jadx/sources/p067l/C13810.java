package p067l;

import com.umeng.analytics.pro.C0708d;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes4.dex */
public final class C13810 extends AbstractC22369 {

    /* JADX INFO: renamed from: ۗ */
    public final int f39033;

    /* JADX INFO: renamed from: ۙ */
    public final short f39034;

    /* JADX INFO: renamed from: ۬ */
    public final C8643[] f39035;

    public C13810(C8445 c8445, int i, C7972 c7972) {
        super(c8445, i);
        int iM18463 = c7972.m18463();
        short sM18460 = c7972.m18460();
        this.f39034 = sM18460;
        int iM18461 = c7972.m18461();
        if (mo31470()) {
            this.f39035 = new C8643[]{new C8643(this, (byte) ((sM18460 >> 8) & 255), iM18461)};
        } else {
            if (mo31474()) {
                this.f70587 = c7972.m18461();
                int iMax = Math.max(c7972.m18461(), 0);
                this.f39035 = new C8643[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f39035[i2] = new C8643(this, i2, c7972.m18461(), c7972);
                }
            } else {
                this.f39035 = new C8643[]{new C8643(this, 0, -1, c7972)};
            }
            iM18463 = iM18461;
        }
        this.f39033 = iM18463;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31465(C7972 c7972, C19372 c19372) {
        int iM18461;
        if (c7972.m18451() >= 8) {
            int iM18463 = c7972.m18463();
            short sM18460 = c7972.m18460();
            int iM18462 = c7972.m18461();
            boolean z = (sM18460 & 8) != 0;
            boolean z2 = (sM18460 & 1) != 0;
            if (z) {
                if (iM18463 >= 0 && iM18463 < ((C18030) c19372.m44105()).f53844.size()) {
                    return true;
                }
            } else if (iM18462 >= 0 && iM18462 < ((C18030) c19372.m44105()).f53844.size()) {
                if (z2) {
                    c7972.m18454();
                    iM18461 = c7972.m18461();
                    if (iM18461 != -1) {
                    }
                } else {
                    iM18461 = 1;
                }
                if (!z2 ? c7972.m18451() >= iM18461 * 8 : c7972.m18451() >= iM18461 * 12) {
                    int size = c19372.mo14711().mo16869().size();
                    for (int i = 0; i < iM18461; i++) {
                        if (z2) {
                            c7972.m18454();
                        }
                        c7972.m18462(2);
                        c7972.m18458();
                        byte bM18458 = c7972.m18458();
                        int iM18464 = c7972.m18461();
                        if (C7775.m17940(bM18458) && (bM18458 != 3 || (iM18464 >= 0 && iM18464 < size))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue() {
        return this.f39035[0];
    }

    @Override // p067l.InterfaceC22528
    public final InterfaceC3751 getValue(int i) {
        return this.f39035[i];
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo31471() {
        return this.f39035.length;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo31474() {
        return (this.f39034 & 1) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo31467() {
        return (this.f39034 & 2) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo31473() {
        return (this.f39034 & 4) != 0;
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo31470() {
        return (this.f39034 & 8) != 0;
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo31466() {
        return (C24538) super.mo31466();
    }

    @Override // p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo31468() {
        try {
            List listM44105 = ((C19372) super.mo31469()).m44105();
            return ((C18030) listM44105).f53844.m50188(this.f39033);
        } catch (IndexOutOfBoundsException unused) {
            return C0708d.f2599O;
        }
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo31469() {
        return (C19372) super.mo31469();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    public final InterfaceC3080 getType() {
        return (C24736) super.getType();
    }

    @Override // p067l.AbstractC22369, p067l.InterfaceC22528
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9116 mo31472() {
        return (C8445) super.mo31472();
    }
}
