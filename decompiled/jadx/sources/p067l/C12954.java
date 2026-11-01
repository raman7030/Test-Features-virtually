package p067l;

/* JADX INFO: renamed from: l.ۧܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C12954 {

    /* JADX INFO: renamed from: ֫ */
    public final C13929 f36422;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C18317 f36423;

    public C12954(C18317 c18317, C13929 c13929) {
        this.f36423 = c18317;
        this.f36422 = c13929;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4236 m29685(CharSequence charSequence, String str) {
        C13929 c13929 = this.f36422;
        c13929.m56473reset(charSequence);
        boolean zMatches = "exact".equals(this.f36423.f54723) ? c13929.matches() : c13929.find();
        m29687();
        if (zMatches) {
            return new C4236(str, c13929.start(), c13929.end(), charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29688(CharSequence charSequence, C11613 c11613) throws C5276 {
        C13929 c13929 = this.f36422;
        c13929.m56473reset(charSequence);
        if ("exact".equals(this.f36423.f54723)) {
            boolean zMatches = c13929.matches();
            m29687();
            if (zMatches) {
                c11613.m26730(new C4236("dexString", c13929.start(), c13929.end(), charSequence));
                return;
            }
            return;
        }
        while (c13929.find()) {
            m29687();
            c11613.m26730(new C4236("dexString", c13929.start(), c13929.end(), charSequence));
        }
        m29687();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4236 m29684(int i, int i2, CharSequence charSequence) throws C5276 {
        C13929 c13929 = this.f36422;
        c13929.m56473reset(charSequence);
        while (c13929.find()) {
            m29687();
            if (c13929.start() < i2 && c13929.end() > i) {
                return new C4236("dexClassName", c13929.start(), c13929.end(), charSequence);
            }
        }
        m29687();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29687() throws C5276 {
        C13929 c13929 = this.f36422;
        if (c13929.m31668()) {
            throw C5276.m11409(null, "REGEX_TIMEOUT", "Regex matching timed out.", "fatal");
        }
        if (c13929.m31678()) {
            throw C5276.m11409(null, "REGEX_RESOURCE_LIMIT", "Regex matching exceeded its execution memory limit.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13929 m29686(C13220 c13220) {
        C13929 c13929 = this.f36422;
        c13929.m56473reset((CharSequence) c13220);
        return c13929;
    }
}
