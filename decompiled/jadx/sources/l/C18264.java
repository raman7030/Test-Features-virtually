package l;

/* JADX INFO: renamed from: l.ᩳ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18264 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f56794;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56795;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56796;

    public C18264(C17642 c17642) {
        this(c17642.m41291(), c17642.m41283(), c17642.m41281());
    }

    public C18264(int i, int i2, int i3) {
        this.f56795 = i;
        this.f56796 = i2;
        this.f56794 = i3;
    }

    public final String toString() {
        return "State{permissions=" + Integer.toOctalString(this.f56795) + ", uid=" + this.f56796 + ", gid=" + this.f56794 + '}';
    }
}
