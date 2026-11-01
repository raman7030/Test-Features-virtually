package p067l;

/* JADX INFO: renamed from: l.᩷ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9F1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22164 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC23366 f70114;

    /* JADX INFO: renamed from: ۧ */
    public int f70115;

    /* JADX INFO: renamed from: ܽ */
    public int f70116;

    /* JADX INFO: renamed from: ᩳ */
    public int f70117;

    public C22164(EnumC23366 enumC23366, int i, int i2, int i3, boolean z) {
        this.f70114 = enumC23366;
        this.f70116 = z ? i : Math.max(i, 65536);
        this.f70115 = z ? i2 : Math.max(i2, 65536);
        this.f70117 = z ? i3 : Math.max(i3, 65536);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC23366 m49973() {
        return this.f70114;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m49975() {
        return this.f70116;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m49974() {
        return this.f70115;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m49976() {
        return this.f70117;
    }

    public final String toString() {
        return "NegotiatedProtocol{dialect=" + this.f70114 + ", maxTransactSize=" + this.f70116 + ", maxReadSize=" + this.f70115 + ", maxWriteSize=" + this.f70117 + '}';
    }
}
