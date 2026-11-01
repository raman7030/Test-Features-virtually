package p067l;

/* JADX INFO: renamed from: l.ܶۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V8T2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16619 {

    /* JADX INFO: renamed from: ֫ */
    public int f48857;

    /* JADX INFO: renamed from: ۧ */
    public boolean f48858;

    /* JADX INFO: renamed from: ܽ */
    public int f48859;

    /* JADX INFO: renamed from: ܿ */
    public boolean f48860;

    /* JADX INFO: renamed from: ᩳ */
    public C14569 f48861;

    public C16619(C14569 c14569) {
        this.f48861 = c14569;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37679(int i) {
        this.f48858 |= i > 0;
        this.f48859 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37680(C14569 c14569) {
        this.f48858 |= this.f48861 != c14569;
        this.f48861 = c14569;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37681(int i) {
        if (this.f48860 && this.f48857 != 5) {
            C23877.m52957(i == 5);
            return;
        }
        this.f48858 = true;
        this.f48860 = true;
        this.f48857 = i;
    }
}
