package l;

/* JADX INFO: renamed from: l.ۧܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7AT */
/* JADX INFO: loaded from: classes3.dex */
public final class C11138 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12164 f33422;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16781 f33423;

    public C11138(C16781 c16781, C12164 c12164) {
        this.f33423 = c16781;
        this.f33422 = c12164;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1965 m27623(CharSequence charSequence, String str) {
        C12164 c12164 = this.f33422;
        c12164.m29615reset(charSequence);
        boolean zMatches = "exact".equals(this.f33423.f51541) ? c12164.matches() : c12164.find();
        m27625();
        if (zMatches) {
            return new C1965(str, c12164.start(), c12164.end(), charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27626(CharSequence charSequence, C9727 c9727) throws C3059 {
        C12164 c12164 = this.f33422;
        c12164.m29615reset(charSequence);
        if ("exact".equals(this.f33423.f51541)) {
            boolean zMatches = c12164.matches();
            m27625();
            if (zMatches) {
                c9727.m24716(new C1965("dexString", c12164.start(), c12164.end(), charSequence));
                return;
            }
            return;
        }
        while (c12164.find()) {
            m27625();
            c9727.m24716(new C1965("dexString", c12164.start(), c12164.end(), charSequence));
        }
        m27625();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1965 m27622(int i, int i2, CharSequence charSequence) throws C3059 {
        C12164 c12164 = this.f33422;
        c12164.m29615reset(charSequence);
        while (c12164.find()) {
            m27625();
            if (c12164.start() < i2 && c12164.end() > i) {
                return new C1965("dexClassName", c12164.start(), c12164.end(), charSequence);
            }
        }
        m27625();
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27625() throws C3059 {
        C12164 c12164 = this.f33422;
        if (c12164.m29603()) {
            throw C3059.m9367(null, "REGEX_TIMEOUT", "Regex matching timed out.", "fatal");
        }
        if (c12164.m29613()) {
            throw C3059.m9367(null, "REGEX_RESOURCE_LIMIT", "Regex matching exceeded its execution memory limit.", "fatal");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12164 m27624(C11418 c11418) {
        C12164 c12164 = this.f33422;
        c12164.m29615reset((CharSequence) c11418);
        return c12164;
    }
}
