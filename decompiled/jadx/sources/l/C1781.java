package l;

/* JADX INFO: renamed from: l.֫ۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1781 extends C1239 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f6157;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f6158;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781(C22406 c22406, AbstractC5698 abstractC5698, boolean z) {
        super(abstractC5698, c22406);
        this.f6157 = c22406;
        this.f6158 = z;
    }

    @Override // l.C1239, l.AbstractC5473
    /* JADX INFO: renamed from: ֫ */
    public final C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010) {
        String str;
        boolean z = this.f6158;
        AbstractC5698 abstractC5699 = this.f59170;
        if (z) {
            str = abstractC5699.mo15572() ? "bad.static.method.in.unbound.lookup" : "bad.instance.method.in.unbound.lookup";
        } else {
            str = "bad.static.method.in.bound.lookup";
        }
        String str2 = str;
        if (abstractC5699.f17559.m4393()) {
            return ((AbstractC5473) abstractC5699).mo4076(enumC12986, interfaceC3109, abstractC5698, abstractC4308, abstractC10370, c2609, c26010);
        }
        C22406 c22406 = this.f6157;
        return c22406.f72607.m16619(enumC12986, c22406.f72598.m7266(), interfaceC3109, str2, C21758.m49076(abstractC5699), abstractC5699);
    }
}
