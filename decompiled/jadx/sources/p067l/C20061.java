package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ᩴ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7NA */
/* JADX INFO: loaded from: classes4.dex */
public final class C20061 {

    /* JADX INFO: renamed from: ֫ */
    public C8661 f60943;

    /* JADX INFO: renamed from: ۧ */
    public final C8661 f60944;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayDeque f60945;

    public C20061() {
        C8661 c8661M20103 = C8661.m20103(C7320.f19161);
        this.f60944 = c8661M20103;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f60945 = arrayDeque;
        this.f60943 = c8661M20103;
        arrayDeque.addLast(c8661M20103);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45424(AbstractC10002 abstractC10002) {
        this.f60945.addLast(C8661.m20103(abstractC10002));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m45426() {
        ArrayDeque arrayDeque = this.f60945;
        ((C8661) arrayDeque.peekLast()).m20105((C8661) arrayDeque.removeLast());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45423(AbstractC5979 abstractC5979) {
        this.f60943.m20105(abstractC5979);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45425(C16036 c16036) {
        C8661 c8661 = (C8661) this.f60945.peekLast();
        this.f60943 = c8661;
        c8661.m20105(c16036);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5979 m45422() {
        return this.f60944;
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f60944, "base");
        c10888M40057.m25084(this.f60945, "stack");
        c10888M40057.m25084(this.f60943, "appendLevel");
        return c10888M40057.toString();
    }
}
