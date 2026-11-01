package p067l;

/* JADX INFO: renamed from: l.ۧۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12636 implements InterfaceC7132 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8769 f35469;

    /* JADX INFO: renamed from: ۧ */
    public abstract C4848 mo21895(C3108 c3108, EnumC20544 enumC20544, AbstractC6462 abstractC6462, boolean z);

    public AbstractC12636(C8769 c8769) {
        this.f35469 = c8769;
    }

    @Override // p067l.InterfaceC7132
    /* JADX INFO: renamed from: ֫ */
    public final void mo16409(C3108 c3108) {
        c3108.f5653.addFirst(new C24862(this.f35469, c3108));
    }

    @Override // p067l.InterfaceC7132
    /* JADX INFO: renamed from: ֫ */
    public final void mo16410(C3108 c3108, EnumC20544 enumC20544, AbstractC6462 abstractC6462, boolean z) {
        if (c3108.m5298()) {
            return;
        }
        c3108.f5653.addAll(mo21895(c3108, enumC20544, abstractC6462, z));
    }
}
