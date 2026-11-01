package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۚۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: A7N6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7429 extends AbstractC15618 {

    /* JADX INFO: renamed from: ܿ */
    public final long f19447;

    /* JADX INFO: renamed from: ᩳ */
    public final List f19448;

    public C7429(long j, List list) {
        super(list.size() - 1);
        this.f19447 = j;
        this.f19448 = list;
    }

    @Override // p067l.InterfaceC19683
    /* JADX INFO: renamed from: ֫ */
    public final long mo17166() {
        m35501();
        return this.f19447 + ((C23838) this.f19448.get((int) m35502())).f75743;
    }

    @Override // p067l.InterfaceC19683
    /* JADX INFO: renamed from: ۧ */
    public final long mo17167() {
        m35501();
        C23838 c23838 = (C23838) this.f19448.get((int) m35502());
        return this.f19447 + c23838.f75743 + c23838.f75740;
    }
}
