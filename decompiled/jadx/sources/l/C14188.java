package l;

/* JADX INFO: renamed from: l.ܳ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4HR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14188 extends AbstractC2195 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f42825;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f42826 = new StringBuilder();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42827 = false;

    @Override // l.AbstractC2195
    /* JADX INFO: renamed from: ᩻ */
    public final void mo7259() {
        super.mo7259();
        AbstractC2195.m7249(this.f42826);
        this.f42825 = null;
        this.f42827 = false;
    }

    public C14188() {
        this.f7214 = EnumC15599.Comment;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33849() {
        String str = this.f42825;
        return str != null ? str : this.f42826.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33847(char c) {
        String str = this.f42825;
        StringBuilder sb = this.f42826;
        if (str != null) {
            sb.append(str);
            this.f42825 = null;
        }
        sb.append(c);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33848(String str) {
        String str2 = this.f42825;
        StringBuilder sb = this.f42826;
        if (str2 != null) {
            sb.append(str2);
            this.f42825 = null;
        }
        if (sb.length() == 0) {
            this.f42825 = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        return C4860.m14172("<!--", m33849(), "-->");
    }
}
