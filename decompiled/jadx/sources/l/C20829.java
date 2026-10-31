package l;

/* JADX INFO: renamed from: l.᩷ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9F1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20829 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC22094 f67431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67432;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67433;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f67434;

    public C20829(EnumC22094 enumC22094, int i, int i2, int i3, boolean z) {
        this.f67431 = enumC22094;
        this.f67433 = z ? i : Math.max(i, 65536);
        this.f67432 = z ? i2 : Math.max(i2, 65536);
        this.f67434 = z ? i3 : Math.max(i3, 65536);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC22094 m47645() {
        return this.f67431;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47647() {
        return this.f67433;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47646() {
        return this.f67432;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47648() {
        return this.f67434;
    }

    public final String toString() {
        return "NegotiatedProtocol{dialect=" + this.f67431 + ", maxTransactSize=" + this.f67433 + ", maxReadSize=" + this.f67432 + ", maxWriteSize=" + this.f67434 + '}';
    }
}
