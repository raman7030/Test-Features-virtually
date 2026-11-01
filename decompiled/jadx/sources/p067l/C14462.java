package p067l;

/* JADX INFO: renamed from: l.۫᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C14462 implements InterfaceC23987 {

    /* JADX INFO: renamed from: ֫ */
    public final Runnable f41306;

    /* JADX INFO: renamed from: ۧ */
    public int f41307;

    /* JADX INFO: renamed from: ܽ */
    public int[] f41308 = new int[2];

    /* JADX INFO: renamed from: ܿ */
    public final C9729 f41309;

    /* JADX INFO: renamed from: ᩳ */
    public final C13259 f41310;

    public C14462(C9729 c9729, C13259 c13259, Runnable runnable) {
        this.f41309 = c9729;
        this.f41310 = c13259;
        this.f41306 = runnable;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33093(C13929 c13929, boolean z) {
        int iGroupCount = z ? c13929.groupCount() : 0;
        this.f41307 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f41308.length < i) {
            this.f41308 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f41307; i2++) {
            int i3 = i2 * 2;
            this.f41308[i3] = c13929.start(i2);
            this.f41308[i3 + 1] = c13929.end(i2);
        }
    }

    @Override // p067l.InterfaceC23987
    public final CharSequence getText() {
        return this.f41309;
    }

    @Override // p067l.InterfaceC23987
    public final C13259 pattern() {
        return this.f41310;
    }

    @Override // p067l.InterfaceC23987
    public final int groupCount() {
        return this.f41307;
    }

    @Override // p067l.InterfaceC23987
    public final int start(int i) {
        return this.f41308[i * 2];
    }

    @Override // p067l.InterfaceC23987
    public final int end(int i) {
        return this.f41308[(i * 2) + 1];
    }

    @Override // p067l.InterfaceC23987
    public final String group(int i) {
        if (i >= 0 && i <= this.f41307) {
            int iStart = start(i);
            int iEnd = end(i);
            if (iStart >= 0 && iEnd >= 0) {
                return this.f41309.subSequence(iStart, iEnd);
            }
        }
        return "";
    }

    @Override // p067l.InterfaceC23987
    /* JADX INFO: renamed from: ֫ */
    public final void mo23355() {
        this.f41306.run();
    }
}
