package l;

/* JADX INFO: renamed from: l.ۧ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes4.dex */
public final class C10640 extends AbstractC16283 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f32018;

    public C10640(float f, float f2) {
        this.f50073 = f;
        this.f32018 = f2;
        this.f50074 = true;
    }

    @Override // l.AbstractC16283
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Float mo26698() {
        return Float.valueOf(this.f32018);
    }

    @Override // l.AbstractC16283
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26697(Object obj) {
        if (obj == null || obj.getClass() != Float.class) {
            return;
        }
        this.f32018 = ((Float) obj).floatValue();
        this.f50074 = true;
    }

    @Override // l.AbstractC16283
    public final Object clone() {
        C10640 c10640 = new C10640(this.f50073, this.f32018);
        c10640.m38307(m38306());
        return c10640;
    }

    @Override // l.AbstractC16283
    public final AbstractC16283 clone() {
        C10640 c10640 = new C10640(this.f50073, this.f32018);
        c10640.m38307(m38306());
        return c10640;
    }
}
