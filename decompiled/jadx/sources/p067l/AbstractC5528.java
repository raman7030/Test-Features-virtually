package p067l;

/* JADX INFO: renamed from: l.ۗܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5528 implements InterfaceC19119 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC18408 f13218;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC19119 f13219;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC5528(InterfaceC19119 interfaceC19119, InterfaceC17797 interfaceC17797) {
        C13045.m29867(interfaceC19119, "baseKey");
        this.f13218 = (AbstractC18408) interfaceC17797;
        this.f13219 = interfaceC19119 instanceof AbstractC5528 ? ((AbstractC5528) interfaceC19119).f13219 : interfaceC19119;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12212(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        return interfaceC19119 == this || this.f13219 == interfaceC19119;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܺ᩹᩵, l.ܽ᩶᩵] */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19790 m12211(AbstractC5196 abstractC5196) {
        return (InterfaceC19790) this.f13218.invoke(abstractC5196);
    }
}
