package p067l;

/* JADX INFO: renamed from: l.ۧ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13010 {

    /* JADX INFO: renamed from: ֫ */
    public final C5613 f36608;

    /* JADX INFO: renamed from: ۧ */
    public final C8295 f36609;

    /* JADX INFO: renamed from: ܳ */
    public final C24388 f36610;

    /* JADX INFO: renamed from: ܽ */
    public final C13660 f36611;

    /* JADX INFO: renamed from: ܿ */
    public final C19044 f36612;

    /* JADX INFO: renamed from: ᩳ */
    public final String f36613;

    static {
        new C23718().m52735();
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
        C5792.m13032(4);
        C5792.m13032(5);
    }

    public C13010(String str, C5613 c5613, C13660 c13660, C8295 c8295, C19044 c19044, C24388 c24388) {
        this.f36613 = str;
        this.f36611 = c13660;
        this.f36609 = c8295;
        this.f36612 = c19044;
        this.f36608 = c5613;
        this.f36610 = c24388;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23718 m29828() {
        return new C23718(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13010)) {
            return false;
        }
        C13010 c13010 = (C13010) obj;
        return C12826.equals(this.f36613, c13010.f36613) && this.f36608.equals(c13010.f36608) && C12826.equals(this.f36611, c13010.f36611) && this.f36609.equals(c13010.f36609) && C12826.equals(this.f36612, c13010.f36612) && C12826.equals(this.f36610, c13010.f36610);
    }

    public final int hashCode() {
        int iHashCode = this.f36613.hashCode() * 31;
        C13660 c13660 = this.f36611;
        int iHashCode2 = (this.f36612.hashCode() + ((this.f36608.hashCode() + ((this.f36609.hashCode() + ((iHashCode + (c13660 != null ? c13660.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f36610.getClass();
        return iHashCode2;
    }
}
