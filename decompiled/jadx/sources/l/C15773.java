package l;

import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes5.dex */
public final class C15773 extends AbstractC21044 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f48618;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short f48619;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C0251[] f48620;

    public C15773(C8719 c8719, int i, C5896 c5896) {
        super(c8719, i);
        int iM16537 = c5896.m16537();
        short sM16534 = c5896.m16534();
        this.f48619 = sM16534;
        int iM16535 = c5896.m16535();
        if (mo29408()) {
            this.f48620 = new C0251[]{new C0251(this, (byte) ((sM16534 >> 8) & 255), iM16535)};
        } else {
            if (mo29412()) {
                this.f67902 = c5896.m16535();
                int iMax = Math.max(c5896.m16535(), 0);
                this.f48620 = new C0251[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f48620[i2] = new C0251(this, i2, c5896.m16535(), c5896);
                }
            } else {
                this.f48620 = new C0251[]{new C0251(this, 0, -1, c5896)};
            }
            iM16537 = iM16535;
        }
        this.f48618 = iM16537;
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue() {
        return this.f48620[0];
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue(int i) {
        return this.f48620[i];
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܽ֫ */
    public final int mo29409() {
        return this.f48620.length;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo29412() {
        return (this.f48619 & 1) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۛ֫ */
    public final boolean mo29405() {
        return (this.f48619 & 2) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo29411() {
        return (this.f48619 & 4) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo29408() {
        return (this.f48619 & 8) != 0;
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo29404() {
        return (C5191) super.mo29404();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۟֫ */
    public final String mo29406() {
        try {
            List listM43134 = ((C18597) super.mo29407()).m43134();
            return ((C3780) listM43134).f11945.m47858(this.f48618);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo29407() {
        return (C18597) super.mo29407();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final InterfaceC0748 getType() {
        return (C19303) super.getType();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC7099 mo29410() {
        return (C8719) super.mo29410();
    }
}
