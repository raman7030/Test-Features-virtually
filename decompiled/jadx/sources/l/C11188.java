package l;

/* JADX INFO: renamed from: l.ۧᩴܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAO7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11188 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f33581;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f33582;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f33583;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f33584;

    public C11188(String str, String str2) {
        this.f33581 = str;
        this.f33582 = str2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27761() {
        this.f33583 = ApplicationC20075.f65008.getString(this.f33581, null);
        this.f33584 = ApplicationC20075.f65008.getString(this.f33582, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27757() {
        return this.f33583;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27758(String str) {
        this.f33583 = str;
        ApplicationC20075.f65008.edit().putString(this.f33581, str).apply();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m27759() {
        return this.f33584;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27760(String str) {
        this.f33584 = str;
        ApplicationC20075.f65008.edit().putString(this.f33582, str).apply();
    }
}
