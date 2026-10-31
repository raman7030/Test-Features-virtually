package l;

/* JADX INFO: renamed from: l.ᩴ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28SI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18399 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C18399 f57130 = new C18399(-1, -1, -1);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f57131;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f57132;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f57133;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f57134;

    public C18399(int i, int i2, int i3) {
        this.f57134 = i;
        this.f57132 = i2;
        this.f57133 = i3;
        this.f57131 = C3603.m11034(i3) ? C3603.m11047(i3) * i2 : -1;
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f57134 + ", channelCount=" + this.f57132 + ", encoding=" + this.f57133 + ']';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18399)) {
            return false;
        }
        C18399 c18399 = (C18399) obj;
        return this.f57134 == c18399.f57134 && this.f57132 == c18399.f57132 && this.f57133 == c18399.f57133;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f57134), Integer.valueOf(this.f57132), Integer.valueOf(this.f57133));
    }
}
