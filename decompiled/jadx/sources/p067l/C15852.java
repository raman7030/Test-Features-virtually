package p067l;

/* JADX INFO: renamed from: l.ܳ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15852 extends AbstractC4454 {

    /* JADX INFO: renamed from: ܳ */
    public String f45912;

    /* JADX INFO: renamed from: ܿ */
    public final StringBuilder f45913 = new StringBuilder();

    /* JADX INFO: renamed from: ᩳ */
    public boolean f45914 = false;

    @Override // p067l.AbstractC4454
    /* JADX INFO: renamed from: ᩻ */
    public final void mo9338() {
        super.mo9338();
        AbstractC4454.m9328(this.f45913);
        this.f45912 = null;
        this.f45914 = false;
    }

    public C15852() {
        this.f9999 = EnumC17193.Comment;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m35981() {
        String str = this.f45912;
        return str != null ? str : this.f45913.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35979(char c) {
        String str = this.f45912;
        StringBuilder sb = this.f45913;
        if (str != null) {
            sb.append(str);
            this.f45912 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35980(String str) {
        String str2 = this.f45912;
        StringBuilder sb = this.f45913;
        if (str2 != null) {
            sb.append(str2);
            this.f45912 = null;
        }
        if (sb.length() == 0) {
            this.f45912 = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        return C6988.m16053("<!--", m35981(), "-->");
    }
}
