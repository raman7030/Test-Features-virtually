package l;

/* JADX INFO: renamed from: l.۫ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M181 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12515 implements InterfaceC2959 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10399 f37615;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18683 f37616 = new C18683();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18683 f37614 = new C18683();

    public C12515(C10399 c10399) {
        this.f37615 = c10399;
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ܽ */
    public final void mo9041(int i) {
        this.f37614.add(i);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ֫ */
    public final void mo9039(int i) {
        this.f37616.add(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30698() {
        C10399 c10399;
        InterfaceC6667 it = this.f37616.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10399 = this.f37615;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (iNextInt > c10399.f31291) {
                c10399.f31291 = iNextInt;
            }
        }
        InterfaceC6667 it2 = this.f37614.iterator();
        while (it2.hasNext()) {
            int iNextInt2 = it2.nextInt();
            if (iNextInt2 > c10399.f31291) {
                c10399.f31291 = iNextInt2;
            }
        }
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* JADX INFO: renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
