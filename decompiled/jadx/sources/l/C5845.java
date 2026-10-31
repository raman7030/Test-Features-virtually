package l;

/* JADX INFO: renamed from: l.ۛۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C5845 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f17932;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f17931 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17930 = false;

    public C5845(StringBuilder sb) {
        this.f17932 = sb;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16370() {
        this.f17931.append(EnumC0121.f1143);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16371() {
        StringBuilder sb = this.f17931;
        int length = sb.length();
        if (length == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb.setLength(length - 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16369(String str) {
        boolean z = this.f17930;
        StringBuilder sb = this.f17932;
        if (z) {
            this.f17930 = false;
            sb.append((CharSequence) this.f17931);
        }
        sb.append((CharSequence) str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16368() {
        this.f17932.append((CharSequence) "\n");
        this.f17930 = true;
    }
}
