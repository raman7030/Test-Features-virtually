package p067l;

/* JADX INFO: renamed from: l.֫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3902 {

    /* JADX INFO: renamed from: ܿ */
    public static final C3902 f8451;

    /* JADX INFO: renamed from: ֫ */
    public final C9128 f8453;

    /* JADX INFO: renamed from: ۧ */
    public final C9128 f8454;

    /* JADX INFO: renamed from: ᩳ */
    public static final String f8452 = C17173.m38881("jsoup.sourceRange");

    /* JADX INFO: renamed from: ܽ */
    public static final String f8450 = C17173.m38881("jsoup.endSourceRange");

    static {
        C9128 c9128 = new C9128(-1, -1, -1);
        f8451 = new C3902(c9128, c9128);
    }

    public C3902(C9128 c9128, C9128 c9129) {
        this.f8454 = c9128;
        this.f8453 = c9129;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C9128 m7710() {
        return this.f8454;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9128 m7707() {
        return this.f8453;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m7709() {
        return this != f8451;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C3902 m7706(AbstractC13152 abstractC13152, boolean z) {
        String str = z ? f8452 : f8450;
        if (!abstractC13152.mo27069(str)) {
            return f8451;
        }
        Object objM38892 = abstractC13152.mo27062().m38892(str);
        if (objM38892 != null) {
            return (C3902) objM38892;
        }
        throw new C15832("Object must not be null");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7708(AbstractC13152 abstractC13152, boolean z) {
        abstractC13152.mo27062().m38889(z ? f8452 : f8450, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3902.class != obj.getClass()) {
            return false;
        }
        C3902 c3902 = (C3902) obj;
        if (this.f8454.equals(c3902.f8454)) {
            return this.f8453.equals(c3902.f8453);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8453.hashCode() + (this.f8454.hashCode() * 31);
    }

    public final String toString() {
        return C24104.m53357(String.valueOf(this.f8454), "-", String.valueOf(this.f8453));
    }
}
