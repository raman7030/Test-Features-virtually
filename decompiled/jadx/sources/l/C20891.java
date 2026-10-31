package l;

/* JADX INFO: renamed from: l.᩷۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20891 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f67591;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f67592;

    public C20891(String str, byte[] bArr) {
        this.f67592 = str;
        this.f67591 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m47722() {
        return this.f67591;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f67592);
        sb.append(": ");
        return C3200.m9831(this.f67591.length, "b", sb);
    }
}
