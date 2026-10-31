package l;

/* JADX INFO: renamed from: l.ᩴ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H4NZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18749 implements InterfaceC16724 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1109 f59251;

    public C18749(C1109 c1109) {
        this.f59251 = c1109;
    }

    @Override // l.InterfaceC16724
    public final Object apply(Object obj) {
        C15925 c15925 = (C15925) obj;
        if (this.f59251.f4043) {
            throw new IllegalStateException("This iterator was invalidated by a change to this MutableMethodImplementation.");
        }
        return c15925.m37702();
    }
}
