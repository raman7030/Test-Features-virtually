package p067l;

/* JADX INFO: renamed from: l.ۧ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12480 extends AbstractC17843 {

    /* JADX INFO: renamed from: ۙ */
    public float f34989;

    public C12480(float f, float f2) {
        this.f53240 = f;
        this.f34989 = f2;
        this.f53241 = true;
    }

    @Override // p067l.AbstractC17843
    /* JADX INFO: renamed from: ܽ */
    public final Float mo28738() {
        return Float.valueOf(this.f34989);
    }

    @Override // p067l.AbstractC17843
    /* JADX INFO: renamed from: ֫ */
    public final void mo28737(Object obj) {
        if (obj == null || obj.getClass() != Float.class) {
            return;
        }
        this.f34989 = ((Float) obj).floatValue();
        this.f53241 = true;
    }

    @Override // p067l.AbstractC17843
    public final Object clone() {
        C12480 c12480 = new C12480(this.f53240, this.f34989);
        c12480.m40521(m40520());
        return c12480;
    }

    @Override // p067l.AbstractC17843
    public final AbstractC17843 clone() {
        C12480 c12480 = new C12480(this.f53240, this.f34989);
        c12480.m40521(m40520());
        return c12480;
    }
}
