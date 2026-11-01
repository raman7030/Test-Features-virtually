package p067l;

/* JADX INFO: renamed from: l.᩹ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes.dex */
public final class C23364 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC6462 f74464;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6462 f74465;

    /* JADX INFO: renamed from: ܽ */
    public EnumC5259 f74466;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C8769 f74467;

    public C23364(C8769 c8769, EnumC5259 enumC5259, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        this.f74467 = c8769;
        this.f74466 = enumC5259;
        this.f74464 = abstractC6462;
        this.f74465 = abstractC6463;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23364)) {
            return false;
        }
        C23364 c23364 = (C23364) obj;
        if (this.f74466 != c23364.f74466) {
            return false;
        }
        C8769 c8769 = this.f74467;
        return c8769.f23797.m19490(this.f74464, c23364.f74464) && c8769.f23797.m19490(this.f74465, c23364.f74465);
    }

    public final int hashCode() {
        int iHashCode = this.f74466.hashCode() * 127;
        C8374 c8374 = this.f74467.f23797;
        c8374.getClass();
        int iM19408 = (C8374.m19408(this.f74464) + iHashCode) * 127;
        c8374.getClass();
        return C8374.m19408(this.f74465) + iM19408;
    }
}
