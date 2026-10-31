package l;

/* JADX INFO: renamed from: l.ۧܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB9T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11144 implements InterfaceC6225 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33459;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 f33460;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12512 f33461;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20274 f33462;

    public AbstractC11144(C12512 c12512, int i, C20274 c20274, C13985 c13985) {
        if (c12512 == null) {
            throw new NullPointerException("definingClass == null");
        }
        this.f33461 = c12512;
        this.f33459 = i;
        this.f33462 = c20274;
        this.f33460 = c13985;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.f33462.mo2463());
        sb.append('}');
        return sb.toString();
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ܳ */
    public final C12512 mo10267() {
        return this.f33461;
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ܽ */
    public final int mo10269() {
        return this.f33459;
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ۜ */
    public final C20274 mo10264() {
        return this.f33462;
    }

    @Override // l.InterfaceC6225
    public final C13217 getName() {
        return this.f33462.getName();
    }

    @Override // l.InterfaceC6225
    /* JADX INFO: renamed from: ᩻ */
    public final C13217 mo10273() {
        return this.f33462.m46532();
    }

    @Override // l.InterfaceC6225
    public final C13985 getAttributes() {
        return this.f33460;
    }
}
