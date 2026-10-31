package l;

/* JADX INFO: renamed from: l.۟ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7309 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f22436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f22437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f22438;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f22439;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f22440;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f22441;

    public C7309(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, String str, String str2, AbstractC16891 abstractC16891, AbstractC16891 abstractC16892) {
        this.f22436 = abstractC15440;
        this.f22437 = abstractC15441;
        this.f22440 = str;
        this.f22438 = str2;
        this.f22439 = abstractC16891;
        this.f22441 = abstractC16892;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19593() {
        if (this.f22436.mo23117() > this.f22437.mo23117()) {
            m19594();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19594() {
        AbstractC15440 abstractC15440 = this.f22436;
        this.f22436 = this.f22437;
        this.f22437 = abstractC15440;
        String str = this.f22440;
        this.f22440 = this.f22438;
        this.f22438 = str;
        AbstractC16891 abstractC16891 = this.f22439;
        this.f22439 = this.f22441;
        this.f22441 = abstractC16891;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19592() {
        this.f22439.mo15160(this.f22436.mo23554(), false);
        this.f22441.mo15160(this.f22437.mo23554(), false);
    }
}
