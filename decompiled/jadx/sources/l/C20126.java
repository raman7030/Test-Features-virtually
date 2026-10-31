package l;

/* JADX INFO: renamed from: l.᩶ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20126 extends AbstractC9980 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0384 f65161;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f65162;

    public final String toString() {
        return "MethodReferenceCheck";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20126(C22406 c22406, C0384 c0384) {
        super(c22406);
        this.f65162 = c22406;
        this.f65161 = c0384;
    }

    @Override // l.AbstractC9980
    /* JADX INFO: renamed from: ֫ */
    public final void mo14561(InterfaceC3109 interfaceC3109, boolean z, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C6755 c6755, C1386 c1386) {
        new C18173(this.f65162, abstractC4309, new C22242(this, !c6755.f20969.m39435(), c6755, c1386, z)).mo13581(interfaceC3109, abstractC4308);
    }

    @Override // l.AbstractC9980, l.InterfaceC8131
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8131 mo11112(C2609 c2609) {
        return new C6884(this.f65162, c2609);
    }
}
