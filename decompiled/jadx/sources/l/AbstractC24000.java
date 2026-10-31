package l;

/* JADX INFO: renamed from: l.᩻᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24000 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 f77784;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f77785;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC23195 f77786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f77787;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7067 f77788;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC24000 f77789;

    public AbstractC24000(C7067 c7067, AbstractC23195 abstractC23195) {
        this.f77788 = c7067;
        this.f77786 = abstractC23195;
        this.f77787 = c7067.m19052(true);
        this.f77785 = c7067.f21744.m8245() - 1;
        this.f77789 = c7067.m19067();
        C9184 c9184 = c7067.f21747;
        this.f77784 = c9184.f27821.m17522(c9184.f27821.m17495(c9184.f27817, c9184.f27819.f18867, abstractC23195.f74560, 1536L));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m52837() {
        AbstractC4308 abstractC4308 = this.f77786.f74560;
        abstractC4308.getClass();
        return (abstractC4308 instanceof C5843) || m52836() || this.f77784.m8245() > 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52836() {
        C9184 c9184 = this.f77788.f21747;
        if (c9184.f27809) {
            return true;
        }
        return c9184.f27821.m17527(c9184.f27808.f66487.f13890, this.f77786.f74560) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52835() {
        AbstractC10370 abstractC10370 = this.f77787.f17562;
        if (abstractC10370 == null) {
            return "null";
        }
        String string = abstractC10370.toString();
        if (string.equals("<clinit>")) {
            return "static";
        }
        return string.equals("<init>") ? "new" : string;
    }
}
