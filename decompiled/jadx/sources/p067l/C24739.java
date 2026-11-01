package p067l;

/* JADX INFO: renamed from: l.᩻ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0JF */
/* JADX INFO: loaded from: classes.dex */
public class C24739 extends C10658 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C11329 f78335;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24739(C11329 c11329) {
        super(c11329.f31551);
        this.f78335 = c11329;
        this.f29479 = c11329.firstEntry();
    }

    @Override // p067l.C10658
    /* JADX INFO: renamed from: ᩳ */
    public final void mo24512() {
        C15823 c15823M35903 = this.f29478.m35903();
        this.f29478 = c15823M35903;
        C11329 c11329 = this.f78335;
        if (c11329.f31557 || c15823M35903 == null || Integer.compare(c15823M35903.f19896, c11329.f31556) >= 0) {
            return;
        }
        this.f29478 = null;
    }

    @Override // p067l.C10658
    /* JADX INFO: renamed from: ܽ */
    public final void mo24511() {
        C15823 c15823M35908 = this.f29479.m35908();
        this.f29479 = c15823M35908;
        C11329 c11329 = this.f78335;
        if (c11329.f31554 || c15823M35908 == null || Integer.compare(c15823M35908.f19896, c11329.f31555) < 0) {
            return;
        }
        this.f29479 = null;
    }
}
