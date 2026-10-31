package l;

/* JADX INFO: renamed from: l.۫᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12724 implements InterfaceC22747 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f38277;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f38279 = new int[2];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7744 f38280;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11459 f38281;

    public C12724(C7744 c7744, C11459 c11459, Runnable runnable) {
        this.f38280 = c7744;
        this.f38281 = c11459;
        this.f38277 = runnable;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31013(C12164 c12164, boolean z) {
        int iGroupCount = z ? c12164.groupCount() : 0;
        this.f38278 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f38279.length < i) {
            this.f38279 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f38278; i2++) {
            int i3 = i2 * 2;
            this.f38279[i3] = c12164.start(i2);
            this.f38279[i3 + 1] = c12164.end(i2);
        }
    }

    @Override // l.InterfaceC22747
    public final CharSequence getText() {
        return this.f38280;
    }

    @Override // l.InterfaceC22747
    public final C11459 pattern() {
        return this.f38281;
    }

    @Override // l.InterfaceC22747
    public final int groupCount() {
        return this.f38278;
    }

    @Override // l.InterfaceC22747
    public final int start(int i) {
        return this.f38279[i * 2];
    }

    @Override // l.InterfaceC22747
    public final int end(int i) {
        return this.f38279[(i * 2) + 1];
    }

    @Override // l.InterfaceC22747
    public final String group(int i) {
        if (i >= 0 && i <= this.f38278) {
            int iStart = start(i);
            int iEnd = end(i);
            if (iStart >= 0 && iEnd >= 0) {
                return this.f38280.subSequence(iStart, iEnd);
            }
        }
        return "";
    }

    @Override // l.InterfaceC22747
    /* JADX INFO: renamed from: ֫ */
    public final void mo21388() {
        this.f38277.run();
    }
}
