package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ᩻ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8Q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9919 implements InterfaceC17182 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1451 f29994;

    @Override // l.InterfaceC17182
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo25025() {
    }

    public C9919(C1451 c1451) {
        this.f29994 = c1451;
    }

    @Override // l.InterfaceC17182
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo25028() {
        Iterator it = this.f29994.f5175.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8769();
        }
    }

    @Override // l.InterfaceC17182
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo25027() {
        Iterator it = this.f29994.f5175.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8768();
        }
    }

    @Override // l.InterfaceC17182
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25026(C6404 c6404) {
        Iterator it = this.f29994.f5175.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8756(c6404);
        }
    }
}
