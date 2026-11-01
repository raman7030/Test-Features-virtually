package p067l;

/* JADX INFO: renamed from: l.ۧܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12960 implements InterfaceC8285 {

    /* JADX INFO: renamed from: ֫ */
    public final int f36459;

    /* JADX INFO: renamed from: ۧ */
    public final C15660 f36460;

    /* JADX INFO: renamed from: ܽ */
    public final C14260 f36461;

    /* JADX INFO: renamed from: ᩳ */
    public final C21637 f36462;

    public AbstractC12960(C14260 c14260, int i, C21637 c21637, C15660 c15660) {
        if (c14260 == null) {
            throw new NullPointerException("definingClass == null");
        }
        this.f36461 = c14260;
        this.f36459 = i;
        this.f36462 = c21637;
        this.f36460 = c15660;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f36462.mo4819());
        sb.append('}');
        return sb.toString();
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ܳ */
    public final C14260 mo12304() {
        return this.f36461;
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ܽ */
    public final int mo12306() {
        return this.f36459;
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ۜ */
    public final C21637 mo12301() {
        return this.f36462;
    }

    @Override // p067l.InterfaceC8285
    public final C14930 getName() {
        return this.f36462.getName();
    }

    @Override // p067l.InterfaceC8285
    /* JADX INFO: renamed from: ᩻ */
    public final C14930 mo12310() {
        return this.f36462.m48854();
    }

    @Override // p067l.InterfaceC8285
    public final C15660 getAttributes() {
        return this.f36460;
    }
}
