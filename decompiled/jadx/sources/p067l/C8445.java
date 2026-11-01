package p067l;

import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ۛ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54WU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8445 extends AbstractC8957 {

    /* JADX INFO: renamed from: ۗ */
    public int f22656;

    /* JADX INFO: renamed from: ۙ */
    public final Object f22657;

    /* JADX INFO: renamed from: ۛ */
    public boolean f22658;

    /* JADX INFO: renamed from: ۤ */
    public C12472 f22659;

    /* JADX INFO: renamed from: ۨ */
    public boolean f22660;

    /* JADX INFO: renamed from: ۫ */
    public C7519 f22661;

    /* JADX INFO: renamed from: ۬ */
    public int f22662;

    /* JADX INFO: renamed from: ᩶ */
    public final C5290 f22663;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8445(C24736 c24736, C7972 c7972, C4263 c4263) {
        super(c24736);
        int i = c4263.f9455;
        this.f22659 = new C12472();
        this.f22661 = new C7519();
        this.f22657 = new Object();
        this.f22663 = c7972.f20961;
        int iM18457 = c7972.m18457();
        c7972.m18462(2);
        int i2 = 0;
        boolean z = (iM18457 & 1) != 0;
        this.f22660 = z;
        boolean z2 = (iM18457 & 2) != 0;
        this.f22658 = z2;
        int iM18461 = c7972.m18461();
        this.f22656 = c7972.m18461() + i;
        this.f24275 = C22999.m51349(c7972, ((C24736) super.getType()).mo5203().mo14712());
        c7972.m18459(i + c4263.f9454);
        int i3 = -1;
        if (z) {
            while (i2 < iM18461) {
                int iM18463 = c7972.m18463();
                this.f22659.mo25657(iM18463, c7972.m18463() * 4);
                if (iM18463 > i3) {
                    i3 = iM18463;
                }
                i2++;
            }
            this.f22662 = i3;
            return;
        }
        if (z2) {
            while (i2 < iM18461) {
                int iM18464 = c7972.m18463();
                if (iM18464 != 65535) {
                    this.f22659.mo25657(i2, iM18464 * 4);
                }
                i2++;
            }
            this.f22662 = iM18461 - 1;
            return;
        }
        while (i2 < iM18461) {
            int iM18462 = c7972.m18461();
            if (iM18462 != -1) {
                this.f22659.mo25657(i2, iM18462);
            }
            i2++;
        }
        this.f22662 = iM18461 - 1;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֨ */
    public final int mo4715() {
        return this.f22662;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC22528 mo4717(int i) {
        int i2;
        int iM28704 = this.f22659.m28704(i);
        if (iM28704 == -1 || (i2 = iM28704 + this.f22656) < 0) {
            return null;
        }
        C5290 c5290 = this.f22663;
        if (c5290.m11435(i2) < 8) {
            return null;
        }
        C7972 c7972M11445 = c5290.m11445(i2);
        C13810 c13810 = new C13810(this, i, c7972M11445);
        c5290.m11437(c7972M11445);
        return c13810;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo4718(int i) {
        int i2;
        boolean z;
        int iM28704 = this.f22659.m28704(i);
        if (iM28704 == -1 || (i2 = this.f22656 + iM28704) < 0 || this.f22663.m11435(i2) < 8) {
            return false;
        }
        synchronized (this.f22657) {
            byte bM17423 = this.f22661.m17423(i);
            if (bM17423 == 0) {
                C7972 c7972M11445 = this.f22663.m11445(i2);
                bM17423 = C13810.m31465(c7972M11445, (C19372) super.mo10442()) ? (byte) 1 : (byte) 2;
                this.f22663.m11437(c7972M11445);
                this.f22661.mo17419(bM17423, i);
            }
            z = bM17423 == 1;
        }
        return z;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ܽ */
    public final String mo4719(int i) {
        int iM11442;
        int iM28704 = this.f22659.m28704(i);
        if (iM28704 == -1) {
            return null;
        }
        int i2 = this.f22656 + iM28704;
        C5290 c5290 = this.f22663;
        if ((c5290.m11444(i2 + 2) & 8) != 0) {
            iM11442 = c5290.m11441(i2);
        } else {
            iM11442 = c5290.m11442(i2 + 4);
        }
        try {
            return ((C18030) ((C19372) super.mo10442()).m44105()).f53844.m50188(iM11442);
        } catch (IndexOutOfBoundsException unused) {
            return C0708d.f2599O;
        }
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۚ֫ */
    public final boolean mo4716() {
        return this.f22660;
    }

    @Override // p067l.InterfaceC9116
    /* JADX INFO: renamed from: ᩷ۧ */
    public final boolean mo4720() {
        return this.f22658;
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo10437() {
        return (C24538) super.mo10437();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo10442() {
        return (C19372) super.mo10442();
    }

    @Override // p067l.AbstractC8957, p067l.InterfaceC9116
    public final InterfaceC3080 getType() {
        return (C24736) super.getType();
    }
}
