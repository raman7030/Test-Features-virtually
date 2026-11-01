package p067l;

/* JADX INFO: renamed from: l.۠ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 72T0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10270 extends AbstractC16181 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C16974 f28425;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC11180 f28426;

    public C10270(C16974 c16974, InterfaceC11180 interfaceC11180) {
        this.f28425 = c16974;
        this.f28426 = interfaceC11180;
    }

    @Override // p067l.InterfaceC11180
    public final String getName() {
        return this.f28426.getName();
    }

    @Override // p067l.InterfaceC11180
    public final InterfaceC12262 getValue() {
        return (InterfaceC12262) this.f28425.f50209.m41477().mo6575(this.f28426.getValue());
    }
}
