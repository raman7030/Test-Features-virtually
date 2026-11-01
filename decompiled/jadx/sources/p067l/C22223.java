package p067l;

/* JADX INFO: renamed from: l.᩷۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22223 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f70277;

    /* JADX INFO: renamed from: ۧ */
    public final String f70278;

    public C22223(String str, byte[] bArr) {
        this.f70278 = str;
        this.f70277 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m50052() {
        return this.f70277;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70278);
        sb.append(": ");
        return C5410.m11876(this.f70277.length, "b", sb);
    }
}
