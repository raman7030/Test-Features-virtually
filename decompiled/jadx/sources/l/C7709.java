package l;

/* JADX INFO: renamed from: l.۟᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P5QW */
/* JADX INFO: loaded from: classes3.dex */
public final class C7709 extends AbstractRunnableC5967 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23815;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1734 f23816;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7709(C1734 c1734, C1734 c1735, int i) {
        super(c1735);
        this.f23816 = c1734;
        this.f23815 = i;
    }

    @Override // l.AbstractRunnableC5967
    /* JADX INFO: renamed from: ֫ */
    public final void mo16707() {
        C1734 c1734 = this.f23816;
        c1734.f5989.m52906(this.f23815, c1734.f5999);
        this.f18300.f5986.sendEmptyMessageAtTime(-1, 0L);
    }
}
