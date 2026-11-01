package p067l;

/* JADX INFO: renamed from: l.֡᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U7MS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3050 {

    /* JADX INFO: renamed from: ֫ */
    public final double f5474;

    /* JADX INFO: renamed from: ۧ */
    public final String f5475;

    /* JADX INFO: renamed from: ܽ */
    public final String f5476;

    /* JADX INFO: renamed from: ᩳ */
    public final int f5477;

    public C3050(String str, double d) {
        this.f5475 = str;
        this.f5477 = 2;
        this.f5474 = d;
        this.f5476 = null;
    }

    public C3050(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        C23877.m52960(z);
        this.f5475 = str;
        this.f5477 = i;
        this.f5476 = str2;
        this.f5474 = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3050)) {
            return false;
        }
        C3050 c3050 = (C3050) obj;
        return this.f5477 == c3050.f5477 && Double.compare(this.f5474, c3050.f5474) == 0 && C12826.equals(this.f5475, c3050.f5475) && C12826.equals(this.f5476, c3050.f5476);
    }

    public final int hashCode() {
        return C12826.hash(this.f5475, Integer.valueOf(this.f5477), Double.valueOf(this.f5474), this.f5476);
    }
}
