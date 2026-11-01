package p067l;

/* JADX INFO: renamed from: l.ۧᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13002 {

    /* JADX INFO: renamed from: ֫ */
    public final String f36581;

    /* JADX INFO: renamed from: ۧ */
    public final String f36582;

    /* JADX INFO: renamed from: ܽ */
    public String f36583;

    /* JADX INFO: renamed from: ᩳ */
    public String f36584;

    public C13002(String str, String str2) {
        this.f36581 = str;
        this.f36582 = str2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m29823() {
        this.f36583 = ApplicationC21448.f67649.getString(this.f36581, null);
        this.f36584 = ApplicationC21448.f67649.getString(this.f36582, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m29819() {
        return this.f36583;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29820(String str) {
        this.f36583 = str;
        ApplicationC21448.f67649.edit().putString(this.f36581, str).apply();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m29821() {
        return this.f36584;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29822(String str) {
        this.f36584 = str;
        ApplicationC21448.f67649.edit().putString(this.f36582, str).apply();
    }
}
