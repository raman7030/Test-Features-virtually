package l;

/* JADX INFO: renamed from: l.۟᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7715 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f23844;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23845;

    /* JADX INFO: renamed from: ֫ */
    public void mo17358() {
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo17361() {
    }

    /* JADX INFO: renamed from: ᩻ */
    public int mo17365() {
        return 0;
    }

    public AbstractC7715(C14439 c14439, int i) {
        this.f23844 = c14439;
        this.f23845 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC7715 mo5817() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ܳ */
    public void mo5815() {
        throw new AssertionError("store unsupported: " + this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC7715 mo20666() {
        throw new AssertionError(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo17362(int i) {
        this.f23844.f44255[i].mo17361();
    }

    /* JADX INFO: renamed from: ܿ */
    public C6304 mo17363() {
        mo5817();
        return this.f23844.m34467(EnumC17734.f54268);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7715 mo20665(int i) {
        int i2 = this.f23845;
        if (i2 == i) {
            return this;
        }
        mo5817();
        int iM4795 = C1365.m4795(i2);
        int iM4796 = C1365.m4795(i);
        C14439 c14439 = this.f23844;
        if (iM4795 != iM4796) {
            c14439.f44254.m4824((iM4795 * 3) + 133 + (iM4796 > iM4795 ? iM4796 - 1 : iM4796));
        }
        if (i != iM4796) {
            c14439.f44254.m4824(i + 140);
        }
        return c14439.f44255[i];
    }
}
