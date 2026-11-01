package p067l;

/* JADX INFO: renamed from: l.ۧۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12572 extends C19532 implements InterfaceC13575, InterfaceC13243 {

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16436 f35325;

    @Override // p067l.InterfaceC13575
    /* JADX INFO: renamed from: ֫ */
    public final void mo10744(Object obj) {
        Throwable thM13520 = C6004.m13520(obj);
        if (thM13520 != null) {
            obj = new C19948(thM13520, false);
        }
        Object objM44380 = m44380(obj);
        if (objM44380 == C18861.f56339) {
            return;
        }
        mo5671(objM44380);
    }

    @Override // p067l.C19532
    /* JADX INFO: renamed from: ֫ */
    public final String mo28964() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public AbstractC12572(InterfaceC16436 interfaceC16436, boolean z) {
        super(z);
        m44378((InterfaceC12175) interfaceC16436.mo11134(C14186.f40444));
        this.f35325 = interfaceC16436.mo15731(this);
    }

    @Override // p067l.InterfaceC13575
    public final InterfaceC16436 getContext() {
        return this.f35325;
    }

    @Override // p067l.C19532
    /* JADX INFO: renamed from: ֫ */
    public final void mo28965(C7207 c7207) {
        C7878.m18198(c7207, this.f35325);
    }
}
