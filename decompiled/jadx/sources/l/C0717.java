package l;

/* JADX INFO: renamed from: l.֡᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0717 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double f2702;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f2703;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f2704;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f2705;

    public C0717(String str, double d) {
        this.f2703 = str;
        this.f2705 = 2;
        this.f2702 = d;
        this.f2704 = null;
    }

    public C0717(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        C22632.m50634(z);
        this.f2703 = str;
        this.f2705 = i;
        this.f2704 = str2;
        this.f2702 = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0717)) {
            return false;
        }
        C0717 c0717 = (C0717) obj;
        return this.f2705 == c0717.f2705 && Double.compare(this.f2702, c0717.f2702) == 0 && C11003.equals(this.f2703, c0717.f2703) && C11003.equals(this.f2704, c0717.f2704);
    }

    public final int hashCode() {
        return C11003.hash(this.f2703, Integer.valueOf(this.f2705), Double.valueOf(this.f2702), this.f2704);
    }
}
