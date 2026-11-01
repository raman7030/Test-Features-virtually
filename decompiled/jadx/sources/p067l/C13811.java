package p067l;

/* JADX INFO: renamed from: l.ۨ᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AR1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13811 extends AbstractC11581 {

    /* JADX INFO: renamed from: ܽ */
    public String f39036;

    public C13811(AbstractC11581 abstractC11581, C14677 c14677) {
        super(abstractC11581);
        C23395.m52059(c14677, 20228);
        c14677.readInt();
        this.f39036 = c14677.m33593();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3914(C11996 c11996) {
        c11996.mo15113(20228);
        c11996.m27456();
        c11996.m27459(this.f39036);
        c11996.m27438();
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3915(C22310 c22310) {
        try {
            C9038.m20909(this.f32257, this.f39036);
        } catch (RuntimeException e) {
            throw new C5962(this.f32258, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31475(String str) {
        this.f39036 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m31476() {
        return this.f39036;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC11581 mo3910(AbstractC11581 abstractC11581) {
        C13811 c13811 = new C13811(abstractC11581);
        c13811.f32258 = this.f32258;
        c13811.f39036 = this.f39036;
        return c13811;
    }

    @Override // p067l.AbstractC11581
    /* JADX INFO: renamed from: ֫ */
    public final void mo3912(StringBuilder sb, int i) {
        sb.append(C11567.m26622(i, "\t"));
        sb.append("{\n");
        sb.append(C11567.m26622(i + 1, "\t"));
        sb.append("builtIn: ");
        sb.append(this.f39036);
        sb.append("\n");
        sb.append(C11567.m26622(i, "\t"));
        sb.append("}\n");
    }
}
