package p067l;

/* JADX INFO: renamed from: l.᩷۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22220 {

    /* JADX INFO: renamed from: ܳ */
    public static final C22220 f70271 = new C22220(new C8808());

    /* JADX INFO: renamed from: ֫ */
    public final boolean f70272;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8146 f70273;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f70274;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f70275;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f70276;

    public C22220(C8808 c8808) {
        this.f70273 = c8808.f23909;
        this.f70276 = c8808.f23912;
        this.f70272 = c8808.f23908;
        this.f70274 = c8808.f23910;
        this.f70275 = c8808.f23911;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22220)) {
            return false;
        }
        C22220 c22220 = (C22220) obj;
        return this.f70273.equals(c22220.f70273) && this.f70272 == c22220.f70272 && this.f70276 == c22220.f70276 && this.f70274 == c22220.f70274 && this.f70275 == c22220.f70275;
    }

    public final int hashCode() {
        return C12826.hash(this.f70273, null, null, Boolean.valueOf(this.f70276), Boolean.valueOf(this.f70272), Boolean.valueOf(this.f70274), Boolean.valueOf(this.f70275));
    }
}
