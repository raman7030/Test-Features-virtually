package p067l;

/* JADX INFO: renamed from: l.֫ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes2.dex */
public final class C4236 {

    /* JADX INFO: renamed from: ֫ */
    public C9620 f9363;

    /* JADX INFO: renamed from: ۜ */
    public final String f9364;

    /* JADX INFO: renamed from: ۧ */
    public final int f9365;

    /* JADX INFO: renamed from: ܳ */
    public CharSequence f9366;

    /* JADX INFO: renamed from: ܽ */
    public int f9367;

    /* JADX INFO: renamed from: ܿ */
    public boolean f9368;

    /* JADX INFO: renamed from: ᩳ */
    public String f9369;

    /* JADX INFO: renamed from: ᩻ */
    public final int f9370;

    public C4236(String str, int i, int i2, CharSequence charSequence) {
        this.f9364 = str;
        this.f9370 = i;
        this.f9365 = i2;
        this.f9366 = charSequence;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m8614() {
        m8612();
        return this.f9369;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8613() {
        m8612();
        return this.f9367;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m8615() {
        m8612();
        return this.f9368;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m8612() {
        int iCodePointCount;
        if (this.f9369 != null) {
            return;
        }
        C9620 c9620M22402 = this.f9363;
        int i = this.f9370;
        if (c9620M22402 == null) {
            c9620M22402 = C9620.m22402(i, this.f9365, this.f9366);
            this.f9363 = c9620M22402;
        }
        if (c9620M22402.f26490) {
            iCodePointCount = 0;
        } else {
            String str = c9620M22402.f26489;
            iCodePointCount = (240 - str.codePointCount(0, str.length())) / 2;
        }
        int iM23611 = C10127.m23611(i, -iCodePointCount, this.f9366);
        this.f9367 = iM23611;
        String strM23605 = C10127.m23605(iM23611, 240, this.f9366);
        this.f9369 = strM23605;
        int i2 = this.f9367;
        this.f9368 = i2 > 0 || strM23605.length() + i2 < this.f9366.length();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m8616() {
        if (this.f9363 == null) {
            this.f9363 = C9620.m22402(this.f9370, this.f9365, this.f9366);
        }
        m8612();
        this.f9366 = "";
    }
}
