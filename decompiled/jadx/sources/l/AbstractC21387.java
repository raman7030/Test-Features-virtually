package l;

/* JADX INFO: renamed from: l.᩸ۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21387 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f68884;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f68885;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0779 f68886;

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC21387 mo7602(C0779 c0779);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo34201(C0384 c0384, C1386 c1386);

    public AbstractC21387(C6735 c6735, C0779 c0779, AbstractC4308 abstractC4308) {
        this.f68885 = c6735;
        this.f68886 = c0779;
        this.f68884 = abstractC4308;
    }

    public String toString() {
        return String.format("%s[undet=%s,t=%s]", getClass().getSimpleName(), this.f68886.f14167, this.f68884);
    }
}
