package p067l;

/* JADX INFO: renamed from: l.ۗܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: MAHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5550 {

    /* JADX INFO: renamed from: ֫ */
    public final String f13406;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f13407;

    /* JADX INFO: renamed from: ۡ */
    public final int f13408;

    /* JADX INFO: renamed from: ۢ */
    public final String f13409;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f13410;

    /* JADX INFO: renamed from: ܳ */
    public final String f13411;

    /* JADX INFO: renamed from: ܽ */
    public final String f13412;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f13413;

    /* JADX INFO: renamed from: ᩳ */
    public final String f13414;

    /* JADX INFO: renamed from: ᩷ */
    public final int f13415;

    /* JADX INFO: renamed from: ᩻ */
    public final int f13416;

    /* JADX INFO: renamed from: ֫ */
    public static C5550 m12282(int i, AbstractC5769 abstractC5769) {
        if (abstractC5769 instanceof C4209) {
            return new C5550(i, (C4209) abstractC5769);
        }
        if (abstractC5769 instanceof C8903) {
            return new C5550(i, (C8903) abstractC5769);
        }
        throw new RuntimeException();
    }

    public C5550(int i, C4209 c4209) {
        this.f13408 = i;
        this.f13415 = 0;
        this.f13412 = c4209.f9258;
        this.f13416 = c4209.f9261;
        this.f13409 = c4209.f9259;
        this.f13411 = c4209.f9262;
        this.f13414 = c4209.f14159;
        this.f13406 = c4209.f9257;
        this.f13413 = c4209.f9260;
        this.f13410 = true;
        this.f13407 = false;
    }

    public C5550(int i, C8903 c8903) {
        this.f13408 = i;
        this.f13415 = 1;
        this.f13412 = c8903.f24123;
        this.f13416 = c8903.f24122;
        this.f13409 = c8903.f24120;
        this.f13411 = c8903.f24124;
        this.f13414 = c8903.f14159;
        this.f13406 = c8903.f24119;
        this.f13413 = c8903.f24125;
        this.f13410 = c8903.f24121;
        this.f13407 = c8903.f24126;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5550.class != obj.getClass()) {
            return false;
        }
        C5550 c5550 = (C5550) obj;
        return this.f13408 == c5550.f13408 && this.f13415 == c5550.f13415 && this.f13416 == c5550.f13416 && this.f13413 == c5550.f13413 && this.f13410 == c5550.f13410 && this.f13407 == c5550.f13407 && this.f13412.equals(c5550.f13412) && this.f13409.equals(c5550.f13409) && this.f13411.equals(c5550.f13411) && this.f13406.equals(c5550.f13406);
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f13408), Integer.valueOf(this.f13415), this.f13412, Integer.valueOf(this.f13416), this.f13409, this.f13411, this.f13406, Boolean.valueOf(this.f13413), Boolean.valueOf(this.f13410), Boolean.valueOf(this.f13407));
    }
}
