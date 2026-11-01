package p067l;

/* JADX INFO: renamed from: l.۫᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5U */
/* JADX INFO: loaded from: classes4.dex */
public class C14404 extends C24462 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C13734 f41201;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14404(C13734 c13734) {
        super(c13734.f38821);
        this.f41201 = c13734;
        this.f77425 = c13734.firstEntry();
    }

    @Override // p067l.C24462
    /* JADX INFO: renamed from: ᩳ */
    public final void mo33023() {
        C10381 c10381M24070 = this.f77424.m24070();
        this.f77424 = c10381M24070;
        C13734 c13734 = this.f41201;
        if (c13734.f38827 || c10381M24070 == null || Integer.compare(c10381M24070.f19896, c13734.f38826) >= 0) {
            return;
        }
        this.f77424 = null;
    }

    @Override // p067l.C24462
    /* JADX INFO: renamed from: ܽ */
    public final void mo33022() {
        C10381 c10381M24074 = this.f77425.m24074();
        this.f77425 = c10381M24074;
        C13734 c13734 = this.f41201;
        if (c13734.f38824 || c10381M24074 == null || Integer.compare(c10381M24074.f19896, c13734.f38825) < 0) {
            return;
        }
        this.f77425 = null;
    }
}
