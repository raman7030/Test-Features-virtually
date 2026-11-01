package p067l;

import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۡۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes.dex */
public class C10655 extends AbstractC8957 {

    /* JADX INFO: renamed from: ۗ */
    public int f29458;

    /* JADX INFO: renamed from: ۙ */
    public int f29459;

    /* JADX INFO: renamed from: ۛ */
    public boolean f29460;

    /* JADX INFO: renamed from: ۤ */
    public C12472 f29461;

    /* JADX INFO: renamed from: ۨ */
    public boolean f29462;

    /* JADX INFO: renamed from: ۫ */
    public C7519 f29463;

    /* JADX INFO: renamed from: ۬ */
    public int f29464;

    /* JADX INFO: renamed from: ᩶ */
    public final C5290 f29465;

    static {
        ApplicationC14266.m56479(81);
    }

    public native C10655(C20714 c20714, C7972 c7972, C4263 c4263, C11233 c11233);

    /* JADX INFO: renamed from: ֫ */
    public native void m24491(C21962 c21962);

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֨ */
    public final int mo4715() {
        return this.f29458;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22528 mo4717(int i) {
        int i2;
        int iM28704 = this.f29461.m28704(i);
        if (iM28704 == -1 || (i2 = iM28704 + this.f29459) < 0) {
            return null;
        }
        C5290 c5290 = this.f29465;
        if (c5290.m11435(i2) < 8) {
            return null;
        }
        C7972 c7972M11445 = c5290.m11445(i2);
        C17359 c17359 = new C17359(this, i, c7972M11445);
        c5290.m11437(c7972M11445);
        return c17359;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4718(int i) {
        int i2;
        int iM18461;
        int iM28704 = this.f29461.m28704(i);
        if (iM28704 != -1 && (i2 = iM28704 + this.f29459) >= 0) {
            C5290 c5290 = this.f29465;
            if (c5290.m11435(i2) >= 8) {
                C7519 c7519 = this.f29463;
                byte bM17423 = c7519.m17423(i);
                if (bM17423 == 0) {
                    C7972 c7972M11445 = c5290.m11445(i2);
                    C20043 c20043 = (C20043) super.mo10442();
                    if (c7972M11445.m18451() < 8) {
                        bM17423 = 2;
                    } else {
                        int iM18463 = c7972M11445.m18463();
                        short sM18460 = c7972M11445.m18460();
                        int iM18462 = c7972M11445.m18461();
                        boolean z = (sM18460 & 8) != 0;
                        boolean z2 = (sM18460 & 1) != 0;
                        if (z) {
                            if (iM18463 < 0 || iM18463 >= ((C5961) c20043.m45399()).f14751.size()) {
                                bM17423 = 2;
                            } else {
                                bM17423 = 1;
                            }
                        } else {
                            if (iM18462 >= 0 && iM18462 < ((C5961) c20043.m45399()).f14751.size()) {
                                if (z2) {
                                    c7972M11445.m18454();
                                    iM18461 = c7972M11445.m18461();
                                    if (iM18461 != -1) {
                                    }
                                } else {
                                    iM18461 = 1;
                                }
                                if (!z2 ? c7972M11445.m18451() >= iM18461 * 8 : c7972M11445.m18451() >= iM18461 * 12) {
                                    int size = c20043.mo14711().mo16869().size();
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < iM18461) {
                                            if (z2) {
                                                c7972M11445.m18454();
                                            }
                                            c7972M11445.m18462(2);
                                            c7972M11445.m18458();
                                            byte bM18458 = c7972M11445.m18458();
                                            int iM18464 = c7972M11445.m18461();
                                            if (C7775.m17940(bM18458) && (bM18458 != 3 || (iM18464 >= 0 && iM18464 < size))) {
                                                i3++;
                                            }
                                        } else {
                                            bM17423 = 1;
                                        }
                                    }
                                }
                            }
                            bM17423 = 2;
                        }
                    }
                    c5290.m11437(c7972M11445);
                    c7519.mo17419(bM17423, i);
                }
                if (bM17423 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܽ */
    public final String mo4719(int i) {
        int iM11442;
        int iM28704 = this.f29461.m28704(i);
        if (iM28704 == -1) {
            return null;
        }
        int i2 = this.f29459 + iM28704;
        C5290 c5290 = this.f29465;
        if ((c5290.m11444(i2 + 2) & 8) != 0) {
            iM11442 = c5290.m11441(i2);
        } else {
            iM11442 = c5290.m11442(i2 + 4);
        }
        try {
            return ((C5961) ((C20043) super.mo10442()).m45399()).f14751.m50188(iM11442);
        } catch (IndexOutOfBoundsException unused) {
            return C0708d.f2599O;
        }
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo4716() {
        return this.f29462;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo4720() {
        return this.f29460;
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo10437() {
        return (C7302) super.mo10437();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo10442() {
        return (C20043) super.mo10442();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    public final InterfaceC3080 getType() {
        return (C20714) super.getType();
    }
}
