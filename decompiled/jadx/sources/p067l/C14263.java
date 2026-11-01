package p067l;

/* JADX INFO: renamed from: l.۫ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M181 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14263 implements InterfaceC5180 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C12252 f40639;

    /* JADX INFO: renamed from: ܽ */
    public C20125 f40640 = new C20125();

    /* JADX INFO: renamed from: ֫ */
    public C20125 f40638 = new C20125();

    public C14263(C12252 c12252) {
        this.f40639 = c12252;
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ܽ */
    public final void mo11093(int i) {
        this.f40638.add(i);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ֫ */
    public final void mo11091(int i) {
        this.f40640.add(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32773() {
        C12252 c12252;
        InterfaceC8705 it = this.f40640.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c12252 = this.f40639;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (iNextInt > c12252.f34256) {
                c12252.f34256 = iNextInt;
            }
        }
        InterfaceC8705 it2 = this.f40638.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = it2.nextInt();
            if (iNextInt2 > c12252.f34256) {
                c12252.f34256 = iNextInt2;
            }
        }
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ۧ */
    public final void mo11092(int i) {
        mo11093(i);
    }

    @Override // p067l.InterfaceC5180
    /* JADX INFO: renamed from: ᩳ */
    public final void mo11094(int i) {
        mo11091(i);
    }
}
