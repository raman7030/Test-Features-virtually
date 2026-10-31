package l;

/* JADX INFO: renamed from: l.᩷᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D906 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21073 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2190[] f67977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67979 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67978 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f67980 = 0;

    public C21073(InterfaceC2190... interfaceC2190Arr) {
        this.f67977 = interfaceC2190Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2190[] m47972() {
        return this.f67977;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m47975() {
        return this.f67979;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47973() {
        return this.f67978;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m47977() {
        return this.f67980;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21073 m47974(int i) {
        this.f67979 = i;
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21073 m47971(int i) {
        this.f67978 = i;
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21073 m47976(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Lines must be >= 1");
        }
        this.f67980 = i;
        return this;
    }
}
