package p067l;

/* JADX INFO: renamed from: l.֫֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBJF */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783 {

    /* JADX INFO: renamed from: ܽ */
    public static final C3783 f8101 = new C3783(false, false);

    /* JADX INFO: renamed from: ᩳ */
    public static final C3783 f8102 = new C3783(true, true);

    /* JADX INFO: renamed from: ֫ */
    public final boolean f8103;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f8104;

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7399() {
        return this.f8104;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m7397() {
        return this.f8103;
    }

    public C3783(boolean z, boolean z2) {
        this.f8104 = z;
        this.f8103 = z2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m7398(String str) {
        String strTrim = str.trim();
        return !this.f8104 ? C24550.m54147(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m7395(String str) {
        String strTrim = str.trim();
        return !this.f8103 ? C24550.m54147(strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7396(C17173 c17173) {
        if (c17173 == null || this.f8103) {
            return;
        }
        c17173.normalize();
    }
}
