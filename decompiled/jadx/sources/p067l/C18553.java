package p067l;

/* JADX INFO: renamed from: l.ܿ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18553 extends AbstractC7154 {

    /* JADX INFO: renamed from: ֫ */
    public Boolean f55385;

    /* JADX INFO: renamed from: ۧ */
    public Boolean f55386;

    /* JADX INFO: renamed from: ܽ */
    public EnumC3130 f55387;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7154 m42237() {
        this.f55385 = Boolean.TRUE;
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC7154 m42238() {
        this.f55386 = Boolean.TRUE;
        return this;
    }

    @Override // p067l.AbstractC7154
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7154 mo16454(EnumC3130 enumC3130) {
        if (enumC3130 == null) {
            throw new NullPointerException("Null style");
        }
        this.f55387 = enumC3130;
        return this;
    }

    @Override // p067l.AbstractC7154
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9836 mo16455() {
        Boolean bool = this.f55385;
        if (bool == null || this.f55386 == null || this.f55387 == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f55385 == null) {
                sb.append(" formatJavadoc");
            }
            if (this.f55386 == null) {
                sb.append(" reorderModifiers");
            }
            if (this.f55387 == null) {
                sb.append(" style");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }
        return new C15870(bool.booleanValue(), this.f55386.booleanValue(), this.f55387);
    }
}
