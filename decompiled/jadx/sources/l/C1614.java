package l;

/* JADX INFO: renamed from: l.֫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1614 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C1614 f5671;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7113 f5673;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7113 f5674;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f5672 = C15578.m36720("jsoup.sourceRange");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f5670 = C15578.m36720("jsoup.endSourceRange");

    static {
        C7113 c7113 = new C7113(-1, -1, -1);
        f5671 = new C1614(c7113, c7113);
    }

    public C1614(C7113 c7113, C7113 c7114) {
        this.f5674 = c7113;
        this.f5673 = c7114;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7113 m5480() {
        return this.f5674;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7113 m5477() {
        return this.f5673;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5479() {
        return this != f5671;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1614 m5476(AbstractC11347 abstractC11347, boolean z) {
        String str = z ? f5672 : f5670;
        if (!abstractC11347.mo25052(str)) {
            return f5671;
        }
        Object objM36731 = abstractC11347.mo25045().m36731(str);
        if (objM36731 != null) {
            return (C1614) objM36731;
        }
        throw new C14167("Object must not be null");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5478(AbstractC11347 abstractC11347, boolean z) {
        abstractC11347.mo25045().m36728(z ? f5672 : f5670, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1614.class != obj.getClass()) {
            return false;
        }
        C1614 c1614 = (C1614) obj;
        if (this.f5674.equals(c1614.f5674)) {
            return this.f5673.equals(c1614.f5673);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5673.hashCode() + (this.f5674.hashCode() * 31);
    }

    public final String toString() {
        return C22870.m50967(String.valueOf(this.f5674), "-", String.valueOf(this.f5673));
    }
}
