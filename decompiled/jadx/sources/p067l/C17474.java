package p067l;

/* JADX INFO: renamed from: l.ܺۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17474 {

    /* JADX INFO: renamed from: ֫ */
    public final int f52248;

    /* JADX INFO: renamed from: ۧ */
    public final int f52249;

    /* JADX INFO: renamed from: ܽ */
    public final int f52250;

    /* JADX INFO: renamed from: ܿ */
    public final long f52251;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f52252;

    public C17474(Object obj) {
        this(-1L, obj);
    }

    public C17474(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public C17474(int i, long j, Object obj) {
        this(obj, -1, -1, j, i);
    }

    public C17474(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public C17474(Object obj, int i, int i2, long j, int i3) {
        this.f52252 = obj;
        this.f52248 = i;
        this.f52249 = i2;
        this.f52251 = j;
        this.f52250 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17474 m39841(Object obj) {
        if (this.f52252.equals(obj)) {
            return this;
        }
        return new C17474(obj, this.f52248, this.f52249, this.f52251, this.f52250);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39842() {
        return this.f52248 != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17474)) {
            return false;
        }
        C17474 c17474 = (C17474) obj;
        return this.f52252.equals(c17474.f52252) && this.f52248 == c17474.f52248 && this.f52249 == c17474.f52249 && this.f52251 == c17474.f52251 && this.f52250 == c17474.f52250;
    }

    public final int hashCode() {
        return ((((((((this.f52252.hashCode() + 527) * 31) + this.f52248) * 31) + this.f52249) * 31) + ((int) this.f52251)) * 31) + this.f52250;
    }
}
