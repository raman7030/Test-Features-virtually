package l;

/* JADX INFO: renamed from: l.᩻֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes.dex */
public final class C23361 extends AbstractC2195 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f75040 = new StringBuilder();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f75039 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final StringBuilder f75042 = new StringBuilder();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f75038 = new StringBuilder();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f75041 = false;

    public C23361() {
        this.f7214 = EnumC15599.Doctype;
    }

    @Override // l.AbstractC2195
    /* JADX INFO: renamed from: ᩻ */
    public final void mo7259() {
        super.mo7259();
        AbstractC2195.m7249(this.f75040);
        this.f75039 = null;
        AbstractC2195.m7249(this.f75042);
        AbstractC2195.m7249(this.f75038);
        this.f75041 = false;
    }

    public final String toString() {
        return C4860.m14172("<!doctype ", this.f75040.toString(), ">");
    }
}
