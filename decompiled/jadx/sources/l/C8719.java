package l;

import com.umeng.analytics.pro.d;

/* JADX INFO: renamed from: l.ۡۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes.dex */
public class C8719 extends AbstractC6932 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26533;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26534;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f26535;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10630 f26536;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f26537;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5419 f26538;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26539;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3074 f26540;

    static {
        ApplicationC12518.m30701(81);
    }

    public native C8719(C19303 c19303, C5896 c5896, C1993 c1993, C9327 c9327);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m22522(C20616 c20616);

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ֨ */
    public final int mo2344() {
        return this.f26533;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21211 mo2346(int i) {
        int i2;
        int iM26664 = this.f26536.m26664(i);
        if (iM26664 == -1 || (i2 = iM26664 + this.f26534) < 0) {
            return null;
        }
        C3074 c3074 = this.f26540;
        if (c3074.m9393(i2) < 8) {
            return null;
        }
        C5896 c5896M9403 = c3074.m9403(i2);
        C15773 c15773 = new C15773(this, i, c5896M9403);
        c3074.m9395(c5896M9403);
        return c15773;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo2347(int i) {
        int i2;
        int iM16535;
        int iM26664 = this.f26536.m26664(i);
        if (iM26664 != -1 && (i2 = iM26664 + this.f26534) >= 0) {
            C3074 c3074 = this.f26540;
            if (c3074.m9393(i2) >= 8) {
                C5419 c5419 = this.f26538;
                byte bM15512 = c5419.m15512(i);
                if (bM15512 == 0) {
                    C5896 c5896M9403 = c3074.m9403(i2);
                    C18597 c18597 = (C18597) super.mo8396();
                    if (c5896M9403.m16525() < 8) {
                        bM15512 = 2;
                    } else {
                        int iM16537 = c5896M9403.m16537();
                        short sM16534 = c5896M9403.m16534();
                        int iM16536 = c5896M9403.m16535();
                        boolean z = (sM16534 & 8) != 0;
                        boolean z2 = (sM16534 & 1) != 0;
                        if (z) {
                            if (iM16537 < 0 || iM16537 >= ((C3780) c18597.m43134()).f11945.size()) {
                                bM15512 = 2;
                            } else {
                                bM15512 = 1;
                            }
                        } else {
                            if (iM16536 >= 0 && iM16536 < ((C3780) c18597.m43134()).f11945.size()) {
                                if (z2) {
                                    c5896M9403.m16528();
                                    iM16535 = c5896M9403.m16535();
                                    if (iM16535 != -1) {
                                    }
                                } else {
                                    iM16535 = 1;
                                }
                                if (!z2 ? c5896M9403.m16525() >= iM16535 * 8 : c5896M9403.m16525() >= iM16535 * 12) {
                                    int size = c18597.mo12847().mo14959().size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM16535) {
                                            if (z2) {
                                                c5896M9403.m16528();
                                            }
                                            c5896M9403.m16536(2);
                                            c5896M9403.m16532();
                                            byte bM16532 = c5896M9403.m16532();
                                            int iM16538 = c5896M9403.m16535();
                                            if (C5688.m16005(bM16532) && (bM16532 != 3 || (iM16538 >= 0 && iM16538 < size))) {
                                                i3++;
                                            }
                                        } else {
                                            bM15512 = 1;
                                        }
                                    }
                                }
                            }
                            bM15512 = 2;
                        }
                    }
                    c3074.m9395(c5896M9403);
                    c5419.mo15508(bM15512, i);
                }
                if (bM15512 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ܽ */
    public final String mo2348(int i) {
        int iM9400;
        int iM26664 = this.f26536.m26664(i);
        if (iM26664 == -1) {
            return null;
        }
        int i2 = this.f26534 + iM26664;
        C3074 c3074 = this.f26540;
        if ((c3074.m9402(i2 + 2) & 8) != 0) {
            iM9400 = c3074.m9399(i2);
        } else {
            iM9400 = c3074.m9400(i2 + 4);
        }
        try {
            return ((C3780) ((C18597) super.mo8396()).m43134()).f11945.m47858(iM9400);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo2345() {
        return this.f26537;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo2349() {
        return this.f26535;
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC9922 mo8391() {
        return (C5191) super.mo8391();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC4277 mo8396() {
        return (C18597) super.mo8396();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    public final InterfaceC0748 getType() {
        return (C19303) super.getType();
    }
}
