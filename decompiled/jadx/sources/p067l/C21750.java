package p067l;

/* JADX INFO: renamed from: l.᩶᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9BT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21750 extends AbstractC23761 {

    /* JADX INFO: renamed from: ֡ */
    public int f68467;

    /* JADX INFO: renamed from: ۖ */
    public int f68468;

    /* JADX INFO: renamed from: ۘ */
    public final C19738 f68469;

    /* JADX INFO: renamed from: ۚ */
    public final C19738 f68470;

    /* JADX INFO: renamed from: ۜ */
    public final C19738 f68471;

    /* JADX INFO: renamed from: ۡ */
    public final C19738 f68472;

    /* JADX INFO: renamed from: ۢ */
    public int f68473;

    /* JADX INFO: renamed from: ۧ */
    public final C19738 f68474;

    /* JADX INFO: renamed from: ܳ */
    public final int f68475;

    /* JADX INFO: renamed from: ܺ */
    public final C19738 f68476;

    /* JADX INFO: renamed from: ܽ */
    public int f68477;

    /* JADX INFO: renamed from: ܿ */
    public final int f68478;

    /* JADX INFO: renamed from: ᩳ */
    public int f68479;

    /* JADX INFO: renamed from: ᩴ */
    public int f68480;

    /* JADX INFO: renamed from: ᩵ */
    public final C8338 f68481;

    /* JADX INFO: renamed from: ᩷ */
    public int f68482;

    /* JADX INFO: renamed from: ᩻ */
    public final int f68483;

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ֫ */
    public final void mo49024() {
    }

    public C21750(C8338 c8338, int i, int i2, int i3) {
        super(589824, null);
        this.f68481 = c8338;
        this.f68475 = i;
        this.f68478 = i2;
        this.f68483 = i3;
        this.f68469 = new C19738();
        this.f68474 = new C19738();
        this.f68471 = new C19738();
        this.f68470 = new C19738();
        this.f68476 = new C19738();
        this.f68472 = new C19738();
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ֫ */
    public final void mo44001(String str) {
        this.f68479 = this.f68481.m19248(str).f42967;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ۧ */
    public final void mo44004(String str) {
        this.f68472.m44877(this.f68481.m19261(str).f42967);
        this.f68473++;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ֫ */
    public final void mo44000(int i, String str, String str2) {
        C8338 c8338 = this.f68481;
        int i2 = c8338.m19257(str).f42967;
        C19738 c19738 = this.f68469;
        c19738.m44877(i2);
        c19738.m44877(i);
        c19738.m44877(str2 == null ? 0 : c8338.m19265(str2));
        this.f68480++;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ֫ */
    public final void mo44002(String str, int i, String... strArr) {
        C8338 c8338 = this.f68481;
        int i2 = c8338.m19261(str).f42967;
        C19738 c19738 = this.f68474;
        c19738.m44877(i2);
        c19738.m44877(i);
        if (strArr == null) {
            c19738.m44877(0);
        } else {
            c19738.m44877(strArr.length);
            for (String str2 : strArr) {
                c19738.m44877(c8338.m19257(str2).f42967);
            }
        }
        this.f68477++;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ۧ */
    public final void mo44005(String str, int i, String... strArr) {
        C8338 c8338 = this.f68481;
        int i2 = c8338.m19261(str).f42967;
        C19738 c19738 = this.f68471;
        c19738.m44877(i2);
        c19738.m44877(i);
        if (strArr == null) {
            c19738.m44877(0);
        } else {
            c19738.m44877(strArr.length);
            for (String str2 : strArr) {
                c19738.m44877(c8338.m19257(str2).f42967);
            }
        }
        this.f68482++;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ܽ */
    public final void mo44006(String str) {
        this.f68470.m44877(this.f68481.m19248(str).f42967);
        this.f68467++;
    }

    @Override // p067l.AbstractC23761
    /* JADX INFO: renamed from: ֫ */
    public final void mo44003(String str, String... strArr) {
        C8338 c8338 = this.f68481;
        int i = c8338.m19248(str).f42967;
        C19738 c19738 = this.f68476;
        c19738.m44877(i);
        c19738.m44877(strArr.length);
        for (String str2 : strArr) {
            c19738.m44877(c8338.m19248(str2).f42967);
        }
        this.f68468++;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m49027() {
        return (this.f68473 > 0 ? 1 : 0) + 1 + (this.f68479 > 0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49026() {
        C8338 c8338 = this.f68481;
        c8338.m19265("Module");
        int i = this.f68469.f60036 + 22 + this.f68474.f60036 + this.f68471.f60036 + this.f68470.f60036 + this.f68476.f60036;
        if (this.f68473 > 0) {
            c8338.m19265("ModulePackages");
            i += this.f68472.f60036 + 8;
        }
        if (this.f68479 <= 0) {
            return i;
        }
        c8338.m19265("ModuleMainClass");
        return i + 8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49025(C19738 c19738) {
        C19738 c19739 = this.f68469;
        int i = c19739.f60036 + 16;
        C19738 c197310 = this.f68474;
        int i2 = i + c197310.f60036;
        C19738 c197311 = this.f68471;
        int i3 = i2 + c197311.f60036;
        C19738 c197312 = this.f68470;
        int i4 = i3 + c197312.f60036;
        C19738 c197313 = this.f68476;
        int i5 = i4 + c197313.f60036;
        C8338 c8338 = this.f68481;
        c19738.m44877(c8338.m19265("Module"));
        c19738.m44875(i5);
        c19738.m44877(this.f68475);
        c19738.m44877(this.f68478);
        c19738.m44877(this.f68483);
        c19738.m44877(this.f68480);
        c19738.m44872(0, c19739.f60036, c19739.f60035);
        c19738.m44877(this.f68477);
        c19738.m44872(0, c197310.f60036, c197310.f60035);
        c19738.m44877(this.f68482);
        c19738.m44872(0, c197311.f60036, c197311.f60035);
        c19738.m44877(this.f68467);
        c19738.m44872(0, c197312.f60036, c197312.f60035);
        c19738.m44877(this.f68468);
        c19738.m44872(0, c197313.f60036, c197313.f60035);
        if (this.f68473 > 0) {
            c19738.m44877(c8338.m19265("ModulePackages"));
            C19738 c197314 = this.f68472;
            c19738.m44875(c197314.f60036 + 2);
            c19738.m44877(this.f68473);
            c19738.m44872(0, c197314.f60036, c197314.f60035);
        }
        if (this.f68479 > 0) {
            c19738.m44877(c8338.m19265("ModuleMainClass"));
            c19738.m44875(2);
            c19738.m44877(this.f68479);
        }
    }
}
