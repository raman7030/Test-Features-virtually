package p067l;

/* JADX INFO: renamed from: l.᩺۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBFP */
/* JADX INFO: loaded from: classes.dex */
public final class C24214 {

    /* JADX INFO: renamed from: ֫ */
    public C8537 f76741;

    /* JADX INFO: renamed from: ۧ */
    public String f76742;

    /* JADX INFO: renamed from: ܽ */
    public C8537 f76743;

    /* JADX INFO: renamed from: ֫ */
    public final void m53530(C17450 c17450) {
        C8537 c8537 = this.f76741;
        if (c8537.f22916 != null) {
            c8537.f22916 = c17450;
        } else {
            this.f76743.f22916 = c17450;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17450 m53532() {
        Object obj = this.f76741.f22916;
        return obj != null ? (C17450) obj : (C17450) this.f76743.f22916;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C17450 m53531() {
        Object obj = this.f76741.f22917;
        return obj != null ? (C17450) obj : (C17450) this.f76743.f22917;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m53528() {
        if (this.f76742 == null) {
            this.f76742 = m53527();
        }
        return this.f76742;
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m53527() {
        Object obj = this.f76743.f22916;
        if (obj == null) {
            return null;
        }
        Object obj2 = ((C23368) ((C17450) ((C15991) ((C17450) obj).f52180).f10654).f52180).f10654;
        this.f76742 = (String) obj2;
        return (String) obj2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53529(C5263 c5263) {
        Object obj;
        C8537 c8537 = this.f76743;
        C8537 c8538 = this.f76741;
        Object obj2 = c8538.f22916;
        if (obj2 != null && ((C17450) obj2).f23817 != ((C17450) c8537.f22916).f23817) {
            m53527();
            c5263.m11368((C17450) c8537.f22916);
        }
        Object obj3 = c8538.f22917;
        if (obj3 == null || (obj = c8537.f22917) == null) {
            return;
        }
        C17450 c17450 = (C17450) obj;
        if (((C17450) obj3).f23817 != c17450.f23817) {
            c5263.m11368(c17450);
        }
    }
}
