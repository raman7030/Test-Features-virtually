package p067l;

/* JADX INFO: renamed from: l.۠᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10386 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462 f28747;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 f28748;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C8374 f28749;

    public C10386(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C8374 c8374) {
        this.f28749 = c8374;
        this.f28747 = abstractC6462;
        this.f28748 = abstractC6463;
    }

    public final int hashCode() {
        return C8374.m19408(this.f28748) + (C8374.m19408(this.f28747) * 127);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10386)) {
            return false;
        }
        C10386 c10386 = (C10386) obj;
        AbstractC6462 abstractC6462 = this.f28747;
        AbstractC6462 abstractC6463 = c10386.f28747;
        C8374 c8374 = this.f28749;
        return c8374.m19490(abstractC6462, abstractC6463) && c8374.m19490(this.f28748, c10386.f28748);
    }
}
