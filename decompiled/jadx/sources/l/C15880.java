package l;

/* JADX INFO: renamed from: l.ܺۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC0690(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
public final class C15880 extends AbstractC19036 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f49061;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49062;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2476 f49063;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15880(C2476 c2476, AbstractC19036 abstractC19036) {
        super(abstractC19036);
        this.f49063 = c2476;
    }

    @Override // l.AbstractC2808
    /* JADX INFO: renamed from: ۧ */
    public final Object mo8684(Object obj) {
        this.f49061 = obj;
        this.f49062 |= Integer.MIN_VALUE;
        return this.f49063.mo7954(null, this);
    }
}
