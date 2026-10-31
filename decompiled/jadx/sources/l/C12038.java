package l;

import com.umeng.analytics.pro.d;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P53T */
/* JADX INFO: loaded from: classes4.dex */
public final class C12038 extends AbstractC21044 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f36022;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short f36023;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6602[] f36024;

    public C12038(C6393 c6393, int i, C5896 c5896) {
        super(c6393, i);
        int iM16537 = c5896.m16537();
        short sM16534 = c5896.m16534();
        this.f36023 = sM16534;
        int iM16535 = c5896.m16535();
        if (mo29408()) {
            this.f36024 = new C6602[]{new C6602(this, (byte) ((sM16534 >> 8) & 255), iM16535)};
        } else {
            if (mo29412()) {
                this.f67902 = c5896.m16535();
                int iMax = Math.max(c5896.m16535(), 0);
                this.f36024 = new C6602[iMax];
                for (int i2 = 0; i2 < iMax; i2++) {
                    this.f36024[i2] = new C6602(this, i2, c5896.m16535(), c5896);
                }
            } else {
                this.f36024 = new C6602[]{new C6602(this, 0, -1, c5896)};
            }
            iM16537 = iM16535;
        }
        this.f36022 = iM16537;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29403(C5896 c5896, C17891 c17891) {
        int iM16535;
        if (c5896.m16525() >= 8) {
            int iM16537 = c5896.m16537();
            short sM16534 = c5896.m16534();
            int iM16536 = c5896.m16535();
            boolean z = (sM16534 & 8) != 0;
            boolean z2 = (sM16534 & 1) != 0;
            if (z) {
                if (iM16537 >= 0 && iM16537 < ((C16479) c17891.m41858()).f50667.size()) {
                    return true;
                }
            } else if (iM16536 >= 0 && iM16536 < ((C16479) c17891.m41858()).f50667.size()) {
                if (z2) {
                    c5896.m16528();
                    iM16535 = c5896.m16535();
                    if (iM16535 != -1) {
                    }
                } else {
                    iM16535 = 1;
                }
                if (!z2 ? c5896.m16525() >= iM16535 * 8 : c5896.m16525() >= iM16535 * 12) {
                    int size = c17891.mo12847().mo14959().size();
                    for (int i = 0; i < iM16535; i++) {
                        if (z2) {
                            c5896.m16528();
                        }
                        c5896.m16536(2);
                        c5896.m16532();
                        byte bM16532 = c5896.m16532();
                        int iM16538 = c5896.m16535();
                        if (C5688.m16005(bM16532) && (bM16532 != 3 || (iM16538 >= 0 && iM16538 < size))) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue() {
        return this.f36024[0];
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue(int i) {
        return this.f36024[i];
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int mo29409() {
        return this.f36024.length;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29412() {
        return (this.f36023 & 1) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29405() {
        return (this.f36023 & 2) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo29411() {
        return (this.f36023 & 4) != 0;
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo29408() {
        return (this.f36023 & 8) != 0;
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 mo29404() {
        return (C23326) super.mo29404();
    }

    @Override // l.InterfaceC21211
    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final String mo29406() {
        try {
            List listM41858 = ((C17891) super.mo29407()).m41858();
            return ((C16479) listM41858).f50667.m47858(this.f36022);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 mo29407() {
        return (C17891) super.mo29407();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final InterfaceC0748 getType() {
        return (C23535) super.getType();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 mo29410() {
        return (C6393) super.mo29410();
    }
}
