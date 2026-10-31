package l;

/* JADX INFO: renamed from: l.ۚܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5473 extends AbstractC5698 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f17001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f17002;

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final boolean mo15572() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C16719 mo4076(EnumC12986 enumC12986, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370, C2609 c2609, C2609 c26010);

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean mo15574() {
        return this instanceof C11391;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5473(C22406 c22406, EnumC1296 enumC1296, String str) {
        super(enumC1296, 0L, null, null, null);
        this.f17002 = c22406;
        this.f17001 = str;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        throw new AssertionError();
    }

    @Override // l.AbstractC5698
    public String toString() {
        return this.f17001;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 mo15573(AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        C22406 c22406 = this.f17002;
        C6319 c6319 = c22406.f72597;
        AbstractC4308 abstractC4308 = c22406.f72605.f66462.f17560;
        c6319.getClass();
        return C6319.m17457(abstractC10370, abstractC19810, abstractC4308).f13890;
    }
}
