package p067l;

/* JADX INFO: renamed from: l.᩺ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S912 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24037 extends AbstractC9480 {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo8182(C20408 c20408, InterfaceC15712 interfaceC15712, InterfaceC16855 interfaceC16855);

    @Override // p067l.AbstractC9480
    /* JADX INFO: renamed from: ֫ */
    public final void mo22082(InterfaceC5655 interfaceC5655, AbstractC4406 abstractC4406, InterfaceC16855 interfaceC16855) {
        if (interfaceC16855.mo38365()) {
            AbstractC9480.m22081(interfaceC5655, abstractC4406, interfaceC16855.mo38364());
        }
        Object objMo8182 = mo8182(interfaceC5655.mo12595(), interfaceC5655.mo12591(), interfaceC16855);
        if (objMo8182 != null) {
            C19304.m43993(interfaceC5655.builder(), objMo8182, interfaceC16855.start(), interfaceC16855.end());
        }
    }
}
