package p067l;

/* JADX INFO: renamed from: l.۫ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13951 implements InterfaceC4524 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC15114 f39348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4524 f39349b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC4997 f39350c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC7739 f39351d;

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    public C13951(InterfaceC15114 interfaceC15114, InterfaceC4524 interfaceC4524, InterfaceC4997 interfaceC4997, AbstractC7739 abstractC7739) {
        this.f39348a = interfaceC15114;
        this.f39349b = interfaceC4524;
        this.f39350c = interfaceC4997;
        this.f39351d = abstractC7739;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        InterfaceC15114 interfaceC15114 = this.f39348a;
        if (interfaceC15114 != null && interfaceC11901.isDateBased()) {
            return interfaceC15114.mo6951e(interfaceC11901);
        }
        return this.f39349b.mo6951e(interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        InterfaceC15114 interfaceC15114 = this.f39348a;
        if (interfaceC15114 != null && interfaceC11901.isDateBased()) {
            return interfaceC15114.mo6953n(interfaceC11901);
        }
        return this.f39349b.mo6953n(interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        InterfaceC15114 interfaceC15114 = this.f39348a;
        if (interfaceC15114 != null && interfaceC11901.isDateBased()) {
            return interfaceC15114.mo6949G(interfaceC11901);
        }
        return this.f39349b.mo6949G(interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20680b) {
            return this.f39350c;
        }
        if (c10500 == AbstractC7877.f20679a) {
            return this.f39351d;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return this.f39349b.mo6950T(c10500);
        }
        return c10500.m24242h(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        InterfaceC4997 interfaceC4997 = this.f39350c;
        if (interfaceC4997 != null) {
            str = " with chronology " + interfaceC4997;
        } else {
            str = "";
        }
        AbstractC7739 abstractC7739 = this.f39351d;
        if (abstractC7739 != null) {
            str2 = " with zone " + abstractC7739;
        }
        return this.f39349b + str + str2;
    }
}
