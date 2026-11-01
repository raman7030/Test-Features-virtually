package p067l;

/* JADX INFO: renamed from: l.ᩳ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19727 {

    /* JADX INFO: renamed from: ֫ */
    public int f60011;

    /* JADX INFO: renamed from: ۧ */
    public int f60012;

    /* JADX INFO: renamed from: ܽ */
    public int f60013;

    public C19727(C19136 c19136) {
        this(c19136.m43537(), c19136.m43529(), c19136.m43527());
    }

    public C19727(int i, int i2, int i3) {
        this.f60012 = i;
        this.f60013 = i2;
        this.f60011 = i3;
    }

    public final String toString() {
        return "State{permissions=" + Integer.toOctalString(this.f60012) + ", uid=" + this.f60013 + ", gid=" + this.f60011 + '}';
    }
}
