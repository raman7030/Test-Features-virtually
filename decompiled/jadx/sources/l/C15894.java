package l;

/* JADX INFO: renamed from: l.ܺۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15894 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f49108;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f49109;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f49110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f49111;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f49112;

    public C15894(Object obj) {
        this(-1L, obj);
    }

    public C15894(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C15894(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public C15894(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C15894(Object obj, int i, int i2, long j, int i3) {
        this.f49112 = obj;
        this.f49108 = i;
        this.f49109 = i2;
        this.f49111 = j;
        this.f49110 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 m37668(Object obj) {
        if (this.f49112.equals(obj)) {
            return this;
        }
        return new C15894(obj, this.f49108, this.f49109, this.f49111, this.f49110);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37669() {
        return this.f49108 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15894)) {
            return false;
        }
        C15894 c15894 = (C15894) obj;
        return this.f49112.equals(c15894.f49112) && this.f49108 == c15894.f49108 && this.f49109 == c15894.f49109 && this.f49111 == c15894.f49111 && this.f49110 == c15894.f49110;
    }

    public final int hashCode() {
        return ((((((((this.f49112.hashCode() + 527) * 31) + this.f49108) * 31) + this.f49109) * 31) + ((int) this.f49111)) * 31) + this.f49110;
    }
}
