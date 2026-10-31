package l;

/* JADX INFO: renamed from: l.᩹᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes.dex */
public final class C22568 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9310 f72968;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16782 f72969;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15240 f72970;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16384 f72971;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1755 f72972;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20661 f72973;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16384 f72974;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13395 f72975;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C1755 c1755 = this.f72972;
        this.f72972 = this.f72969.m39519(c5557.f17186);
        try {
            mo10758(c5557.f17181);
        } finally {
            this.f72972 = c1755;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        AbstractC5144 abstractC5144 = c17551.f53650;
        AbstractC4308 abstractC4308 = abstractC5144.f16086;
        C20661 c20661 = this.f72973;
        if (abstractC4308 == null) {
            C1755 c1755 = this.f72972;
            C9310 c9310 = this.f72968;
            c9310.getClass();
            AbstractC4308 abstractC4308M23954 = c9310.m23954(abstractC5144, c1755, AbstractC4308.f13885);
            AbstractC5144 abstractC5145 = c17551.f53650;
            abstractC5145.getClass();
            AbstractC4308 abstractC4309 = c20661.f66485;
            C15240 c15240 = this.f72970;
            AbstractC4308 abstractC4308M36106 = c15240.m36106(abstractC5145, abstractC4308M23954, abstractC4309, c15240.f46781);
            abstractC5145.f16086 = abstractC4308M36106;
            abstractC4308 = abstractC4308M36106;
        }
        AbstractC4308 abstractC43010 = c20661.f66451;
        C13395 c13395 = this.f72975;
        if (abstractC4308 == abstractC43010) {
            this.f72971 = c13395.m32404(c17551, abstractC43010, this.f72972);
            return;
        }
        AbstractC4308 abstractC43011 = c20661.f66530;
        if (abstractC4308 == abstractC43011) {
            this.f72974 = c13395.m32404(c17551, abstractC43011, this.f72972);
        }
    }

    public C22568(C13395 c13395, C9310 c9310, C15240 c15240, C20661 c20661, C16782 c16782) {
        this.f72975 = c13395;
        this.f72968 = c9310;
        this.f72970 = c15240;
        this.f72973 = c20661;
        this.f72969 = c16782;
    }
}
