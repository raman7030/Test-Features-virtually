package p067l;

/* JADX INFO: renamed from: l.ۙܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VAZ3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6869 implements InterfaceC19790 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC19119 f17852;

    public AbstractC6869(InterfaceC19119 interfaceC19119) {
        this.f17852 = interfaceC19119;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ InterfaceC16436 mo15731(InterfaceC16436 interfaceC16436) {
        return C18448.m42008(this, interfaceC16436);
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ۧ */
    public /* bridge */ InterfaceC16436 mo11137(InterfaceC19119 interfaceC19119) {
        return C18448.m42009(this, interfaceC19119);
    }

    @Override // p067l.InterfaceC19790
    public final InterfaceC19119 getKey() {
        return this.f17852;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public InterfaceC19790 mo11134(InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        if (C13045.m29864(getKey(), interfaceC19119)) {
            return this;
        }
        return null;
    }

    @Override // p067l.InterfaceC16436
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15730(Object obj, InterfaceC21152 interfaceC21152) {
        return interfaceC21152.mo9100(obj, this);
    }
}
