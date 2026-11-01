package p067l;

/* JADX INFO: renamed from: l.ۘᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DC */
/* JADX INFO: loaded from: classes3.dex */
public final class C6286 extends AbstractC22380 {

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C20368 f15891;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6286(C20368 c20368, AbstractC5050 abstractC5050, int i, int i2) {
        super(c20368);
        this.f15891 = c20368;
        int i3 = i + i2;
        if (i3 > abstractC5050.mo10777()) {
            throw new IllegalArgumentException(C20778.m46922(i3, "tried to queue past end of data, "));
        }
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "tried to queue before start of data, "));
        }
        this.f70606 = abstractC5050;
        new C10980(3);
        this.f32500 = i;
        this.f32503 = i2;
    }

    @Override // p067l.InterfaceC9817
    public final void run() {
        synchronized (this.f15891.f62966) {
            if (this.f15891.f62966.size() > 0) {
                ((C11651) this.f15891.f62966.getLast()).getClass();
            }
            this.f15891.f62966.add(this);
        }
    }
}
