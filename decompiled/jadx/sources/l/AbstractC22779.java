package l;

/* JADX INFO: renamed from: l.᩺ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P89T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22779 extends AbstractC15017 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Long f73533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC1488 f73534;

    /* JADX INFO: renamed from: ۧ */
    public abstract C7257 mo28317();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC1488 m50851() {
        return this.f73534;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Long m50850() {
        return this.f73533;
    }

    @Override // l.AbstractC15017
    /* JADX INFO: renamed from: ۧ */
    public final void mo35554(C15723 c15723) {
        C7257 c7257Mo28317 = mo28317();
        this.f73534 = c7257Mo28317;
        c15723.m37108(c7257Mo28317);
        c15723.m37107(EnumC3730.FOUR);
        c15723.m37112();
        if (c15723.m37111() != 0) {
            this.f73533 = Long.valueOf(c15723.m37112());
        } else {
            this.f73533 = null;
        }
    }
}
