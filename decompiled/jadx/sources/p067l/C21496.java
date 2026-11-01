package p067l;

/* JADX INFO: renamed from: l.᩶ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21496 extends AbstractC11853 {

    /* JADX INFO: renamed from: ܽ */
    public C2733 f67800;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C23663 f67801;

    public final String toString() {
        return "MethodReferenceCheck";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21496(C23663 c23663, C2733 c2733) {
        super(c23663);
        this.f67801 = c23663;
        this.f67800 = c2733;
    }

    @Override // p067l.AbstractC11853
    /* JADX INFO: renamed from: ֫ */
    public final void mo16465(InterfaceC5323 interfaceC5323, boolean z, AbstractC6462 abstractC6462, AbstractC6462 abstractC6463, C8788 c8788, C3686 c3686) {
        new C19640(this.f67801, abstractC6463, new C23507(this, !c8788.f23844.m41671(), c8788, c3686, z)).mo15456(interfaceC5323, abstractC6462);
    }

    @Override // p067l.AbstractC11853, p067l.InterfaceC10096
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10096 mo13088(C4848 c4848) {
        return new C8911(this.f67801, c4848);
    }
}
