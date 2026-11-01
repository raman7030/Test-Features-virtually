package p067l;

/* JADX INFO: renamed from: l.ۜܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8852 extends AbstractC4158 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f24024;

    public C8852(int i) {
        super(0);
        this.f24024 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ֫ */
    public final void mo8429() {
        this.f24024 = false;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ۧ */
    public final int mo8431() {
        return (m8435().endsWith("/>") || m8435().endsWith("/ >") || m8435().startsWith("</")) ? 0 : 1;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܽ */
    public final int mo8433() {
        return m8435().startsWith("</") ? -1 : 0;
    }

    @Override // p067l.AbstractC4158
    /* JADX INFO: renamed from: ܳ */
    public final String mo8432() {
        int i;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!this.f24024 && (i = this.f9175.read()) != -1) {
            char c = (char) i;
            sb.append(c);
            if (c == '\"') {
                z = !z;
            }
            if (c == '>' && !z) {
                this.f24024 = true;
            }
        }
        return sb.toString();
    }
}
