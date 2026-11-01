package p067l;

/* JADX INFO: renamed from: l.ܺۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8RL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17238 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f51297;

    /* JADX INFO: renamed from: ۜ */
    public int f51298;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f51299;

    /* JADX INFO: renamed from: ܳ */
    public int f51300;

    /* JADX INFO: renamed from: ܽ */
    public int f51301;

    /* JADX INFO: renamed from: ܿ */
    public int f51302;

    /* JADX INFO: renamed from: ᩳ */
    public final int f51303;

    /* JADX INFO: renamed from: ᩷ */
    public final C19203 f51304;

    /* JADX INFO: renamed from: ᩻ */
    public long f51305;

    public C17238(C19203 c19203, C19203 c19204, boolean z) throws C10998 {
        this.f51304 = c19203;
        this.f51297 = c19204;
        this.f51299 = z;
        c19204.m43730(12);
        this.f51303 = c19204.m43738();
        c19203.m43730(12);
        this.f51298 = c19203.m43738();
        C23786.m52873("first_chunk must be 1", c19203.m43739() == 1);
        this.f51301 = -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39004() {
        long jM43725;
        int i = this.f51301 + 1;
        this.f51301 = i;
        if (i == this.f51303) {
            return false;
        }
        boolean z = this.f51299;
        C19203 c19203 = this.f51297;
        if (z) {
            jM43725 = c19203.m43712();
        } else {
            jM43725 = c19203.m43725();
        }
        this.f51305 = jM43725;
        if (this.f51301 == this.f51302) {
            C19203 c19204 = this.f51304;
            this.f51300 = c19204.m43738();
            c19204.m43724(4);
            int i2 = this.f51298 - 1;
            this.f51298 = i2;
            this.f51302 = i2 > 0 ? c19204.m43738() - 1 : -1;
        }
        return true;
    }
}
