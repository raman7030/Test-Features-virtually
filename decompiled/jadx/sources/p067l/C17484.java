package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܺۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M6BE */
/* JADX INFO: loaded from: classes5.dex */
public final class C17484 extends AbstractC11489 {

    /* JADX INFO: renamed from: ֫ */
    public final C14645 f52288;

    /* JADX INFO: renamed from: ۧ */
    public final int f52289;

    /* JADX INFO: renamed from: ܽ */
    public final int f52290;

    public C17484(C14645 c14645, int i, int i2) {
        this.f52288 = c14645;
        this.f52290 = i;
        this.f52289 = i2;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ֫ */
    public final int mo16459() {
        return this.f52288.m33504().mo13855(this.f52290);
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ܽ */
    public final int mo16461() {
        return this.f52288.m33504().m13856(this.f52290 + 4);
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ۧ */
    public final List mo16460() {
        C14645 c14645 = this.f52288;
        C20168 c20168M13859 = c14645.m33504().m13859(c14645.m33504().m13856(this.f52290 + 6) + this.f52289);
        int iM45629 = c20168M13859.m45629();
        int iM45631 = c20168M13859.m45631();
        c20168M13859.m45626();
        if (iM45629 > 0) {
            return new C11451(this, c14645, iM45631, iM45629);
        }
        int i = (iM45629 * (-1)) + 1;
        return new C10780(this, this.f52288, iM45631, i, i);
    }
}
