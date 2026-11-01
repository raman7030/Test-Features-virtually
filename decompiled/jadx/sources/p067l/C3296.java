package p067l;

import net.engio.mbassy.listener.MessageHandler;

/* JADX INFO: renamed from: l.֨۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAXR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3296 extends AbstractC10002 {

    /* JADX INFO: renamed from: ֫ */
    public final C9331 f6439;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10002 f6440;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC10002 f6441;

    public C3296(C9331 c9331, AbstractC10002 abstractC10002, AbstractC10002 abstractC10003) {
        this.f6439 = c9331;
        this.f6441 = abstractC10002;
        this.f6440 = abstractC10003;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3296 m5744(C9331 c9331, AbstractC10002 abstractC10002, AbstractC10002 abstractC10003) {
        return new C3296(c9331, abstractC10002, abstractC10003);
    }

    @Override // p067l.AbstractC10002
    /* JADX INFO: renamed from: ֫ */
    public final int mo5745() {
        return (((Boolean) this.f6439.f25406.orElse(Boolean.FALSE)).booleanValue() ? this.f6441 : this.f6440).mo5745();
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f6439, MessageHandler.Properties.Condition);
        c10888M40057.m25084(this.f6441, "thenIndent");
        c10888M40057.m25084(this.f6440, "elseIndent");
        return c10888M40057.toString();
    }
}
