package l;

/* JADX INFO: renamed from: l.ۧۛ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10804 implements InterfaceC5013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6735 f32493;

    /* JADX INFO: renamed from: ۧ */
    public abstract C2609 mo19922(C0779 c0779, EnumC19125 enumC19125, AbstractC4308 abstractC4308, boolean z);

    public AbstractC10804(C6735 c6735) {
        this.f32493 = c6735;
    }

    @Override // l.InterfaceC5013
    /* JADX INFO: renamed from: ֫ */
    public final void mo14505(C0779 c0779) {
        c0779.f2881.addFirst(new C23668(this.f32493, c0779));
    }

    @Override // l.InterfaceC5013
    /* JADX INFO: renamed from: ֫ */
    public final void mo14506(C0779 c0779, EnumC19125 enumC19125, AbstractC4308 abstractC4308, boolean z) {
        if (c0779.m2969()) {
            return;
        }
        c0779.f2881.addAll(mo19922(c0779, enumC19125, abstractC4308, z));
    }
}
