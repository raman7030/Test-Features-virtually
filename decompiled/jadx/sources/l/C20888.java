package l;

/* JADX INFO: renamed from: l.᩷۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7T6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20888 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20888 f67585 = new C20888(new C6776());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f67586;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC6079 f67587;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f67588;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f67589;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f67590;

    public C20888(C6776 c6776) {
        this.f67587 = c6776.f21035;
        this.f67590 = c6776.f21038;
        this.f67586 = c6776.f21034;
        this.f67588 = c6776.f21036;
        this.f67589 = c6776.f21037;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20888)) {
            return false;
        }
        C20888 c20888 = (C20888) obj;
        return this.f67587.equals(c20888.f67587) && this.f67586 == c20888.f67586 && this.f67590 == c20888.f67590 && this.f67588 == c20888.f67588 && this.f67589 == c20888.f67589;
    }

    public final int hashCode() {
        return C11003.hash(this.f67587, null, null, Boolean.valueOf(this.f67590), Boolean.valueOf(this.f67586), Boolean.valueOf(this.f67588), Boolean.valueOf(this.f67589));
    }
}
