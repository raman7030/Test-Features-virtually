package p067l;

/* JADX INFO: renamed from: l.ᩴ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19854 {

    /* JADX INFO: renamed from: ܿ */
    public static final C19854 f60350 = new C19854(-1, -1, -1);

    /* JADX INFO: renamed from: ֫ */
    public final int f60351;

    /* JADX INFO: renamed from: ۧ */
    public final int f60352;

    /* JADX INFO: renamed from: ܽ */
    public final int f60353;

    /* JADX INFO: renamed from: ᩳ */
    public final int f60354;

    public C19854(int i, int i2, int i3) {
        this.f60354 = i;
        this.f60352 = i2;
        this.f60353 = i3;
        this.f60351 = C5792.m13010(i3) ? C5792.m13023(i3) * i2 : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f60354 + ", channelCount=" + this.f60352 + ", encoding=" + this.f60353 + ']';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19854)) {
            return false;
        }
        C19854 c19854 = (C19854) obj;
        return this.f60354 == c19854.f60354 && this.f60352 == c19854.f60352 && this.f60353 == c19854.f60353;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f60354), Integer.valueOf(this.f60352), Integer.valueOf(this.f60353));
    }
}
