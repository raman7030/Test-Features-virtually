package p067l;

/* JADX INFO: renamed from: l.ܺᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8MS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17682 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C17682 f52814;

    /* JADX INFO: renamed from: ֫ */
    public final int f52815;

    /* JADX INFO: renamed from: ۧ */
    public final int f52816;

    /* JADX INFO: renamed from: ܽ */
    public final int f52817 = 0;

    static {
        C10978 c10978 = new C10978();
        C23877.m52957(true);
        f52814 = new C17682(c10978);
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
    }

    public C17682(C10978 c10978) {
        c10978.getClass();
        this.f52816 = 0;
        c10978.getClass();
        this.f52815 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17682)) {
            return false;
        }
        C17682 c17682 = (C17682) obj;
        return this.f52817 == c17682.f52817 && this.f52816 == c17682.f52816 && this.f52815 == c17682.f52815;
    }

    public final int hashCode() {
        return (((((this.f52817 + 527) * 31) + this.f52816) * 31) + this.f52815) * 31;
    }
}
