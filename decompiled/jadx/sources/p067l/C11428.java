package p067l;

/* JADX INFO: renamed from: l.ۢۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC3025(m5117c = "kotlinx.coroutines.flow.AbstractFlow", m5118f = "Flow.kt", m5119l = {230}, m5120m = "collect")
public final class C11428 extends AbstractC20461 {

    /* JADX INFO: renamed from: ۗ */
    public int f31870;

    /* JADX INFO: renamed from: ۙ */
    public C14779 f31871;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ AbstractC10757 f31872;

    /* JADX INFO: renamed from: ۬ */
    public /* synthetic */ Object f31873;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11428(AbstractC10757 abstractC10757, AbstractC20461 abstractC20461) {
        super(abstractC20461);
        this.f31872 = abstractC10757;
    }

    @Override // p067l.AbstractC5038
    /* JADX INFO: renamed from: ۧ */
    public final Object mo10745(Object obj) {
        this.f31873 = obj;
        this.f31870 |= Integer.MIN_VALUE;
        return this.f31872.mo13686((InterfaceC20816) null, this);
    }
}
