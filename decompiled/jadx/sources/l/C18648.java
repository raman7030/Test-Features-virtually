package l;

/* JADX INFO: renamed from: l.ᩴۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes5.dex */
public class C18648 extends AbstractC19354 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23586 f58955;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0302 f58956;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18648(AbstractC0302 abstractC0302, InterfaceC23586 interfaceC23586, InterfaceC1008 interfaceC1008) {
        super(abstractC0302, interfaceC1008);
        this.f58956 = abstractC0302;
        this.f58955 = interfaceC23586;
    }

    @Override // l.AbstractC19354
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo11587() {
        return this.f58955.getLifecycle().mo19832().m33028(EnumC13728.STARTED);
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        InterfaceC23586 interfaceC23587 = this.f58955;
        EnumC13728 enumC13728Mo19832 = interfaceC23587.getLifecycle().mo19832();
        if (enumC13728Mo19832 == EnumC13728.DESTROYED) {
            this.f58956.m1670(this.f62649);
            return;
        }
        EnumC13728 enumC13728 = null;
        while (enumC13728 != enumC13728Mo19832) {
            m44575(mo11587());
            enumC13728 = enumC13728Mo19832;
            enumC13728Mo19832 = interfaceC23587.getLifecycle().mo19832();
        }
    }

    @Override // l.AbstractC19354
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo43239(InterfaceC23586 interfaceC23586) {
        return this.f58955 == interfaceC23586;
    }

    @Override // l.AbstractC19354
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo43238() {
        this.f58955.getLifecycle().mo19834(this);
    }
}
