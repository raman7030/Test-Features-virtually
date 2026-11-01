package p067l;

/* JADX INFO: renamed from: l.᩺ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P89T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24017 extends AbstractC16640 {

    /* JADX INFO: renamed from: ۧ */
    public Long f76263;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC3782 f76264;

    /* JADX INFO: renamed from: ۧ */
    public abstract C9265 mo30361();

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC3782 m53194() {
        return this.f76264;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Long m53193() {
        return this.f76263;
    }

    @Override // p067l.AbstractC16640
    /* JADX INFO: renamed from: ۧ */
    public final void mo37710(C17311 c17311) {
        C9265 c9265Mo30361 = mo30361();
        this.f76264 = c9265Mo30361;
        c17311.m39277(c9265Mo30361);
        c17311.m39276(EnumC5913.FOUR);
        c17311.m39281();
        if (c17311.m39280() != 0) {
            this.f76263 = Long.valueOf(c17311.m39281());
        } else {
            this.f76263 = null;
        }
    }
}
