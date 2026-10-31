package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15352 implements InterfaceC18882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f47051;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f47052;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22409 f47053;

    public C15352(C22409 c22409) {
        this.f47053 = c22409;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36388() {
        if (this.f47052 == 2) {
            this.f47052 = 1;
        }
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6412() {
        return this.f47053.f72622;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final void mo6411() throws IOException {
        C22409 c22409 = this.f47053;
        if (c22409.f72617) {
            return;
        }
        c22409.f72624.m23063(Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6410(C3002 c3002, C21843 c21843, int i) {
        m36387();
        C22409 c22409 = this.f47053;
        boolean z = c22409.f72622;
        if (z && c22409.f72620 == null) {
            this.f47052 = 2;
        }
        int i2 = this.f47052;
        if (i2 == 2) {
            c21843.m12691(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c3002.f9455 = c22409.f72618;
            this.f47052 = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c22409.f72620.getClass();
        c21843.m12691(1);
        c21843.f69997 = 0L;
        if ((i & 4) == 0) {
            c21843.m49228(c22409.f72623);
            c21843.f69995.put(c22409.f72620, 0, c22409.f72623);
        }
        if ((i & 1) == 0) {
            this.f47052 = 2;
        }
        return -4;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6409(long j) {
        m36387();
        if (j <= 0 || this.f47052 == 2) {
            return 0;
        }
        this.f47052 = 2;
        return 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m36387() {
        if (this.f47051) {
            return;
        }
        C22409 c22409 = this.f47053;
        C8134 c8134 = c22409.f72619;
        c8134.m21595(new C12761(c8134, new C6723(1, C9786.m24807(c22409.f72618.f25614), c22409.f72618, 0, null, C3603.m11037(0L), -9223372036854775807L)));
        this.f47051 = true;
    }
}
