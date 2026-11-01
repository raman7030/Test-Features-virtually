package p067l;

/* JADX INFO: renamed from: l.ۗۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SAY4 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5196 extends AbstractC6869 implements InterfaceC9551 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C6537 f12220 = new C6537(InterfaceC9551.f26257, C21290.f66960);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8227(InterfaceC16436 interfaceC16436, Runnable runnable);

    /* JADX INFO: renamed from: ۖ */
    public boolean mo11136() {
        return !(this instanceof C6121);
    }

    @Override // p067l.AbstractC6869, p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19790 mo11134(InterfaceC19119 interfaceC19119) {
        return C24303.m53637(this, interfaceC19119);
    }

    @Override // p067l.AbstractC6869, p067l.InterfaceC16436
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16436 mo11137(InterfaceC19119 interfaceC19119) {
        return C24303.m53638(this, interfaceC19119);
    }

    public AbstractC5196() {
        super(InterfaceC9551.f26257);
    }

    @Override // p067l.InterfaceC9551
    /* JADX INFO: renamed from: ֫ */
    public final C12651 mo11133(AbstractC20461 abstractC20461) {
        return new C12651(this, abstractC20461);
    }

    @Override // p067l.InterfaceC9551
    /* JADX INFO: renamed from: ֫ */
    public final void mo11135(InterfaceC13575 interfaceC13575) {
        ((C12651) interfaceC13575).m29084();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C12846.m29416(this);
    }
}
