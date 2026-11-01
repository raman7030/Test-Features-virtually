package p067l;

/* JADX INFO: renamed from: l.ᩴ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20187 implements InterfaceC18263 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3422 f62474;

    public C20187(C3422 c3422) {
        this.f62474 = c3422;
    }

    @Override // p067l.InterfaceC18263
    public final Object apply(Object obj) {
        C17503 c17503 = (C17503) obj;
        if (this.f62474.f6814) {
            throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
        }
        return c17503.m39877();
    }
}
