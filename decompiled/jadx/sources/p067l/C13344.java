package p067l;

/* JADX INFO: renamed from: l.ۨ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W4OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13344 extends AbstractC23558 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f37472;

    /* JADX INFO: renamed from: ᩹ */
    public final int f37473;

    public C13344(C14645 c14645, C20168 c20168, int i) {
        this.f37472 = c14645;
        this.f37473 = c20168.m45647(i + 1);
    }

    @Override // p067l.InterfaceC13603
    public final InterfaceC20309 getValue() {
        return new C16870(this.f37472, this.f37473);
    }
}
