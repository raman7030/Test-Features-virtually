package l;

/* JADX INFO: renamed from: l.۠ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8314 extends AbstractC14534 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15368 f25514;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC9272 f25515;

    public C8314(C15368 c15368, InterfaceC9272 interfaceC9272) {
        this.f25514 = c15368;
        this.f25515 = interfaceC9272;
    }

    @Override // l.InterfaceC9272
    public final String getName() {
        return this.f25515.getName();
    }

    @Override // l.InterfaceC9272
    public final InterfaceC10410 getValue() {
        return (InterfaceC10410) this.f25514.f47082.m39241().mo4329(this.f25515.getValue());
    }
}
