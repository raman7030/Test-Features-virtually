package p067l;

/* JADX INFO: renamed from: l.ۛۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QN */
/* JADX INFO: loaded from: classes2.dex */
public final class C7923 {

    /* JADX INFO: renamed from: ܽ */
    public final StringBuilder f20784;

    /* JADX INFO: renamed from: ۧ */
    public final StringBuilder f20783 = new StringBuilder();

    /* JADX INFO: renamed from: ֫ */
    public boolean f20782 = false;

    public C7923(StringBuilder sb) {
        this.f20784 = sb;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18295() {
        this.f20783.append(EnumC2483.f3919);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m18296() {
        StringBuilder sb = this.f20783;
        int length = sb.length();
        if (length == 0) {
            throw new IllegalArgumentException(" Outdent() without matching Indent().");
        }
        sb.setLength(length - 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18294(String str) {
        boolean z = this.f20782;
        StringBuilder sb = this.f20784;
        if (z) {
            this.f20782 = false;
            sb.append((CharSequence) this.f20783);
        }
        sb.append((CharSequence) str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18293() {
        this.f20784.append((CharSequence) "\n");
        this.f20782 = true;
    }
}
