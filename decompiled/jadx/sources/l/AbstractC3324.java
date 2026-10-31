package l;

/* JADX INFO: renamed from: l.ۗܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3324 implements InterfaceC17624 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC16876 f10408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC17624 f10409;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3324(InterfaceC17624 interfaceC17624, InterfaceC16233 interfaceC16233) {
        C11233.m27805(interfaceC17624, "baseKey");
        this.f10408 = (AbstractC16876) interfaceC16233;
        this.f10409 = interfaceC17624 instanceof AbstractC3324 ? ((AbstractC3324) interfaceC17624).f10409 : interfaceC17624;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10176(InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        return interfaceC17624 == this || this.f10409 == interfaceC17624;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܺ᩹᩵, l.ܽ᩶᩵] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18330 m10175(AbstractC2975 abstractC2975) {
        return (InterfaceC18330) this.f10408.invoke(abstractC2975);
    }
}
