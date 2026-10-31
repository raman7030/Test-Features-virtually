package l;

import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.֨۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAXR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0976 extends AbstractC8032 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7326 f3664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f3665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f3666;

    public C0976(C7326 c7326, AbstractC8032 abstractC8032, AbstractC8032 abstractC8033) {
        this.f3664 = c7326;
        this.f3666 = abstractC8032;
        this.f3665 = abstractC8033;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0976 m3441(C7326 c7326, AbstractC8032 abstractC8032, AbstractC8032 abstractC8033) {
        return new C0976(c7326, abstractC8032, abstractC8033);
    }

    @Override // l.AbstractC8032
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo3442() {
        return (((Boolean) this.f3664.f22515.orElse(Boolean.FALSE)).booleanValue() ? this.f3666 : this.f3665).mo3442();
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f3664, MessageHandler.Properties.Condition);
        c8964M37871.m23110(this.f3666, "thenIndent");
        c8964M37871.m23110(this.f3665, "elseIndent");
        return c8964M37871.toString();
    }
}
